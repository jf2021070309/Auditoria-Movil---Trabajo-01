package com.facebook.ads.internal.q.a;

import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import com.facebook.internal.ServerProtocol;
import java.util.Map;
/* loaded from: classes2.dex */
public class x {
    private static final String a = x.class.getSimpleName();

    public static boolean a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static boolean a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            Log.v(a, "Invalid Window info in window interactive check, assuming is not a Lockscreen.");
            return false;
        }
        String str = map.get("wfdkg");
        String str2 = map.get("wfswl");
        String str3 = map.get("kgr");
        return str != null && str.equals("1") && str2 != null && str2.equals("1") && str3 != null && str3.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
    }

    public static boolean b(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            Log.v(a, "Invalid Window info in window interactive check, assuming not obstructed by Keyguard.");
            return false;
        }
        String str = map.get("wfdkg");
        String str2 = map.get("wfswl");
        if (str == null || !str.equals("1")) {
            if (str2 == null || !str2.equals("1")) {
                String str3 = map.get("kgr");
                return str3 != null && str3.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            }
            return false;
        }
        return false;
    }
}
