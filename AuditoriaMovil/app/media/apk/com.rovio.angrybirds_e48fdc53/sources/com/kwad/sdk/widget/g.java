package com.kwad.sdk.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import com.kwad.sdk.utils.bl;
import com.kwad.sdk.utils.k;
/* loaded from: classes3.dex */
public final class g {
    private final i aMs;
    private boolean aMu;
    private boolean aMv;
    private ViewTreeObserver.OnScrollChangedListener aMx;
    private final bl axs;
    private final View mView;
    private final int mr;
    private float aMt = 0.1f;
    private boolean aMw = true;

    public g(View view, i iVar) {
        this.mView = view;
        this.aMs = iVar;
        this.axs = new bl(view);
        this.mr = k.getScreenHeight(view.getContext());
    }

    private void DU() {
        if (this.aMx == null) {
            this.aMx = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.kwad.sdk.widget.g.1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    if (g.this.KF()) {
                        g.this.am();
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = this.mView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnScrollChangedListener(this.aMx);
            }
        }
    }

    private void DV() {
        if (this.aMx == null) {
            return;
        }
        try {
            ViewTreeObserver viewTreeObserver = this.mView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.aMx);
            }
            this.aMx = null;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    private void KE() {
        if (KF()) {
            am();
            return;
        }
        DV();
        DU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean KF() {
        return this.axs.Kc() && ((float) Math.abs(this.axs.aKy.height() - this.mView.getHeight())) <= ((float) this.mView.getHeight()) * (1.0f - this.aMt) && this.mView.getHeight() > 0 && this.mView.getWidth() > 0 && this.axs.aKy.bottom > 0 && this.axs.aKy.top < this.mr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        DV();
        i iVar = this.aMs;
        if (iVar != null) {
            iVar.z(this.mView);
        }
    }

    private void ob() {
        if (this.aMw) {
            KE();
        }
    }

    public final void KD() {
        if (this.aMv) {
            ob();
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.aMv = false;
        if (this.aMu || (i3 | i4) != 0 || (i | i2) == 0) {
            return;
        }
        this.aMv = true;
        this.aMu = true;
    }

    public final void bR(boolean z) {
        this.aMw = z;
    }

    public final float getVisiblePercent() {
        return this.aMt;
    }

    public final void onAttachedToWindow() {
        DU();
    }

    public final void onDetachedFromWindow() {
        DV();
        this.aMu = false;
    }

    public final void setVisiblePercent(float f) {
        this.aMt = f;
    }
}
