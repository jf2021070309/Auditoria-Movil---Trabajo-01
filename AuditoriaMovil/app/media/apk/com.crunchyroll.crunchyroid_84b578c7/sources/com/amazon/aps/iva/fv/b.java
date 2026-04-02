package com.amazon.aps.iva.fv;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.cv.a0;
import com.amazon.aps.iva.cv.d;
import com.amazon.aps.iva.cv.f;
import com.amazon.aps.iva.cv.w;
import com.amazon.aps.iva.cv.z;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CrunchylistReorderViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.ez.b implements c, com.amazon.aps.iva.fv.a {
    public final d b;
    public final a0 c;
    public final g0 d;
    public final v<com.amazon.aps.iva.ez.d<q>> e;

    /* compiled from: CrunchylistReorderViewModel.kt */
    @e(c = "com.ellation.crunchyroll.crunchylists.crunchylist.reorder.CrunchylistReorderViewModelImpl$onDragAndDrop$1", f = "CrunchylistReorderViewModel.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ List<com.amazon.aps.iva.dv.a> k;
        public final /* synthetic */ b l;
        public final /* synthetic */ com.amazon.aps.iva.dv.a m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, List<? extends com.amazon.aps.iva.dv.a> list, b bVar, com.amazon.aps.iva.dv.a aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = i;
            this.j = i2;
            this.k = list;
            this.l = bVar;
            this.m = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, this.k, this.l, this.m, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            f fVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            int i2 = this.j;
            com.amazon.aps.iva.dv.a aVar2 = this.m;
            b bVar = this.l;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    int i3 = this.i;
                    if (i3 > i2) {
                        fVar = f.AFTER;
                    } else {
                        fVar = f.BEFORE;
                    }
                    f fVar2 = fVar;
                    com.amazon.aps.iva.dv.a aVar3 = this.k.get(i3);
                    b.N8(bVar, bVar.c, aVar2, i3);
                    d dVar = bVar.b;
                    String c = aVar2.c();
                    String b = aVar2.b();
                    String b2 = aVar3.b();
                    this.h = 1;
                    if (dVar.n0(c, b, b2, fVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (IOException unused) {
                b.N8(bVar, bVar.c, aVar2, i2);
                bVar.e.k(new com.amazon.aps.iva.ez.d<>(q.a));
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.cv.e eVar, z zVar) {
        super(eVar);
        com.amazon.aps.iva.xe0.d j = com.amazon.aps.iva.e.z.j();
        j.f(eVar, "interactor");
        this.b = eVar;
        this.c = zVar;
        this.d = j;
        this.e = new v<>();
    }

    public static final void N8(b bVar, a0 a0Var, com.amazon.aps.iva.dv.a aVar, int i) {
        bVar.getClass();
        ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(a0Var.d1().a);
        Z0.remove(O8(aVar, Z0));
        Z0.add(i, aVar);
        a0Var.B4(w.a(a0Var.d1(), Z0, 0, false, 14));
        a0Var.X1().k(new g.c(a0Var.d1(), null));
    }

    public static int O8(Object obj, List list) {
        boolean z;
        Integer valueOf = Integer.valueOf(list.indexOf(obj));
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        throw new NullPointerException("Item not present in the list!");
    }

    @Override // com.amazon.aps.iva.fv.c
    public final v Y5() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.fv.a
    public final void w6(com.amazon.aps.iva.dv.a aVar, int i) {
        List<com.amazon.aps.iva.dv.a> list = this.c.d1().a;
        int O8 = O8(aVar, list);
        if (O8 == i) {
            return;
        }
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new a(i, O8, list, this, aVar, null), 3);
    }
}
