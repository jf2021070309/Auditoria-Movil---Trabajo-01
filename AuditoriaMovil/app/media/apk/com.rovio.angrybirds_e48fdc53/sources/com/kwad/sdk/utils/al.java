package com.kwad.sdk.utils;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public final class al {
    private static Map<String, Integer> aJb;
    private static Set<String> aJc;
    private static Method aJd;

    static {
        HashSet hashSet = new HashSet();
        aJc = hashSet;
        hashSet.add("android.permission.REQUEST_INSTALL_PACKAGES");
        aJc.add("android.permission.WRITE_SETTINGS");
        aJc.add("android.permission.SYSTEM_ALERT_WINDOW");
    }

    public static int ao(Context context, String str) {
        int ap;
        if (aJb == null) {
            h(aj.cr(context));
        }
        if (!aJc.contains(str) || (ap = ap(context, str)) == -2) {
            int aq = aq(context, str);
            if (aq != -2) {
                return aq;
            }
            try {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            } catch (Throwable th) {
                return aq;
            }
        }
        return ap;
    }

    private static int ap(Context context, String str) {
        boolean z;
        int hashCode = str.hashCode();
        if (hashCode == -2078357533) {
            if (str.equals("android.permission.WRITE_SETTINGS")) {
                z = true;
            }
            z = true;
        } else if (hashCode != -1561629405) {
            if (hashCode == 1777263169 && str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                z = false;
            }
            z = true;
        } else {
            if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                z = true;
            }
            z = true;
        }
        if (!z) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (aj.cq(context)) {
                    return 0;
                }
            }
            return -2;
        } else if (z) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    if (Settings.System.canWrite(context)) {
                        return 0;
                    }
                } catch (Throwable th) {
                }
            }
            return -2;
        } else {
            if (z && Build.VERSION.SDK_INT >= 23) {
                try {
                    if (Settings.canDrawOverlays(context)) {
                        return 0;
                    }
                } catch (Throwable th2) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th2);
                }
            }
            return -2;
        }
        return -1;
    }

    private static int aq(Context context, String str) {
        if (aJb == null || str == null) {
            return -2;
        }
        if (Build.VERSION.SDK_INT < 19) {
            return 0;
        }
        if (aJb.containsKey(str)) {
            try {
                Integer num = aJb.get(str);
                if (num == null) {
                    return -2;
                }
                if (aJd == null) {
                    Method declaredMethod = AppOpsManager.class.getDeclaredMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class);
                    aJd = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) aJd.invoke((AppOpsManager) context.getSystemService("appops"), num, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0 ? 0 : -1;
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
                return 0;
            }
        }
        return -2;
    }

    public static boolean cs(Context context) {
        int i;
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled");
        } catch (Throwable th) {
            i = 0;
        }
        return i == 1;
    }

    private static String fE(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf < 0) {
            return str;
        }
        try {
            return str.substring(lastIndexOf + 1);
        } catch (Exception e) {
            return str;
        }
    }

    private static void h(String[] strArr) {
        if (Build.VERSION.SDK_INT < 19 || strArr == null) {
            return;
        }
        aJb = new HashMap();
        for (String str : strArr) {
            try {
                int intValue = ((Integer) s.c(AppOpsManager.class, "OP_" + fE(str))).intValue();
                if (intValue >= 0) {
                    aJb.put(str, Integer.valueOf(intValue));
                }
            } catch (Throwable th) {
            }
        }
    }
}
