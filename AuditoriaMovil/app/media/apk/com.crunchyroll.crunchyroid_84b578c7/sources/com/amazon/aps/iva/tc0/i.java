package com.amazon.aps.iva.tc0;

import com.amazon.aps.iva.ed0.l;
import com.amazon.aps.iva.uc0.v;
import com.amazon.aps.iva.yb0.j;
/* compiled from: RuntimeSourceElementFactory.kt */
/* loaded from: classes4.dex */
public final class i implements com.amazon.aps.iva.dd0.b {
    public static final i a = new i();

    @Override // com.amazon.aps.iva.dd0.b
    public final a a(l lVar) {
        j.f(lVar, "javaElement");
        return new a((v) lVar);
    }

    /* compiled from: RuntimeSourceElementFactory.kt */
    /* loaded from: classes4.dex */
    public static final class a implements com.amazon.aps.iva.dd0.a {
        public final v b;

        public a(v vVar) {
            j.f(vVar, "javaElement");
            this.b = vVar;
        }

        @Override // com.amazon.aps.iva.dd0.a
        public final v c() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            com.amazon.aps.iva.b8.i.d(a.class, sb, ": ");
            sb.append(this.b);
            return sb.toString();
        }

        @Override // com.amazon.aps.iva.oc0.t0
        public final void b() {
        }
    }
}
