package com.ellation.crunchyroll.presentation.showpage.cta;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.m40.c;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: ShowPageCtaLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/showpage/cta/ShowPageCtaLayout;", "Lcom/amazon/aps/iva/wy/g;", "Landroid/widget/TextView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getCtaText", "()Landroid/widget/TextView;", "ctaText", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ShowPageCtaLayout extends g {
    public static final /* synthetic */ l<Object>[] c = {q.a(ShowPageCtaLayout.class, "ctaText", "getCtaText()Landroid/widget/TextView;", 0)};
    public final v b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShowPageCtaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final TextView getCtaText() {
        return (TextView) this.b.getValue(this, c[0]);
    }

    public final void b1(c cVar) {
        j.f(cVar, "ctaModel");
        getCtaText().setText(cVar.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowPageCtaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = com.amazon.aps.iva.xw.g.c(R.id.show_page_cta_text, this);
        View.inflate(context, R.layout.layout_show_page_cta, this);
    }
}
