package nested.test.myex1;

public class Library {

    private int capacity;
    private int count =0;

    private class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
    private Book[] book;

    public Library(int capacity) {
        this.capacity = capacity;
        book = new Book[capacity];
    }

    public void addBook(String bookName , String bookAuthor){
        if(count >= capacity) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        book[count] = new Book(bookName,bookAuthor);
        count++;
    }

    public void showBooks() {
        System.out.println("=== 책 목록 출력 ===");
        for (Book book1 : book) {
            System.out.println("도서 제목: " + book1.title + ", 저자: " + book1.author);
        }
    }
}
