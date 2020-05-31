package com.ammar.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {

		BookShop bs=new BookShop();
		bs.setShopName("BookShop");
		bs.loadData();
		System.out.println(bs);

		BookShop bs1=bs.clone();
	}

}
