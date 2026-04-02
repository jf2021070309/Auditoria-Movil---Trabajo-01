package com.amazon.aps.iva.up;

import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.Set;
/* compiled from: ConsentAwareFileOrchestrator.kt */
/* loaded from: classes2.dex */
public class b implements m, com.amazon.aps.iva.rq.b {
    public static final n e = new n();
    public final m b;
    public final m c;
    public m d;

    /* compiled from: ConsentAwareFileOrchestrator.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.rq.a.values().length];
            iArr[com.amazon.aps.iva.rq.a.PENDING.ordinal()] = 1;
            iArr[com.amazon.aps.iva.rq.a.GRANTED.ordinal()] = 2;
            iArr[com.amazon.aps.iva.rq.a.NOT_GRANTED.ordinal()] = 3;
            a = iArr;
        }
    }

    public b(com.amazon.aps.iva.xp.a aVar, m mVar, m mVar2, com.amazon.aps.iva.up.a aVar2) {
        j.f(aVar, "consentProvider");
        this.b = mVar;
        this.c = mVar2;
        com.amazon.aps.iva.rq.a f = aVar.f();
        m e2 = e(null);
        m e3 = e(f);
        aVar2.a(e2, f, e3);
        this.d = e3;
        aVar.d(this);
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File b() {
        return null;
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File c(int i) {
        m mVar = this.d;
        if (mVar != null) {
            return mVar.c(i);
        }
        j.m("delegateOrchestrator");
        throw null;
    }

    public final m e(com.amazon.aps.iva.rq.a aVar) {
        int i;
        if (aVar == null) {
            i = -1;
        } else {
            i = a.a[aVar.ordinal()];
        }
        if (i != -1 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return e;
                }
                throw new h();
            }
            return this.c;
        }
        return this.b;
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File h(Set<? extends File> set) {
        return this.c.h(set);
    }
}
