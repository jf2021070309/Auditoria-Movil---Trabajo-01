package com.amazon.aps.iva.vj;
/* compiled from: DaggerExoplayerComponentGraph.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.jb0.a<com.amazon.aps.iva.zj.c> {
    public final com.amazon.aps.iva.wj.a a;

    public b(com.amazon.aps.iva.wj.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.jb0.a
    public final com.amazon.aps.iva.zj.c get() {
        com.amazon.aps.iva.zj.c a = this.a.a();
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
