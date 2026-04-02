package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.s1.u0;
import java.util.List;
/* compiled from: LazyList.kt */
/* loaded from: classes.dex */
public final class w extends d0 {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ com.amazon.aps.iva.f0.v e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ a.b h;
    public final /* synthetic */ a.c i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j, boolean z, p pVar, com.amazon.aps.iva.f0.v vVar, int i, int i2, a.b bVar, a.c cVar, boolean z2, int i3, int i4, long j2) {
        super(j, z, pVar, vVar);
        this.d = z;
        this.e = vVar;
        this.f = i;
        this.g = i2;
        this.h = bVar;
        this.i = cVar;
        this.j = z2;
        this.k = i3;
        this.l = i4;
        this.m = j2;
    }

    @Override // com.amazon.aps.iva.e0.d0
    public final c0 a(int i, Object obj, Object obj2, List<? extends u0> list) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        com.amazon.aps.iva.yb0.j.f(list, "placeables");
        if (i == this.f - 1) {
            i2 = 0;
        } else {
            i2 = this.g;
        }
        return new c0(i, list, this.d, this.h, this.i, this.e.getLayoutDirection(), this.j, this.k, this.l, i2, this.m, obj, obj2);
    }
}
