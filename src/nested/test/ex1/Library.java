package nested.test.ex1;

public class Library {
    Book[] books;
    int idx;
    public Library(int num){
        books = new Book[num];
    }
    public void addBook(String title,String author){
        if(books.length==idx){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[idx++]= new Book(title, author);
    }
    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");

        for (int i = 0; i < idx; i++) {
            System.out.println("도서 제목: "+books[i].title+", 저자: "+books[i].author);
        }
    }
    private static class Book{
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }


    }
}
