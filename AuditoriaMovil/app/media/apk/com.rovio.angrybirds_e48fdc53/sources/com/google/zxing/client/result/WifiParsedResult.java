package com.google.zxing.client.result;
/* loaded from: classes2.dex */
public final class WifiParsedResult extends ParsedResult {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;

    public WifiParsedResult(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z) {
        super(ParsedResultType.WIFI);
        this.a = str2;
        this.b = str;
        this.c = str3;
        this.d = z;
    }

    public String getSsid() {
        return this.a;
    }

    public String getNetworkEncryption() {
        return this.b;
    }

    public String getPassword() {
        return this.c;
    }

    public boolean isHidden() {
        return this.d;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(80);
        maybeAppend(this.a, sb);
        maybeAppend(this.b, sb);
        maybeAppend(this.c, sb);
        maybeAppend(Boolean.toString(this.d), sb);
        return sb.toString();
    }
}
