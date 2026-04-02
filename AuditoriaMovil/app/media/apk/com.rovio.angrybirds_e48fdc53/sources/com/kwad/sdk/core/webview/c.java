package com.kwad.sdk.core.webview;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bo;
/* loaded from: classes.dex */
public class c extends WebView {
    private boolean ayr;
    private com.kwad.sdk.core.webview.a.a ays;

    public c(Context context) {
        super(bp(context));
        this.ayr = true;
        init();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(bp(context), attributeSet);
        this.ayr = true;
        init();
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(bp(context), attributeSet, i);
        this.ayr = true;
        init();
    }

    public c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(bp(context), attributeSet, i, i2);
        this.ayr = true;
        init();
    }

    public c(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(bp(context), attributeSet, i, z);
        this.ayr = true;
        init();
    }

    private static Context bp(Context context) {
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 23) {
            context = context.createConfigurationContext(new Configuration());
        }
        Context dv = l.dv(context);
        if (l.dy(dv)) {
            return dv;
        }
        ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(new IllegalArgumentException("KSApiWebView context not except--context:" + dv.getClass().getName() + "--classloader:" + dv.getClass().getClassLoader() + "--context2:" + l.dv(ServiceProvider.HA()).getClass().getName()));
        return l.dv(ServiceProvider.HA());
    }

    private void init() {
        bo.a(this);
        com.kwad.sdk.core.webview.a.a aVar = new com.kwad.sdk.core.webview.a.a();
        this.ays = aVar;
        setWebViewClient(aVar);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.ayr) {
            release();
        }
    }

    public final void release() {
        try {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
            super.destroy();
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    public void setEnableDestroy(boolean z) {
        this.ayr = z;
    }

    public void setNeedHybridLoad(boolean z) {
        this.ays.setNeedHybridLoad(z);
    }
}
