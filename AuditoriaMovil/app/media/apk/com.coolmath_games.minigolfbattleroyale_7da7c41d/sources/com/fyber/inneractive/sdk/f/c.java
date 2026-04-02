package com.fyber.inneractive.sdk.f;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c {
    private static final c b = new c();
    final Map<String, f> a = new HashMap();
    private final f c = new e();

    private c() {
    }

    public static c a() {
        return b;
    }

    public final f a(String str) {
        try {
            if (str == null) {
                return this.c;
            }
            f fVar = this.a.get(str);
            if (fVar == null) {
                d dVar = new d();
                this.a.put(str, dVar);
                return dVar;
            }
            return fVar;
        } catch (Exception unused) {
            return this.c;
        }
    }
}
