package e.c.a.m.u.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c.i.d.c.j;
/* loaded from: classes.dex */
public final class a {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (a) {
                return c.b.d.a.a.b(theme != null ? new c.b.h.c(context2, theme) : context2, i2);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return c.i.d.a.c(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return j.a(context2.getResources(), i2, theme);
    }
}
