package com.example.prueba;

import android.app.Activity;
import android.content.Intent;
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

public class DataActivity extends Activity {
	
	private ListView listViewData;
	//Array de datos
	private  DataSheet[] dataArray = new DataSheet[]
		{
			new DataSheet("Motor Internal", "Elvis","path"),
	    	new DataSheet("Control system", "Sergio", ""),
	    	new DataSheet("Pression Controler", "Rolando", ""),
	    	new DataSheet("Solar Power Interface",  "Imes" , ""),
	    	new DataSheet("Navigation interface", "Mauricio" , "")};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.data_activity);
	    
	 // set adapter
	 		AdapterData adaptador = new AdapterData(this);
	 		listViewData = (ListView)findViewById(R.id.listViewData);
	             
	 		listViewData.setAdapter(adaptador);	


	 		listViewData.setOnItemClickListener(new OnItemClickListener() {
	            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
	            	
	            	//obtener datos 
	            	String name = ((DataSheet)a.getAdapter().getItem(position)).getName();
	            	
					//intent to diagram 
					Intent intent = new Intent(DataActivity.this, DiagramActivity.class);
					intent.putExtra("name",name);
					startActivity(intent);
	            }
	        });	 		
	}
	class AdapterData extends ArrayAdapter<DataSheet> {
		
		Activity context;
		
		AdapterData(Activity context) {
			super(context, R.layout.list_item_data, dataArray);
			this.context = context;
	 }
		public View getView(int position, View convertView, ViewGroup parent) {
			
			LayoutInflater inflater = context.getLayoutInflater();
			View item = inflater.inflate(R.layout.list_item_data, null);
			
			TextView lblname = (TextView)item.findViewById(R.id.LblNameData);
			lblname.setText(dataArray[position].getName());
			
			TextView lblAutor = (TextView)item.findViewById(R.id.LblAutorData);
			lblAutor.setText("Created by: "+ dataArray[position].getAutor());
			
			return(item);
		 }
	   }	
}
