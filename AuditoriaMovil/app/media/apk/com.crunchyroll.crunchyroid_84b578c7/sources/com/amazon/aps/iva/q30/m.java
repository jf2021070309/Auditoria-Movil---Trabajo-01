package com.amazon.aps.iva.q30;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
/* compiled from: RecentSearchesInteractor.kt */
/* loaded from: classes2.dex */
public final class m implements k, g {
    public final g b;
    public final int c;
    public final com.amazon.aps.iva.t50.c d;

    /* compiled from: RecentSearchesInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.q30.b>, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Panel h;
        public final /* synthetic */ m i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Panel panel, m mVar) {
            super(1);
            this.h = panel;
            this.i = mVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.q30.b> list) {
            List<? extends com.amazon.aps.iva.q30.b> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "recentSearches");
            Panel panel = this.h;
            m mVar = this.i;
            m.S1(mVar, list2, new com.amazon.aps.iva.q30.b(panel, null, mVar.d.a(), 2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: RecentSearchesInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.q30.b>, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ MusicAsset h;
        public final /* synthetic */ m i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MusicAsset musicAsset, m mVar) {
            super(1);
            this.h = musicAsset;
            this.i = mVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.q30.b> list) {
            List<? extends com.amazon.aps.iva.q30.b> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "recentSearches");
            MusicAsset musicAsset = this.h;
            m mVar = this.i;
            m.S1(mVar, list2, new com.amazon.aps.iva.q30.b(null, musicAsset, mVar.d.a(), 1));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public m(g gVar, int i, com.amazon.aps.iva.t50.c cVar) {
        this.b = gVar;
        this.c = i;
        this.d = cVar;
    }

    public static final void S1(m mVar, List list, com.amazon.aps.iva.q30.b bVar) {
        mVar.getClass();
        if (list.size() >= mVar.c && !mVar.contains(bVar.a())) {
            mVar.f1(((com.amazon.aps.iva.q30.b) com.amazon.aps.iva.lb0.x.D0(list)).a());
        }
        mVar.b.m1(bVar);
    }

    @Override // com.amazon.aps.iva.q30.k
    public final void B(MusicAsset musicAsset) {
        com.amazon.aps.iva.yb0.j.f(musicAsset, "musicAsset");
        l1(new b(musicAsset, this));
    }

    @Override // com.amazon.aps.iva.q30.k
    public final void B1(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        l1(new a(panel, this));
    }

    @Override // com.amazon.aps.iva.xe.d
    public final Map<String, com.amazon.aps.iva.q30.b> I0() {
        return this.b.I0();
    }

    @Override // com.amazon.aps.iva.q30.k
    public final void I1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        f1(str);
    }

    @Override // com.amazon.aps.iva.q30.k
    public final void M0() {
        clear();
    }

    @Override // com.amazon.aps.iva.xe.d
    /* renamed from: T1 */
    public final void m1(com.amazon.aps.iva.q30.b bVar) {
        this.b.m1(bVar);
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void X0(List<String> list) {
        this.b.X0(list);
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void clear() {
        this.b.clear();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final boolean contains(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        return this.b.contains(str);
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void f1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        this.b.f1(str);
    }

    @Override // com.amazon.aps.iva.q30.k
    public final void l1(com.amazon.aps.iva.xb0.l<? super List<com.amazon.aps.iva.q30.b>, com.amazon.aps.iva.kb0.q> lVar) {
        lVar.invoke(com.amazon.aps.iva.lb0.x.T0(q(), new l()));
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void n1(List<? extends com.amazon.aps.iva.q30.b> list) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        this.b.n1(list);
    }

    @Override // com.amazon.aps.iva.xe.d
    public final List<com.amazon.aps.iva.q30.b> q() {
        return this.b.q();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final com.amazon.aps.iva.q30.b v(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        return this.b.v(str);
    }
}
