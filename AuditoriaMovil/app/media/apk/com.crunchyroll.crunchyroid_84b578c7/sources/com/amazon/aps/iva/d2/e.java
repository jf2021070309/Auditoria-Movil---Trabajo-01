package com.amazon.aps.iva.d2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextUtils;
/* compiled from: BoringLayoutFactory.kt */
/* loaded from: classes.dex */
public final class e {
    public static BoringLayout a(CharSequence charSequence, com.amazon.aps.iva.k2.f fVar, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(fVar, "paint");
        com.amazon.aps.iva.yb0.j.f(alignment, "alignment");
        boolean z4 = true;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i2 < 0) {
                z4 = false;
            }
            if (z4) {
                if (Build.VERSION.SDK_INT >= 33) {
                    return d.a(charSequence, fVar, i, alignment, 1.0f, 0.0f, metrics, z, z2, truncateAt, i2);
                }
                return f.a(charSequence, fVar, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
