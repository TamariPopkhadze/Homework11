import java.awt.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Homework11 {

    private static String getInputLetter (String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.next();
    }

    /*
    შემოგვდის ქვეყანა და დავაბრუნოთ შესაბამისი ქვეყნის დედაქალაქი.
    თუ შემოგვივა ისეთი ქვეყანა, რომელიც ჩემს “ბაზაში” არ მაქვს,
    გამოვუტანოთ შესაბამისი შეტყობინება.
    კოდი დაწერეთ ისე, რომ პროგრამის ხელახლა გაშვება არ მოხდეს,
    როცა ქვეყნებს შევამოწმებ. მაგალითად ასე:
    Tell me Country And I will Tell you its capital. Click Enter To stop!
    Enter Country: Georgia
    Capital Of Georgia is: Tbilisi
    Tell me Country And I will Tell you its capital. Click Enter To stop!
    Enter Country: France
    Capital Of France is: Paris
    Tell me Country And I will Tell you its capital. Click Enter To stop!
    */
    private static void firstProblem(){
        System.out.println("--------------------First Problem--------------------");
        Scanner scanner = new Scanner(System.in);
        while( true){
            System.out.println("Tell me Country And I will Tell you its capital. Click Enter To stop!");
            System.out.print("Enter Country:" );
            String country = scanner.nextLine();
            if(!country.equals("")){
                if(getCapitalFromMap(country) != null){
                System.out.println("Capital of " + country + ": " + getCapitalFromMap(country));
                }
                else {
                    System.out.println("Sorry, we do not have information about the capital of this country yet. Try another country or press Enter");
                }
            }
            else{
                System.out.println("Thanks , bye ");
                break;
            }
        }

    }

    private static String getCapitalFromMap(String country){
        Map<String , String> countriesWithCapitals = new HashMap<>();
        countriesWithCapitals.put("Georgia","Tbilisi");
        countriesWithCapitals.put("Ukraine","Kiev");
        countriesWithCapitals.put("United Kingdom","London");
        countriesWithCapitals.put("United States","Washington");
        countriesWithCapitals.put("Turkey","Ankara");
        countriesWithCapitals.put("Germany","Berlin");
        countriesWithCapitals.put("France","Paris");
        countriesWithCapitals.put("Brazil","Brazil");
        countriesWithCapitals.put("Italy","Rome");
        countriesWithCapitals.put("Austria","Vienna");
        countriesWithCapitals.put("Belgium","Brussels");
        countriesWithCapitals.put("Czech Republic","Prague");
        countriesWithCapitals.put("Estonia","Tallinn");
        countriesWithCapitals.put("Latvia ","Riga");
        countriesWithCapitals.put("Lithuania ","Vilnius");
        countriesWithCapitals.put("Hungary ","Budapest");
        countriesWithCapitals.put("Greece","Athens");
        countriesWithCapitals.put("Spain","Madrid");
        return countriesWithCapitals.get(country);

    }

    /*
     შემოგვდის ლათინური პატარა ასო და დავაბრუნოთ შემოყვანილი
    ასოს შესაბამისი დიდი ასო. კოდი დაწერეთ ისე, რომ პროგრამის
    ხელახლა გაშვება არ მოხდეს, როცა ასოებს შეამოწმებ.
    მაგალითად:
    Enter # to stop;
    Enter letter: a
    a -> A
    Enter letter: l
    L -> L
    Enter letter: #

     */


    private static void secondProblem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------Second Problem--------------------");
        String symbol;
        while(true){
            System.out.println("Enter # to stop;");
            symbol = getInputLetter("Enter letter:");
            if(!symbol.equals("#")){
                System.out.println(symbol + " -> " +symbol.toUpperCase());
            }
            else{
                System.out.println("Thanks, bye");
                break;
            }
        }
    }
    /*
    შემოგვდის ინგლისური ანბანის ლათინური ასო და დავაბრუნოთ
    მერამდენეა მოცემული ასო ნუმერაციით
     */

    private static void thirdProblem(){
        String letter =getInputLetter("Enter letter:");
        if(letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z' ){
            System.out.println( "Position of given letter is -> " +  ((int) letter.charAt(0) - 65 + 1));
        } else if (letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z' ) {
            System.out.println( "Position of given letter is -> " +  ((int) letter.charAt(0) - 97 + 1));
        }
        else {
            System.out.println("Please enter letters only. Try again");
            thirdProblem();
        }


    }

    public static void main(String[] args) {
          firstProblem();
          secondProblem();
          thirdProblem();


    }

}
