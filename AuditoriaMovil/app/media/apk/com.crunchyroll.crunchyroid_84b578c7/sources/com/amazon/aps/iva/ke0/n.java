package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.ke0.f;
/* compiled from: modifierChecks.kt */
/* loaded from: classes4.dex */
public abstract class n implements f {
    public final String a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class a extends n {
        public static final a b = new a();

        public a() {
            super("must be a member function");
        }

        @Override // com.amazon.aps.iva.ke0.f
        public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
            com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
            if (vVar.J() != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class b extends n {
        public static final b b = new b();

        public b() {
            super("must be a member or an extension function");
        }

        @Override // com.amazon.aps.iva.ke0.f
        public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
            com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
            if (vVar.J() == null && vVar.M() == null) {
                return false;
            }
            return true;
        }
    }

    public n(String str) {
        this.a = str;
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final String a(com.amazon.aps.iva.oc0.v vVar) {
        return f.a.a(this, vVar);
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final String getDescription() {
        return this.a;
    }
}
