import java.util.Random;

public class Players {

    Random random = new Random();
    private final String nickname;

    private final Dices[] dadi = {
            new Dices(4, "D4"),
            new Dices(6, "D6"),
            new Dices(8, "D8"),
            new Dices(10, "D10"),
            new Dices(12, "D12"),
    };

    private int startDice;

    public Players(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public int getStartDice() {
        return startDice;
    }

    public void setStartDice(int startDice) {
        this.startDice = startDice;
    }

    public Dices[] getDices() {
        return dadi;
    }

    public int lanciaDado(int startDice){
        return random.nextInt(dadi[startDice].getFaceNum())+1;
    }


}
