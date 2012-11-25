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


public class Demo
{
	String apple;
	float banana = 2.0f;
	int cherry;
	Date dewberry;
	boolean eggplant = true;
	Demo fig;
	ArrayList<Demo> grape = new ArrayList<Demo>();
	HashMap<String,Demo> honeydew = new HashMap<String,Demo>();
	Season season = Season.spring;
	
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
	public Demo getFig() {
		return fig;
	}
	public void setFig(Demo fig) {
		this.fig = fig;
	}
	public List<Demo> getGrape()
	{
		return grape;
	}
	public Map<String,Demo> getHoneydew()
	{
		return honeydew;
	}
	
	public void setSeason( Season season )
	{
		this.season = season;
	}
	
	public Season getSeason() { return season; }
}
