package com.ellation.crunchyroll.showrating.ratingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.c8.k;
import com.amazon.aps.iva.cm.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.p50.c;
import com.amazon.aps.iva.s50.e;
import com.amazon.aps.iva.s50.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.ratingbar.RatingBar;
import kotlin.Metadata;
/* compiled from: ShowRatingView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/showrating/ratingview/ShowRatingLayout;", "Lcom/amazon/aps/iva/s50/g;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "show-rating_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ShowRatingLayout extends ConstraintLayout implements g {
    public static final /* synthetic */ int e = 0;
    public final a b;
    public e c;
    public FragmentManager d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShowRatingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void Lh() {
        this.b.a().setOnClickListener(new k(this, 20));
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void M9(float f) {
        ((RatingBar) this.b.j).setPrimaryRating(f);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void Mf() {
        LinearLayout linearLayout = (LinearLayout) this.b.g;
        j.e(linearLayout, "binding.contentRatingAverageContainer");
        linearLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void O5() {
        LinearLayout linearLayout = (LinearLayout) this.b.g;
        j.e(linearLayout, "binding.contentRatingAverageContainer");
        linearLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void Oc() {
        setVisibility(0);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void Q3() {
        c cVar = new c();
        FragmentManager fragmentManager = this.d;
        if (fragmentManager != null) {
            cVar.show(new androidx.fragment.app.a(fragmentManager), "rating");
        } else {
            j.m("fragmentManager");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.s50.g
    public final boolean Re() {
        a aVar = this.b;
        FrameLayout frameLayout = aVar.e;
        j.e(frameLayout, "binding.contentRatingContainer");
        int centerY = t0.b(frameLayout).centerY();
        RatingBar ratingBar = (RatingBar) aVar.j;
        j.e(ratingBar, "binding.ratingBar");
        if (centerY > t0.b(ratingBar).centerY()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void Tc(String str) {
        j.f(str, "ratesCount");
        ((TextView) this.b.i).setText(getResources().getString(R.string.show_rating_content_rating_rates_count, str));
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void je() {
        View view = this.b.f;
        j.e(view, "binding.contentRatingSeparator");
        view.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void ka(float f) {
        ((RatingBar) this.b.j).setSecondaryRating((int) f);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void kg() {
        TextView textView = (TextView) this.b.h;
        j.e(textView, "binding.contentRatingNoRatingsLabel");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void r3() {
        TextView textView = (TextView) this.b.h;
        j.e(textView, "binding.contentRatingNoRatingsLabel");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void s6() {
        View view = this.b.f;
        j.e(view, "binding.contentRatingSeparator");
        view.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void u0() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.s50.g
    public final void wd(String str) {
        j.f(str, "ratingAverage");
        this.b.c.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowRatingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_show_rating, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.content_rating_average;
        TextView textView = (TextView) z.u(R.id.content_rating_average, inflate);
        if (textView != null) {
            i2 = R.id.content_rating_average_container;
            LinearLayout linearLayout = (LinearLayout) z.u(R.id.content_rating_average_container, inflate);
            if (linearLayout != null) {
                i2 = R.id.content_rating_average_Label;
                TextView textView2 = (TextView) z.u(R.id.content_rating_average_Label, inflate);
                if (textView2 != null) {
                    i2 = R.id.content_rating_container;
                    FrameLayout frameLayout = (FrameLayout) z.u(R.id.content_rating_container, inflate);
                    if (frameLayout != null) {
                        i2 = R.id.content_rating_no_ratings_label;
                        TextView textView3 = (TextView) z.u(R.id.content_rating_no_ratings_label, inflate);
                        if (textView3 != null) {
                            i2 = R.id.content_rating_separator;
                            View u = z.u(R.id.content_rating_separator, inflate);
                            if (u != null) {
                                i2 = R.id.content_rating_total_rates;
                                TextView textView4 = (TextView) z.u(R.id.content_rating_total_rates, inflate);
                                if (textView4 != null) {
                                    i2 = R.id.rating_bar;
                                    RatingBar ratingBar = (RatingBar) z.u(R.id.rating_bar, inflate);
                                    if (ratingBar != null) {
                                        this.b = new a((ConstraintLayout) inflate, textView, linearLayout, textView2, frameLayout, textView3, u, textView4, ratingBar);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
