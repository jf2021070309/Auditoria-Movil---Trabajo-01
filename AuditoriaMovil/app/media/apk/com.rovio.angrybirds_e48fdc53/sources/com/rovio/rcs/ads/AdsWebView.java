package com.rovio.rcs.ads;

import android.content.Context;
import android.webkit.WebView;
/* loaded from: classes4.dex */
class AdsWebView extends WebView {
    private OnSizeChangedListener a;

    /* loaded from: classes4.dex */
    interface OnSizeChangedListener {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdsWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(OnSizeChangedListener onSizeChangedListener) {
        this.a = onSizeChangedListener;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.a != null) {
            this.a.onSizeChanged(getLeft(), getTop(), getRight(), getBottom());
        }
    }
}
