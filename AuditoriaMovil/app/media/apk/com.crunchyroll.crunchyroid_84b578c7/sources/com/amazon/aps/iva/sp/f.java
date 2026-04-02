package com.amazon.aps.iva.sp;

import com.amazon.aps.iva.yb0.j;
import java.nio.charset.Charset;
/* compiled from: PayloadDecoration.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final f g = new f("[", "]", ",");
    public static final f h = new f("", "", "\n");
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;

    public f(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        String obj = str3.toString();
        Charset charset = com.amazon.aps.iva.oe0.a.b;
        byte[] bytes = obj.getBytes(charset);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        this.d = bytes;
        byte[] bytes2 = str.toString().getBytes(charset);
        j.e(bytes2, "this as java.lang.String).getBytes(charset)");
        this.e = bytes2;
        byte[] bytes3 = str2.toString().getBytes(charset);
        j.e(bytes3, "this as java.lang.String).getBytes(charset)");
        this.f = bytes3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (j.a(this.a, fVar.a) && j.a(this.b, fVar.b) && j.a(this.c, fVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PayloadDecoration(prefix=" + ((Object) this.a) + ", suffix=" + ((Object) this.b) + ", separator=" + ((Object) this.c) + ")";
    }
}
