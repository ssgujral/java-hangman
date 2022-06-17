package hangman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testDisplayMaskedWordToGuess() {
    
    WordChooser wordChooser = new WordChooser();
    
    Game game = new Game(wordChooser, 0);

    assertEquals("Gets masked word", "M_____", game.getWordToGuess());


  }

 

  @Test public void testGetsInitialRemainingAttempts() {

    WordChooser wordChooser = new WordChooser();

    Game game = new Game(wordChooser, 10);

    assertEquals("Gets remaining attempts", Integer.valueOf(10), Integer.valueOf(game.getRemainingAttempts()));

  }




}