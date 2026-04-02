package com.crunchyroll.sortandfilters.currentfilters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.mn.h;
import com.amazon.aps.iva.mn.i;
import com.amazon.aps.iva.nn.b;
import com.amazon.aps.iva.nn.c;
import com.amazon.aps.iva.nn.e;
import com.amazon.aps.iva.on.d;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.mvp.lifecycle.a;
import kotlin.Metadata;
/* compiled from: CurrentFiltersLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/crunchyroll/sortandfilters/currentfilters/CurrentFiltersLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/nn/c;", "", "text", "Lcom/amazon/aps/iva/kb0/q;", "setCurrentFiltersText", "sortandfilters_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CurrentFiltersLayout extends g implements c {
    public static final /* synthetic */ int d = 0;
    public b b;
    public final d c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurrentFiltersLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public final void b1(i iVar, h hVar) {
        j.f(iVar, "interactor");
        j.f(hVar, "sortAndFiltersAnalytics");
        Context context = getContext();
        j.e(context, "context");
        b bVar = new b(this, iVar, new e(context), hVar);
        a.b(bVar, this);
        this.b = bVar;
        ((ImageView) this.c.c).setOnClickListener(new com.amazon.aps.iva.fe.a(this, 3));
    }

    @Override // com.amazon.aps.iva.nn.c
    public void setCurrentFiltersText(String str) {
        j.f(str, "text");
        ((TextView) this.c.d).setText(getContext().getString(R.string.current_filters_text, str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentFiltersLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_current_filters, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.current_filters_clear_button;
        ImageView imageView = (ImageView) z.u(R.id.current_filters_clear_button, inflate);
        if (imageView != null) {
            i2 = R.id.current_filters_text;
            TextView textView = (TextView) z.u(R.id.current_filters_text, inflate);
            if (textView != null) {
                this.c = new d((ConstraintLayout) inflate, imageView, textView, 0);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
