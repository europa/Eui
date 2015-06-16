package com.europa.eui.activity;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnItemClick;

import com.europa.eui.R;
import com.europa.eui.R.id;
import com.europa.eui.R.layout;
import com.europa.eui.R.menu;
import com.europa.eui.adapter.ItemAdapter;
import com.europa.eui.bean.Item;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;

/**
 * @author europa
 *
 */
public class MainActivity extends Activity {

	@InjectView(R.id.mainLv) ListView mainLv;
	ItemAdapter itemAdapter;
	List<Item> items=new ArrayList<Item>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.inject(this);
		itemAdapter=new ItemAdapter(this);
		mainLv.setAdapter(itemAdapter);
		getData();
		itemAdapter.setData(items);
		itemAdapter.notifyDataSetChanged();
//		mainLv.setOnItemClickListener(new OnItemClickListener() {
//
//			@Override
//			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
//					long arg3) {
//				switch (arg2) {
//				case 0:
//					Intent intent=new Intent();
//					intent.setClass(MainActivity.this,CheckActivity.class);
//					startActivity(intent);
//					break;
//
//				default:
//					break;
//				}
//			}
//		});
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
	
	private void getData(){
		Item item=new Item();
		item.setItemName("Dialog");
		item.setItemRemark("To set Dialog in the manifest file");
		items.add(item);
	}
	
	@OnItemClick(R.id.mainLv)
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3){
		switch (arg2) {
		case 0:
			Intent intent=new Intent();
			intent.setClass(MainActivity.this,CheckActivity.class);
			startActivity(intent);
			break;

		default:
			break;
		}
	}
}
