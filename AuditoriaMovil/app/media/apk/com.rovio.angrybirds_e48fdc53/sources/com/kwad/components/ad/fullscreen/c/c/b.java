package com.kwad.components.ad.fullscreen.c.c;

import android.os.Vibrator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.e.h;
import com.kwad.components.ad.reward.e.l;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.jshandler.ar;
import com.kwad.sdk.R;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.g.d;
import com.kwad.sdk.core.imageloader.ImageLoaderProxy;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.f.a {
    private d dO;
    private Vibrator dP;
    private FrameLayout hm;
    private ImageView hn;
    private h ho = new h() { // from class: com.kwad.components.ad.fullscreen.c.c.b.1
        @Override // com.kwad.components.ad.reward.e.h
        public final void a(PlayableSource playableSource, l lVar) {
        }

        @Override // com.kwad.components.ad.reward.e.h
        public final void bT() {
            b.this.hm.setVisibility(0);
        }

        @Override // com.kwad.components.ad.reward.e.h
        public final void bU() {
            b.this.hm.setVisibility(4);
        }
    };
    private f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.fullscreen.c.c.b.2
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            if (b.this.dO != null) {
                b.this.dO.bj(b.this.getContext());
            }
            if (b.this.hn != null) {
                b.this.hn.setVisibility(0);
            }
            if (com.kwad.sdk.core.response.b.a.am(com.kwad.sdk.core.response.b.d.ck(b.this.qB.mAdTemplate))) {
                b.this.hm.setVisibility(4);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        if (this.dO != null) {
            return;
        }
        float ds = com.kwad.sdk.core.response.b.b.ds(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate));
        d dVar = new d(ds);
        this.dO = dVar;
        dVar.a(new com.kwad.sdk.core.g.b() { // from class: com.kwad.components.ad.fullscreen.c.c.b.3
            @Override // com.kwad.sdk.core.g.b
            public final void a(double d) {
                if (com.kwad.components.core.e.c.b.nd() || !b.this.iU()) {
                    bj.a(new Runnable() { // from class: com.kwad.components.ad.fullscreen.c.c.b.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.this.dO.CF();
                        }
                    }, null, 500L);
                    return;
                }
                if (b.this.qB != null) {
                    j jVar = new j();
                    jVar.i(d);
                    b.this.qB.a(1, b.this.getContext(), 157, 1, 0L, false, jVar);
                }
                bj.a(new Runnable() { // from class: com.kwad.components.ad.fullscreen.c.c.b.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.d("TKFullScreenVideoPresenter", "onShakeEvent openGate2");
                        b.this.dO.CF();
                    }
                }, null, 500L);
                bj.a(b.this.getContext(), b.this.dP);
            }

            @Override // com.kwad.sdk.core.g.b
            public final void aT() {
            }
        });
        this.dO.e(ds);
        this.dO.bi(getContext());
        if (getContext() != null) {
            this.dP = (Vibrator) getContext().getSystemService("vibrator");
        }
    }

    private void cf() {
        final String I = com.kwad.sdk.core.response.b.a.I(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate));
        bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.fullscreen.c.c.b.5
            @Override // java.lang.Runnable
            public final void run() {
                ImageLoaderProxy.INSTANCE.load(b.this.hn, I);
            }
        }, 1000L);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.a, com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.components.l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(new ar(new ar.a() { // from class: com.kwad.components.ad.fullscreen.c.c.b.4
            @Override // com.kwad.components.core.webview.jshandler.ar.a
            public final void bA() {
                b.this.bs();
            }
        }));
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        ImageView imageView;
        ImageView.ScaleType scaleType;
        super.ah();
        this.qB.po = true;
        com.kwad.components.ad.reward.b.fr().a(this.ho);
        this.qB.b(this.mPlayEndPageListener);
        getContext();
        if (ai.IK()) {
            imageView = this.hn;
            scaleType = ImageView.ScaleType.FIT_XY;
        } else {
            imageView = this.hn;
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        imageView.setScaleType(scaleType);
        cf();
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
        this.hm.setVisibility(8);
        this.hn.setVisibility(8);
        this.qB.po = false;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.hm;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-fullscreen-video-card", this.qB.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.hm = (FrameLayout) findViewById(R.id.ksad_js_full_card);
        this.hn = (ImageView) findViewById(R.id.ksad_tk_bg_view);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.ad.reward.b.fr().b(this.ho);
    }
}
