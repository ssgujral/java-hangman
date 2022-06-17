package hangman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testDisplayMaskedWordToGuess() {
    
    WordChooser wordChooser = new WordChooser();

    Masker masker = new Masker();

    Game game = new Game(wordChooser, masker);
    
    assertEquals("Gets masked word", "M_____", game.getWordToGuess());


  }

 



  @Test public void testGetsInitialRemainingAttempts() {

    WordChooser wordChooser = new WordChooser();

    Masker masker = new Masker();

    Game game = new Game(wordChooser, masker);

    assertEquals("Gets remaining attempts", Integer.valueOf(10), Integer.valueOf(game.getRemainingAttempts()));

  }


    @Test public void testGuessLetterRightAndShowGuessedLetter() {

      WordChooser wordChooser = new WordChooser();

      Masker masker = new Masker();

      Game game = new Game(wordChooser, masker);

      assertEquals(game.guessLetter('L'), true);

      assertEquals(game.getWordToGuess(), "G_____L");

    }


    @Test public void testGuessLetterWrong() {

      WordChooser wordChooser = new WordChooser();

      Masker masker = new Masker();

      Game game = new Game(wordChooser, masker);

      assertEquals(game.guessLetter('X'), false);

      assertEquals(game.getWordToGuess(), "J___");

    }


    @Test public void testIsWon(){
      
      WordChooser wordChooser = new WordChooser();

      Masker masker = new Masker();

      Game game = new Game(wordChooser, masker);



      game.guessLetter('L');
      game.guessLetter('E');
      game.guessLetter('G');

      assertEquals(game.isGameWon(), true);


    }

    @Test public void testIsWonWithSpecialWord() {
      
      
      WordChooser wordChooser = new WordChooser();

      Masker masker = new Masker();

      Game game = new Game(wordChooser, masker);


      game.guessLetter('A');
      game.guessLetter('R');
      game.guessLetter('M');

      assertEquals(game.isGameWon(), true);



    }


}