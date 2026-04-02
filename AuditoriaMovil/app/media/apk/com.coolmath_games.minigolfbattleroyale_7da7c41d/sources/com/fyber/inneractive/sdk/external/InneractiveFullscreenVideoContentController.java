package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.d.q;
import com.fyber.inneractive.sdk.d.r;
import com.fyber.inneractive.sdk.i.h;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class InneractiveFullscreenVideoContentController extends r {
    WeakReference<h> a;

    public void setControlledRenderer(h hVar) {
        this.a = new WeakReference<>(hVar);
    }

    @Override // com.fyber.inneractive.sdk.d.k
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof q;
    }
}
