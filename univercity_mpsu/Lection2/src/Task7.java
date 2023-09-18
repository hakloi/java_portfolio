
public class Task7 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();
        System.out.print("Input your number of subway rides: ");
        int n = scanner.getInputInt();

        scanner.close();
        // TRY GREEDY ALGORITHM LATER

        int ticket1 = 0, ticket5 = 0, ticket10 = 0, ticket20 = 0, ticket60 = 0;

        while (n >= 60) {
            ticket60++;
            n -= 60;
        }
        while (n >= 20) {
            ticket20++;
            n -= 20;
        }
        while (n >= 10) {
            ticket10++;
            n -= 10;
        }
        while (n >= 5) {
            ticket5++;
            n -= 5;
        }
        ticket1 = n;

        System.out.println(ticket1 + " " + ticket5 + " " + ticket10 + " " + ticket20 + " " + ticket60);
    }
}

