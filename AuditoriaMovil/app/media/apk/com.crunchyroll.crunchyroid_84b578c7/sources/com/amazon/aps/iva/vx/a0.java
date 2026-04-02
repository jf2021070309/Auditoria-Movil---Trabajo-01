package com.amazon.aps.iva.vx;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xw.f0;
import com.amazon.aps.iva.xx.c;
import com.amazon.aps.iva.xx.g;
import com.amazon.aps.iva.xx.l;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: HomeFeedViewModel.kt */
/* loaded from: classes2.dex */
public final class a0 extends com.amazon.aps.iva.ez.b implements x {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.gy.g> b;
    public com.amazon.aps.iva.gy.g c;
    public c2 d;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>>> e;
    public final com.amazon.aps.iva.i5.u f;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> g;

    /* compiled from: HomeFeedViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.HomeFeedViewModelImpl$loadPage$1", f = "HomeFeedViewModel.kt", l = {MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public a0 h;
        public com.amazon.aps.iva.i5.v i;
        public int j;

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
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>>> vVar;
            a0 a0Var;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            a0 a0Var2 = a0.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vVar = this.i;
                        a0Var = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>>> vVar2 = a0Var2.e;
                    com.amazon.aps.iva.gy.g gVar = a0Var2.c;
                    this.h = a0Var2;
                    this.i = vVar2;
                    this.j = 1;
                    Object e1 = gVar.e1(this);
                    if (e1 == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                    obj = e1;
                    a0Var = a0Var2;
                }
                a0.N8(a0Var, vVar, (List) obj, f1.J(l.a.b));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, a0Var2.e);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public a0(com.ellation.crunchyroll.feed.b bVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        this.b = bVar;
        this.c = (com.amazon.aps.iva.gy.g) bVar.invoke();
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>>> vVar = new com.amazon.aps.iva.i5.v<>();
        this.e = vVar;
        this.f = d0.c(vVar, z.h);
        this.g = new com.amazon.aps.iva.i5.v<>();
        com.amazon.aps.iva.ez.h.c(vVar, null);
        com.amazon.aps.iva.gy.g gVar = (com.amazon.aps.iva.gy.g) bVar.invoke();
        this.c = gVar;
        gVar.q1();
        O8();
    }

    public static final void N8(a0 a0Var, com.amazon.aps.iva.i5.v vVar, List list, List list2) {
        Iterable iterable;
        g.c a2;
        a0Var.getClass();
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) vVar.d();
        if (gVar == null || (a2 = gVar.a()) == null || (iterable = (List) a2.a) == null) {
            iterable = com.amazon.aps.iva.lb0.z.b;
        }
        vVar.k(new g.c(com.amazon.aps.iva.lb0.x.L0(list, com.amazon.aps.iva.lb0.x.H0(iterable, list2)), null));
    }

    @Override // com.amazon.aps.iva.vx.x
    public final void M5() {
        this.g.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
        com.amazon.aps.iva.ez.h.c(this.e, null);
        com.amazon.aps.iva.gy.g invoke = this.b.invoke();
        this.c = invoke;
        invoke.q1();
        O8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.vx.x
    public final void N5(com.ellation.crunchyroll.feed.j jVar) {
        g.c a2;
        List list;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.f.d();
        if (gVar != null && (a2 = gVar.a()) != null && (list = (List) a2.a) != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    com.amazon.aps.iva.xx.l lVar = (com.amazon.aps.iva.xx.l) obj;
                    if (lVar instanceof com.amazon.aps.iva.xx.e) {
                        jVar.invoke(lVar, Integer.valueOf(i));
                        return;
                    }
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
        }
    }

    public final void O8() {
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.d = com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.vx.x
    public final void Q6() {
        com.amazon.aps.iva.xx.l lVar;
        g.c.a aVar;
        g.c<List<com.amazon.aps.iva.xx.l>> a2;
        List<com.amazon.aps.iva.xx.l> list;
        Object obj;
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>> d = this.e.d();
        if (d != null && (a2 = d.a()) != null && (list = a2.a) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((com.amazon.aps.iva.xx.l) obj) instanceof g.c.a) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            lVar = (com.amazon.aps.iva.xx.l) obj;
        } else {
            lVar = null;
        }
        if (lVar instanceof g.c.a) {
            aVar = (g.c.a) lVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new c0(this, aVar, null), 3);
        }
    }

    @Override // com.amazon.aps.iva.vx.x
    public final void U1(ArrayList arrayList) {
        g.c<List<com.amazon.aps.iva.xx.l>> a2;
        List<com.amazon.aps.iva.xx.l> list;
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>> d = this.e.d();
        if (d != null && (a2 = d.a()) != null && (list = a2.a) != null) {
            com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b0(list, this, arrayList, null), 3);
        }
    }

    @Override // com.amazon.aps.iva.vx.x
    public final com.amazon.aps.iva.i5.u Y3() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.vx.x
    public final void Z7() {
        com.amazon.aps.iva.xx.l lVar;
        g.c.b bVar;
        g.c<List<com.amazon.aps.iva.xx.l>> a2;
        List<com.amazon.aps.iva.xx.l> list;
        Object obj;
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>> d = this.e.d();
        if (d != null && (a2 = d.a()) != null && (list = a2.a) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((com.amazon.aps.iva.xx.l) obj) instanceof g.c.b) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            lVar = (com.amazon.aps.iva.xx.l) obj;
        } else {
            lVar = null;
        }
        if (lVar instanceof g.c.b) {
            bVar = (g.c.b) lVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new c0(this, bVar, null), 3);
        }
    }

    @Override // com.amazon.aps.iva.vx.x
    public final void e4() {
        O8();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if ((!r0.isEmpty()) == true) goto L9;
     */
    @Override // com.amazon.aps.iva.vx.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i1() {
        /*
            r2 = this;
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<java.util.List<com.amazon.aps.iva.xx.l>>> r0 = r2.e
            java.lang.Object r0 = r0.d()
            com.amazon.aps.iva.ez.g r0 = (com.amazon.aps.iva.ez.g) r0
            if (r0 == 0) goto L21
            com.amazon.aps.iva.ez.g$c r0 = r0.a()
            if (r0 == 0) goto L21
            T r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L21
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L25
            return
        L25:
            r2.M5()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vx.a0.i1():void");
    }

    @Override // com.amazon.aps.iva.vx.x
    public final void v3(com.amazon.aps.iva.b60.j jVar) {
        g.c<List<com.amazon.aps.iva.xx.l>> a2;
        List<com.amazon.aps.iva.xx.l> list;
        boolean z;
        Panel copy;
        com.amazon.aps.iva.xx.c bVar;
        com.amazon.aps.iva.xx.g aVar;
        Panel copy2;
        com.amazon.aps.iva.yb0.j.f(jVar, "changeModel");
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>>> vVar = this.e;
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>> d = vVar.d();
        if (d != null && (a2 = d.a()) != null && (list = a2.a) != null) {
            ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(list);
            Iterator it = Z0.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    com.amazon.aps.iva.xx.l lVar = (com.amazon.aps.iva.xx.l) next;
                    if (lVar instanceof g.b) {
                        z = true;
                    } else {
                        z = lVar instanceof g.a;
                    }
                    String str = jVar.b;
                    if (z) {
                        com.amazon.aps.iva.yb0.j.d(lVar, "null cannot be cast to non-null type com.ellation.crunchyroll.feed.adapter.item.CollectionItem");
                        com.amazon.aps.iva.xx.g gVar = (com.amazon.aps.iva.xx.g) lVar;
                        ArrayList Z02 = com.amazon.aps.iva.lb0.x.Z0(gVar.b());
                        Iterator it2 = Z02.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                Panel panel = (Panel) next2;
                                if (com.amazon.aps.iva.yb0.j.a(panel.getId(), str)) {
                                    copy2 = panel.copy((r40 & 1) != 0 ? panel._id : null, (r40 & 2) != 0 ? panel._title : null, (r40 & 4) != 0 ? panel._promoTitle : null, (r40 & 8) != 0 ? panel._channelId : null, (r40 & 16) != 0 ? panel._description : null, (r40 & 32) != 0 ? panel._promoDescription : null, (r40 & 64) != 0 ? panel._images : null, (r40 & 128) != 0 ? panel._links : null, (r40 & 256) != 0 ? panel._streamsLink : null, (r40 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? panel._episodeMetadata : null, (r40 & 1024) != 0 ? panel._movieListingMetadata : null, (r40 & 2048) != 0 ? panel._movieMetadata : null, (r40 & 4096) != 0 ? panel._seriesMetadata : null, (r40 & 8192) != 0 ? panel.type : null, (r40 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? panel.lastUpdated : null, (r40 & 32768) != 0 ? panel.feedType : null, (r40 & Cast.MAX_MESSAGE_LENGTH) != 0 ? panel.feedTitle : null, (r40 & 131072) != 0 ? panel.feedId : null, (r40 & 262144) != 0 ? panel._watchlistStatus : jVar.c, (r40 & 524288) != 0 ? panel.isInWatchlist : false, (r40 & 1048576) != 0 ? panel.f8new : null, (r40 & 2097152) != 0 ? panel.newContent : null);
                                    Z02.set(i3, copy2);
                                }
                                i3 = i4;
                            } else {
                                f1.S();
                                throw null;
                            }
                        }
                        if (gVar instanceof g.b) {
                            g.b bVar2 = (g.b) gVar;
                            HomeFeedItemRaw homeFeedItemRaw = bVar2.i;
                            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "raw");
                            aVar = new g.b(Z02, homeFeedItemRaw, bVar2.j);
                        } else {
                            if (gVar instanceof g.a) {
                                g.a aVar2 = (g.a) gVar;
                                HomeFeedItemRaw homeFeedItemRaw2 = aVar2.i;
                                com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw2, "raw");
                                aVar = new g.a(Z02, homeFeedItemRaw2, aVar2.j);
                            }
                            Z0.set(i, gVar);
                        }
                        gVar = aVar;
                        Z0.set(i, gVar);
                    } else if (lVar instanceof com.amazon.aps.iva.xx.c) {
                        com.amazon.aps.iva.xx.c cVar = (com.amazon.aps.iva.xx.c) lVar;
                        if (com.amazon.aps.iva.yb0.j.a(str, f0.a(cVar.b()))) {
                            copy = r12.copy((r40 & 1) != 0 ? r12._id : null, (r40 & 2) != 0 ? r12._title : null, (r40 & 4) != 0 ? r12._promoTitle : null, (r40 & 8) != 0 ? r12._channelId : null, (r40 & 16) != 0 ? r12._description : null, (r40 & 32) != 0 ? r12._promoDescription : null, (r40 & 64) != 0 ? r12._images : null, (r40 & 128) != 0 ? r12._links : null, (r40 & 256) != 0 ? r12._streamsLink : null, (r40 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? r12._episodeMetadata : null, (r40 & 1024) != 0 ? r12._movieListingMetadata : null, (r40 & 2048) != 0 ? r12._movieMetadata : null, (r40 & 4096) != 0 ? r12._seriesMetadata : null, (r40 & 8192) != 0 ? r12.type : null, (r40 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r12.lastUpdated : null, (r40 & 32768) != 0 ? r12.feedType : null, (r40 & Cast.MAX_MESSAGE_LENGTH) != 0 ? r12.feedTitle : null, (r40 & 131072) != 0 ? r12.feedId : null, (r40 & 262144) != 0 ? r12._watchlistStatus : jVar.c, (r40 & 524288) != 0 ? r12.isInWatchlist : false, (r40 & 1048576) != 0 ? r12.f8new : null, (r40 & 2097152) != 0 ? cVar.b().newContent : null);
                            com.amazon.aps.iva.yb0.j.f(copy, "panel");
                            if (cVar instanceof c.C0868c) {
                                HomeFeedItemRaw homeFeedItemRaw3 = ((c.C0868c) cVar).g;
                                com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw3, "raw");
                                bVar = new c.C0868c(copy, homeFeedItemRaw3);
                            } else if (cVar instanceof c.a) {
                                bVar = c.a.c((c.a) cVar, copy, null, 14);
                            } else if (cVar instanceof c.b) {
                                c.b bVar3 = (c.b) cVar;
                                HomeFeedItemRaw homeFeedItemRaw4 = bVar3.g;
                                com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw4, "raw");
                                com.amazon.aps.iva.xx.k kVar = bVar3.h;
                                com.amazon.aps.iva.yb0.j.f(kVar, "feedPositionState");
                                bVar = new c.b(copy, homeFeedItemRaw4, kVar);
                            } else {
                                throw new com.amazon.aps.iva.kb0.h();
                            }
                            Z0.set(i, bVar);
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
            vVar.k(new g.c(Z0, null));
        }
    }

    @Override // com.amazon.aps.iva.vx.x
    public final com.amazon.aps.iva.i5.v w4() {
        return this.g;
    }
}
