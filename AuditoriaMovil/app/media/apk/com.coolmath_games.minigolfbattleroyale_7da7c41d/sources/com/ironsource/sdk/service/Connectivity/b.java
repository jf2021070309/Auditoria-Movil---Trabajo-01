package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.os.Build;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class b implements d {
    public c a;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(JSONObject jSONObject, Context context) {
        c aVar;
        if (jSONObject.optInt("connectivityStrategy") == 1) {
            aVar = new a(this);
        } else {
            aVar = (Build.VERSION.SDK_INT < 23 || !com.ironsource.environment.c.b(context, "android.permission.ACCESS_NETWORK_STATE")) ? new a(this) : new e(this);
        }
        this.a = aVar;
        String simpleName = b.class.getSimpleName();
        Logger.i(simpleName, "created ConnectivityAdapter with strategy " + this.a.getClass().getSimpleName());
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a() {
    }

    public final void a(Context context) {
        this.a.a(context);
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a(String str) {
    }

    @Override // com.ironsource.sdk.service.Connectivity.d
    public void a(String str, JSONObject jSONObject) {
    }

    public final void b(Context context) {
        this.a.b(context);
    }
}
