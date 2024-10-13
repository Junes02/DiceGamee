public class Spil{

int spiller1score = 0;
int spiller2score = 0;
boolean spiller1tur = true;
boolean ToSeksSidste = false;

private Terninger terning = new Terninger();

public void spillet(){
 var scanner = new java.util.Scanner(System.in);
     scanner.useLocale(java.util.Locale.ENGLISH);

     while(true){
      int score;

if (spiller1tur) {
    score = spiller1score;
} else {
    score = spiller2score;
}     
String besked;
        if (spiller1tur) {
            besked = "Spiller 1 tur";
        }
        else{
            besked = "Spiller 2 tur";
        }
        System.out.println(besked);

int sum = terning.kast();
System.out.println(terning);


String ensResult = terning.getEns();
if ("ToSeks".equals(ensResult) && ToSeksSidste){
if (spiller1tur){
    System.out.println("To gange to 6'ere! Spiller 1 vinder spillet!");
}
else { System.out.println("To gange to 6'ere! Spiller 2 vinder spillet!");   
}
break;
}
else if("ToEner".equals(ensResult)){
    System.out.println("To 1'ere! Alle point går tabt.");
    if (spiller1tur) {
                spiller1score = 0;
            } else {
                spiller2score = 0;
            }
}
else {score = score + sum;
System.out.println("Ny score: " + score);
}

if(score>= 40 && "Samme".equals(ensResult)){
    if (spiller1tur){
    System.out.println("Spiller 1 har over 40 point og slog to ens! De vinder spillet!");
}
else{ System.out.println("Spiller 2 har over 40 point og slog to ens! De vinder spillet!");
}
break;
}

if (spiller1tur){
    spiller1score = score;
}
else{spiller2score = score;
}

ToSeksSidste = "ToSeks".equals(ensResult);
spiller1tur = !spiller1tur;
System.out.println("Tryk enter for at kaste terningerne.");
scanner.nextLine();
     }
     scanner.close();
     }
     public static void main(String[] args) {
        new Spil().spillet();
     }

}
