package game.character.enemy;

import game.character.GameCharacter;

public class HumanoidEnemy implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("Stupid fucking retarded human has attacked by mentally degrading your mind by being negative and yapping");
    }

    @Override
    public void move() {
        System.out.println("Retard has moved -1 on the X-axis, oh wait this fucker just jumped tf, +10 on the X axis");
    }
}
