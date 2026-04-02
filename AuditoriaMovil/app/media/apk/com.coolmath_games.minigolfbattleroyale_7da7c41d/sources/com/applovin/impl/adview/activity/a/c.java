package com.applovin.impl.adview.activity.a;

import android.graphics.Color;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.u;
import com.applovin.impl.adview.v;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.impl.sdk.utils.o;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class c extends a {
    public c(g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        super(gVar, appLovinFullscreenActivity, kVar);
    }

    public void a(ImageView imageView, n nVar, final v vVar, com.applovin.impl.adview.a aVar, ProgressBar progressBar, View view, AppLovinAdView appLovinAdView) {
        if (this.c.aK()) {
            appLovinAdView.setLayoutParams(this.e);
            this.d.addView(appLovinAdView);
            View view2 = new View(this.b);
            view2.setLayoutParams(this.e);
            view2.setBackgroundColor(Color.argb(254, 0, 0, 0));
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.activity.a.c.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view3, MotionEvent motionEvent) {
                    return true;
                }
            });
            this.d.addView(view2);
            view.setLayoutParams(this.e);
            this.d.addView(view);
        } else {
            view.setLayoutParams(this.e);
            this.d.addView(view);
            appLovinAdView.setLayoutParams(this.e);
            this.d.addView(appLovinAdView);
            appLovinAdView.setVisibility(4);
        }
        if (vVar != null) {
            u C = this.c.C();
            Point a = f.a(this.b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (a.x * (C.a() / 100.0d)), (int) (a.y * (C.b() / 100.0d)), C.d());
            int dpToPx = AppLovinSdkUtils.dpToPx(this.b, C.c());
            layoutParams.setMargins(dpToPx, dpToPx, dpToPx, dpToPx);
            this.d.addView(vVar, layoutParams);
            if (C.i() > 0.0f) {
                vVar.setVisibility(4);
                long secondsToMillisLong = Utils.secondsToMillisLong(C.i());
                final long g = C.g();
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.adview.activity.a.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        o.a(vVar, g, (Runnable) null);
                    }
                }, secondsToMillisLong);
            }
            if (C.j() > 0.0f) {
                long secondsToMillisLong2 = Utils.secondsToMillisLong(C.j());
                final long h = C.h();
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.adview.activity.a.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        o.b(vVar, h, null);
                    }
                }, secondsToMillisLong2);
            }
        }
        if (nVar != null) {
            a(this.c.W(), (this.c.ab() ? 3 : 5) | 48, nVar);
        }
        if (imageView != null) {
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cw)).intValue());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cy)).intValue());
            int dpToPx3 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cx)).intValue());
            layoutParams2.setMargins(dpToPx3, dpToPx3, dpToPx3, dpToPx3);
            this.d.addView(imageView, layoutParams2);
        }
        if (aVar != null) {
            this.d.addView(aVar, this.e);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, 20, 80);
            layoutParams3.setMargins(0, 0, 0, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cC)).intValue());
            this.d.addView(progressBar, layoutParams3);
        }
        this.b.setContentView(this.d);
    }

    public void a(n nVar, View view) {
        view.setVisibility(0);
        com.applovin.impl.sdk.utils.b.a(this.d, view);
        if (nVar != null) {
            a(this.c.W(), (this.c.aa() ? 3 : 5) | 48, nVar);
        }
    }
}
