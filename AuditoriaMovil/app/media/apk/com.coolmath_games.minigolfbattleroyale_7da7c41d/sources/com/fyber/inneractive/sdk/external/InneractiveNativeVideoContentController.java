package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.d.r;
import com.fyber.inneractive.sdk.util.q;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class InneractiveNativeVideoContentController extends r {
    WeakReference<Renderer> a;
    private boolean b = true;

    /* loaded from: classes.dex */
    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    public void setControlledRenderer(Renderer renderer) {
        this.a = new WeakReference<>(renderer);
    }

    @Override // com.fyber.inneractive.sdk.d.k
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void playVideo() {
        Renderer renderer = (Renderer) q.a(this.a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void pauseVideo() {
        if (((Renderer) q.a(this.a)) != null) {
            this.a.get().pauseVideo();
        }
    }
}
