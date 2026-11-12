package q3_wallet.model;
import model.Wallet;
import model.Wallet2;

public class GlitchScript {
    static void q3_1() {
        Wallet myWallet = new Wallet();

        myWallet.coins = -999;

        System.out.println("Hacking complete.");
        System.out.println("Current Coins: " + myWallet.coins);
    }
    static void q3_2() {
        Wallet2 myWallet = new Wallet2();

        myWallet.setCoin(-999);

        System.out.println("Current Coins: " + myWallet.coins);
    }
}
