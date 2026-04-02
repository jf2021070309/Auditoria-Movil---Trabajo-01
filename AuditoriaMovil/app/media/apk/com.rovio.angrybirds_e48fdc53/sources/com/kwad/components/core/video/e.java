package com.kwad.components.core.video;

import android.content.Context;
import android.os.Message;
import android.view.View;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.utils.bn;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class e extends a implements bn.a {
    private View SN;
    private final AtomicBoolean SO;
    private boolean SP;
    private boolean SQ;
    private final KsAdVideoPlayConfig dJ;
    private final bn gz;

    public e(Context context, AdTemplate adTemplate, com.kwad.sdk.core.video.videoview.c cVar, KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        super(context, adTemplate, cVar);
        this.gz = new bn(this);
        this.SO = new AtomicBoolean(true);
        this.SQ = true;
        this.SN = this;
        this.dJ = ksAdVideoPlayConfig;
    }

    private void aa() {
        if (this.SO.getAndSet(false)) {
            com.kwad.sdk.core.e.c.i("FeedVideoPlayerController", "onViewAttached");
            this.gz.sendEmptyMessage(1);
        }
    }

    private boolean qV() {
        KsAdVideoPlayConfig ksAdVideoPlayConfig = this.dJ;
        if (ksAdVideoPlayConfig instanceof KSAdVideoPlayConfigImpl) {
            KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = (KSAdVideoPlayConfigImpl) ksAdVideoPlayConfig;
            if (kSAdVideoPlayConfigImpl.getVideoAutoPlayType() == 1) {
                return ag.isNetworkConnected(this.mContext);
            }
            if (kSAdVideoPlayConfigImpl.getVideoAutoPlayType() == 2) {
                return ag.isWifiConnected(this.mContext);
            }
            if (kSAdVideoPlayConfigImpl.getVideoAutoPlayType() == 3) {
                return false;
            }
            if (kSAdVideoPlayConfigImpl.getDataFlowAutoStartValue() != 0) {
                return kSAdVideoPlayConfigImpl.isDataFlowAutoStart() ? ag.isNetworkConnected(this.mContext) : ag.isWifiConnected(this.mContext);
            }
        }
        if (com.kwad.sdk.core.response.b.a.bI(this.mAdInfo)) {
            return ag.isNetworkConnected(this.mContext);
        }
        if (com.kwad.sdk.core.response.b.a.bJ(this.mAdInfo)) {
            return ag.isWifiConnected(this.mContext);
        }
        return false;
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        if (!this.RE && message.what == 1) {
            if (!bm.o(this.SN, 30)) {
                qC();
            } else if (!this.SP) {
                qA();
            }
            this.gz.sendEmptyMessageDelayed(1, 500L);
        }
    }

    public final void ab() {
        if (this.SO.getAndSet(true)) {
            return;
        }
        com.kwad.sdk.core.e.c.i("FeedVideoPlayerController", "onViewDetached");
        this.gz.removeCallbacksAndMessages(null);
        if (this.SQ) {
            release();
        } else {
            this.awn.pause();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.kwad.sdk.core.e.c.i("FeedVideoPlayerController", "onAttachedToWindow");
        aa();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.kwad.sdk.core.e.c.i("FeedVideoPlayerController", "onDetachedFromWindow");
        ab();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.kwad.sdk.core.e.c.i("FeedVideoPlayerController", "onFinishTemporaryDetach");
        aa();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.kwad.sdk.core.e.c.i("FeedVideoPlayerController", "onStartTemporaryDetach");
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.core.video.a
    public final void qA() {
        if (!this.awn.isIdle()) {
            if (this.awn.isPaused() || this.awn.Dv()) {
                qB();
                this.awn.restart();
            }
        } else if (!ag.isNetworkConnected(this.mContext)) {
            qw();
        } else {
            qx();
            if (!this.RE && !qV() && !this.RC) {
                qy();
                return;
            }
            qB();
            this.awn.start();
        }
    }

    public final void qU() {
        this.gz.removeCallbacksAndMessages(null);
        if (this.SQ) {
            release();
        } else {
            this.awn.pause();
        }
    }

    public final void qW() {
        this.awn.pause();
        this.SP = true;
    }

    public final void qX() {
        qA();
        this.SP = false;
    }

    public final void qY() {
        this.SP = false;
    }

    public final void setAutoRelease(boolean z) {
        this.SQ = z;
    }
}
