package com.amazon.aps.iva.u9;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;
/* compiled from: WakeLocks.java */
/* loaded from: classes.dex */
public final class m {
    public static final WeakHashMap<PowerManager.WakeLock, String> a;

    static {
        com.amazon.aps.iva.k9.m.e("WakeLocks");
        a = new WeakHashMap<>();
    }

    public static PowerManager.WakeLock a(Context context, String str) {
        String a2 = com.amazon.aps.iva.oa.a.a("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, a2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = a;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, a2);
        }
        return newWakeLock;
    }
}
