package com.fyber.inneractive.sdk.config.a;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class c implements d {
    Set<Long> a = new HashSet();
    boolean b;

    public c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.a.add(Long.valueOf(optLong));
                }
            }
        }
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.a.d
    public final boolean a(e eVar) {
        if (this.a.isEmpty() || eVar == null || eVar.a == null) {
            return false;
        }
        for (Long l : this.a) {
            if (l.equals(eVar.a)) {
                return !this.b;
            }
        }
        return this.b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", "demand", this.a, Boolean.valueOf(this.b));
    }
}
