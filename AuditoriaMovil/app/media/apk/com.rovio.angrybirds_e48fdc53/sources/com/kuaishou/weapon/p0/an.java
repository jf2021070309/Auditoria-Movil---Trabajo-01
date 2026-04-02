package com.kuaishou.weapon.p0;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.Camera;
import android.location.Location;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.places.model.PlaceFields;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class an {
    public static final String a = "de.robv.android.xposed.XposedHelpers";
    public static final String b = "de.robv.android.xposed.XposedBridge";
    public static final String c = "com.elderdrivers.riru.edxp.config.EdXpConfigGlobal";

    private boolean a(Context context, String str, Set set) {
        TelephonyManager telephonyManager;
        try {
            if (set.size() > 0 && (telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE)) != null) {
                return a(telephonyManager.getClass(), str, set);
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean a(Class cls, String str, Set set) {
        if (str != null) {
            try {
                if (set.size() > 0 && set.toString().contains(str)) {
                    if (set.toString().contains(cls.getName())) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
            }
        }
        return false;
    }

    private boolean a(Method method) {
        return method != null && Modifier.isNative(method.getModifiers());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(android.content.Context r3, int r4, java.util.Set r5) {
        /*
            r2 = this;
            r0 = 0
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L40
            if (r1 == 0) goto L3a
            switch(r4) {
                case 13: goto L37;
                case 14: goto L34;
                case 15: goto L2d;
                case 16: goto L28;
                case 17: goto L23;
                case 18: goto L1e;
                case 19: goto L19;
                case 20: goto L14;
                case 21: goto Lb;
                default: goto La;
            }     // Catch: java.lang.Exception -> L40
        La:
            goto L3a
        Lb:
            java.lang.Class<android.net.wifi.WifiInfo> r3 = android.net.wifi.WifiInfo.class
            java.lang.String r4 = "getBSSID"
        Lf:
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L40
            goto L3b
        L14:
            java.lang.Class<android.net.wifi.WifiInfo> r3 = android.net.wifi.WifiInfo.class
            java.lang.String r4 = "getSSID"
            goto Lf
        L19:
            java.lang.Class<android.net.wifi.WifiInfo> r3 = android.net.wifi.WifiInfo.class
            java.lang.String r4 = "getMacAddress"
            goto Lf
        L1e:
            java.lang.Class<java.lang.reflect.Method> r3 = java.lang.reflect.Method.class
            java.lang.String r4 = "invoke"
            goto Lf
        L23:
            java.lang.Class<java.lang.StringBuilder> r3 = java.lang.StringBuilder.class
            java.lang.String r4 = "toString"
            goto Lf
        L28:
            java.lang.Class<android.provider.Settings$Secure> r3 = android.provider.Settings.Secure.class
            java.lang.String r4 = "getString"
            goto Lf
        L2d:
            java.lang.String r4 = "getSimSerialNumber"
        L2f:
            boolean r3 = r2.a(r3, r4, r5)     // Catch: java.lang.Exception -> L40
            goto L3b
        L34:
            java.lang.String r4 = "getSubscriberId"
            goto L2f
        L37:
            java.lang.String r4 = "getDeviceId"
            goto L2f
        L3a:
            r3 = r0
        L3b:
            if (r3 == 0) goto L3f
            r3 = 1
            return r3
        L3f:
            return r0
        L40:
            r3 = move-exception
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.an.a(android.content.Context, int, java.util.Set):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r4 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set<java.lang.String> a() {
        /*
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            r2.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            java.lang.String r4 = "/proc/"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            r3.append(r4)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            java.lang.String r4 = "/maps"
            r3.append(r4)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8e
        L2c:
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            if (r3 == 0) goto L52
            java.lang.String r5 = ".so"
            boolean r5 = r3.endsWith(r5)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            if (r5 != 0) goto L42
            java.lang.String r5 = ".jar"
            boolean r5 = r3.endsWith(r5)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            if (r5 == 0) goto L2c
        L42:
            java.lang.String r5 = " "
            int r5 = r3.lastIndexOf(r5)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            int r5 = r5 + 1
            java.lang.String r3 = r3.substring(r5)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            r2.add(r3)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            goto L2c
        L52:
            r4.close()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
        L59:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r5 = "com.saurik.substrate"
            boolean r5 = r3.contains(r5)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            if (r5 == 0) goto L71
        L6d:
            r0.add(r3)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            goto L59
        L71:
            java.lang.String r5 = "XposedBridge.jar"
            boolean r5 = r3.contains(r5)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            if (r5 == 0) goto L59
            goto L6d
        L7a:
            r4.close()     // Catch: java.lang.Exception -> L7e
            goto L93
        L7e:
            r2 = move-exception
            goto L93
        L80:
            r0 = move-exception
            r1 = r4
            goto L86
        L83:
            r2 = move-exception
            goto L90
        L85:
            r0 = move-exception
        L86:
            if (r1 == 0) goto L8d
            r1.close()     // Catch: java.lang.Exception -> L8c
            goto L8d
        L8c:
            r1 = move-exception
        L8d:
            throw r0
        L8e:
            r2 = move-exception
            r4 = r1
        L90:
            if (r4 == 0) goto L93
            goto L7a
        L93:
            int r2 = r0.size()
            if (r2 <= 0) goto L9a
            return r0
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.an.a():java.util.Set");
    }

    public Set a(Set set) {
        HashSet hashSet = new HashSet();
        for (Object obj : set) {
            if (obj instanceof String) {
                if (obj != null) {
                    String str = (String) obj;
                    if (!str.startsWith("android.app.ResourcesManager#") && !str.startsWith("android.view.LayoutInflater#")) {
                    }
                }
                hashSet.add(obj);
            } else if (obj instanceof Method) {
                obj = ((Method) obj).getName();
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public boolean a(Class cls, String str, Class<?>... clsArr) {
        try {
            return a(bg.a(cls, str, clsArr));
        } catch (Exception e) {
            return false;
        }
    }

    public Set<String> b() {
        Set keySet;
        try {
            Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass(b);
            if (loadClass != null) {
                Field declaredField = loadClass.getDeclaredField("sHookedMethodCallbacks");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(loadClass);
                if (map == null || (keySet = map.keySet()) == null || keySet.size() <= 0) {
                    return null;
                }
                return a(keySet);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public JSONObject b(Set set) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (ClassLoader.getSystemClassLoader() != null && set.size() > 0) {
                int i = 1;
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, a(Class.class, "forName", set) ? 1 : 0);
                jSONObject.put("1", a(ClassLoader.class, "loadClass", set) ? 1 : 0);
                jSONObject.put("2", a(Throwable.class, "getStackTrace", set) ? 1 : 0);
                jSONObject.put("3", a(PackageManager.class, c.b("Z2V0SW5zdGFsbGVkUGFja2FnZXM=", 2), set) ? 1 : 0);
                jSONObject.put("4", a(PackageManager.class, c.b("Z2V0SW5zdGFsbGVkQXBwbGljYXRpb25z", 2), set) ? 1 : 0);
                jSONObject.put("5", a(ActivityManager.class, "getRunningServices", set) ? 1 : 0);
                if (!a(JSONObject.class, "toString", set)) {
                    i = 0;
                }
                jSONObject.put("6", i);
            }
            return jSONObject;
        } catch (Exception e) {
            return null;
        }
    }

    public Set<String> c() {
        Set keySet;
        try {
            Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass(a);
            if (loadClass != null) {
                Field declaredField = loadClass.getDeclaredField("methodCache");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(loadClass);
                if (map == null || (keySet = map.keySet()) == null || keySet.size() <= 0) {
                    return null;
                }
                return a(keySet);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, a(TelephonyManager.class, "getDeviceId", new Class[0]) ? 1 : 0);
            jSONObject.put("1", a(TelephonyManager.class, "getSubscriberId", new Class[0]) ? 1 : 0);
            jSONObject.put("2", a(TelephonyManager.class, "getSimSerialNumber", new Class[0]) ? 1 : 0);
            jSONObject.put("3", a(Location.class, "getLatitude", new Class[0]) ? 1 : 0);
            jSONObject.put("4", a(Location.class, "getLongitude", new Class[0]) ? 1 : 0);
            if (Build.VERSION.SDK_INT >= 26) {
                jSONObject.put("5", a(Build.class, "getSerial", new Class[0]) ? 1 : 0);
            } else {
                jSONObject.put("5", 0);
            }
            jSONObject.put("6", a(WifiInfo.class, "getMacAddress", new Class[0]) ? 1 : 0);
            jSONObject.put("7", a(WifiInfo.class, "getBSSID", new Class[0]) ? 1 : 0);
            jSONObject.put("8", a(WifiInfo.class, "getRssi", new Class[0]) ? 1 : 0);
            jSONObject.put("9", a(Class.class, "forName", String.class) ? 1 : 0);
            jSONObject.put("10", a(ActivityManager.class, "getRunningServices", Integer.TYPE) ? 1 : 0);
            return jSONObject;
        } catch (Exception e) {
            return null;
        }
    }

    public JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 1;
            boolean a2 = a(MediaRecorder.class, "setOutputFile", String.class);
            if (a2) {
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, a2 ? 1 : 0);
            }
            boolean a3 = a(Camera.class, "takePicture", Camera.ShutterCallback.class, Camera.PictureCallback.class, Camera.PictureCallback.class);
            if (a3) {
                jSONObject.put("1", a3 ? 1 : 0);
            }
            boolean a4 = a(MediaPlayer.class, "setDataSource", Context.class, Uri.class);
            if (a4) {
                if (!a4) {
                    i = 0;
                }
                jSONObject.put("2", i);
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public JSONObject f() {
        try {
            JSONObject jSONObject = new JSONObject();
            boolean a2 = a(Cipher.class, "doFinal", byte[].class);
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, a2 ? 1 : 0);
            boolean a3 = a(SecureRandom.class, "setSeed", byte[].class);
            jSONObject.put("1", a3 ? 1 : 0);
            if (a3) {
                a2 = true;
            }
            boolean a4 = a(MessageDigest.class, "update", byte[].class);
            jSONObject.put("2", a4 ? 1 : 0);
            if (a4) {
                a2 = true;
            }
            boolean a5 = a(MessageDigest.class, "getInstance", String.class);
            jSONObject.put("3", a5 ? 1 : 0);
            if (a5) {
                a2 = true;
            }
            boolean a6 = a(Uri.class, "parse", String.class);
            jSONObject.put("4", a6 ? 1 : 0);
            if (a6) {
                a2 = true;
            }
            boolean a7 = a(SQLiteDatabase.class, "execSQL", String.class);
            jSONObject.put("5", a7 ? 1 : 0);
            if (a7) {
                a2 = true;
            }
            boolean a8 = a(Activity.class, "finish", new Class[0]);
            jSONObject.put("6", a8 ? 1 : 0);
            if (a8 ? true : a2) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            boolean a2 = a(JSONObject.class, "toString", new Class[0]);
            if (a2) {
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, a2 ? 1 : 0);
            }
            boolean a3 = a(TextUtils.class, "isEmpty", CharSequence.class);
            if (a3) {
                jSONObject.put("1", a3 ? 1 : 0);
            }
            boolean a4 = a(JSONArray.class, "toString", new Class[0]);
            if (a4) {
                jSONObject.put("2", a4 ? 1 : 0);
            }
            boolean a5 = a(Cipher.class, "doFinal", byte[].class);
            if (a5) {
                jSONObject.put("3", a5 ? 1 : 0);
            }
            boolean a6 = a(ByteArrayOutputStream.class, "toByteArray", new Class[0]);
            if (a6) {
                jSONObject.put("4", a6 ? 1 : 0);
            }
            boolean a7 = a(FileOutputStream.class, "write", byte[].class);
            if (a7) {
                jSONObject.put("5", a7 ? 1 : 0);
            }
            boolean a8 = a(HttpURLConnection.class, "setRequestProperty", String.class, String.class);
            if (a8) {
                jSONObject.put("6", a8 ? 1 : 0);
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
