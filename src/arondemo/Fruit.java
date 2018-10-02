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
import java.util.Objects;

public class Fruit
{
	String apple;
	float banana = 2.0f;
	int cherry;
	Date dewberry;
	boolean eggplant = true;
	Fruit fig;
	List<Fruit> grape = new ArrayList<>();
	Map<String,Fruit> honeydew = new HashMap<>();
	Fruit iyokan;
	Season jasmine = Season.spring;
	List<Integer> kale = new ArrayList<>();
	List<Float> lime = new ArrayList<>();
	List<Boolean> mango = new ArrayList<>();
	List<Date> nectarine = new ArrayList<>();
	List<String> orange = new ArrayList<>();
	List<Map> plum = new ArrayList<>();

	public Fruit()
	{
		kale.add( 100 );
	}
	
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

	public void setGrape( List<Fruit> grape) {
		this.grape = grape;
	}
	public List<Fruit> getGrape()
	{
		return grape;
	}
	
	public Map<String,Fruit> getHoneydew()
	{
		return honeydew;
	}

	public void setHoneydew( Map<String,Fruit> map )
	{
		honeydew = map;
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

	public void setKale( List<Integer> kale )
	{
		this.kale = kale;
	}
	public List<Integer> getKale()
	{
		return kale;
	}

	public void setLime( List<Float> lime )
	{
		this.lime = lime;
	}
	public List<Float> getLime() { return lime; }
	public void setMango( List<Boolean> mango )
	{
		this.mango = mango;
	}
	public List<Boolean> getMango() { return mango; }
	public void setNectarine( List<Date> nectarine )
	{
		this.nectarine = nectarine;
	}
	public List<Date> getNectarine() { return nectarine; }
	public void setOrange( List<String> orange )
	{
		this.orange = orange;
	}
	public List<String> getOrange() { return orange; }
	public void setPlum( List<Map> plum )
	{
		this.plum = plum;
	}
	public List<Map> getPlum() { return plum; }

	@Override
	public boolean equals( Object o )
	{
		if( this == o ) return true;
		if( o == null || getClass() != o.getClass() ) return false;
		Fruit fruit = (Fruit) o;
		return Float.compare( fruit.banana, banana ) == 0 &&
			cherry == fruit.cherry &&
			eggplant == fruit.eggplant &&
			Objects.equals( apple, fruit.apple ) &&
			Objects.equals( dewberry, fruit.dewberry ) &&
			Objects.equals( fig, fruit.fig ) &&
			Objects.equals( grape, fruit.grape ) &&
			Objects.equals( honeydew, fruit.honeydew ) &&
			Objects.equals( iyokan, fruit.iyokan ) &&
			jasmine == fruit.jasmine &&
			Objects.equals( kale, fruit.kale ) &&
			Objects.equals( lime, fruit.lime ) &&
			Objects.equals( mango, fruit.mango ) &&
			Objects.equals( nectarine, fruit.nectarine ) &&
			Objects.equals( orange, fruit.orange ) &&
			Objects.equals( plum, fruit.plum );
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(
			apple, banana, cherry, dewberry, eggplant, fig, grape, honeydew, iyokan,
			jasmine, kale, lime, mango, nectarine, orange, plum
		);
	}
}
