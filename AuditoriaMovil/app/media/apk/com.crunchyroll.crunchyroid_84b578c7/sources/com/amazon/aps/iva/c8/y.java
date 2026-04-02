package com.amazon.aps.iva.c8;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes.dex */
public final class y extends WebView {
    public y(Context context) {
        super(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
