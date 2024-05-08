import java.util.*;

public class quiddichTournement {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Braylen");
        myList.add("Greer");
        myList.add("Mr. Zimmerman");
        myList.add("Emma");
        myList.add("Dimitri");
        myList.add("Pierce");
        myList.add("Berger");
        myList.add("Ollie");

        Collections.shuffle(myList);

        System.out.println("The Game Has Started!");
        for (int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ". ");
            System.out.println(myList.get(i));

        }

        //First Round
        SafeInput.prettyHeader("Round One");
        System.out.println();

        //1 plays 8
        playGame(6, 7, myList);

        //2 plays 7
        playGame(4, 5, myList);

        //3 plays 6
        playGame(2, 3, myList);

        //4 plays 5
        playGame(0, 1, myList);


        //Second round
        SafeInput.prettyHeader("Round Two");
        System.out.println();

        //1 plays 4
        playGame(2, 3, myList);

        //2 plays 3
        playGame(0, 1, myList);


        //Third round
        SafeInput.prettyHeader("Round Three");
        System.out.println();

        //1 plays 2
        playGame(0, 1, myList);

        System.out.println("The " + myList.get(0) + " are the Champions!");

    }

    public static void playGame(int teamA, int teamB, ArrayList<String> teams) {

        Random rnd = new Random();

        System.out.println(teams.get(teamA) + " vs " + teams.get(teamB));

        System.out.println();

        System.out.println("---------------");

        System.out.println();

        int q1a = rnd.nextInt(4) + 1;
        int q2a = rnd.nextInt(4) + 1;
        int q3a = rnd.nextInt(4) + 1;
        int q4a = rnd.nextInt(4) + 1;

        int q1b = rnd.nextInt(4) + 1;
        int q2b = rnd.nextInt(4) + 1;
        int q3b = rnd.nextInt(4) + 1;
        int q4b = rnd.nextInt(4) + 1;

        System.out.println("Q1: " + q1a + " " + q1b);
        System.out.println("Q2: " + q2a + " " + q2b);
        System.out.println("Q3: " + q3a + " " + q3b);
        System.out.println("Q4: " + q4a + " " + q4b);

        int teamAScore = q1a + q2a + q3a + q4a;
        int teamBScore = q1b + q2b + q3b + q4b;
        int getGoldenSnitch = rnd.nextInt(21);
        boolean teamWin = false;
        boolean teamAWin = false;
        boolean teamBWin = false;

        if (teamAScore > teamBScore) {

            System.out.println(teams.get(teamA) + " defeated " + teams.get(teamB));
            System.out.println("Final Score: " + teamAScore + " - " + teamBScore);
            System.out.println();
            teams.remove(teamB);

        } else if (teamBScore > teamAScore) {

            System.out.println(teams.get(teamB) + " defeated " + teams.get(teamA));
            System.out.println("Final Score: " + teamAScore + " - " + teamBScore);
            System.out.println();
            teams.remove(teamA);

        }

    }

}
