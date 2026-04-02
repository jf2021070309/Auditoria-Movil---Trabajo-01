package com.amazon.aps.iva.v6;

import android.view.Surface;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.v6.m;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ m.a b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;

    public /* synthetic */ j(m.a aVar, Surface surface, long j) {
        this.b = aVar;
        this.c = surface;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a aVar = this.b;
        aVar.getClass();
        int i = g0.a;
        aVar.b.m(this.d, this.c);
    }
}
