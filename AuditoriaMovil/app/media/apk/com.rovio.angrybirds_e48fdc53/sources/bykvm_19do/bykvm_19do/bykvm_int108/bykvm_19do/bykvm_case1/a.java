package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private static String a;
    private static Class<?> b;
    private static Field c;
    private static Field d;
    private static boolean e;

    private static long a(int i) {
        if (i < 0) {
            return 0L;
        }
        return i * 1024;
    }

    public static ActivityManager.ProcessErrorStateInfo a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
        if (activityManager == null) {
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            SystemClock.sleep(200L);
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2) {
                        return processErrorStateInfo;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static Class<?> a(Context context) {
        if (b == null && !e) {
            try {
                b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException e2) {
            }
            e = true;
        }
        return b;
    }

    private static String a() {
        BufferedReader bufferedReader;
        String str = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read <= 0) {
                        break;
                    }
                    sb.append((char) read);
                }
                str = sb.toString();
            } catch (Throwable th) {
            }
        } catch (Throwable th2) {
            bufferedReader = null;
        }
        f.a(bufferedReader);
        return str;
    }

    public static void a(Context context, JSONObject jSONObject) {
        try {
            a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
            if (activityManager != null) {
                b(jSONObject, activityManager);
            }
            a(jSONObject, activityManager);
        } catch (Throwable th) {
        }
    }

    private static void a(JSONObject jSONObject) throws JSONException {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        jSONObject2.put("totalPrivateClean", b.a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", b.b(memoryInfo));
        jSONObject2.put("totalSharedDirty", a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", a(b.c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    private static void a(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        jSONObject2.put("max_memory", runtime.maxMemory());
        jSONObject2.put("free_memory", runtime.freeMemory());
        jSONObject2.put("total_memory", runtime.totalMemory());
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    public static String b(Context context) {
        String str = a;
        if (TextUtils.isEmpty(str)) {
            try {
                int myPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
                if (activityManager != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        if (runningAppProcessInfo.pid == myPid) {
                            String str2 = runningAppProcessInfo.processName;
                            a = str2;
                            return str2;
                        }
                    }
                }
            } catch (Throwable th) {
                j.b(th);
            }
            String a2 = a();
            a = a2;
            return a2 == null ? "" : a2;
        }
        return str;
    }

    private static void b(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", g.a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    public static int c(Context context) {
        Class<?> a2 = a(context);
        if (d == null && a2 != null) {
            try {
                d = a2.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException e2) {
            }
        }
        Field field = d;
        if (field != null) {
            try {
                return ((Integer) field.get(null)).intValue();
            } catch (Throwable th) {
            }
        }
        return -1;
    }

    public static String d(Context context) {
        Class<?> a2 = a(context);
        if (c == null && a2 != null) {
            try {
                c = a2.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException e2) {
            }
        }
        Field field = c;
        if (field != null) {
            try {
                return (String) field.get(null);
            } catch (Throwable th) {
            }
        }
        return "";
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0061 -> B:4:0x0004). Please submit an issue!!! */
    public static boolean e(Context context) {
        ComponentName componentName;
        if (context != null) {
            String packageName = context.getPackageName();
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
                if (activityManager != null) {
                    if (Build.VERSION.SDK_INT < 21) {
                        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                        if (runningTasks != null && !runningTasks.isEmpty() && (componentName = runningTasks.get(0).topActivity) != null && packageName.equals(componentName.getPackageName())) {
                            return true;
                        }
                    } else {
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                if (runningAppProcessInfo.importance == 100) {
                                    return packageName.equals(runningAppProcessInfo.pkgList[0]);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        return false;
    }

    public static boolean g(Context context) {
        String b2 = b(context);
        if (b2 == null || !b2.contains(":")) {
            return (b2 != null && b2.equals(context.getPackageName())) || (b2 != null && b2.equals(context.getApplicationInfo().processName));
        }
        return false;
    }
}
