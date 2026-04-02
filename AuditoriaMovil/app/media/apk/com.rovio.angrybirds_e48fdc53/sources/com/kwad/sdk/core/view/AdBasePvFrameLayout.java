package com.kwad.sdk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.bl;
import com.kwad.sdk.utils.k;
import com.kwad.sdk.widget.j;
/* loaded from: classes.dex */
public class AdBasePvFrameLayout extends AdBaseFrameLayout {
    private long axm;
    private float axn;
    private boolean axo;
    private boolean axp;
    private ViewTreeObserver.OnScrollChangedListener axq;
    private ViewTreeObserver axr;
    private bl axs;
    private j ct;
    private int mr;

    public AdBasePvFrameLayout(Context context) {
        super(context);
        this.axm = 500L;
        this.axn = 0.1f;
        this.axp = true;
        init();
    }

    public AdBasePvFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.axm = 500L;
        this.axn = 0.1f;
        this.axp = true;
        init();
    }

    public AdBasePvFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.axm = 500L;
        this.axn = 0.1f;
        this.axp = true;
        init();
    }

    private void DR() {
        if (DT()) {
            DS();
        } else {
            DU();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean DT() {
        return this.axs.Kc() && ((float) Math.abs(this.axs.aKy.height() - getHeight())) <= ((float) getHeight()) * (1.0f - this.axn) && getHeight() > 0 && getWidth() > 0 && this.axs.aKy.bottom > 0 && this.axs.aKy.top < this.mr;
    }

    private void DU() {
        if (this.axq == null) {
            this.axq = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.kwad.sdk.core.view.AdBasePvFrameLayout.1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    if (AdBasePvFrameLayout.this.DT()) {
                        AdBasePvFrameLayout.this.DS();
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            this.axr = viewTreeObserver;
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnScrollChangedListener(this.axq);
            }
        }
    }

    private void DV() {
        ViewTreeObserver viewTreeObserver;
        try {
            if (this.axq != null && (viewTreeObserver = this.axr) != null && viewTreeObserver.isAlive()) {
                this.axr.removeOnScrollChangedListener(this.axq);
            }
            this.axq = null;
        } catch (Exception e) {
            c.printStackTrace(e);
        }
    }

    private void init() {
        this.axs = new bl(this);
        this.mr = k.getScreenHeight(getContext());
        this.axp = true;
    }

    private void ob() {
        if (this.axp) {
            DR();
        }
    }

    protected final void DS() {
        DV();
        j jVar = this.ct;
        if (jVar != null) {
            jVar.am();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DU();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DV();
        this.axo = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (this.axo || (i3 | i4) != 0 || (i | i2) == 0) {
            z = false;
        } else {
            this.axo = true;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (z) {
            ob();
        }
    }

    public void setCheckDefaultImpressionLogThreshold(float f) {
        this.axn = f;
    }

    public void setVisibleListener(j jVar) {
        this.ct = jVar;
    }
}
