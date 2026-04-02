package com.amazon.aps.iva.a6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.k9.r;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q4.c;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b1(Object obj, int i, Object obj2, Object obj3) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.amazon.aps.iva.k9.f fVar;
        int i = this.b;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                com.amazon.aps.iva.b6.a aVar = ((j1.a) obj3).c.h;
                int intValue = ((Integer) pair.first).intValue();
                v.b bVar = (v.b) pair.second;
                bVar.getClass();
                aVar.N(intValue, bVar, (com.amazon.aps.iva.o6.t) obj);
                return;
            case 1:
                z.a aVar2 = (z.a) obj3;
                ((com.amazon.aps.iva.o6.z) obj2).Y(aVar2.a, aVar2.b, (com.amazon.aps.iva.o6.t) obj);
                return;
            case 2:
                com.amazon.aps.iva.ud.d0 d0Var = (com.amazon.aps.iva.ud.d0) obj3;
                com.amazon.aps.iva.q4.c cVar = (com.amazon.aps.iva.q4.c) obj2;
                Context context = (Context) obj;
                com.amazon.aps.iva.yb0.j.f(d0Var, "this$0");
                com.amazon.aps.iva.yb0.j.f(cVar, "$parameters");
                com.amazon.aps.iva.yb0.j.f(context, "$context");
                Object b = cVar.b(new c.a("ctaButtonText"));
                com.amazon.aps.iva.yb0.j.c(b);
                com.amazon.aps.iva.e1.d.j(d0Var.b, new com.amazon.aps.iva.ks.a((String) b, null, null, ""), null, 2);
                com.amazon.aps.iva.l9.k c = com.amazon.aps.iva.l9.k.c(context);
                com.amazon.aps.iva.yb0.j.e(c, "getInstance(context)");
                r.a aVar3 = new r.a(TimeUnit.MINUTES);
                com.amazon.aps.iva.k9.e eVar = com.amazon.aps.iva.k9.e.KEEP;
                com.amazon.aps.iva.k9.e eVar2 = com.amazon.aps.iva.k9.e.REPLACE;
                com.amazon.aps.iva.k9.r a = aVar3.a();
                if (eVar2 == eVar) {
                    fVar = com.amazon.aps.iva.k9.f.KEEP;
                } else {
                    fVar = com.amazon.aps.iva.k9.f.REPLACE;
                }
                new com.amazon.aps.iva.l9.g(c, "ContinueWatchingWorker", fVar, Collections.singletonList(a)).a();
                return;
            default:
                com.amazon.aps.iva.ln.b bVar2 = (com.amazon.aps.iva.ln.b) obj3;
                com.amazon.aps.iva.xb0.a aVar4 = (com.amazon.aps.iva.xb0.a) obj;
                com.amazon.aps.iva.yb0.j.f(bVar2, "this$0");
                com.amazon.aps.iva.yb0.j.f(aVar4, "$onComplete");
                Intent intent = new Intent(bVar2.a, bVar2.c);
                intent.setData(Uri.parse(((com.amazon.aps.iva.na0.c) obj2).a));
                bVar2.b.f(new com.amazon.aps.iva.ln.a(intent, aVar4, bVar2));
                return;
        }
    }
}
