package com.kwad.components.ad.reward.presenter.d;

import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.e.h;
import com.kwad.components.ad.reward.e.l;
import com.kwad.components.ad.reward.presenter.d.b.c;
import com.kwad.components.ad.reward.presenter.d.b.d;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.b.e.e;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.mvp.Presenter;
import java.util.List;
/* loaded from: classes.dex */
public class a extends com.kwad.components.ad.reward.presenter.a implements f, h {
    private e gv = new e() { // from class: com.kwad.components.ad.reward.presenter.d.a.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", a.this.qB.mAdTemplate).equals(str)) {
                a.this.bV();
            }
        }
    };

    public a() {
        cc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(f fVar) {
        return getPriority() - fVar.getPriority();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        this.qB.b(this);
        com.kwad.components.ad.reward.b.fr().a(this);
    }

    private void eu() {
        List<Presenter> Gg = Gg();
        if (Gg == null) {
            return;
        }
        for (Presenter presenter : Gg) {
            if (presenter instanceof c) {
                ((c) presenter).iL();
            }
        }
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void a(PlayableSource playableSource, l lVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (com.kwad.components.ad.reward.j.b(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        } else {
            bV();
        }
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final void bE() {
        eu();
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bT() {
    }

    @Override // com.kwad.components.ad.reward.e.h
    public final void bU() {
        eu();
    }

    protected void cc() {
        a(new d());
        a(new com.kwad.components.ad.reward.presenter.d.b.a());
        a(new com.kwad.components.ad.reward.presenter.d.b.b());
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final int getPriority() {
        return 0;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.c(this);
        com.kwad.components.ad.reward.b.fr().b(this);
    }
}
