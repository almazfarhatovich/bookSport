package com.company;

public class OnlineBook extends Book {
    private int page;
    private double razmer;
    private String format;

    public OnlineBook(String name, String author, String genre, int page, double razmer, String format) {
        super(name, author, genre);
        this.page = page;
        this.razmer = razmer;
        this.format = format;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getRazmer() {
        return razmer;
    }

    public void setRazmer(double razmer) {
        this.razmer = razmer;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    void read() {
        System.out.println("читать книгу " + getName() + " в электронном формате будеть экономичнее чем бумажном");
    }

    @Override
    public String toString() {
        return "Название книги:" + getName() + "\n" + "Автор книги:" + getAuthor() + "\n" + "Количество страниц:" + getPage() + "\n" + "Жанр:" + getGenre() + "\n" + "Размер книги:" + getRazmer() + "Mb" + "\n" + "Формат книги:" + getFormat();
    }
}
