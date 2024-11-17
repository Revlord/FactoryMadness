package game.factory;

import game.character.GameCharacter;
import game.enums.CharacterType;

abstract public class GameCharacterFactory {
    abstract public GameCharacter createCharacter(CharacterType type);
    public int getActiveCharacters() {
        return 0;
    }

}
