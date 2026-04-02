package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.t5.o;
import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements o.a, p1.e {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, long j, b.a aVar) {
        this.d = aVar;
        this.c = j;
        this.b = i;
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2;
        long j;
        List list = (List) this.d;
        int i3 = com.amazon.aps.iva.b8.p1.i;
        int i4 = this.b;
        if (i4 == -1) {
            i2 = tVar.o.K0();
        } else {
            i2 = i4;
        }
        if (i4 == -1) {
            j = tVar.o.a();
        } else {
            j = this.c;
        }
        return tVar.j(list, i2, j);
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((b) obj).getClass();
    }

    public /* synthetic */ c(int i, long j, ImmutableList immutableList) {
        this.d = immutableList;
        this.b = i;
        this.c = j;
    }
}
