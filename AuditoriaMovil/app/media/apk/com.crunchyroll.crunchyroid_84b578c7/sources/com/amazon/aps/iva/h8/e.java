package com.amazon.aps.iva.h8;

import com.amazon.aps.iva.g8.g0;
import com.amazon.aps.iva.g8.o0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.g8.u0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.r;
import com.amazon.aps.iva.y.t0;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ComposeNavigator.kt */
@r0.b("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/h8/e;", "Lcom/amazon/aps/iva/g8/r0;", "Lcom/amazon/aps/iva/h8/e$a;", "<init>", "()V", "a", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class e extends r0<a> {
    public final y1 c = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);

    /* compiled from: ComposeNavigator.kt */
    /* loaded from: classes.dex */
    public static final class a extends g0 {
        public final r<com.amazon.aps.iva.y.o, com.amazon.aps.iva.g8.f, com.amazon.aps.iva.o0.i, Integer, q> k;
        public com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.r0> l;
        public com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> m;
        public com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.r0> n;
        public com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> o;

        public a(e eVar, com.amazon.aps.iva.v0.a aVar) {
            super(eVar);
            this.k = aVar;
        }
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final a a() {
        return new a(this, b.a);
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final void d(List<com.amazon.aps.iva.g8.f> list, o0 o0Var, r0.a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        for (com.amazon.aps.iva.g8.f fVar : list) {
            u0 b = b();
            com.amazon.aps.iva.yb0.j.f(fVar, "backStackEntry");
            v0 v0Var = b.c;
            Iterable<com.amazon.aps.iva.g8.f> iterable = (Iterable) v0Var.getValue();
            boolean z4 = true;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (com.amazon.aps.iva.g8.f fVar2 : iterable) {
                    if (fVar2 == fVar) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            i0 i0Var = b.e;
            if (z2) {
                Iterable<com.amazon.aps.iva.g8.f> iterable2 = (Iterable) i0Var.getValue();
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    for (com.amazon.aps.iva.g8.f fVar3 : iterable2) {
                        if (fVar3 == fVar) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            break;
                        }
                    }
                }
                z4 = false;
                if (z4) {
                }
            }
            com.amazon.aps.iva.g8.f fVar4 = (com.amazon.aps.iva.g8.f) x.E0((List) i0Var.getValue());
            if (fVar4 != null) {
                v0Var.setValue(m0.R((Set) v0Var.getValue(), fVar4));
            }
            v0Var.setValue(m0.R((Set) v0Var.getValue(), fVar));
            b.e(fVar);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final void e(com.amazon.aps.iva.g8.f fVar, boolean z) {
        b().d(fVar, z);
        this.c.setValue(Boolean.TRUE);
    }
}
