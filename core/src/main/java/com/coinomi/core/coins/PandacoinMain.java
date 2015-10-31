package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class PandacoinMain extends CoinType {
    private PandacoinMain() {
        id = "pandacoin.main";

        addressHeader = 55;
        p2shHeader = 22;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 500;

        family = PeerFamily.get();
        name = "Pandacoin";
        symbol = "PND";
        uriScheme = "pandacoin"; // TODO verify, could be ppcoin?
        bip44Index = 42;
        unitExponent = 6;
        feePerKb = value(10000); // 0.01PPC, careful Peercoin has 1000000 units per coin
        minNonDust = value(10000); // 0.01PPC
        softDustLimit = minNonDust;
        softDustPolicy = SoftDustPolicy.NO_POLICY;
        signedMessageHeader = toBytes("PandaCoin Signed Message:\n");
    }

    private static PandacoinMain instance = new PandacoinMain();
    public static synchronized PandacoinMain get() {
        return instance;
    }
}
