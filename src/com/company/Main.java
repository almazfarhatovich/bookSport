package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AudioBook audioBook = new AudioBook("Самурай без меча","Китами Масао","Биография",1.33);
        System.out.println("Название книги:"+audioBook.getName()+"\n"+"Автор книги:"+audioBook.getAuthor()+"\n"+"Жанр:"+audioBook.getGenre()+"\n"+"Длительность аудио:"+audioBook.getDuration());
        audioBook.listen();
        System.out.println("+---------------------------------------+");
        OnlineBook onlineBook = new OnlineBook("Как стать миллионером в территории СНГ","Саидмурад Давлатов","Управление финансами",305,25.7,"EPUB");
        System.out.println(onlineBook);
        onlineBook.read();
    }
}


//    Китеп деген класс тузунуз(4 поля тузунуз),
//    ал классты башка 2 класс мурастасын(Аудиокитеп,Онлайн китеп),
//        subclass озунун полялары жана методтору болсун. Объектерини тузуп,
//        консолго toString менен чыгарыныз (отредактировано)