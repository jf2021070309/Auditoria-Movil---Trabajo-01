package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.i.k.d0;
import c.i.k.k0.b;
import c.k.a.e;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public e a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4538b;

    /* renamed from: c  reason: collision with root package name */
    public int f4539c = 2;

    /* renamed from: d  reason: collision with root package name */
    public float f4540d = 0.5f;

    /* renamed from: e  reason: collision with root package name */
    public float f4541e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f4542f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public final e.c f4543g = new a();

    /* loaded from: classes2.dex */
    public class a extends e.c {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f4544b = -1;

        public a() {
        }

        @Override // c.k.a.e.c
        public int a(View view, int i2, int i3) {
            int width;
            int width2;
            int width3;
            AtomicInteger atomicInteger = d0.a;
            boolean z = d0.d.d(view) == 1;
            int i4 = SwipeDismissBehavior.this.f4539c;
            if (i4 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i4 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return Math.min(Math.max(width, i2), width2);
        }

        @Override // c.k.a.e.c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // c.k.a.e.c
        public int c(View view) {
            return view.getWidth();
        }

        @Override // c.k.a.e.c
        public void e(View view, int i2) {
            this.f4544b = i2;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // c.k.a.e.c
        public void f(int i2) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // c.k.a.e.c
        public void g(View view, int i2, int i3, int i4, int i5) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f4541e) + this.a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f4542f) + this.a;
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.C(0.0f, 1.0f - ((f2 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
            if (java.lang.Math.abs(r7.getLeft() - r6.a) >= java.lang.Math.round(r7.getWidth() * r6.f4545c.f4540d)) goto L37;
         */
        @Override // c.k.a.e.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r9 = -1
                r6.f4544b = r9
                int r9 = r7.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L40
                java.util.concurrent.atomic.AtomicInteger r3 = c.i.k.d0.a
                int r3 = c.i.k.d0.d.d(r7)
                if (r3 != r2) goto L18
                r3 = 1
                goto L19
            L18:
                r3 = 0
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f4539c
                r5 = 2
                if (r4 != r5) goto L21
                goto L2e
            L21:
                if (r4 != 0) goto L32
                if (r3 == 0) goto L2a
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L30
                goto L2e
            L2a:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L30
            L2e:
                r8 = 1
                goto L5d
            L30:
                r8 = 0
                goto L5d
            L32:
                if (r4 != r2) goto L30
                if (r3 == 0) goto L3b
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L30
                goto L3f
            L3b:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L30
            L3f:
                goto L2e
            L40:
                int r8 = r7.getLeft()
                int r0 = r6.a
                int r8 = r8 - r0
                int r0 = r7.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f4540d
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r0) goto L30
                goto L2e
            L5d:
                if (r8 == 0) goto L6c
                int r8 = r7.getLeft()
                int r0 = r6.a
                if (r8 >= r0) goto L69
                int r0 = r0 - r9
                goto L6a
            L69:
                int r0 = r0 + r9
            L6a:
                r1 = 1
                goto L6e
            L6c:
                int r0 = r6.a
            L6e:
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                c.k.a.e r8 = r8.a
                int r9 = r7.getTop()
                boolean r8 = r8.t(r0, r9)
                if (r8 == 0) goto L89
                com.google.android.material.behavior.SwipeDismissBehavior$b r8 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.<init>(r7, r1)
                java.util.concurrent.atomic.AtomicInteger r9 = c.i.k.d0.a
                c.i.k.d0.c.m(r7, r8)
                goto L90
            L89:
                if (r1 == 0) goto L90
                com.google.android.material.behavior.SwipeDismissBehavior r7 = com.google.android.material.behavior.SwipeDismissBehavior.this
                java.util.Objects.requireNonNull(r7)
            L90:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // c.k.a.e.c
        public boolean i(View view, int i2) {
            int i3 = this.f4544b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.B(view);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4546b;

        public b(View view, boolean z) {
            this.a = view;
            this.f4546b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = SwipeDismissBehavior.this.a;
            if (eVar == null || !eVar.i(true)) {
                if (this.f4546b) {
                    Objects.requireNonNull(SwipeDismissBehavior.this);
                    return;
                }
                return;
            }
            View view = this.a;
            AtomicInteger atomicInteger = d0.a;
            d0.c.m(view, this);
        }
    }

    public static float C(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.n(motionEvent);
            return true;
        }
        return false;
    }

    public boolean B(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f4538b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f4538b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4538b = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f4543g);
            }
            return this.a.u(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        AtomicInteger atomicInteger = d0.a;
        if (d0.c.c(v) == 0) {
            d0.c.s(v, 1);
            d0.v(v, 1048576);
            if (B(v)) {
                d0.x(v, b.a.f2200f, null, new e.d.b.d.e.a(this));
                return false;
            }
            return false;
        }
        return false;
    }
}
