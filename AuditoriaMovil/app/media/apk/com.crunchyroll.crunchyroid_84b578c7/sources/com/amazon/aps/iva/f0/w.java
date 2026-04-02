package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.s1.f1;
import com.amazon.aps.iva.s1.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LazyLayoutMeasureScope.kt */
/* loaded from: classes.dex */
public final class w implements v, com.amazon.aps.iva.s1.f0 {
    public final m b;
    public final f1 c;
    public final p d;
    public final HashMap<Integer, List<com.amazon.aps.iva.s1.u0>> e;

    public w(m mVar, f1 f1Var) {
        com.amazon.aps.iva.yb0.j.f(mVar, "itemContentFactory");
        com.amazon.aps.iva.yb0.j.f(f1Var, "subcomposeMeasureScope");
        this.b = mVar;
        this.c = f1Var;
        this.d = mVar.b.invoke();
        this.e = new HashMap<>();
    }

    @Override // com.amazon.aps.iva.s1.f0
    public final com.amazon.aps.iva.s1.e0 F0(int i, int i2, Map<com.amazon.aps.iva.s1.a, Integer> map, com.amazon.aps.iva.xb0.l<? super u0.a, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(map, "alignmentLines");
        com.amazon.aps.iva.yb0.j.f(lVar, "placementBlock");
        return this.c.F0(i, i2, map, lVar);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float I0(int i) {
        return this.c.I0(i);
    }

    @Override // com.amazon.aps.iva.f0.v
    public final List<com.amazon.aps.iva.s1.u0> O(int i, long j) {
        HashMap<Integer, List<com.amazon.aps.iva.s1.u0>> hashMap = this.e;
        List<com.amazon.aps.iva.s1.u0> list = hashMap.get(Integer.valueOf(i));
        if (list == null) {
            p pVar = this.d;
            Object key = pVar.getKey(i);
            List<com.amazon.aps.iva.s1.c0> m = this.c.m(key, this.b.a(i, key, pVar.c(i)));
            int size = m.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(m.get(i2).V(j));
            }
            hashMap.put(Integer.valueOf(i), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return this.c.O0();
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float P0(float f) {
        return this.c.P0(f);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final int T0(long j) {
        return this.c.T0(j);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final long b1(long j) {
        return this.c.b1(j);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final int f0(float f) {
        return this.c.f0(f);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return this.c.getDensity();
    }

    @Override // com.amazon.aps.iva.s1.m
    public final com.amazon.aps.iva.o2.l getLayoutDirection() {
        return this.c.getLayoutDirection();
    }

    @Override // com.amazon.aps.iva.f0.v, com.amazon.aps.iva.o2.c
    public final long j(long j) {
        return this.c.j(j);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float l0(long j) {
        return this.c.l0(j);
    }

    @Override // com.amazon.aps.iva.f0.v, com.amazon.aps.iva.o2.c
    public final float x(float f) {
        return this.c.x(f);
    }
}
