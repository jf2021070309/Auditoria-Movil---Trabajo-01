package com.ironsource.sdk.b;

import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class d {
    int b = 4;
    int c = 4;
    HashMap<String, Boolean> a = new HashMap<String, Boolean>() { // from class: com.ironsource.sdk.b.d.1
        {
            put("isVisible", Boolean.valueOf(d.this.b == 0));
            put("isWindowVisible", Boolean.valueOf(d.this.c == 0));
            put("isShown", Boolean.FALSE);
            put("isViewVisible", Boolean.FALSE);
        }
    };

    public final JSONObject a() {
        return new JSONObject(this.a);
    }
}
