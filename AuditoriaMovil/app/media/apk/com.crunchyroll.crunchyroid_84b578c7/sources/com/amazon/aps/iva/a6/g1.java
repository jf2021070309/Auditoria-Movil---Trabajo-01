package com.amazon.aps.iva.a6;

import android.util.Pair;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.c6.j;
import com.amazon.aps.iva.m6.f;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.p6.b;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Pair pair = (Pair) this.d;
                ((j1.a) this.c).c.h.a0(((Integer) pair.first).intValue(), (v.b) pair.second);
                return;
            case 1:
                j.a aVar = (j.a) this.c;
                aVar.getClass();
                int i = com.amazon.aps.iva.t5.g0.a;
                aVar.b.y((Exception) this.d);
                return;
            case 2:
                com.amazon.aps.iva.m6.f fVar = (com.amazon.aps.iva.m6.f) this.c;
                int i2 = com.amazon.aps.iva.m6.f.n;
                fVar.getClass();
                ((f.a) this.d).a(fVar);
                return;
            case 3:
                com.amazon.aps.iva.p6.b bVar = (com.amazon.aps.iva.p6.b) this.c;
                bVar.n.e(bVar, (b.d) this.d);
                return;
            case 4:
                com.amazon.aps.iva.b8.t tVar = (com.amazon.aps.iva.b8.t) this.c;
                if (!tVar.g()) {
                    tVar.c.getClass();
                    return;
                }
                return;
            case 5:
            default:
                com.amazon.aps.iva.qa0.e eVar = (com.amazon.aps.iva.qa0.e) this.c;
                eVar.getClass();
                eVar.c(com.amazon.aps.iva.qa0.b.AD_ERROR, (HashMap) this.d);
                return;
            case 6:
                com.amazon.aps.iva.up.f fVar2 = (com.amazon.aps.iva.up.f) this.c;
                com.amazon.aps.iva.yb0.j.f(fVar2, "this$0");
                Object obj = this.d;
                com.amazon.aps.iva.yb0.j.f(obj, "$element");
                fVar2.a.b(obj);
                return;
            case 7:
                com.amazon.aps.iva.ar.b bVar2 = (com.amazon.aps.iva.ar.b) this.c;
                com.amazon.aps.iva.xq.f fVar3 = (com.amazon.aps.iva.xq.f) this.d;
                int i3 = com.amazon.aps.iva.ar.b.h;
                com.amazon.aps.iva.yb0.j.f(bVar2, "this$0");
                com.amazon.aps.iva.yb0.j.f(fVar3, "$event");
                synchronized (bVar2.e) {
                    bVar2.e.a(fVar3, bVar2.a);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
                bVar2.b.postDelayed(bVar2.f, com.amazon.aps.iva.ar.b.g);
                return;
        }
    }
}
