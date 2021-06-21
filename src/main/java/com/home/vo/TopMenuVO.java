package com.home.vo;

public class TopMenuVO {
	private int menu_no;
	private String menu_name;
	private int menu_order;
	
	@Override
	public String toString() {
		return "TopMenuVO [menu_no=" + menu_no + ", menu_name=" + menu_name + ", menu_order=" + menu_order + "]";
	}
	
	public int getMenu_no() {
		return menu_no;
	}
	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public int getMenu_order() {
		return menu_order;
	}
	public void setMenu_order(int menu_order) {
		this.menu_order = menu_order;
	}
}