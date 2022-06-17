package hangman;

import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class WordChooserTest {
  

  @Test public void testGetsWordToGuessWithRandomWord() {

    WordChooser mockedWordChooser = mock(WordChooser.class);
    when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game(mockedWordChooser, 0);

    assertEquals(game.getWordToGuess(), "D________");


  }

    @Test
    public void testGetsRandomMakersWordToGuess() {
      WordChooser mockedWordChooser = mock(WordChooser.class);
      mockedWordChooser.getRandomWordFromDictionary();
  
      verify(mockedWordChooser).getRandomWordFromDictionary();
  
      when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
  
      System.out.println(mockedWordChooser.getRandomWordFromDictionary());
      assertEquals(mockedWordChooser.getRandomWordFromDictionary(), "MAKERS");
    }
  
    @Test
    public void testGetsRandomCandiesWordToGuess() {
      WordChooser mockedWordChooser = mock(WordChooser.class);
      mockedWordChooser.getRandomWordFromDictionary();
  
      verify(mockedWordChooser).getRandomWordFromDictionary();
  
      when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("CANDIES");
  
      System.out.println(mockedWordChooser.getRandomWordFromDictionary());
      assertEquals(mockedWordChooser.getRandomWordFromDictionary(), "CANDIES");
    }
  
    @Test
    public void testGetsRandomDeveloperWordToGuess() {
      WordChooser mockedWordChooser = mock(WordChooser.class);
      mockedWordChooser.getRandomWordFromDictionary();
  
      verify(mockedWordChooser).getRandomWordFromDictionary();
  
      when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
  
      System.out.println(mockedWordChooser.getRandomWordFromDictionary());
      assertEquals(mockedWordChooser.getRandomWordFromDictionary(), "DEVELOPER");
    }
  
    @Test
    public void testGetsRandomLondonWordToGuess() {
      WordChooser mockedWordChooser = mock(WordChooser.class);
      mockedWordChooser.getRandomWordFromDictionary();
  
      verify(mockedWordChooser).getRandomWordFromDictionary();
  
      when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("LONDON");
  
      System.out.println(mockedWordChooser.getRandomWordFromDictionary());
      assertEquals(mockedWordChooser.getRandomWordFromDictionary(), "LONDON");
  
}

}