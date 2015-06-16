package com.europa.eui.activity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.europa.eui.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.format.DateFormat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AutoActivity extends Activity {
	TextView minuteText, secondText;
	Button startBtn;
	CountDownTimer countDownTimer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_autotime);

		minuteText = (TextView) findViewById(R.id.minuteText);
		secondText = (TextView) findViewById(R.id.secondText);
		startBtn = (Button) findViewById(R.id.startBtn);
	}

	@Override
	protected void onResume() {
		super.onResume();
		countDownTimer = new CountDownTimer(getCountDown("2015.04.01 15:37:41",30), 1000) {
			@Override
			public void onTick(long arg0) {
				long second = (arg0 / 1000) % 60;
				long minute = (arg0 / 1000) / 60;
				if (minute < 10) {
					minuteText.setText("0" + minute+":");
				} else {
					minuteText.setText(minute + ":");
				}
				if (second < 10) {
					secondText.setText("0" + second);
				} else {
					secondText.setText(second + "");
				}
			}

			@Override
			public void onFinish() {
				minuteText.setText("ÒÑ¹ýÆÚ");
			}
		};
		countDownTimer.start();
	}
	
	private long getCountDown(String beginTime,int totalMinute){
		long time=0;
		SimpleDateFormat da = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		try {
			Date currentDate = da.parse(beginTime);
			time = System.currentTimeMillis() - currentDate.getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalMinute*60*1000-time;
	}
}
