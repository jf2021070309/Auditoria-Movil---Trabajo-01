package c.c0.d0.t;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class m {
    public static final String a = c.c0.r.e("WakeLocks");

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f1549b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String k2 = e.a.d.a.a.k("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, k2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f1549b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, k2);
        }
        return newWakeLock;
    }
}
