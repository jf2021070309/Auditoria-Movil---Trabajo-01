package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import e.a.d.a.a;
import java.util.HashMap;
@KeepForSdk
/* loaded from: classes.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            a.L(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                a.L(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
