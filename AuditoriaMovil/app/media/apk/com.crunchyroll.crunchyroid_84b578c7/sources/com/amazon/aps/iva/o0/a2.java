package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.e0;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class a2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<HashMap<Object, LinkedHashSet<d1>>> {
    public final /* synthetic */ b2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var) {
        super(0);
        this.h = b2Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final HashMap<Object, LinkedHashSet<d1>> invoke() {
        Object valueOf;
        e0.b bVar = e0.a;
        HashMap<Object, LinkedHashSet<d1>> hashMap = new HashMap<>();
        b2 b2Var = this.h;
        int size = b2Var.a.size();
        for (int i = 0; i < size; i++) {
            d1 d1Var = b2Var.a.get(i);
            Object obj = d1Var.b;
            int i2 = d1Var.a;
            if (obj != null) {
                valueOf = new c1(Integer.valueOf(i2), d1Var.b);
            } else {
                valueOf = Integer.valueOf(i2);
            }
            LinkedHashSet<d1> linkedHashSet = hashMap.get(valueOf);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                hashMap.put(valueOf, linkedHashSet);
            }
            linkedHashSet.add(d1Var);
        }
        return hashMap;
    }
}
