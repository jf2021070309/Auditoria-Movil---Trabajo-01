package com.kwad.sdk.core.network;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class r {
    private static volatile r apS;
    private final Map<String, String> aoz = new ConcurrentHashMap();

    private r() {
    }

    public static r Bi() {
        if (apS == null) {
            synchronized (r.class) {
                if (apS == null) {
                    apS = new r();
                }
            }
        }
        return apS;
    }

    public final void K(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.aoz.put(str, str2);
    }

    public final String cZ(String str) {
        return this.aoz.get(str);
    }
}
