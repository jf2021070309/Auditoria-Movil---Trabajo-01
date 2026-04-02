package com.amazon.aps.iva.d2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
public final class y {
    public static final n a = new n();

    public static StaticLayout a(CharSequence charSequence, int i, int i2, com.amazon.aps.iva.k2.f fVar, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(fVar, "paint");
        com.amazon.aps.iva.yb0.j.f(textDirectionHeuristic, "textDir");
        com.amazon.aps.iva.yb0.j.f(alignment, "alignment");
        return a.a(new a0(charSequence, i, i2, fVar, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2));
    }
}
