package load;

import java.util.ArrayList;

import player.Player;

public class PlayerList {
	static ArrayList<Player> p=new ArrayList<Player>();
	public static void addPlayer(Player player){
		p.add(player);
	}
	public static Player getPlayer(String name){
		for(Player player:p){
			if(player.getName().equals(name)){
				return player;
			}
		}
		return null;
	}
}
