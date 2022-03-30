package com.company;

public class Main {
    public static void main(String[] args) {
        int countBook = 0;
        double sum = 0;
        Book[] book = new Book[10];
        book[0] = new ProgrammingBook(1, "Kí sự code dạo", 20000.0, "Phạm Huy Hoàng", "Tiếng Việt", "Java");
        book[1] = new ProgrammingBook(2, "Tớ Học Lập Trình", 30000.0, "Nhiều Tác Giả", "Tiếng Việt", "Swing");
        book[2] = new ProgrammingBook(3, "Lập Trình Và Cuộc Sống", 45000.0, "Jeff Atwood", "Tiếng Việt", "JS");
        book[3] = new ProgrammingBook(4, "The pragmatic programmer: from Journeyman to Master", 50000.0, "David Thomas", "Tiếng Anh", "Php");
        book[4] = new ProgrammingBook(5, "Don’t Make Me Think", 35000.0, "Steve Krug", "Tiếng Anh", "Python");
        book[5] = new FictionBook(6, "Mật mã Davinci", 75000.0, "DanBrow",  "Sách trinh thám");
        book[6] = new FictionBook(7, "Harry Potter và Hòn đá phù thủy", 35000.0, "JK Rowling", "Truyện thiếu nhi");
        book[7] = new FictionBook(8, "One Piece", 35000.0, "Oda", "Sách thiếu nhi");
        book[8] = new FictionBook(9, "Sherlock Holme", 35000.0, "Conan Doyce", "Truyện Trinh Thám");
        book[9] = new FictionBook(10, "Tây Du Ký", 35000.0, "Ngô Thừa Ân", "Truyên Dã Sử");

        for (Book priceTotal: book
             ) {
            sum += priceTotal.getPrice();
        }
        System.out.println("Tổng tiền 10 quyển sách là: " + sum);

        for (Book dem:book
             ) {
            if (dem instanceof ProgrammingBook) {
                if (((ProgrammingBook) dem).getLanguage().equals("Tiếng Việt")) {
                    countBook ++;
                }
            }
        }
        System.out.println("Số sách viết bằng Tiếng Việt là : " + countBook);
    }
}
