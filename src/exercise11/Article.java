package exercise11;

import java.util.ArrayList;

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongestWord() {
        String[] split = body.split(" ");

        String longestWord = " ";

        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > longestWord.length()) {
                longestWord = split[i];
            }
        }
        return longestWord;
    }

    public ArrayList getWords() {
        ArrayList<String> wordList = new ArrayList();
        String[] split = body.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (!(wordList.contains(split[i]))) {
                wordList.add(split[i]);
            }
        }
        return wordList;
    }


    public static void main(String[] args) {
        Article article = new Article("Hejsa", "Indholdet af denne denne denne af øvelsesbeskrivelse", "per");
        System.out.println(article.getLongestWord());
        System.out.println(article.getWords());

    }

}
