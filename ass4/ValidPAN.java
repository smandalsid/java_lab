
import java.util.Scanner;

class InvalidLengthException extends Exception { // for exceptions of invalid length of PAN number
    InvalidLengthException(String str)
    {
        super(str);
    }
}

class AlphabetSeriesException extends Exception{ // for exceptions of first three characters being not alphabets
    AlphabetSeriesException(String str)
    {
        super(str);
    }
}

class StatusException extends Exception { // for exceptions where status is some other undefined character
    StatusException(String str)
    {
        super(str);
    }
}

class FifthCharacterException extends Exception { // for exceptions where the fifth character is not a letter
    FifthCharacterException(String str)
    {
        super(str);
    }
}

public class ValidPAN {
    static void checkPAN(String str) throws InvalidLengthException, AlphabetSeriesException, StatusException, FifthCharacterException
    {   // throws the defined exceptions
        if (str.length()!=10) // when length is not equal to 10
        {
            throw new InvalidLengthException("The lenth is not equal to 10"); // throws exception of type InvalidLengthException
        }
        if (!Character.isLetter(str.charAt(0)) || !Character.isLetter(str.charAt(1)) || !Character.isLetter(str.charAt(2)) || Character.isLowerCase(str.charAt(0)) || Character.isLowerCase(str.charAt(1)) || Character.isLowerCase(str.charAt(2)))
        {
            throw new AlphabetSeriesException("The first three characters are not alphabets"); // throws exception of type AlphabetSeriesException
        }
        if (str.charAt(3)!='A' && str.charAt(3)!='B' && str.charAt(3)!='C' && str.charAt(3)!='F' && str.charAt(3)!='G' && str.charAt(3)!='H' && str.charAt(3)!='I' && str.charAt(3)!='J' && str.charAt(3)!='L' && str.charAt(3)!='P')
        { // when status is invalid
            throw new StatusException("Status is invalid"); // throws exception of type StatusException
        }
        if(!Character.isLetter(str.charAt(4)))
        { // When fifth character is not a letter
            throw new FifthCharacterException("The fifth character is not a letter"); // throws exception of type FifthCharacterException
        }
        System.out.println("This might be valid PAN number"); // when none of the exceptions occur

    }
    public static void main(String[] args) {
        String str;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your PAN number");
        int flag=1; // to keep record if some exception occurs
        str=inp.next();
        try
        {
            checkPAN(str); // check for exceptions to occur on PAN number
        }
        catch(InvalidLengthException i)
        {
            flag=0;
            System.out.println(i.getMessage());
        }
        catch(AlphabetSeriesException a)
        {
            flag=0;
            System.out.println(a.getMessage());
        }
        catch(StatusException s)
        {
            flag=0;
            System.out.println(s.getMessage());
        }
        catch(FifthCharacterException f)
        {
            flag=0;
            System.out.println(f.getMessage());
        }
        if (flag==0)
        {
            System.out.println("Invalid PAN number"); // when some exception occurs
        }
    }
}