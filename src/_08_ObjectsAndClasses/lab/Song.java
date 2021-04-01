// Judge ready

package _08_ObjectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    private String typeList;
    private String name;
    private String time;

    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = Integer.parseInt(s.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] tokens = s.nextLine().split("_");
            String typeList = tokens[0];
            String name = tokens[1];
            String time = tokens[2];
            songList.add(new Song(typeList, name, time));
        }
//        System.out.println("Enter command: ");
        String command = s.nextLine();
        if (command.equals("all")) {
             printAllSongs(songList);
        } else {
            printSelectedList(songList, command);
        }

    }

    private static void printAllSongs(List<Song> songList) {
        for (Song song : songList) {
               String name = song.getName();
            System.out.println(name);

        }
    }

    private static void printSelectedList(List<Song> songList, String command) {
        for (Song song : songList) {
            if (song.getTypeList().equals(command)) {
                System.out.println(song.getName());
            }
        }
    }
}
