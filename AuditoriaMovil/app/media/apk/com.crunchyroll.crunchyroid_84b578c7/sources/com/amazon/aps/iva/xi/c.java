package com.amazon.aps.iva.xi;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SubtitlesRendererPresenter.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.xi.b {
    public final d a;
    public final g0 b;
    public final com.amazon.aps.iva.wi.b c;

    /* compiled from: SubtitlesRendererPresenter.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.octopussubtitlescomponent.renderrer.SubtitlesRendererPresenterImpl$onOctopusLoaded$1", f = "SubtitlesRendererPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<String, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(String str, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(str, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            String str = (String) this.h;
            if (str != null && !m.b0(str)) {
                z = false;
            } else {
                z = true;
            }
            c cVar = c.this;
            if (z) {
                cVar.a.hide();
                cVar.a.r();
            } else {
                cVar.a.r();
                cVar.a.g(str);
                cVar.a.show();
            }
            return q.a;
        }
    }

    /* compiled from: SubtitlesRendererPresenter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.a implements p<Long, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public b(d dVar) {
            super(2, dVar, d.class, "updateSubtitlesPosition", "updateSubtitlesPosition(J)V", 4);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Long l, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            ((d) this.b).G(l.longValue());
            return q.a;
        }
    }

    public c(d dVar, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, com.amazon.aps.iva.wi.b bVar) {
        j.f(dVar, "view");
        this.a = dVar;
        this.b = lifecycleCoroutineScopeImpl;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.xi.b
    public final void a() {
        com.amazon.aps.iva.wi.b bVar = this.c;
        a0 a0Var = new a0(bVar.getUri(), new a(null));
        g0 g0Var = this.b;
        com.amazon.aps.iva.dg.b.A(g0Var, a0Var);
        com.amazon.aps.iva.dg.b.A(g0Var, new a0(bVar.a(), new b(this.a)));
    }

    public final void b() {
        d dVar = this.a;
        if (dVar.B()) {
            dVar.y();
        } else {
            dVar.hide();
        }
    }
}
