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

    // @Override
    // public void toString() {
    //     System.out.println("Title: "+this.title);
    //     System.out.println("Author: "+this.author);

    //     if(!this.isLent)
    //         System.out.println("Availablability: Available");
    //     else
    //         System.out.println("Availablability: Not Available");
    // }
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
        B.add(new Book("Effective C: An Introduction to Professional C Programming","Robert C. Seacord","Learning"));
        B.add(new Book("A Book On C, 4/E","Kelley","Learning"));
        B.add(new Book("A Tour of C++","Bjarne Stroustrup","Learning"));
        B.add(new Book("C++ Crash Course: A Fast-Paced Introduction","Josh Lospinoso","Learning"));
        B.add(new Book("A Smarter Way to Learn JavaScript","Mark Myers","Learning"));
        B.add(new Book("Eloquent JavaScript, 3rd Edition: A Modern Introduction to Programming","Marijn Haverbeke","Learning"));
        B.add(new Book("HTML & CSS: Design and Build Web Sites","Jon Duckett","Learning"));
        B.add(new Book("React and React Native","Adam Boduch","Learning"));
    }
    void addBook(String ...a) {
        B.add(new Book(a[0], a[1], a[2]));
        System.out.println("***Book added Succefully***");
    }

    void lendBook(String title) {
        for(int i=0; i<B.size(); i++) {
            if(B.get(i).getTitle() == title) {
                B.get(i).isLent = true;
                System.out.println("***Book lended successfully***("+title+")");
                return;
            }
        }
    }

    void returnBook(String title) {
        for(int i=0; i<B.size(); i++) {
            if(B.get(i).getTitle() == title) {
                B.get(i).isLent = false;
                System.out.println("***Book return successfully ("+title+")***");
                return;
            }
        }
    }

    void printList() {
        System.out.println("\nBook List");
        System.out.println("-----------------------------------------------------");
        for(int i=0; i<B.size(); i++) {
            if(!B.get(i).isLent) {
                System.out.println((i+1)+") Title: "+B.get(i).getTitle());
                System.out.println("    Author: "+B.get(i).getAuthor());
                System.out.println("    Book Type: "+B.get(i).getBookType()+"\n");
            }
        }
    }
}

class Que8 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        Library L = new Library();
        int choice;
        String title, author, bookType;

        while(true) {
            System.out.println("\nChoices....");
            System.out.println("1) Add Book in Library");
            System.out.println("2) Lend Book");
            System.out.println("3) Return Book");
            System.out.println("4) List All Available Books");
            System.out.println("-- Other to Exit");

            System.out.print("\nEnter Your Choice: ");
            choice = S.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter Title of the Book: ");
                    title = S.nextLine();
                    System.out.print("Enter Author of the Book: ");
                    author = S.nextLine();
                    System.out.print("Enter Book Type: ");
                    bookType = S.nextLine();
                    L.addBook(title, author, bookType);
                    break;

                case 2:
                    System.out.print("Enter Title of the Book: ");
                    title = S.nextLine();
                    L.lendBook(title);
                    break;

                case 3:
                    System.out.print("Enter Title of the Book: ");
                    title = S.nextLine();
                    L.returnBook(title);
                    break;

                case 4:
                    L.printList();
                    break;

                default:
                    return;
            }
        }
    }
}