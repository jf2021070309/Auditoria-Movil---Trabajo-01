package e.d.b.d.r;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class e extends ViewGroup {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f6524b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6525c;

    /* renamed from: d  reason: collision with root package name */
    public int f6526d;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6525c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.d.b.d.b.f6320i, 0, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f6524b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean a() {
        return this.f6525c;
    }

    public int getItemSpacing() {
        return this.f6524b;
    }

    public int getLineSpacing() {
        return this.a;
    }

    public int getRowCount() {
        return this.f6526d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (getChildCount() == 0) {
            this.f6526d = 0;
            return;
        }
        this.f6526d = 1;
        AtomicInteger atomicInteger = d0.a;
        boolean z2 = d0.d.d(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i8 = (i4 - i2) - paddingLeft;
        int i9 = paddingRight;
        int i10 = paddingTop;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = marginLayoutParams.getMarginStart();
                    i6 = marginLayoutParams.getMarginEnd();
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i9 + i7;
                if (!this.f6525c && measuredWidth > i8) {
                    i10 = this.a + paddingTop;
                    this.f6526d++;
                    i9 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f6526d - 1));
                int i12 = i9 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                if (z2) {
                    childAt.layout(i8 - measuredWidth2, i10, (i8 - i9) - i7, measuredHeight);
                } else {
                    childAt.layout(i12, i10, measuredWidth2, measuredHeight);
                }
                i9 += childAt.getMeasuredWidth() + i7 + i6 + this.f6524b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i7 - getPaddingRight();
        int i8 = paddingTop;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i6 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i8 = paddingTop + this.a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i6;
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i6 + i5 + this.f6524b + paddingLeft;
                if (i10 == getChildCount() - 1) {
                    i9 += i5;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i9;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i4 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i4 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i4) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i2) {
        this.f6524b = i2;
    }

    public void setLineSpacing(int i2) {
        this.a = i2;
    }

    public void setSingleLine(boolean z) {
        this.f6525c = z;
    }
}
