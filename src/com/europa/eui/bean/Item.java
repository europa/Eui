package com.europa.eui.bean;

/**
 * 
 * @author europa2046
 * itemÏîµÄÃû³Æ£¬¼ò½é
 */
public class Item {
	String itemName;
	String itemRemark;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemRemark() {
		return itemRemark;
	}
	public void setItemRemark(String itemRemark) {
		this.itemRemark = itemRemark;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemRemark=" + itemRemark
				+ ", getItemName()=" + getItemName() + ", getItemRemark()="
				+ getItemRemark() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
