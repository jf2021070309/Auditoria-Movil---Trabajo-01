package com.amazon.aps.iva.nb;

import com.amazon.aps.iva.ab.t;
import java.util.HashSet;
/* compiled from: Log.java */
/* loaded from: classes.dex */
public final class b {
    public static final a a = new a();
    public static final t b = new t();

    /* compiled from: Log.java */
    /* loaded from: classes.dex */
    public static class a {
        public final HashSet a = new HashSet();
    }

    public static void a() {
        b.getClass();
    }

    public static void b(int i) {
        if (a.a.contains(Integer.valueOf(i))) {
            a();
        }
    }
}
