package com.applovin.impl.mediation.debugger.a.b;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    private final String a;
    private final String b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(JSONObject jSONObject, k kVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        this.c = list != null ? Utils.checkClassesExistence(list) : Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}
