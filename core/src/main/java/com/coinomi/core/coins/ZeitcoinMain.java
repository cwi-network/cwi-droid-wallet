package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class ZeitcoinMain extends CoinType {
    private ZeitcoinMain() {
        id = "zeitcoin.main";

        addressHeader = 51;
        p2shHeader = 8;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 500;

        family = PeerFamily.get();
        name = "Zeitcoin";
        symbol = "ZEIT";
        uriScheme = "zeitcoin"; // TODO verify, could be ppcoin?
        bip44Index = 39;
        unitExponent = 6;
        feePerKb = value(10000); // 0.01ZEIT, careful Zeitcoin has 1000000 units per coin
        minNonDust = value(10000); // 0.01ZEIT
        softDustLimit = minNonDust;
        softDustPolicy = SoftDustPolicy.NO_POLICY;
        signedMessageHeader = toBytes("ZeitCoin Signed Message:\n");
    }

    private static ZeitcoinMain instance = new ZeitcoinMain();
    public static synchronized ZeitcoinMain get() {
        return instance;
    }
}
