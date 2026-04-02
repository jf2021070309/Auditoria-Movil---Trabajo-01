package com.amazon.aps.iva.xi;

import android.webkit.JavascriptInterface;
import com.amazon.aps.iva.kb0.q;
import com.crunchyroll.octopussubtitlescomponent.renderrer.OctopusSubtitlesView;
/* compiled from: OctopusSubtitlesView.kt */
/* loaded from: classes.dex */
public final class e {
    public final com.amazon.aps.iva.wi.b a;
    public final boolean b;
    public final com.amazon.aps.iva.xb0.a<q> c;

    public e(com.amazon.aps.iva.wi.b bVar, boolean z, OctopusSubtitlesView.c cVar) {
        this.a = bVar;
        this.b = z;
        this.c = cVar;
    }

    @JavascriptInterface
    public final boolean isDebugBuild() {
        return this.b;
    }

    @JavascriptInterface
    public final void onOctopusError() {
        this.a.e();
    }

    @JavascriptInterface
    public final void onOctopusReady() {
        this.c.invoke();
        this.a.b();
    }
}
