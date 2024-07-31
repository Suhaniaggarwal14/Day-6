package com.graymatter;

import java.awt.event.ItemListener;
import java.util.ArrayList;

public class DemoOnItem {

	public static void main(String[] args) {
		ArrayList<Item> item=new ArrayList<Item>();
		Item i1=new Item("laptop",1,20000,"hp");
		Item i2=new Item("battery",2,30099,"everday");
		Item i3=new Item("laptop",3,40000,"dell");
		
		item.add(i1);
		item.add(i2);
		item.add(i3);
		
		item.sort(new NameComparator().thenComparing(new BrandComparator()));
		for(Item itm:item)
			System.out.println(itm);
		
		
	}

}
