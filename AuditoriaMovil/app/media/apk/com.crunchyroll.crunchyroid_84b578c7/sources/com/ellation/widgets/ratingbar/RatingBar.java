package com.ellation.widgets.ratingbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.jm.s;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.q70.a;
import com.amazon.aps.iva.q70.b;
import com.amazon.aps.iva.q70.c;
import com.amazon.aps.iva.xw.h;
import com.amazon.aps.iva.xw.i;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RatingBar.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\tH\u0016R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/ellation/widgets/ratingbar/RatingBar;", "Landroid/widget/LinearLayout;", "Lcom/amazon/aps/iva/q70/b;", "", "rating", "Lcom/amazon/aps/iva/kb0/q;", "setPrimaryRating", "", "setSecondaryRating", "Lkotlin/Function1;", "ratingPickedListener", "setRatingPickedListener", "", "Landroid/widget/ImageView;", "d", "Lcom/amazon/aps/iva/bc0/b;", "getStars", "()Ljava/util/List;", "stars", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RatingBar extends LinearLayout implements b {
    public static final /* synthetic */ l<Object>[] f = {q.a(RatingBar.class, "stars", "getStars()Ljava/util/List;", 0)};
    public final int b;
    public final int c;
    public final v d;
    public final a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.d = new v(new h(new int[]{R.id.star_1, R.id.star_2, R.id.star_3, R.id.star_4, R.id.star_5}, i.h));
        View.inflate(context, R.layout.rating_bar, this);
        this.e = new a(this, getStars().size());
        int[] iArr = R.styleable.RatingBar;
        j.e(iArr, "RatingBar");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.b = obtainStyledAttributes.getColor(R.styleable.RatingBar_primaryRatingBarColor, 0);
        this.c = obtainStyledAttributes.getColor(R.styleable.RatingBar_secondaryRatingBarColor, 0);
        for (ImageView imageView : x.p0(getStars())) {
            t0.g(imageView, null, Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(R.styleable.RatingBar_starMargin, 0)), 1);
        }
        obtainStyledAttributes.recycle();
    }

    private final List<ImageView> getStars() {
        return (List) this.d.getValue(this, f[0]);
    }

    @Override // com.amazon.aps.iva.q70.b
    public final void Ue(int i, c cVar) {
        j.f(cVar, "starType");
        ImageView imageView = getStars().get(i);
        imageView.setImageResource(cVar.getResource());
        imageView.setImageTintList(ColorStateList.valueOf(this.c));
    }

    public void setPrimaryRating(float f2) {
        a aVar;
        c cVar;
        int i = (int) f2;
        boolean z = false;
        int i2 = 0;
        while (true) {
            aVar = this.e;
            if (i2 >= i) {
                break;
            }
            aVar.getView().zg(i2, c.FULLY_RATED);
            i2++;
        }
        int i3 = aVar.b;
        if (i < i3) {
            if (i != 0) {
                f2 %= i;
            }
            b view = aVar.getView();
            if (f2 == 0.0f) {
                z = true;
            }
            if (z) {
                cVar = c.NOT_RATED;
            } else if (f2 <= 0.25f) {
                cVar = c.TWENTY_FIVE_PERCENT_RATED;
            } else if (f2 <= 0.5f) {
                cVar = c.FIFTY_PERCENT_RATED;
            } else if (f2 <= 0.75f) {
                cVar = c.SEVENTY_FIVE_PERCENT_RATED;
            } else {
                cVar = c.FULLY_RATED;
            }
            view.zg(i, cVar);
            for (int i4 = i + 1; i4 < i3; i4++) {
                aVar.getView().zg(i4, c.NOT_RATED);
            }
        }
    }

    public void setRatingPickedListener(com.amazon.aps.iva.xb0.l<? super Integer, com.amazon.aps.iva.kb0.q> lVar) {
        j.f(lVar, "ratingPickedListener");
        for (ImageView imageView : getStars()) {
            imageView.setOnClickListener(new s(4, lVar, this));
        }
    }

    public void setSecondaryRating(int i) {
        a aVar;
        int i2 = 0;
        while (true) {
            aVar = this.e;
            if (i2 >= i) {
                break;
            }
            aVar.getView().Ue(i2, c.FULLY_RATED);
            i2++;
        }
        while (i < aVar.b) {
            aVar.getView().zg(i, c.NOT_RATED);
            i++;
        }
    }

    @Override // com.amazon.aps.iva.q70.b
    public final void zg(int i, c cVar) {
        j.f(cVar, "starType");
        ImageView imageView = getStars().get(i);
        imageView.setImageResource(cVar.getResource());
        imageView.setImageTintList(ColorStateList.valueOf(this.b));
    }
}
