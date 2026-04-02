package com.kwad.components.core.page.splitLandingPage.view;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.kwad.components.core.t.d;
import com.kwad.sdk.core.webview.KsAdWebView;
/* loaded from: classes.dex */
public class SplitScrollWebView extends KsAdWebView {
    private boolean OI;
    private a OJ;
    private float OK;
    private boolean OL;
    private int Ol;

    /* loaded from: classes.dex */
    public interface a {
        void d(float f);

        boolean ps();
    }

    public SplitScrollWebView(Context context) {
        super(context);
        this.OI = false;
        pm();
    }

    public SplitScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OI = false;
        pm();
    }

    public SplitScrollWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OI = false;
        pm();
    }

    private void pm() {
        this.Ol = 0;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.Ol != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(((getContext() instanceof Activity ? com.kwad.sdk.d.a.a.e((Activity) getContext()) : com.kwad.sdk.d.a.a.getScreenHeight(getContext())) - (d.qp() ? com.kwad.sdk.d.a.a.getStatusBarHeight(getContext()) : 0)) - this.Ol, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (this.OI) {
            return super.onTouchEvent(obtain);
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.OK = y;
            this.OL = false;
            return super.onTouchEvent(motionEvent);
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float f = this.OK;
                float f2 = f - y;
                a aVar = this.OJ;
                if (aVar != null && y <= f) {
                    this.OL = true;
                    aVar.d(f2);
                }
                return super.onTouchEvent(obtain);
            } else if (actionMasked != 3) {
                return false;
            }
        }
        a aVar2 = this.OJ;
        if (aVar2 != null) {
            if ((this.OK - y >= 0.0f || this.OL) && aVar2.ps()) {
                this.OI = true;
                return false;
            }
            return false;
        }
        return false;
    }

    public void setDisableAnimation(boolean z) {
        this.OI = z;
    }

    public void setSplitScrollWebViewListener(a aVar) {
        this.OJ = aVar;
    }
}
