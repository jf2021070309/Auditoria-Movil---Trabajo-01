package com.fyber.inneractive.sdk.config.a;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class h implements d {
    boolean a;
    private Set<String> b = new HashSet();

    public h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.b.add(optString);
                }
            }
        }
        this.a = z;
    }

    @Override // com.fyber.inneractive.sdk.config.a.d
    public final boolean a(e eVar) {
        if (this.b.isEmpty() || eVar == null || eVar.c == null) {
            return false;
        }
        for (String str : this.b) {
            if (str.equals(eVar.c.value())) {
                return !this.a;
            }
        }
        return this.a;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.b, Boolean.valueOf(this.a));
    }
}
