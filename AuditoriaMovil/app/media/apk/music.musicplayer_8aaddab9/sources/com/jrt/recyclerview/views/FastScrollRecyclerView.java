package com.jrt.recyclerview.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.h.g.m1;
import java.util.Objects;
/* loaded from: classes2.dex */
public class FastScrollRecyclerView extends RecyclerView implements RecyclerView.q {
    public int N0;
    public int O0;
    public boolean P0;
    public int Q0;
    public c R0;
    public SparseIntArray S0;
    public d T0;
    public FastScroller U0;
    public e.g.a.b.a V0;

    /* loaded from: classes2.dex */
    public interface b<VH extends RecyclerView.a0> {
        int a(RecyclerView recyclerView, VH vh, int i2);
    }

    /* loaded from: classes2.dex */
    public class c extends RecyclerView.g {
        public c(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void b(int i2, int i3) {
            g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i2, int i3, Object obj) {
            g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i2, int i3) {
            g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i2, int i3, int i4) {
            g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i2, int i3) {
            g();
        }

        public final void g() {
            FastScrollRecyclerView.this.S0.clear();
        }
    }

    /* loaded from: classes2.dex */
    public static class d {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f4857b;

        /* renamed from: c  reason: collision with root package name */
        public int f4858c;
    }

    /* loaded from: classes2.dex */
    public interface e {
        String a(int i2);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.P0 = true;
        this.T0 = new d();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m1.a, 0, 0);
        try {
            this.P0 = obtainStyledAttributes.getBoolean(9, true);
            obtainStyledAttributes.recycle();
            this.U0 = new FastScroller(context, this, attributeSet);
            this.R0 = new c(null);
            this.S0 = new SparseIntArray();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0 != 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.jrt.recyclerview.views.FastScroller r6 = r7.U0
            if (r6 == 0) goto L4b
            int r0 = r8.getAction()
            float r1 = r8.getX()
            int r2 = (int) r1
            float r1 = r8.getY()
            int r4 = (int) r1
            if (r0 == 0) goto L3a
            r1 = 1
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L1e
            r1 = 3
            if (r0 == r1) goto L2c
            goto L48
        L1e:
            r7.Q0 = r4
            int r2 = r7.N0
            int r3 = r7.O0
            e.g.a.b.a r5 = r7.V0
            r0 = r6
            r1 = r8
            r0.b(r1, r2, r3, r4, r5)
            goto L48
        L2c:
            int r2 = r7.N0
            int r3 = r7.O0
            int r4 = r7.Q0
            e.g.a.b.a r5 = r7.V0
            r0 = r6
            r1 = r8
            r0.b(r1, r2, r3, r4, r5)
            goto L48
        L3a:
            r7.N0 = r2
            r7.Q0 = r4
            r7.O0 = r4
            e.g.a.b.a r5 = r7.V0
            r0 = r6
            r1 = r8
            r3 = r4
            r0.b(r1, r2, r3, r4, r5)
        L48:
            boolean r8 = r6.f4865h
            return r8
        L4b:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jrt.recyclerview.views.FastScrollRecyclerView.A0(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        A0(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        return A0(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        Point point;
        int i2;
        int i3;
        int i4;
        float[] fArr;
        int y0;
        int i5;
        super.draw(canvas);
        if (this.P0) {
            if (getAdapter() != null) {
                int b2 = getAdapter().b();
                if (getLayoutManager() instanceof GridLayoutManager) {
                    double d2 = b2;
                    double d3 = ((GridLayoutManager) getLayoutManager()).H;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    b2 = (int) Math.ceil(d2 / d3);
                }
                if (b2 == 0) {
                    this.U0.e(-1, -1);
                } else {
                    z0(this.T0);
                    d dVar = this.T0;
                    if (dVar.f4857b < 0) {
                        this.U0.e(-1, -1);
                    } else {
                        if (getAdapter() instanceof b) {
                            y0 = y0(v0(), 0);
                            i5 = w0(dVar.f4857b);
                        } else {
                            y0 = y0(b2 * dVar.a, 0);
                            i5 = dVar.f4857b * dVar.a;
                        }
                        int availableScrollBarHeight = getAvailableScrollBarHeight();
                        if (y0 <= 0) {
                            this.U0.e(-1, -1);
                        } else {
                            this.U0.e(e.d.b.d.a.O(getResources()) ? 0 : getWidth() - this.U0.x, (int) ((Math.min(y0, (getPaddingTop() + i5) - dVar.f4858c) / y0) * availableScrollBarHeight));
                        }
                    }
                }
            }
            FastScroller fastScroller = this.U0;
            Point point2 = fastScroller.r;
            int i6 = point2.x;
            if (i6 < 0 || point2.y < 0) {
                return;
            }
            canvas.drawRect(i6 + fastScroller.f4867j.x, point.y, i2 + fastScroller.x, fastScroller.f4869l.getHeight() + fastScroller.f4867j.y, fastScroller.w);
            Point point3 = fastScroller.r;
            int i7 = point3.x;
            Point point4 = fastScroller.f4867j;
            canvas.drawRect(i7 + point4.x, point3.y + point4.y, i3 + fastScroller.x, i4 + fastScroller.o, fastScroller.f4870m);
            FastScrollPopup fastScrollPopup = fastScroller.f4868k;
            if (fastScrollPopup.b()) {
                int save = canvas.save();
                Rect rect = fastScrollPopup.f4850h;
                canvas.translate(rect.left, rect.top);
                fastScrollPopup.q.set(fastScrollPopup.f4850h);
                fastScrollPopup.q.offsetTo(0, 0);
                fastScrollPopup.f4847e.reset();
                fastScrollPopup.f4848f.set(fastScrollPopup.q);
                if (fastScrollPopup.f4853k == 1) {
                    float f2 = fastScrollPopup.f4851i;
                    fArr = new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
                } else if (e.d.b.d.a.O(fastScrollPopup.f4855m)) {
                    float f3 = fastScrollPopup.f4851i;
                    fArr = new float[]{f3, f3, f3, f3, f3, f3, 0.0f, 0.0f};
                } else {
                    float f4 = fastScrollPopup.f4851i;
                    fArr = new float[]{f4, f4, f4, f4, 0.0f, 0.0f, f4, f4};
                }
                fastScrollPopup.f4847e.addRoundRect(fastScrollPopup.f4848f, fArr, Path.Direction.CW);
                fastScrollPopup.f4846d.setAlpha((int) (Color.alpha(fastScrollPopup.f4845c) * fastScrollPopup.a));
                fastScrollPopup.p.setAlpha((int) (fastScrollPopup.a * 255.0f));
                canvas.drawPath(fastScrollPopup.f4847e, fastScrollPopup.f4846d);
                canvas.drawText(fastScrollPopup.f4856n, (fastScrollPopup.f4850h.width() - fastScrollPopup.o.width()) / 2, fastScrollPopup.f4850h.height() - ((fastScrollPopup.f4850h.height() - fastScrollPopup.o.height()) / 2), fastScrollPopup.p);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e(boolean z) {
    }

    public int getAvailableScrollBarHeight() {
        return getHeight() - this.U0.o;
    }

    public int getScrollBarThumbHeight() {
        return this.U0.o;
    }

    public int getScrollBarWidth() {
        return this.U0.x;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.x.add(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.e eVar) {
        if (getAdapter() != null) {
            RecyclerView.e adapter = getAdapter();
            adapter.a.unregisterObserver(this.R0);
        }
        if (eVar != null) {
            eVar.a.registerObserver(this.R0);
        }
        super.setAdapter(eVar);
    }

    public void setAutoHideDelay(int i2) {
        FastScroller fastScroller = this.U0;
        fastScroller.f4860c = i2;
        if (fastScroller.f4861d) {
            fastScroller.d();
        }
    }

    public void setAutoHideEnabled(boolean z) {
        FastScroller fastScroller = this.U0;
        fastScroller.f4861d = z;
        if (z) {
            fastScroller.d();
        } else {
            fastScroller.a();
        }
    }

    public void setFastScrollEnabled(boolean z) {
        this.P0 = z;
    }

    public void setOnFastScrollStateChangeListener(e.g.a.b.a aVar) {
        this.V0 = aVar;
    }

    public void setPopUpTypeface(Typeface typeface) {
        FastScrollPopup fastScrollPopup = this.U0.f4868k;
        fastScrollPopup.p.setTypeface(typeface);
        fastScrollPopup.f4854l.invalidate(fastScrollPopup.f4850h);
    }

    public void setPopupBgColor(int i2) {
        FastScrollPopup fastScrollPopup = this.U0.f4868k;
        fastScrollPopup.f4845c = i2;
        fastScrollPopup.f4846d.setColor(i2);
        fastScrollPopup.f4854l.invalidate(fastScrollPopup.f4850h);
    }

    public void setPopupPosition(int i2) {
        this.U0.f4868k.f4853k = i2;
    }

    public void setPopupTextColor(int i2) {
        FastScrollPopup fastScrollPopup = this.U0.f4868k;
        fastScrollPopup.p.setColor(i2);
        fastScrollPopup.f4854l.invalidate(fastScrollPopup.f4850h);
    }

    public void setPopupTextSize(int i2) {
        FastScrollPopup fastScrollPopup = this.U0.f4868k;
        fastScrollPopup.p.setTextSize(i2);
        fastScrollPopup.f4854l.invalidate(fastScrollPopup.f4850h);
    }

    @Deprecated
    public void setStateChangeListener(e.g.a.b.a aVar) {
        setOnFastScrollStateChangeListener(aVar);
    }

    public void setThumbColor(int i2) {
        FastScroller fastScroller = this.U0;
        fastScroller.f4871n = i2;
        fastScroller.f4870m.setColor(i2);
        fastScroller.f4869l.invalidate(fastScroller.f4863f);
    }

    @Deprecated
    public void setThumbEnabled(boolean z) {
        setFastScrollEnabled(z);
    }

    public void setThumbInactiveColor(int i2) {
        FastScroller fastScroller = this.U0;
        fastScroller.p = i2;
        fastScroller.q = true;
        fastScroller.f4870m.setColor(i2);
    }

    @Deprecated
    public void setThumbInactiveColor(boolean z) {
        FastScroller fastScroller = this.U0;
        fastScroller.q = z;
        fastScroller.f4870m.setColor(z ? fastScroller.p : fastScroller.f4871n);
    }

    public void setTrackColor(int i2) {
        FastScroller fastScroller = this.U0;
        fastScroller.w.setColor(i2);
        fastScroller.f4869l.invalidate(fastScroller.f4863f);
    }

    public final int v0() {
        if (getAdapter() instanceof b) {
            return w0(getAdapter().b());
        }
        throw new IllegalStateException("calculateAdapterHeight() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
    }

    public final int w0(int i2) {
        if (getAdapter() instanceof b) {
            if (this.S0.indexOfKey(i2) >= 0) {
                return this.S0.get(i2);
            }
            b bVar = (b) getAdapter();
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                this.S0.put(i4, i3);
                i3 += bVar.a(this, J(i4), getAdapter().d(i4));
            }
            this.S0.put(i2, i3);
            return i3;
        }
        throw new IllegalStateException("calculateScrollDistanceToPosition() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
    }

    public final float x0(float f2) {
        if (getAdapter() instanceof b) {
            b bVar = (b) getAdapter();
            int v0 = (int) (v0() * f2);
            for (int i2 = 0; i2 < getAdapter().b(); i2++) {
                int w0 = w0(i2);
                int a2 = bVar.a(this, J(i2), getAdapter().d(i2)) + w0;
                if (i2 == getAdapter().b() - 1) {
                    if (v0 >= w0 && v0 <= a2) {
                        return i2;
                    }
                } else if (v0 >= w0 && v0 < a2) {
                    return i2;
                }
            }
            Log.w("FastScrollRecyclerView", "Failed to find a view at the provided scroll fraction (" + f2 + ")");
            return f2 * getAdapter().b();
        }
        return getAdapter().b() * f2;
    }

    public int y0(int i2, int i3) {
        return (getPaddingBottom() + ((getPaddingTop() + i3) + i2)) - getHeight();
    }

    public final void z0(d dVar) {
        dVar.f4857b = -1;
        dVar.f4858c = -1;
        dVar.a = -1;
        if (getAdapter().b() == 0 || getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        RecyclerView.a0 N = RecyclerView.N(childAt);
        dVar.f4857b = N != null ? N.f() : -1;
        if (getLayoutManager() instanceof GridLayoutManager) {
            dVar.f4857b /= ((GridLayoutManager) getLayoutManager()).H;
        }
        if (getAdapter() instanceof b) {
            dVar.f4858c = getLayoutManager().J(childAt);
            dVar.a = ((b) getAdapter()).a(this, J(dVar.f4857b), getAdapter().d(dVar.f4857b));
            return;
        }
        dVar.f4858c = getLayoutManager().J(childAt);
        int height = childAt.getHeight();
        Objects.requireNonNull(getLayoutManager());
        int i2 = height + ((RecyclerView.n) childAt.getLayoutParams()).f564b.top;
        Objects.requireNonNull(getLayoutManager());
        dVar.a = i2 + ((RecyclerView.n) childAt.getLayoutParams()).f564b.bottom;
    }
}
