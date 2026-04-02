package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.external.VideoContentListener;
/* loaded from: classes.dex */
public abstract class r extends k<VideoContentListener> implements VideoContentListener {
    protected boolean isOverlayOutside = true;

    public r setOverlayOutside(boolean z) {
        this.isOverlayOutside = z;
        return this;
    }

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i, int i2) {
        if (this.mEventsListener != 0) {
            ((VideoContentListener) this.mEventsListener).onProgress(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        if (this.mEventsListener != 0) {
            ((VideoContentListener) this.mEventsListener).onCompleted();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        if (this.mEventsListener != 0) {
            ((VideoContentListener) this.mEventsListener).onPlayerError();
        }
    }
}
