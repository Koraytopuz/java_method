public class Main {
public static void main (String[] args ) {
    boolean gameOver=true;
    int score=800;
    int levelCompleted=5;
    int bonus=100;
  int highScore=  calculateScore (gameOver,score,levelCompleted,bonus);
    System.out.println("The highscore is "+highScore);
    score=10000;
    levelCompleted=8;
    bonus=200;
    System.out.println("The new highscore is "+
            calculateScore(gameOver,score,levelCompleted,bonus));
}
public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {

    int finalScore = score;
    if (gameOver) {
        finalScore += (levelCompleted * bonus);
    }
    return finalScore;

}
}