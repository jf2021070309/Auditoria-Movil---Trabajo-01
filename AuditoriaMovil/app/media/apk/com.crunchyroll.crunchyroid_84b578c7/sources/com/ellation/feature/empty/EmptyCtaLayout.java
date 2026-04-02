package com.ellation.feature.empty;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.j60.b;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: EmptyCtaLayout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bRB\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/ellation/feature/empty/EmptyCtaLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/j60/b;", "", "textRes", "Lcom/amazon/aps/iva/kb0/q;", "setPrimaryButtonText", "Landroid/util/AttributeSet;", "b", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Lkotlin/Function1;", "Landroid/view/View;", "value", "c", "Lcom/amazon/aps/iva/xb0/l;", "getPrimaryButtonClickListener", "()Lcom/amazon/aps/iva/xb0/l;", "setPrimaryButtonClickListener", "(Lcom/amazon/aps/iva/xb0/l;)V", "primaryButtonClickListener", "Landroid/widget/Button;", "d", "Lcom/amazon/aps/iva/bc0/b;", "getPrimaryButton", "()Landroid/widget/Button;", "primaryButton", "feature_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EmptyCtaLayout extends g implements b {
    public static final /* synthetic */ l<Object>[] f = {q.a(EmptyCtaLayout.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0)};
    public final AttributeSet b;
    public com.amazon.aps.iva.xb0.l<? super View, com.amazon.aps.iva.kb0.q> c;
    public final v d;
    public final com.amazon.aps.iva.j60.a e;

    /* compiled from: EmptyCtaLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            j.f(view, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyCtaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static void b1(EmptyCtaLayout emptyCtaLayout) {
        j.f(emptyCtaLayout, "this$0");
        emptyCtaLayout.c.invoke(emptyCtaLayout.getPrimaryButton());
    }

    private final Button getPrimaryButton() {
        return (Button) this.d.getValue(this, f[0]);
    }

    public final AttributeSet getAttrs() {
        return this.b;
    }

    public final com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> getPrimaryButtonClickListener() {
        return this.c;
    }

    public final void setPrimaryButtonClickListener(com.amazon.aps.iva.xb0.l<? super View, com.amazon.aps.iva.kb0.q> lVar) {
        j.f(lVar, "value");
        this.c = lVar;
        getPrimaryButton().setOnClickListener(new com.amazon.aps.iva.ne.a(this, 22));
    }

    @Override // com.amazon.aps.iva.j60.b
    public void setPrimaryButtonText(int i) {
        getPrimaryButton().setText(i);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyCtaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = attributeSet;
        this.c = a.h;
        this.d = com.amazon.aps.iva.xw.g.c(R.id.empty_cta_primary_button, this);
        this.e = new com.amazon.aps.iva.j60.a(this, com.amazon.aps.iva.aq.k.n(context).b);
        View.inflate(context, R.layout.layout_empty_cta_view, this);
    }
}
