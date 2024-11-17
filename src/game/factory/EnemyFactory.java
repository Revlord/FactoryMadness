package game.factory;

import game.character.GameCharacter;
import game.character.enemy.AndroidEnemy;
import game.character.enemy.CybordEnemy;
import game.character.enemy.HumanoidEnemy;
import game.enums.CharacterType;

public class EnemyFactory extends GameCharacterFactory {
    @Override
    public GameCharacter createCharacter(CharacterType type) {
        switch (type) {
            case ANDROID:
                return new AndroidEnemy();
            case HUMANOID:
                return new HumanoidEnemy();
            case CYBORG:
                return new CybordEnemy();
            default:
                throw new IllegalArgumentException("This type of enermy is unknown to us tf");
        }
    }
}
