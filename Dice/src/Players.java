public class Players {
    private String nickname;

    private Dices[] dadi = {
            new Dices(4),
            new Dices(6),
            new Dices(8),
            new Dices(10),
            new Dices(12),
    };

    public Players(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}
