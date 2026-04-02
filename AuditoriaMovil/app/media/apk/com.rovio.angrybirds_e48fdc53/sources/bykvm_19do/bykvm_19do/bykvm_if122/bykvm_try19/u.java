package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class u {
    private static final HashSet a = new HashSet(Arrays.asList("dalvik.system.VMStack.getThreadStackTrace", "java.lang.Thread.getStackTrace"));

    public static double a() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().i();
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : map.keySet()) {
            if (a(map.get(str))) {
                jSONArray.put(str);
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                if (!a.contains(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName())) {
                    String className = stackTraceElement.getClassName();
                    if (className != null && className.startsWith("android.app")) {
                        break;
                    }
                    jSONArray.put(stackTraceElement.toString());
                } else {
                    continue;
                }
            }
        }
        return jSONArray.toString();
    }

    public static boolean a(double d) {
        return d > PangleAdapterUtils.CPM_DEFLAUT_VALUE && Math.random() <= d;
    }

    public static boolean a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar) {
        if (kVar == null || !kVar.C()) {
            return false;
        }
        return b();
    }

    public static boolean a(TTBaseAd tTBaseAd) {
        if (tTBaseAd == null || !tTBaseAd.isCustomAd()) {
            return false;
        }
        return b();
    }

    private static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (Class.forName(str) != null) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static boolean a(List<String> list, StackTraceElement[] stackTraceElementArr) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (list.get(i) != null && stackTraceElement.toString().contains(list.get(i))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static String b(StackTraceElement[] stackTraceElementArr) {
        Map<String, List<String>> h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().h();
        if (h != null && !h.isEmpty()) {
            for (String str : h.keySet()) {
                if (a(h.get(str), stackTraceElementArr)) {
                    return str;
                }
            }
        }
        return null;
    }

    private static boolean b() {
        Map<String, List<String>> h = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().h();
        if (h == null || h.size() == 0) {
            return false;
        }
        return a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().i());
    }
}
