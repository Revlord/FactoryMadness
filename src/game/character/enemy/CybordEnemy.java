package game.character.enemy;

import game.character.GameCharacter;

public class CybordEnemy implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("Cyborg just farded? damn. -33 health");
    }

    @Override
    public void move() {
        System.out.println("Cybord warped +7 on the X-axis");
    }
}
