package com.kwad.components.core.webview.jshandler;

import android.os.Vibrator;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class o implements com.kwad.sdk.core.webview.c.a {
    private Vibrator dP;

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.dP = (Vibrator) ServiceProvider.getContext().getSystemService("vibrator");
        bj.a(ServiceProvider.getContext(), this.dP);
        cVar.a(null);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "startVibrate";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
