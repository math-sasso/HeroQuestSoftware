package br.unicamp.Map.MapElements.StaticElements.VariableElements;

import br.unicamp.Interfaces.Collectable;
import br.unicamp.Map.MapElements.MapElement;
import br.unicamp.Map.MapElements.Characters.Character;
import br.unicamp.Map.MapElements.Characters.Monsters.Monster;
import br.unicamp.Map.MapElements.StaticElements.FloorElement;

public class ChestTrap extends Chest {

	private Monster monster;
	public ChestTrap(int x, int y, Monster monster) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.monster = monster;
	}
	
	@Override
	public String toString() {
		return "C";
	}
	
	public void updateChestOnMap(MapElement[][] map) {
		int chestX = this.getX();
		int chestY = this.getY();
		map[chestX][chestY] = this.monster;
		
	}

	
	private void open(Character character) {
		System.out.println("A MONSTER APPEARED");
	}

}
