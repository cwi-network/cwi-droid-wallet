package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class MagiMain extends CoinType {
    private MagiMain() {
        id = "magi.main";

        addressHeader = 20;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 500;

        family = PeerFamily.get();
        name = "Magi";
        symbol = "XMG";
        uriScheme = "magi"; // TODO verify, could be ppcoin?
        bip44Index = 44;
        unitExponent = 6;
        feePerKb = value(10000); // 0.01PPC, careful Peercoin has 1000000 units per coin
        minNonDust = value(10000); // 0.01PPC
        softDustLimit = minNonDust;
        softDustPolicy = SoftDustPolicy.NO_POLICY;
        signedMessageHeader = toBytes("Magi Signed Message:\n");
    }

    private static MagiMain instance = new MagiMain();
    public static synchronized MagiMain get() {
        return instance;
    }
}
