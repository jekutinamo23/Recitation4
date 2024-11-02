import java.util.Random;

public class RPS_Player {
    private static final int rock = 0;
    private static final int paper = 1;
    private static final int scissors = 2;
    private int numberOfGamesWon;
    private int numberOfGamesPlayed;
    private int choice;
    private String name;

    public RPS_Player(int numberOfGamesWon, int numberOfGamesPlayed, int choice, String name) {
        this.numberOfGamesWon = numberOfGamesWon;
        this.numberOfGamesPlayed = numberOfGamesPlayed;
        this.choice = choice;
        this.name = name;
    }

    public RPS_Player(String name){
        // TODO: replace this line with your code.
        this.name = name;
    }

    public String getName(){
        // TODO: replace this line with your code.
        return name;
    }
    public int getChoice(){
        return choice;
    }

    /**
     * Returns the number of games played since a clear() was issued.
     * @return returns the number of games played.
     */
    public int getNumberOfGamesPlayed(){
        // TODO: replace this line with your code.
        return numberOfGamesPlayed;
    }

    /**
     * Returns the number of games won since a clear() was issued.
     * @return returns the number of games won.
     */
    public int getNumberOfGamesWon(){
        // TODO: replace this line with your code.
        return numberOfGamesWon;
    }

    /**
     * Returns the win percentage as number between 0 and 1.
     * @return win percentage as a double.
     */
    public double getWinPercentage(){
        // TODO: replace this line with your code.
        double ngw = numberOfGamesWon;
        double ngp = numberOfGamesPlayed;
        return (ngw/ngp);
    }

    /**
     * Starts a new game.
     */
    public void clear(){
        // TODO: replace this line with your code.
        this.numberOfGamesWon = 0;
        this.numberOfGamesPlayed = 0;
    }
    /**
     * This player challenges anotherPlayer whereby both players make a
     * random choice of rock, paper, scissors.  A reference to the winning
     * player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player challenge(RPS_Player anotherPlayer){
        // TODO: replace this line with your code.
        Random rand = new Random();
        choice = rand.nextInt(3);
        anotherPlayer.choice = rand.nextInt(3);
        if(choice == rock && anotherPlayer.choice == paper ){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesWon++;
            return anotherPlayer;
        }
        else if(choice == paper && anotherPlayer.choice == rock){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            this.numberOfGamesWon++;
            return this;
        }
        else if(choice == paper && anotherPlayer.choice == scissors){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesWon++;
            return anotherPlayer;
        }
        else if(choice == scissors && anotherPlayer.choice == paper){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            this.numberOfGamesWon++;
            return this;
        }
        else if(choice == scissors && anotherPlayer.choice == rock){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesWon++;
            return anotherPlayer;
        }
        else if(choice == rock && anotherPlayer.choice == scissors){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            this.numberOfGamesWon++;
            return this;
        }
        else if(choice == anotherPlayer.choice){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
        }

        return null;

    }

    /**
     * This player challenges anotherPlayer whereby this player uses the previous
     * choice made and anotherPlayer makes a random choice of rock, paper, scissors.
     * A reference to the winning player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player keepAndChallenge(RPS_Player anotherPlayer){
        // TODO: replace this line with your code.
        Random rand = new Random();
        anotherPlayer.choice = rand.nextInt(3);
        if(this.choice == rock && anotherPlayer.choice == paper ){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesWon++;
            return anotherPlayer;
        }
        else if(this.choice == paper && anotherPlayer.choice == rock){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            this.numberOfGamesWon++;
            return this;
        }
        else if(this.choice == paper && anotherPlayer.choice == scissors){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesWon++;
            return anotherPlayer;
        }
        else if(this.choice == scissors && anotherPlayer.choice == paper){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            this.numberOfGamesWon++;
            return this;
        }
        else if(this.choice == scissors && anotherPlayer.choice == rock){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesWon++;
            return anotherPlayer;
        }
        else if(this.choice == rock && anotherPlayer.choice == scissors){
            this.numberOfGamesPlayed++;
            anotherPlayer.numberOfGamesPlayed++;
            this.numberOfGamesWon++;
            return this;
        }
        return null;

    }

}