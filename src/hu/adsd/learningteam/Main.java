package hu.adsd.learningteam;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner( System.in );
        Shiritori shiritori = new Shiritori();

        shiritori.printInstruction();

        while ( true )
        {
            System.out.print( "Play a word: " );
            shiritori.playWord( scanner.nextLine().toLowerCase() );
        }
    }
}
