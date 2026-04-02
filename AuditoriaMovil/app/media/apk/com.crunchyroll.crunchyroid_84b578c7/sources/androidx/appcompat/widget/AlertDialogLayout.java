package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import com.google.common.primitives.Ints;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int d(View view) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        int d = g0.d.d(view);
        if (d > 0) {
            return d;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return d(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public final void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Ints.MAX_POWER_OF_TWO);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = r0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb1
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lae
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lae
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$a r6 = (androidx.appcompat.widget.LinearLayoutCompat.a) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            java.util.WeakHashMap<android.view.View, com.amazon.aps.iva.p3.r0> r8 = com.amazon.aps.iva.p3.g0.a
            int r8 = com.amazon.aps.iva.p3.g0.e.d(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8e
            r8 = 5
            if (r7 == r8) goto L89
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L99
        L89:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L98
        L8e:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L98:
            int r7 = r7 - r8
        L99:
            boolean r8 = r9.hasDividerBeforeChildAt(r0)
            if (r8 == 0) goto La0
            int r12 = r12 + r14
        La0:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        Lae:
            int r0 = r0 + 1
            goto L50
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        int childCount = getChildCount();
        boolean z = false;
        View view = null;
        int i7 = 0;
        View view2 = null;
        View view3 = null;
        while (true) {
            if (i7 < childCount) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = childAt;
                    } else if (id == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        break;
                    } else {
                        view3 = childAt;
                    }
                }
                i7++;
            } else {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view != null) {
                    view.measure(i, 0);
                    paddingBottom += view.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i, 0);
                    i4 = d(view2);
                    i5 = view2.getMeasuredHeight() - i4;
                    paddingBottom += i4;
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        makeMeasureSpec = 0;
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
                    }
                    view3.measure(i, makeMeasureSpec);
                    i6 = view3.getMeasuredHeight();
                    paddingBottom += i6;
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                } else {
                    i6 = 0;
                }
                int i8 = size - paddingBottom;
                if (view2 != null) {
                    int i9 = paddingBottom - i4;
                    int min = Math.min(i8, i5);
                    if (min > 0) {
                        i8 -= min;
                        i4 += min;
                    }
                    view2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, Ints.MAX_POWER_OF_TWO));
                    paddingBottom = i9 + view2.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                }
                if (view3 != null && i8 > 0) {
                    view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
                    paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                }
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2.getVisibility() != 8) {
                        i10 = Math.max(i10, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i10, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
                if (mode2 != 1073741824) {
                    forceUniformWidth(childCount, i2);
                }
                z = true;
            }
        }
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
