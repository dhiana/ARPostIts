package com.dhiana.arpostits;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.app.Activity;
import android.content.Intent;

import com.dhiana.arpostits.vuforia.FrameMarkers;
import com.dhiana.arpostits.R;
import com.dhiana.arpostits.R.id;
import com.dhiana.arpostits.R.layout;



public class ProjectSelector extends Activity {

	public final static String EXTRA_MESSAGE = "com.qualcomm.vuforia.MESSAGE";
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = LayoutInflater.from(this);
        RelativeLayout layout = (RelativeLayout) inflater.inflate(
    		R.layout.fragment_project_selector, null, false);
    
        addContentView(layout, new LayoutParams(LayoutParams.MATCH_PARENT,
        	LayoutParams.MATCH_PARENT));
    }
	
	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
	    Intent intent = new Intent(this, FrameMarkers.class);
	    EditText editText = (EditText) findViewById(R.id.editText1);
	    String message = editText.getText().toString();
	    intent.putExtra(EXTRA_MESSAGE, message);
	    startActivity(intent);
	}

}
