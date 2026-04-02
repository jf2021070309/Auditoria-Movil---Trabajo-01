package com.amazon.aps.iva.f2;

import android.graphics.Paint;
import android.text.Layout;
import com.amazon.aps.iva.d2.i0;
import com.amazon.aps.iva.d2.l0;
/* compiled from: IndentationFixSpan.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: IndentationFixSpan.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final float a(Layout layout, int i, Paint paint) {
        boolean z;
        int i2;
        float abs;
        float width;
        com.amazon.aps.iva.yb0.j.f(layout, "<this>");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        float lineLeft = layout.getLineLeft(i);
        i0 i0Var = l0.a;
        if (layout.getEllipsisCount(i) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = a.a[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float b(Layout layout, int i, Paint paint) {
        boolean z;
        float width;
        float width2;
        com.amazon.aps.iva.yb0.j.f(layout, "<this>");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        i0 i0Var = l0.a;
        if (layout.getEllipsisCount(i) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = -1;
            if (layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
                float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
                if (paragraphAlignment != null) {
                    i2 = a.a[paragraphAlignment.ordinal()];
                }
                if (i2 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }
}
