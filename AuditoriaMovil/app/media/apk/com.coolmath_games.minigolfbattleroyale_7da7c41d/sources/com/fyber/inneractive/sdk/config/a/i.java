package com.fyber.inneractive.sdk.config.a;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class i implements d {
    boolean a;
    private Set<Long> b = new HashSet();

    public i(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.b.add(Long.valueOf(optLong));
                }
            }
        }
        this.a = z;
    }

    @Override // com.fyber.inneractive.sdk.config.a.d
    public final boolean a(e eVar) {
        if (this.b.isEmpty() || eVar == null || eVar.b == null) {
            return false;
        }
        for (Long l : this.b) {
            if (l.equals(eVar.b)) {
                return !this.a;
            }
        }
        return this.a;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.b, Boolean.valueOf(this.a));
    }
}
