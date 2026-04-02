package e.i.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class a {
    public static String a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8422b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8423c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8424d;

    /* renamed from: e  reason: collision with root package name */
    public View f8425e;

    /* renamed from: f  reason: collision with root package name */
    public View f8426f;

    /* loaded from: classes2.dex */
    public static class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8427b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8428c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8429d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f8430e;

        /* renamed from: f  reason: collision with root package name */
        public final float f8431f;

        public b(Activity activity, boolean z, boolean z2, C0179a c0179a) {
            int i2;
            Resources resources = activity.getResources();
            boolean z3 = resources.getConfiguration().orientation == 1;
            this.f8430e = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            float f2 = displayMetrics.density;
            this.f8431f = Math.min(displayMetrics.widthPixels / f2, displayMetrics.heightPixels / f2);
            this.a = a(resources, "status_bar_height");
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843499, typedValue, true);
            TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
            Resources resources2 = activity.getResources();
            if (b(activity)) {
                i2 = a(resources2, z3 ? "navigation_bar_height" : "navigation_bar_height_landscape");
            } else {
                i2 = 0;
            }
            this.f8428c = i2;
            this.f8429d = b(activity) ? a(activity.getResources(), "navigation_bar_width") : 0;
            this.f8427b = i2 > 0;
        }

        public final int a(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @TargetApi(14)
        public final boolean b(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier != 0) {
                boolean z = resources.getBoolean(identifier);
                if ("1".equals(a.a)) {
                    return false;
                }
                if ("0".equals(a.a)) {
                    return true;
                }
                return z;
            }
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }

        public boolean c() {
            return this.f8431f >= 600.0f || this.f8430e;
        }
    }

    static {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            a = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
            a = null;
        }
    }

    @TargetApi(19)
    public a(Activity activity) {
        FrameLayout.LayoutParams layoutParams;
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
        try {
            this.f8423c = obtainStyledAttributes.getBoolean(0, false);
            this.f8424d = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            int i2 = window.getAttributes().flags;
            if ((67108864 & i2) != 0) {
                this.f8423c = true;
            }
            if ((i2 & 134217728) != 0) {
                this.f8424d = true;
            }
            b bVar = new b(activity, this.f8423c, this.f8424d, null);
            this.f8422b = bVar;
            if (!bVar.f8427b) {
                this.f8424d = false;
            }
            if (this.f8423c) {
                this.f8425e = new View(activity);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, bVar.a);
                layoutParams2.gravity = 48;
                if (this.f8424d && !bVar.c()) {
                    layoutParams2.rightMargin = bVar.f8429d;
                }
                this.f8425e.setLayoutParams(layoutParams2);
                this.f8425e.setBackgroundColor(-1728053248);
                this.f8425e.setVisibility(8);
                viewGroup.addView(this.f8425e);
            }
            if (this.f8424d) {
                this.f8426f = new View(activity);
                if (bVar.c()) {
                    layoutParams = new FrameLayout.LayoutParams(-1, bVar.f8428c);
                    layoutParams.gravity = 80;
                } else {
                    layoutParams = new FrameLayout.LayoutParams(bVar.f8429d, -1);
                    layoutParams.gravity = 5;
                }
                this.f8426f.setLayoutParams(layoutParams);
                this.f8426f.setBackgroundColor(-1728053248);
                this.f8426f.setVisibility(8);
                viewGroup.addView(this.f8426f);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
