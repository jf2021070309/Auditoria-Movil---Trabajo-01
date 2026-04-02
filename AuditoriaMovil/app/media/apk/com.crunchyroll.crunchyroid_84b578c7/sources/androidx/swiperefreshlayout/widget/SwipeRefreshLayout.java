package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.o;
import com.amazon.aps.iva.p3.p;
import com.amazon.aps.iva.p3.q;
import com.amazon.aps.iva.p3.r;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.s;
import com.amazon.aps.iva.p3.t;
import com.amazon.aps.iva.y8.d;
import com.google.common.primitives.Ints;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements s, r, o, p {
    public static final int[] L = {16842766};
    public com.amazon.aps.iva.y8.d A;
    public com.amazon.aps.iva.y8.e B;
    public com.amazon.aps.iva.y8.f C;
    public com.amazon.aps.iva.y8.g D;
    public com.amazon.aps.iva.y8.g E;
    public boolean F;
    public int G;
    public boolean H;
    public final a I;
    public final c J;
    public final d K;
    public View b;
    public f c;
    public boolean d;
    public final int e;
    public float f;
    public float g;
    public final t h;
    public final q i;
    public final int[] j;
    public final int[] k;
    public final int[] l;
    public boolean m;
    public final int n;
    public int o;
    public float p;
    public float q;
    public boolean r;
    public int s;
    public final DecelerateInterpolator t;
    public com.amazon.aps.iva.y8.a u;
    public int v;
    public int w;
    public final int x;
    public final int y;
    public int z;

    /* loaded from: classes.dex */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            int abs = swipeRefreshLayout.y - Math.abs(swipeRefreshLayout.x);
            int i = swipeRefreshLayout.w;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) ((abs - i) * f))) - swipeRefreshLayout.u.getTop());
            com.amazon.aps.iva.y8.d dVar = swipeRefreshLayout.A;
            float f2 = 1.0f - f;
            d.a aVar = dVar.b;
            if (f2 != aVar.p) {
                aVar.p = f2;
            }
            dVar.invalidateSelf();
        }
    }

    /* loaded from: classes.dex */
    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.e(f);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.f = -1.0f;
        this.j = new int[2];
        this.k = new int[2];
        this.l = new int[2];
        this.s = -1;
        this.v = -1;
        this.I = new a();
        this.J = new c();
        this.K = new d();
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.n = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.G = (int) (displayMetrics.density * 40.0f);
        this.u = new com.amazon.aps.iva.y8.a(getContext());
        com.amazon.aps.iva.y8.d dVar = new com.amazon.aps.iva.y8.d(getContext());
        this.A = dVar;
        dVar.c(1);
        this.u.setImageDrawable(this.A);
        this.u.setVisibility(8);
        addView(this.u);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.y = i;
        this.f = i;
        this.h = new t();
        this.i = new q(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.G;
        this.o = i2;
        this.x = i2;
        e(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.u.getBackground().setAlpha(i);
        this.A.setAlpha(i);
    }

    public final boolean a() {
        View view = this.b;
        if (view instanceof ListView) {
            return com.amazon.aps.iva.t3.g.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.b == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.u)) {
                    this.b = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f2) {
        if (f2 > this.f) {
            g(true, true);
            return;
        }
        this.d = false;
        com.amazon.aps.iva.y8.d dVar = this.A;
        d.a aVar = dVar.b;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        dVar.invalidateSelf();
        b bVar = new b();
        this.w = this.o;
        d dVar2 = this.K;
        dVar2.reset();
        dVar2.setDuration(200L);
        dVar2.setInterpolator(this.t);
        com.amazon.aps.iva.y8.a aVar2 = this.u;
        aVar2.b = bVar;
        aVar2.clearAnimation();
        this.u.startAnimation(dVar2);
        com.amazon.aps.iva.y8.d dVar3 = this.A;
        d.a aVar3 = dVar3.b;
        if (aVar3.n) {
            aVar3.n = false;
        }
        dVar3.invalidateSelf();
    }

    public final void d(float f2) {
        com.amazon.aps.iva.y8.d dVar = this.A;
        d.a aVar = dVar.b;
        boolean z = true;
        if (!aVar.n) {
            aVar.n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f2 / this.f));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f;
        int i = this.z;
        if (i <= 0) {
            i = this.y;
        }
        float f3 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.x + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.u.getVisibility() != 0) {
            this.u.setVisibility(0);
        }
        this.u.setScaleX(1.0f);
        this.u.setScaleY(1.0f);
        if (f2 < this.f) {
            if (this.A.b.t > 76) {
                com.amazon.aps.iva.y8.g gVar = this.D;
                if (gVar == null || !gVar.hasStarted() || gVar.hasEnded()) {
                    z = false;
                }
                if (!z) {
                    com.amazon.aps.iva.y8.g gVar2 = new com.amazon.aps.iva.y8.g(this, this.A.b.t, 76);
                    gVar2.setDuration(300L);
                    com.amazon.aps.iva.y8.a aVar2 = this.u;
                    aVar2.b = null;
                    aVar2.clearAnimation();
                    this.u.startAnimation(gVar2);
                    this.D = gVar2;
                }
            }
        } else if (this.A.b.t < 255) {
            com.amazon.aps.iva.y8.g gVar3 = this.E;
            if (gVar3 == null || !gVar3.hasStarted() || gVar3.hasEnded()) {
                z = false;
            }
            if (!z) {
                com.amazon.aps.iva.y8.g gVar4 = new com.amazon.aps.iva.y8.g(this, this.A.b.t, 255);
                gVar4.setDuration(300L);
                com.amazon.aps.iva.y8.a aVar3 = this.u;
                aVar3.b = null;
                aVar3.clearAnimation();
                this.u.startAnimation(gVar4);
                this.E = gVar4;
            }
        }
        com.amazon.aps.iva.y8.d dVar2 = this.A;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar4 = dVar2.b;
        aVar4.e = 0.0f;
        aVar4.f = min2;
        dVar2.invalidateSelf();
        com.amazon.aps.iva.y8.d dVar3 = this.A;
        float min3 = Math.min(1.0f, max);
        d.a aVar5 = dVar3.b;
        if (min3 != aVar5.p) {
            aVar5.p = min3;
        }
        dVar3.invalidateSelf();
        com.amazon.aps.iva.y8.d dVar4 = this.A;
        dVar4.b.g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.o);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.i.a(f2, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.i.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.i.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.i.e(i, i2, i3, i4, iArr);
    }

    public final void e(float f2) {
        int i = this.w;
        setTargetOffsetTopAndBottom((i + ((int) ((this.x - i) * f2))) - this.u.getTop());
    }

    public final void f() {
        this.u.clearAnimation();
        this.A.stop();
        this.u.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.x - this.o);
        this.o = this.u.getTop();
    }

    public final void g(boolean z, boolean z2) {
        if (this.d != z) {
            this.F = z2;
            b();
            this.d = z;
            a aVar = this.I;
            if (z) {
                this.w = this.o;
                c cVar = this.J;
                cVar.reset();
                cVar.setDuration(200L);
                cVar.setInterpolator(this.t);
                if (aVar != null) {
                    this.u.b = aVar;
                }
                this.u.clearAnimation();
                this.u.startAnimation(cVar);
                return;
            }
            com.amazon.aps.iva.y8.f fVar = new com.amazon.aps.iva.y8.f(this);
            this.C = fVar;
            fVar.setDuration(150L);
            com.amazon.aps.iva.y8.a aVar2 = this.u;
            aVar2.b = aVar;
            aVar2.clearAnimation();
            this.u.startAnimation(this.C);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.v;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            return i2 + 1;
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t tVar = this.h;
        return tVar.b | tVar.a;
    }

    public int getProgressCircleDiameter() {
        return this.G;
    }

    public int getProgressViewEndOffset() {
        return this.y;
    }

    public int getProgressViewStartOffset() {
        return this.x;
    }

    public final void h(float f2) {
        float f3 = this.q;
        int i = this.e;
        if (f2 - f3 > i && !this.r) {
            this.p = f3 + i;
            this.r = true;
            this.A.setAlpha(76);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.i.h(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.i.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        b();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || a() || this.d || this.m) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.s) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.s = motionEvent.getPointerId(i);
                            }
                        }
                    }
                } else {
                    int i2 = this.s;
                    if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) < 0) {
                        return false;
                    }
                    h(motionEvent.getY(findPointerIndex));
                }
            }
            this.r = false;
            this.s = -1;
        } else {
            setTargetOffsetTopAndBottom(this.x - this.u.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.s = pointerId;
            this.r = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.q = motionEvent.getY(findPointerIndex2);
        }
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.b == null) {
            b();
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.u.getMeasuredWidth();
        int measuredHeight2 = this.u.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.o;
        this.u.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null) {
            b();
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), Ints.MAX_POWER_OF_TWO));
        this.u.measure(View.MeasureSpec.makeMeasureSpec(this.G, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(this.G, Ints.MAX_POWER_OF_TWO));
        this.v = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.u) {
                this.v = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // com.amazon.aps.iva.p3.s
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        int[] iArr2 = this.k;
        if (i5 == 0) {
            this.i.d(i, i2, i3, i4, iArr2, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.k[1] : i7;
        if (i8 >= 0 || a()) {
            return;
        }
        float abs = this.g + Math.abs(i8);
        this.g = abs;
        d(abs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.h.a(i, 0);
        startNestedScroll(i & 2);
        this.g = 0.0f;
        this.m = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        setRefreshing(gVar.b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new g(super.onSaveInstanceState(), this.d);
    }

    @Override // com.amazon.aps.iva.p3.r
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.h.a = 0;
        this.m = false;
        float f2 = this.g;
        if (f2 > 0.0f) {
            c(f2);
            this.g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (!isEnabled() || a() || this.d || this.m) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.s) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.s = motionEvent.getPointerId(i);
                            }
                        }
                    } else {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (actionIndex2 < 0) {
                            return false;
                        }
                        this.s = motionEvent.getPointerId(actionIndex2);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.s);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    h(y);
                    if (this.r) {
                        float f2 = (y - this.p) * 0.5f;
                        if (f2 <= 0.0f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        d(f2);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.s);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                if (this.r) {
                    this.r = false;
                    c((motionEvent.getY(findPointerIndex2) - this.p) * 0.5f);
                }
                this.s = -1;
                return false;
            }
        } else {
            this.s = motionEvent.getPointerId(0);
            this.r = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.b;
        if (view != null) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (!g0.i.p(view)) {
                if (!this.H && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(z);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f2) {
        this.u.setScaleX(f2);
        this.u.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        com.amazon.aps.iva.y8.d dVar = this.A;
        d.a aVar = dVar.b;
        aVar.i = iArr;
        aVar.a(0);
        aVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = com.amazon.aps.iva.d3.a.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            f();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.H = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.i.i(z);
    }

    public void setOnRefreshListener(f fVar) {
        this.c = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.u.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(com.amazon.aps.iva.d3.a.getColor(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (z && this.d != z) {
            this.d = z;
            setTargetOffsetTopAndBottom((this.y + this.x) - this.o);
            this.F = false;
            this.u.setVisibility(0);
            this.A.setAlpha(255);
            com.amazon.aps.iva.y8.e eVar = new com.amazon.aps.iva.y8.e(this);
            this.B = eVar;
            eVar.setDuration(this.n);
            a aVar = this.I;
            if (aVar != null) {
                this.u.b = aVar;
            }
            this.u.clearAnimation();
            this.u.startAnimation(this.B);
            return;
        }
        g(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.G = (int) (displayMetrics.density * 56.0f);
        } else {
            this.G = (int) (displayMetrics.density * 40.0f);
        }
        this.u.setImageDrawable(null);
        this.A.c(i);
        this.u.setImageDrawable(this.A);
    }

    public void setSlingshotDistance(int i) {
        this.z = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.u.bringToFront();
        com.amazon.aps.iva.y8.a aVar = this.u;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        aVar.offsetTopAndBottom(i);
        this.o = this.u.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.i.j(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.i.k(0);
    }

    @Override // com.amazon.aps.iva.p3.o
    public final void stopNestedScroll(int i) {
        throw null;
    }

    /* loaded from: classes.dex */
    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public final boolean b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.b = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        }

        public g(Parcel parcel) {
            super(parcel);
            this.b = parcel.readByte() != 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f2 = this.g;
            if (f2 > 0.0f) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.g = 0.0f;
                } else {
                    this.g = f2 - f3;
                    iArr[1] = i2;
                }
                d(this.g);
            }
        }
        int[] iArr2 = this.j;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.d || (i & 2) == 0) ? false : true;
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.l);
    }

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.d) {
                swipeRefreshLayout.A.setAlpha(255);
                swipeRefreshLayout.A.start();
                if (swipeRefreshLayout.F && (fVar = swipeRefreshLayout.c) != null) {
                    fVar.onRefresh();
                }
                swipeRefreshLayout.o = swipeRefreshLayout.u.getTop();
                return;
            }
            swipeRefreshLayout.f();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            com.amazon.aps.iva.y8.f fVar = new com.amazon.aps.iva.y8.f(swipeRefreshLayout);
            swipeRefreshLayout.C = fVar;
            fVar.setDuration(150L);
            com.amazon.aps.iva.y8.a aVar = swipeRefreshLayout.u;
            aVar.b = null;
            aVar.clearAnimation();
            swipeRefreshLayout.u.startAnimation(swipeRefreshLayout.C);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }
}
