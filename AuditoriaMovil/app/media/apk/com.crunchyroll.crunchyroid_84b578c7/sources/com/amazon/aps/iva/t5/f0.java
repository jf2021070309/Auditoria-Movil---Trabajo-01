package com.amazon.aps.iva.t5;

import android.content.Context;
import com.amazon.aps.iva.q4.c;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f0(Object obj, int i, Object obj2, Object obj3) {
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
                SettableFuture settableFuture = (SettableFuture) obj2;
                try {
                    try {
                        settableFuture.setFuture(((AsyncFunction) obj).apply(Futures.getDone((ListenableFuture) obj3)));
                        return;
                    } catch (Throwable th) {
                        settableFuture.setException(th);
                        return;
                    }
                } catch (Error e) {
                    e = e;
                    settableFuture.setException(e);
                    return;
                } catch (CancellationException unused) {
                    settableFuture.cancel(false);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    settableFuture.setException(e);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    settableFuture.setException(e);
                    return;
                }
            case 1:
            default:
                ((com.amazon.aps.iva.qa0.e) obj3).c((com.amazon.aps.iva.qa0.b) obj2, (Map) obj);
                return;
            case 2:
                com.amazon.aps.iva.q4.c cVar = (com.amazon.aps.iva.q4.c) obj3;
                com.amazon.aps.iva.ud.n nVar = (com.amazon.aps.iva.ud.n) obj2;
                Context context = (Context) obj;
                com.amazon.aps.iva.yb0.j.f(cVar, "$parameters");
                com.amazon.aps.iva.yb0.j.f(nVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(context, "$context");
                Object b = cVar.b(new c.a("uiModel"));
                com.amazon.aps.iva.yb0.j.c(b);
                com.amazon.aps.iva.sd.a aVar = (com.amazon.aps.iva.sd.a) b;
                com.amazon.aps.iva.e1.d.j(nVar.b, null, aVar, 1);
                com.amazon.aps.iva.rd.e eVar = com.amazon.aps.iva.gd0.j.e;
                if (eVar != null) {
                    eVar.b().b(context, aVar.b);
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
        }
    }
}
