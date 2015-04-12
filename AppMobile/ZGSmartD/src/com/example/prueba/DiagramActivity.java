package com.example.prueba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DiagramActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diagram_activity);
		
		Intent i= getIntent();
	    
		TextView lblname = (TextView)findViewById(R.id.textView1);
		lblname.setText(i.getStringExtra("name"));	    
	}	
}
