package com.amazon.aps.iva.x3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.google.android.gms.cast.MediaError;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public final class c {
    public static final a x = new a();
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public final OverScroller r;
    public final AbstractC0840c s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public int c = -1;
    public final b w = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.p(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0840c abstractC0840c) {
        if (viewGroup != null) {
            if (abstractC0840c != null) {
                this.v = viewGroup;
                this.s = abstractC0840c;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.p = i;
                this.o = i;
                this.b = viewConfiguration.getScaledTouchSlop();
                this.m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.r = new OverScroller(context, x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public static c h(ViewGroup viewGroup, float f, AbstractC0840c abstractC0840c) {
        c cVar = new c(viewGroup.getContext(), viewGroup, abstractC0840c);
        cVar.b = (int) ((1.0f / f) * cVar.b);
        return cVar;
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent == viewGroup) {
            this.t = view;
            this.c = i;
            this.s.onViewCaptured(view, i);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.s.onEdgeLock(i2)) {
            int[] iArr = this.j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.i[i] & i2) != 0 || abs <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean d(float f, float f2, View view) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        AbstractC0840c abstractC0840c = this.s;
        if (abstractC0840c.getViewHorizontalDragRange(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC0840c.getViewVerticalDragRange(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            float f3 = (f2 * f2) + (f * f);
            int i = this.b;
            if (f3 <= i * i) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.b) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    public final void e(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int f(int i, int i2, int i3) {
        int width;
        int abs;
        if (i == 0) {
            return 0;
        }
        float width2 = this.v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, (int) MediaError.DetailedErrorCode.TEXT_UNKNOWN);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                WeakHashMap<View, r0> weakHashMap = g0.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                WeakHashMap<View, r0> weakHashMap2 = g0.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.onViewPositionChanged(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.v.post(this.w);
            }
        }
        if (this.a != 2) {
            return false;
        }
        return true;
    }

    public final View i(int i, int i2) {
        ViewGroup viewGroup = this.v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.t
            int r2 = r0.getLeft()
            android.view.View r0 = r10.t
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.r
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.t
            float r0 = r10.n
            int r0 = (int) r0
            float r6 = r10.m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            float r0 = r10.n
            int r0 = (int) r0
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3f
            goto L46
        L3f:
            if (r7 <= r6) goto L47
            if (r14 <= 0) goto L45
            r14 = r6
            goto L47
        L45:
            int r11 = -r6
        L46:
            r14 = r11
        L47:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L60
            float r11 = (float) r6
            float r6 = (float) r8
            goto L62
        L60:
            float r11 = (float) r11
            float r6 = (float) r9
        L62:
            float r11 = r11 / r6
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
            goto L6a
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
        L6a:
            float r0 = r0 / r6
            com.amazon.aps.iva.x3.c$c r6 = r10.s
            int r7 = r6.getViewHorizontalDragRange(r12)
            int r13 = r10.f(r4, r13, r7)
            int r12 = r6.getViewVerticalDragRange(r12)
            int r12 = r10.f(r5, r14, r12)
            float r13 = (float) r13
            float r13 = r13 * r11
            float r11 = (float) r12
            float r11 = r11 * r0
            float r11 = r11 + r13
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x3.c.j(int, int, int, int):boolean");
    }

    public final void k(MotionEvent motionEvent) {
        boolean z;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        AbstractC0840c abstractC0840c = this.s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.a == 1 && pointerId == this.c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.c) {
                                                View i3 = i((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.t;
                                                if (i3 == view && t(pointerId2, view)) {
                                                    i = this.c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x2 = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        n(pointerId3, x2, y);
                        if (this.a == 0) {
                            t(pointerId3, i((int) x2, (int) y));
                            int i4 = this.h[pointerId3] & this.q;
                            if (i4 != 0) {
                                abstractC0840c.onEdgeTouched(i4, pointerId3);
                                return;
                            }
                            return;
                        }
                        int i5 = (int) x2;
                        int i6 = (int) y;
                        View view2 = this.t;
                        if (view2 != null && i5 >= view2.getLeft() && i5 < view2.getRight() && i6 >= view2.getTop() && i6 < view2.getBottom()) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            t(pointerId3, this.t);
                            return;
                        }
                        return;
                    }
                    if (this.a == 1) {
                        this.u = true;
                        abstractC0840c.onViewReleased(this.t, 0.0f, 0.0f);
                        this.u = false;
                        if (this.a == 1) {
                            p(0);
                        }
                    }
                    a();
                    return;
                } else if (this.a == 1) {
                    int i7 = this.c;
                    if ((this.k & (1 << i7)) != 0) {
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f;
                        int i8 = this.c;
                        int i9 = (int) (x3 - fArr[i8]);
                        int i10 = (int) (y2 - this.g[i8]);
                        int left = this.t.getLeft() + i9;
                        int top = this.t.getTop() + i10;
                        int left2 = this.t.getLeft();
                        int top2 = this.t.getTop();
                        if (i9 != 0) {
                            left = abstractC0840c.clampViewPositionHorizontal(this.t, left, i9);
                            WeakHashMap<View, r0> weakHashMap = g0.a;
                            this.t.offsetLeftAndRight(left - left2);
                        }
                        int i11 = left;
                        if (i10 != 0) {
                            top = abstractC0840c.clampViewPositionVertical(this.t, top, i10);
                            WeakHashMap<View, r0> weakHashMap2 = g0.a;
                            this.t.offsetTopAndBottom(top - top2);
                        }
                        int i12 = top;
                        if (i9 != 0 || i10 != 0) {
                            this.s.onViewPositionChanged(this.t, i11, i12, i11 - left2, i12 - top2);
                        }
                        o(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    for (int i13 = 0; i13 < pointerCount2; i13++) {
                        int pointerId4 = motionEvent.getPointerId(i13);
                        if ((this.k & (1 << pointerId4)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            float x4 = motionEvent.getX(i13);
                            float y3 = motionEvent.getY(i13);
                            float f = x4 - this.d[pointerId4];
                            float f2 = y3 - this.e[pointerId4];
                            m(pointerId4, f, f2);
                            if (this.a == 1) {
                                break;
                            }
                            View i14 = i((int) x4, (int) y3);
                            if (d(f, f2, i14) && t(pointerId4, i14)) {
                                break;
                            }
                        }
                    }
                    o(motionEvent);
                    return;
                }
            }
            if (this.a == 1) {
                l();
            }
            a();
            return;
        }
        float x5 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View i15 = i((int) x5, (int) y4);
        n(pointerId5, x5, y4);
        t(pointerId5, i15);
        int i16 = this.h[pointerId5] & this.q;
        if (i16 != 0) {
            abstractC0840c.onEdgeTouched(i16, pointerId5);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > 0.0f) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float f4 = this.n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.u = true;
        this.s.onViewReleased(this.t, xVelocity, f3);
        this.u = false;
        if (this.a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.amazon.aps.iva.x3.c$c] */
    public final void m(int i, float f, float f2) {
        boolean c = c(f, f2, i, 1);
        boolean z = c;
        if (c(f2, f, i, 4)) {
            z = c | true;
        }
        boolean z2 = z;
        if (c(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (c(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r0;
            this.s.onEdgeDragStarted(r0, i);
        }
    }

    public final void n(int i, float f, float f2) {
        float[] fArr = this.d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.v;
        if (i4 < viewGroup.getLeft() + this.o) {
            i2 = 1;
        }
        if (i5 < viewGroup.getTop() + this.o) {
            i2 |= 4;
        }
        if (i4 > viewGroup.getRight() - this.o) {
            i2 |= 2;
        }
        if (i5 > viewGroup.getBottom() - this.o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.k = (1 << i) | this.k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            boolean z = true;
            if ((this.k & (1 << pointerId)) == 0) {
                z = false;
            }
            if (z) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    public final void p(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.s.onViewDragStateChanged(i);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean q(int i, int i2) {
        if (this.u) {
            return j(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
        if (r13 != r12) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x3.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean j = j(i, i2, 0, 0);
        if (!j && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return j;
    }

    public final boolean t(int i, View view) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view != null && this.s.tryCaptureView(view, i)) {
            this.c = i;
            b(i, view);
            return true;
        }
        return false;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: com.amazon.aps.iva.x3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0840c {
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public abstract boolean tryCaptureView(View view, int i);

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }
    }
}
