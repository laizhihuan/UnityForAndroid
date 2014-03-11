package com.example.unitytestandroid;

import com.unity3d.player.UnityPlayer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestActivity0 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView text = (TextView)this.findViewById(R.id.textView1);
        text.setText(this.getIntent().getStringExtra("name"));

        final EditText edit = (EditText)this.findViewById(R.id.edit);

        Button close = (Button)this.findViewById(R.id.button0);
        close.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				//注释1
				UnityPlayer.UnitySendMessage("Main Camera","messgae",edit.getText().toString());
				TestActivity0.this.finish();
			}
		});
    }

}