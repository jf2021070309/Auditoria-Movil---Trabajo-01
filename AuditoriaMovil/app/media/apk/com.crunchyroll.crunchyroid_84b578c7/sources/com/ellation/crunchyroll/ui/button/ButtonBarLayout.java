package com.ellation.crunchyroll.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.amazon.aps.iva.j.a;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.WeakHashMap;
import kotlin.Metadata;
/* compiled from: ButtonBarLayout.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001d\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R$\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00058B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/ellation/crunchyroll/ui/button/ButtonBarLayout;", "Landroid/widget/LinearLayout;", "", FirebaseAnalytics.Param.INDEX, "getNextVisibleChildIndex", "", "allowStacking", "Lcom/amazon/aps/iva/kb0/q;", "setAllowStacking", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "getMinimumHeight", "mAllowStacking", "Z", "mStackedGravity", "I", "mLastWidthSize", "mMinimumHeight", "stacked", "isStacked", "()Z", "setStacked", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ButtonBarLayout extends LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private final int mMinimumHeight;
    private int mStackedGravity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ButtonBarLayout.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/ui/button/ButtonBarLayout$Companion;", "", "()V", "PEEK_BUTTON_DP", "", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonBarLayout(Context context) {
        this(context, null, 2, null);
        j.f(context, "context");
    }

    private final int getNextVisibleChildIndex(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final boolean isStacked() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    private final void setStacked(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (z) {
            i = this.mStackedGravity;
        } else {
            i = 17;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
        }
        if (this.mStackedGravity != 17) {
            for (int childCount = getChildCount() - 2; -1 < childCount; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.mMinimumHeight, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int paddingBottom;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.mAllowStacking) {
            if (size > this.mLastWidthSize && isStacked()) {
                setStacked(false);
            }
            this.mLastWidthSize = size;
        }
        if (!isStacked() && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (this.mAllowStacking && !isStacked()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int nextVisibleChildIndex = getNextVisibleChildIndex(0);
        if (nextVisibleChildIndex >= 0) {
            View childAt = getChildAt(nextVisibleChildIndex);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            j.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            i4 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams2.topMargin + layoutParams2.bottomMargin;
            if (isStacked()) {
                int nextVisibleChildIndex2 = getNextVisibleChildIndex(nextVisibleChildIndex + 1);
                if (nextVisibleChildIndex2 >= 0) {
                    paddingBottom = getChildAt(nextVisibleChildIndex2).getPaddingTop() + ((int) (16 * getResources().getDisplayMetrics().density));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i4 += paddingBottom;
        }
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.d.d(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public final void setAllowStacking(boolean z) {
        if (this.mAllowStacking != z) {
            this.mAllowStacking = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    public /* synthetic */ ButtonBarLayout(Context context, AttributeSet attributeSet, int i, e eVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        this.mStackedGravity = 8388613;
        this.mLastWidthSize = -1;
        int[] iArr = a.k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        j.e(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.ButtonBarLayout)");
        g0.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.mAllowStacking = obtainStyledAttributes.getBoolean(0, true);
        this.mStackedGravity = getGravity();
        obtainStyledAttributes.recycle();
    }
}
