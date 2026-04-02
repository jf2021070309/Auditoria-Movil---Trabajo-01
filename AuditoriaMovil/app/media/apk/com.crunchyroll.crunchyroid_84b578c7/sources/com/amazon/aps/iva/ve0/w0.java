package com.amazon.aps.iva.ve0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: StateFlow.kt */
/* loaded from: classes4.dex */
public final class w0 extends com.amazon.aps.iva.we0.c<v0<?>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // com.amazon.aps.iva.we0.c
    public final boolean a(com.amazon.aps.iva.we0.b bVar) {
        v0 v0Var = (v0) bVar;
        if (this._state != null) {
            return false;
        }
        this._state = com.amazon.aps.iva.ab.x.c;
        return true;
    }

    @Override // com.amazon.aps.iva.we0.c
    public final com.amazon.aps.iva.ob0.d[] b(com.amazon.aps.iva.we0.b bVar) {
        v0 v0Var = (v0) bVar;
        this._state = null;
        return com.amazon.aps.iva.da0.a.b;
    }
}
