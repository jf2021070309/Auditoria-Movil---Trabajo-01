package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.reflect.Proxy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ag {
    private static final String a = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ=";
    private final String b = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2Vy";
    private final String c = "YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2VyTmF0aXZl";
    private final String d = "YW5kcm9pZC5hcHAuQWN0aXZpdHlUYXNrTWFuYWdlcg==";
    private final String e = "SUFjdGl2aXR5VGFza01hbmFnZXJTaW5nbGV0b24=";

    private void a(JSONObject jSONObject, int i) {
        Object a2;
        try {
            Object a3 = Build.VERSION.SDK_INT >= 26 ? dg.a(new String(c.a("YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2Vy".getBytes(), 2)), "IActivityManagerSingleton") : dg.a(new String(c.a("YW5kcm9pZC5hcHAuQWN0aXZpdHlNYW5hZ2VyTmF0aXZl".getBytes(), 2)), "gDefault");
            if (a3 == null || (a2 = dg.a("android.util.Singleton", a3, MonitorConstants.CONNECT_TYPE_GET, new Object[0])) == null) {
                return;
            }
            a(a2, jSONObject, i);
        } catch (Exception e) {
        }
    }

    private boolean a(Object obj, JSONObject jSONObject, int i) {
        String str;
        if (jSONObject != null) {
            try {
                boolean isProxyClass = Proxy.isProxyClass(obj.getClass());
                String name = obj.getClass().getName();
                int i2 = 1;
                if (!isProxyClass) {
                    if (i == 3 && !name.contains("Instrumentation")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        String sb2 = sb.toString();
                        if (!isProxyClass) {
                            i2 = 0;
                        }
                        jSONObject.put(sb2, i2);
                        str = i + "-c";
                    }
                    return isProxyClass;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i);
                String sb4 = sb3.toString();
                if (!isProxyClass) {
                    i2 = 0;
                }
                jSONObject.put(sb4, i2);
                str = i + "-c";
                jSONObject.put(str, name);
                return isProxyClass;
            } catch (Exception e) {
            }
        }
        return false;
    }

    private void b(JSONObject jSONObject, int i) {
        try {
            Object a2 = dg.a(new String(c.a(a.getBytes(), 2)), (Object) null, "getPackageManager", new Object[0]);
            if (a2 != null) {
                a(a2, jSONObject, i);
            }
        } catch (Exception e) {
        }
    }

    private void c(JSONObject jSONObject, int i) {
        Object a2;
        Object a3;
        try {
            if (Build.VERSION.SDK_INT < 29 || (a2 = dg.a(new String(c.a("YW5kcm9pZC5hcHAuQWN0aXZpdHlUYXNrTWFuYWdlcg==".getBytes(), 2)), new String(c.a("SUFjdGl2aXR5VGFza01hbmFnZXJTaW5nbGV0b24=".getBytes(), 2)))) == null || (a3 = dg.a("android.util.Singleton", a2, MonitorConstants.CONNECT_TYPE_GET, new Object[0])) == null) {
                return;
            }
            a(a3, jSONObject, i);
        } catch (Exception e) {
        }
    }

    private void d(JSONObject jSONObject, int i) {
        Object a2;
        try {
            Object a3 = dg.a(new String(c.a(a.getBytes(), 2)), (Object) null, "currentActivityThread", new Object[0]);
            if (a3 == null || (a2 = dg.a(a3.getClass(), a3, "mInstrumentation")) == null) {
                return;
            }
            a(a2, jSONObject, i);
        } catch (Exception e) {
        }
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            b(jSONObject, 0);
            a(jSONObject, 1);
            c(jSONObject, 2);
            d(jSONObject, 3);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public JSONObject a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            PackageManager packageManager = context.getPackageManager();
            Object a2 = dg.a(packageManager.getClass(), packageManager, "mPM");
            if (a2 != null) {
                if (a(a2, jSONObject, 0)) {
                    return jSONObject;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
