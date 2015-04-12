package com.example.prueba;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // action inventory
        ImageButton btnBoton1;
        btnBoton1 = (ImageButton)findViewById(R.id.imageButton1);
        
        btnBoton1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0)
			{
				goToInventory();
			}
		});
        TextView textView1;
        textView1 = (TextView)findViewById(R.id.textView1);
        
        textView1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0)
			{
				goToInventory();
			}
		});        
        // button mapping
        ImageButton btnBoton2;
        btnBoton1 = (ImageButton)findViewById(R.id.imageButton2);
        
        btnBoton1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0)
			{
				goToMap();
			}
		});
        TextView textView2;
        textView2 = (TextView)findViewById(R.id.textView2);
        
        textView2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0)
			{
				goToMap();				
			}
		});        
        
        // action data sheet
        ImageButton btnBoton3;
        btnBoton1 = (ImageButton)findViewById(R.id.imageButton3);
        
        btnBoton1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0)
			{
				goToData();				
			}
		});  
        TextView textView3;
        textView3 = (TextView)findViewById(R.id.textView3);
        
        textView3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0)
			{
				goToData();				
			}
		});        
    }
    
    
    public void goToInventory(){
		//intent a Inventory 
		Intent intent = new Intent(MainActivity.this, InventoryActivity.class);
		startActivity(intent);     	
    }
    public void goToData(){
		//intent a data
		Intent intent = new Intent(MainActivity.this, DataActivity.class);
		startActivity(intent); 
	   
    }
    public void goToMap(){
		//intent a data
 		Intent intent = new Intent(MainActivity.this, MapActivity.class);
 		startActivity(intent);  
	   
    }    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }    

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_info) {
        	// feedback to user
        	AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
            builder1.setMessage("Space Apps Challenge \n" +
            		"Challenge: Zero Gee Bee - Your Friendly Neighborhood Drone \n"+ "\n" +
            		"Solution:  ZG SmartD is present as an acronym of <<Zero Gravity Smart Drone>> a drone that is able to work on microgravity conditions\n" +  "\n" +
            		" With the required features to help a space engineer on their task.The control of the ZG SmartD is carried out with an App that is situated on a weareable (SmartPhone), where the interface is access by functionalities menu of the device, it responds to engineer’s instructions and execute the order."
            		);
            builder1.setCancelable(true);
            builder1.setPositiveButton("Acept",
                    new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });

            AlertDialog alert11 = builder1.create();
            alert11.show();        	
            return true;
        }
        if (id == R.id.action_about) {
        	// feedback to user
        	// feedback to user
        	AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
            builder1.setMessage("Team ZGSmartD \n" + "\n"+
            		"David Chaverri \n"+ "\n" +
            		"Elvis Aguilar\n" +  "\n" +
            		"Mauricio Madriz\n" +  "\n" +
            		"Sergio Gonzalez\n" +  "\n" +
            		"Rolando Esquivel\n" +  "\n" +
            		"Imes Anchía\n" +  "\n"
            		);
            builder1.setCancelable(true);
            builder1.setPositiveButton("Acept",
                    new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });

            AlertDialog alert11 = builder1.create();
            alert11.show();        	
            return true;        	
        }        
        return super.onOptionsItemSelected(item);
    }
    
}
