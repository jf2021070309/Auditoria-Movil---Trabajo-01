package com.amazon.aps.iva.n2;

import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.s0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.f1.x0;
/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes.dex */
public interface k {

    /* compiled from: TextForegroundStyle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static k a(float f, s sVar) {
            boolean z;
            b bVar = b.a;
            if (sVar != null) {
                if (sVar instanceof x0) {
                    boolean isNaN = Float.isNaN(f);
                    long j = ((x0) sVar).a;
                    if (!isNaN && f < 1.0f) {
                        j = x.b(j, x.d(j) * f);
                    }
                    if (j != x.g) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return new com.amazon.aps.iva.n2.c(j);
                    }
                    return bVar;
                } else if (sVar instanceof s0) {
                    return new com.amazon.aps.iva.n2.b((s0) sVar, f);
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            }
            return bVar;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    /* loaded from: classes.dex */
    public static final class b implements k {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.n2.k
        public final float a() {
            return Float.NaN;
        }

        @Override // com.amazon.aps.iva.n2.k
        public final long b() {
            int i = x.h;
            return x.g;
        }

        @Override // com.amazon.aps.iva.n2.k
        public final s d() {
            return null;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Float invoke() {
            return Float.valueOf(k.this.a());
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k invoke() {
            return k.this;
        }
    }

    float a();

    long b();

    default k c(com.amazon.aps.iva.xb0.a<? extends k> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "other");
        if (!com.amazon.aps.iva.yb0.j.a(this, b.a)) {
            return this;
        }
        return aVar.invoke();
    }

    s d();

    default k e(k kVar) {
        boolean z = kVar instanceof com.amazon.aps.iva.n2.b;
        if (z && (this instanceof com.amazon.aps.iva.n2.b)) {
            com.amazon.aps.iva.n2.b bVar = (com.amazon.aps.iva.n2.b) kVar;
            float a2 = kVar.a();
            c cVar = new c();
            if (Float.isNaN(a2)) {
                a2 = ((Number) cVar.invoke()).floatValue();
            }
            return new com.amazon.aps.iva.n2.b(bVar.a, a2);
        } else if (!z || (this instanceof com.amazon.aps.iva.n2.b)) {
            if (!z && (this instanceof com.amazon.aps.iva.n2.b)) {
                return this;
            }
            return kVar.c(new d());
        } else {
            return kVar;
        }
    }
}
