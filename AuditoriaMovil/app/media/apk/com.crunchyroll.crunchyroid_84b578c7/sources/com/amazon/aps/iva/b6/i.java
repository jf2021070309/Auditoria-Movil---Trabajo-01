package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.t5.o;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements o.a, p1.e {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2 = com.amazon.aps.iva.b8.p1.i;
        tVar.c.getClass();
        ListenableFuture d = q.a.d();
        com.amazon.aps.iva.cq.b.B(d, "Callback.onCustomCommandOnHandler must return non-null future");
        return d;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((b) obj).getClass();
                return;
            default:
                ((b) obj).D((b.a) this.c, (com.amazon.aps.iva.q5.f) this.d);
                return;
        }
    }
}
