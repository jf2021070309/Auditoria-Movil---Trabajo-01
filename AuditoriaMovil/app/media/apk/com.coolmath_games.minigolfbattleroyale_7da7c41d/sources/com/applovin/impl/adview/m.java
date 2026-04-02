package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.j;
import com.applovin.sdk.AppLovinSdkUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m extends Dialog implements l {
    private final Activity a;
    private final com.applovin.impl.sdk.k b;
    private final com.applovin.impl.sdk.r c;
    private final d d;
    private final com.applovin.impl.sdk.a.a e;
    private RelativeLayout f;
    private j g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(com.applovin.impl.sdk.a.a aVar, d dVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.b = kVar;
        this.c = kVar.z();
        this.a = activity;
        this.d = dVar;
        this.e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private int a(int i) {
        return AppLovinSdkUtils.dpToPx(this.a, i);
    }

    private void a(j.a aVar) {
        if (this.g != null) {
            this.c.d("ExpandedAdDialog", "Attempting to create duplicate close button");
            return;
        }
        j a = j.a(aVar, this.a);
        this.g = a;
        a.setVisibility(8);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.m.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m.this.c();
            }
        });
        this.g.setClickable(false);
        int a2 = a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.bN)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams.addRule(10);
        layoutParams.addRule(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.bQ)).booleanValue() ? 9 : 11);
        this.g.a(a2);
        int a3 = a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.bP)).intValue());
        int a4 = a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.bO)).intValue());
        layoutParams.setMargins(a4, a3, a4, 0);
        this.f.addView(this.g, layoutParams);
        this.g.bringToFront();
        int a5 = a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.bR)).intValue());
        View view = new View(this.a);
        view.setBackgroundColor(0);
        int i = a2 + a5;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.bQ)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a4 - a(5), a3 - a(5), a4 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.m.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (m.this.g.isClickable()) {
                    m.this.g.performClick();
                }
            }
        });
        this.f.addView(view, layoutParams2);
        view.bringToFront();
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.a);
        this.f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f.setBackgroundColor(-1157627904);
        this.f.addView(this.d);
        if (!this.e.n()) {
            a(this.e.o());
            d();
        }
        setContentView(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.d.a("javascript:al_onCloseTapped();", new Runnable() { // from class: com.applovin.impl.adview.m.1
            @Override // java.lang.Runnable
            public void run() {
                m.this.dismiss();
            }
        });
    }

    private void d() {
        this.a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.m.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (m.this.g == null) {
                        m.this.c();
                    }
                    m.this.g.setVisibility(0);
                    m.this.g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.m.6.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            m.this.g.setClickable(true);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    m.this.g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    m.this.c.b("ExpandedAdDialog", "Unable to fade in close button", th);
                    m.this.c();
                }
            }
        });
    }

    public com.applovin.impl.sdk.a.a a() {
        return this.e;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.adview.l
    public void dismiss() {
        com.applovin.impl.sdk.d.d statsManagerHelper = this.d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.e();
        }
        this.a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.m.3
            @Override // java.lang.Runnable
            public void run() {
                m.this.f.removeView(m.this.d);
                m.super.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.d.a("javascript:al_onBackPressed();", new Runnable() { // from class: com.applovin.impl.adview.m.2
            @Override // java.lang.Runnable
            public void run() {
                m.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.a.getWindow().getAttributes().flags, this.a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else {
                this.c.e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            this.c.b("ExpandedAdDialog", "Setting window flags failed.", th);
        }
    }
}
