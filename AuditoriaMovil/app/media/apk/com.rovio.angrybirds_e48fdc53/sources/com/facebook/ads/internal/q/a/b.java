package com.facebook.ads.internal.q.a;

import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
/* loaded from: classes2.dex */
public class b {
    private static boolean a = false;
    private static boolean b = false;

    public static synchronized String a(String str) {
        String property;
        synchronized (b.class) {
            property = !a() ? null : System.getProperty("fb.e2e." + str);
        }
        return property;
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (b.class) {
            if (!b) {
                a = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(System.getProperty("fb.running_e2e"));
                b = true;
            }
            z = a;
        }
        return z;
    }

    public static synchronized boolean b(String str) {
        boolean z;
        synchronized (b.class) {
            z = !TextUtils.isEmpty(a(str));
        }
        return z;
    }
}
