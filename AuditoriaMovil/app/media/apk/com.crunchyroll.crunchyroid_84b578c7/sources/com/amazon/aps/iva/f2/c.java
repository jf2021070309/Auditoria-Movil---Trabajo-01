package com.amazon.aps.iva.f2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.amazon.aps.iva.d2.i0;
import com.amazon.aps.iva.d2.l0;
/* compiled from: IndentationFixSpan.kt */
/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        boolean z2;
        if (layout != null && paint != null) {
            int lineForOffset = layout.getLineForOffset(i6);
            boolean z3 = true;
            if (lineForOffset == layout.getLineCount() - 1) {
                i0 i0Var = l0.a;
                if (layout.getEllipsisCount(lineForOffset) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    float b = d.b(layout, lineForOffset, paint) + d.a(layout, lineForOffset, paint);
                    if (b != 0.0f) {
                        z3 = false;
                    }
                    if (!z3) {
                        com.amazon.aps.iva.yb0.j.c(canvas);
                        canvas.translate(b, 0.0f);
                    }
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
