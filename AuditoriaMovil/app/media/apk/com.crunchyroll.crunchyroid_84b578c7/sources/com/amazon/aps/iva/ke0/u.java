package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ke0.f;
/* compiled from: modifierChecks.kt */
/* loaded from: classes4.dex */
public abstract class u implements f {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.lc0.k, e0> a;
    public final String b;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class a extends u {
        public static final a c = new a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: com.amazon.aps.iva.ke0.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0444a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.lc0.k, e0> {
            public static final C0444a h = new C0444a();

            public C0444a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final e0 invoke(com.amazon.aps.iva.lc0.k kVar) {
                com.amazon.aps.iva.lc0.k kVar2 = kVar;
                com.amazon.aps.iva.yb0.j.f(kVar2, "$this$null");
                m0 t = kVar2.t(com.amazon.aps.iva.lc0.l.BOOLEAN);
                if (t != null) {
                    return t;
                }
                com.amazon.aps.iva.lc0.k.a(63);
                throw null;
            }
        }

        public a() {
            super("Boolean", C0444a.h);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class b extends u {
        public static final b c = new b();

        /* compiled from: modifierChecks.kt */
        /* loaded from: classes4.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.lc0.k, e0> {
            public static final a h = new a();

            public a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final e0 invoke(com.amazon.aps.iva.lc0.k kVar) {
                com.amazon.aps.iva.lc0.k kVar2 = kVar;
                com.amazon.aps.iva.yb0.j.f(kVar2, "$this$null");
                m0 t = kVar2.t(com.amazon.aps.iva.lc0.l.INT);
                if (t != null) {
                    return t;
                }
                com.amazon.aps.iva.lc0.k.a(58);
                throw null;
            }
        }

        public b() {
            super("Int", a.h);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class c extends u {
        public static final c c = new c();

        /* compiled from: modifierChecks.kt */
        /* loaded from: classes4.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.lc0.k, e0> {
            public static final a h = new a();

            public a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final e0 invoke(com.amazon.aps.iva.lc0.k kVar) {
                com.amazon.aps.iva.lc0.k kVar2 = kVar;
                com.amazon.aps.iva.yb0.j.f(kVar2, "$this$null");
                m0 x = kVar2.x();
                com.amazon.aps.iva.yb0.j.e(x, "unitType");
                return x;
            }
        }

        public c() {
            super("Unit", a.h);
        }
    }

    public u(String str, com.amazon.aps.iva.xb0.l lVar) {
        this.a = lVar;
        this.b = "must return ".concat(str);
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final String a(com.amazon.aps.iva.oc0.v vVar) {
        return f.a.a(this, vVar);
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
        com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
        return com.amazon.aps.iva.yb0.j.a(vVar.getReturnType(), this.a.invoke(com.amazon.aps.iva.ud0.b.e(vVar)));
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final String getDescription() {
        return this.b;
    }
}
