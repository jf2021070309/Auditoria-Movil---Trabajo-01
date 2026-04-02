package com.kwad.components.ad.fullscreen.c.a;

import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.bn;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a implements bn.a {
    private boolean gA;
    private long gB;
    private TextView gx;
    private View gy;
    private bn gz;
    private AdInfo mAdInfo;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.fullscreen.c.a.a.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", a.this.qB.mAdTemplate).equals(str)) {
                a.this.bV();
            }
        }
    };
    private l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.fullscreen.c.a.a.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.g
        public final void onLivePlayEnd() {
            super.onLivePlayEnd();
            if (a.this.gA) {
                return;
            }
            a.this.gz.sendEmptyMessageDelayed(1, 500L);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            if (!a.this.qB.oZ.jT()) {
                a.this.a(j, j2);
                a.this.gB = j2;
            } else if (j2 > 800) {
                a.this.gB = j2;
                if (a.this.gB > j) {
                    a.this.gx.setVisibility(8);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.this.gy.getLayoutParams();
                    marginLayoutParams.leftMargin = com.kwad.sdk.d.a.a.a(a.this.getContext(), 0.0f);
                    a.this.gy.setLayoutParams(marginLayoutParams);
                }
                a.this.a(j, j2);
                a.a(a.this, true);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, long j2) {
        w(Math.max((int) ((((float) (j - j2)) / 1000.0f) + 0.5f), 0));
    }

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.gA = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        this.mAdInfo = ck;
        this.gx.setText(String.valueOf(com.kwad.sdk.core.response.b.a.G(ck)));
        this.gx.setVisibility(0);
        this.qB.oZ.a(this.mVideoPlayStateListener);
    }

    private void w(int i) {
        this.gx.setText(String.valueOf(i));
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        if (message.what == 1) {
            if (this.qB.gd() || this.qB.gc()) {
                this.gz.sendEmptyMessageDelayed(1, 500L);
                return;
            }
            long j = this.gB + 500;
            this.gB = j;
            if (j <= 30000) {
                a(30000L, j);
                this.gz.sendEmptyMessageDelayed(1, 500L);
                return;
            }
            this.gx.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.gy.getLayoutParams();
            marginLayoutParams.leftMargin = com.kwad.sdk.d.a.a.a(getContext(), 0.0f);
            this.gy.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.gz = new bn(this);
        if (com.kwad.components.ad.reward.j.c(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
            return;
        }
        bV();
        if (this.qB.oZ.jT()) {
            w(30);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.gx = (TextView) findViewById(R.id.ksad_video_count_down);
        this.gy = findViewById(R.id.ksad_video_sound_switch);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.oZ.b(this.mVideoPlayStateListener);
        this.gA = false;
        this.gz.removeCallbacksAndMessages(null);
    }
}
