package com.vungle.publisher;

import javax.inject.Singleton;
import org.json.JSONObject;
@Singleton
/* loaded from: classes4.dex */
public class mc extends vs {
    @Override // com.vungle.publisher.vs, com.vungle.publisher.vt
    /* renamed from: a */
    public JSONObject b() {
        JSONObject b = super.b();
        b.put("privacyPolicyEnabled", true);
        return b;
    }
}
