package c.k.a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import c.i.k.d0;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class e {
    public static final Interpolator a = new a();

    /* renamed from: b  reason: collision with root package name */
    public int f2270b;

    /* renamed from: c  reason: collision with root package name */
    public int f2271c;

    /* renamed from: e  reason: collision with root package name */
    public float[] f2273e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f2274f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2275g;

    /* renamed from: h  reason: collision with root package name */
    public float[] f2276h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2277i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2278j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f2279k;

    /* renamed from: l  reason: collision with root package name */
    public int f2280l;

    /* renamed from: m  reason: collision with root package name */
    public VelocityTracker f2281m;

    /* renamed from: n  reason: collision with root package name */
    public float f2282n;
    public float o;
    public int p;
    public final int q;
    public OverScroller r;
    public final c s;
    public View t;
    public boolean u;
    public final ViewGroup v;

    /* renamed from: d  reason: collision with root package name */
    public int f2272d = -1;
    public final Runnable w = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.s(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(View view, int i2) {
        }

        public abstract void f(int i2);

        public abstract void g(View view, int i2, int i3, int i4, int i5);

        public abstract void h(View view, float f2, float f3);

        public abstract boolean i(View view, int i2);
    }

    public e(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.v = viewGroup;
        this.s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.q = i2;
        this.p = i2;
        this.f2271c = viewConfiguration.getScaledTouchSlop();
        this.f2282n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context, a);
    }

    public void a() {
        this.f2272d = -1;
        float[] fArr = this.f2273e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2274f, 0.0f);
            Arrays.fill(this.f2275g, 0.0f);
            Arrays.fill(this.f2276h, 0.0f);
            Arrays.fill(this.f2277i, 0);
            Arrays.fill(this.f2278j, 0);
            Arrays.fill(this.f2279k, 0);
            this.f2280l = 0;
        }
        VelocityTracker velocityTracker = this.f2281m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2281m = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() != this.v) {
            StringBuilder y = e.a.d.a.a.y("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            y.append(this.v);
            y.append(")");
            throw new IllegalArgumentException(y.toString());
        }
        this.t = view;
        this.f2272d = i2;
        this.s.e(view, i2);
        s(1);
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f2277i[i2] & i3) != i3 || (0 & i3) == 0 || (this.f2279k[i2] & i3) == i3 || (this.f2278j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f2271c;
        if (abs > i4 || abs2 > i4) {
            if (abs < abs2 * 0.5f) {
                Objects.requireNonNull(this.s);
            }
            return (this.f2278j[i2] & i3) == 0 && abs > ((float) this.f2271c);
        }
        return false;
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.c(view) > 0;
        boolean z2 = this.s.d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2271c) : z2 && Math.abs(f3) > ((float) this.f2271c);
        }
        float f4 = f3 * f3;
        int i2 = this.f2271c;
        return f4 + (f2 * f2) > ((float) (i2 * i2));
    }

    public final float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    public final int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    public final void g(int i2) {
        float[] fArr = this.f2273e;
        if (fArr != null) {
            int i3 = this.f2280l;
            int i4 = 1 << i2;
            if ((i4 & i3) != 0) {
                fArr[i2] = 0.0f;
                this.f2274f[i2] = 0.0f;
                this.f2275g[i2] = 0.0f;
                this.f2276h[i2] = 0.0f;
                this.f2277i[i2] = 0;
                this.f2278j[i2] = 0;
                this.f2279k[i2] = 0;
                this.f2280l = (i4 ^ (-1)) & i3;
            }
        }
    }

    public final int h(int i2, int i3, int i4) {
        int width;
        if (i2 == 0) {
            return 0;
        }
        float width2 = this.v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    public boolean i(boolean z) {
        if (this.f2270b == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                d0.r(this.t, left);
            }
            if (top != 0) {
                d0.s(this.t, top);
            }
            if (left != 0 || top != 0) {
                this.s.g(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    s(0);
                }
            }
        }
        return this.f2270b == 2;
    }

    public final void j(float f2, float f3) {
        this.u = true;
        this.s.h(this.t, f2, f3);
        this.u = false;
        if (this.f2270b == 1) {
            s(0);
        }
    }

    public View k(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            Objects.requireNonNull(this.s);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean l(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            s(0);
            return false;
        }
        View view = this.t;
        int f6 = f(i4, (int) this.o, (int) this.f2282n);
        int f7 = f(i5, (int) this.o, (int) this.f2282n);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f6 != 0) {
            f2 = abs3;
            f3 = i8;
        } else {
            f2 = abs;
            f3 = i9;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f4 = abs4;
            f5 = i8;
        } else {
            f4 = abs2;
            f5 = i9;
        }
        int h2 = h(i6, f6, this.s.c(view));
        this.r.startScroll(left, top, i6, i7, (int) ((h(i7, f7, this.s.d(view)) * (f4 / f5)) + (h2 * f8)));
        s(2);
        return true;
    }

    public final boolean m(int i2) {
        if ((this.f2280l & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void n(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2281m == null) {
            this.f2281m = VelocityTracker.obtain();
        }
        this.f2281m.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View k2 = k((int) x, (int) y);
            q(x, y, pointerId);
            v(k2, pointerId);
            if ((this.f2277i[pointerId] & 0) != 0) {
                Objects.requireNonNull(this.s);
            }
        } else if (actionMasked == 1) {
            if (this.f2270b == 1) {
                o();
            }
            a();
        } else if (actionMasked == 2) {
            if (this.f2270b != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i3 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i3);
                    if (m(pointerId2)) {
                        float x2 = motionEvent.getX(i3);
                        float y2 = motionEvent.getY(i3);
                        float f2 = x2 - this.f2273e[pointerId2];
                        float f3 = y2 - this.f2274f[pointerId2];
                        p(f2, f3, pointerId2);
                        if (this.f2270b != 1) {
                            View k3 = k((int) x2, (int) y2);
                            if (d(k3, f2, f3) && v(k3, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i3++;
                }
                r(motionEvent);
            } else if (m(this.f2272d)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2272d);
                float x3 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f2275g;
                int i4 = this.f2272d;
                int i5 = (int) (x3 - fArr[i4]);
                int i6 = (int) (y3 - this.f2276h[i4]);
                int left = this.t.getLeft() + i5;
                int top = this.t.getTop() + i6;
                int left2 = this.t.getLeft();
                int top2 = this.t.getTop();
                if (i5 != 0) {
                    left = this.s.a(this.t, left, i5);
                    d0.r(this.t, left - left2);
                }
                int i7 = left;
                if (i6 != 0) {
                    top = this.s.b(this.t, top, i6);
                    d0.s(this.t, top - top2);
                }
                int i8 = top;
                if (i5 != 0 || i6 != 0) {
                    this.s.g(this.t, i7, i8, i7 - left2, i8 - top2);
                }
                r(motionEvent);
            }
        } else if (actionMasked == 3) {
            if (this.f2270b == 1) {
                j(0.0f, 0.0f);
            }
            a();
        } else if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f2270b == 1 && pointerId3 == this.f2272d) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i3 >= pointerCount2) {
                        i2 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i3);
                    if (pointerId4 != this.f2272d) {
                        View k4 = k((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                        View view = this.t;
                        if (k4 == view && v(view, pointerId4)) {
                            i2 = this.f2272d;
                            break;
                        }
                    }
                    i3++;
                }
                if (i2 == -1) {
                    o();
                }
            }
            g(pointerId3);
        } else {
            int pointerId5 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            q(x4, y4, pointerId5);
            if (this.f2270b == 0) {
                v(k((int) x4, (int) y4), pointerId5);
                if ((this.f2277i[pointerId5] & 0) != 0) {
                    Objects.requireNonNull(this.s);
                    return;
                }
                return;
            }
            int i9 = (int) x4;
            int i10 = (int) y4;
            View view2 = this.t;
            if (view2 != null && i9 >= view2.getLeft() && i9 < view2.getRight() && i10 >= view2.getTop() && i10 < view2.getBottom()) {
                i3 = 1;
            }
            if (i3 != 0) {
                v(this.t, pointerId5);
            }
        }
    }

    public final void o() {
        this.f2281m.computeCurrentVelocity(1000, this.f2282n);
        j(e(this.f2281m.getXVelocity(this.f2272d), this.o, this.f2282n), e(this.f2281m.getYVelocity(this.f2272d), this.o, this.f2282n));
    }

    public final void p(float f2, float f3, int i2) {
        int i3 = c(f2, f3, i2, 1) ? 1 : 0;
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f2278j;
            iArr[i2] = iArr[i2] | i3;
            Objects.requireNonNull(this.s);
        }
    }

    public final void q(float f2, float f3, int i2) {
        float[] fArr = this.f2273e;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2274f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2275g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2276h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2277i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2278j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2279k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2273e = fArr2;
            this.f2274f = fArr3;
            this.f2275g = fArr4;
            this.f2276h = fArr5;
            this.f2277i = iArr;
            this.f2278j = iArr2;
            this.f2279k = iArr3;
        }
        float[] fArr9 = this.f2273e;
        this.f2275g[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f2274f;
        this.f2276h[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f2277i;
        int i4 = (int) f2;
        int i5 = (int) f3;
        int i6 = i4 < this.v.getLeft() + this.p ? 1 : 0;
        if (i5 < this.v.getTop() + this.p) {
            i6 |= 4;
        }
        if (i4 > this.v.getRight() - this.p) {
            i6 |= 2;
        }
        if (i5 > this.v.getBottom() - this.p) {
            i6 |= 8;
        }
        iArr7[i2] = i6;
        this.f2280l |= 1 << i2;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f2275g[pointerId] = x;
                this.f2276h[pointerId] = y;
            }
        }
    }

    public void s(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.f2270b != i2) {
            this.f2270b = i2;
            this.s.f(i2);
            if (this.f2270b == 0) {
                this.t = null;
            }
        }
    }

    public boolean t(int i2, int i3) {
        if (this.u) {
            return l(i2, i3, (int) this.f2281m.getXVelocity(this.f2272d), (int) this.f2281m.getYVelocity(this.f2272d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.k.a.e.u(android.view.MotionEvent):boolean");
    }

    public boolean v(View view, int i2) {
        if (view == this.t && this.f2272d == i2) {
            return true;
        }
        if (view == null || !this.s.i(view, i2)) {
            return false;
        }
        this.f2272d = i2;
        b(view, i2);
        return true;
    }
}
