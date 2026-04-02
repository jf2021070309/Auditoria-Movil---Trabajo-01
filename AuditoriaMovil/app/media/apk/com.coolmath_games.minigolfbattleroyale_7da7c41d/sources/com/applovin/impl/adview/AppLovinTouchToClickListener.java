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
    private final int b;
    private final int c;
    private final ClickRecognitionState d;
    private long e;
    private PointF f;
    private boolean g;
    private final Context h;
    private final OnClickListener i;

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

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, Context context, OnClickListener onClickListener) {
        this(kVar, com.applovin.impl.sdk.c.b.aI, context, onClickListener);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, com.applovin.impl.sdk.c.b<Integer> bVar, Context context, OnClickListener onClickListener) {
        this.a = ((Long) kVar.a(com.applovin.impl.sdk.c.b.aG)).longValue();
        this.b = ((Integer) kVar.a(com.applovin.impl.sdk.c.b.aH)).intValue();
        this.c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(com.applovin.impl.sdk.c.b.aK)).intValue());
        this.d = ClickRecognitionState.values()[((Integer) kVar.a(bVar)).intValue()];
        this.h = context;
        this.i = onClickListener;
    }

    private float a(float f) {
        return f / this.h.getResources().getDisplayMetrics().density;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f * f) + (f2 * f2)));
    }

    private void a(View view, MotionEvent motionEvent) {
        this.i.onClick(view, new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
        this.g = true;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.c <= 0) {
            return true;
        }
        Point a = com.applovin.impl.sdk.utils.f.a(this.h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.c;
        return rawX >= ((float) i) && rawY >= ((float) i) && rawX <= ((float) (a.x - this.c)) && rawY <= ((float) (a.y - this.c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r8.d != com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r2 >= r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
        if (r0 >= r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (a(r10) != false) goto L10;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r0 = r10.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L5e
            if (r0 == r1) goto L19
            r2 = 6
            if (r0 == r2) goto Le
            goto L86
        Le:
            boolean r0 = r8.g
            if (r0 != 0) goto L86
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP
            if (r0 != r2) goto L86
            goto L6a
        L19:
            boolean r0 = r8.g
            if (r0 != 0) goto L24
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_UP
            if (r0 != r2) goto L24
            goto L6a
        L24:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.DISABLED
            if (r0 != r2) goto L86
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r8.e
            long r2 = r2 - r4
            android.graphics.PointF r0 = r8.f
            android.graphics.PointF r4 = new android.graphics.PointF
            float r5 = r10.getX()
            float r6 = r10.getY()
            r4.<init>(r5, r6)
            float r0 = r8.a(r0, r4)
            boolean r4 = r8.g
            if (r4 != 0) goto L86
            long r4 = r8.a
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L54
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L86
        L54:
            int r2 = r8.b
            if (r2 < 0) goto L6a
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L86
            goto L6a
        L5e:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN
            if (r0 != r2) goto L6e
            boolean r0 = r8.a(r10)
            if (r0 == 0) goto L86
        L6a:
            r8.a(r9, r10)
            goto L86
        L6e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r8.e = r2
            android.graphics.PointF r9 = new android.graphics.PointF
            float r0 = r10.getX()
            float r10 = r10.getY()
            r9.<init>(r0, r10)
            r8.f = r9
            r9 = 0
            r8.g = r9
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.AppLovinTouchToClickListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
