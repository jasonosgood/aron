package arondemo;

/**
	ARON - A Righteous Object Notation
	
	Copyright (c) 2002, 2011 Jason Aaron Osgood, All rights reserved.
	
	Appropriate open source license will go here.
	
	Created: 06/08/2002 Jason Osgood <mrosgood@yahoo.com>
	Updated: 10/01/2011 Jason Osgood <jason@jasonosgood.com> 
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Fruit
{
	String apple;
	float banana = 2.0f;
	int cherry;
	Date dewberry;
	boolean eggplant = true;
	Fruit fig;
	ArrayList<Fruit> grape = new ArrayList<Fruit>();
	HashMap<String,Fruit> honeydew = new HashMap<String,Fruit>();
	Fruit iyokan;
	Season jasmine = Season.spring;
	ArrayList<Integer> kale = new ArrayList<Integer>();
	
	
	public String getApple() {
		return apple;
	}
	public void setApple(String apple) {
		this.apple = apple;
	}
	public float getBanana() {
		return banana;
	}
	public void setBanana(float banana) {
		this.banana = banana;
	}
	public int getCherry() {
		return cherry;
	}
	public void setCherry(int cherry) {
		this.cherry = cherry;
	}
	public Date getDewberry() {
		return dewberry;
	}
	public void setDewberry(Date dewberry) {
		this.dewberry = dewberry;
	}
	public boolean isEggplant() {
		return eggplant;
	}
	
	public void setEggplant(boolean eggplant) {
		this.eggplant = eggplant;
	}
	
	public Fruit getFig() {
		return fig;
	}
	
	public void setFig(Fruit fig) {
		this.fig = fig;
	}
	
	public List<Fruit> getGrape()
	{
		return grape;
	}
	
	public Map<String,Fruit> getHoneydew()
	{
		return honeydew;
	}
	
	public void setIyokan( Fruit iyokan )
	{
		this.iyokan = iyokan;
	}
	
	public void setJasmine( Season jasmine )
	{
		this.jasmine = jasmine;
	}
	
	public Season getJasmine() { return jasmine; }
	
	public List<Integer> getKale()
	{
		return kale;
	}
}
