package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.xe0.h;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes4.dex */
public final class c extends h.a {
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x xVar, b bVar) {
        super(xVar);
        this.d = bVar;
    }

    @Override // com.amazon.aps.iva.xe0.a
    public final com.amazon.aps.iva.xe0.s c(Object obj) {
        com.amazon.aps.iva.xe0.h hVar = (com.amazon.aps.iva.xe0.h) obj;
        if (this.d.l()) {
            return null;
        }
        return com.amazon.aps.iva.a0.k.k;
    }
}
