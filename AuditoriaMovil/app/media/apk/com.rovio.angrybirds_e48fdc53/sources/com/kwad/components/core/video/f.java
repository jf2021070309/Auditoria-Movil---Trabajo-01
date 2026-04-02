package com.kwad.components.core.video;

import android.content.Context;
import android.os.Message;
import android.view.View;
import com.kwad.components.core.video.a;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.utils.bn;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class f extends com.kwad.components.core.video.a implements bn.a {
    private boolean Eb;
    private View SN;
    private final AtomicBoolean SO;
    private boolean SR;
    private final bn gz;
    private boolean kc;

    /* loaded from: classes.dex */
    public interface a extends a.c {
        void onVideoPlayError(int i, int i2);
    }

    public f(Context context, AdTemplate adTemplate, com.kwad.sdk.core.video.videoview.c cVar) {
        super(context, adTemplate, cVar);
        this.gz = new bn(this);
        this.SO = new AtomicBoolean(true);
        this.Eb = false;
        this.SR = false;
        this.kc = false;
        this.SN = this;
    }

    private void aa() {
        if (this.SO.getAndSet(false)) {
            com.kwad.sdk.core.e.c.i("InterstitialVideoPlayerController", "onViewAttached");
            this.gz.sendEmptyMessage(1);
        }
    }

    private void ab() {
        if (this.SO.getAndSet(true)) {
            return;
        }
        com.kwad.sdk.core.e.c.i("InterstitialVideoPlayerController", "onViewDetached");
        this.gz.removeCallbacksAndMessages(null);
        release();
    }

    private void qZ() {
        this.Eb = false;
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        if (!this.Eb && message.what == 1) {
            if (this.kc) {
                this.gz.sendEmptyMessageDelayed(1, 500L);
                return;
            }
            if (bm.o(this.SN, 70)) {
                qA();
            } else {
                qC();
            }
            this.gz.sendEmptyMessageDelayed(1, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.core.video.a
    public final void eR() {
        if (this.SR) {
            super.eR();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.kwad.sdk.core.e.c.i("InterstitialVideoPlayerController", "onAttachedToWindow");
        qZ();
        aa();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.kwad.sdk.core.e.c.i("InterstitialVideoPlayerController", "onDetachedFromWindow");
        ab();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.kwad.sdk.core.e.c.i("InterstitialVideoPlayerController", "onFinishTemporaryDetach");
        aa();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.kwad.sdk.core.e.c.i("InterstitialVideoPlayerController", "onStartTemporaryDetach");
        ab();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.kwad.components.core.video.a
    public final void qA() {
        super.qA();
    }

    @Override // com.kwad.components.core.video.a
    public final void qC() {
        super.qC();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.core.video.a
    public final void qu() {
        super.qu();
        if (this.ne != null) {
            this.ne.setImageResource(R.drawable.ksad_interstitial_video_play);
        }
        if (this.nf != null) {
            this.nf.setVisibility(8);
        }
    }

    @Override // com.kwad.components.core.video.a
    public final void release() {
        super.release();
        this.Eb = true;
    }

    public final void setShowLandingPage(boolean z) {
        this.kc = z;
    }
}
