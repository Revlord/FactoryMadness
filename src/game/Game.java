package game;

import game.character.GameCharacter;
import game.enums.CharacterType;
import game.factory.GameCharacterFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static game.enums.CharacterType.ANDROID;

public class Game {
    //the actual engine that uses the factory to produce shit
    private List<GameCharacter> characters;
    private GameCharacterFactory factory;

    public Game(GameCharacterFactory factory) {
        this.factory = factory;
        this.characters = new ArrayList<>();
    }



    //we need two methods. One to generate random characters and the other to
    //make the random character do the random attack

    public void generateRandomCharacters(int count) {
        Random random = new Random();
        //putting all our ANDROID, HUMA... into 'types'
        CharacterType[] types = CharacterType.values();

        //loop to pick a random type out of the types in 'types' and use the factory to generate a
        //character based on the random type we made
        //and then add this randomly factory generate NPC ass character to 'characters'
        for (int i = 0; i < count; i++) {
            CharacterType randomType = types[random.nextInt(types.length)];
            GameCharacter character = factory.createCharacter(randomType);
            characters.add(character);
        }

    }
    public void perfectCharacterActions() {
        for (GameCharacter character: characters) {
            character.attack();
            character.move();
        }
    }

}
