package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class x {
    private final k a;
    private final r b;
    private final Runnable f;
    private final ViewTreeObserver.OnPreDrawListener g;
    private final WeakReference<MaxAdView> h;
    private int k;
    private long l;
    private final Object c = new Object();
    private final Rect d = new Rect();
    private WeakReference<ViewTreeObserver> i = new WeakReference<>(null);
    private WeakReference<View> j = new WeakReference<>(null);
    private long m = Long.MIN_VALUE;
    private final Handler e = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public x(MaxAdView maxAdView, k kVar, a aVar) {
        this.a = kVar;
        this.b = kVar.z();
        this.h = new WeakReference<>(maxAdView);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f = new Runnable() { // from class: com.applovin.impl.sdk.x.1
            @Override // java.lang.Runnable
            public void run() {
                MaxAdView maxAdView2 = (MaxAdView) x.this.h.get();
                View view = (View) x.this.j.get();
                if (maxAdView2 == null || view == null) {
                    return;
                }
                if (!x.this.b(maxAdView2, view)) {
                    x.this.b();
                    return;
                }
                x.this.b.b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                x.this.a();
                a aVar2 = (a) weakReference.get();
                if (aVar2 != null) {
                    aVar2.onLogVisibilityImpression();
                }
            }
        };
        this.g = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sdk.x.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                x.this.b();
                x.this.c();
                return true;
            }
        };
    }

    private void a(View view) {
        View rootView = Utils.getRootView(this.h.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView == null) {
            this.b.b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
            return;
        }
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.b.d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            return;
        }
        this.i = new WeakReference<>(viewTreeObserver);
        viewTreeObserver.addOnPreDrawListener(this.g);
    }

    private boolean a(View view, View view2) {
        return view2 != null && view2.getVisibility() == 0 && view.getParent() != null && view2.getWidth() > 0 && view2.getHeight() > 0 && view2.getGlobalVisibleRect(this.d) && ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.d.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.d.height()))) >= ((long) this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.e.postDelayed(this.f, ((Long) this.a.a(com.applovin.impl.sdk.c.b.bM)).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view, View view2) {
        if (a(view, view2)) {
            if (this.m == Long.MIN_VALUE) {
                this.m = SystemClock.uptimeMillis();
            }
            return SystemClock.uptimeMillis() - this.m >= this.l;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ViewTreeObserver viewTreeObserver = this.i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.g);
        }
        this.i.clear();
    }

    public void a() {
        synchronized (this.c) {
            this.e.removeMessages(0);
            c();
            this.m = Long.MIN_VALUE;
            this.j.clear();
        }
    }

    public void a(com.applovin.impl.mediation.a.b bVar) {
        synchronized (this.c) {
            this.b.b("VisibilityTracker", "Tracking Visibility...");
            a();
            this.j = new WeakReference<>(bVar.s());
            this.k = bVar.x();
            this.l = bVar.z();
            a(this.j.get());
        }
    }
}
