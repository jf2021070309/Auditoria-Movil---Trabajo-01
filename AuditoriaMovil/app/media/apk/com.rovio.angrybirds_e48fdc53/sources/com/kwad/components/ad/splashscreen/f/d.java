package com.kwad.components.ad.splashscreen.f;

import android.view.View;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.core.widget.a.b {
    public d(View view, int i) {
        super(view, i);
    }

    @Override // com.kwad.components.core.widget.a.b, com.kwad.components.core.widget.a.a
    public final boolean er() {
        com.kwad.sdk.core.c.b.AT();
        if (com.kwad.sdk.core.c.b.isEnable()) {
            com.kwad.sdk.core.c.b.AT();
            return com.kwad.sdk.core.c.b.isAppOnForeground() && super.er();
        }
        return super.er();
    }
}
