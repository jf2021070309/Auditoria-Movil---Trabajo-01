package com.amazon.aps.iva.d2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: BoringLayoutFactory.kt */
/* loaded from: classes.dex */
public final class f {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(textPaint, "paint");
        com.amazon.aps.iva.yb0.j.f(alignment, "alignment");
        com.amazon.aps.iva.yb0.j.f(metrics, "metrics");
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(textPaint, "paint");
        com.amazon.aps.iva.yb0.j.f(textDirectionHeuristic, "textDir");
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
