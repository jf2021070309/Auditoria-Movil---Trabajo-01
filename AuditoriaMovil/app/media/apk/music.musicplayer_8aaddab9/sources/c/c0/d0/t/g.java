package c.c0.d0.t;

import android.content.ComponentName;
import android.content.Context;
/* loaded from: classes.dex */
public class g {
    public static final String a = c.c0.r.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            c.c0.r c2 = c.c0.r.c();
            String str = a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            c2.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e2) {
            c.c0.r c3 = c.c0.r.c();
            String str2 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            c3.a(str2, String.format("%s could not be %s", objArr2), e2);
        }
    }
}
