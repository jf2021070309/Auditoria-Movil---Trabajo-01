package com.amazon.aps.iva.f0;

import java.util.HashMap;
import java.util.Map;
/* compiled from: LazyLayoutKeyIndexMap.kt */
/* loaded from: classes.dex */
public final class v0 implements r {
    public final Map<Object, Integer> a;
    public final Object[] b;
    public final int c;

    public v0(com.amazon.aps.iva.ec0.j jVar, com.amazon.aps.iva.e0.i iVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(jVar, "nearestRange");
        com.amazon.aps.iva.yb0.j.f(iVar, "intervalContent");
        int i = jVar.b;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            t0<com.amazon.aps.iva.e0.h> t0Var = iVar.a;
            int min = Math.min(jVar.c, t0Var.b - 1);
            if (min < i) {
                this.a = com.amazon.aps.iva.lb0.a0.b;
                this.b = new Object[0];
                this.c = 0;
                return;
            }
            this.b = new Object[(min - i) + 1];
            this.c = i;
            HashMap hashMap = new HashMap();
            t0Var.b(i, min, new u0(i, min, hashMap, this));
            this.a = hashMap;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // com.amazon.aps.iva.f0.r
    public final int a(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        int i = this.a.get(obj);
        if (i == null) {
            i = -1;
        }
        return i.intValue();
    }

    @Override // com.amazon.aps.iva.f0.r
    public final Object getKey(int i) {
        int i2 = i - this.c;
        if (i2 >= 0) {
            Object[] objArr = this.b;
            com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
            if (i2 <= objArr.length - 1) {
                return objArr[i2];
            }
        }
        return null;
    }
}
