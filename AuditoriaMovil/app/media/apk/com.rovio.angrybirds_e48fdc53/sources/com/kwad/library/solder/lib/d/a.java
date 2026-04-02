package com.kwad.library.solder.lib.d;

import android.os.Build;
import android.os.Process;
import com.kwad.sdk.utils.s;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {
    private static String agT = null;
    private static String agU = null;
    private static final Map<String, String> agV;

    static {
        HashMap hashMap = new HashMap();
        agV = hashMap;
        hashMap.put("mips", "mips");
        hashMap.put("mips64", "mips64");
        hashMap.put("x86", "x86");
        hashMap.put("x86_64", "x86_64");
        hashMap.put("arm64", "arm64-v8a");
    }

    private static boolean is64Bit() {
        if (Build.VERSION.SDK_INT >= 23) {
            return Process.is64Bit();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Boolean bool = null;
            try {
                bool = (Boolean) s.f(s.a("dalvik.system.VMRuntime", "getRuntime", new Object[0]), "is64Bit", new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return false;
    }

    public static String wN() {
        return is64Bit() ? "arm64-v8a" : "armeabi-v7a";
    }
}
