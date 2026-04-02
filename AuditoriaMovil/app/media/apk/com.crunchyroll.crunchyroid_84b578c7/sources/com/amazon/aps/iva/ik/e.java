package com.amazon.aps.iva.ik;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.nk.i;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.s6.w;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.yb0.l;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: QualityTrackSelector.kt */
/* loaded from: classes.dex */
public final class e implements c {
    public final g0<j> b;
    public final g0<i> c;
    public final w d;

    /* compiled from: QualityTrackSelector.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<j, j> {
        public final /* synthetic */ v0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v0 v0Var) {
            super(1);
            this.i = v0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(j jVar) {
            j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            e.this.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            arrayList.add(new com.amazon.aps.iva.ik.a(0));
            UnmodifiableIterator<v0.a> it = this.i.b.iterator();
            while (it.hasNext()) {
                v0.a next = it.next();
                if (next.c.d == 2 && next.g()) {
                    int i2 = i;
                    while (i2 < next.b) {
                        if (next.i(i2)) {
                            v c = next.c(i2);
                            com.amazon.aps.iva.yb0.j.e(c, "trackGroup.getTrackFormat(i)");
                            arrayList.add(new com.amazon.aps.iva.ik.b(c.r, c.s, c.i));
                        }
                        i2++;
                        i = 0;
                    }
                }
            }
            return j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, null, 0, null, null, null, null, x.T0(arrayList, new d()), null, null, null, false, null, null, 4161535);
        }
    }

    /* compiled from: QualityTrackSelector.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<j, j> {
        public final /* synthetic */ f h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(1);
            this.h = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final j invoke(j jVar) {
            j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            return j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, null, 0, null, null, null, this.h, null, null, null, null, false, null, null, 4177919);
        }
    }

    public e(com.amazon.aps.iva.ve0.v0 v0Var, com.amazon.aps.iva.ve0.v0 v0Var2, g gVar) {
        this.b = v0Var;
        this.c = v0Var2;
        this.d = gVar;
    }

    @Override // com.amazon.aps.iva.ik.c
    public final void G(f fVar) {
        i value = this.c.getValue();
        value.getClass();
        value.d = fVar;
        a();
    }

    public final void a() {
        g0<j> g0Var = this.b;
        if (g0Var.getValue().p.isEmpty()) {
            return;
        }
        f fVar = this.c.getValue().d;
        List<? extends f> list = g0Var.getValue().p;
        int abs = Math.abs(((f) x.t0(list)).b() - fVar.b());
        Object t0 = x.t0(list);
        for (f fVar2 : list) {
            int abs2 = Math.abs(fVar2.b() - fVar.b());
            if (abs2 < abs) {
                t0 = fVar2;
                abs = abs2;
            }
        }
        f fVar3 = (f) t0;
        i.C(g0Var, new b(fVar3));
        w wVar = this.d;
        wVar.U(wVar.I().a().i(fVar3.c(), fVar3.b()).h(fVar3.a()).b());
    }

    @Override // com.amazon.aps.iva.ik.c
    public final void b(v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "tracks");
        i.C(this.b, new a(v0Var));
        a();
    }
}
