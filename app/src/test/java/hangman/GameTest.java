package hangman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    
    
    Game game = new Game("MAKERS", 0);

    assertEquals("Gets masked word", "M_____", game.getWordToGuess());


  }

  @Test public void testGetsInitialRemainingAttempts() {

    Game game = new Game("MAKERS", 10);

    assertEquals("Gets remaining attempts", Integer.valueOf(10), Integer.valueOf(game.getRemainingAttempts()));

  }



}