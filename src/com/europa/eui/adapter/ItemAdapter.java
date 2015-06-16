package com.europa.eui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.europa.eui.R;
import com.europa.eui.Tool.ToolAdapter;
import com.europa.eui.bean.Item;

public class ItemAdapter extends ToolAdapter<Item> {

	public ItemAdapter(Context context) {
		super(context);
	}

	@Override
	public int getItemRes() {
		return R.layout.item_main;
	}

	@Override
	public View getItemView(int position, View convertView,
			com.europa.eui.Tool.ToolAdapter.ViewHolder holder) {
		TextView nameText=(TextView) holder.getView(R.id.nameText);
		TextView remarkText=(TextView) holder.getView(R.id.remarkText);
		nameText.setText(getItem(position).getItemName());
		remarkText.setText(getItem(position).getItemRemark());
		return convertView;
	}

}
