package c.b.i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import ch.qos.logback.core.net.SyslogConstants;
/* loaded from: classes.dex */
public class i0 extends ViewGroup {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public int f1170b;

    /* renamed from: c  reason: collision with root package name */
    public int f1171c;

    /* renamed from: d  reason: collision with root package name */
    public int f1172d;

    /* renamed from: e  reason: collision with root package name */
    public int f1173e;

    /* renamed from: f  reason: collision with root package name */
    public int f1174f;

    /* renamed from: g  reason: collision with root package name */
    public float f1175g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1176h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f1177i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f1178j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f1179k;

    /* renamed from: l  reason: collision with root package name */
    public int f1180l;

    /* renamed from: m  reason: collision with root package name */
    public int f1181m;

    /* renamed from: n  reason: collision with root package name */
    public int f1182n;
    public int o;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int resourceId;
        this.a = true;
        this.f1170b = -1;
        this.f1171c = 0;
        this.f1173e = 8388659;
        int[] iArr = c.b.b.f782m;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        c.i.k.d0.z(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = obtainStyledAttributes.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = obtainStyledAttributes.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f1175g = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f1170b = obtainStyledAttributes.getInt(3, -1);
        this.f1176h = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : c.b.d.a.a.b(context, resourceId));
        this.f1182n = obtainStyledAttributes.getInt(8, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas, int i2) {
        this.f1179k.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.f1181m + i2);
        this.f1179k.draw(canvas);
    }

    public void g(Canvas canvas, int i2) {
        this.f1179k.setBounds(i2, getPaddingTop() + this.o, this.f1180l + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.f1179k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f1170b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1170b;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1170b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i4 = this.f1171c;
            if (this.f1172d == 1 && (i2 = this.f1173e & SyslogConstants.LOG_ALERT) != 48) {
                if (i2 == 16) {
                    i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1174f) / 2;
                } else if (i2 == 80) {
                    i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1174f;
                }
            }
            return i4 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1170b;
    }

    public Drawable getDividerDrawable() {
        return this.f1179k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.f1180l;
    }

    public int getGravity() {
        return this.f1173e;
    }

    public int getOrientation() {
        return this.f1172d;
    }

    public int getShowDividers() {
        return this.f1182n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1175g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i2 = this.f1172d;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int k() {
        return 0;
    }

    public int l() {
        return 0;
    }

    public int m() {
        return 0;
    }

    public boolean n(int i2) {
        if (i2 == 0) {
            return (this.f1182n & 1) != 0;
        } else if (i2 == getChildCount()) {
            return (this.f1182n & 4) != 0;
        } else if ((this.f1182n & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public void o(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f1179k == null) {
            return;
        }
        int i3 = 0;
        if (this.f1172d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && n(i3)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f1181m);
                }
                i3++;
            }
            if (n(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1181m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = g1.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && n(i3)) {
                a aVar = (a) childAt3.getLayoutParams();
                g(canvas, a2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1180l);
            }
            i3++;
        }
        if (n(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i2 = this.f1180l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f1180l;
                right = left - i2;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.i0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.i0.onMeasure(int, int):void");
    }

    public int p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f1170b = i2;
            return;
        }
        StringBuilder y = e.a.d.a.a.y("base aligned child index out of range (0, ");
        y.append(getChildCount());
        y.append(")");
        throw new IllegalArgumentException(y.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1179k) {
            return;
        }
        this.f1179k = drawable;
        if (drawable != null) {
            this.f1180l = drawable.getIntrinsicWidth();
            this.f1181m = drawable.getIntrinsicHeight();
        } else {
            this.f1180l = 0;
            this.f1181m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.o = i2;
    }

    public void setGravity(int i2) {
        if (this.f1173e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & SyslogConstants.LOG_ALERT) == 0) {
                i2 |= 48;
            }
            this.f1173e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1173e;
        if ((8388615 & i4) != i3) {
            this.f1173e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1176h = z;
    }

    public void setOrientation(int i2) {
        if (this.f1172d != i2) {
            this.f1172d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f1182n) {
            requestLayout();
        }
        this.f1182n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & SyslogConstants.LOG_ALERT;
        int i4 = this.f1173e;
        if ((i4 & SyslogConstants.LOG_ALERT) != i3) {
            this.f1173e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1175g = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
