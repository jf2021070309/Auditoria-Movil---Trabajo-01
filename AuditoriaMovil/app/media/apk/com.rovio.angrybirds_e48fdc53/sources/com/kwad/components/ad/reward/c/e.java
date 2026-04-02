package com.kwad.components.ad.reward.c;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class e implements com.kwad.sdk.core.webview.c.a {
    private String TAG;
    private com.kwad.sdk.core.webview.c.c nE;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public String rB;
    }

    public e() {
        String str = "ExtraDialogListener" + hashCode();
        this.TAG = str;
        com.kwad.sdk.core.e.c.d(str, "create: ");
    }

    private void O(String str) {
        if (TextUtils.isEmpty(str) || this.nE == null) {
            return;
        }
        a aVar = new a();
        aVar.rB = str;
        this.nE.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        String str2 = this.TAG;
        com.kwad.sdk.core.e.c.d(str2, "handleJsCall: " + cVar);
        this.nE = cVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerExtraDialogListener";
    }

    public final void hd() {
        com.kwad.sdk.core.e.c.d(this.TAG, "notifyDialogClose: ");
        O("close");
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        com.kwad.sdk.core.e.c.d(this.TAG, "onDestroy: ");
        this.nE = null;
    }
}
