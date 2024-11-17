package game;
import game.factory.EnemyFactory;
import game.factory.GameCharacterFactory;

public class Main {
    public static void main(String[] args) {
        GameCharacterFactory enemyFactory = new EnemyFactory();
        Game game = new Game(enemyFactory);

        game.generateRandomCharacters(5);
        game.perfectCharacterActions();
    }
}
