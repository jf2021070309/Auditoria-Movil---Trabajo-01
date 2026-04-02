package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.rc0.g0;
import com.amazon.aps.iva.yb0.e0;
/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes4.dex */
public final class g extends com.amazon.aps.iva.lc0.k {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] h = {e0.c(new com.amazon.aps.iva.yb0.v(e0.a(g.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    public com.amazon.aps.iva.xb0.a<b> f;
    public final com.amazon.aps.iva.de0.i g;

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes4.dex */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes4.dex */
    public static final class b {
        public final c0 a;
        public final boolean b;

        public b(c0 c0Var, boolean z) {
            com.amazon.aps.iva.yb0.j.f(c0Var, "ownerModuleDescriptor");
            this.a = c0Var;
            this.b = z;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.de0.c cVar, a aVar) {
        super(cVar);
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        this.g = cVar.g(new i(this, cVar));
        int i = c.a[aVar.ordinal()];
        if (i != 2) {
            if (i == 3) {
                d(true);
                return;
            }
            return;
        }
        d(false);
    }

    public final k M() {
        return (k) x.T(this.g, h[0]);
    }

    @Override // com.amazon.aps.iva.lc0.k
    public final com.amazon.aps.iva.qc0.a e() {
        return M();
    }

    @Override // com.amazon.aps.iva.lc0.k
    public final Iterable m() {
        Iterable<com.amazon.aps.iva.qc0.b> m = super.m();
        com.amazon.aps.iva.de0.l lVar = this.d;
        if (lVar != null) {
            g0 l = l();
            com.amazon.aps.iva.yb0.j.e(l, "builtInsModule");
            return com.amazon.aps.iva.lb0.x.K0(m, new e(lVar, l));
        }
        com.amazon.aps.iva.lc0.k.a(6);
        throw null;
    }

    @Override // com.amazon.aps.iva.lc0.k
    public final com.amazon.aps.iva.qc0.c q() {
        return M();
    }
}
