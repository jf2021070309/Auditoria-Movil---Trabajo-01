package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.t5.o;
import com.google.common.collect.ImmutableList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements o.a, p1.e {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(Object obj, boolean z) {
        this.c = obj;
        this.b = z;
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int K0;
        long a;
        int i2 = com.amazon.aps.iva.b8.p1.i;
        ImmutableList of = ImmutableList.of((com.amazon.aps.iva.q5.b0) this.c);
        boolean z = this.b;
        if (z) {
            K0 = -1;
        } else {
            K0 = tVar.o.K0();
        }
        if (z) {
            a = -9223372036854775807L;
        } else {
            a = tVar.o.a();
        }
        return tVar.j(of, K0, a);
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((b) obj).f((b.a) this.c, this.b);
    }
}
