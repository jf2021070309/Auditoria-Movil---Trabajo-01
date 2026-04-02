package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import c.p.j;
import c.p.n;
import c.p.p;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements n {
    public static int a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f83b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f84c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f85d;

    /* renamed from: e  reason: collision with root package name */
    public Activity f86e;

    public ImmLeaksCleaner(Activity activity) {
        this.f86e = activity;
    }

    @Override // c.p.n
    public void c(p pVar, j.a aVar) {
        if (aVar != j.a.ON_DESTROY) {
            return;
        }
        if (a == 0) {
            try {
                a = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f84c = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f85d = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f83b = declaredField3;
                declaredField3.setAccessible(true);
                a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (a == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f86e.getSystemService("input_method");
            try {
                Object obj = f83b.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f84c.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f85d.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
