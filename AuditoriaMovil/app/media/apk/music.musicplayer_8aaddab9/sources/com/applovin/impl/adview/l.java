package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.i;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class l extends Dialog implements k {
    private final Activity a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f3231b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f3232c;

    /* renamed from: d  reason: collision with root package name */
    private final d f3233d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f3234e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f3235f;

    /* renamed from: g  reason: collision with root package name */
    private i f3236g;

    public l(com.applovin.impl.sdk.ad.a aVar, d dVar, Activity activity, com.applovin.impl.sdk.m mVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f3231b = mVar;
        this.f3232c = mVar.B();
        this.a = activity;
        this.f3233d = dVar;
        this.f3234e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private int a(int i2) {
        return AppLovinSdkUtils.dpToPx(this.a, i2);
    }

    private void a(i.a aVar) {
        if (this.f3236g != null) {
            this.f3232c.d("ExpandedAdDialog", "Attempting to create duplicate close button");
            return;
        }
        i a = i.a(aVar, this.a);
        this.f3236g = a;
        a.setVisibility(8);
        this.f3236g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                l.this.d();
            }
        });
        this.f3236g.setClickable(false);
        int a2 = a(((Integer) this.f3231b.a(com.applovin.impl.sdk.c.b.bZ)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.m mVar = this.f3231b;
        com.applovin.impl.sdk.c.b<Boolean> bVar = com.applovin.impl.sdk.c.b.cc;
        layoutParams.addRule(((Boolean) mVar.a(bVar)).booleanValue() ? 9 : 11);
        this.f3236g.a(a2);
        int a3 = a(((Integer) this.f3231b.a(com.applovin.impl.sdk.c.b.cb)).intValue());
        int a4 = a(((Integer) this.f3231b.a(com.applovin.impl.sdk.c.b.ca)).intValue());
        layoutParams.setMargins(a4, a3, a4, 0);
        this.f3235f.addView(this.f3236g, layoutParams);
        this.f3236g.bringToFront();
        int a5 = a(((Integer) this.f3231b.a(com.applovin.impl.sdk.c.b.cd)).intValue());
        View view = new View(this.a);
        view.setBackgroundColor(0);
        int i2 = a2 + a5;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f3231b.a(bVar)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a4 - a(5), a3 - a(5), a4 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (l.this.f3236g.isClickable()) {
                    l.this.f3236g.performClick();
                }
            }
        });
        this.f3235f.addView(view, layoutParams2);
        view.bringToFront();
    }

    private void c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f3233d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.a);
        this.f3235f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f3235f.setBackgroundColor(-1157627904);
        this.f3235f.addView(this.f3233d);
        if (!this.f3234e.l()) {
            a(this.f3234e.m());
            e();
        }
        setContentView(this.f3235f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f3233d.a("javascript:al_onCloseTapped();", new Runnable() { // from class: com.applovin.impl.adview.l.1
            @Override // java.lang.Runnable
            public void run() {
                l.this.dismiss();
            }
        });
    }

    private void e() {
        this.a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (l.this.f3236g == null) {
                        l.this.d();
                    }
                    l.this.f3236g.setVisibility(0);
                    l.this.f3236g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.l.6.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            l.this.f3236g.setClickable(true);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    l.this.f3236g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    l.this.f3232c.b("ExpandedAdDialog", "Unable to fade in close button", th);
                    l.this.d();
                }
            }
        });
    }

    public com.applovin.impl.sdk.ad.a a() {
        return this.f3234e;
    }

    public d b() {
        return this.f3233d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.adview.k
    public void dismiss() {
        com.applovin.impl.sdk.d.d statsManagerHelper = this.f3233d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.e();
        }
        this.a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.3
            @Override // java.lang.Runnable
            public void run() {
                l.this.f3235f.removeView(l.this.f3233d);
                l.super.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f3233d.a("javascript:al_onBackPressed();", new Runnable() { // from class: com.applovin.impl.adview.l.2
            @Override // java.lang.Runnable
            public void run() {
                l.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.a.getWindow().getAttributes().flags, this.a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else {
                this.f3232c.e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            this.f3232c.b("ExpandedAdDialog", "Setting window flags failed.", th);
        }
    }
}
