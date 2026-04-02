package com.kwad.components.ad.splashscreen.c.a;

import com.kwad.components.core.webview.b.j;
/* loaded from: classes.dex */
public final class e extends com.kwad.components.ad.splashscreen.c.e {
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.splashscreen.c.a.e.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-splash-end-card", e.this.CS.mAdTemplate).equals(str)) {
                e.this.a(new d(), true);
                e.this.a(new a(), true);
                e.this.a(new b(), true);
                e.this.a(new c(), true);
            }
        }
    };

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.components.core.webview.b.d.b.si().a(this.gv);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
    }
}
