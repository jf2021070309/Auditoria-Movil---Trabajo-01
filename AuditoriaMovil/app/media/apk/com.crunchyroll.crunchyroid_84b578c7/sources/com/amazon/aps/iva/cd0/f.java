package com.amazon.aps.iva.cd0;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.g1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.ee0.x;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: RawProjectionComputer.kt */
/* loaded from: classes4.dex */
public final class f extends w {

    /* compiled from: RawProjectionComputer.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Override // com.amazon.aps.iva.e.w
    public final j1 t(y0 y0Var, x xVar, g1 g1Var, e0 e0Var) {
        j.f(xVar, "typeAttr");
        j.f(g1Var, "typeParameterUpperBoundEraser");
        j.f(e0Var, "erasedUpperBound");
        if (!(xVar instanceof com.amazon.aps.iva.cd0.a)) {
            return super.t(y0Var, xVar, g1Var, e0Var);
        }
        com.amazon.aps.iva.cd0.a aVar = (com.amazon.aps.iva.cd0.a) xVar;
        if (!aVar.d) {
            aVar = aVar.f(b.INFLEXIBLE);
        }
        int i = a.a[aVar.c.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new com.amazon.aps.iva.kb0.h();
            }
            if (!y0Var.i().getAllowsOutPosition()) {
                return new l1(com.amazon.aps.iva.ud0.b.e(y0Var).o(), v1.INVARIANT);
            }
            List<y0> parameters = e0Var.I0().getParameters();
            j.e(parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                return new l1(e0Var, v1.OUT_VARIANCE);
            }
            return s1.n(y0Var, aVar);
        }
        return new l1(e0Var, v1.INVARIANT);
    }
}
