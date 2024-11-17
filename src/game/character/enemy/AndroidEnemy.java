package game.character.enemy;

import game.character.GameCharacter;

public class AndroidEnemy implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("Android pissed on you");
    }

    @Override
    public void move() {
        System.out.println("Android has moved X axis by 3 units");
    }

}
