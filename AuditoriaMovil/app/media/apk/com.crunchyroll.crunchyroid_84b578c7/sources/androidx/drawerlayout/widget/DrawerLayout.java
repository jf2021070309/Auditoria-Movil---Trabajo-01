package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.q3.l;
import com.amazon.aps.iva.q3.p;
import com.amazon.aps.iva.x3.c;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] E = {16843828};
    public static final int[] F = {16842931};
    public static final boolean G;
    public static final boolean H;
    public static final boolean I;
    public final ArrayList<View> A;
    public Rect B;
    public Matrix C;
    public final a D;
    public final c b;
    public float c;
    public final int d;
    public int e;
    public float f;
    public final Paint g;
    public final com.amazon.aps.iva.x3.c h;
    public final com.amazon.aps.iva.x3.c i;
    public final h j;
    public final h k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public d t;
    public ArrayList u;
    public float v;
    public float w;
    public Drawable x;
    public Object y;
    public boolean z;

    /* loaded from: classes.dex */
    public class a implements p {
        public a() {
        }

        @Override // com.amazon.aps.iva.q3.p
        public final boolean perform(View view, p.a aVar) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (DrawerLayout.m(view) && drawerLayout.h(view) != 2) {
                drawerLayout.c(view, true);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b extends com.amazon.aps.iva.p3.a {
        public final Rect a = new Rect();

        public b() {
        }

        @Override // com.amazon.aps.iva.p3.a
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.getText();
                DrawerLayout drawerLayout = DrawerLayout.this;
                View g = drawerLayout.g();
                if (g != null) {
                    int i = drawerLayout.i(g);
                    drawerLayout.getClass();
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    Gravity.getAbsoluteGravity(i, g0.e.d(drawerLayout));
                    return true;
                }
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // com.amazon.aps.iva.p3.a
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // com.amazon.aps.iva.p3.a
        public final void onInitializeAccessibilityNodeInfo(View view, l lVar) {
            if (DrawerLayout.G) {
                super.onInitializeAccessibilityNodeInfo(view, lVar);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(lVar.a);
                super.onInitializeAccessibilityNodeInfo(view, new l(obtain));
                lVar.c = -1;
                AccessibilityNodeInfo accessibilityNodeInfo = lVar.a;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap<View, r0> weakHashMap = g0.a;
                ViewParent f = g0.d.f(view);
                if (f instanceof View) {
                    lVar.b = -1;
                    accessibilityNodeInfo.setParent((View) f);
                }
                Rect rect = this.a;
                obtain.getBoundsInScreen(rect);
                accessibilityNodeInfo.setBoundsInScreen(rect);
                accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                lVar.h(obtain.getClassName());
                lVar.k(obtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                accessibilityNodeInfo.setFocused(obtain.isFocused());
                accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(obtain.isSelected());
                lVar.a(obtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.k(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            lVar.h("androidx.drawerlayout.widget.DrawerLayout");
            AccessibilityNodeInfo accessibilityNodeInfo2 = lVar.a;
            accessibilityNodeInfo2.setFocusable(false);
            accessibilityNodeInfo2.setFocused(false);
            accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) l.a.e.a);
            accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) l.a.f.a);
        }

        @Override // com.amazon.aps.iva.p3.a
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.G && !DrawerLayout.k(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.p3.a {
        @Override // com.amazon.aps.iva.p3.a
        public final void onInitializeAccessibilityNodeInfo(View view, l lVar) {
            super.onInitializeAccessibilityNodeInfo(view, lVar);
            if (!DrawerLayout.k(view)) {
                lVar.b = -1;
                lVar.a.setParent(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* loaded from: classes.dex */
    public class h extends c.AbstractC0840c {
        public final int a;
        public com.amazon.aps.iva.x3.c b;
        public final a c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                View e;
                int width;
                int i;
                h hVar = h.this;
                int i2 = hVar.b.o;
                int i3 = hVar.a;
                int i4 = 3;
                if (i3 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z) {
                    e = drawerLayout.e(3);
                    if (e != null) {
                        i = -e.getWidth();
                    } else {
                        i = 0;
                    }
                    width = i + i2;
                } else {
                    e = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i2;
                }
                if (e != null) {
                    if (((z && e.getLeft() < width) || (!z && e.getLeft() > width)) && drawerLayout.h(e) == 0) {
                        hVar.b.s(e, width, e.getTop());
                        ((e) e.getLayoutParams()).c = true;
                        drawerLayout.invalidate();
                        if (i3 == 3) {
                            i4 = 5;
                        }
                        View e2 = drawerLayout.e(i4);
                        if (e2 != null) {
                            drawerLayout.c(e2, true);
                        }
                        if (!drawerLayout.s) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            int childCount = drawerLayout.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                drawerLayout.getChildAt(i5).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                            drawerLayout.s = true;
                        }
                    }
                }
            }
        }

        public h(int i) {
            this.a = i;
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.b(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final int getViewHorizontalDragRange(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.n(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final void onEdgeDragStarted(int i, int i2) {
            View e;
            int i3 = i & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (i3 == 1) {
                e = drawerLayout.e(3);
            } else {
                e = drawerLayout.e(5);
            }
            if (e != null && drawerLayout.h(e) == 0) {
                this.b.b(i2, e);
            }
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final boolean onEdgeLock(int i) {
            return false;
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final void onViewCaptured(View view, int i) {
            ((e) view.getLayoutParams()).c = false;
            int i2 = 3;
            if (this.a == 3) {
                i2 = 5;
            }
            DrawerLayout drawerLayout = DrawerLayout.this;
            View e = drawerLayout.e(i2);
            if (e != null) {
                drawerLayout.c(e, true);
            }
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final void onViewDragStateChanged(int i) {
            DrawerLayout.this.u(i, this.b.t);
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width;
            int i5;
            int width2 = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.b(3, view)) {
                width = i + width2;
            } else {
                width = drawerLayout.getWidth() - i;
            }
            float f = width / width2;
            drawerLayout.r(f, view);
            if (f == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            drawerLayout.invalidate();
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final void onViewReleased(View view, float f, float f2) {
            int i;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f3 = ((e) view.getLayoutParams()).b;
            int width = view.getWidth();
            if (drawerLayout.b(3, view)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 <= 0 && (i2 != 0 || f3 <= 0.5f)) {
                    i = -width;
                } else {
                    i = 0;
                }
            } else {
                int width2 = drawerLayout.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.q(i, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // com.amazon.aps.iva.x3.c.AbstractC0840c
        public final boolean tryCaptureView(View view, int i) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (DrawerLayout.n(view) && drawerLayout.b(this.a, view) && drawerLayout.h(view) == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        G = true;
        H = true;
        if (i < 29) {
            z = false;
        }
        I = z;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.drawerLayoutStyle);
        this.b = new c();
        this.e = -1728053248;
        this.g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.D = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.d = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        h hVar = new h(3);
        this.j = hVar;
        h hVar2 = new h(5);
        this.k = hVar2;
        com.amazon.aps.iva.x3.c h2 = com.amazon.aps.iva.x3.c.h(this, 1.0f, hVar);
        this.h = h2;
        h2.q = 1;
        h2.n = f3;
        hVar.b = h2;
        com.amazon.aps.iva.x3.c h3 = com.amazon.aps.iva.x3.c.h(this, 1.0f, hVar2);
        this.i = h3;
        h3.q = 2;
        h3.n = f3;
        hVar2.b = h3;
        setFocusableInTouchMode(true);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.d.s(this, 1);
        g0.n(this, new b());
        setMotionEventSplittingEnabled(false);
        if (g0.d.b(this)) {
            setOnApplyWindowInsetsListener(new com.amazon.aps.iva.g4.a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(E);
            try {
                this.x = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.f4.a.a, R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.c = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.c = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.A = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String j(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    public static boolean k(View view) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.d.c(view) != 4 && g0.d.c(view) != 2) {
            return true;
        }
        return false;
    }

    public static boolean l(View view) {
        if (((e) view.getLayoutParams()).a == 0) {
            return true;
        }
        return false;
    }

    public static boolean m(View view) {
        if (n(view)) {
            if ((((e) view.getLayoutParams()).d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean n(View view) {
        int i = ((e) view.getLayoutParams()).a;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, g0.e.d(view));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.A;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (n(childAt)) {
                if (m(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (f() == null && !n(view)) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.d.s(view, 1);
        } else {
            WeakHashMap<View, r0> weakHashMap2 = g0.a;
            g0.d.s(view, 4);
        }
        if (!G) {
            g0.n(view, this.b);
        }
    }

    public final boolean b(int i, View view) {
        if ((i(view) & i) == i) {
            return true;
        }
        return false;
    }

    public final void c(View view, boolean z) {
        if (n(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.n) {
                eVar.b = 0.0f;
                eVar.d = 0;
            } else if (z) {
                eVar.d |= 4;
                if (b(3, view)) {
                    this.h.s(view, -view.getWidth(), view.getTop());
                } else {
                    this.i.s(view, getWidth(), view.getTop());
                }
            } else {
                o(0.0f, view);
                u(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((e) getChildAt(i).getLayoutParams()).b);
        }
        this.f = f2;
        boolean g2 = this.h.g();
        boolean g3 = this.i.g();
        if (g2 || g3) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.d.k(this);
        }
    }

    public final void d(boolean z) {
        boolean s;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (n(childAt) && (!z || eVar.c)) {
                int width = childAt.getWidth();
                if (b(3, childAt)) {
                    s = this.h.s(childAt, -width, childAt.getTop());
                } else {
                    s = this.i.s(childAt, getWidth(), childAt.getTop());
                }
                z2 |= s;
                eVar.c = false;
            }
        }
        h hVar = this.j;
        DrawerLayout.this.removeCallbacks(hVar.c);
        h hVar2 = this.k;
        DrawerLayout.this.removeCallbacks(hVar2.c);
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; i >= 0; i--) {
                    View childAt = getChildAt(i);
                    if (this.B == null) {
                        this.B = new Rect();
                    }
                    childAt.getHitRect(this.B);
                    if (this.B.contains((int) x, (int) y) && !l(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation(getScrollX() - childAt.getLeft(), getScrollY() - childAt.getTop());
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.C == null) {
                                    this.C = new Matrix();
                                }
                                matrix.invert(this.C);
                                obtain.transform(this.C);
                            }
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX, scrollY);
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX, -scrollY);
                        }
                        if (dispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        int height = getHeight();
        boolean l = l(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (l) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background != null && background.getOpacity() == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && n(childAt) && childAt.getHeight() >= height) {
                        if (b(3, childAt)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.f;
        if (f2 > 0.0f && l) {
            int i4 = this.e;
            Paint paint = this.g;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f2)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e(int i) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, g0.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((e) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        boolean z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (n(childAt)) {
                if (n(childAt)) {
                    if (((e) childAt.getLayoutParams()).b > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (H) {
            return this.c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public final int h(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        if (n(view)) {
            int i5 = ((e) view.getLayoutParams()).a;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            int d2 = g0.e.d(this);
            if (i5 != 3) {
                if (i5 != 5) {
                    if (i5 != 8388611) {
                        if (i5 == 8388613) {
                            int i6 = this.r;
                            if (i6 == 3) {
                                if (d2 == 0) {
                                    i4 = this.p;
                                } else {
                                    i4 = this.o;
                                }
                                if (i4 != 3) {
                                    return i4;
                                }
                            } else {
                                return i6;
                            }
                        }
                    } else {
                        int i7 = this.q;
                        if (i7 == 3) {
                            if (d2 == 0) {
                                i3 = this.o;
                            } else {
                                i3 = this.p;
                            }
                            if (i3 != 3) {
                                return i3;
                            }
                        } else {
                            return i7;
                        }
                    }
                } else {
                    int i8 = this.p;
                    if (i8 == 3) {
                        if (d2 == 0) {
                            i2 = this.r;
                        } else {
                            i2 = this.q;
                        }
                        if (i2 != 3) {
                            return i2;
                        }
                    } else {
                        return i8;
                    }
                }
            } else {
                int i9 = this.o;
                if (i9 == 3) {
                    if (d2 == 0) {
                        i = this.q;
                    } else {
                        i = this.r;
                    }
                    if (i != 3) {
                        return i;
                    }
                } else {
                    return i9;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int i(View view) {
        int i = ((e) view.getLayoutParams()).a;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        return Gravity.getAbsoluteGravity(i, g0.e.d(this));
    }

    public final void o(float f2, View view) {
        float f3 = ((e) view.getLayoutParams()).b;
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (f3 * width));
        if (!b(3, view)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        r(f2, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.z && this.x != null) {
            Object obj = this.y;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.x.setBounds(0, 0, getWidth(), i);
                this.x.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[LOOP:1: B:11:0x0022->B:24:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0053 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 4) {
            if (g() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View g2 = g();
            if (g2 != null && h(g2) == 0) {
                d(false);
            }
            if (g2 == null) {
                return false;
            }
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        int i5;
        float f2;
        int i6;
        boolean z2;
        int i7;
        boolean z3 = true;
        this.m = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(3, childAt)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (eVar.b * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i8 - i5) / f4;
                        i6 = i8 - ((int) (eVar.b * f4));
                    }
                    if (f2 != eVar.b) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                    int i11 = eVar.a & 112;
                    if (i11 != 16) {
                        if (i11 != 80) {
                            int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                        } else {
                            int i13 = i4 - i2;
                            childAt.layout(i6, (i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        }
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight;
                            int i18 = i14 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i17 > i18) {
                                i15 = i18 - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i15, measuredWidth + i6, measuredHeight + i15);
                    }
                    if (z2) {
                        r(f2, childAt);
                    }
                    if (eVar.b > 0.0f) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    if (childAt.getVisibility() != i7) {
                        childAt.setVisibility(i7);
                    }
                }
            }
            i9++;
            z3 = true;
        }
        if (I && (rootWindowInsets = getRootWindowInsets()) != null) {
            com.amazon.aps.iva.g3.f j = w0.h(null, rootWindowInsets).a.j();
            com.amazon.aps.iva.x3.c cVar = this.h;
            cVar.o = Math.max(cVar.p, j.a);
            com.amazon.aps.iva.x3.c cVar2 = this.i;
            cVar2.o = Math.max(cVar2.p, j.c);
        }
        this.m = false;
        this.n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View e2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        int i = fVar.b;
        if (i != 0 && (e2 = e(i)) != null) {
            p(e2);
        }
        int i2 = fVar.c;
        if (i2 != 3) {
            q(i2, 3);
        }
        int i3 = fVar.d;
        if (i3 != 3) {
            q(i3, 5);
        }
        int i4 = fVar.e;
        if (i4 != 3) {
            q(i4, 8388611);
        }
        int i5 = fVar.f;
        if (i5 != 3) {
            q(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (!H) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.e.d(this);
            g0.e.d(this);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            e eVar = (e) getChildAt(i).getLayoutParams();
            int i2 = eVar.d;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                fVar.b = eVar.a;
                break;
            }
        }
        fVar.c = this.o;
        fVar.d = this.p;
        fVar.e = this.q;
        fVar.f = this.r;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (h(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.amazon.aps.iva.x3.c r0 = r6.h
            r0.k(r7)
            com.amazon.aps.iva.x3.c r1 = r6.i
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L67
        L1a:
            r6.d(r3)
            r6.s = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.i(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = l(r4)
            if (r4 == 0) goto L54
            float r4 = r6.v
            float r1 = r1 - r4
            float r4 = r6.w
            float r7 = r7 - r4
            int r0 = r0.b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.f()
            if (r7 == 0) goto L54
            int r7 = r6.h(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.d(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
            r6.s = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        if (n(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.n) {
                eVar.b = 1.0f;
                eVar.d = 1;
                t(view, true);
                s(view);
            } else {
                eVar.d |= 2;
                if (b(3, view)) {
                    this.h.s(view, 0, view.getTop());
                } else {
                    this.i.s(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void q(int i, int i2) {
        View e2;
        com.amazon.aps.iva.x3.c cVar;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, g0.e.d(this));
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 8388611) {
                    if (i2 == 8388613) {
                        this.r = i;
                    }
                } else {
                    this.q = i;
                }
            } else {
                this.p = i;
            }
        } else {
            this.o = i;
        }
        if (i != 0) {
            if (absoluteGravity == 3) {
                cVar = this.h;
            } else {
                cVar = this.i;
            }
            cVar.a();
        }
        if (i != 1) {
            if (i == 2 && (e2 = e(absoluteGravity)) != null) {
                p(e2);
                return;
            }
            return;
        }
        View e3 = e(absoluteGravity);
        if (e3 != null) {
            c(e3, true);
        }
    }

    public final void r(float f2, View view) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.b) {
            return;
        }
        eVar.b = f2;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((d) this.u.get(size)).onDrawerSlide(view, f2);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.m) {
            super.requestLayout();
        }
    }

    public final void s(View view) {
        l.a aVar = l.a.n;
        g0.k(aVar.a(), view);
        g0.i(0, view);
        if (m(view) && h(view) != 2) {
            g0.l(view, aVar, null, this.D);
        }
    }

    public void setDrawerElevation(float f2) {
        this.c = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (n(childAt)) {
                float f3 = this.c;
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.i.s(childAt, f3);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        ArrayList arrayList;
        d dVar2 = this.t;
        if (dVar2 != null && (arrayList = this.u) != null) {
            arrayList.remove(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.t = dVar;
    }

    public void setDrawerLockMode(int i) {
        q(i, 3);
        q(i, 5);
    }

    public void setScrimColor(int i) {
        this.e = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.x = new ColorDrawable(i);
        invalidate();
    }

    public final void t(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !n(childAt)) || (z && childAt == view)) {
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.d.s(childAt, 1);
            } else {
                WeakHashMap<View, r0> weakHashMap2 = g0.a;
                g0.d.s(childAt, 4);
            }
        }
    }

    public final void u(int i, View view) {
        int i2;
        View rootView;
        int i3 = this.h.a;
        int i4 = this.i.a;
        if (i3 != 1 && i4 != 1) {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        if (view != null && i == 0) {
            float f2 = ((e) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                e eVar = (e) view.getLayoutParams();
                if ((eVar.d & 1) == 1) {
                    eVar.d = 0;
                    ArrayList arrayList = this.u;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((d) this.u.get(size)).onDrawerClosed(view);
                        }
                    }
                    t(view, false);
                    s(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                e eVar2 = (e) view.getLayoutParams();
                if ((eVar2.d & 1) == 0) {
                    eVar2.d = 1;
                    ArrayList arrayList2 = this.u;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((d) this.u.get(size2)).onDrawerOpened(view);
                        }
                    }
                    t(view, true);
                    s(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.l) {
            this.l = i2;
            ArrayList arrayList3 = this.u;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((d) this.u.get(size3)).onDrawerStateChanged(i2);
                }
            }
        }
    }

    public void setStatusBarBackground(int i) {
        this.x = i != 0 ? com.amazon.aps.iva.d3.a.getDrawable(getContext(), i) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public final int a;
        public float b;
        public boolean c;
        public int d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.F);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e() {
            super(-1, -1);
            this.a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.a = 0;
            this.a = eVar.a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class f extends com.amazon.aps.iva.w3.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new f[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = 0;
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.b = 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerClosed(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerOpened(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerStateChanged(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerSlide(View view, float f) {
        }
    }
}
