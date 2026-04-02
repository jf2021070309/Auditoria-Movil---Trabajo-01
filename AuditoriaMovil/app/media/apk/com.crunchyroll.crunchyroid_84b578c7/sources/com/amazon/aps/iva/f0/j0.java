package com.amazon.aps.iva.f0;
/* compiled from: LazyLayoutSemantics.kt */
/* loaded from: classes.dex */
public final class j0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, Integer> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<p> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.amazon.aps.iva.fc0.m mVar) {
        super(1);
        this.h = mVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Integer invoke(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "needle");
        p invoke = this.h.invoke();
        int b = invoke.b();
        int i = 0;
        while (true) {
            if (i < b) {
                if (com.amazon.aps.iva.yb0.j.a(invoke.getKey(i), obj)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return Integer.valueOf(i);
    }
}
