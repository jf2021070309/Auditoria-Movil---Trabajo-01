package com.amazon.aps.iva.ic;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.nc.r;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ue0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
/* compiled from: Flows.kt */
/* loaded from: classes.dex */
public final class b<ResourceT> implements com.amazon.aps.iva.ed.h<ResourceT>, com.amazon.aps.iva.dd.g<ResourceT> {
    public final q<d<ResourceT>> b;
    public final com.amazon.aps.iva.ab.a c;
    public volatile h d;
    public volatile com.amazon.aps.iva.dd.d e;
    public volatile g<ResourceT> f;
    public final ArrayList g;

    /* compiled from: Flows.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.bumptech.glide.integration.ktx.FlowTarget$1", f = "Flows.kt", l = {287}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ b<Object> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<Object> bVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.ArrayList] */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    g0Var = (g0) this.i;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0 g0Var2 = (g0) this.i;
                this.i = g0Var2;
                this.h = 1;
                Object K = ((com.amazon.aps.iva.ic.a) this.j.c).a.K(this);
                if (K == aVar) {
                    return aVar;
                }
                g0Var = g0Var2;
                obj = K;
            }
            h hVar = (h) obj;
            d0 d0Var = new d0();
            b<Object> bVar = this.j;
            synchronized (g0Var) {
                bVar.d = hVar;
                d0Var.b = new ArrayList(bVar.g);
                bVar.g.clear();
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            for (com.amazon.aps.iva.ed.g gVar : (Iterable) d0Var.b) {
                gVar.b(hVar.a, hVar.b);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(q<? super d<ResourceT>> qVar, com.amazon.aps.iva.ab.a aVar) {
        j.f(qVar, "scope");
        j.f(aVar, "size");
        this.b = qVar;
        this.c = aVar;
        this.g = new ArrayList();
        if (aVar instanceof e) {
            this.d = ((e) aVar).a;
        } else if (aVar instanceof com.amazon.aps.iva.ic.a) {
            com.amazon.aps.iva.se0.i.d(qVar, null, null, new a(this, null), 3);
        }
    }

    @Override // com.amazon.aps.iva.dd.g
    public final void a(r rVar, com.amazon.aps.iva.ed.h hVar) {
        boolean z;
        j.f(hVar, "target");
        g<ResourceT> gVar = this.f;
        com.amazon.aps.iva.dd.d dVar = this.e;
        if (gVar != null) {
            if (dVar != null && !dVar.f()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !dVar.isRunning()) {
                this.b.C().h(new g(i.FAILED, gVar.b, gVar.c, gVar.d));
            }
        }
    }

    @Override // com.amazon.aps.iva.dd.g
    public final boolean b(ResourceT resourcet, Object obj, com.amazon.aps.iva.ed.h<ResourceT> hVar, com.amazon.aps.iva.kc.a aVar, boolean z) {
        boolean z2;
        i iVar;
        j.f(obj, "model");
        j.f(hVar, "target");
        j.f(aVar, "dataSource");
        com.amazon.aps.iva.dd.d dVar = this.e;
        if (dVar != null && dVar.f()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            iVar = i.SUCCEEDED;
        } else {
            iVar = i.RUNNING;
        }
        g<ResourceT> gVar = new g<>(iVar, resourcet, z, aVar);
        this.f = gVar;
        this.b.h(gVar);
        return true;
    }

    @Override // com.amazon.aps.iva.ed.h
    public final com.amazon.aps.iva.dd.d getRequest() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void getSize(com.amazon.aps.iva.ed.g gVar) {
        j.f(gVar, "cb");
        h hVar = this.d;
        if (hVar != null) {
            gVar.b(hVar.a, hVar.b);
            return;
        }
        synchronized (this) {
            h hVar2 = this.d;
            if (hVar2 != null) {
                gVar.b(hVar2.a, hVar2.b);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            } else {
                this.g.add(gVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onLoadCleared(Drawable drawable) {
        this.f = null;
        this.b.h(new f(i.CLEARED, drawable));
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onLoadFailed(Drawable drawable) {
        this.b.h(new f(i.FAILED, drawable));
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onLoadStarted(Drawable drawable) {
        this.f = null;
        this.b.h(new f(i.RUNNING, drawable));
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onResourceReady(ResourceT resourcet, com.amazon.aps.iva.fd.d<? super ResourceT> dVar) {
        j.f(resourcet, "resource");
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void removeCallback(com.amazon.aps.iva.ed.g gVar) {
        j.f(gVar, "cb");
        synchronized (this) {
            this.g.remove(gVar);
        }
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void setRequest(com.amazon.aps.iva.dd.d dVar) {
        this.e = dVar;
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onDestroy() {
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStart() {
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStop() {
    }
}
