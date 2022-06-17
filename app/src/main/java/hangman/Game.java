package hangman;

//import java.util.Random;

import java.util.ArrayList;

public class Game {

  public String OriginalWord;
  public Integer RemainingAttempts = 10;
  public WordChooser wordChooser;
  private Masker masker;

  public ArrayList<Character> guessedLetters = new ArrayList<Character>();

  public Game(WordChooser wordChooser, Masker masker) {
    this.OriginalWord = wordChooser.getRandomWordFromDictionary();

    this.masker = masker;
    
    //RemainingAttempts = attempts;
  }

  public String getWord() {

    return this.OriginalWord;

  }

  public String getWordToGuess() {

    return this.masker.getMaskedWord(this.OriginalWord, guessedLetters);

  }


  public int getRemainingAttempts() {

    return this.RemainingAttempts;

  }

 

  public Boolean guessLetter(Character letter) {

    if (this.OriginalWord.indexOf(letter) != -1) {

      guessedLetters.add(letter);

      return true;

    }

    else {

      RemainingAttempts--;
      return false;

    }
  }

  public Boolean isGameWon() {

    for (int i = 1; i < OriginalWord.length(); i++) {
      Character letter = OriginalWord.charAt(i);

      if (guessedLetters.indexOf(letter) == -1) {
        return false;
      }
    }
    return true;
  }

  public Boolean isGameLost() {

    return getRemainingAttempts() <= 0 && this.guessedLetters.size() != getWordToGuess().length() - 1;

  }

}
