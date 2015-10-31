package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class CypherfunkMain extends CoinType {
    private CypherfunkMain() {
        id = "cypherfunk.main";

        addressHeader = 28;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176;

        family = BitFamily.get();
        name = "Cypherfunk";
        symbol = "FUNK";
        uriScheme = "cypherfunk";
        bip44Index = 40;
        unitExponent = 8;
        feePerKb = value(100000);
        minNonDust = value(1000); // 0.00001 LTC mininput
        softDustLimit = value(100000); // 0.001 LTC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Cypherfunk Signed Message:\n");
    }

    private static CypherfunkMain instance = new CypherfunkMain();
    public static synchronized CypherfunkMain get() {
        return instance;
    }
}
