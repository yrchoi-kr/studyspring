package com.home.vo;

public class MiddleMenuVO {
	private int menu_no;
	private String menu_name;
	private int menu_order;
	private int tbl_top_menu_menu_no;
	
	@Override
	public String toString() {
		return "MiddleMenuVO [menu_no=" + menu_no + ", menu_name=" + menu_name + ", menu_order=" + menu_order
				+ ", tbl_top_menu_menu_no=" + tbl_top_menu_menu_no + "]";
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
	public int getTbl_top_menu_menu_no() {
		return tbl_top_menu_menu_no;
	}
	public void setTbl_top_menu_menu_no(int tbl_top_menu_menu_no) {
		this.tbl_top_menu_menu_no = tbl_top_menu_menu_no;
	}
	
	
	
	
}