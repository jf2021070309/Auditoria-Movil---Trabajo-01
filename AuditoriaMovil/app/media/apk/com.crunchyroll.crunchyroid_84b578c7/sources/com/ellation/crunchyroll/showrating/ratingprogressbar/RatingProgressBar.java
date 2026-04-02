package com.ellation.crunchyroll.showrating.ratingprogressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.r50.b;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: RatingProgressBar.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/showrating/ratingprogressbar/RatingProgressBar;", "Landroid/widget/LinearLayout;", "Lcom/amazon/aps/iva/r50/b;", "Landroid/widget/ImageView;", "d", "Lcom/amazon/aps/iva/bc0/b;", "getStar", "()Landroid/widget/ImageView;", "star", "Landroid/widget/TextView;", "e", "getStarNumber", "()Landroid/widget/TextView;", "starNumber", "Landroid/widget/ProgressBar;", "f", "getRatingProgress", "()Landroid/widget/ProgressBar;", "ratingProgress", "g", "getRatingPercentage", "ratingPercentage", "show-rating_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RatingProgressBar extends LinearLayout implements b {
    public static final /* synthetic */ l<Object>[] h = {q.a(RatingProgressBar.class, "star", "getStar()Landroid/widget/ImageView;", 0), q.a(RatingProgressBar.class, "starNumber", "getStarNumber()Landroid/widget/TextView;", 0), q.a(RatingProgressBar.class, "ratingProgress", "getRatingProgress()Landroid/widget/ProgressBar;", 0), q.a(RatingProgressBar.class, "ratingPercentage", "getRatingPercentage()Landroid/widget/TextView;", 0)};
    public final int b;
    public final int c;
    public final v d;
    public final v e;
    public final v f;
    public final v g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.b = a.getColor(context, R.color.color_white);
        this.c = a.getColor(context, R.color.primary);
        this.d = g.c(R.id.rating_star, this);
        this.e = g.c(R.id.rating_star_number, this);
        this.f = g.c(R.id.rating_progress, this);
        this.g = g.c(R.id.rating_percentage, this);
        com.amazon.aps.iva.r50.a aVar = new com.amazon.aps.iva.r50.a(this);
        View.inflate(context, R.layout.rating_progress_bar, this);
        getStarNumber().setText(getTag().toString());
        G();
        aVar.onCreate();
    }

    private final TextView getRatingPercentage() {
        return (TextView) this.g.getValue(this, h[3]);
    }

    private final ProgressBar getRatingProgress() {
        return (ProgressBar) this.f.getValue(this, h[2]);
    }

    private final ImageView getStar() {
        return (ImageView) this.d.getValue(this, h[0]);
    }

    private final TextView getStarNumber() {
        return (TextView) this.e.getValue(this, h[1]);
    }

    public final void G() {
        ImageView star = getStar();
        int i = this.b;
        star.setColorFilter(i);
        getStarNumber().setTextColor(i);
        getRatingProgress().setProgressTintList(ColorStateList.valueOf(i));
        getRatingPercentage().setTextColor(i);
    }

    @Override // com.amazon.aps.iva.r50.b
    public final void L8(int i) {
        getRatingProgress().setProgress(i);
        getRatingPercentage().setText(getContext().getString(R.string.rating_progress_bar_percentage_format, Integer.valueOf(i)));
    }

    public final void b1() {
        ImageView star = getStar();
        int i = this.c;
        star.setColorFilter(i);
        getStarNumber().setTextColor(i);
        getRatingProgress().setProgressTintList(ColorStateList.valueOf(i));
        getRatingPercentage().setTextColor(i);
    }
}
