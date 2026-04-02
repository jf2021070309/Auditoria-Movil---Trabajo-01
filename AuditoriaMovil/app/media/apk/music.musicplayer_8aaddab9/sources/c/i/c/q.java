package c.i.c;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class q {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f1992b;

    static {
        new HashSet();
    }

    public q(Context context) {
        this.a = context;
        this.f1992b = (NotificationManager) context.getSystemService("notification");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f1992b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        String packageName = this.a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
