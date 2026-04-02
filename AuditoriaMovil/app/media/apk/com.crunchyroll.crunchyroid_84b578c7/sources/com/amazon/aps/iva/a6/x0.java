package com.amazon.aps.iva.a6;

import android.content.Context;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q4.c;
import com.google.common.collect.ImmutableList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x0(Object obj, int i, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((y0) obj3).c.r0(((ImmutableList.Builder) obj).build(), (v.b) obj2);
                return;
            case 1:
                e.a aVar = (e.a) obj3;
                ((com.amazon.aps.iva.g6.e) obj).S(aVar.a, aVar.b, (Exception) obj2);
                return;
            case 2:
                int i2 = com.amazon.aps.iva.b8.t.u;
                ((com.amazon.aps.iva.b8.t) obj3).getClass();
                ((Runnable) obj2).run();
                return;
            default:
                com.amazon.aps.iva.ud.a aVar2 = (com.amazon.aps.iva.ud.a) obj3;
                com.amazon.aps.iva.q4.c cVar = (com.amazon.aps.iva.q4.c) obj;
                Context context = (Context) obj2;
                com.amazon.aps.iva.yb0.j.f(aVar2, "this$0");
                com.amazon.aps.iva.yb0.j.f(cVar, "$parameters");
                com.amazon.aps.iva.yb0.j.f(context, "$context");
                Object b = cVar.b(new c.a("ctaButtonText"));
                com.amazon.aps.iva.yb0.j.c(b);
                com.amazon.aps.iva.e1.d.j(aVar2.b, new com.amazon.aps.iva.ks.a((String) b, null, null, ""), null, 2);
                com.amazon.aps.iva.rd.e eVar = com.amazon.aps.iva.gd0.j.e;
                if (eVar != null) {
                    eVar.b().a(context);
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
        }
    }
}
