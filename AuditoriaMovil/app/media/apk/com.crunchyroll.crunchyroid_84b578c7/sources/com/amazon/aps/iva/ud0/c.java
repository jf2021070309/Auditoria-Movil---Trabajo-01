package com.amazon.aps.iva.ud0;

import com.amazon.aps.iva.me0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DescriptorUtils.kt */
/* loaded from: classes4.dex */
public final class c extends a.b<com.amazon.aps.iva.oc0.b, com.amazon.aps.iva.oc0.b> {
    public final /* synthetic */ d0<com.amazon.aps.iva.oc0.b> a;
    public final /* synthetic */ l<com.amazon.aps.iva.oc0.b, Boolean> b;

    public c(l lVar, d0 d0Var) {
        this.a = d0Var;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.me0.a.d
    public final Object a() {
        return this.a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.oc0.b, T, java.lang.Object] */
    @Override // com.amazon.aps.iva.me0.a.b, com.amazon.aps.iva.me0.a.d
    public final void b(Object obj) {
        ?? r3 = (com.amazon.aps.iva.oc0.b) obj;
        j.f(r3, "current");
        d0<com.amazon.aps.iva.oc0.b> d0Var = this.a;
        if (d0Var.b == null && ((Boolean) this.b.invoke(r3)).booleanValue()) {
            d0Var.b = r3;
        }
    }

    @Override // com.amazon.aps.iva.me0.a.d
    public final boolean c(Object obj) {
        j.f((com.amazon.aps.iva.oc0.b) obj, "current");
        if (this.a.b == null) {
            return true;
        }
        return false;
    }
}
