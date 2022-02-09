package com.company;

public class AudioBook extends Book{
    private double duration;

    public AudioBook(String name, String author, String genre, double duration) {
        super(name, author, genre);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    void listen(){
        System.out.println("Слушать книгу "+getName()+" в аудио формате можно в любое время, в любом месте");
    }

    @Override
    public String toString() {
        return  "Название книги:"+getName()+"\n"+"Автор книги:"+getAuthor()+"\n"+"Жанр:"+getGenre()+"\n"+"Длительность аудио:"+getDuration();
    }
}
