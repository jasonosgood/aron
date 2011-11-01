package cronk;

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

public class Cronk
{
	
	String apple;
	float banana;
	int cherry;
	Date dewberry;
	boolean eggplant;
	Cronk fig;
	ArrayList<Cronk> grape = new ArrayList<Cronk>();
	HashMap<String,Cronk> honeydew = new HashMap<String,Cronk>();
	
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
	public Cronk getFig() {
		return fig;
	}
	public void setFig(Cronk fig) {
		this.fig = fig;
	}
	public List<Cronk> getGrape()
	{
		return grape;
	}
	public Map<String,Cronk> getHoneydew()
	{
		return honeydew;
	}
}
