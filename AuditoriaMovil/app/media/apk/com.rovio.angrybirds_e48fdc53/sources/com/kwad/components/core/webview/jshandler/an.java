package com.kwad.components.core.webview.jshandler;
/* loaded from: classes.dex */
public final class an implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c Tx;
    private c Vq;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int status;
    }

    /* loaded from: classes.dex */
    public interface b {
        void oZ();
    }

    /* loaded from: classes.dex */
    public interface c {
        void pc();
    }

    public an(c cVar) {
        this.Vq = cVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
        c cVar2 = this.Vq;
        if (cVar2 != null) {
            cVar2.pc();
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerBackClickListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Tx = null;
    }

    public final void rB() {
        if (this.Tx != null) {
            a aVar = new a();
            aVar.status = 1;
            this.Tx.a(aVar);
        }
    }
}
