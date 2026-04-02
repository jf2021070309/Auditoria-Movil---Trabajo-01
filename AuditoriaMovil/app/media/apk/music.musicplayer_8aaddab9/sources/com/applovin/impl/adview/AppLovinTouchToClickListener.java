package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {
    private final long a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3133b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3134c;

    /* renamed from: d  reason: collision with root package name */
    private final ClickRecognitionState f3135d;

    /* renamed from: e  reason: collision with root package name */
    private long f3136e;

    /* renamed from: f  reason: collision with root package name */
    private PointF f3137f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3138g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f3139h;

    /* renamed from: i  reason: collision with root package name */
    private final OnClickListener f3140i;

    /* loaded from: classes.dex */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* loaded from: classes.dex */
    public interface OnClickListener {
        void onClick(View view, PointF pointF);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.m mVar, com.applovin.impl.sdk.c.b<Integer> bVar, Context context, OnClickListener onClickListener) {
        this.a = ((Long) mVar.a(com.applovin.impl.sdk.c.b.aP)).longValue();
        this.f3133b = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.aQ)).intValue();
        this.f3134c = AppLovinSdkUtils.dpToPx(context, ((Integer) mVar.a(com.applovin.impl.sdk.c.b.aT)).intValue());
        this.f3135d = ClickRecognitionState.values()[((Integer) mVar.a(bVar)).intValue()];
        this.f3139h = context;
        this.f3140i = onClickListener;
    }

    private float a(float f2) {
        return f2 / this.f3139h.getResources().getDisplayMetrics().density;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f2 = pointF.x - pointF2.x;
        float f3 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f3 * f3) + (f2 * f2)));
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f3140i.onClick(view, new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
        this.f3138g = true;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f3134c <= 0) {
            return true;
        }
        Point a = com.applovin.impl.sdk.utils.g.a(this.f3139h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i2 = this.f3134c;
        return rawX >= ((float) i2) && rawY >= ((float) i2) && rawX <= ((float) (a.x - i2)) && rawY <= ((float) (a.y - i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r9.f3135d != com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r2 >= r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
        if (r0 >= r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (a(r11) != false) goto L10;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            int r0 = r11.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L5e
            if (r0 == r1) goto L19
            r2 = 6
            if (r0 == r2) goto Le
            goto L86
        Le:
            boolean r0 = r9.f3138g
            if (r0 != 0) goto L86
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r9.f3135d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP
            if (r0 != r2) goto L86
            goto L6a
        L19:
            boolean r0 = r9.f3138g
            if (r0 != 0) goto L24
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r9.f3135d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_UP
            if (r0 != r2) goto L24
            goto L6a
        L24:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r9.f3135d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.DISABLED
            if (r0 != r2) goto L86
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r9.f3136e
            long r2 = r2 - r4
            android.graphics.PointF r0 = r9.f3137f
            android.graphics.PointF r4 = new android.graphics.PointF
            float r5 = r11.getX()
            float r6 = r11.getY()
            r4.<init>(r5, r6)
            float r0 = r9.a(r0, r4)
            boolean r4 = r9.f3138g
            if (r4 != 0) goto L86
            long r4 = r9.a
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L54
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L86
        L54:
            int r2 = r9.f3133b
            if (r2 < 0) goto L6a
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L86
            goto L6a
        L5e:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r9.f3135d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN
            if (r0 != r2) goto L6e
            boolean r0 = r9.a(r11)
            if (r0 == 0) goto L86
        L6a:
            r9.a(r10, r11)
            goto L86
        L6e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r9.f3136e = r2
            android.graphics.PointF r10 = new android.graphics.PointF
            float r0 = r11.getX()
            float r11 = r11.getY()
            r10.<init>(r0, r11)
            r9.f3137f = r10
            r10 = 0
            r9.f3138g = r10
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.AppLovinTouchToClickListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
