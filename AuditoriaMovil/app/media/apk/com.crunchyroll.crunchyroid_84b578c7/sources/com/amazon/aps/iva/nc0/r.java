package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.oc0.b;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes4.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, Boolean> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.oc0.b bVar) {
        boolean z;
        com.amazon.aps.iva.oc0.b bVar2 = bVar;
        if (bVar2.getKind() == b.a.DECLARATION) {
            w wVar = this.h.b;
            com.amazon.aps.iva.oc0.k d = bVar2.d();
            com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            wVar.getClass();
            String str = c.a;
            if (c.j.containsKey(com.amazon.aps.iva.qd0.i.g((com.amazon.aps.iva.oc0.e) d))) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
