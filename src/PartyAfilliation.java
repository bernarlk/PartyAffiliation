import java.util.Scanner;

public class PartyAfilliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";

        System.out.print("Choose your party affiliation: (D) Democrat, (R) Republican, (I) Independent: ");
        party = in.nextLine().toUpperCase(); // D R I or something else

        if (party.equals("D"))
        {
            System.out.println("You are a Democrat. You get a Donkey");
        }
        else if (party.equals("R"))
        {
            System.out.println("You are a Republican. You get an Elephant");
        }
        else if (party.equals("I"))
        {
            System.out.println("You are an Independent. You get an Iguana");
        }
        else
        {
            System.out.println("I don't know what party this is " + party);
        }


    }
}
