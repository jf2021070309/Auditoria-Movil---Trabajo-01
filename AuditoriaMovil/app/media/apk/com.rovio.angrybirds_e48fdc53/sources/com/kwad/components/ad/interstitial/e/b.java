package com.kwad.components.ad.interstitial.e;

import android.view.View;
import com.kwad.sdk.utils.bm;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.core.widget.a.a {
    private View mRootView;

    public b(View view, int i) {
        super(view, 100);
        this.mRootView = view;
    }

    @Override // com.kwad.components.core.widget.a.a
    public final boolean er() {
        return bm.o(this.mRootView, 100);
    }
}
