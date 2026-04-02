package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.amazon.aps.iva.g3.e;
import com.amazon.aps.iva.h3.a;
import com.crunchyroll.crunchyroid.R;
/* compiled from: MediaRouterThemeHelper.java */
/* loaded from: classes.dex */
public final class d {
    public static ContextThemeWrapper a(Context context, int i, boolean z) {
        int i2;
        if (i == 0) {
            if (!z) {
                i2 = R.attr.dialogTheme;
            } else {
                i2 = R.attr.alertDialogTheme;
            }
            i = h(i2, context);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (h(R.attr.mediaRouteTheme, contextThemeWrapper) != 0) {
            return new ContextThemeWrapper(contextThemeWrapper, f(contextThemeWrapper));
        }
        return contextThemeWrapper;
    }

    public static int b(ContextThemeWrapper contextThemeWrapper) {
        int h = h(R.attr.mediaRouteTheme, contextThemeWrapper);
        if (h == 0) {
            return f(contextThemeWrapper);
        }
        return h;
    }

    public static int c(Context context) {
        if (e.d(-1, g(context, R.attr.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    public static float d(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable e(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable a = com.amazon.aps.iva.l.a.a(context, obtainStyledAttributes.getResourceId(0, 0));
        if (i(context)) {
            a.b.g(a, com.amazon.aps.iva.d3.a.getColor(context, R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return a;
    }

    public static int f(Context context) {
        if (i(context)) {
            if (c(context) == -570425344) {
                return 2132083813;
            }
            return 2132083814;
        } else if (c(context) == -570425344) {
            return 2132083815;
        } else {
            return 2132083812;
        }
    }

    public static int g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int h(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean i(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public static void j(Context context, Dialog dialog) {
        int i;
        View decorView = dialog.getWindow().getDecorView();
        if (i(context)) {
            i = R.color.mr_dynamic_dialog_background_light;
        } else {
            i = R.color.mr_dynamic_dialog_background_dark;
        }
        decorView.setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(context, i));
    }

    public static void k(Context context, ProgressBar progressBar) {
        int i;
        if (!progressBar.isIndeterminate()) {
            return;
        }
        if (i(context)) {
            i = R.color.mr_cast_progressbar_progress_and_thumb_light;
        } else {
            i = R.color.mr_cast_progressbar_progress_and_thumb_dark;
        }
        progressBar.getIndeterminateDrawable().setColorFilter(com.amazon.aps.iva.d3.a.getColor(context, i), PorterDuff.Mode.SRC_IN);
    }

    public static void l(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, ViewGroup viewGroup) {
        int c = c(context);
        if (Color.alpha(c) != 255) {
            c = e.g(c, ((Integer) viewGroup.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(c, c);
    }
}
