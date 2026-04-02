package com.amazon.aps.iva.a6;

import android.util.Pair;
import com.amazon.aps.iva.o6.v;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj3;
                j1.this.h.U(((Integer) pair.first).intValue(), (v.b) pair.second, (com.amazon.aps.iva.o6.q) obj2, (com.amazon.aps.iva.o6.t) obj);
                return;
            default:
                SettableFuture settableFuture = (SettableFuture) obj3;
                com.amazon.aps.iva.t5.g gVar = (com.amazon.aps.iva.t5.g) obj2;
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                int i2 = com.amazon.aps.iva.b8.p1.i;
                if (((com.amazon.aps.iva.b8.t) obj4).g()) {
                    settableFuture.set(null);
                    return;
                }
                try {
                    gVar.a(listenableFuture);
                    settableFuture.set(null);
                    return;
                } catch (Throwable th) {
                    settableFuture.setException(th);
                    return;
                }
        }
    }
}
