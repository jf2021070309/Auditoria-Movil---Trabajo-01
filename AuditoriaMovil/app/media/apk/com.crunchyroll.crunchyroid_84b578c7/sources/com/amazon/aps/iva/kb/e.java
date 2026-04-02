package com.amazon.aps.iva.kb;
/* compiled from: CriteriaDownLayouterFinished.java */
/* loaded from: classes.dex */
public final class e implements i {
    public boolean b;

    @Override // com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        boolean z;
        if (!this.b && aVar.f < aVar.c()) {
            z = false;
        } else {
            z = true;
        }
        this.b = z;
        return z;
    }
}
