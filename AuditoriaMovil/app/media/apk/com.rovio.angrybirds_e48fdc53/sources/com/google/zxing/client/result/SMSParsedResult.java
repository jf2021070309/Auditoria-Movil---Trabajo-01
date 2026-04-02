package com.google.zxing.client.result;
/* loaded from: classes2.dex */
public final class SMSParsedResult extends ParsedResult {
    private final String[] a;
    private final String[] b;
    private final String c;
    private final String d;

    public SMSParsedResult(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.a = new String[]{str};
        this.b = new String[]{str2};
        this.c = str3;
        this.d = str4;
    }

    public SMSParsedResult(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.a = strArr;
        this.b = strArr2;
        this.c = str;
        this.d = str2;
    }

    public String getSMSURI() {
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        boolean z = true;
        for (int i = 0; i < this.a.length; i++) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(this.a[i]);
            if (this.b != null && this.b[i] != null) {
                sb.append(";via=");
                sb.append(this.b[i]);
            }
        }
        boolean z2 = this.d != null;
        boolean z3 = this.c != null;
        if (z2 || z3) {
            sb.append('?');
            if (z2) {
                sb.append("body=");
                sb.append(this.d);
            }
            if (z3) {
                if (z2) {
                    sb.append('&');
                }
                sb.append("subject=");
                sb.append(this.c);
            }
        }
        return sb.toString();
    }

    public String[] getNumbers() {
        return this.a;
    }

    public String[] getVias() {
        return this.b;
    }

    public String getSubject() {
        return this.c;
    }

    public String getBody() {
        return this.d;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        maybeAppend(this.a, sb);
        maybeAppend(this.c, sb);
        maybeAppend(this.d, sb);
        return sb.toString();
    }
}
