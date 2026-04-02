package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.lc0.k;
import java.util.EnumMap;
import java.util.HashMap;
/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes4.dex */
public final class h implements com.amazon.aps.iva.xb0.a<k.a> {
    public final /* synthetic */ k b;

    public h(k kVar) {
        this.b = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final k.a invoke() {
        l[] values;
        EnumMap enumMap = new EnumMap(l.class);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (l lVar : l.values()) {
            String b = lVar.getTypeName().b();
            k kVar = this.b;
            m0 b2 = k.b(kVar, b);
            m0 b3 = k.b(kVar, lVar.getArrayTypeName().b());
            enumMap.put((EnumMap) lVar, (l) b3);
            hashMap.put(b2, b3);
            hashMap2.put(b3, b2);
        }
        return new k.a(enumMap, hashMap, hashMap2);
    }
}
