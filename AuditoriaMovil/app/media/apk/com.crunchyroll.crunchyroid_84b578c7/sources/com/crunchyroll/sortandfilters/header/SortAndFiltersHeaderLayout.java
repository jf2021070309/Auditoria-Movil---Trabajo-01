package com.crunchyroll.sortandfilters.header;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.on.f;
import com.amazon.aps.iva.rn.c;
import com.amazon.aps.iva.t3.e;
import com.amazon.aps.iva.wf.d;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: SortAndFiltersHeaderLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0014\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0014\u0010\u0007\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0012\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/crunchyroll/sortandfilters/header/SortAndFiltersHeaderLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/rn/c;", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", "onClick", "setOnFilterClick", "setOnSortClick", "", "sortTextResId", "setCurrentSort", "sortandfilters_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SortAndFiltersHeaderLayout extends g implements c {
    public static final /* synthetic */ int c = 0;
    public final f b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SortAndFiltersHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.rn.c
    public final void M7() {
        Context context = getContext();
        j.e(context, "context");
        e.c(this.b.c, ColorStateList.valueOf(a.getColor(context, R.color.color_white)));
    }

    @Override // com.amazon.aps.iva.rn.c
    public final void qh() {
        Context context = getContext();
        j.e(context, "context");
        e.c(this.b.c, ColorStateList.valueOf(a.getColor(context, R.color.cr_teal)));
    }

    @Override // com.amazon.aps.iva.rn.c
    public void setCurrentSort(int i) {
        this.b.d.setText(i);
    }

    public final void setOnFilterClick(com.amazon.aps.iva.xb0.a<q> aVar) {
        j.f(aVar, "onClick");
        this.b.c.setOnClickListener(new com.amazon.aps.iva.rn.a(0, aVar));
    }

    public final void setOnSortClick(com.amazon.aps.iva.xb0.a<q> aVar) {
        j.f(aVar, "onClick");
        this.b.e.setOnClickListener(new d(1, aVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortAndFiltersHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_sort_and_filters_header, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.sort_and_filter_header_current_sort_text;
        TextView textView = (TextView) z.u(R.id.sort_and_filter_header_current_sort_text, inflate);
        if (textView != null) {
            i2 = R.id.sort_and_filters_header_filter_button;
            ImageView imageView = (ImageView) z.u(R.id.sort_and_filters_header_filter_button, inflate);
            if (imageView != null) {
                i2 = R.id.sort_and_filters_header_sort_button;
                ImageView imageView2 = (ImageView) z.u(R.id.sort_and_filters_header_sort_button, inflate);
                if (imageView2 != null) {
                    this.b = new f((ConstraintLayout) inflate, textView, imageView, imageView2);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
