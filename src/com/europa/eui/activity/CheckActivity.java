package com.europa.eui.activity;

import butterknife.ButterKnife;
import butterknife.InjectView;

import com.europa.eui.R;
import com.europa.eui.R.id;
import com.europa.eui.R.layout;
import com.europa.eui.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/**
 * @author europa
 *
 */
public class CheckActivity extends Activity {

	@InjectView(R.id.demoChk) CheckBox demoChk;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check);
		ButterKnife.inject(this);
		demoChk.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(isChecked){
					startActivity(new Intent(CheckActivity.this,ClearEditActivity.class));
					startActivity(new Intent(CheckActivity.this,AutoActivity.class));
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}
}
