// Judge ready

package _08_ObjectsAndClasses.exercises._04_articles2;
import java.util.*;

public class ArticleMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter count: ");
        int count = Integer.parseInt(s.nextLine());
        List<Article> articlesList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            populateArticlesList(articlesList, s.nextLine());
        }
//        System.out.print("Enter filter: ");
        String filter = s.nextLine();
        switch (filter) {
            case "title":
                articlesList.sort(Comparator.comparing(Article::getTitle));
                printSorted(articlesList);
                break;
            case "content":
                articlesList.sort(Comparator.comparing(Article::getContent));
                printSorted(articlesList);
                break;
            case "author":
                articlesList.sort(Comparator.comparing(Article::getAuthor));
                printSorted(articlesList);
                break;
        }
    }


    private static void populateArticlesList(List<Article> articlesList, String nextLine) {
        String[] tokens = nextLine.split(", ");
        String article = tokens[0];
        String content = tokens[1];
        String author = tokens[2];
        articlesList.add(new Article(article, content, author));
    }

    private static void printSorted(List<Article> articlesList) {
        for (Article article : articlesList) {
            article.getArticleInfo();
        }
    }

}
