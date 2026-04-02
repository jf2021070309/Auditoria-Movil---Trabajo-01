package com.kwad.components.core.webview.b.a;

import com.kwad.components.core.webview.b.b.y;
/* loaded from: classes.dex */
public class p extends v {
    private boolean IO = true;

    public final void a(y yVar) {
        if (this.IO) {
            super.b(yVar);
        }
    }

    @Override // com.kwad.components.core.webview.b.a.v, com.kwad.sdk.core.webview.c.a
    public void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        super.a(str, cVar);
    }

    public final void aO(boolean z) {
        this.IO = false;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerVideoProgressListener";
    }
}
