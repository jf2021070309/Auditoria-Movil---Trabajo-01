package com.amazon.aps.iva.ga0;
/* loaded from: classes4.dex */
public final class l {
    public final String a;
    public final String b;

    public l(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ key='");
        sb.append(this.a);
        sb.append("', value='");
        return defpackage.b.c(sb, this.b, "'}");
    }
}
