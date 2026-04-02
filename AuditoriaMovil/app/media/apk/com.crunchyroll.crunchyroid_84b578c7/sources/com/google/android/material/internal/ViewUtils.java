package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.u;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.p3.y0;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes3.dex */
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    /* loaded from: classes3.dex */
    public interface OnApplyWindowInsetsListener {
        w0 onApplyWindowInsets(View view, w0 w0Var, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static Rect calculateOffsetRectFromBounds(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static Rect calculateRectFromBounds(View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i, int i2) {
        doOnApplyWindowInsets(view, attributeSet, i, i2, null);
    }

    public static float dpToPx(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Integer getBackgroundColor(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static List<View> getChildren(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    public static ViewGroup getContentView(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl getContentViewOverlay(View view) {
        return getOverlay(getContentView(view));
    }

    private static InputMethodManager getInputMethodManager(View view) {
        return (InputMethodManager) com.amazon.aps.iva.d3.a.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static ViewOverlayImpl getOverlay(View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static float getParentAbsoluteElevation(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            f += g0.i.i((View) parent);
        }
        return f;
    }

    public static void hideKeyboard(View view) {
        hideKeyboard(view, true);
    }

    public static boolean isLayoutRtl(View view) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.e.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void removeOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(View view) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.g.b(view)) {
            g0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    WeakHashMap<View, r0> weakHashMap2 = g0.a;
                    g0.h.c(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void setBoundsFromRect(View view, Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void showKeyboard(View view) {
        showKeyboard(view, true);
    }

    public static Rect calculateRectFromBounds(View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i, int i2, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.Insets, i, i2);
        final boolean z = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public w0 onApplyWindowInsets(View view2, w0 w0Var, RelativePadding relativePadding) {
                if (z) {
                    relativePadding.bottom = w0Var.b() + relativePadding.bottom;
                }
                boolean isLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z2) {
                    if (isLayoutRtl) {
                        relativePadding.end = w0Var.c() + relativePadding.end;
                    } else {
                        relativePadding.start = w0Var.c() + relativePadding.start;
                    }
                }
                if (z3) {
                    if (isLayoutRtl) {
                        relativePadding.start = w0Var.d() + relativePadding.start;
                    } else {
                        relativePadding.end = w0Var.d() + relativePadding.end;
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                if (onApplyWindowInsetsListener2 != null) {
                    return onApplyWindowInsetsListener2.onApplyWindowInsets(view2, w0Var, relativePadding);
                }
                return w0Var;
            }
        });
    }

    public static void hideKeyboard(View view, boolean z) {
        y0 h;
        if (z && (h = g0.h(view)) != null) {
            h.a.b(8);
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestFocusAndShowKeyboard(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.amazon.aps.iva.w80.b
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.showKeyboard(view, z);
            }
        });
    }

    public static void showKeyboard(View view, boolean z) {
        y0 h;
        if (z && (h = g0.h(view)) != null) {
            h.a.g();
        } else {
            getInputMethodManager(view).showSoftInput(view, 1);
        }
    }

    /* loaded from: classes3.dex */
    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public void applyToView(View view) {
            int i = this.start;
            int i2 = this.top;
            int i3 = this.end;
            int i4 = this.bottom;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.e.k(view, i, i2, i3, i4);
        }

        public RelativePadding(RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public static void doOnApplyWindowInsets(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        final RelativePadding relativePadding = new RelativePadding(g0.e.f(view), view.getPaddingTop(), g0.e.e(view), view.getPaddingBottom());
        g0.i.u(view, new u() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // com.amazon.aps.iva.p3.u
            public w0 onApplyWindowInsets(View view2, w0 w0Var) {
                return OnApplyWindowInsetsListener.this.onApplyWindowInsets(view2, w0Var, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }
}
