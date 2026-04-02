package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.ke0.f;
/* compiled from: modifierChecks.kt */
/* loaded from: classes4.dex */
public abstract class w implements f {
    public final String a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w {
        public final int b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "must have at least "
                java.lang.String r1 = " value parameter"
                java.lang.StringBuilder r0 = com.amazon.aps.iva.e4.e.d(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto Le
                java.lang.String r1 = "s"
                goto L10
            Le:
                java.lang.String r1 = ""
            L10:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ke0.w.a.<init>(int):void");
        }

        @Override // com.amazon.aps.iva.ke0.f
        public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
            com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
            if (vVar.f().size() >= this.b) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w {
        public final int b;

        public b() {
            super("must have exactly 2 value parameters");
            this.b = 2;
        }

        @Override // com.amazon.aps.iva.ke0.f
        public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
            com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
            if (vVar.f().size() == this.b) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w {
        public static final c b = new c();

        public c() {
            super("must have no value parameters");
        }

        @Override // com.amazon.aps.iva.ke0.f
        public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
            com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
            return vVar.f().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w {
        public static final d b = new d();

        public d() {
            super("must have a single value parameter");
        }

        @Override // com.amazon.aps.iva.ke0.f
        public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
            com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
            if (vVar.f().size() == 1) {
                return true;
            }
            return false;
        }
    }

    public w(String str) {
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
