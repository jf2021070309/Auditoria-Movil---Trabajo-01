package e.d.b.e.a.b;

import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes2.dex */
public class b {
    public static final Map<String, Map<String, Integer>> a;

    static {
        new HashSet(Arrays.asList("review"));
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        StringBuilder w = e.a.d.a.a.w(39, "UID: [", Process.myUid(), "]  PID: [", Process.myPid());
        w.append("] ");
        String valueOf = String.valueOf(w.toString());
        if ("PlayCoreVersion".length() != 0) {
            valueOf.concat("PlayCoreVersion");
        } else {
            new String(valueOf);
        }
    }

    public static Bundle a() {
        Map<String, Integer> map;
        Bundle bundle = new Bundle();
        synchronized (b.class) {
            Map<String, Map<String, Integer>> map2 = a;
            if (!map2.containsKey("review")) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10800);
                map2.put("review", hashMap);
            }
            map = map2.get("review");
        }
        bundle.putInt("playcore_version_code", map.get("java").intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", map.get("native").intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", map.get("unity").intValue());
        }
        return bundle;
    }
}
