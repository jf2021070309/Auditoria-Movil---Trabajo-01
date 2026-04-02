package com.amazon.aps.iva.wk;

import android.content.res.Configuration;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.player.presentation.controls.adstimeline.AdsTimelineLayout;
/* compiled from: AdsTimelinePresenter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.b<g> {
    public final com.amazon.aps.iva.wk.b b;

    /* compiled from: AdsTimelinePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wk.a, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.wk.a aVar) {
            com.amazon.aps.iva.wk.a aVar2 = aVar;
            f fVar = f.this;
            fVar.getView().setProgressBarVideoDuration(aVar2.a);
            fVar.getView().ea(aVar2.b);
            if (aVar2.c) {
                fVar.getView().E9();
            } else {
                fVar.getView().f8();
            }
            return q.a;
        }
    }

    /* compiled from: AdsTimelinePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    public f(AdsTimelineLayout adsTimelineLayout, e eVar) {
        super(adsTimelineLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        getView().n();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.getData().e(getView(), new b(new a()));
    }
}
