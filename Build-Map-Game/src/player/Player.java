package player;

import java.util.ArrayList;

import buildings.Building;
import buildings.MainBuilding;

public class Player {
	ArrayList<MainBuilding>main=new ArrayList<MainBuilding>();
	String name;
	int energy=0;
	Building selectedBuilding;
	public int getEnergy(){
		return energy;
	}
	public void setSelectedBuilding(Building building){
		selectedBuilding=building;
	}
	public Building getSelectedBuilding(){
		return selectedBuilding;
	}
	public void addEnergy(int energy){
		this.energy=energy;
	}
	public Player(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public MainBuilding getMainBuilding(int index){
		return main.get(index);
	}
	public void addMainBuilding(MainBuilding building){
		main.add(building);
	}
	public void addToBuildingsList(Building building){
		
	}
}
