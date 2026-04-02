package com.fyber.inneractive.sdk.m;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.m.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
/* loaded from: classes.dex */
public final class c extends WebView {
    a a;
    private boolean b;
    private boolean c;
    private g d;
    private final aj e;
    private int f;
    private int g;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);

        void o();

        void p();
    }

    c() {
        super(null);
        this.b = false;
        this.e = new aj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        super(context.getApplicationContext());
        this.b = false;
        this.e = new aj();
    }

    public final void setTapListener(g.a aVar) {
        this.d = new g(aVar, getContext());
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g gVar = this.d;
        if (gVar != null) {
            gVar.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.e.a(motionEvent.getX(), motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setListener(a aVar) {
        this.a = aVar;
    }

    public final boolean getIsVisible() {
        return this.c;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.a = null;
    }

    public final void a(String str) {
        IAlog.b("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:" + str);
            } catch (Exception unused) {
                IAlog.b("Failed to inject JS", new Object[0]);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b) {
            return;
        }
        this.b = true;
        a aVar = this.a;
        if (aVar != null) {
            aVar.o();
        }
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = false;
        if (this.b) {
            this.b = false;
            a aVar = this.a;
            if (aVar != null) {
                aVar.p();
            }
            a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.a("onWindowFocusChanged with: %s", Boolean.valueOf(z));
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            a(false);
        } else {
            a();
        }
    }

    public final boolean a() {
        boolean z = false;
        IAlog.a("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.b), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.b) {
                z = true;
            }
            return a(z);
        }
        if (isShown() && hasWindowFocus() && this.b) {
            z = true;
        }
        return a(z);
    }

    private boolean a(boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.a("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z = false;
                }
            } else {
                IAlog.a("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.c != z) {
            this.c = z;
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(z);
            }
            return true;
        }
        return false;
    }

    public final int getWidthDp() {
        return this.f;
    }

    public final void setWidthDp(int i) {
        this.f = i;
    }

    public final int getHeightDp() {
        return this.g;
    }

    public final void setHeightDp(int i) {
        this.g = i;
    }

    public final aj getLastClickedLocation() {
        return this.e;
    }
}
