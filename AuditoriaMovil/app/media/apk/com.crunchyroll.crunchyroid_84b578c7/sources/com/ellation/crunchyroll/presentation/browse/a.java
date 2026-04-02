package com.ellation.crunchyroll.presentation.browse;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.mn.g;
import com.amazon.aps.iva.mn.i;
import com.amazon.aps.iva.tz.b0;
import com.amazon.aps.iva.tz.j1;
import com.amazon.aps.iva.tz.p0;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.browse.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BrowseAllViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.ez.b implements p0 {
    public final String b;
    public final com.amazon.aps.iva.l10.a c;
    public final com.amazon.aps.iva.l10.a d;
    public final j1 e;
    public final i f;
    public g g;
    public final v<com.amazon.aps.iva.ez.g<h<com.amazon.aps.iva.uz.h>>> h;
    public final v<com.amazon.aps.iva.ez.g<j<List<com.amazon.aps.iva.uz.h>, g>>> i;

    /* compiled from: BrowseAllViewModel.kt */
    /* renamed from: com.ellation.crunchyroll.presentation.browse.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0968a extends l implements com.amazon.aps.iva.xb0.l<g, q> {
        public C0968a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g gVar) {
            g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "newSortAndFilters");
            a aVar = a.this;
            if (aVar.g == null || !com.amazon.aps.iva.yb0.j.a(aVar.N2(), gVar2)) {
                aVar.g = gVar2;
                aVar.reset();
            }
            return q.a;
        }
    }

    /* compiled from: BrowseAllViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.uz.h>, q> {
        public b(Object obj) {
            super(1, obj, a.class, "onInitialLoading", "onInitialLoading(Ljava/util/List;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends com.amazon.aps.iva.uz.h> list) {
            List<? extends com.amazon.aps.iva.uz.h> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "p0");
            a aVar = (a) this.receiver;
            aVar.getClass();
            com.amazon.aps.iva.ez.h.c(aVar.i, new j(list2, aVar.N2()));
            return q.a;
        }
    }

    /* compiled from: BrowseAllViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements p<Integer, List<? extends com.amazon.aps.iva.uz.h>, q> {
        public c(Object obj) {
            super(2, obj, a.class, "onPageLoaded", "onPageLoaded(ILjava/util/List;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(Integer num, List<? extends com.amazon.aps.iva.uz.h> list) {
            int intValue = num.intValue();
            List<? extends com.amazon.aps.iva.uz.h> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "p1");
            a aVar = (a) this.receiver;
            aVar.getClass();
            if (intValue == 0) {
                aVar.i.k(new g.c(new j(list2, aVar.N2()), null));
            }
            return q.a;
        }
    }

    /* compiled from: BrowseAllViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements p<Integer, Throwable, q> {
        public d(Object obj) {
            super(2, obj, a.class, "onFailure", "onFailure(ILjava/lang/Throwable;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(Integer num, Throwable th) {
            j<List<com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.mn.g> jVar;
            g.c<j<List<com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.mn.g>> a;
            int intValue = num.intValue();
            Throwable th2 = th;
            com.amazon.aps.iva.yb0.j.f(th2, "p1");
            a aVar = (a) this.receiver;
            aVar.getClass();
            if (intValue == 0) {
                v<com.amazon.aps.iva.ez.g<j<List<com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.mn.g>>> vVar = aVar.i;
                com.amazon.aps.iva.ez.g<j<List<com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.mn.g>> d = vVar.d();
                if (d != null && (a = d.a()) != null) {
                    jVar = a.a;
                } else {
                    jVar = null;
                }
                vVar.k(new g.a(jVar, th2));
            }
            return q.a;
        }
    }

    /* compiled from: BrowseAllViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public e(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, com.amazon.aps.iva.l10.a aVar, com.amazon.aps.iva.l10.a aVar2, j1 j1Var, i iVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(str, "browseModuleKey");
        com.amazon.aps.iva.yb0.j.f(j1Var, "pagedListFactory");
        com.amazon.aps.iva.yb0.j.f(iVar, "sortAndFiltersInteractor");
        this.b = str;
        this.c = aVar;
        this.d = aVar2;
        this.e = j1Var;
        this.f = iVar;
        this.h = new v<>();
        this.i = new v<>();
    }

    @Override // com.amazon.aps.iva.tz.p0
    public final com.amazon.aps.iva.mn.g N2() {
        com.amazon.aps.iva.mn.g gVar = this.g;
        if (gVar != null) {
            return gVar;
        }
        com.amazon.aps.iva.yb0.j.m("sortAndFilters");
        throw null;
    }

    public final void N8() {
        com.amazon.aps.iva.j8.e<?, com.amazon.aps.iva.uz.h> eVar;
        g.c<h<com.amazon.aps.iva.uz.h>> a;
        h<com.amazon.aps.iva.uz.h> hVar;
        com.amazon.aps.iva.ez.g<h<com.amazon.aps.iva.uz.h>> d2 = this.h.d();
        com.amazon.aps.iva.jz.a aVar = null;
        if (d2 != null && (a = d2.a()) != null && (hVar = a.a) != null) {
            eVar = hVar.g();
        } else {
            eVar = null;
        }
        if (eVar instanceof com.amazon.aps.iva.jz.a) {
            aVar = (com.amazon.aps.iva.jz.a) eVar;
        }
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // com.amazon.aps.iva.tz.p0
    public final void U(o oVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ez.g<? extends j<? extends List<? extends com.amazon.aps.iva.uz.h>, com.amazon.aps.iva.mn.g>>, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        this.i.e(oVar, new e(lVar));
    }

    @Override // com.amazon.aps.iva.tz.p0
    public final void a(com.amazon.aps.iva.b60.j jVar, com.amazon.aps.iva.xb0.l<? super List<Integer>, q> lVar) {
        Iterable iterable;
        h.c cVar;
        Panel panel;
        g.c<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>> a;
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>> d2 = this.h.d();
        if (d2 == null || (a = d2.a()) == null || (iterable = (com.amazon.aps.iva.j8.h) a.a) == null) {
            iterable = z.b;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                com.amazon.aps.iva.uz.h hVar = (com.amazon.aps.iva.uz.h) obj;
                if (hVar instanceof h.c) {
                    cVar = (h.c) hVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    panel = cVar.a();
                } else {
                    panel = null;
                }
                if (panel != null) {
                    str = panel.getId();
                }
                if (com.amazon.aps.iva.yb0.j.a(jVar.b, str)) {
                    WatchlistStatus watchlistStatus = panel.getWatchlistStatus();
                    WatchlistStatus watchlistStatus2 = jVar.c;
                    if (watchlistStatus2 != watchlistStatus) {
                        panel.setWatchlistStatus(watchlistStatus2);
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        if (!arrayList.isEmpty()) {
            ((b0.d) lVar).invoke(arrayList);
        }
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        com.ellation.crunchyroll.presentation.browse.c.a.getClass();
        String str = this.b;
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.ellation.crunchyroll.presentation.browse.c cVar = (com.ellation.crunchyroll.presentation.browse.c) c.a.b.remove(str);
        N8();
    }

    @Override // com.amazon.aps.iva.tz.p0
    public final void reset() {
        N8();
        this.h.k(new g.c(this.e.a(N2(), com.amazon.aps.iva.lb0.o.O(new com.amazon.aps.iva.l10.a[]{this.c, this.d}), new b(this), new c(this), new d(this)), null));
    }

    @Override // com.amazon.aps.iva.tz.p0
    public final void t0(o oVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>>, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        this.f.u0(oVar, new C0968a());
        this.h.e(oVar, new e(lVar));
    }
}
