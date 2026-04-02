package com.kwad.components.core.webview.jshandler;
/* loaded from: classes.dex */
public final class al implements com.kwad.sdk.core.webview.c.a {
    private com.kwad.sdk.core.webview.c.c Tx;
    private a Vm = new a();

    /* loaded from: classes.dex */
    public class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
        public int id;
        public int status;

        public a() {
        }
    }

    private void p(int i, int i2) {
        if (this.Tx != null) {
            this.Vm.id = i;
            this.Vm.status = 2;
            this.Tx.a(this.Vm);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        this.Tx = cVar;
    }

    public final void aN(int i) {
        p(1, 2);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "registerAnimationListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.Tx = null;
    }
}
