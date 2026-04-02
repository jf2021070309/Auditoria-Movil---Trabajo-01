package com.zipoapps.premiumhelper.ui.splash;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import c.b.c.l;
import c.p.q;
import ch.qos.logback.core.CoreConstants;
import e.j.d.c0.b0;
import e.j.d.k;
import e.j.d.w;
import e.j.d.x;
import h.g;
import h.m.d;
import h.m.i.a.e;
import h.m.i.a.h;
import h.o.b.p;
import h.o.c.j;
import i.a.e0;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class PHSplashActivity extends l {

    /* renamed from: c  reason: collision with root package name */
    public k f4933c;

    @e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$onCreate$6", f = "PHSplashActivity.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h implements p<e0, d<? super h.k>, Object> {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public int f4934b;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final d<h.k> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, d<? super h.k> dVar) {
            return new a(dVar).invokeSuspend(h.k.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
            if ((r7 instanceof i.a.z1) == false) goto L11;
         */
        @Override // h.m.i.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.ui.splash.PHSplashActivity.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object y;
        getWindow().setFlags(1024, 1024);
        int i2 = Build.VERSION.SDK_INT;
        getWindow().addFlags(67108864);
        if (i2 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ph_activity_splash);
        ImageView imageView = (ImageView) findViewById(R.id.ph_splash_logo_image);
        TextView textView = (TextView) findViewById(R.id.ph_splash_title_text);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.ph_splash_progress);
        View childAt = ((ViewGroup) findViewById(16908290)).getChildAt(0);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(x.f8867b);
        j.d(obtainStyledAttributes, "obtainStyledAttributes(R.styleable.Splash)");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        if (childAt != null && colorStateList2 != null) {
            childAt.setBackgroundColor(colorStateList2.getDefaultColor());
        }
        if (imageView != null) {
            Context applicationContext = getApplicationContext();
            j.d(applicationContext, "applicationContext");
            j.e(applicationContext, CoreConstants.CONTEXT_SCOPE_VALUE);
            imageView.setImageResource(applicationContext.getApplicationInfo().icon);
        }
        if (textView != null) {
            Context applicationContext2 = getApplicationContext();
            j.d(applicationContext2, "applicationContext");
            textView.setText(b0.e(applicationContext2));
        }
        if (colorStateList != null && textView != null) {
            textView.setTextColor(colorStateList);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(700L);
        if (imageView != null) {
            imageView.startAnimation(alphaAnimation);
        }
        if (textView != null) {
            textView.startAnimation(alphaAnimation);
        }
        if (progressBar != null) {
            try {
                y(progressBar);
                y = h.k.a;
            } catch (Throwable th) {
                y = w.y(th);
            }
            Throwable a2 = g.a(y);
            if (a2 != null) {
                n.a.a.f9946d.c(a2);
            }
            progressBar.setAlpha(0.0f);
            progressBar.setVisibility(0);
            ViewPropertyAnimator animate = progressBar.animate();
            animate.alpha(1.0f);
            animate.setDuration(300L);
            animate.setStartDelay(5000L);
            animate.start();
        }
        this.f4933c = k.a.a();
        q.a(this).j(new a(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(android.widget.ProgressBar r6) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.ui.splash.PHSplashActivity.y(android.widget.ProgressBar):void");
    }
}
