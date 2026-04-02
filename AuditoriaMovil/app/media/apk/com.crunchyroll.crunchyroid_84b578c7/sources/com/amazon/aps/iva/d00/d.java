package com.amazon.aps.iva.d00;

import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import com.amazon.aps.iva.f00.q;
import com.amazon.aps.iva.l40.w;
import com.amazon.aps.iva.l40.z0;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.presentation.content.assets.AssetsRecyclerView;
import com.google.android.gms.cast.MediaError;
import java.util.List;
/* compiled from: AssetsPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<f> implements c, b {
    public final boolean b;
    public l<? super q, com.amazon.aps.iva.kb0.q> c;
    public l<? super View, com.amazon.aps.iva.kb0.q> d;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> e;

    /* compiled from: AssetsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            d dVar = d.this;
            Integer W7 = dVar.getView().W7(this.i);
            if (W7 != null) {
                dVar.getView().Y0(W7.intValue());
                dVar.e = null;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z, AssetsRecyclerView assetsRecyclerView) {
        super(assetsRecyclerView, new j[0]);
        com.amazon.aps.iva.yb0.j.f(assetsRecyclerView, "view");
        this.b = z;
    }

    @Override // com.amazon.aps.iva.d00.b
    public final void C3(z0 z0Var) {
        this.d = z0Var;
    }

    @Override // com.amazon.aps.iva.d00.c
    public final int D4(int i) {
        switch (i) {
            case 100:
            case MediaError.DetailedErrorCode.MEDIA_DECODE /* 102 */:
                return 1;
            case 101:
            case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED /* 104 */:
            case 105:
            case 106:
            case 107:
                return getView().getGridLayoutManagerSpanCount();
            case MediaError.DetailedErrorCode.MEDIA_NETWORK /* 103 */:
            default:
                throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Unexpected asset view type ", i, "."));
        }
    }

    @Override // com.amazon.aps.iva.d00.a
    public final void K4(q qVar) {
    }

    @Override // com.amazon.aps.iva.d00.b
    public final void O3(w wVar) {
        this.c = wVar;
    }

    @Override // com.amazon.aps.iva.d00.a
    public final void P3(q qVar) {
        l<? super q, com.amazon.aps.iva.kb0.q> lVar = this.c;
        if (lVar != null) {
            lVar.invoke(qVar);
        }
    }

    @Override // com.amazon.aps.iva.e00.c
    public final void X0(ImageView imageView) {
        com.amazon.aps.iva.yb0.j.f(imageView, "buttonView");
        l<? super View, com.amazon.aps.iva.kb0.q> lVar = this.d;
        if (lVar != null) {
            lVar.invoke(imageView);
        }
    }

    @Override // com.amazon.aps.iva.d00.b
    public final void i5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "seasonId");
        a aVar = new a(str);
        this.e = aVar;
        aVar.invoke();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        q6();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        q6();
    }

    public final void q6() {
        boolean z = this.b;
        if (z && (!z || !getView().S0())) {
            getView().b9();
        } else {
            getView().Wc();
        }
    }

    @Override // com.amazon.aps.iva.d00.b
    public final void z2(List<? extends com.amazon.aps.iva.f00.a> list) {
        com.amazon.aps.iva.yb0.j.f(list, "assetModels");
        getView().R(list);
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
