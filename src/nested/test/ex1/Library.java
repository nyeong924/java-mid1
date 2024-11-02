package nested.test.ex1;

public class Library {
    //코드 작성
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
            System.out.println("도서 정보 저장 완료");
        } else {
            System.out.println("저장 공간 부족");
        }
    }

    public void showBooks() {
        System.out.println("책 목록 출력");
        for (int i = 0; i < books.length; i++) {
            System.out.println("도서 제목 : " + books[i].title + ", 저자 : " + books[i].author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
    }
