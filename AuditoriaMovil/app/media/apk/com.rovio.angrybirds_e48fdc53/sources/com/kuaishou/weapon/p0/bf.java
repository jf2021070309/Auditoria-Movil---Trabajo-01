package com.kuaishou.weapon.p0;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class bf {
    private int a = -1;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r7 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r7 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject a(android.content.Context r7, java.lang.String r8) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "content://settings/"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6a
            r1.append(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L6a
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L6a
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L6a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a
        L23:
            boolean r8 = r7.moveToNext()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L5d
            java.lang.String r8 = "name"
            int r8 = r7.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "value"
            int r1 = r7.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r7.getString(r1)     // Catch: java.lang.Throwable -> L68
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L23
            java.lang.String r2 = "android_id"
            boolean r2 = r8.equals(r2)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L23
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L23
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L68
            r3 = 20
            if (r2 >= r3) goto L23
            r0.put(r8, r1)     // Catch: java.lang.Throwable -> L68
            goto L23
        L5d:
            r7.close()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L6f
        L62:
            r7.close()     // Catch: java.lang.Throwable -> L66
            goto L6f
        L66:
            r7 = move-exception
            goto L6f
        L68:
            r8 = move-exception
            goto L6c
        L6a:
            r7 = move-exception
            r7 = 0
        L6c:
            if (r7 == 0) goto L6f
            goto L62
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.bf.a(android.content.Context, java.lang.String):org.json.JSONObject");
    }

    public static int d(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", 255);
        } catch (Exception e) {
            return 0;
        }
    }

    public static JSONObject g(Context context) {
        String[] strArr = {"system", "global", "secure"};
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < 3; i++) {
            try {
                String str = strArr[i];
                JSONObject a = a(context, str);
                if (a != null && a.length() > 0) {
                    jSONObject.put(str, a);
                }
            } catch (Exception e) {
            }
        }
        return jSONObject;
    }

    private boolean h(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.widget.LockPatternUtils");
            return ((Boolean) cls.getMethod("isSecure", new Class[0]).invoke(cls.getConstructor(Context.class).newInstance(context), new Object[0])).booleanValue();
        } catch (Exception e) {
            return false;
        }
    }

    public String a(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return bh.b;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(0);
            int streamVolume = audioManager.getStreamVolume(0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, streamMaxVolume + ":" + streamVolume);
            int streamMaxVolume2 = audioManager.getStreamMaxVolume(1);
            int streamVolume2 = audioManager.getStreamVolume(1);
            jSONObject.put("1", streamMaxVolume2 + ":" + streamVolume2);
            int streamMaxVolume3 = audioManager.getStreamMaxVolume(2);
            int streamVolume3 = audioManager.getStreamVolume(2);
            jSONObject.put("2", streamMaxVolume3 + ":" + streamVolume3);
            int streamMaxVolume4 = audioManager.getStreamMaxVolume(3);
            int streamVolume4 = audioManager.getStreamVolume(3);
            jSONObject.put("3", streamMaxVolume4 + ":" + streamVolume4);
            int streamMaxVolume5 = audioManager.getStreamMaxVolume(4);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("4", streamMaxVolume5 + ":" + streamVolume5);
            String jSONObject2 = jSONObject.toString();
            return TextUtils.isEmpty(jSONObject2) ? bh.c : jSONObject2;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public boolean a() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public int b() {
        return this.a;
    }

    public boolean b(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    public boolean c(Context context) {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            return Build.VERSION.SDK_INT >= 28 ? keyguardManager.isKeyguardLocked() : keyguardManager.inKeyguardRestrictedInputMode();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean e(Context context) {
        return Build.VERSION.SDK_INT >= 16 ? ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure() : h(context);
    }

    public JSONObject f(Context context) {
        List<Sensor> sensorList;
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService(com.umeng.analytics.pro.bg.ac);
            if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            for (Sensor sensor : sensorList) {
                jSONObject.put(sensor.getName(), sensor.getVendor());
            }
            return jSONObject;
        } catch (Exception e) {
            return null;
        }
    }
}
