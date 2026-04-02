package com.ironsource.mediationsdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
/* loaded from: classes2.dex */
public class IronSourceBannerLayout extends FrameLayout {
    private View a;
    private ISBannerSize b;
    private String c;
    private Activity d;
    private boolean e;
    private boolean f;
    private BannerListener g;

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.e = false;
        this.f = false;
        this.d = activity;
        this.b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final IronSourceBannerLayout a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.d, this.b);
        ironSourceBannerLayout.setBannerListener(this.g);
        ironSourceBannerLayout.setPlacementName(this.c);
        return ironSourceBannerLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final View view, final FrameLayout.LayoutParams layoutParams) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.IronSourceBannerLayout.2
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceBannerLayout.this.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                IronSourceBannerLayout.this.a = view;
                IronSourceBannerLayout.this.addView(view, 0, layoutParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.CALLBACK;
        ironLog.info("error=" + ironSourceError);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.IronSourceBannerLayout.1
            @Override // java.lang.Runnable
            public final void run() {
                if (IronSourceBannerLayout.this.f) {
                    IronSourceBannerLayout.this.g.onBannerAdLoadFailed(ironSourceError);
                    return;
                }
                try {
                    if (IronSourceBannerLayout.this.a != null) {
                        IronSourceBannerLayout.this.removeView(IronSourceBannerLayout.this.a);
                        IronSourceBannerLayout.this.a = null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (IronSourceBannerLayout.this.g != null) {
                    IronSourceBannerLayout.this.g.onBannerAdLoadFailed(ironSourceError);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + str);
        if (this.g != null && !this.f) {
            IronLog.CALLBACK.info("");
            this.g.onBannerAdLoaded();
        }
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.e = true;
        this.g = null;
        this.d = null;
        this.b = null;
        this.c = null;
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.g != null) {
            IronLog.CALLBACK.info("");
            this.g.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.g != null) {
            IronLog.CALLBACK.info("");
            this.g.onBannerAdScreenPresented();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.g != null) {
            IronLog.CALLBACK.info("");
            this.g.onBannerAdScreenDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (this.g != null) {
            IronLog.CALLBACK.info("");
            this.g.onBannerAdLeftApplication();
        }
    }

    public Activity getActivity() {
        return this.d;
    }

    public BannerListener getBannerListener() {
        return this.g;
    }

    public View getBannerView() {
        return this.a;
    }

    public String getPlacementName() {
        return this.c;
    }

    public ISBannerSize getSize() {
        return this.b;
    }

    public boolean isDestroyed() {
        return this.e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        this.g = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        this.g = bannerListener;
    }

    public void setPlacementName(String str) {
        this.c = str;
    }
}
