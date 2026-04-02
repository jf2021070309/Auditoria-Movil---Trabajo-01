package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.ee0.b1;
import com.amazon.aps.iva.ee0.e0;
/* compiled from: OverridingUtilTypeSystemContext.kt */
/* loaded from: classes4.dex */
public final class s extends b1 {
    public final /* synthetic */ t i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, com.amazon.aps.iva.fe0.e eVar, com.amazon.aps.iva.fe0.f fVar) {
        super(true, true, tVar, eVar, fVar);
        this.i = tVar;
    }

    @Override // com.amazon.aps.iva.ee0.b1
    public final boolean b(com.amazon.aps.iva.he0.h hVar, com.amazon.aps.iva.he0.h hVar2) {
        com.amazon.aps.iva.yb0.j.f(hVar, "subType");
        com.amazon.aps.iva.yb0.j.f(hVar2, "superType");
        if (hVar instanceof e0) {
            if (hVar2 instanceof e0) {
                return this.i.e.invoke(hVar, hVar2).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
