package com.kwad.components.ad.reward.presenter.f;

import com.kwad.components.ad.reward.j;
import com.kwad.components.core.webview.jshandler.ap;
/* loaded from: classes.dex */
public final class f implements j.a {
    private ap wL;
    private boolean wM;
    private boolean wN;

    private void ji() {
        ap apVar = this.wL;
        if (apVar == null || !this.wN) {
            return;
        }
        if (this.wM) {
            apVar.rG();
            return;
        }
        apVar.rC();
        this.wL.rD();
        this.wM = true;
    }

    public final void B(com.kwad.components.ad.reward.j jVar) {
        jVar.a(this);
    }

    public final void C(com.kwad.components.ad.reward.j jVar) {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rE();
            this.wL.rF();
        }
        jVar.b(this);
    }

    public final void c(ap apVar) {
        this.wL = apVar;
    }

    public final void cd() {
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rE();
            this.wL.rF();
        }
    }

    public final void ej() {
        ji();
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gl() {
        this.wN = true;
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gm() {
        this.wN = true;
        ji();
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void gn() {
        this.wN = false;
        ap apVar = this.wL;
        if (apVar != null) {
            apVar.rH();
        }
    }

    @Override // com.kwad.components.ad.reward.j.a
    public final void go() {
        this.wN = false;
    }

    public final boolean iU() {
        return this.wN;
    }
}
