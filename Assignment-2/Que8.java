package library;

import java.util.Scanner;
import java.util.ArrayList;

abstract class AbstractBook {
    private String title, author;
    String bookType;
    boolean isLent;

    AbstractBook(String ...a) {
        this.title = a[0];
        this.author = a[1];
        this.bookType = a[2];
        this.isLent = false;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    abstract String getBookType();

    public String toString() {
        return ("Title: "+this.title+"\nAuthor: "+this.author+"\nBook Type: "+this.bookType);
    }
}

class Book extends AbstractBook {
    Book(String ...a) {
        super(a);
    }

    String getBookType() {
        return this.bookType;
    }
}

class Library {
    ArrayList<Book> B = new ArrayList<Book>();

    Library() {
        B.add(new Book("Head First Java","Kathy Sierra","Learning"));
        B.add(new Book("Clean Code","Robert Cecil Martin","Learning"));
        B.add(new Book("A Book On C, 4/E","Kelley","Learning"));
        B.add(new Book("A Tour of C++","Bjarne Stroustrup","Learning"));
        B.add(new Book("A Smarter Way to Learn JavaScript","Mark Myers","Learning"));
        B.add(new Book("HTML & CSS: Design and Build Web Sites","Jon Duckett","Learning"));
        B.add(new Book("React and React Native","Adam Boduch","Learning"));
    }
    void addBook(String ...a) {
        B.add(new Book(a[0], a[1], a[2]));
        System.out.println("\n***Book added Succefully***");
        System.out.println(B.get(B.size()-1).toString());
    }

    void lendBook(int num) {
        for(int i=0; i<B.size(); i++) {
            if((i+1) == num) {
                B.get(i).isLent = true;
                System.out.println("\n***Book Lended Successfully***");
                System.out.println(B.get(i).toString());
                return;
            }
        }
    }

    void returnBook(int num) {
        for(int i=0; i<B.size(); i++) {
            if((i+1) == num) {
                B.get(i).isLent = false;
                System.out.println("\n***Book Return Successfully***");
                System.out.println(B.get(i).toString());
                return;
            }
        }
    }

    void printAvBook() {
        int count = 0;
        for(int i=0; i<B.size(); i++) {
            if(!B.get(i).isLent) {
                count++;
                break;
            }
        }
        if(count > 0) {
            System.out.println("\nAvailable Books");
            System.out.println("_________________________________________________________");
            for(int i=0; i<B.size(); i++) {
                if(!B.get(i).isLent) {
                    System.out.println((i+1)+") "+B.get(i).toString());
                    System.out.println("-----------------------------------------------");
                    count++;
                }
            }
        }
        else {
            System.out.println("***All Books are Lended Now***");
        }
    }
    void printNotAvBook() {
        int count = 0;

        for(int i=0; i<B.size(); i++) {
            if(B.get(i).isLent) {
                count++;
                break;
            }
        }
        if(count > 0) {
            System.out.println("\nAll Lended Books");
            System.out.println("_________________________________________________________");
            for(int i=0; i<B.size(); i++) {
                if(B.get(i).isLent) {
                    System.out.println((i+1)+") "+B.get(i).toString());
                    System.out.println("-----------------------------------------------");
                    count++;
                }
            }
        }
        else {
            System.out.println("***All Books are Available, No Any Book is Lended Now***");
        }
    }
}

class Que8 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        Library L = new Library();
        int choice, num;
        String title, author, bookType;

        while(true) {
            System.out.println("\n\nChoices....");
            System.out.println("1) Add Book in Library");
            System.out.println("2) Lend Book");
            System.out.println("3) Return Book");
            System.out.println("4) List All Available Books");
            System.out.println("5) List All lended Books");
            System.out.println("-- Other to Exit");

            System.out.print("\nEnter Your Choice: ");
            choice = S.nextInt();

            switch(choice) {
                case 1:
                    Scanner S1 = new Scanner(System.in);
                    System.out.print("Enter Title of the Book: ");
                    title = S1.nextLine();

                    Scanner S2 = new Scanner(System.in);
                    System.out.print("Enter Author of the Book: ");
                    author = S2.nextLine();

                    Scanner S3 = new Scanner(System.in);
                    System.out.print("Enter Book Type: ");
                    bookType = S3.nextLine();
                    L.addBook(title, author, bookType);
                    break;

                case 2:
                    L.printAvBook();
                    System.out.print("\nEnter the Number of the Book, Which you want to Lend: ");
                    num = S.nextInt();
                    L.lendBook(num);
                    break;

                case 3:
                    L.printNotAvBook();
                    System.out.print("\nEnter the Number of the Book, Which you want to Return: ");
                    num = S.nextInt();
                    L.returnBook(num);
                    break;

                case 4:
                    L.printAvBook();
                    break;

                case 5:
                    L.printNotAvBook();
                    break;

                default:
                    return;
            }
        }
    }
}