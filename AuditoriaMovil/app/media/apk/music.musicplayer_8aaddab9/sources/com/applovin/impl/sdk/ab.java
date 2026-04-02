package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class ab {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3825b;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f3829f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f3830g;

    /* renamed from: h  reason: collision with root package name */
    private final WeakReference<View> f3831h;

    /* renamed from: k  reason: collision with root package name */
    private int f3834k;

    /* renamed from: l  reason: collision with root package name */
    private long f3835l;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3826c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f3827d = new Rect();

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f3832i = new WeakReference<>(null);

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<View> f3833j = new WeakReference<>(null);

    /* renamed from: m  reason: collision with root package name */
    private long f3836m = Long.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f3828e = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public ab(View view, m mVar, a aVar) {
        this.a = mVar;
        this.f3825b = mVar.B();
        this.f3831h = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f3829f = new Runnable() { // from class: com.applovin.impl.sdk.ab.1
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup viewGroup = ab.this.f3831h.get() instanceof ViewGroup ? (ViewGroup) ab.this.f3831h.get() : null;
                View view2 = (View) ab.this.f3833j.get();
                if (viewGroup == null || view2 == null) {
                    return;
                }
                if (!ab.this.b(viewGroup, view2)) {
                    ab.this.b();
                    return;
                }
                ab.this.f3825b.b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                ab.this.a();
                a aVar2 = (a) weakReference.get();
                if (aVar2 != null) {
                    aVar2.onLogVisibilityImpression();
                }
            }
        };
        this.f3830g = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sdk.ab.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ab.this.b();
                ab.this.c();
                return true;
            }
        };
    }

    private void a(View view) {
        View rootView = Utils.getRootView(this.f3831h.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView == null) {
            this.f3825b.b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
            return;
        }
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f3825b.d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            return;
        }
        this.f3832i = new WeakReference<>(viewTreeObserver);
        viewTreeObserver.addOnPreDrawListener(this.f3830g);
    }

    private boolean a(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f3827d)) {
            return false;
        }
        return ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f3827d.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f3827d.width()))) >= ((long) this.f3834k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f3828e.postDelayed(this.f3829f, ((Long) this.a.a(com.applovin.impl.sdk.c.b.bY)).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view, View view2) {
        if (a(view, view2)) {
            if (this.f3836m == Long.MIN_VALUE) {
                this.f3836m = SystemClock.uptimeMillis();
            }
            return SystemClock.uptimeMillis() - this.f3836m >= this.f3835l;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ViewTreeObserver viewTreeObserver = this.f3832i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f3830g);
        }
        this.f3832i.clear();
    }

    public void a() {
        synchronized (this.f3826c) {
            this.f3828e.removeMessages(0);
            c();
            this.f3836m = Long.MIN_VALUE;
            this.f3833j.clear();
        }
    }

    public void a(com.applovin.impl.mediation.a.e eVar) {
        WeakReference<View> weakReference;
        synchronized (this.f3826c) {
            this.f3825b.b("VisibilityTracker", "Tracking Visibility...");
            a();
            if (eVar instanceof com.applovin.impl.mediation.a.b) {
                weakReference = new WeakReference<>(((com.applovin.impl.mediation.a.b) eVar).x());
            } else if (!(eVar instanceof com.applovin.impl.mediation.a.d)) {
                return;
            } else {
                weakReference = new WeakReference<>(((com.applovin.impl.mediation.a.d) eVar).w());
            }
            this.f3833j = weakReference;
            this.f3834k = eVar.G();
            this.f3835l = eVar.I();
            a(this.f3833j.get());
        }
    }
}
