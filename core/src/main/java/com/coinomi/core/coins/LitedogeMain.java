package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class LitedogeMain extends CoinType {
    private LitedogeMain() {
        id = "litedoge.main";

        addressHeader = 90;
        p2shHeader = 8;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 500;

        family = PeerFamily.get();
        name = "Litedoge";
        symbol = "LDOGE";
        uriScheme = "litedoge"; // TODO verify, could be ppcoin?
        bip44Index = 43;
        unitExponent = 8;
        feePerKb = value(10000); // 0.01PPC, careful Peercoin has 1000000 units per coin
        minNonDust = value(10000); // 0.01PPC
        softDustLimit = minNonDust;
        softDustPolicy = SoftDustPolicy.NO_POLICY;
        signedMessageHeader = toBytes("Litedoge Signed Message:\n");
    }

    private static LitedogeMain instance = new LitedogeMain();
    public static synchronized LitedogeMain get() {
        return instance;
    }
}
