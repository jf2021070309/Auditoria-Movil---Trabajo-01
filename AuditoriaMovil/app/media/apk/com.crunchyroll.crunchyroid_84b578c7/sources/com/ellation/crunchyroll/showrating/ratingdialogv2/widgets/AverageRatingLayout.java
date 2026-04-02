package com.ellation.crunchyroll.showrating.ratingdialogv2.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.o50.b;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.text.NumberFormat;
import kotlin.Metadata;
/* compiled from: AverageRatingLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/crunchyroll/showrating/ratingdialogv2/widgets/AverageRatingLayout;", "Lcom/amazon/aps/iva/wy/g;", "show-rating_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AverageRatingLayout extends g {
    public final NumberFormat b;
    public final b c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AverageRatingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AverageRatingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = NumberFormat.getIntegerInstance();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_average_rating, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.average_rating;
        TextView textView = (TextView) z.u(R.id.average_rating, inflate);
        if (textView != null) {
            i2 = R.id.average_rating_count;
            TextView textView2 = (TextView) z.u(R.id.average_rating_count, inflate);
            if (textView2 != null) {
                i2 = R.id.average_rating_detail;
                TextView textView3 = (TextView) z.u(R.id.average_rating_detail, inflate);
                if (textView3 != null) {
                    i2 = R.id.average_rating_divider;
                    if (((ImageView) z.u(R.id.average_rating_divider, inflate)) != null) {
                        i2 = R.id.average_rating_header;
                        if (((TextView) z.u(R.id.average_rating_header, inflate)) != null) {
                            this.c = new b((ConstraintLayout) inflate, textView, textView2, textView3);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
