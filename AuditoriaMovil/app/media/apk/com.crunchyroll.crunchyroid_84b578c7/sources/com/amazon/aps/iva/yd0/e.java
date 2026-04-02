package com.amazon.aps.iva.yd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
/* compiled from: ImplicitClassReceiver.kt */
/* loaded from: classes4.dex */
public final class e implements g, i {
    public final com.amazon.aps.iva.oc0.e a;
    public final com.amazon.aps.iva.oc0.e b;

    public e(com.amazon.aps.iva.rc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "classDescriptor");
        this.a = bVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        e eVar;
        com.amazon.aps.iva.oc0.e eVar2 = null;
        if (obj instanceof e) {
            eVar = (e) obj;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar2 = eVar.a;
        }
        return com.amazon.aps.iva.yb0.j.a(this.a, eVar2);
    }

    @Override // com.amazon.aps.iva.yd0.g
    public final e0 getType() {
        m0 m = this.a.m();
        com.amazon.aps.iva.yb0.j.e(m, "classDescriptor.defaultType");
        return m;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.amazon.aps.iva.yd0.i
    public final com.amazon.aps.iva.oc0.e q() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        m0 m = this.a.m();
        com.amazon.aps.iva.yb0.j.e(m, "classDescriptor.defaultType");
        sb.append(m);
        sb.append('}');
        return sb.toString();
    }
}
