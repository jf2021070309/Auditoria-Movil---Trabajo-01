package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.e.w;
/* compiled from: IntOffset.kt */
/* loaded from: classes.dex */
public final class h {
    public static final long b;
    public static final /* synthetic */ int c = 0;
    public final long a;

    /* compiled from: IntOffset.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        new a();
        b = w.e(0, 0);
    }

    public /* synthetic */ h(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static String c(long j) {
        return "(" + ((int) (j >> 32)) + ", " + b(j) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this.a != ((h) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
