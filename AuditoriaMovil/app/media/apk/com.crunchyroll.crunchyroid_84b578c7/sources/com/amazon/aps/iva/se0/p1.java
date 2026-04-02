package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.xe0.h;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes4.dex */
public final class p1 extends h.a {
    public final /* synthetic */ o1 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.amazon.aps.iva.xe0.h hVar, o1 o1Var, Object obj) {
        super(hVar);
        this.d = o1Var;
        this.e = obj;
    }

    @Override // com.amazon.aps.iva.xe0.a
    public final com.amazon.aps.iva.xe0.s c(Object obj) {
        boolean z;
        com.amazon.aps.iva.xe0.h hVar = (com.amazon.aps.iva.xe0.h) obj;
        if (this.d.b0() == this.e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return com.amazon.aps.iva.a0.k.k;
    }
}
