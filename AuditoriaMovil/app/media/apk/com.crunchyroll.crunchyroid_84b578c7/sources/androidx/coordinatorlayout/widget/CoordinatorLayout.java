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
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.s;
import com.amazon.aps.iva.p3.t;
import com.amazon.aps.iva.p3.u;
import com.amazon.aps.iva.p3.w0;
import com.crunchyroll.crunchyroid.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements r, s {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final com.amazon.aps.iva.o3.d<Rect> sRectPool;
    private u mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final com.amazon.aps.iva.a3.c<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private w0 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final t mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* loaded from: classes.dex */
    public class a implements u {
        public a() {
        }

        @Override // com.amazon.aps.iva.p3.u
        public final w0 onApplyWindowInsets(View view, w0 w0Var) {
            return CoordinatorLayout.this.setWindowInsets(w0Var);
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

        public static Object getTag(View view) {
            return ((f) view.getLayoutParams()).r;
        }

        public static void setTag(View view, Object obj) {
            ((f) view.getLayoutParams()).r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            if (getScrimOpacity(coordinatorLayout, v) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public void onDetachedFromLayoutParams() {
        }

        public void onAttachedToLayoutParams(f fVar) {
        }

        public w0 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, w0 w0Var) {
            return w0Var;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
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
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends com.amazon.aps.iva.w3.a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public SparseArray<Parcelable> b;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.b = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.b.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.b;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.b.keyAt(i3);
                parcelableArr[i3] = this.b.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            float m = g0.i.m(view);
            float m2 = g0.i.m(view2);
            if (m > m2) {
                return -1;
            }
            if (m < m2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        WIDGET_PACKAGE_NAME = str;
        TOP_SORTED_CHILDREN_COMPARATOR = new i();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new com.amazon.aps.iva.o3.f(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static Rect acquireTempRect() {
        Rect b2 = sRectPool.b();
        if (b2 == null) {
            return new Rect();
        }
        return b2;
    }

    private static int clamp(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        if (i2 > i4) {
            return i4;
        }
        return i2;
    }

    private void constrainChildRect(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private w0 dispatchApplyWindowInsetsToBehaviors(w0 w0Var) {
        c cVar;
        if (w0Var.a.n()) {
            return w0Var;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.d.b(childAt) && (cVar = ((f) childAt.getLayoutParams()).a) != null) {
                w0Var = cVar.onApplyWindowInsets(this, childAt, w0Var);
                if (w0Var.a.n()) {
                    break;
                }
            }
        }
        return w0Var;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int width;
        int height;
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveAnchoredChildGravity(fVar.c), i2);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(resolveGravity(fVar.d), i2);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int i7 = absoluteGravity2 & 7;
        int i8 = absoluteGravity2 & 112;
        if (i7 != 1) {
            if (i7 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i8 != 16) {
            if (i8 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i5 != 1) {
            if (i5 != 5) {
                width -= i3;
            }
        } else {
            width -= i3 / 2;
        }
        if (i6 != 16) {
            if (i6 != 80) {
                height -= i4;
            }
        } else {
            height -= i4 / 2;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    private int getKeyline(int i2) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            toString();
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            toString();
            return 0;
        }
    }

    private void getTopSortedChildren(List<View> list) {
        int i2;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        com.amazon.aps.iva.x.h<View, ArrayList<View>> hVar = this.mChildDag.b;
        int i2 = hVar.d;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList<View> n = hVar.n(i3);
            if (n != null && n.contains(view)) {
                return true;
            }
        }
        return false;
    }

    private void layoutChild(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.mLastInsets != null) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.d.b(this) && !g0.d.b(view)) {
                acquireTempRect.left = this.mLastInsets.c() + acquireTempRect.left;
                acquireTempRect.top = this.mLastInsets.e() + acquireTempRect.top;
                acquireTempRect.right -= this.mLastInsets.d();
                acquireTempRect.bottom -= this.mLastInsets.b();
            }
        }
        Rect acquireTempRect2 = acquireTempRect();
        com.amazon.aps.iva.p3.f.b(resolveGravity(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i2);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i2) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i2, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(fVar.c), i3);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int keyline = getKeyline(i2) - measuredWidth;
        if (i4 != 1) {
            if (i4 == 5) {
                keyline += measuredWidth;
            }
        } else {
            keyline += measuredWidth / 2;
        }
        int i6 = 0;
        if (i5 != 16) {
            if (i5 == 80) {
                i6 = measuredHeight + 0;
            }
        } else {
            i6 = 0 + (measuredHeight / 2);
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void offsetChildByInset(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.a;
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVar != null && cVar.getInsetDodgeRect(this, view, acquireTempRect)) {
                if (!acquireTempRect2.contains(acquireTempRect)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + acquireTempRect.toShortString() + " | Bounds:" + acquireTempRect2.toShortString());
                }
            } else {
                acquireTempRect.set(acquireTempRect2);
            }
            releaseTempRect(acquireTempRect2);
            if (acquireTempRect.isEmpty()) {
                releaseTempRect(acquireTempRect);
                return;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(fVar.h, i2);
            boolean z3 = true;
            if ((absoluteGravity & 48) == 48 && (i7 = (acquireTempRect.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.j) < (i8 = rect.top)) {
                setInsetOffsetY(view, i8 - i7);
                z = true;
            } else {
                z = false;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.j) < (i6 = rect.bottom)) {
                setInsetOffsetY(view, height - i6);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((absoluteGravity & 3) == 3 && (i4 = (acquireTempRect.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.i) < (i5 = rect.left)) {
                setInsetOffsetX(view, i5 - i4);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((absoluteGravity & 5) == 5 && (width = ((getWidth() - acquireTempRect.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.i) < (i3 = rect.right)) {
                setInsetOffsetX(view, width - i3);
            } else {
                z3 = z2;
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(acquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException(com.amazon.aps.iva.oa.a.a("Could not inflate Behavior subclass ", str), e2);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i2) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.a;
            boolean z5 = true;
            if ((z3 || z4) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 != 0) {
                        if (i2 == 1) {
                            cVar.onTouchEvent(this, view, motionEvent2);
                        }
                    } else {
                        cVar.onInterceptTouchEvent(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z3 && cVar != null) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            z3 = cVar.onTouchEvent(this, view, motionEvent);
                        }
                    } else {
                        z3 = cVar.onInterceptTouchEvent(this, view, motionEvent);
                    }
                    if (z3) {
                        this.mBehaviorTouchView = view;
                    }
                }
                c cVar2 = fVar.a;
                if (cVar2 == null) {
                    fVar.m = false;
                }
                boolean z6 = fVar.m;
                if (z6) {
                    z2 = true;
                } else {
                    if (cVar2 != null) {
                        z = cVar2.blocksInteractionBelow(this, view);
                    } else {
                        z = false;
                    }
                    z2 = z | z6;
                    fVar.m = z2;
                }
                z5 = (!z2 || z6) ? false : false;
                if (z2 && !z5) {
                    break;
                }
                z4 = z5;
            }
        }
        list.clear();
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (r6 != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void prepareChildren() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.prepareChildren():void");
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.a(rect);
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    cVar.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m = false;
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int resolveGravity(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        if ((i2 & 112) == 0) {
            return i2 | 48;
        }
        return i2;
    }

    private static int resolveKeylineGravity(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void setInsetOffsetX(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            view.offsetLeftAndRight(i2 - i3);
            fVar.i = i2;
        }
    }

    private void setInsetOffsetY(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i2) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            view.offsetTopAndBottom(i2 - i3);
            fVar.j = i2;
        }
    }

    private void setupForInsets() {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.d.b(this)) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new a();
            }
            g0.i.u(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        g0.i.u(this, null);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void dispatchDependentViewsChanged(View view) {
        ArrayList<View> orDefault = this.mChildDag.b.getOrDefault(view, null);
        if (orDefault != null && !orDefault.isEmpty()) {
            for (int i2 = 0; i2 < orDefault.size(); i2++) {
                View view2 = orDefault.get(i2);
                c cVar = ((f) view2.getLayoutParams()).a;
                if (cVar != null) {
                    cVar.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    public boolean doViewsOverlap(View view, View view2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect acquireTempRect = acquireTempRect();
        if (view.getParent() != this) {
            z = true;
        } else {
            z = false;
        }
        getChildRect(view, z, acquireTempRect);
        Rect acquireTempRect2 = acquireTempRect();
        if (view2.getParent() != this) {
            z2 = true;
        } else {
            z2 = false;
        }
        getChildRect(view2, z2, acquireTempRect2);
        try {
            if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left) {
                if (acquireTempRect.bottom >= acquireTempRect2.top) {
                    z3 = true;
                }
            }
            return z3;
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(fVar.a.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (hasDependencies(getChildAt(i2))) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z != this.mNeedsPreDrawListener) {
            if (z) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                getDescendantRect(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public List<View> getDependencies(View view) {
        com.amazon.aps.iva.x.h<View, ArrayList<View>> hVar = this.mChildDag.b;
        int i2 = hVar.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList<View> n = hVar.n(i3);
            if (n != null && n.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(hVar.j(i3));
            }
        }
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view) {
        ArrayList<View> orDefault = this.mChildDag.b.getOrDefault(view, null);
        this.mTempDependenciesList.clear();
        if (orDefault != null) {
            this.mTempDependenciesList.addAll(orDefault);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = com.amazon.aps.iva.a3.d.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = com.amazon.aps.iva.a3.d.a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        com.amazon.aps.iva.a3.d.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = com.amazon.aps.iva.a3.d.b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        constrainChildRect(fVar, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).q);
    }

    public final w0 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t tVar = this.mNestedScrollingParentHelper;
        return tVar.b | tVar.a;
    }

    public f getResolvedLayoutParams(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                fVar.b(((b) view).getBehavior());
                fVar.b = true;
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
                        fVar.b(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        dVar.value().getName();
                    }
                }
                fVar.b = true;
            }
        }
        return fVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(View view, int i2, int i3) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i2, i3);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i2) {
        c cVar;
        f fVar = (f) view.getLayoutParams();
        if (fVar.k != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(fVar.k, acquireTempRect);
            boolean z = false;
            getChildRect(view, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i2, acquireTempRect, acquireTempRect3, fVar, measuredWidth, measuredHeight);
            z = (acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top) ? true : true;
            constrainChildRect(fVar, acquireTempRect3, measuredWidth, measuredHeight);
            int i3 = acquireTempRect3.left - acquireTempRect2.left;
            int i4 = acquireTempRect3.top - acquireTempRect2.top;
            if (i3 != 0) {
                WeakHashMap<View, r0> weakHashMap = g0.a;
                view.offsetLeftAndRight(i3);
            }
            if (i4 != 0) {
                WeakHashMap<View, r0> weakHashMap2 = g0.a;
                view.offsetTopAndBottom(i4);
            }
            if (z && (cVar = fVar.a) != null) {
                cVar.onDependentViewChanged(this, view, fVar.k);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.d.b(this)) {
                g0.h.c(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    public final void onChildViewsChanged(int i2) {
        boolean z;
        boolean z2;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        int d2 = g0.e.d(this);
        int size = this.mDependencySortedChildren.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.mDependencySortedChildren.get(i3);
            f fVar = (f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.l == this.mDependencySortedChildren.get(i4)) {
                        offsetChildToAnchor(view, d2);
                    }
                }
                boolean z3 = true;
                getChildRect(view, true, acquireTempRect2);
                if (fVar.g != 0 && !acquireTempRect2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.g, d2);
                    int i5 = absoluteGravity & 112;
                    if (i5 != 48) {
                        if (i5 == 80) {
                            acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                        }
                    } else {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    }
                    int i6 = absoluteGravity & 7;
                    if (i6 != 3) {
                        if (i6 == 5) {
                            acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                        }
                    } else {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, d2);
                }
                if (i2 != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                int i7 = i3 + 1;
                while (i7 < size) {
                    View view2 = this.mDependencySortedChildren.get(i7);
                    f fVar2 = (f) view2.getLayoutParams();
                    c cVar = fVar2.a;
                    if (cVar != null && cVar.layoutDependsOn(this, view2, view)) {
                        if (i2 == 0 && fVar2.p) {
                            fVar2.p = false;
                            z = true;
                        } else {
                            if (i2 != 2) {
                                z2 = cVar.onDependentViewChanged(this, view2, view);
                            } else {
                                cVar.onDependentViewRemoved(this, view2, view);
                                z2 = true;
                            }
                            z = true;
                            if (i2 == 1) {
                                fVar2.p = z2;
                            }
                        }
                    } else {
                        z = z3;
                    }
                    i7++;
                    z3 = z;
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            w0 w0Var = this.mLastInsets;
            if (w0Var != null) {
                i2 = w0Var.e();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), i2);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return performIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c cVar;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        int d2 = g0.e.d(this);
        int size = this.mDependencySortedChildren.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.mDependencySortedChildren.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).a) == null || !cVar.onLayoutChild(this, view, d2))) {
                onLayoutChild(view, d2);
            }
        }
    }

    public void onLayoutChild(View view, int i2) {
        boolean z;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        if (view2 == null && fVar.f != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (view2 != null) {
                layoutChildWithAnchor(view, view2, i2);
                return;
            }
            int i3 = fVar.e;
            if (i3 >= 0) {
                layoutChildWithKeyline(view, i3, i2);
                return;
            } else {
                layoutChild(view, i2);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z2 |= cVar.onNestedFling(this, childAt, view, f2, f3, z);
                }
            }
        }
        if (z2) {
            onChildViewsChanged(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z |= cVar.onNestedPreFling(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        onNestedPreScroll(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        onNestedScrollAccepted(view, view2, i2, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        SparseArray<Parcelable> sparseArray = hVar.b;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = getResolvedLayoutParams(childAt).a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (id != -1 && cVar != null && (onSaveInstanceState = cVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        hVar.b = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return onStartNestedScroll(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
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
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.mBehaviorTouchView
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
            r0.resetTouchBehaviors(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((f) view.getLayoutParams()).q.set(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar != null && cVar.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.mDisallowInterceptReset) {
            resetTouchBehaviors(false);
            this.mDisallowInterceptReset = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.mStatusBarBackground = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable4 = this.mStatusBarBackground;
                WeakHashMap<View, r0> weakHashMap = g0.a;
                a.c.b(drawable4, g0.e.d(this));
                Drawable drawable5 = this.mStatusBarBackground;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.mStatusBarBackground.setCallback(this);
            }
            WeakHashMap<View, r0> weakHashMap2 = g0.a;
            g0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = com.amazon.aps.iva.d3.a.getDrawable(getContext(), i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isVisible() != z) {
            this.mStatusBarBackground.setVisible(z, false);
        }
    }

    public final w0 setWindowInsets(w0 w0Var) {
        boolean z;
        if (!com.amazon.aps.iva.o3.b.a(this.mLastInsets, w0Var)) {
            this.mLastInsets = w0Var;
            boolean z2 = true;
            if (w0Var != null && w0Var.e() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.mDrawStatusBarBackground = z;
            if (z || getBackground() != null) {
                z2 = false;
            }
            setWillNotDraw(z2);
            w0 dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(w0Var);
            requestLayout();
            return dispatchApplyWindowInsetsToBehaviors;
        }
        return w0Var;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mStatusBarBackground) {
            return false;
        }
        return true;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public f generateDefaultLayoutParams() {
        return new f();
    }

    @Override // com.amazon.aps.iva.p3.r
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
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
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedPreScroll(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // com.amazon.aps.iva.p3.r
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        onNestedScroll(view, i2, i3, i4, i5, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // com.amazon.aps.iva.p3.r
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        c cVar;
        this.mNestedScrollingParentHelper.a(i2, i3);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i3) && (cVar = fVar.a) != null) {
                cVar.onNestedScrollAccepted(this, childAt, view, view2, i2, i3);
            }
        }
    }

    @Override // com.amazon.aps.iva.p3.r
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.a;
                if (cVar != null) {
                    boolean onStartNestedScroll = cVar.onStartNestedScroll(this, childAt, view, view2, i2, i3);
                    z |= onStartNestedScroll;
                    if (i3 == 0) {
                        fVar.n = onStartNestedScroll;
                    } else if (i3 == 1) {
                        fVar.o = onStartNestedScroll;
                    }
                } else if (i3 == 0) {
                    fVar.n = false;
                } else if (i3 == 1) {
                    fVar.o = false;
                }
            }
        }
        return z;
    }

    @Override // com.amazon.aps.iva.p3.r
    public void onStopNestedScroll(View view, int i2) {
        t tVar = this.mNestedScrollingParentHelper;
        if (i2 == 1) {
            tVar.b = 0;
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
                    cVar.onStopNestedScroll(this, childAt, view, i2);
                }
                if (i2 == 0) {
                    fVar.n = false;
                } else if (i2 == 1) {
                    fVar.o = false;
                }
                fVar.p = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new com.amazon.aps.iva.a3.c<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new t();
        int[] iArr = com.amazon.aps.iva.z2.a.a;
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 2132084410);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        }
        TypedArray typedArray = obtainStyledAttributes;
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 != 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, 0);
            } else {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, 2132084410);
            }
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr2 = this.mKeylines;
                iArr2[i3] = (int) (iArr2[i3] * f2);
            }
        }
        this.mStatusBarBackground = typedArray.getDrawable(1);
        typedArray.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.d.c(this) == 0) {
            g0.d.s(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // com.amazon.aps.iva.p3.s
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVar;
        boolean z;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedScroll(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    if (i5 > 0) {
                        z = true;
                        min = Math.max(i8, this.mBehaviorConsumed[1]);
                    } else {
                        z = true;
                        min = Math.min(i8, this.mBehaviorConsumed[1]);
                    }
                    i8 = min;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public int c;
        public int d;
        public final int e;
        public final int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q;
        public Object r;

        public f() {
            super(-2, -2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public final boolean a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.o;
            }
            return this.n;
        }

        public final void b(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.a = cVar;
                this.r = null;
                this.b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.z2.a.b);
            this.c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getInteger(2, 0);
            this.e = obtainStyledAttributes.getInteger(6, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }
}
