import java.util.Scanner;

class InvalidLengthException extends Exception {
    InvalidLengthException(String str)
    {
        super(str);
    }
}

class InvalidCharacterException extends Exception {
    InvalidCharacterException(String str)
    {
        super(str);
    }
}

public class Register {
    void checkregister(String reg) throws InvalidLengthException, InvalidCharacterException
    {
        if(reg.length()!=9)
        {
            throw new InvalidLengthException("The length of the registration number is not 9");
        }
        int flag=1, i;
        for(i=0;i<reg.length();i++)
        {
            if(!Character.isLetter(reg.charAt(i)) && !Character.isDigit(reg.charAt(i)))
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
        {
            throw new InvalidCharacterException("The registration number has character other than letter or digit");
        }
        System.out.println("The entered registration number is valid");
    }
    public static void main(String[] args) {
        Register obj = new Register();
        String reg;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter register number:");;
        reg=sc.next();
        try
        {
            obj.checkregister(reg);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}