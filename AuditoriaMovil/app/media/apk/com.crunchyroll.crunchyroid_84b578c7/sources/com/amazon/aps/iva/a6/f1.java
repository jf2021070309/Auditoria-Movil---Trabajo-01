package com.amazon.aps.iva.a6;

import android.util.Pair;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.amazon.aps.iva.o6.q c;
    public final /* synthetic */ com.amazon.aps.iva.o6.t d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f1(Object obj, Object obj2, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar, int i) {
        this.b = i;
        this.e = obj;
        this.f = obj2;
        this.c = qVar;
        this.d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        com.amazon.aps.iva.o6.t tVar = this.d;
        com.amazon.aps.iva.o6.q qVar = this.c;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                ((j1.a) obj2).c.h.G(((Integer) pair.first).intValue(), (v.b) pair.second, qVar, tVar);
                return;
            default:
                z.a aVar = (z.a) obj2;
                ((com.amazon.aps.iva.o6.z) obj).T(aVar.a, aVar.b, qVar, tVar);
                return;
        }
    }
}
