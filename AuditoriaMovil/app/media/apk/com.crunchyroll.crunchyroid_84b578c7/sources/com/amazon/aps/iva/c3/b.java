package com.amazon.aps.iva.c3;

import com.amazon.aps.iva.c3.e;
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ e.a b;
    public final /* synthetic */ Object c;

    public b(e.a aVar, Object obj) {
        this.b = aVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b = this.c;
    }
}
