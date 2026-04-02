package c.i.l;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import c.i.k.d0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int a = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    public final C0042a f2217b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f2218c;

    /* renamed from: d  reason: collision with root package name */
    public final View f2219d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f2220e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f2221f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2222g;

    /* renamed from: h  reason: collision with root package name */
    public int f2223h;

    /* renamed from: i  reason: collision with root package name */
    public int f2224i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f2225j;

    /* renamed from: k  reason: collision with root package name */
    public float[] f2226k;

    /* renamed from: l  reason: collision with root package name */
    public float[] f2227l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2228m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2229n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* renamed from: c.i.l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0042a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2230b;

        /* renamed from: c  reason: collision with root package name */
        public float f2231c;

        /* renamed from: d  reason: collision with root package name */
        public float f2232d;

        /* renamed from: j  reason: collision with root package name */
        public float f2238j;

        /* renamed from: k  reason: collision with root package name */
        public int f2239k;

        /* renamed from: e  reason: collision with root package name */
        public long f2233e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        public long f2237i = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f2234f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f2235g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2236h = 0;

        public final float a(long j2) {
            long j3 = this.f2233e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f2237i;
            if (j4 < 0 || j2 < j4) {
                return a.b(((float) (j2 - j3)) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f2238j;
            return (a.b(((float) (j2 - j4)) / this.f2239k, 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.f2229n) {
                    aVar.f2229n = false;
                    C0042a c0042a = aVar.f2217b;
                    Objects.requireNonNull(c0042a);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0042a.f2233e = currentAnimationTimeMillis;
                    c0042a.f2237i = -1L;
                    c0042a.f2234f = currentAnimationTimeMillis;
                    c0042a.f2238j = 0.5f;
                    c0042a.f2235g = 0;
                    c0042a.f2236h = 0;
                }
                C0042a c0042a2 = a.this.f2217b;
                if ((c0042a2.f2237i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0042a2.f2237i + ((long) c0042a2.f2239k)) || !a.this.e()) {
                    a.this.p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.o) {
                    aVar2.o = false;
                    Objects.requireNonNull(aVar2);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar2.f2219d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0042a2.f2234f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float a = c0042a2.a(currentAnimationTimeMillis2);
                c0042a2.f2234f = currentAnimationTimeMillis2;
                float f2 = ((float) (currentAnimationTimeMillis2 - c0042a2.f2234f)) * ((a * 4.0f) + ((-4.0f) * a * a));
                c0042a2.f2235g = (int) (c0042a2.f2231c * f2);
                int i2 = (int) (f2 * c0042a2.f2232d);
                c0042a2.f2236h = i2;
                ((d) a.this).r.scrollListBy(i2);
                View view = a.this.f2219d;
                AtomicInteger atomicInteger = d0.a;
                d0.c.m(view, this);
            }
        }
    }

    public a(View view) {
        C0042a c0042a = new C0042a();
        this.f2217b = c0042a;
        this.f2218c = new AccelerateInterpolator();
        this.f2221f = new float[]{0.0f, 0.0f};
        this.f2222g = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2225j = new float[]{0.0f, 0.0f};
        this.f2226k = new float[]{0.0f, 0.0f};
        this.f2227l = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2219d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f2227l;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f2226k;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f2223h = 1;
        float[] fArr3 = this.f2222g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f2221f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f2225j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f2224i = a;
        c0042a.a = 500;
        c0042a.f2230b = 500;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2221f
            r0 = r0[r4]
            float[] r1 = r3.f2222g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L26
            android.view.animation.Interpolator r6 = r3.f2218c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L30
        L26:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            android.view.animation.Interpolator r6 = r3.f2218c
            float r5 = r6.getInterpolation(r5)
        L30:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r2
        L3f:
            float[] r6 = r3.f2225j
            r6 = r6[r4]
            float[] r0 = r3.f2226k
            r0 = r0[r4]
            float[] r1 = r3.f2227l
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L58
            float r5 = r5 * r6
            float r4 = b(r5, r0, r4)
            return r4
        L58:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = b(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.l.a.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f2223h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.p && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f2229n) {
            this.p = false;
            return;
        }
        C0042a c0042a = this.f2217b;
        Objects.requireNonNull(c0042a);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - c0042a.f2233e);
        int i4 = c0042a.f2230b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        c0042a.f2239k = i2;
        c0042a.f2238j = c0042a.a(currentAnimationTimeMillis);
        c0042a.f2237i = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e() {
        /*
            r9 = this;
            c.i.l.a$a r0 = r9.f2217b
            float r1 = r0.f2232d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f2231c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            c.i.l.d r4 = (c.i.l.d) r4
            android.widget.ListView r4 = r4.r
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = 0
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = 0
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.l.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7f
        L16:
            r5.d()
            goto L7f
        L1a:
            r5.o = r2
            r5.f2228m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2219d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2219d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            c.i.l.a$a r7 = r5.f2217b
            r7.f2231c = r0
            r7.f2232d = r6
            boolean r6 = r5.p
            if (r6 != 0) goto L7f
            boolean r6 = r5.e()
            if (r6 == 0) goto L7f
            java.lang.Runnable r6 = r5.f2220e
            if (r6 != 0) goto L61
            c.i.l.a$b r6 = new c.i.l.a$b
            r6.<init>()
            r5.f2220e = r6
        L61:
            r5.p = r2
            r5.f2229n = r2
            boolean r6 = r5.f2228m
            if (r6 != 0) goto L78
            int r6 = r5.f2224i
            if (r6 <= 0) goto L78
            android.view.View r7 = r5.f2219d
            java.lang.Runnable r0 = r5.f2220e
            long r3 = (long) r6
            java.util.concurrent.atomic.AtomicInteger r6 = c.i.k.d0.a
            c.i.k.d0.c.n(r7, r0, r3)
            goto L7d
        L78:
            java.lang.Runnable r6 = r5.f2220e
            r6.run()
        L7d:
            r5.f2228m = r2
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.l.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
