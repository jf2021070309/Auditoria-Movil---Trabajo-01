package com.amazon.aps.iva.xk;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.player.presentation.controls.maturityrestrictionlabel.PlayerMaturityLabelLayout;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.MaturityRatingType;
/* compiled from: PlayerMaturityLabelPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.b<i> implements g {
    public final com.amazon.aps.iva.xk.d b;
    public final com.amazon.aps.iva.xk.b c;
    public LabelUiModel d;

    /* compiled from: PlayerMaturityLabelPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            MaturityRatingType maturityRatingType;
            h hVar = h.this;
            LabelUiModel labelUiModel = hVar.d;
            MaturityRatingType maturityRatingType2 = null;
            if (labelUiModel != null) {
                maturityRatingType = labelUiModel.getMaturityRating();
            } else {
                maturityRatingType = null;
            }
            if (maturityRatingType != null) {
                LabelUiModel labelUiModel2 = hVar.d;
                if (labelUiModel2 != null) {
                    maturityRatingType2 = labelUiModel2.getMaturityRating();
                }
                if (maturityRatingType2 != MaturityRatingType.UNDEFINED) {
                    hVar.q6();
                }
            }
            return q.a;
        }
    }

    /* compiled from: PlayerMaturityLabelPresenter.kt */
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

    /* compiled from: PlayerMaturityLabelPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            h.this.getView().k5();
            return q.a;
        }
    }

    /* compiled from: PlayerMaturityLabelPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            h.this.getView().t6();
            return q.a;
        }
    }

    public h(PlayerMaturityLabelLayout playerMaturityLabelLayout, f fVar, com.amazon.aps.iva.xk.c cVar) {
        super(playerMaturityLabelLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = fVar;
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.xk.g
    public final void f5(LabelUiModel labelUiModel) {
        j.f(labelUiModel, "labelUiModel");
        this.d = labelUiModel;
        MaturityRatingType maturityRating = labelUiModel.getMaturityRating();
        MaturityRatingType maturityRatingType = MaturityRatingType.UNDEFINED;
        com.amazon.aps.iva.xk.b bVar = this.c;
        if (maturityRating == maturityRatingType) {
            getView().t6();
            bVar.cancel();
            return;
        }
        getView().cd(labelUiModel);
        getView().yc(x.B0(x.U0(labelUiModel.getContentDescriptors(), 6), ", ", null, null, null, 62));
        bVar.reset();
        q6();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.a().e(getView(), new b(new a()));
    }

    public final void q6() {
        boolean a2 = j.a(this.b.a().d(), Boolean.TRUE);
        com.amazon.aps.iva.xk.b bVar = this.c;
        if (a2) {
            bVar.a(new c(), new d());
            return;
        }
        getView().t6();
        bVar.cancel();
    }
}
