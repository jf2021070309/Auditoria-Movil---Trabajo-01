package com.amazon.aps.iva.t3;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.google.android.gms.cast.MediaError;
import java.util.WeakHashMap;
/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();
    public final C0729a b;
    public final AccelerateInterpolator c;
    public final View d;
    public b e;
    public final float[] f;
    public final float[] g;
    public int h;
    public int i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: com.amazon.aps.iva.t3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0729a {
        public int a;
        public int b;
        public float c;
        public float d;
        public float h;
        public int i;
        public long e = Long.MIN_VALUE;
        public long g = -1;
        public long f = 0;

        public final float a(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.g;
            if (j3 >= 0 && j >= j3) {
                float f = this.h;
                return (a.b(((float) (j - j3)) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
            }
            return a.b(((float) (j - j2)) / this.a, 0.0f, 1.0f) * 0.5f;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            a aVar = a.this;
            if (!aVar.p) {
                return;
            }
            boolean z2 = aVar.n;
            C0729a c0729a = aVar.b;
            if (z2) {
                aVar.n = false;
                c0729a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0729a.e = currentAnimationTimeMillis;
                c0729a.g = -1L;
                c0729a.f = currentAnimationTimeMillis;
                c0729a.h = 0.5f;
            }
            if (c0729a.g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0729a.g + c0729a.i) {
                z = true;
            } else {
                z = false;
            }
            if (!z && aVar.e()) {
                boolean z3 = aVar.o;
                View view = aVar.d;
                if (z3) {
                    aVar.o = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0729a.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = c0729a.a(currentAnimationTimeMillis2);
                    c0729a.f = currentAnimationTimeMillis2;
                    g.b(((f) aVar).s, (int) (((float) (currentAnimationTimeMillis2 - c0729a.f)) * ((a * 4.0f) + ((-4.0f) * a * a)) * c0729a.d));
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    g0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            aVar.p = false;
        }
    }

    public a(View view) {
        C0729a c0729a = new C0729a();
        this.b = c0729a;
        this.c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.l = fArr5;
        this.d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.i = r;
        c0729a.a = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
        c0729a.b = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f
            r0 = r0[r7]
            float[] r1 = r3.g
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.c
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.j
            r0 = r0[r7]
            float[] r1 = r3.k
            r1 = r1[r7]
            float[] r2 = r3.l
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t3.a.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.h;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.p && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.n) {
            this.p = false;
            return;
        }
        C0729a c0729a = this.b;
        c0729a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c0729a.e);
        int i3 = c0729a.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0729a.i = i;
        c0729a.h = c0729a.a(currentAnimationTimeMillis);
        c0729a.g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r9 = this;
            com.amazon.aps.iva.t3.a$a r0 = r9.b
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L55
            r3 = r9
            com.amazon.aps.iva.t3.f r3 = (com.amazon.aps.iva.t3.f) r3
            android.widget.ListView r3 = r3.s
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L23
        L21:
            r1 = r2
            goto L51
        L23:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r4) goto L50
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r5
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r5
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t3.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.o = r2
            r7.m = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.d
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            com.amazon.aps.iva.t3.a$a r9 = r7.b
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.p
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            com.amazon.aps.iva.t3.a$b r8 = r7.e
            if (r8 != 0) goto L5f
            com.amazon.aps.iva.t3.a$b r8 = new com.amazon.aps.iva.t3.a$b
            r8.<init>()
            r7.e = r8
        L5f:
            r7.p = r2
            r7.n = r2
            boolean r8 = r7.m
            if (r8 != 0) goto L74
            int r8 = r7.i
            if (r8 <= 0) goto L74
            com.amazon.aps.iva.t3.a$b r9 = r7.e
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, com.amazon.aps.iva.p3.r0> r8 = com.amazon.aps.iva.p3.g0.a
            com.amazon.aps.iva.p3.g0.d.n(r4, r9, r5)
            goto L79
        L74:
            com.amazon.aps.iva.t3.a$b r8 = r7.e
            r8.run()
        L79:
            r7.m = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t3.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
