package com.amazon.aps.iva.n10;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.n10.b;
import com.amazon.aps.iva.n10.w;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
import java.io.IOException;
import java.util.List;
/* compiled from: GenreFeedViewModel.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.ez.b implements h {
    public final c b;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<b>>> c;

    /* compiled from: GenreFeedViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.genres.genre.GenreFeedViewModelImpl$fetchGenreFeed$1", f = "GenreFeedViewModel.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.i5.v h;
        public int i;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<b>>> vVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            i iVar = i.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vVar = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<b>>> vVar2 = iVar.c;
                    c cVar = iVar.b;
                    this.h = vVar2;
                    this.i = 1;
                    Object J1 = cVar.J1(this);
                    if (J1 == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                    obj = J1;
                }
                vVar.k(new g.c(obj, null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, iVar.c);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public i(d dVar) {
        super(dVar);
        this.b = dVar;
        this.c = new com.amazon.aps.iva.i5.v<>();
        K5();
    }

    @Override // com.amazon.aps.iva.n10.h
    public final void K5() {
        com.amazon.aps.iva.ez.h.c(this.c, this.b.t0());
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.n10.h
    public final void W5(com.amazon.aps.iva.b60.j jVar, w.c cVar) {
        List<b> list;
        boolean z;
        g.c<List<b>> a2;
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        com.amazon.aps.iva.ez.g<List<b>> d = this.c.d();
        if (d == null || (a2 = d.a()) == null || (list = a2.a) == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                b bVar = (b) obj;
                if (bVar instanceof b.c) {
                    int i3 = 0;
                    for (Object obj2 : ((b.c) bVar).c.a) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            Panel panel = (Panel) obj2;
                            if (com.amazon.aps.iva.yb0.j.a(panel.getId(), jVar.b)) {
                                WatchlistStatus watchlistStatus = jVar.c;
                                com.amazon.aps.iva.yb0.j.f(watchlistStatus, "watchlistStatus");
                                if (panel.getWatchlistStatus() != watchlistStatus) {
                                    panel.setWatchlistStatus(watchlistStatus);
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    cVar.invoke(Integer.valueOf(i), Integer.valueOf(i3));
                                }
                            }
                            i3 = i4;
                        } else {
                            f1.S();
                            throw null;
                        }
                    }
                    continue;
                }
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
    }

    @Override // com.amazon.aps.iva.n10.h
    public final com.amazon.aps.iva.i5.v t7() {
        return this.c;
    }
}
