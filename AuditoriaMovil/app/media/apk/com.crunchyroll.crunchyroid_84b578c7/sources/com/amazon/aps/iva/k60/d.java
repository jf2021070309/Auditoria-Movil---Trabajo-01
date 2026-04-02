package com.amazon.aps.iva.k60;

import android.view.ViewGroup;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ErrorOverlay.kt */
/* loaded from: classes2.dex */
public final class d extends l implements p<i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Integer j;
    public final /* synthetic */ int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> o;
    public final /* synthetic */ ViewGroup p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, int i2, long j, long j2, ViewGroup viewGroup, Integer num, Integer num2, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(2);
        this.h = aVar;
        this.i = i;
        this.j = num;
        this.k = i2;
        this.l = j;
        this.m = j2;
        this.n = num2;
        this.o = aVar2;
        this.p = viewGroup;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.xb0.a<q> aVar = this.h;
            int i = this.i;
            Integer num2 = this.j;
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 1305441922, new c(i, this.k, this.l, this.m, this.p, num2, this.n, aVar, this.o)), iVar2, 6);
        }
        return q.a;
    }
}
