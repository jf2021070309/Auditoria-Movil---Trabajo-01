package com.crunchyroll.contentrating.contentrating;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.h;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.tf.c;
import com.amazon.aps.iva.tf.d;
import com.amazon.aps.iva.tf.e;
import com.amazon.aps.iva.tf.f;
import com.amazon.aps.iva.tf.g;
import com.amazon.aps.iva.uf.b;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.contentrating.controls.RatingControlsLayout;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ratebutton.RateButtonLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ContentRatingLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/crunchyroll/contentrating/contentrating/ContentRatingLayout;", "Lcom/amazon/aps/iva/sf/a;", "Lcom/amazon/aps/iva/tf/e;", "Lh;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/iva/kb0/q;", "setVisibilityChangeListener", "Lcom/amazon/aps/iva/tf/f;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getViewModel", "()Lcom/amazon/aps/iva/tf/f;", "viewModel", "Lcom/amazon/aps/iva/tf/c;", "d", "getPresenter", "()Lcom/amazon/aps/iva/tf/c;", "presenter", "content-rating_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContentRatingLayout extends com.amazon.aps.iva.sf.a implements e {
    public final com.amazon.aps.iva.vf.a b;
    public final m c;
    public final m d;
    public h e;

    /* compiled from: ContentRatingLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<c> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final c invoke() {
            ContentRatingLayout contentRatingLayout = ContentRatingLayout.this;
            f viewModel = contentRatingLayout.getViewModel();
            j.f(viewModel, "viewModel");
            return new d(contentRatingLayout, viewModel);
        }
    }

    /* compiled from: ContentRatingLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<g> {
        public final /* synthetic */ Context h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.h = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            Activity a = q.a(this.h);
            j.d(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return (g) com.amazon.aps.iva.ez.l.a((h) a, g.class, com.crunchyroll.contentrating.contentrating.a.h);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentRatingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final c getPresenter() {
        return (c) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f getViewModel() {
        return (f) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.tf.e
    public final void D5() {
        com.amazon.aps.iva.vf.b bVar = ((RatingControlsLayout) this.b.c).b;
        ((RateButtonLayout) bVar.d).setClickable(true);
        ((RateButtonLayout) bVar.c).setClickable(true);
    }

    @Override // com.amazon.aps.iva.tf.e
    public final void Q6() {
        ((RatingControlsLayout) this.b.c).Bh();
    }

    @Override // com.amazon.aps.iva.sf.a
    public final void b1(com.amazon.aps.iva.sf.e eVar) {
        j.f(eVar, "contentRatingInput");
        ((RatingControlsLayout) this.b.c).setListener(getViewModel());
        getPresenter().v0(eVar);
    }

    @Override // com.amazon.aps.iva.tf.e
    public final void f() {
        setVisibility(8);
        h hVar = this.e;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // com.amazon.aps.iva.tf.e
    public final void k() {
        setVisibility(0);
        h hVar = this.e;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // com.amazon.aps.iva.tf.e
    public final void n3(com.amazon.aps.iva.uf.b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        j.f(bVar, "state");
        RatingControlsLayout ratingControlsLayout = (RatingControlsLayout) this.b.c;
        ratingControlsLayout.getClass();
        com.amazon.aps.iva.uf.g gVar = ratingControlsLayout.c;
        gVar.getClass();
        gVar.d = bVar;
        if (bVar instanceof b.C0765b) {
            gVar.q6();
        } else if (bVar instanceof b.a) {
            gVar.q6();
        } else if (bVar instanceof b.c) {
            b.c cVar = (b.c) bVar;
            if (cVar.b == 0 && cVar.c == 0) {
                gVar.getView().Fg();
            } else {
                com.amazon.aps.iva.uf.c view = gVar.getView();
                com.amazon.aps.iva.uf.h hVar = com.amazon.aps.iva.uf.h.LIKED;
                com.amazon.aps.iva.uf.h hVar2 = cVar.a;
                if (hVar2 == hVar) {
                    z = true;
                } else {
                    z = false;
                }
                int i = cVar.b;
                boolean z5 = cVar.d;
                if (z5 && hVar2 != com.amazon.aps.iva.uf.h.DISLIKED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                view.Q1(new com.amazon.aps.iva.j50.d(null, i, z, z2, 8));
                com.amazon.aps.iva.uf.c view2 = gVar.getView();
                if (hVar2 == com.amazon.aps.iva.uf.h.DISLIKED) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i2 = cVar.c;
                if (z5 && hVar2 != hVar) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                view2.a9(new com.amazon.aps.iva.j50.d(null, i2, z3, z4, 8));
            }
            gVar.getView().dh();
        }
    }

    @Override // com.amazon.aps.iva.sf.a
    public void setVisibilityChangeListener(h hVar) {
        j.f(hVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.e = hVar;
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    @Override // com.amazon.aps.iva.tf.e
    public final void tb(com.amazon.aps.iva.bt.c cVar) {
        j.f(cVar, "errorMessage");
        Context context = getContext();
        j.d(context, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        ((com.amazon.aps.iva.u70.j) context).showSnackbar(cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentRatingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_content_rating, (ViewGroup) this, false);
        addView(inflate);
        if (inflate != null) {
            RatingControlsLayout ratingControlsLayout = (RatingControlsLayout) inflate;
            this.b = new com.amazon.aps.iva.vf.a(ratingControlsLayout, ratingControlsLayout, 0);
            this.c = com.amazon.aps.iva.kb0.f.b(new b(context));
            this.d = com.amazon.aps.iva.kb0.f.b(new a());
            return;
        }
        throw new NullPointerException("rootView");
    }
}
