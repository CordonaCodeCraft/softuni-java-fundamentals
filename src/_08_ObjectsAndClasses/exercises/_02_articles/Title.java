// Judge ready

package _08_ObjectsAndClasses.exercises._02_articles;

import java.util.Scanner;

public class Title {
    private String title;
    private String content;
    private String author;

    public Title(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void editContent(String content) {
        this.content = content;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void renameTitle(String newTitle) {
        this.title = newTitle;
    }

    public void printArticle() {
        System.out.printf("%s - %s: %s", this.title, this.content, this.author);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter title");
        String[] tokens = s.nextLine().split(", ");
        String title = tokens[0];
        String content = tokens[1];
        String author = tokens[2];
        Title firstTitle = new Title(title, content, author);
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = s.nextLine().split(": ");
            String trigger = command[0];
            switch (trigger) {
                case "Edit":
                    firstTitle.editContent(command[1]);
                    break;
                case "ChangeAuthor":
                    firstTitle.changeAuthor(command[1]);
                    break;
                case "Rename":
                    firstTitle.renameTitle(command[1]);
                    break;
            }
        }
        firstTitle.printArticle();
    }


}
