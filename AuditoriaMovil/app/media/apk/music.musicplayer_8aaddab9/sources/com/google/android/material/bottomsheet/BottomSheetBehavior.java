package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import c.i.k.d0;
import c.i.k.k0.b;
import c.i.k.o;
import c.k.a.e;
import ch.qos.logback.classic.Level;
import e.d.b.d.r.m;
import e.d.b.d.r.n;
import e.d.b.d.r.p;
import e.d.b.d.w.g;
import e.d.b.d.w.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public float A;
    public int B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public e H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public WeakReference<V> O;
    public WeakReference<View> P;
    public final ArrayList<c> Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public boolean U;
    public Map<View, Integer> V;
    public int W;
    public final e.c X;
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4554b;

    /* renamed from: c  reason: collision with root package name */
    public float f4555c;

    /* renamed from: d  reason: collision with root package name */
    public int f4556d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4557e;

    /* renamed from: f  reason: collision with root package name */
    public int f4558f;

    /* renamed from: g  reason: collision with root package name */
    public int f4559g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4560h;

    /* renamed from: i  reason: collision with root package name */
    public g f4561i;

    /* renamed from: j  reason: collision with root package name */
    public int f4562j;

    /* renamed from: k  reason: collision with root package name */
    public int f4563k;

    /* renamed from: l  reason: collision with root package name */
    public int f4564l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4565m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4566n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public j t;
    public boolean u;
    public BottomSheetBehavior<V>.d v;
    public ValueAnimator w;
    public int x;
    public int y;
    public int z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f4567c;

        /* renamed from: d  reason: collision with root package name */
        public int f4568d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4569e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4570f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4571g;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4567c = parcel.readInt();
            this.f4568d = parcel.readInt();
            this.f4569e = parcel.readInt() == 1;
            this.f4570f = parcel.readInt() == 1;
            this.f4571g = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f4567c = bottomSheetBehavior.G;
            this.f4568d = bottomSheetBehavior.f4556d;
            this.f4569e = bottomSheetBehavior.f4554b;
            this.f4570f = bottomSheetBehavior.D;
            this.f4571g = bottomSheetBehavior.E;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            parcel.writeInt(this.f4567c);
            parcel.writeInt(this.f4568d);
            parcel.writeInt(this.f4569e ? 1 : 0);
            parcel.writeInt(this.f4570f ? 1 : 0);
            parcel.writeInt(this.f4571g ? 1 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f4572b;

        public a(View view, int i2) {
            this.a = view;
            this.f4572b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.M(this.a, this.f4572b);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends e.c {
        public long a;

        public b() {
        }

        @Override // c.k.a.e.c
        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // c.k.a.e.c
        public int b(View view, int i2, int i3) {
            int H = BottomSheetBehavior.this.H();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return c.i.a.k(i2, H, bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
        }

        @Override // c.k.a.e.c
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B;
        }

        @Override // c.k.a.e.c
        public void f(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.F) {
                    bottomSheetBehavior.L(1);
                }
            }
        }

        @Override // c.k.a.e.c
        public void g(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.E(i3);
        }

        @Override // c.k.a.e.c
        public void h(View view, float f2, float f3) {
            int i2;
            int i3 = 4;
            if (f3 < 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f4554b) {
                    i2 = bottomSheetBehavior.y;
                } else {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    Objects.requireNonNull(BottomSheetBehavior.this);
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    int i4 = bottomSheetBehavior2.z;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                    } else {
                        i2 = bottomSheetBehavior2.H();
                    }
                }
                i3 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (bottomSheetBehavior3.D && bottomSheetBehavior3.O(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= 500.0f) {
                        int top2 = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        if (!(top2 > (bottomSheetBehavior4.H() + bottomSheetBehavior4.N) / 2)) {
                            BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                            if (bottomSheetBehavior5.f4554b) {
                                i2 = bottomSheetBehavior5.y;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.H()) < Math.abs(view.getTop() - BottomSheetBehavior.this.z)) {
                                i2 = BottomSheetBehavior.this.H();
                            } else {
                                i2 = BottomSheetBehavior.this.z;
                                i3 = 6;
                            }
                            i3 = 3;
                        }
                    }
                    i2 = BottomSheetBehavior.this.N;
                    i3 = 5;
                } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                    int top3 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior6.f4554b) {
                        int i5 = bottomSheetBehavior6.z;
                        if (top3 < i5) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior6.B)) {
                                i2 = BottomSheetBehavior.this.H();
                                i3 = 3;
                            } else {
                                Objects.requireNonNull(BottomSheetBehavior.this);
                                i2 = BottomSheetBehavior.this.z;
                            }
                        } else if (Math.abs(top3 - i5) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                            Objects.requireNonNull(BottomSheetBehavior.this);
                            i2 = BottomSheetBehavior.this.z;
                        } else {
                            i2 = BottomSheetBehavior.this.B;
                        }
                        i3 = 6;
                    } else if (Math.abs(top3 - bottomSheetBehavior6.y) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                        i2 = BottomSheetBehavior.this.y;
                        i3 = 3;
                    } else {
                        i2 = BottomSheetBehavior.this.B;
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior7 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior7.f4554b) {
                        i2 = bottomSheetBehavior7.B;
                    } else {
                        int top4 = view.getTop();
                        if (Math.abs(top4 - BottomSheetBehavior.this.z) < Math.abs(top4 - BottomSheetBehavior.this.B)) {
                            Objects.requireNonNull(BottomSheetBehavior.this);
                            i2 = BottomSheetBehavior.this.z;
                            i3 = 6;
                        } else {
                            i2 = BottomSheetBehavior.this.B;
                        }
                    }
                }
            }
            BottomSheetBehavior bottomSheetBehavior8 = BottomSheetBehavior.this;
            Objects.requireNonNull(bottomSheetBehavior8);
            bottomSheetBehavior8.P(view, i3, i2, true);
        }

        @Override // c.k.a.e.c
        public boolean i(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.G;
            if (i3 == 1 || bottomSheetBehavior.U) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.S == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.P;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.O;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i2);
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4575b;

        /* renamed from: c  reason: collision with root package name */
        public int f4576c;

        public d(View view, int i2) {
            this.a = view;
            this.f4576c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = BottomSheetBehavior.this.H;
            if (eVar == null || !eVar.i(true)) {
                BottomSheetBehavior.this.L(this.f4576c);
            } else {
                View view = this.a;
                AtomicInteger atomicInteger = d0.a;
                d0.c.m(view, this);
            }
            this.f4575b = false;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.f4554b = true;
        this.f4562j = -1;
        this.f4563k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.a = 0;
        this.f4554b = true;
        this.f4562j = -1;
        this.f4563k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new b();
        this.f4559g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.d.b.d.b.f6313b);
        this.f4560h = obtainStyledAttributes.hasValue(17);
        int i3 = 3;
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        if (hasValue) {
            D(context, attributeSet, hasValue, e.d.b.d.a.C(context, obtainStyledAttributes, 3));
        } else {
            D(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = ofFloat;
        ofFloat.setDuration(500L);
        this.w.addUpdateListener(new e.d.b.d.g.a(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.C = obtainStyledAttributes.getDimension(2, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f4562j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f4563k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            J(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            J(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.D != z) {
            this.D = z;
            if (!z && this.G == 5) {
                K(4);
            }
            Q();
        }
        this.f4565m = obtainStyledAttributes.getBoolean(12, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f4554b != z2) {
            this.f4554b = z2;
            if (this.O != null) {
                B();
            }
            L((this.f4554b && this.G == 6) ? i3 : this.G);
            Q();
        }
        this.E = obtainStyledAttributes.getBoolean(11, false);
        this.F = obtainStyledAttributes.getBoolean(4, true);
        this.a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.A = f2;
        if (this.O != null) {
            this.z = (int) ((1.0f - f2) * this.N);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.x = dimensionPixelOffset;
        } else {
            int i4 = peekValue2.data;
            if (i4 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.x = i4;
        }
        this.f4566n = obtainStyledAttributes.getBoolean(13, false);
        this.o = obtainStyledAttributes.getBoolean(14, false);
        this.p = obtainStyledAttributes.getBoolean(15, false);
        this.q = obtainStyledAttributes.getBoolean(16, true);
        obtainStyledAttributes.recycle();
        this.f4555c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = this.G;
            if (i2 == 1 && actionMasked == 0) {
                return true;
            }
            e eVar = this.H;
            if (eVar != null && (this.F || i2 == 1)) {
                eVar.n(motionEvent);
            }
            if (actionMasked == 0) {
                this.S = -1;
                VelocityTracker velocityTracker = this.R;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.R = null;
                }
            }
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            if (this.H != null && (this.F || this.G == 1)) {
                z = true;
            }
            if (z && actionMasked == 2 && !this.I) {
                float abs = Math.abs(this.T - motionEvent.getY());
                e eVar2 = this.H;
                if (abs > eVar2.f2271c) {
                    eVar2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            return !this.I;
        }
        return false;
    }

    public final void B() {
        int C = C();
        if (this.f4554b) {
            this.B = Math.max(this.N - C, this.y);
        } else {
            this.B = this.N - C;
        }
    }

    public final int C() {
        int i2;
        return this.f4557e ? Math.min(Math.max(this.f4558f, this.N - ((this.M * 9) / 16)), this.L) + this.r : (this.f4565m || this.f4566n || (i2 = this.f4564l) <= 0) ? this.f4556d + this.r : Math.max(this.f4556d, i2 + this.f4559g);
    }

    public final void D(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f4560h) {
            this.t = j.b(context, attributeSet, R.attr.bottomSheetStyle, 2131886912).a();
            g gVar = new g(this.t);
            this.f4561i = gVar;
            gVar.f6591c.f6603b = new e.d.b.d.o.a(context);
            gVar.x();
            if (z && colorStateList != null) {
                this.f4561i.q(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f4561i.setTint(typedValue.data);
        }
    }

    public void E(int i2) {
        float f2;
        float f3;
        V v = this.O.get();
        if (v == null || this.Q.isEmpty()) {
            return;
        }
        int i3 = this.B;
        if (i2 > i3 || i3 == H()) {
            int i4 = this.B;
            f2 = i4 - i2;
            f3 = this.N - i4;
        } else {
            int i5 = this.B;
            f2 = i5 - i2;
            f3 = i5 - H();
        }
        float f4 = f2 / f3;
        for (int i6 = 0; i6 < this.Q.size(); i6++) {
            this.Q.get(i6).a(v, f4);
        }
    }

    public View F(View view) {
        AtomicInteger atomicInteger = d0.a;
        if (Build.VERSION.SDK_INT >= 21 ? d0.h.p(view) : view instanceof o ? ((o) view).isNestedScrollingEnabled() : false) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View F = F(viewGroup.getChildAt(i2));
                if (F != null) {
                    return F;
                }
            }
            return null;
        }
        return null;
    }

    public final int G(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i4 = Math.min(size, i4);
            }
            return View.MeasureSpec.makeMeasureSpec(i4, Level.ALL_INT);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
    }

    public int H() {
        if (this.f4554b) {
            return this.y;
        }
        return Math.max(this.x, this.q ? 0 : this.s);
    }

    public final void I(V v, b.a aVar, int i2) {
        d0.x(v, aVar, null, new e.d.b.d.g.c(this, i2));
    }

    public void J(int i2) {
        boolean z = true;
        if (i2 == -1) {
            if (!this.f4557e) {
                this.f4557e = true;
            }
            z = false;
        } else {
            if (this.f4557e || this.f4556d != i2) {
                this.f4557e = false;
                this.f4556d = Math.max(0, i2);
            }
            z = false;
        }
        if (z) {
            T(false);
        }
    }

    public void K(int i2) {
        if (i2 == this.G) {
            return;
        }
        if (this.O != null) {
            N(i2);
        } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.D && i2 == 5)) {
            this.G = i2;
        }
    }

    public void L(int i2) {
        V v;
        if (this.G == i2) {
            return;
        }
        this.G = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z = this.D;
        }
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            S(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            S(false);
        }
        R(i2);
        for (int i3 = 0; i3 < this.Q.size(); i3++) {
            this.Q.get(i3).b(v, i2);
        }
        Q();
    }

    public void M(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.B;
        } else if (i2 == 6) {
            int i5 = this.z;
            if (!this.f4554b || i5 > (i4 = this.y)) {
                i3 = i5;
            } else {
                i3 = i4;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = H();
        } else if (!this.D || i2 != 5) {
            Log.w("BottomSheetBehavior", "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
            return;
        } else {
            i3 = this.N;
        }
        P(view, i2, i3, false);
    }

    public final void N(int i2) {
        V v = this.O.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            AtomicInteger atomicInteger = d0.a;
            if (d0.f.b(v)) {
                v.post(new a(v, i2));
                return;
            }
        }
        M(v, i2);
    }

    public boolean O(View view, float f2) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.B)) / ((float) C()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r7 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r0.t(r5.getLeft(), r7) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            c.k.a.e r0 = r4.H
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L30
            if (r8 == 0) goto L13
            int r8 = r5.getLeft()
            boolean r7 = r0.t(r8, r7)
            if (r7 == 0) goto L30
            goto L2f
        L13:
            int r8 = r5.getLeft()
            r0.t = r5
            r3 = -1
            r0.f2272d = r3
            boolean r7 = r0.l(r8, r7, r2, r2)
            if (r7 != 0) goto L2d
            int r8 = r0.f2270b
            if (r8 != 0) goto L2d
            android.view.View r8 = r0.t
            if (r8 == 0) goto L2d
            r8 = 0
            r0.t = r8
        L2d:
            if (r7 == 0) goto L30
        L2f:
            r2 = 1
        L30:
            if (r2 == 0) goto L59
            r7 = 2
            r4.L(r7)
            r4.R(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$d r7 = r4.v
            if (r7 != 0) goto L44
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
            r7.<init>(r5, r6)
            r4.v = r7
        L44:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$d r7 = r4.v
            boolean r8 = r7.f4575b
            if (r8 != 0) goto L56
            r7.f4576c = r6
            java.util.concurrent.atomic.AtomicInteger r6 = c.i.k.d0.a
            c.i.k.d0.c.m(r5, r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$d r5 = r4.v
            r5.f4575b = r1
            goto L5c
        L56:
            r7.f4576c = r6
            goto L5c
        L59:
            r4.L(r6)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.P(android.view.View, int, int, boolean):void");
    }

    public final void Q() {
        V v;
        int i2;
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        d0.v(v, 524288);
        d0.v(v, 262144);
        d0.v(v, 1048576);
        int i3 = this.W;
        if (i3 != -1) {
            d0.v(v, i3);
        }
        if (!this.f4554b && this.G != 6) {
            String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            e.d.b.d.g.c cVar = new e.d.b.d.g.c(this, 6);
            List<b.a> j2 = d0.j(v);
            int i4 = 0;
            while (true) {
                if (i4 >= j2.size()) {
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        int[] iArr = d0.f2138g;
                        if (i6 >= iArr.length || i5 != -1) {
                            break;
                        }
                        int i7 = iArr[i6];
                        boolean z = true;
                        for (int i8 = 0; i8 < j2.size(); i8++) {
                            z &= j2.get(i8).a() != i7;
                        }
                        if (z) {
                            i5 = i7;
                        }
                        i6++;
                    }
                    i2 = i5;
                } else if (TextUtils.equals(string, j2.get(i4).b())) {
                    i2 = j2.get(i4).a();
                    break;
                } else {
                    i4++;
                }
            }
            if (i2 != -1) {
                d0.a(v, new b.a(null, i2, string, cVar, null));
            }
            this.W = i2;
        }
        if (this.D && this.G != 5) {
            I(v, b.a.f2200f, 5);
        }
        int i9 = this.G;
        if (i9 == 3) {
            I(v, b.a.f2199e, this.f4554b ? 4 : 6);
        } else if (i9 == 4) {
            I(v, b.a.f2198d, this.f4554b ? 3 : 6);
        } else if (i9 == 6) {
            I(v, b.a.f2199e, 4);
            I(v, b.a.f2198d, 3);
        }
    }

    public final void R(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.u != z) {
            this.u = z;
            if (this.f4561i == null || (valueAnimator = this.w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.w.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.w.setFloatValues(1.0f - f2, f2);
            this.w.start();
        }
    }

    public final void S(boolean z) {
        WeakReference<V> weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.V != null) {
                    return;
                }
                this.V = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.O.get() && z) {
                    this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.V = null;
        }
    }

    public final void T(boolean z) {
        V v;
        if (this.O != null) {
            B();
            if (this.G != 4 || (v = this.O.get()) == null) {
                return;
            }
            if (z) {
                N(this.G);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void f(CoordinatorLayout.f fVar) {
        this.O = null;
        this.H = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void i() {
        this.O = null;
        this.H = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e eVar;
        if (!v.isShown() || !this.F) {
            this.I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = -1;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.R = null;
            }
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.T = (int) motionEvent.getY();
            if (this.G != 2) {
                WeakReference<View> weakReference = this.P;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.p(view, x, this.T)) {
                    this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.U = true;
                }
            }
            this.I = this.S == -1 && !coordinatorLayout.p(v, x, this.T);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.U = false;
            this.S = -1;
            if (this.I) {
                this.I = false;
                return false;
            }
        }
        if (this.I || (eVar = this.H) == null || !eVar.u(motionEvent)) {
            WeakReference<View> weakReference2 = this.P;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.I || this.G == 1 || coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.H == null || Math.abs(((float) this.T) - motionEvent.getY()) <= ((float) this.H.f2271c)) ? false : true;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        g gVar;
        AtomicInteger atomicInteger = d0.a;
        if (d0.c.b(coordinatorLayout) && !d0.c.b(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.f4558f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f4565m || this.f4557e) ? false : true;
            if (this.f4566n || this.o || this.p || z) {
                d0.C(v, new m(new e.d.b.d.g.b(this, z), new p(d0.d.f(v), v.getPaddingTop(), d0.d.e(v), v.getPaddingBottom())));
                if (d0.f.b(v)) {
                    d0.y(v);
                } else {
                    v.addOnAttachStateChangeListener(new n());
                }
            }
            this.O = new WeakReference<>(v);
            if (this.f4560h && (gVar = this.f4561i) != null) {
                d0.c.q(v, gVar);
            }
            g gVar2 = this.f4561i;
            if (gVar2 != null) {
                float f2 = this.C;
                if (f2 == -1.0f) {
                    f2 = d0.l(v);
                }
                gVar2.p(f2);
                boolean z2 = this.G == 3;
                this.u = z2;
                this.f4561i.r(z2 ? 0.0f : 1.0f);
            }
            Q();
            if (d0.c.c(v) == 0) {
                d0.c.s(v, 1);
            }
        }
        if (this.H == null) {
            this.H = new e(coordinatorLayout.getContext(), coordinatorLayout, this.X);
        }
        int top = v.getTop();
        coordinatorLayout.r(v, i2);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.L = height;
        int i3 = this.N;
        int i4 = i3 - height;
        int i5 = this.s;
        if (i4 < i5) {
            if (this.q) {
                this.L = i3;
            } else {
                this.L = i3 - i5;
            }
        }
        this.y = Math.max(0, i3 - this.L);
        this.z = (int) ((1.0f - this.A) * this.N);
        B();
        int i6 = this.G;
        if (i6 == 3) {
            d0.s(v, H());
        } else if (i6 == 6) {
            d0.s(v, this.z);
        } else if (this.D && i6 == 5) {
            d0.s(v, this.N);
        } else if (i6 == 4) {
            d0.s(v, this.B);
        } else if (i6 == 1 || i6 == 2) {
            d0.s(v, top - v.getTop());
        }
        this.P = new WeakReference<>(F(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(G(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f4562j, marginLayoutParams.width), G(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.f4563k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.P;
        return (weakReference == null || view != weakReference.get() || this.G == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < H()) {
                iArr[1] = top - H();
                d0.s(v, -iArr[1]);
                L(3);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i3;
                d0.s(v, -i3);
                L(1);
            }
        } else if (i3 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.B;
            if (i5 > i6 && !this.D) {
                iArr[1] = top - i6;
                d0.s(v, -iArr[1]);
                L(4);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i3;
                d0.s(v, -i3);
                L(1);
            }
        }
        E(v.getTop());
        this.J = i3;
        this.K = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f4556d = savedState.f4568d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f4554b = savedState.f4569e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.D = savedState.f4570f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.E = savedState.f4571g;
            }
        }
        int i3 = savedState.f4567c;
        if (i3 == 1 || i3 == 2) {
            this.G = 4;
        } else {
            this.G = i3;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable v(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.J = 0;
        this.K = false;
        return (i2 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void z(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
        int i3;
        float yVelocity;
        int i4 = 3;
        if (v.getTop() == H()) {
            L(3);
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (weakReference != null && view == weakReference.get() && this.K) {
            if (this.J <= 0) {
                if (this.D) {
                    VelocityTracker velocityTracker = this.R;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f4555c);
                        yVelocity = this.R.getYVelocity(this.S);
                    }
                    if (O(v, yVelocity)) {
                        i3 = this.N;
                        i4 = 5;
                    }
                }
                if (this.J == 0) {
                    int top = v.getTop();
                    if (!this.f4554b) {
                        int i5 = this.z;
                        if (top < i5) {
                            if (top < Math.abs(top - this.B)) {
                                i3 = H();
                            } else {
                                i3 = this.z;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.B)) {
                            i3 = this.z;
                        } else {
                            i3 = this.B;
                            i4 = 4;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.y) < Math.abs(top - this.B)) {
                        i3 = this.y;
                    } else {
                        i3 = this.B;
                        i4 = 4;
                    }
                } else {
                    if (this.f4554b) {
                        i3 = this.B;
                    } else {
                        int top2 = v.getTop();
                        if (Math.abs(top2 - this.z) < Math.abs(top2 - this.B)) {
                            i3 = this.z;
                            i4 = 6;
                        } else {
                            i3 = this.B;
                        }
                    }
                    i4 = 4;
                }
            } else if (this.f4554b) {
                i3 = this.y;
            } else {
                int top3 = v.getTop();
                int i6 = this.z;
                if (top3 > i6) {
                    i3 = i6;
                    i4 = 6;
                } else {
                    i3 = H();
                }
            }
            P(v, i4, i3, false);
            this.K = false;
        }
    }
}
