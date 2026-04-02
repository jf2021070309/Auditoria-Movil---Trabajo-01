package com.amazon.aps.iva.j8;

import java.util.Collections;
import java.util.List;
/* compiled from: PageResult.java */
/* loaded from: classes.dex */
public final class g<T> {
    public static final g e = new g(Collections.emptyList(), 0);
    public static final g f = new g(Collections.emptyList(), 0);
    public final List<T> a;
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: PageResult.java */
    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public abstract void a(int i, g<T> gVar);
    }

    public g(int i, int i2, int i3, List list) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        return "Result " + this.b + ", " + this.a + ", " + this.c + ", offset " + this.d;
    }

    public g(List<T> list, int i) {
        this.a = list;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }
}
