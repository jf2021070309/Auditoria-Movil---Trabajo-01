package j.i0.g;

import j.x;
import java.io.IOException;
import java.net.ProtocolException;
/* loaded from: classes2.dex */
public final class i {
    public final x a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9342b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9343c;

    public i(x xVar, int i2, String str) {
        this.a = xVar;
        this.f9342b = i2;
        this.f9343c = str;
    }

    public static i a(String str) throws IOException {
        x xVar;
        String str2;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(e.a.d.a.a.k("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                xVar = x.HTTP_1_0;
            } else if (charAt != 1) {
                throw new ProtocolException(e.a.d.a.a.k("Unexpected status line: ", str));
            } else {
                xVar = x.HTTP_1_1;
            }
        } else if (!str.startsWith("ICY ")) {
            throw new ProtocolException(e.a.d.a.a.k("Unexpected status line: ", str));
        } else {
            xVar = x.HTTP_1_0;
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) != ' ') {
                    throw new ProtocolException(e.a.d.a.a.k("Unexpected status line: ", str));
                } else {
                    str2 = str.substring(i2 + 4);
                }
                return new i(xVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(e.a.d.a.a.k("Unexpected status line: ", str));
            }
        }
        throw new ProtocolException(e.a.d.a.a.k("Unexpected status line: ", str));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == x.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f9342b);
        if (this.f9343c != null) {
            sb.append(' ');
            sb.append(this.f9343c);
        }
        return sb.toString();
    }
}
