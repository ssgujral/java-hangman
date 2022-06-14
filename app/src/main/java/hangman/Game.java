package hangman;

import java.util.ArrayList;


class Game {



  //Game hangman_game = new Game("MAKERS");

  public String getWordToGuess(String word)
  {


    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < word.length(); i++) 
    {
        Character currentLetter = word.charAt(i);
        if (i == 0) {
            builder.append(currentLetter);
        } else {
            builder.append("_");
        }
      
    } 

    return builder.toString();

  }
}
