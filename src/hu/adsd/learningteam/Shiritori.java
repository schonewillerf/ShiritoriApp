package hu.adsd.learningteam;

import java.util.ArrayList;
import java.util.List;

public class Shiritori
{
    private final List<String> words = new ArrayList<>();

    public void playWord( String word )
    {
        // Check if word is valid
        if ( word.isBlank() ) invalidWord();
            // Check rule 1, word is not already played
        else if ( words.contains( word ) ) resetGame();
            // Check rule 2, first character match last character previous
        else if ( !words.isEmpty() && getLastLetterFromPrevious() != word.charAt( 0 ) ) resetGame();
            // Add word to list
        else addWord( word );
    }

    public void printInstruction()
    {
        System.out.println(
                "Shirtori is a Japanese game where the object is to create a long word list\n"
                        + "There are however two simple rules:\n"
                        + "1 The first letter of every proceeding word should start with the same character as the last word\n"
                        + "2 The word hasn't been played before\n\n"
                        + "enjoy\n\n"
        );
    }

    private char getLastLetterFromPrevious()
    {
        String previousWord = this.words.get( words.size() - 1 );
        return previousWord.charAt( previousWord.length() - 1 );
    }

    private void invalidWord()
    {
        System.out.println( "[ sorry didn't understand what word you are playing ]" );
    }

    private void resetGame()
    {
        this.words.clear();
        System.out.println( "[game over]" );
    }

    private void addWord( String word )
    {
        words.add( word );
        System.out.println( words );
    }
}

