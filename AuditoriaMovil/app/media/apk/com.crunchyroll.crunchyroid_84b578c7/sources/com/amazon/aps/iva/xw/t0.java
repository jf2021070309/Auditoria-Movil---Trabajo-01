package com.amazon.aps.iva.xw;

import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
/* compiled from: ViewExtensions.kt */
/* loaded from: classes2.dex */
public final class t0 {
    public static final int a(int i, View view) throws Resources.NotFoundException {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        return view.getResources().getDimensionPixelSize(i);
    }

    public static final Rect b(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        return rect;
    }

    public static Rect c(FrameLayout frameLayout) {
        com.amazon.aps.iva.yb0.j.f(frameLayout, "<this>");
        frameLayout.measure(0, 0);
        return new Rect(0, 0, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
    }

    public static final com.amazon.aps.iva.i5.o d(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        com.amazon.aps.iva.i5.o a = com.amazon.aps.iva.i5.i0.a(view);
        com.amazon.aps.iva.yb0.j.c(a);
        return a;
    }

    public static final void e(View view, Integer num, Integer num2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int marginStart;
        int marginEnd;
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams == null) {
            return;
        }
        if (num != null) {
            marginStart = num.intValue();
        } else {
            marginStart = marginLayoutParams.getMarginStart();
        }
        marginLayoutParams.setMarginStart(marginStart);
        if (num2 != null) {
            marginEnd = num2.intValue();
        } else {
            marginEnd = marginLayoutParams.getMarginEnd();
        }
        marginLayoutParams.setMarginEnd(marginEnd);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void f(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams == null) {
            return;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = marginLayoutParams.leftMargin;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = marginLayoutParams.topMargin;
        }
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = marginLayoutParams.rightMargin;
        }
        if (num4 != null) {
            i4 = num4.intValue();
        } else {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void g(View view, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        e(view, num, num2);
    }

    public static /* synthetic */ void h(View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        f(view, num, num2, num3, num4);
    }

    public static final void i(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        if (num != null) {
            paddingLeft = num.intValue();
        } else {
            paddingLeft = view.getPaddingLeft();
        }
        if (num2 != null) {
            paddingTop = num2.intValue();
        } else {
            paddingTop = view.getPaddingTop();
        }
        if (num3 != null) {
            paddingRight = num3.intValue();
        } else {
            paddingRight = view.getPaddingRight();
        }
        if (num4 != null) {
            paddingBottom = num4.intValue();
        } else {
            paddingBottom = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public static /* synthetic */ void j(View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        i(view, num, num2, num3, num4);
    }

    public static final void k(View view, Integer num, Integer num2) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        if (num2 != null) {
            view.getLayoutParams().height = num2.intValue();
        }
        if (num != null) {
            view.getLayoutParams().width = num.intValue();
        }
        view.requestLayout();
    }

    public static final int l(WindowInsets windowInsets) {
        int systemBars;
        Insets insets;
        int i;
        com.amazon.aps.iva.yb0.j.f(windowInsets, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i = insets.top;
            return i;
        }
        return windowInsets.getSystemWindowInsetTop();
    }
}
