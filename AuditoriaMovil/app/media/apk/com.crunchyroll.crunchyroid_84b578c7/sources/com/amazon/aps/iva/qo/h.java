package com.amazon.aps.iva.qo;

import android.view.View;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
/* compiled from: WatchScreenMenuProvider.kt */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.n70.d<PlayableAsset> {
    public final com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> a;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;

    /* compiled from: WatchScreenMenuProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            h.this.b.invoke();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenMenuProvider.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ PlayableAsset i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PlayableAsset playableAsset) {
            super(1);
            this.i = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            h.this.a.invoke(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenMenuProvider.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            h.this.b.invoke();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenMenuProvider.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ PlayableAsset i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PlayableAsset playableAsset) {
            super(1);
            this.i = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            h.this.a.invoke(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public h(r rVar, q qVar) {
        this.a = qVar;
        this.b = rVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    /* renamed from: b */
    public final List<com.amazon.aps.iva.n70.b> a(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "data");
        if (playableAsset instanceof Episode) {
            return f1.K(new com.amazon.aps.iva.n70.b(e.e, new a()), new com.amazon.aps.iva.n70.b(com.amazon.aps.iva.qo.b.e, new b(playableAsset)));
        }
        if (playableAsset instanceof Movie) {
            return f1.K(new com.amazon.aps.iva.n70.b(com.amazon.aps.iva.qo.d.e, new c()), new com.amazon.aps.iva.n70.b(com.amazon.aps.iva.qo.c.e, new d(playableAsset)));
        }
        return z.b;
    }
}
