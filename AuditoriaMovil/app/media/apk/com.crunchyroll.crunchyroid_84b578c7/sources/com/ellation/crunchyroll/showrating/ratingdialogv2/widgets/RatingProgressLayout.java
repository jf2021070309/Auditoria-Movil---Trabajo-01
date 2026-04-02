package com.ellation.crunchyroll.showrating.ratingdialogv2.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.q50.b;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.showrating.ratingprogressbar.RatingProgressBar;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: RatingProgressLayout.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/showrating/ratingdialogv2/widgets/RatingProgressLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/q50/b;", "", "Lcom/ellation/crunchyroll/showrating/ratingprogressbar/RatingProgressBar;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getProgressStars", "()Ljava/util/List;", "progressStars", "show-rating_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RatingProgressLayout extends g implements b {
    public final com.amazon.aps.iva.ny.a b;
    public final m c;
    public final com.amazon.aps.iva.q50.a d;

    /* compiled from: RatingProgressLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<List<? extends RatingProgressBar>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends RatingProgressBar> invoke() {
            com.amazon.aps.iva.ny.a aVar = RatingProgressLayout.this.b;
            return f1.K((RatingProgressBar) aVar.g, (RatingProgressBar) aVar.f, (RatingProgressBar) aVar.e, (RatingProgressBar) aVar.d, (RatingProgressBar) aVar.c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingProgressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final List<RatingProgressBar> getProgressStars() {
        return (List) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.q50.b
    public final void Fc(int i) {
        getProgressStars().get(i).b1();
    }

    @Override // com.amazon.aps.iva.q50.b
    public final void P8() {
        for (RatingProgressBar ratingProgressBar : getProgressStars()) {
            ratingProgressBar.G();
        }
    }

    @Override // com.amazon.aps.iva.q50.b
    public final void Q4(int i, int i2) {
        getProgressStars().get(i).L8(i2);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingProgressLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_rating_progress, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.rating_progress_bar_1;
        RatingProgressBar ratingProgressBar = (RatingProgressBar) z.u(R.id.rating_progress_bar_1, inflate);
        if (ratingProgressBar != null) {
            i2 = R.id.rating_progress_bar_2;
            RatingProgressBar ratingProgressBar2 = (RatingProgressBar) z.u(R.id.rating_progress_bar_2, inflate);
            if (ratingProgressBar2 != null) {
                i2 = R.id.rating_progress_bar_3;
                RatingProgressBar ratingProgressBar3 = (RatingProgressBar) z.u(R.id.rating_progress_bar_3, inflate);
                if (ratingProgressBar3 != null) {
                    i2 = R.id.rating_progress_bar_4;
                    RatingProgressBar ratingProgressBar4 = (RatingProgressBar) z.u(R.id.rating_progress_bar_4, inflate);
                    if (ratingProgressBar4 != null) {
                        i2 = R.id.rating_progress_bar_5;
                        RatingProgressBar ratingProgressBar5 = (RatingProgressBar) z.u(R.id.rating_progress_bar_5, inflate);
                        if (ratingProgressBar5 != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            this.b = new com.amazon.aps.iva.ny.a(linearLayout, ratingProgressBar, ratingProgressBar2, ratingProgressBar3, ratingProgressBar4, ratingProgressBar5, linearLayout);
                            this.c = f.b(new a());
                            this.d = new com.amazon.aps.iva.q50.a(this);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
