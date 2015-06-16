package com.europa.eui.Tool;

import java.util.ArrayList;
import java.util.List;

import android.R;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class ToolAdapter<T> extends BaseAdapter {
	public List<T> list = new ArrayList<T>();
	private Context context;

	public ToolAdapter(Context context) {
		this.context = context;
	}

	public void setData(List<T> list) {
		this.list = list;
	}

	public T getItem(int position) {
		return list.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	/**
	 * 
	 * @return 返回item的布局id
	 */
	public abstract int getItemRes();

	/**
	 * 
	 * @param position
	 * @param convertView
	 * @param holder
	 * @return
	 */
	public abstract View getItemView(int position, View convertView,
			ViewHolder holder);

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ViewHolder viewHolder;
		if (arg1 == null) {
			arg1 = View.inflate(context, getItemRes(), null);
			viewHolder = new ViewHolder(arg1);
			arg1.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) arg1.getTag();
		}
		return getItemView(arg0, arg1, viewHolder);
	}

	public class ViewHolder {
		private SparseArray<View> viewArray = new SparseArray<View>();
		private View convertedView;

		public ViewHolder(View convertedView) {
			this.convertedView = convertedView;
		}

		public <T extends View> T getView(int resId) {
			View v = viewArray.get(resId);
			if (v == null) {
				v = convertedView.findViewById(resId);
				viewArray.put(resId, v);
			}
			return (T) v;
		}
	}
}
