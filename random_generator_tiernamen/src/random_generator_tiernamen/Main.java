package random_generator_tiernamen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	
        List<String> words = new ArrayList<>();
        words.add("Schmalblättriger Merk");
        words.add("Schachbrett");
        words.add("Großes Ochsenauge");
        words.add("Großer Rindenflachstecher");
        words.add("Springfrosch");
        words.add("Berg-Gamander");
        words.add("Sackkäfer");
        words.add("Zipfelfalter");
        words.add("Kleiner Sonnenröschen-Bläuling");
        words.add("Knolliger Kälberkropf");
        words.add("Färber-Wau");
        words.add("Helmling");
        words.add("Stinkender Storchschnabel");
        words.add("Rotschenkel");
        words.add("Gemeiner Spaltblättling");
        words.add("Angebrannter Rauchporling");
        words.add("Braundickkopf");
        words.add("Kleiner Schmalbock");
        words.add("Gewöhnlicher Natternkopf");
        words.add("Veränderliches Widderchen");
        words.add("Gemeiner Schenkelkäfer");
        words.add("Glattschieniger Pinselkäfer");
        words.add("Zipfelkäfer");
        words.add("Spitzenfleck");
        words.add("Mausgrauer Schnellkäfer");
        words.add("Plattbauch");
        words.add("Brauner Storchschnabel");
        words.add("Stolperkäfer");
        words.add("Echter Kerbel");
        words.add("Ziegelroter Schwefelkopf");
        words.add("Floh-Knöterich");

        Random rand = new Random();
        String randomWord = words.get(rand.nextInt(words.size()));

        System.out.println("Du bist ein: " + randomWord );
        System.out.println ("   ");
        System.out.println ("PS: Ja, das ist eine Beleidigung.");
    }
}
