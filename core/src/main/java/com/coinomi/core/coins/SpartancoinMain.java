package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class SpartancoinMain extends CoinType {
    private SpartancoinMain() {
        id = "spartancoin.main";

        addressHeader = 62;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176;

        family = BitFamily.get();
        name = "Spartancoin";
        symbol = "SPN";
        uriScheme = "spartancoin";
        bip44Index = 41;
        unitExponent = 8;
        feePerKb = value(100000);
        minNonDust = value(1000); // 0.00001 LTC mininput
        softDustLimit = value(100000); // 0.001 LTC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Spartancoin Signed Message:\n");
    }

    private static SpartancoinMain instance = new SpartancoinMain();
    public static synchronized SpartancoinMain get() {
        return instance;
    }
}
