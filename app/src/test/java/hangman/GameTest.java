package hangman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    
    
    Game game = new Game();
    assertEquals("Word masks properly", "M_____", game.getWordToGuess("MAKERS"));


  }
}