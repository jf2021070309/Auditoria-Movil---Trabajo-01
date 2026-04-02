package com.kwad.components.ad.splashscreen.c.c;

import android.content.Context;
import com.kwad.components.core.webview.b.h;
/* loaded from: classes.dex */
public final class a extends h {
    public a(Context context, int i, int i2) {
        super(context, i, i2);
    }

    @Override // com.kwad.components.core.webview.b.h
    public final void ad(String str) {
        com.kwad.components.ad.splashscreen.monitor.a.kP().b(rO(), str);
    }

    @Override // com.kwad.components.core.webview.b.h
    public final void ae(String str) {
        com.kwad.components.ad.splashscreen.monitor.a.kP().c(rO(), str);
    }
}
