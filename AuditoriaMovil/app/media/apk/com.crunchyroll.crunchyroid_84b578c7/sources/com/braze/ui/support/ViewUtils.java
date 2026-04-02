package com.braze.ui.support;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.amazon.aps.iva.p3.d;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
/* compiled from: ViewUtils.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\t2\u0006\u0010\r\u001a\u00020\f\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f\u001a\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014\u001a\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0000\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroid/view/View;", "Lcom/amazon/aps/iva/kb0/q;", "removeViewFromParent", "setFocusableInTouchModeAndRequestFocus", "Landroid/content/Context;", "context", "", "valueInDp", "convertDpToPixels", "Landroid/app/Activity;", "", "isRunningOnTablet", "", "requestedOrientation", "setActivityRequestedOrientation", "view", "height", "setHeightOnViewLayoutParams", "isDeviceInNightMode", "currentScreenOrientation", "Lcom/braze/enums/inappmessage/Orientation;", "preferredOrientation", "isCurrentOrientationValid", "Lcom/amazon/aps/iva/p3/w0;", "windowInsets", "getMaxSafeLeftInset", "getMaxSafeRightInset", "getMaxSafeTopInset", "getMaxSafeBottomInset", "isDeviceNotInTouchMode", "", "TAG", "Ljava/lang/String;", "android-sdk-ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ViewUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    public static final double convertDpToPixels(Context context, double d) {
        j.f(context, "context");
        return d * context.getResources().getDisplayMetrics().density;
    }

    public static final int getMaxSafeBottomInset(w0 w0Var) {
        j.f(w0Var, "windowInsets");
        d f = w0Var.a.f();
        int i = 0;
        if (f != null && Build.VERSION.SDK_INT >= 28) {
            i = d.a.c(f.a);
        }
        return Math.max(i, w0Var.a(7).d);
    }

    public static final int getMaxSafeLeftInset(w0 w0Var) {
        j.f(w0Var, "windowInsets");
        d f = w0Var.a.f();
        int i = 0;
        if (f != null && Build.VERSION.SDK_INT >= 28) {
            i = d.a.d(f.a);
        }
        return Math.max(i, w0Var.a(7).a);
    }

    public static final int getMaxSafeRightInset(w0 w0Var) {
        j.f(w0Var, "windowInsets");
        d f = w0Var.a.f();
        int i = 0;
        if (f != null && Build.VERSION.SDK_INT >= 28) {
            i = d.a.e(f.a);
        }
        return Math.max(i, w0Var.a(7).c);
    }

    public static final int getMaxSafeTopInset(w0 w0Var) {
        j.f(w0Var, "windowInsets");
        d f = w0Var.a.f();
        int i = 0;
        if (f != null && Build.VERSION.SDK_INT >= 28) {
            i = d.a.f(f.a);
        }
        return Math.max(i, w0Var.a(7).b);
    }

    public static final boolean isCurrentOrientationValid(int i, Orientation orientation) {
        j.f(orientation, "preferredOrientation");
        if (i == 2 && orientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (a) ViewUtils$isCurrentOrientationValid$1.INSTANCE, 4, (Object) null);
            return true;
        } else if (i == 1 && orientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (a) ViewUtils$isCurrentOrientationValid$2.INSTANCE, 4, (Object) null);
            return true;
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (a) new ViewUtils$isCurrentOrientationValid$3(i, orientation), 4, (Object) null);
            return false;
        }
    }

    public static final boolean isDeviceInNightMode(Context context) {
        j.f(context, "context");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static final boolean isDeviceNotInTouchMode(View view) {
        j.f(view, "view");
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(Activity activity) {
        j.f(activity, "<this>");
        if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            return true;
        }
        return false;
    }

    public static final void removeViewFromParent(View view) {
        ViewParent viewParent;
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (a) ViewUtils$removeViewFromParent$1.INSTANCE, 4, (Object) null);
        }
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            j.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (a) new ViewUtils$removeViewFromParent$2(view, viewGroup), 4, (Object) null);
        }
    }

    public static final void setActivityRequestedOrientation(Activity activity, int i) {
        j.f(activity, "<this>");
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, (a<String>) new ViewUtils$setActivityRequestedOrientation$1(i, activity));
        }
    }

    public static final void setFocusableInTouchModeAndRequestFocus(View view) {
        j.f(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, (a<String>) ViewUtils$setFocusableInTouchModeAndRequestFocus$1.INSTANCE);
        }
    }

    public static final void setHeightOnViewLayoutParams(View view, int i) {
        j.f(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
