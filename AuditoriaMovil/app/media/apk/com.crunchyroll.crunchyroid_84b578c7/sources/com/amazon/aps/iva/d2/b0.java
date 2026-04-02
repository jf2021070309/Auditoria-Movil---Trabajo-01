package com.amazon.aps.iva.d2;

import android.text.Layout;
/* compiled from: TextLayout.kt */
/* loaded from: classes.dex */
public final class b0 {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (com.amazon.aps.iva.yb0.j.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (com.amazon.aps.iva.yb0.j.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
