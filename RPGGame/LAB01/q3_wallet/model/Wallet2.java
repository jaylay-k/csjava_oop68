package q3_wallet.model;

public class Wallet2 {
    private int coins = 0;

    public int getCoins() {
        return coins;
    }
    public void setCoin(int newCoins) {
        if(newCoins < 0) {
            System.out.println("Not Allow!!");
            return;
        }
        this.coins = newCoins;
    }
}
