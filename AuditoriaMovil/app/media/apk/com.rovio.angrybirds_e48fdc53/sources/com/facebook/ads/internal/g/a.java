package com.facebook.ads.internal.g;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.appevents.AppEventsConstants;
import com.umeng.analytics.pro.bg;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class a {
    private static volatile float[] d;
    private static volatile float[] e;
    private static SensorEventListener h;
    private static SensorEventListener i;
    private static SensorManager a = null;
    private static Sensor b = null;
    private static Sensor c = null;
    private static Map<String, String> f = new ConcurrentHashMap();
    private static String[] g = {"x", "y", bg.aD};

    /* renamed from: com.facebook.ads.internal.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0111a implements SensorEventListener {
        private C0111a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] unused = a.d = sensorEvent.values;
            a.d();
        }
    }

    /* loaded from: classes2.dex */
    private static class b implements SensorEventListener {
        private b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] unused = a.e = sensorEvent.values;
            a.e();
        }
    }

    public static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f);
        a(hashMap);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (com.facebook.ads.internal.g.a.a == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(android.content.Context r5) {
        /*
            java.lang.Class<com.facebook.ads.internal.g.a> r1 = com.facebook.ads.internal.g.a.class
            monitor-enter(r1)
            b(r5)     // Catch: java.lang.Throwable -> L6f
            c(r5)     // Catch: java.lang.Throwable -> L6f
            d(r5)     // Catch: java.lang.Throwable -> L6f
            android.hardware.SensorManager r0 = com.facebook.ads.internal.g.a.a     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L20
            java.lang.String r0 = "sensor"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch: java.lang.Throwable -> L6f
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch: java.lang.Throwable -> L6f
            com.facebook.ads.internal.g.a.a = r0     // Catch: java.lang.Throwable -> L6f
            android.hardware.SensorManager r0 = com.facebook.ads.internal.g.a.a     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L20
        L1e:
            monitor-exit(r1)
            return
        L20:
            android.hardware.Sensor r0 = com.facebook.ads.internal.g.a.b     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L2d
            android.hardware.SensorManager r0 = com.facebook.ads.internal.g.a.a     // Catch: java.lang.Throwable -> L6f
            r2 = 1
            android.hardware.Sensor r0 = r0.getDefaultSensor(r2)     // Catch: java.lang.Throwable -> L6f
            com.facebook.ads.internal.g.a.b = r0     // Catch: java.lang.Throwable -> L6f
        L2d:
            android.hardware.Sensor r0 = com.facebook.ads.internal.g.a.c     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L3a
            android.hardware.SensorManager r0 = com.facebook.ads.internal.g.a.a     // Catch: java.lang.Throwable -> L6f
            r2 = 4
            android.hardware.Sensor r0 = r0.getDefaultSensor(r2)     // Catch: java.lang.Throwable -> L6f
            com.facebook.ads.internal.g.a.c = r0     // Catch: java.lang.Throwable -> L6f
        L3a:
            android.hardware.SensorEventListener r0 = com.facebook.ads.internal.g.a.h     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L54
            com.facebook.ads.internal.g.a$a r0 = new com.facebook.ads.internal.g.a$a     // Catch: java.lang.Throwable -> L6f
            r2 = 0
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            com.facebook.ads.internal.g.a.h = r0     // Catch: java.lang.Throwable -> L6f
            android.hardware.Sensor r0 = com.facebook.ads.internal.g.a.b     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L54
            android.hardware.SensorManager r0 = com.facebook.ads.internal.g.a.a     // Catch: java.lang.Throwable -> L6f
            android.hardware.SensorEventListener r2 = com.facebook.ads.internal.g.a.h     // Catch: java.lang.Throwable -> L6f
            android.hardware.Sensor r3 = com.facebook.ads.internal.g.a.b     // Catch: java.lang.Throwable -> L6f
            r4 = 3
            r0.registerListener(r2, r3, r4)     // Catch: java.lang.Throwable -> L6f
        L54:
            android.hardware.SensorEventListener r0 = com.facebook.ads.internal.g.a.i     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L1e
            com.facebook.ads.internal.g.a$b r0 = new com.facebook.ads.internal.g.a$b     // Catch: java.lang.Throwable -> L6f
            r2 = 0
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            com.facebook.ads.internal.g.a.i = r0     // Catch: java.lang.Throwable -> L6f
            android.hardware.Sensor r0 = com.facebook.ads.internal.g.a.c     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L1e
            android.hardware.SensorManager r0 = com.facebook.ads.internal.g.a.a     // Catch: java.lang.Throwable -> L6f
            android.hardware.SensorEventListener r2 = com.facebook.ads.internal.g.a.i     // Catch: java.lang.Throwable -> L6f
            android.hardware.Sensor r3 = com.facebook.ads.internal.g.a.c     // Catch: java.lang.Throwable -> L6f
            r4 = 3
            r0.registerListener(r2, r3, r4)     // Catch: java.lang.Throwable -> L6f
            goto L1e
        L6f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.a.a(android.content.Context):void");
    }

    private static void a(Map<String, String> map) {
        float[] fArr = d;
        float[] fArr2 = e;
        if (fArr != null) {
            int min = Math.min(g.length, fArr.length);
            for (int i2 = 0; i2 < min; i2++) {
                map.put("accelerometer_" + g[i2], String.valueOf(fArr[i2]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(g.length, fArr2.length);
            for (int i3 = 0; i3 < min2; i3++) {
                map.put("rotation_" + g[i3], String.valueOf(fArr2[i3]));
            }
        }
    }

    private static void b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getMemoryInfo(memoryInfo);
        f.put("available_memory", String.valueOf(memoryInfo.availMem));
    }

    private static void c(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        f.put("free_space", String.valueOf(statFs.getAvailableBlocks() * statFs.getBlockSize()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d() {
        synchronized (a.class) {
            if (a != null) {
                a.unregisterListener(h);
            }
            h = null;
        }
    }

    private static void d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        int intExtra3 = registerReceiver.getIntExtra("status", -1);
        boolean z = intExtra3 == 2 || intExtra3 == 5;
        f.put(bg.Z, String.valueOf(intExtra2 > 0 ? (intExtra / intExtra2) * 100.0f : 0.0f));
        f.put("charging", z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void e() {
        synchronized (a.class) {
            if (a != null) {
                a.unregisterListener(i);
            }
            i = null;
        }
    }
}
