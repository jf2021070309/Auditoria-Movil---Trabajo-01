package com.amazon.aps.iva.p8;

import android.content.Context;
import com.amazon.aps.iva.p8.g;
import com.amazon.aps.iva.u8.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: DatabaseConfiguration.java */
/* loaded from: classes.dex */
public final class a {
    public final b.c a;
    public final Context b;
    public final String c;
    public final g.d d;
    public final List<g.b> e;
    public final Executor f;
    public final Executor g;
    public final boolean h;
    public final boolean i;

    public a(Context context, String str, b.c cVar, g.d dVar, ArrayList arrayList, boolean z, g.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = arrayList;
        this.f = executor;
        this.g = executor2;
        this.h = z2;
        this.i = z3;
    }

    public final boolean a(int i, int i2) {
        boolean z;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if ((!z || !this.i) && this.h) {
            return true;
        }
        return false;
    }
}
