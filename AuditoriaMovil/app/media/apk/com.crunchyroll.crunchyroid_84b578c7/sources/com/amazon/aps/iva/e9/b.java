package com.amazon.aps.iva.e9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.common.primitives.Ints;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
/* compiled from: ViewPager.java */
/* loaded from: classes.dex */
public final class b extends ViewGroup {
    public static final int[] v = {16842931};
    public Parcelable b;
    public int c;
    public Drawable d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public float l;
    public float m;
    public float n;
    public int o;
    public VelocityTracker p;
    public boolean q;
    public ArrayList r;
    public f s;
    public ArrayList t;
    public int u;

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            cVar.getClass();
            cVar2.getClass();
            return 0;
        }
    }

    /* compiled from: ViewPager.java */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.amazon.aps.iva.e9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0218b {
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class d extends ViewGroup.LayoutParams {
        public boolean a;
        public final int b;

        public d() {
            super(-1, -1);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.v);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public interface e {
        void onAdapterChanged(b bVar, com.amazon.aps.iva.e9.a aVar, com.amazon.aps.iva.e9.a aVar2);
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public interface f {
        void onPageScrollStateChanged(int i);
    }

    /* compiled from: ViewPager.java */
    /* loaded from: classes.dex */
    public static class g extends com.amazon.aps.iva.w3.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int b;
        public Parcelable c;

        /* compiled from: ViewPager.java */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new g[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? g.class.getClassLoader() : classLoader;
            this.b = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return defpackage.e.f(sb, this.b, "}");
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    static {
        new a();
    }

    public static boolean b(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && b(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.g != z) {
            this.g = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L8
            goto L2e
        L8:
            if (r0 == 0) goto L2f
            android.view.ViewParent r2 = r0.getParent()
        Le:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            r2 = 1
            goto L1c
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Le
        L1b:
            r2 = r1
        L1c:
            if (r2 != 0) goto L2f
            android.view.ViewParent r0 = r0.getParent()
        L22:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2e
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L22
        L2e:
            r0 = 0
        L2f:
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r2.findNextFocus(r5, r0, r6)
            if (r2 == 0) goto L70
            if (r2 == r0) goto L70
            r3 = 17
            if (r6 != r3) goto L56
            android.graphics.Rect r3 = r5.c(r2)
            int r3 = r3.left
            android.graphics.Rect r4 = r5.c(r0)
            int r4 = r4.left
            if (r0 == 0) goto L50
            if (r3 < r4) goto L50
            goto L70
        L50:
            boolean r0 = r2.requestFocus()
        L54:
            r1 = r0
            goto L70
        L56:
            r3 = 66
            if (r6 != r3) goto L70
            android.graphics.Rect r3 = r5.c(r2)
            int r3 = r3.left
            android.graphics.Rect r4 = r5.c(r0)
            int r4 = r4.left
            if (r0 == 0) goto L6b
            if (r3 > r4) goto L6b
            goto L70
        L6b:
            boolean r0 = r2.requestFocus()
            goto L54
        L70:
            if (r1 == 0) goto L79
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e9.b.a(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3).getVisibility() == 0) {
                    throw null;
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i).getVisibility() == 0) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new d();
        }
        d dVar = (d) layoutParams;
        boolean z2 = dVar.a;
        if (view.getClass().getAnnotation(InterfaceC0218b.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        dVar.a = z3;
        if (this.f) {
            if (!z3) {
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    public final Rect c(View view) {
        Rect rect = new Rect();
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L57
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L52
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L44
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L52
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.a(r4)
            goto L53
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L52
            boolean r6 = r5.a(r1)
            goto L53
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L3d
            goto L52
        L3d:
            r6 = 66
            boolean r6 = r5.a(r6)
            goto L53
        L44:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L4b
            goto L52
        L4b:
            r6 = 17
            boolean r6 = r5.a(r6)
            goto L53
        L52:
            r6 = r2
        L53:
            if (r6 == 0) goto L56
            goto L57
        L56:
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e9.b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (getOverScrollMode() != 0) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d();
    }

    public com.amazon.aps.iva.e9.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.h;
    }

    public int getPageMargin() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c > 0 && this.d != null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        boolean z;
        int action = motionEvent.getAction() & 255;
        int i = 0;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.i) {
                    return true;
                }
                if (this.j) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.o) {
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            this.l = motionEvent.getX(i);
                            this.o = motionEvent.getPointerId(i);
                            VelocityTracker velocityTracker = this.p;
                            if (velocityTracker != null) {
                                velocityTracker.clear();
                            }
                        }
                    }
                } else {
                    int i2 = this.o;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        float x = motionEvent.getX(findPointerIndex);
                        float f3 = x - this.l;
                        float abs = Math.abs(f3);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.n);
                        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                        if (i3 != 0) {
                            float f4 = this.l;
                            if ((f4 < this.k && i3 > 0) || (f4 > getWidth() - this.k && f3 < 0.0f)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && b((int) f3, (int) x, (int) y, this, false)) {
                                this.l = x;
                                this.j = true;
                                return false;
                            }
                        }
                        float f5 = 0;
                        if (abs > f5 && abs * 0.5f > abs2) {
                            this.i = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f6 = this.m;
                            if (i3 > 0) {
                                f2 = f6 + f5;
                            } else {
                                f2 = f6 - f5;
                            }
                            this.l = f2;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f5) {
                            this.j = true;
                        }
                        if (this.i) {
                            this.l = x;
                            getScrollX();
                            getClientWidth();
                            throw null;
                        }
                    }
                }
                if (this.p == null) {
                    this.p = VelocityTracker.obtain();
                }
                this.p.addMovement(motionEvent);
                return this.i;
            }
            float x2 = motionEvent.getX();
            this.m = x2;
            this.l = x2;
            this.n = motionEvent.getY();
            this.o = motionEvent.getPointerId(0);
            this.j = false;
            throw null;
        }
        this.o = -1;
        this.i = false;
        this.j = false;
        VelocityTracker velocityTracker2 = this.p;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.p = null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r17.getChildCount()
            int r2 = r21 - r19
            int r3 = r22 - r20
            int r4 = r17.getPaddingLeft()
            int r5 = r17.getPaddingTop()
            int r6 = r17.getPaddingRight()
            int r7 = r17.getPaddingBottom()
            int r8 = r17.getScrollX()
            r9 = 0
            r10 = r9
        L20:
            r11 = 8
            if (r10 >= r1) goto Lb3
            android.view.View r12 = r0.getChildAt(r10)
            int r13 = r12.getVisibility()
            if (r13 == r11) goto Laf
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            com.amazon.aps.iva.e9.b$d r11 = (com.amazon.aps.iva.e9.b.d) r11
            boolean r13 = r11.a
            if (r13 == 0) goto Laf
            int r11 = r11.b
            r13 = r11 & 7
            r11 = r11 & 112(0x70, float:1.57E-43)
            r14 = 1
            if (r13 == r14) goto L5c
            r14 = 3
            if (r13 == r14) goto L56
            r14 = 5
            if (r13 == r14) goto L49
            r13 = r4
            goto L6d
        L49:
            int r13 = r2 - r6
            int r14 = r12.getMeasuredWidth()
            int r13 = r13 - r14
            int r14 = r12.getMeasuredWidth()
            int r6 = r6 + r14
            goto L68
        L56:
            int r13 = r12.getMeasuredWidth()
            int r13 = r13 + r4
            goto L6d
        L5c:
            int r13 = r12.getMeasuredWidth()
            int r13 = r2 - r13
            int r13 = r13 / 2
            int r13 = java.lang.Math.max(r13, r4)
        L68:
            r16 = r13
            r13 = r4
            r4 = r16
        L6d:
            r14 = 16
            if (r11 == r14) goto L8e
            r14 = 48
            if (r11 == r14) goto L88
            r14 = 80
            if (r11 == r14) goto L7b
            r11 = r5
            goto L9f
        L7b:
            int r11 = r3 - r7
            int r14 = r12.getMeasuredHeight()
            int r11 = r11 - r14
            int r14 = r12.getMeasuredHeight()
            int r7 = r7 + r14
            goto L9a
        L88:
            int r11 = r12.getMeasuredHeight()
            int r11 = r11 + r5
            goto L9f
        L8e:
            int r11 = r12.getMeasuredHeight()
            int r11 = r3 - r11
            int r11 = r11 / 2
            int r11 = java.lang.Math.max(r11, r5)
        L9a:
            r16 = r11
            r11 = r5
            r5 = r16
        L9f:
            int r4 = r4 + r8
            int r14 = r12.getMeasuredWidth()
            int r14 = r14 + r4
            int r15 = r12.getMeasuredHeight()
            int r15 = r15 + r5
            r12.layout(r4, r5, r14, r15)
            r5 = r11
            r4 = r13
        Laf:
            int r10 = r10 + 1
            goto L20
        Lb3:
            r2 = r9
        Lb4:
            r3 = 0
            if (r2 >= r1) goto Ld0
            android.view.View r4 = r0.getChildAt(r2)
            int r5 = r4.getVisibility()
            if (r5 == r11) goto Lcd
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            com.amazon.aps.iva.e9.b$d r4 = (com.amazon.aps.iva.e9.b.d) r4
            boolean r4 = r4.a
            if (r4 == 0) goto Lcc
            goto Lcd
        Lcc:
            throw r3
        Lcd:
            int r2 = r2 + 1
            goto Lb4
        Ld0:
            boolean r1 = r0.q
            if (r1 != 0) goto Ld7
            r0.q = r9
            return
        Ld7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e9.b.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d dVar;
        d dVar2;
        boolean z;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.k = Math.min(measuredWidth / 10, 0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            int i5 = Ints.MAX_POWER_OF_TWO;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.a) {
                int i6 = dVar2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = true;
                if (i8 != 48 && i8 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i7 != 3 && i7 != 5) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (z2) {
                        i9 = 1073741824;
                    }
                }
                int i10 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i3 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = measuredHeight;
                    }
                } else {
                    i11 = measuredHeight;
                    i5 = i9;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i3), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, Ints.MAX_POWER_OF_TWO);
        this.e = View.MeasureSpec.makeMeasureSpec(measuredHeight, Ints.MAX_POWER_OF_TWO);
        this.f = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.a)) {
                dVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), Ints.MAX_POWER_OF_TWO), this.e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i4 = childCount;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            if (getChildAt(i2).getVisibility() != 0) {
                i2 += i3;
            } else {
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.b = gVar.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.b = 0;
        return gVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.amazon.aps.iva.e9.a aVar) {
        ArrayList arrayList = this.t;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                ((e) this.t.get(i)).onAdapterChanged(this, null, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.h) {
            this.h = i;
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.s = fVar;
    }

    public void setPageMargin(int i) {
        this.c = i;
        if (getWidth() > 0) {
            throw null;
        }
        throw null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.d = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.u == i) {
            return;
        }
        this.u = i;
        f fVar = this.s;
        if (fVar != null) {
            fVar.onPageScrollStateChanged(i);
        }
        ArrayList arrayList = this.r;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar2 = (f) this.r.get(i2);
                if (fVar2 != null) {
                    fVar2.onPageScrollStateChanged(i);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.d) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(com.amazon.aps.iva.d3.a.getDrawable(getContext(), i));
    }
}
