package com.amazon.aps.iva.kc;

import android.text.TextUtils;
import java.security.MessageDigest;
/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class g<T> {
    public static final a e = new a();
    public final T a;
    public final b<T> b;
    public final String c;
    public volatile byte[] d;

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public g(String str, T t, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
            this.a = t;
            this.b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.c.equals(((g) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("Option{key='"), this.c, "'}");
    }

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // com.amazon.aps.iva.kc.g.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
