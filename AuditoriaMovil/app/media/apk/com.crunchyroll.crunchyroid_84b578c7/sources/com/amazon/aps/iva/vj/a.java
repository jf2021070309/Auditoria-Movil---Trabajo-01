package com.amazon.aps.iva.vj;
/* compiled from: DaggerExoplayerComponentGraph.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.jb0.a<com.amazon.aps.iva.zj.a> {
    public final com.amazon.aps.iva.wj.a a;

    public a(com.amazon.aps.iva.wj.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.jb0.a
    public final com.amazon.aps.iva.zj.a get() {
        com.amazon.aps.iva.lj.a b = this.a.b();
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
