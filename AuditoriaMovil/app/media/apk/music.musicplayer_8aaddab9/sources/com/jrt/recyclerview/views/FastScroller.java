package com.jrt.recyclerview.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import c.n.a.a.c;
import com.google.android.gms.common.ConnectionResult;
import e.h.g.m1;
/* loaded from: classes2.dex */
public class FastScroller {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public Animator f4859b;

    /* renamed from: c  reason: collision with root package name */
    public int f4860c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4861d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f4862e;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4865h;

    /* renamed from: i  reason: collision with root package name */
    public int f4866i;

    /* renamed from: k  reason: collision with root package name */
    public FastScrollPopup f4868k;

    /* renamed from: l  reason: collision with root package name */
    public FastScrollRecyclerView f4869l;

    /* renamed from: m  reason: collision with root package name */
    public Paint f4870m;

    /* renamed from: n  reason: collision with root package name */
    public int f4871n;
    public int o;
    public int p;
    public boolean q;
    public int t;
    public int u;
    public int v;
    public Paint w;
    public int x;

    /* renamed from: f  reason: collision with root package name */
    public Rect f4863f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public Rect f4864g = new Rect();

    /* renamed from: j  reason: collision with root package name */
    public Point f4867j = new Point(0, 0);
    public Point r = new Point(-1, -1);
    public Rect s = new Rect();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FastScroller fastScroller = FastScroller.this;
            if (fastScroller.f4865h) {
                return;
            }
            Animator animator = fastScroller.f4859b;
            if (animator != null) {
                animator.cancel();
            }
            FastScroller fastScroller2 = FastScroller.this;
            int[] iArr = new int[1];
            iArr[0] = (e.d.b.d.a.O(fastScroller2.f4869l.getResources()) ? -1 : 1) * FastScroller.this.x;
            fastScroller2.f4859b = ObjectAnimator.ofInt(fastScroller2, "offsetX", iArr);
            FastScroller.this.f4859b.setInterpolator(new c.n.a.a.a());
            FastScroller.this.f4859b.setDuration(200L);
            FastScroller.this.f4859b.start();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(RecyclerView recyclerView, int i2, int i3) {
            if (FastScroller.this.f4869l.isInEditMode()) {
                return;
            }
            FastScroller fastScroller = FastScroller.this;
            if (!fastScroller.a) {
                Animator animator = fastScroller.f4859b;
                if (animator != null) {
                    animator.cancel();
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(fastScroller, "offsetX", 0);
                fastScroller.f4859b = ofInt;
                ofInt.setInterpolator(new c());
                fastScroller.f4859b.setDuration(150L);
                fastScroller.f4859b.addListener(new e.g.a.f.a(fastScroller));
                fastScroller.a = true;
                fastScroller.f4859b.start();
            }
            if (fastScroller.f4861d) {
                fastScroller.d();
            } else {
                fastScroller.a();
            }
        }
    }

    public FastScroller(Context context, FastScrollRecyclerView fastScrollRecyclerView, AttributeSet attributeSet) {
        this.f4860c = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f4861d = true;
        this.p = 2030043136;
        Resources resources = context.getResources();
        this.f4869l = fastScrollRecyclerView;
        this.f4868k = new FastScrollPopup(resources, fastScrollRecyclerView);
        this.o = e.d.b.d.a.h0(resources, 48.0f);
        this.x = e.d.b.d.a.h0(resources, 8.0f);
        this.t = e.d.b.d.a.h0(resources, -24.0f);
        this.f4870m = new Paint(1);
        this.w = new Paint(1);
        this.v = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m1.a, 0, 0);
        try {
            this.f4861d = obtainStyledAttributes.getBoolean(0, true);
            this.f4860c = obtainStyledAttributes.getInteger(1, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            this.q = obtainStyledAttributes.getBoolean(2, true);
            this.f4871n = obtainStyledAttributes.getColor(8, 2030043136);
            this.p = obtainStyledAttributes.getColor(10, 2030043136);
            int color = obtainStyledAttributes.getColor(11, 671088640);
            int color2 = obtainStyledAttributes.getColor(4, -16777216);
            int color3 = obtainStyledAttributes.getColor(6, -1);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, (int) TypedValue.applyDimension(2, 44.0f, resources.getDisplayMetrics()));
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, (int) (resources.getDisplayMetrics().density * 88.0f));
            int integer = obtainStyledAttributes.getInteger(5, 0);
            this.w.setColor(color);
            this.f4870m.setColor(this.q ? this.p : this.f4871n);
            FastScrollPopup fastScrollPopup = this.f4868k;
            fastScrollPopup.f4845c = color2;
            fastScrollPopup.f4846d.setColor(color2);
            fastScrollPopup.f4854l.invalidate(fastScrollPopup.f4850h);
            FastScrollPopup fastScrollPopup2 = this.f4868k;
            fastScrollPopup2.p.setColor(color3);
            fastScrollPopup2.f4854l.invalidate(fastScrollPopup2.f4850h);
            this.f4868k.c(dimensionPixelSize);
            FastScrollPopup fastScrollPopup3 = this.f4868k;
            fastScrollPopup3.f4849g = dimensionPixelSize2;
            fastScrollPopup3.f4851i = dimensionPixelSize2 / 2;
            fastScrollPopup3.f4854l.invalidate(fastScrollPopup3.f4850h);
            this.f4868k.f4853k = integer;
            obtainStyledAttributes.recycle();
            this.f4862e = new a();
            this.f4869l.k(new b());
            if (this.f4861d) {
                d();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void a() {
        FastScrollRecyclerView fastScrollRecyclerView = this.f4869l;
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.removeCallbacks(this.f4862e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.view.MotionEvent r11, int r12, int r13, int r14, e.g.a.b.a r15) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jrt.recyclerview.views.FastScroller.b(android.view.MotionEvent, int, int, int, e.g.a.b.a):void");
    }

    public final boolean c(int i2, int i3) {
        Rect rect = this.s;
        Point point = this.r;
        int i4 = point.x;
        int i5 = point.y;
        rect.set(i4, i5, this.x + i4, this.o + i5);
        Rect rect2 = this.s;
        int i6 = this.t;
        rect2.inset(i6, i6);
        return this.s.contains(i2, i3);
    }

    public void d() {
        if (this.f4869l != null) {
            a();
            this.f4869l.postDelayed(this.f4862e, this.f4860c);
        }
    }

    public void e(int i2, int i3) {
        Point point = this.r;
        int i4 = point.x;
        if (i4 == i2 && point.y == i3) {
            return;
        }
        Rect rect = this.f4863f;
        Point point2 = this.f4867j;
        int i5 = point2.x;
        rect.set(i4 + i5, point2.y, i4 + i5 + this.x, this.f4869l.getHeight() + this.f4867j.y);
        this.r.set(i2, i3);
        Rect rect2 = this.f4864g;
        int i6 = this.r.x;
        Point point3 = this.f4867j;
        int i7 = point3.x;
        rect2.set(i6 + i7, point3.y, i6 + i7 + this.x, this.f4869l.getHeight() + this.f4867j.y);
        this.f4863f.union(this.f4864g);
        this.f4869l.invalidate(this.f4863f);
    }

    @Keep
    public int getOffsetX() {
        return this.f4867j.x;
    }

    @Keep
    public void setOffsetX(int i2) {
        Point point = this.f4867j;
        int i3 = point.y;
        int i4 = point.x;
        if (i4 == i2 && i3 == i3) {
            return;
        }
        Rect rect = this.f4863f;
        int i5 = this.r.x + i4;
        rect.set(i5, i3, this.x + i5, this.f4869l.getHeight() + this.f4867j.y);
        this.f4867j.set(i2, i3);
        Rect rect2 = this.f4864g;
        int i6 = this.r.x;
        Point point2 = this.f4867j;
        int i7 = i6 + point2.x;
        rect2.set(i7, point2.y, this.x + i7, this.f4869l.getHeight() + this.f4867j.y);
        this.f4863f.union(this.f4864g);
        this.f4869l.invalidate(this.f4863f);
    }
}
