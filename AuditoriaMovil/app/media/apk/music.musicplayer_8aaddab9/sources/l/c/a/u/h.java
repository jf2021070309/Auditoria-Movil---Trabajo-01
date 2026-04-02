package l.c.a.u;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class h {
    public static final h a = new h('0', '+', CoreConstants.DASH_CHAR, CoreConstants.DOT);

    /* renamed from: b  reason: collision with root package name */
    public final char f9798b;

    /* renamed from: c  reason: collision with root package name */
    public final char f9799c;

    /* renamed from: d  reason: collision with root package name */
    public final char f9800d;

    /* renamed from: e  reason: collision with root package name */
    public final char f9801e;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public h(char c2, char c3, char c4, char c5) {
        this.f9798b = c2;
        this.f9799c = c3;
        this.f9800d = c4;
        this.f9801e = c5;
    }

    public String a(String str) {
        char c2 = this.f9798b;
        if (c2 == '0') {
            return str;
        }
        int i2 = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < charArray.length; i3++) {
            charArray[i3] = (char) (charArray[i3] + i2);
        }
        return new String(charArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f9798b == hVar.f9798b && this.f9799c == hVar.f9799c && this.f9800d == hVar.f9800d && this.f9801e == hVar.f9801e;
        }
        return false;
    }

    public int hashCode() {
        return this.f9798b + this.f9799c + this.f9800d + this.f9801e;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("DecimalStyle[");
        y.append(this.f9798b);
        y.append(this.f9799c);
        y.append(this.f9800d);
        y.append(this.f9801e);
        y.append("]");
        return y.toString();
    }
}
