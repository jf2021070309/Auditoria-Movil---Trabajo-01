package com.kwad.components.ad.splashscreen.c.a;
/* loaded from: classes.dex */
public final class f extends com.kwad.components.ad.splashscreen.c.e {
    com.kwad.components.ad.splashscreen.f EF = new com.kwad.components.ad.splashscreen.f() { // from class: com.kwad.components.ad.splashscreen.c.a.f.1
        @Override // com.kwad.components.ad.splashscreen.f
        public final void kB() {
            f.this.a(new e(), true);
            f.this.a(new g(), true);
        }
    };

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.CS.a(this.EF);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.CS.b(this.EF);
    }
}
