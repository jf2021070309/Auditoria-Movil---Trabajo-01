package com.amazon.aps.iva.q5;

import java.io.IOException;
/* compiled from: ParserException.java */
/* loaded from: classes.dex */
public class h0 extends IOException {
    public final boolean b;
    public final int c;

    public h0(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.b = z;
        this.c = i;
    }

    public static h0 a(String str, Exception exc) {
        return new h0(str, exc, true, 1);
    }

    public static h0 b(String str, Exception exc) {
        return new h0(str, exc, true, 4);
    }

    public static h0 c(String str) {
        return new h0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.b);
        sb.append(", dataType=");
        return defpackage.e.f(sb, this.c, "}");
    }
}
