package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import c.i.k.d0;
import c.i.k.j0;
import c.i.k.q;
import c.i.k.r;
import c.i.k.t;
import c.i.k.u;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {
    public static final String a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f314b;

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f315c;

    /* renamed from: d  reason: collision with root package name */
    public static final Comparator<View> f316d;

    /* renamed from: e  reason: collision with root package name */
    public static final c.i.j.c<Rect> f317e;

    /* renamed from: f  reason: collision with root package name */
    public final List<View> f318f;

    /* renamed from: g  reason: collision with root package name */
    public final c.h.b.a<View> f319g;

    /* renamed from: h  reason: collision with root package name */
    public final List<View> f320h;

    /* renamed from: i  reason: collision with root package name */
    public final List<View> f321i;

    /* renamed from: j  reason: collision with root package name */
    public Paint f322j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f323k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f324l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f325m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f326n;
    public int[] o;
    public View p;
    public View q;
    public g r;
    public boolean s;
    public j0 t;
    public boolean u;
    public Drawable v;
    public ViewGroup.OnHierarchyChangeListener w;
    public u x;
    public final t y;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<Parcelable> f327c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f327c = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f327c.append(iArr[i2], readParcelableArray[i2]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            SparseArray<Parcelable> sparseArray = this.f327c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f327c.keyAt(i3);
                parcelableArr[i3] = this.f327c.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    /* loaded from: classes.dex */
    public class a implements u {
        public a() {
        }

        @Override // c.i.k.u
        public j0 a(View view, j0 j0Var) {
            c cVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.t, j0Var)) {
                coordinatorLayout.t = j0Var;
                boolean z = true;
                boolean z2 = j0Var.e() > 0;
                coordinatorLayout.u = z2;
                coordinatorLayout.setWillNotDraw((z2 || coordinatorLayout.getBackground() != null) ? false : false);
                if (!j0Var.h()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        AtomicInteger atomicInteger = d0.a;
                        if (d0.c.b(childAt) && (cVar = ((f) childAt.getLayoutParams()).a) != null) {
                            j0Var = cVar.e(j0Var);
                            if (j0Var.h()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return j0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int b() {
            return -16777216;
        }

        public float c() {
            return 0.0f;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public j0 e(j0 j0Var) {
            return j0Var;
        }

        public void f(f fVar) {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void h(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void i() {
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean m() {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
            return false;
        }

        @Deprecated
        public void o() {
        }

        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            if (i4 == 0) {
                o();
            }
        }

        @Deprecated
        public void q() {
        }

        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
            if (i6 == 0) {
                q();
            }
        }

        @Deprecated
        public void s() {
        }

        public boolean t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean w() {
            return false;
        }

        public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return w();
            }
            return false;
        }

        @Deprecated
        public void y() {
        }

        public void z(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            if (i2 == 0) {
                y();
            }
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f328b;

        /* renamed from: c  reason: collision with root package name */
        public int f329c;

        /* renamed from: d  reason: collision with root package name */
        public int f330d;

        /* renamed from: e  reason: collision with root package name */
        public int f331e;

        /* renamed from: f  reason: collision with root package name */
        public int f332f;

        /* renamed from: g  reason: collision with root package name */
        public int f333g;

        /* renamed from: h  reason: collision with root package name */
        public int f334h;

        /* renamed from: i  reason: collision with root package name */
        public int f335i;

        /* renamed from: j  reason: collision with root package name */
        public int f336j;

        /* renamed from: k  reason: collision with root package name */
        public View f337k;

        /* renamed from: l  reason: collision with root package name */
        public View f338l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f339m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f340n;
        public boolean o;
        public boolean p;
        public final Rect q;

        public f(int i2, int i3) {
            super(i2, i3);
            this.f328b = false;
            this.f329c = 0;
            this.f330d = 0;
            this.f331e = -1;
            this.f332f = -1;
            this.f333g = 0;
            this.f334h = 0;
            this.q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.f328b = false;
            this.f329c = 0;
            this.f330d = 0;
            this.f331e = -1;
            this.f332f = -1;
            this.f333g = 0;
            this.f334h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.h.a.f1922b);
            this.f329c = obtainStyledAttributes.getInteger(0, 0);
            this.f332f = obtainStyledAttributes.getResourceId(1, -1);
            this.f330d = obtainStyledAttributes.getInteger(2, 0);
            this.f331e = obtainStyledAttributes.getInteger(6, -1);
            this.f333g = obtainStyledAttributes.getInt(5, 0);
            this.f334h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f328b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.a;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.a;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + CoreConstants.DOT + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f315c;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f314b);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(e.a.d.a.a.k("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.f(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f328b = false;
            this.f329c = 0;
            this.f330d = 0;
            this.f331e = -1;
            this.f332f = -1;
            this.f333g = 0;
            this.f334h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f328b = false;
            this.f329c = 0;
            this.f330d = 0;
            this.f331e = -1;
            this.f332f = -1;
            this.f333g = 0;
            this.f334h = 0;
            this.q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f328b = false;
            this.f329c = 0;
            this.f330d = 0;
            this.f331e = -1;
            this.f332f = -1;
            this.f333g = 0;
            this.f334h = 0;
            this.q = new Rect();
        }

        public boolean a(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    return false;
                }
                return this.o;
            }
            return this.f340n;
        }

        public void b(int i2, boolean z) {
            if (i2 == 0) {
                this.f340n = z;
            } else if (i2 != 1) {
            } else {
                this.o = z;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            View view3 = view;
            View view4 = view2;
            AtomicInteger atomicInteger = d0.a;
            int i2 = Build.VERSION.SDK_INT;
            float m2 = i2 >= 21 ? d0.h.m(view3) : 0.0f;
            float m3 = i2 >= 21 ? d0.h.m(view4) : 0.0f;
            if (m2 > m3) {
                return -1;
            }
            return m2 < m3 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f316d = new h();
        } else {
            f316d = null;
        }
        f314b = new Class[]{Context.class, AttributeSet.class};
        f315c = new ThreadLocal<>();
        f317e = new c.i.j.e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f318f = new ArrayList();
        this.f319g = new c.h.b.a<>();
        this.f320h = new ArrayList();
        this.f321i = new ArrayList();
        this.f323k = new int[2];
        this.f324l = new int[2];
        this.y = new t();
        int[] iArr = c.h.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.o = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.o;
                iArr2[i2] = (int) (iArr2[i2] * f2);
            }
        }
        this.v = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        AtomicInteger atomicInteger = d0.a;
        if (d0.c.c(this) == 0) {
            d0.c.s(this, 1);
        }
    }

    public static Rect a() {
        Rect b2 = f317e.b();
        return b2 == null ? new Rect() : b2;
    }

    public final void b(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            g(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public List<View> d(View view) {
        c.h.b.a<View> aVar = this.f319g;
        int i2 = aVar.f1923b.f1665g;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList<View> l2 = aVar.f1923b.l(i3);
            if (l2 != null && l2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f1923b.h(i3));
            }
        }
        this.f321i.clear();
        if (arrayList != null) {
            this.f321i.addAll(arrayList);
        }
        return this.f321i;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float c2 = cVar.c();
            if (c2 > 0.0f) {
                if (this.f322j == null) {
                    this.f322j = new Paint();
                }
                this.f322j.setColor(fVar.a.b());
                Paint paint = this.f322j;
                int round = Math.round(c2 * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f322j);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // c.i.k.r
    public void e(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.f323k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.r(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f323k;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    i8 = i5 > 0 ? Math.max(i8, this.f323k[1]) : Math.min(i8, this.f323k[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            q(1);
        }
    }

    public List<View> f(View view) {
        ArrayList<View> orDefault = this.f319g.f1923b.getOrDefault(view, null);
        this.f321i.clear();
        if (orDefault != null) {
            this.f321i.addAll(orDefault);
        }
        return this.f321i;
    }

    public void g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = c.h.b.b.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = c.h.b.b.a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        c.h.b.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = c.h.b.b.f1926b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f318f);
    }

    public final j0 getLastWindowInsets() {
        return this.t;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.y.a();
    }

    public Drawable getStatusBarBackground() {
        return this.v;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5 = fVar.f329c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = fVar.f330d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & SyslogConstants.LOG_ALERT) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & SyslogConstants.LOG_ALERT;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & SyslogConstants.LOG_ALERT;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i3 / 2;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 / 2;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    public final int i(int i2) {
        int[] iArr = this.o;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 < 0 || i2 >= iArr.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        } else {
            return iArr[i2];
        }
    }

    public f j(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f328b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.i();
                    }
                    fVar.a = behavior;
                    fVar.f328b = true;
                    if (behavior != null) {
                        behavior.f(fVar);
                    }
                }
                fVar.f328b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        c newInstance = dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        c cVar2 = fVar.a;
                        if (cVar2 != newInstance) {
                            if (cVar2 != null) {
                                cVar2.i();
                            }
                            fVar.a = newInstance;
                            fVar.f328b = true;
                            if (newInstance != null) {
                                newInstance.f(fVar);
                            }
                        }
                    } catch (Exception e2) {
                        StringBuilder y = e.a.d.a.a.y("Default behavior class ");
                        y.append(dVar.value().getName());
                        y.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", y.toString(), e2);
                    }
                }
                fVar.f328b = true;
            }
        }
        return fVar;
    }

    @Override // c.i.k.q
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        e(view, i2, i3, i4, i5, 0, this.f324l);
    }

    @Override // c.i.k.q
    public boolean l(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.a;
                if (cVar != null) {
                    boolean x = cVar.x(this, childAt, view, view2, i2, i3);
                    z |= x;
                    fVar.b(i3, x);
                } else {
                    fVar.b(i3, false);
                }
            }
        }
        return z;
    }

    @Override // c.i.k.q
    public void m(View view, View view2, int i2, int i3) {
        c cVar;
        t tVar = this.y;
        if (i3 == 1) {
            tVar.f2214b = i2;
        } else {
            tVar.a = i2;
        }
        this.q = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            f fVar = (f) getChildAt(i4).getLayoutParams();
            if (fVar.a(i3) && (cVar = fVar.a) != null && i3 == 0) {
                cVar.s();
            }
        }
    }

    @Override // c.i.k.q
    public void n(View view, int i2) {
        t tVar = this.y;
        if (i2 == 1) {
            tVar.f2214b = 0;
        } else {
            tVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.a;
                if (cVar != null) {
                    cVar.z(this, childAt, view, i2);
                }
                fVar.b(i2, false);
                fVar.p = false;
            }
        }
        this.q = null;
    }

    @Override // c.i.k.q
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.f323k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.p(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f323k;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.f323k;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.s) {
            if (this.r == null) {
                this.r = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        if (this.t == null) {
            AtomicInteger atomicInteger = d0.a;
            if (d0.c.b(this)) {
                d0.y(this);
            }
        }
        this.f326n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.s && this.r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        View view = this.q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f326n = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.u || this.v == null) {
            return;
        }
        j0 j0Var = this.t;
        int e2 = j0Var != null ? j0Var.e() : 0;
        if (e2 > 0) {
            this.v.setBounds(0, 0, getWidth(), e2);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c cVar;
        AtomicInteger atomicInteger = d0.a;
        int d2 = d0.d.d(this);
        int size = this.f318f.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f318f.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).a) == null || !cVar.k(this, view, d2))) {
                r(view, d2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0180, code lost:
        if (r0.l(r30, r20, r8, r21, r23, 0) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z2 |= cVar.m();
                }
            }
        }
        if (z2) {
            q(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z |= cVar.n(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        o(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0, this.f324l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        m(view, view2, i2, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f369b);
        SparseArray<Parcelable> sparseArray = savedState.f327c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = j(childAt).a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.u(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable v;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (id != -1 && cVar != null && (v = cVar.v(this, childAt)) != null) {
                sparseArray.append(id, v);
            }
        }
        savedState.f327c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return l(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.p
            boolean r6 = r6.A(r0, r7, r1)
            goto L2a
        L29:
            r6 = 0
        L2a:
            android.view.View r7 = r0.p
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.v(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(View view, int i2, int i3) {
        Rect a2 = a();
        g(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a2.setEmpty();
            f317e.a(a2);
        }
    }

    public final void q(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        f fVar;
        c cVar;
        AtomicInteger atomicInteger = d0.a;
        int d2 = d0.d.d(this);
        int size = this.f318f.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i14 = 0;
        while (i14 < size) {
            View view = this.f318f.get(i14);
            f fVar2 = (f) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = a4;
                i3 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (fVar2.f338l == this.f318f.get(i15)) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.f337k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            g(fVar3.f337k, a5);
                            c(view, false, a6);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i13 = i14;
                            i11 = i15;
                            rect2 = a4;
                            fVar = fVar2;
                            h(d2, a5, a7, fVar3, measuredWidth, measuredHeight);
                            boolean z4 = (a7.left == a6.left && a7.top == a6.top) ? false : true;
                            b(fVar3, a7, measuredWidth, measuredHeight);
                            int i16 = a7.left - a6.left;
                            int i17 = a7.top - a6.top;
                            if (i16 != 0) {
                                d0.r(view, i16);
                            }
                            if (i17 != 0) {
                                d0.s(view, i17);
                            }
                            if (z4 && (cVar = fVar3.a) != null) {
                                cVar.g(this, view, fVar3.f337k);
                            }
                            a5.setEmpty();
                            c.i.j.c<Rect> cVar2 = f317e;
                            cVar2.a(a5);
                            a6.setEmpty();
                            cVar2.a(a6);
                            a7.setEmpty();
                            cVar2.a(a7);
                            i15 = i11 + 1;
                            fVar2 = fVar;
                            size = i12;
                            i14 = i13;
                            a4 = rect2;
                        }
                    }
                    i11 = i15;
                    i12 = size;
                    rect2 = a4;
                    i13 = i14;
                    fVar = fVar2;
                    i15 = i11 + 1;
                    fVar2 = fVar;
                    size = i12;
                    i14 = i13;
                    a4 = rect2;
                }
                int i18 = size;
                Rect rect3 = a4;
                i3 = i14;
                f fVar4 = fVar2;
                c(view, true, a3);
                if (fVar4.f333g != 0 && !a3.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar4.f333g, d2);
                    int i19 = absoluteGravity & SyslogConstants.LOG_ALERT;
                    if (i19 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i19 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i20 = absoluteGravity & 7;
                    if (i20 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i20 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (fVar4.f334h != 0 && view.getVisibility() == 0) {
                    AtomicInteger atomicInteger2 = d0.a;
                    if (d0.f.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar5 = (f) view.getLayoutParams();
                        c cVar3 = fVar5.a;
                        Rect a8 = a();
                        Rect a9 = a();
                        a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar3 == null || !cVar3.a(this, view, a8)) {
                            a8.set(a9);
                        } else if (!a9.contains(a8)) {
                            StringBuilder y = e.a.d.a.a.y("Rect should be within the child's bounds. Rect:");
                            y.append(a8.toShortString());
                            y.append(" | Bounds:");
                            y.append(a9.toShortString());
                            throw new IllegalArgumentException(y.toString());
                        }
                        a9.setEmpty();
                        c.i.j.c<Rect> cVar4 = f317e;
                        cVar4.a(a9);
                        if (a8.isEmpty()) {
                            a8.setEmpty();
                            cVar4.a(a8);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar5.f334h, d2);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (a8.top - ((ViewGroup.MarginLayoutParams) fVar5).topMargin) - fVar5.f336j) >= (i10 = a2.top)) {
                                z2 = false;
                            } else {
                                x(view, i10 - i9);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a8.bottom) - ((ViewGroup.MarginLayoutParams) fVar5).bottomMargin) + fVar5.f336j) < (i8 = a2.bottom)) {
                                x(view, height - i8);
                                z2 = true;
                            }
                            if (!z2) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (a8.left - ((ViewGroup.MarginLayoutParams) fVar5).leftMargin) - fVar5.f335i) >= (i7 = a2.left)) {
                                z3 = false;
                            } else {
                                w(view, i7 - i6);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a8.right) - ((ViewGroup.MarginLayoutParams) fVar5).rightMargin) + fVar5.f335i) < (i5 = a2.right)) {
                                w(view, width - i5);
                                z3 = true;
                            }
                            if (!z3) {
                                w(view, 0);
                            }
                            a8.setEmpty();
                            cVar4.a(a8);
                        }
                    }
                }
                if (i2 != 2) {
                    rect = rect3;
                    rect.set(((f) view.getLayoutParams()).q);
                    if (rect.equals(a3)) {
                        i4 = i18;
                    } else {
                        ((f) view.getLayoutParams()).q.set(a3);
                    }
                } else {
                    rect = rect3;
                }
                i4 = i18;
                for (int i21 = i3 + 1; i21 < i4; i21++) {
                    View view2 = this.f318f.get(i21);
                    f fVar6 = (f) view2.getLayoutParams();
                    c cVar5 = fVar6.a;
                    if (cVar5 != null && cVar5.d(this, view2, view)) {
                        if (i2 == 0 && fVar6.p) {
                            fVar6.p = false;
                        } else {
                            if (i2 != 2) {
                                z = cVar5.g(this, view2, view);
                            } else {
                                cVar5.h(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar6.p = z;
                            }
                        }
                    }
                }
            }
            i14 = i3 + 1;
            size = i4;
            a4 = rect;
        }
        Rect rect4 = a4;
        a2.setEmpty();
        c.i.j.c<Rect> cVar6 = f317e;
        cVar6.a(a2);
        a3.setEmpty();
        cVar6.a(a3);
        rect4.setEmpty();
        cVar6.a(rect4);
    }

    public void r(View view, int i2) {
        Rect a2;
        Rect a3;
        c.i.j.c<Rect> cVar;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f337k;
        int i3 = 0;
        if (view2 == null && fVar.f332f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            a2 = a();
            a3 = a();
            try {
                g(view2, a2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                h(i2, a2, a3, fVar2, measuredWidth, measuredHeight);
                b(fVar2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
                return;
            } finally {
                a2.setEmpty();
                cVar = f317e;
                cVar.a(a2);
                a3.setEmpty();
                cVar.a(a3);
            }
        }
        int i4 = fVar.f331e;
        if (i4 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            a2 = a();
            a2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.t != null) {
                AtomicInteger atomicInteger = d0.a;
                if (d0.c.b(this) && !d0.c.b(view)) {
                    a2.left = this.t.c() + a2.left;
                    a2.top = this.t.e() + a2.top;
                    a2.right -= this.t.d();
                    a2.bottom -= this.t.b();
                }
            }
            a3 = a();
            int i5 = fVar3.f329c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & SyslogConstants.LOG_ALERT) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i2);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i6 = fVar4.f329c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & SyslogConstants.LOG_ALERT;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int i9 = i(i4) - measuredWidth2;
        if (i7 == 1) {
            i9 += measuredWidth2 / 2;
        } else if (i7 == 5) {
            i9 += measuredWidth2;
        }
        if (i8 == 16) {
            i3 = 0 + (measuredHeight2 / 2);
        } else if (i8 == 80) {
            i3 = measuredHeight2 + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(i9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar == null || !cVar.t(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f325m) {
            return;
        }
        v(false);
        this.f325m = true;
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.v = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable3 = this.v;
                AtomicInteger atomicInteger = d0.a;
                c.i.a.d0(drawable3, d0.d.d(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            AtomicInteger atomicInteger2 = d0.a;
            d0.c.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? c.i.d.a.c(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.v;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.v.setVisible(z, false);
    }

    public final boolean t(MotionEvent motionEvent, int i2) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f320h;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f316d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.a;
            boolean z4 = true;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && cVar != null) {
                    if (i2 == 0) {
                        z2 = cVar.j(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z2 = cVar.A(this, view, motionEvent);
                    }
                    if (z2) {
                        this.p = view;
                    }
                }
                c cVar2 = fVar.a;
                if (cVar2 == null) {
                    fVar.f339m = false;
                }
                boolean z5 = fVar.f339m;
                if (z5) {
                    z = true;
                } else {
                    z = (cVar2 != null && cVar2.c() > 0.0f) | z5;
                    fVar.f339m = z;
                }
                z4 = (!z || z5) ? false : false;
                if (z && !z4) {
                    break;
                }
                z3 = z4;
            } else if (cVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVar.j(this, view, motionEvent2);
                } else if (i2 == 1) {
                    cVar.A(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r5 != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.j(this, childAt, obtain);
                } else {
                    cVar.A(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).f339m = false;
        }
        this.p = null;
        this.f325m = false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    public final void w(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f335i;
        if (i3 != i2) {
            d0.r(view, i2 - i3);
            fVar.f335i = i2;
        }
    }

    public final void x(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f336j;
        if (i3 != i2) {
            d0.s(view, i2 - i3);
            fVar.f336j = i2;
        }
    }

    public final void y() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        AtomicInteger atomicInteger = d0.a;
        if (!d0.c.b(this)) {
            d0.C(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new a();
        }
        d0.C(this, this.x);
        setSystemUiVisibility(1280);
    }
}
