package com.amazon.aps.iva.r9;

import android.content.Context;
/* compiled from: Trackers.java */
/* loaded from: classes.dex */
public final class g {
    public static g e;
    public final a a;
    public final b b;
    public final e c;
    public final f d;

    public g(Context context, com.amazon.aps.iva.w9.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new a(applicationContext, aVar);
        this.b = new b(applicationContext, aVar);
        this.c = new e(applicationContext, aVar);
        this.d = new f(applicationContext, aVar);
    }

    public static synchronized g a(Context context, com.amazon.aps.iva.w9.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (e == null) {
                e = new g(context, aVar);
            }
            gVar = e;
        }
        return gVar;
    }
}
