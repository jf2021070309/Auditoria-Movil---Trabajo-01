package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class g {
    final Map<String, String> a = new HashMap();

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    public final boolean b(String str) {
        try {
            if (this.a.containsKey(str)) {
                return Boolean.parseBoolean(this.a.get(str));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final int c(String str) {
        int i;
        if (this.a.containsKey(str)) {
            i = Integer.parseInt(this.a.get(str));
            return Math.max(i, -1);
        }
        i = -1;
        return Math.max(i, -1);
    }

    public final long d(String str) {
        try {
            if (this.a.containsKey(str)) {
                return Long.parseLong(this.a.get(str));
            }
            return 3L;
        } catch (Exception unused) {
            return 3L;
        }
    }
}
