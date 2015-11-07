package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class PandacoinMain extends CoinType {
    private PandacoinMain() {
        id = "pandacoin.main";

        addressHeader = 55;
        p2shHeader = 22;
        acceptableAddressCodes = new int[]{addressHeader, p2shHeader};
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        family = BitFamily.get();
        name = "Pandacoin";
        symbol = "PND";
        uriScheme = "pandacoin";
        bip44Index = 37;
        unitExponent = 8;
        feePerKb = value(10000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 BTC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Pandacoin Signed Message:\n");
    }

    private static PandacoinMain instance = new PandacoinMain();

    public static synchronized PandacoinMain get() {
        return instance;
    }
}
