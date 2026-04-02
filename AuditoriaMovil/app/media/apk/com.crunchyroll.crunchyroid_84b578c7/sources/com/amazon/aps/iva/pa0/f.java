package com.amazon.aps.iva.pa0;

import com.amazon.aps.iva.oa0.s0;
import java.util.HashMap;
import java.util.Map;
/* compiled from: SLSamsungReferrer.java */
/* loaded from: classes4.dex */
public final class f implements d {
    public final /* synthetic */ d a;

    public f(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // com.amazon.aps.iva.pa0.d
    public final void a(HashMap hashMap) {
        d dVar = this.a;
        if (hashMap == null) {
            dVar.a(null);
            return;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put("samsung_" + ((String) entry.getKey()), entry.getValue());
        }
        dVar.a(hashMap2);
    }
}
