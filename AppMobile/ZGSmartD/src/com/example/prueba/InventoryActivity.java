package com.example.prueba;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class InventoryActivity extends Activity {
	

	// variables for adapter
	private ListView ListOptions;
	
	//Array de datos
	private Component[] dataArray = new Component[]
		{
			new Component("Bearing", 15),
	    	new Component("Nuts", 25),
	    	new Component("Component AW90", 15),
	    	new Component("Screw driver point", 26),
	    	new Component("Resistor 657", 48)};	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inventory_activity);

		// set adapter
		AdapterComponent adaptador = new AdapterComponent(this);
        ListOptions = (ListView)findViewById(R.id.listViewComponent);
            
        ListOptions.setAdapter(adaptador);

        // action click  in the listview       
        ListOptions.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position,
                    long id) {
            	String Selected = ((Component)parent.getAdapter().getItem(position)).getName();
            	// alert dialog
            	AlertDialog.Builder builderDialog = new AlertDialog.Builder(InventoryActivity.this);
                builderDialog.setMessage("Are you sure ?");
                builderDialog.setCancelable(false);
                builderDialog.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    	// feedback to user
                    	Toast.makeText(getApplicationContext(), "The request was canceled", Toast.LENGTH_SHORT).show();                        
                    }
                });                
                builderDialog.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    	// feedback to user
                    	Toast.makeText(getApplicationContext(), "Item is comming, just wait !!!!", Toast.LENGTH_SHORT).show();                        
                    }
                });
                AlertDialog alertDialog1 = builderDialog.create();
                alertDialog1.show();         	
            }
        });        
	}

class AdapterComponent extends ArrayAdapter<Component> {
	
	Activity context;
	
	AdapterComponent(Activity context) {
		super(context, R.layout.list_item_components, dataArray);
		this.context = context;
 }
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = context.getLayoutInflater();
		View item = inflater.inflate(R.layout.list_item_components, null);
		
		TextView lblname = (TextView)item.findViewById(R.id.LblName);
		lblname.setText(dataArray[position].getName());
		
		TextView lblAmount = (TextView)item.findViewById(R.id.LblAmount);
		String value = String.valueOf(dataArray[position].getAmount());
		lblAmount.setText("Amount : " + value);
		
		return(item);
	 }
   }
}
