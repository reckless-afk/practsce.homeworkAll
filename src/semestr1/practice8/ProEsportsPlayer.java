package semestr1.practice8;

public class ProEsportsPlayer extends Gamer{
    private String teamName;
    private double prizeMoneyUSD;
    private int tournamentsWon;

    public ProEsportsPlayer (String nickname,int hoursPlayed,
                             String teamName,double prizeMoneyUSD,int tournamentsWon ){
        super(nickname,hoursPlayed);
        this.prizeMoneyUSD = prizeMoneyUSD;
        this.tournamentsWon = tournamentsWon;
        this.teamName = teamName;
    }
    public double getAveragePrizePerWin(){
        if(tournamentsWon == 0) {
            return 0;
        }

        return prizeMoneyUSD / tournamentsWon;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Команда: " + teamName +
                ", Призові: " + prizeMoneyUSD + " USD" +
                ", Перемог у турнірах: " + tournamentsWon +
                ", Середній приз за перемогу: " + getAveragePrizePerWin() + " USD";
    }
}
