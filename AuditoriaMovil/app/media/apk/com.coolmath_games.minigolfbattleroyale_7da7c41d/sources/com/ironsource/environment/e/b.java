package com.ironsource.environment.e;

import com.ironsource.environment.j;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ironsource/environment/token/TokenProvider;", "", "()V", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "mTokenKeyList", "Ljava/util/ArrayList;", "", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getToken", "environment_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class b {
    private final ArrayList<String> a = new ArrayList<>(new a().a);
    private final j b = new j();

    public final JSONObject a() {
        JSONObject a = j.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        JSONObject a2 = com.ironsource.environment.c.b.a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        return a;
    }
}
