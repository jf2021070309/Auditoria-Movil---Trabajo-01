package com.kwad.sdk.core.video.videoview;

import android.content.Context;
import android.widget.RelativeLayout;
/* loaded from: classes.dex */
public abstract class b extends RelativeLayout {
    private Runnable Sa;
    protected final c awn;

    public b(Context context, c cVar) {
        super(context);
        this.awn = cVar;
    }

    public void m(int i, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onPlayStateChanged(int i);

    protected abstract void qD();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void qJ() {
        qK();
        if (this.Sa == null) {
            this.Sa = new Runnable() { // from class: com.kwad.sdk.core.video.videoview.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.qD();
                    if (b.this.Sa != null) {
                        b bVar = b.this;
                        bVar.postDelayed(bVar.Sa, 1000L);
                    }
                }
            };
        }
        post(this.Sa);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void qK() {
        Runnable runnable = this.Sa;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.Sa = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void reset();
}
