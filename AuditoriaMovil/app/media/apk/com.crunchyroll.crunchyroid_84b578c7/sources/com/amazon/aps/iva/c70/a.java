package com.amazon.aps.iva.c70;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.R;
/* compiled from: BottomMessageView.kt */
/* loaded from: classes2.dex */
public abstract class a extends g {
    public static final /* synthetic */ int e = 0;
    public final m b;
    public final m c;
    public ValueAnimator d;

    /* compiled from: BottomMessageView.kt */
    /* renamed from: com.amazon.aps.iva.c70.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0164a extends l implements com.amazon.aps.iva.xb0.a<Integer> {
        public C0164a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Integer invoke() {
            return Integer.valueOf(t0.c(a.this).height());
        }
    }

    /* compiled from: BottomMessageView.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<TextView> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final TextView invoke() {
            return (TextView) a.this.getMessageLayout().findViewById(R.id.text);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMessageHeight() {
        return ((Number) this.b.getValue()).intValue();
    }

    private final TextView getMessageTextView() {
        Object value = this.c.getValue();
        j.e(value, "<get-messageTextView>(...)");
        return (TextView) value;
    }

    public final void G4() {
        t0.h(this, null, null, null, Integer.valueOf(-getMessageHeight()), 7);
        setVisibility(8);
    }

    public final void H6(String str, String str2) {
        TextView messageTextView = getMessageTextView();
        messageTextView.setText(str);
        messageTextView.setContentDescription(str2);
        t0.h(this, null, null, null, 0, 7);
        setVisibility(0);
    }

    public final void Oa(int i, long j, Interpolator interpolator) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        ofInt.setDuration(j);
        ofInt.setInterpolator(interpolator);
        ofInt.addUpdateListener(new com.amazon.aps.iva.c8.m(this, 2));
        ofInt.addListener(new com.amazon.aps.iva.c70.b(i, this, i));
        this.d = ofInt;
        ofInt.start();
    }

    public void R4() {
        G4();
    }

    public final void U2() {
        Interpolator b2 = com.amazon.aps.iva.r3.a.b(0.4f, 0.0f, 1.0f, 1.0f);
        j.d(b2, "null cannot be cast to non-null type android.animation.TimeInterpolator");
        Oa(-getMessageHeight(), 80L, b2);
        getMessageTextView().setContentDescription("");
    }

    public final void X7(String str, String str2) {
        Interpolator b2 = com.amazon.aps.iva.r3.a.b(0.0f, 0.0f, 0.2f, 1.0f);
        j.d(b2, "null cannot be cast to non-null type android.animation.TimeInterpolator");
        Oa(0, 150L, b2);
        TextView messageTextView = getMessageTextView();
        messageTextView.setText(str);
        messageTextView.setContentDescription(str2);
    }

    public abstract ViewGroup getMessageLayout();

    public void gh() {
        U2();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = f.b(new C0164a());
        this.c = f.b(new b());
    }
}
