package Boolean_Operators;

public class Main {
    public static void main(String[] args) {


    /*
    Try to solve on paper the following boolean algebra operations:

[A]: 2 <= 2 && !true
[B]: !false && 3 > 2
[C]: considering that t=false and f=true: !(!t || f)
[D]: 6 > 6 ^ !(true && true)
Then compare your solutions with a Java program that tests the validity of your assumptions.
     */

    // [A]: 2 <= 2 && !true
        System.out.println(2 <= 2 && !true);
        // il risultato sarà "false" perchè l'operatore logico AND "&&"
        // vuole che entrambe le condizioni sia vere per poter essere vera

    // [B]: !false && 3 > 2
        System.out.println(!false && 3 > 2);
        // entrambe le condizioni sono vere, quindi ci aspetttiamo "true" come risultato

    // [C]: considering that t=false and f=true: !(!t || f)
        boolean t = false;
        boolean f = true;
        System.out.println(!(!t || f));
        // l'operatore logico OR "||" può dare valore falso, solo
        // quando entrambi i valori della condizione sono falsi, ma
        // in questo caso  abbiamo all'inizio della condizione l'operatore logico NOT "!"
        // che trasforma il true presente dentro le parentesi in un false

    // [D]: 6 > 6 ^ !(true && true)
        System.out.println(6 > 6 ^ !(true && true));
        // il risultato sarà false perchè l'operatore logico "XOR"
        // vuole che un valore della condizione sia vero e l'altro falso
        
    }

}
