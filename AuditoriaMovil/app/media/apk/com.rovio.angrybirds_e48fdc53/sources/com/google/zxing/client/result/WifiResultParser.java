package com.google.zxing.client.result;

import com.google.zxing.Result;
/* loaded from: classes2.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String b;
        String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("WIFI:") || (b = b("S:", massagedText, ';', false)) == null || b.isEmpty()) {
            return null;
        }
        String b2 = b("P:", massagedText, ';', false);
        String b3 = b("T:", massagedText, ';', false);
        if (b3 == null) {
            b3 = "nopass";
        }
        return new WifiParsedResult(b3, b, b2, Boolean.parseBoolean(b("H:", massagedText, ';', false)));
    }
}
