package com.amazon.aps.iva.b6;

import android.os.Bundle;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements o.a, m0.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ com.amazon.aps.iva.q5.k d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i0(Object obj, com.amazon.aps.iva.q5.k kVar, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = kVar;
        this.e = obj2;
    }

    @Override // com.amazon.aps.iva.b8.m0.g
    public final void b(q.d dVar) {
        com.amazon.aps.iva.b8.m0 m0Var = (com.amazon.aps.iva.b8.m0) this.c;
        if (((Bundle) this.e) == null) {
            int i = com.amazon.aps.iva.b8.m0.n;
            m0Var.getClass();
            Bundle bundle = Bundle.EMPTY;
        }
        m0Var.b.c.getClass();
        com.amazon.aps.iva.cq.b.B(q.a.d(), "Callback.onCustomCommandOnHandler must return non-null future");
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        com.amazon.aps.iva.q5.k kVar = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                bVar.getClass();
                bVar.A((b.a) obj2, (com.amazon.aps.iva.q5.v) kVar);
                return;
            default:
                b bVar2 = (b) obj;
                bVar2.getClass();
                bVar2.v((b.a) obj2, (com.amazon.aps.iva.q5.v) kVar);
                return;
        }
    }
}
