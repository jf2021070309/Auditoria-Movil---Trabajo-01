package com.amazon.aps.iva.pd0;
/* compiled from: Delegates.kt */
/* loaded from: classes4.dex */
public final class l extends com.amazon.aps.iva.bc0.a<Object> {
    public final /* synthetic */ k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object obj, k kVar) {
        super(obj);
        this.b = kVar;
    }

    @Override // com.amazon.aps.iva.bc0.a
    public final void b(com.amazon.aps.iva.fc0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        if (!this.b.a) {
            return;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }
}
