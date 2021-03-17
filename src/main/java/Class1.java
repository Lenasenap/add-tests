/**
 * Här har jag lagt in en liten blandning av olika minimetoder som behöver testfall!
 * För att öva på att skapa ett happycase och ett unhappy case till varje metod; fundera på vad som skulle kunna gå fel
 * i de här metoderna och skriv sen testet för det scenariot.
 * Jag visar ett exempel på den första metoden.
 */
public class Class1 {

    /**
     *
     * @param number1 En positiv siffra
     * @param number2 En positiv siffra
     * @return
     */
    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    public boolean isLargerThanTen(int number) {
        return number > 10;
    }

    public void containsAnS(String word) {
        if (word.contains("s")) {
            System.out.println(word + " innehåller bokstaven 's'");
        } else if (!word.contains("s")) {
            System.out.println(word + " innehåller inte bokstaven 's");
        } else {
            System.out.println("Nu blev någonting tokigt.....");
        }
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }
}
