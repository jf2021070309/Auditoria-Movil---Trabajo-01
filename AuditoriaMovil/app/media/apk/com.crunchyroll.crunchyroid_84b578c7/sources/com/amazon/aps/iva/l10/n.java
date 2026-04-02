package com.amazon.aps.iva.l10;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GenresListViewModel.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.ez.b implements m {
    public final c b;
    public final ArrayList c;
    public final v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.m10.e>>> d;

    /* compiled from: GenresListViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.genres.GenresListViewModelImpl$fetchGenres$1", f = "GenresListViewModel.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            n nVar = n.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    c cVar = nVar.b;
                    this.h = 1;
                    obj = cVar.r0(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                nVar.d.k(new g.c(w.l((List) obj, nVar.c), null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, nVar.d);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d dVar, int i) {
        super(dVar);
        this.b = dVar;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new com.amazon.aps.iva.m10.d(j0.d("randomUUID().toString()")));
        }
        this.c = arrayList;
        this.d = new v<>();
        P7();
    }

    @Override // com.amazon.aps.iva.l10.m
    public final void P7() {
        com.amazon.aps.iva.ez.h.c(this.d, this.c);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.l10.m
    public final v j2() {
        return this.d;
    }
}
