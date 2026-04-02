package com.amazon.aps.iva.wc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.amazon.aps.iva.f3.f;
/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes.dex */
public final class e {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return b(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return com.amazon.aps.iva.d3.a.getDrawable(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = com.amazon.aps.iva.f3.f.a;
        return f.a.a(resources, i, theme);
    }

    public static Drawable b(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            com.amazon.aps.iva.o.c cVar = new com.amazon.aps.iva.o.c(context, theme);
            cVar.a(theme.getResources().getConfiguration());
            context = cVar;
        }
        return com.amazon.aps.iva.l.a.a(context, i);
    }
}
