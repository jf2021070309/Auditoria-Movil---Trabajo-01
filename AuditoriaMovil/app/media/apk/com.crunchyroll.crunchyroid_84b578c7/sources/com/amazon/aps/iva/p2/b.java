package com.amazon.aps.iva.p2;

import com.amazon.aps.iva.vt.b;
import com.amazon.aps.iva.yb0.j;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

    public /* synthetic */ b(int i, com.amazon.aps.iva.xb0.a aVar) {
        this.b = i;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        com.amazon.aps.iva.xb0.a aVar = this.c;
        switch (i) {
            case 0:
                j.f(aVar, "$tmp0");
                aVar.invoke();
                return;
            default:
                b.a aVar2 = com.amazon.aps.iva.vt.b.m;
                j.f(aVar, "$onListUpdated");
                aVar.invoke();
                return;
        }
    }
}
