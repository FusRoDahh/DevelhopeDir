public class Players {
    private String nickname;

    private Dices[] dadi = {
            new Dices(4, "D4"),
            new Dices(6, "D6"),
            new Dices(8, "D8"),
            new Dices(10, "D10"),
            new Dices(12, "D12"),
    };

    public Players(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public Dices[] getDices() {
        return dadi;
    }
}
