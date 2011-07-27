package com.umfundi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.umfundi.R;
import com.umfundi.WindowedSeekBar.SeekBarChangeListener;

public class WindowedSeekBarActivity extends Activity implements SeekBarChangeListener{

	TextView tv1,tv2;
	WindowedSeekBar wsb;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        wsb = (WindowedSeekBar) findViewById(R.id.windowedseekbar);
        wsb.setSeekBarChangeListener(this);
     }
    
	public void SeekBarValueChanged(int Thumb1Value, int thumblX, int Thumb2Value, int thumbrX, int width, int thumbY) {
		tv1.setText("Thumb 1 Value :" + Thumb1Value + " % " + thumbY);
		tv2.setText("Thumb 2 Value :"+ Thumb2Value + " %") ;
	}

}