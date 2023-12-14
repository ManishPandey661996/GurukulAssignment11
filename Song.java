/*3) Create a class "Song" with instance variables (title, artist, and duration)
and override the toString method. The toString method should return a
string representation of the song's information. Write a java program to
print the information.*/

import java.util.Scanner;
class Song{
    private String title;
    private String artist;
    private double duration;

    public Song(String title , String artist , double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public Song(){

    }

    public String getTitle(){
        return this.title;
    }
    public String getArtist(){
        return this.artist;
    }
    public double getDuration(){
        return this.duration;
    }

    public void setTitle(String title){
         this.title = title;
    }
    public void setArtist(String artist){
         this.artist = artist;
    }
    public void setDuration(double duration){
         this.duration = duration;
    }

    public String toString(){
        return getTitle()+" song is sung by "+ getArtist()+"  of "+ getDuration()+"  minutes";
    }
}

class SongTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String song, artist ;
        double duration;
        System.out.println("Enter name of the song : ");
        song = sc.nextLine();
        System.out.println("Enter name of the singer : ");
        artist = sc.nextLine();
        System.out.println("Enter duration of the song : ");
        duration = sc.nextDouble();

        Song s1 = new Song(song , artist , duration);
        System.out.println(s1);

       




    }
}