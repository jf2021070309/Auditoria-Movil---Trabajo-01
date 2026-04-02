package com.kwad.components.core.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* loaded from: classes.dex */
public final class h extends ViewOutlineProvider {
    private float Zj;

    private h(float f) {
        this.Zj = f;
    }

    public static void b(View view, float f) {
        boolean z;
        if (f <= 0.0f) {
            view.setOutlineProvider(null);
            z = false;
        } else {
            view.setOutlineProvider(new h(f));
            z = true;
        }
        view.setClipToOutline(z);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.Zj);
    }
}
