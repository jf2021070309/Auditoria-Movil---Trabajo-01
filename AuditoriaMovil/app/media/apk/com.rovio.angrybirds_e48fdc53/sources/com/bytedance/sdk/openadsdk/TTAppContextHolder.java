package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.ge;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class TTAppContextHolder {
    private static volatile Context dr;

    public static Context getContext() {
        if (dr == null) {
            setContext(null);
        }
        return dr;
    }

    public static synchronized void setContext(Context context) {
        synchronized (TTAppContextHolder.class) {
            if (dr == null) {
                if (context != null) {
                    dr = context.getApplicationContext();
                } else if (dr.dr() != null) {
                    try {
                        dr = dr.dr();
                        if (dr != null) {
                        }
                    } catch (Throwable th) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class dr {
        private static volatile Application dr;

        public static Application dr() {
            return dr;
        }

        static {
            try {
                Object ge = ge();
                dr = (Application) ge.getClass().getMethod("getApplication", new Class[0]).invoke(ge, new Object[0]);
                ge.g("MyApplication", "application get success");
            } catch (Throwable th) {
                ge.ge("MyApplication", "application get failed", th);
            }
        }

        private static Object ge() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                ge.ge("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
