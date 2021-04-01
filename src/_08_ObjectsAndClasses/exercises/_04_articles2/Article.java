package _08_ObjectsAndClasses.exercises._04_articles2;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void getArticleInfo() {
        System.out.printf("%s - %s: %s%n", this.title, this.content, this.author);
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }




}
