package com.ellation.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.q.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import com.google.common.primitives.Ints;
import kotlin.Metadata;
/* compiled from: FixedAspectRatioImageView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/widgets/FixedAspectRatioImageView;", "Lcom/amazon/aps/iva/q/q;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FixedAspectRatioImageView extends q {
    public final int b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.b;
        if (i4 > 0 && (i3 = this.c) > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && (mode2 == 0 || mode2 == Integer.MIN_VALUE)) {
                size2 = (i3 * size) / i4;
            } else if (mode2 == 1073741824 && (mode == 0 || mode == Integer.MIN_VALUE)) {
                size = (i4 * size2) / i3;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(size2, Ints.MAX_POWER_OF_TWO));
            return;
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = -1;
        this.c = -1;
        int[] iArr = R.styleable.FixedAspectRatioImageView;
        j.e(iArr, "FixedAspectRatioImageView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.b = obtainStyledAttributes.getInt(R.styleable.FixedAspectRatioImageView_fixedAspectWidth, -1);
        this.c = obtainStyledAttributes.getInt(R.styleable.FixedAspectRatioImageView_fixedAspectHeight, -1);
        obtainStyledAttributes.recycle();
    }
}
