package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.b.b;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public int f213b;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213b = -1;
        int[] iArr = b.f780k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        d0.z(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 8388613 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z;
        int size = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        if (this.a) {
            if (size > this.f213b && b()) {
                setStacked(false);
            }
            this.f213b = size;
        }
        if (b() || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Level.ALL_INT);
            z = true;
        }
        super.onMeasure(i4, i3);
        if (this.a && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i2, i3);
        }
        int a = a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a2 = a(a + 1);
                i5 = a2 >= 0 ? getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i5 = getPaddingBottom() + measuredHeight;
            }
        }
        AtomicInteger atomicInteger = d0.a;
        if (d0.c.d(this) != i5) {
            setMinimumHeight(i5);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
