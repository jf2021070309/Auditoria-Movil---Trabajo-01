package com.amazon.aps.iva.d2;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
public final class x {
    public static final boolean a(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        com.amazon.aps.iva.yb0.j.f(staticLayout, "layout");
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(StaticLayout.Builder builder, int i, int i2) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        com.amazon.aps.iva.yb0.j.f(builder, "builder");
        lineBreakStyle = w.b().setLineBreakStyle(i);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i2);
        build = lineBreakWordStyle.build();
        com.amazon.aps.iva.yb0.j.e(build, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(build);
    }
}
