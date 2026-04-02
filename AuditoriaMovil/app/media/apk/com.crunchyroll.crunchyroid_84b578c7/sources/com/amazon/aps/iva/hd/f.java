package com.amazon.aps.iva.hd;
/* compiled from: GlideSuppliers.java */
/* loaded from: classes.dex */
public final class f implements g<Object> {
    public volatile Object a;
    public final /* synthetic */ g b;

    public f(g gVar) {
        this.b = gVar;
    }

    @Override // com.amazon.aps.iva.hd.g
    public final Object get() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b.get();
                    defpackage.i.l(obj);
                    this.a = obj;
                }
            }
        }
        return this.a;
    }
}
