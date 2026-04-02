package c.b;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c.b.i.d1;
import c.b.i.h1;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class a {
    public static Field a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f764b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f765c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f766d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f767e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f768f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f769g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f770h;

    public static void a(Object obj) {
        if (!f766d) {
            try {
                f765c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f766d = true;
        }
        Class<?> cls = f765c;
        if (cls == null) {
            return;
        }
        if (!f768f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f767e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f768f = true;
        }
        Field field = f767e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static InputConnection b(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof h1) {
                    editorInfo.hintText = ((h1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static void c(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        d1 d1Var = d1.a;
        if (d1Var != null && d1Var.f1116c == view) {
            d1.c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new d1(view, charSequence);
            return;
        }
        d1 d1Var2 = d1.f1115b;
        if (d1Var2 != null && d1Var2.f1116c == view) {
            d1Var2.b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
