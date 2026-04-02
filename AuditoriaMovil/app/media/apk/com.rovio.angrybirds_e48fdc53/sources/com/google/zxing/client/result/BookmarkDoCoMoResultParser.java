package com.google.zxing.client.result;

import com.google.zxing.Result;
/* loaded from: classes2.dex */
public final class BookmarkDoCoMoResultParser extends a {
    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String text = result.getText();
        if (text.startsWith("MEBKM:")) {
            String b = b("TITLE:", text, true);
            String[] a = a("URL:", text, true);
            if (a != null) {
                String str = a[0];
                if (URIResultParser.a(str)) {
                    return new URIParsedResult(str, b);
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
