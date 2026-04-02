package com.amazon.aps.iva.ku;

import android.content.res.Configuration;
import androidx.lifecycle.LiveData;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: PostCommentPresenter.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.wy.b<w> implements s {
    public final String b;
    public final LiveData<PlayableAsset> c;
    public final x d;
    public final com.amazon.aps.iva.hu.g e;
    public final com.amazon.aps.iva.jm.y f;
    public final com.amazon.aps.iva.x50.q g;
    public final boolean h;

    /* compiled from: PostCommentPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Comment>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Comment> gVar) {
            com.amazon.aps.iva.ez.g<? extends Comment> gVar2 = gVar;
            v vVar = v.this;
            com.amazon.aps.iva.yb0.j.e(gVar2, "it");
            vVar.getView().vc(gVar2);
            gVar2.b(new t(vVar));
            gVar2.e(new u(vVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PostCommentPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset) {
            String id = playableAsset.getId();
            v vVar = v.this;
            if (!com.amazon.aps.iva.yb0.j.a(id, vVar.b)) {
                vVar.q6();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PostCommentPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            v.this.q6();
            this.i.invoke();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PostCommentPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            v.this.q6();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PostCommentPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public e(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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
    public v(w wVar, String str, LiveData liveData, y yVar, com.amazon.aps.iva.hu.h hVar, com.amazon.aps.iva.pm.b bVar, com.amazon.aps.iva.x50.r rVar, boolean z) {
        super(wVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(bVar, "userAssetsProvider");
        this.b = str;
        this.c = liveData;
        this.d = yVar;
        this.e = hVar;
        this.f = bVar;
        this.g = rVar;
        this.h = z;
    }

    @Override // com.amazon.aps.iva.ku.s
    public final void C5(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "message");
        this.d.a2(str, z);
    }

    @Override // com.amazon.aps.iva.ku.s
    public final void n3() {
        getView().Qe();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        if (!this.h) {
            getView().d();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.d.q6().e(getView(), new e(new a()));
        e eVar = new e(new b());
        this.c.e(getView(), eVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onStart() {
        getView().Yg();
    }

    public final void q6() {
        getView().d();
        getView().dismiss();
    }

    public final void r6(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        if (getView().Jb()) {
            if (getView().p0()) {
                getView().d();
                return;
            } else {
                getView().Ve(new c(aVar));
                return;
            }
        }
        q6();
        aVar.invoke();
    }

    public final boolean s6(boolean z) {
        if (z) {
            if (getView().Jb()) {
                getView().Ve(new d());
                return true;
            }
            getView().dismiss();
            return true;
        }
        return false;
    }

    public final void t6(boolean z, boolean z2) {
        if (z && !z2) {
            if (getView().Jb()) {
                if (getView().p0()) {
                    getView().d();
                    return;
                }
                return;
            }
            q6();
        }
    }

    @Override // com.amazon.aps.iva.ku.s
    public final void w3() {
        getView().hc();
    }
}
