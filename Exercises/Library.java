import java.util.*;

class BookClass {
    String[] avBooks = new String[100];
    int[] countBooks = new int[100];
    int num = 3;

    BookClass() {
        avBooks[0] = "C++";
        avBooks[1] = "JAVA";
        avBooks[2] = "PHP";

        countBooks[0] = 5;
        countBooks[1] = 1;
        countBooks[2] = 3;
    }

    void showBooks() {
        if (num != 0) {
            System.out.println("\nOnly " + num + " Books are available...");
            
            for (int i = 0; i < avBooks.length; i++) {
                if (avBooks[i] != null) {
                    System.out.println("* " + avBooks[i] + " (" + countBooks[i] + ")");
                }
            }
        }
        else {
            System.out.println("\nNo any book is available now");
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < avBooks.length; i++) {
            if (avBooks[i] != null) {
                if (avBooks[i].toLowerCase().equals(book.toLowerCase())) {
                    if (countBooks[i] > 1) {
                        System.out.println("\n" + book + " is issued Successfully");
                        countBooks[i] -= 1;
                        break;
                    }
                    avBooks[i] = null;
                    countBooks[i] = 0;
                    num--;
                }
            }
        }
    }

    void returnBook(String book) {
        for (int i = 0; i < avBooks.length; i++) {
            if (avBooks[i] != null) {
                if (avBooks[i].toLowerCase().equals(book.toLowerCase())) {
                    System.out.println("\n" + book + " is return Successfully");
                    countBooks[i] += 1;
                    return;
                }
            } else {
                avBooks[i] = book.toUpperCase();
                countBooks[i] += 1;
                return;
            }
        }
    }
}

class Library {
    public static void main(String args[]) {
        int choice = 0;

        BookClass B1 = new BookClass();
        B1.showBooks();

        Scanner S1 = new Scanner(System.in);
        System.out.print("\nEnter your choice(1 for issueBook & 2 for returnBook): ");
        choice = S1.nextInt();
        
        do {
            switch (choice) {
                case 1:
                    Scanner issue = new Scanner(System.in);
                    System.out.print("\nEnter the Book name, which you want to issue: ");
                    String book = issue.next();
                    B1.issueBook(book);
                    B1.showBooks();
                    issue.close();
                    break;
                    
                    case 2:
                    Scanner ret = new Scanner(System.in);
                    System.out.print("\nEnter the Book name, which you want to return: ");
                    book = ret.next();
                    B1.returnBook(book);
                    B1.showBooks();
                    ret.close();
                    break;
                    
                }
                System.out.print("\nEnter choice again(1 for issueBook & 2 for returnBook): ");
                choice = S1.nextInt();
                
            } while (choice == 1 || choice == 2);
            S1.close();
        }
    }
    