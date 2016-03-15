package buildings;

import java.util.ArrayList;

public class BuildingList {
	static ArrayList<Building>b= new ArrayList<Building>();
	public static void initList(){
		Building main=new MainBuilding(0,0);
		main.toggleVisibility(false);
		b.add(main);
	}
	public static ArrayList<Building> getList(){
		return b;
	}

}
