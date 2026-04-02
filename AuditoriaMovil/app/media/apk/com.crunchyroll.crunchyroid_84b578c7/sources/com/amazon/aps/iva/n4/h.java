package com.amazon.aps.iva.n4;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.d;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q4.c;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(Object obj, int i, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                androidx.fragment.app.d dVar = (androidx.fragment.app.d) obj3;
                d.a aVar = (d.a) obj;
                com.amazon.aps.iva.yb0.j.f(dVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(aVar, "$animationInfo");
                dVar.a.endViewTransition((View) obj2);
                aVar.a();
                return;
            case 1:
                SettableFuture settableFuture = (SettableFuture) obj3;
                Runnable runnable = (Runnable) obj2;
                int i2 = com.amazon.aps.iva.t5.g0.a;
                try {
                    if (!settableFuture.isCancelled()) {
                        runnable.run();
                        settableFuture.set(obj);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    settableFuture.setException(th);
                    return;
                }
            case 2:
                Pair pair = (Pair) obj2;
                ((j1.a) obj3).c.h.S(((Integer) pair.first).intValue(), (v.b) pair.second, (Exception) obj);
                return;
            case 3:
                v.b bVar = (v.b) obj2;
                com.amazon.aps.iva.p6.b bVar2 = com.amazon.aps.iva.p6.b.this;
                bVar2.n.c(bVar2, bVar.b, bVar.c, (IOException) obj);
                return;
            default:
                com.amazon.aps.iva.ud.b0 b0Var = (com.amazon.aps.iva.ud.b0) obj3;
                com.amazon.aps.iva.q4.c cVar = (com.amazon.aps.iva.q4.c) obj2;
                Context context = (Context) obj;
                com.amazon.aps.iva.yb0.j.f(b0Var, "this$0");
                com.amazon.aps.iva.yb0.j.f(cVar, "$parameters");
                com.amazon.aps.iva.yb0.j.f(context, "$context");
                Object b = cVar.b(new c.a("ctaButtonText"));
                com.amazon.aps.iva.yb0.j.c(b);
                com.amazon.aps.iva.e1.d.j(b0Var.b, new com.amazon.aps.iva.ks.a((String) b, null, null, ""), null, 2);
                com.amazon.aps.iva.rd.e eVar = com.amazon.aps.iva.gd0.j.e;
                if (eVar != null) {
                    eVar.b().c(context);
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
        }
    }
}
