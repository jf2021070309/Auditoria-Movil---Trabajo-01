package com.amazon.aps.iva.sd;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.k9.r;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.r4.i0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: ContinueWatchingWidgetUpdater.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final Context a;
    public final g0 b;

    /* compiled from: ContinueWatchingWidgetUpdater.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWidgetUpdaterImpl$update$1", f = "ContinueWatchingWidgetUpdater.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
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
            com.amazon.aps.iva.k9.f fVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = d.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                i0 i0Var = new i0(dVar.a);
                this.h = 1;
                obj = i0Var.a(com.crunchyroll.appwidgets.continuewatching.c.class, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (!((List) obj).isEmpty()) {
                Context context = dVar.a;
                j.f(context, "context");
                k c = k.c(context);
                j.e(c, "getInstance(context)");
                r.a aVar2 = new r.a(TimeUnit.MINUTES);
                com.amazon.aps.iva.k9.e eVar = com.amazon.aps.iva.k9.e.KEEP;
                com.amazon.aps.iva.k9.e eVar2 = com.amazon.aps.iva.k9.e.REPLACE;
                r a = aVar2.a();
                if (eVar2 == eVar) {
                    fVar = com.amazon.aps.iva.k9.f.KEEP;
                } else {
                    fVar = com.amazon.aps.iva.k9.f.REPLACE;
                }
                new com.amazon.aps.iva.l9.g(c, "ContinueWatchingWorker", fVar, Collections.singletonList(a)).a();
            }
            return q.a;
        }
    }

    public d(Context context, g0 g0Var) {
        this.a = context;
        this.b = g0Var;
    }

    @Override // com.amazon.aps.iva.sd.c
    public final void a() {
        com.amazon.aps.iva.se0.i.d(this.b, null, null, new a(null), 3);
    }
}
