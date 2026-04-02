package com.kwad.components.core.webview.b.c;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.kwad.components.core.webview.b.a.p;
import com.kwad.components.core.webview.b.b.t;
import com.kwad.components.core.webview.b.b.y;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.webview.c.g;
import com.kwad.sdk.utils.be;
/* loaded from: classes.dex */
public class c extends a {
    private FrameLayout QX;
    private d VS;
    private p Xw;
    private ap Xx;
    private com.kwad.components.core.webview.b.e.d Xy = new com.kwad.components.core.webview.b.e.d() { // from class: com.kwad.components.core.webview.b.c.c.2
        @Override // com.kwad.components.core.webview.b.e.d
        public final void gi() {
            if (c.this.Xx != null) {
                c.this.Xx.rC();
                c.this.Xx.rD();
            }
        }

        @Override // com.kwad.components.core.webview.b.e.d
        public final void gq() {
            if (c.this.Xx != null) {
                c.this.Xx.rE();
                c.this.Xx.rF();
            }
        }
    };
    private String xH;

    /* JADX INFO: Access modifiers changed from: private */
    public void sb() {
        if (this.Xr.Xv != null) {
            this.Xr.Xv.gk();
        }
        com.kwad.components.core.webview.b.d.b.si().aT(getTkTemplateId());
        if (this.Xr.Xt != null) {
            this.Xr.Xt.callbackPageStatus(false, "render failed");
        }
    }

    @Override // com.kwad.components.core.webview.b.c.a, com.kwad.components.core.webview.b.i
    public final void a(p pVar) {
        this.Xw = pVar;
        long j = this.Xr.xM;
        if (this.Xw == null || j <= 0) {
            return;
        }
        y yVar = new y();
        yVar.nQ = (int) ((((float) j) / 1000.0f) + 0.5f);
        this.Xw.a(yVar);
    }

    @Override // com.kwad.components.core.webview.b.c.a, com.kwad.components.core.webview.b.i
    public final void a(t tVar) {
        super.a(tVar);
        d dVar = this.VS;
        if (dVar != null) {
            dVar.dismiss();
        }
        if (this.Xr.QN != null) {
            this.Xr.QN.G(true);
        }
    }

    @Override // com.kwad.components.core.webview.b.c.a
    protected final void a(b bVar) {
        super.a(bVar);
        this.xH = this.Xr.xH;
        this.VS = this.Xr.VS;
    }

    @Override // com.kwad.components.core.webview.b.c.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        d dVar = this.VS;
        if (dVar != null) {
            dVar.a(this.Xy);
        }
        if (this.Xr.Xt != null) {
            this.lt.a(new g() { // from class: com.kwad.components.core.webview.b.c.c.1
                @Override // com.kwad.sdk.core.webview.c.g
                public final void callTKBridge(String str) {
                    c.this.Xr.Xt.callTKBridge(str);
                }
            });
            this.Xr.Xt.a(this.lt);
            this.lt.a("hasTKBridge", Boolean.TRUE);
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(ap apVar) {
        this.Xx = apVar;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((be.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((be.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.core.webview.b.c.a, com.kwad.components.core.webview.b.i
    public void b(WebCloseStatus webCloseStatus) {
        super.b(webCloseStatus);
        if (this.Xr.Xt != null) {
            this.Xr.Xt.callbackDialogDismiss();
        }
    }

    public void cd() {
        d dVar = this.VS;
        if (dVar == null) {
            sb();
            return;
        }
        if (dVar.isShowing()) {
            this.VS.d(new DialogInterface.OnDismissListener() { // from class: com.kwad.components.core.webview.b.c.c.3
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    c.this.VS.e(this);
                    c.this.sb();
                }
            });
        } else {
            sb();
        }
        this.VS.dismiss();
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void ej() {
        if (this.Xr.Xt != null) {
            this.Xr.Xt.callbackPageStatus(true, null);
        }
    }

    @Override // com.kwad.components.core.webview.b.c.a, com.kwad.components.core.webview.b.i
    public final void eo() {
        super.eo();
        if (this.Xr.Xu) {
            if (this.Xr.QN != null) {
                this.Xr.QN.G(true);
                return;
            }
            return;
        }
        d dVar = this.VS;
        if (dVar != null) {
            dVar.dismiss();
        }
        if (this.Xr.QN != null) {
            this.Xr.QN.gr();
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public FrameLayout getTKContainer() {
        return this.QX;
    }

    @Override // com.kwad.components.core.webview.b.i
    public String getTkTemplateId() {
        return this.Xr.QP != null ? this.Xr.QP.templateId : j.b(this.xH, this.Xr.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.QX = (FrameLayout) findViewById(R.id.ksad_tk_dialog_container);
    }
}
