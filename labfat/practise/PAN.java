import java.util.Scanner;

class InvalidLengthException extends Exception {
    InvalidLengthException(String str)
    {
        super(str);
    }
}

class InvalidAlphabetSeriesException extends Exception {
    InvalidAlphabetSeriesException(String str)
    {
        super(str);
    }
}

class InvalidStatusException extends Exception {
    InvalidStatusException(String Str)
    {
        super(Str);
    }
}

class FifthCharacterException extends Exception {
    FifthCharacterException(String str)
    {
        super(str);
    }
}

public class PAN {
    void checkpan(String str) throws InvalidLengthException, InvalidAlphabetSeriesException, InvalidStatusException, FifthCharacterException
    {
        if(str.length()!=10)
        {
            throw new InvalidLengthException("PAN id length is not valid");
        }
        else if(!Character.isLetter(str.charAt(0)) || !Character.isLetter(str.charAt(1)) || !Character.isLetter(str.charAt(2)) || Character.isLowerCase(str.charAt(0)) || Character.isLowerCase(str.charAt(1)) || Character.isLowerCase(str.charAt(2)))
        {
            throw new InvalidAlphabetSeriesException("Invalid alphabet series");
        }
        else if(str.charAt(3)!='A' && str.charAt(3)!='B' && str.charAt(3)!='C' && str.charAt(3)!='F' && str.charAt(3)!='G' && str.charAt(3)!='H' && str.charAt(3)!='I' && str.charAt(3)!='J' && str.charAt(3)!='L' && str.charAt(3)!='P')
        {
            throw new InvalidStatusException("Invalid status");
        }
        else if(!Character.isLetter(str.charAt(4)))
        {
            throw new FifthCharacterException("Fifth character is not a letter");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String panid;
        PAN obj = new PAN();
        System.out.println("Enter PAN id:");
        panid=sc.next();
        try
        {
            obj.checkpan(panid);
            System.out.println("PAN id is valid");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
