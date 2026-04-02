package com.amazon.aps.iva.ms;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonObject;
import java.util.ArrayList;
/* compiled from: AppConfigResolver.kt */
/* loaded from: classes2.dex */
public final class e {
    public final JsonObject a;
    public final JsonObject b;
    public ArrayList c;
    public boolean d;
    public JsonObject e;

    public e(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3) {
        j.f(jsonObject, "configOverride");
        j.f(jsonObject2, "localConfig");
        this.a = jsonObject;
        this.b = jsonObject2;
        this.c = new ArrayList();
        this.e = new JsonObject();
        boolean z = false;
        if (jsonObject3 != null) {
            d.a(jsonObject2, jsonObject3, true);
            d.a(jsonObject2, jsonObject, false);
            this.e = jsonObject2;
            z = true;
        } else {
            d.a(jsonObject2, jsonObject, false);
            this.e = jsonObject2;
        }
        this.d = z;
    }

    public final void a() {
        for (com.amazon.aps.iva.xb0.a aVar : this.c) {
            aVar.invoke();
        }
        this.c = new ArrayList();
    }
}
