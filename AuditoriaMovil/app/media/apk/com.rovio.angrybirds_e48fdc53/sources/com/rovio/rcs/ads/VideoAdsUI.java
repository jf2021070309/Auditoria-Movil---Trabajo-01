package com.rovio.rcs.ads;

import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class VideoAdsUI extends RelativeLayout {
    private ImageButton a;
    private TextView b;
    private int c;
    private int d;
    private Runnable e;
    private Runnable f;
    private Runnable g;
    private TextView h;
    private ProgressBar i;
    private View j;
    private boolean k;
    private TranslateAnimation l;
    private VideoView m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoAdsUI(android.content.Context r10, android.widget.VideoView r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rovio.rcs.ads.VideoAdsUI.<init>(android.content.Context, android.widget.VideoView, java.lang.String):void");
    }

    public void startTimers() {
        this.c = Math.min(this.m.getDuration(), this.c);
        this.d = this.c;
        if (this.c > 0) {
            d();
        }
        postDelayed(this.e, 100L);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (c() && this.f != null) {
                this.f.run();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.b != null && this.d > 0) {
            this.b.setText(Integer.toString(((this.d - 1) / 1000) + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int duration = this.m.getDuration() / 1000;
        if (duration > 0 && this.j.getVisibility() == 0) {
            int currentPosition = this.m.getCurrentPosition() / 1000;
            int i = duration - currentPosition;
            this.h.setText(String.format("%d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60)));
            this.i.setProgress((currentPosition * 100) / duration);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.b != null) {
            this.b.setVisibility(8);
            removeView(this.b);
            this.b = null;
            this.a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (!this.k || this.m.getDuration() > 0) {
            this.k = !this.k;
            float height = getHeight() - this.j.getTop();
            float f = this.k ? 0.0f : height;
            if (!this.k) {
                height = 0.0f;
            }
            if (this.l != null) {
                this.l.setAnimationListener(null);
                Transformation transformation = new Transformation();
                float[] fArr = new float[9];
                this.l.getTransformation(AnimationUtils.currentAnimationTimeMillis(), transformation);
                transformation.getMatrix().getValues(fArr);
                f = fArr[5];
                this.l.cancel();
            }
            this.l = new TranslateAnimation(0.0f, 0.0f, f, height);
            this.l.setDuration(400L);
            this.l.setAnimationListener(new Animation.AnimationListener() { // from class: com.rovio.rcs.ads.VideoAdsUI.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (VideoAdsUI.this.k) {
                        VideoAdsUI.this.j.setVisibility(4);
                    }
                    VideoAdsUI.this.l = null;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            if (!this.k) {
                this.j.setVisibility(0);
                e();
            }
            this.j.startAnimation(this.l);
        }
    }

    boolean c() {
        return this.a.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        this.f = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Runnable runnable) {
        this.g = runnable;
    }
}
