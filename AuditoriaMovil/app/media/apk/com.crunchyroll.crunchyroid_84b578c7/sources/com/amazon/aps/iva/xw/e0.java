package com.amazon.aps.iva.xw;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
/* compiled from: OkHttpCallExtensions.kt */
/* loaded from: classes2.dex */
public final class e0 implements Callback {
    public final /* synthetic */ com.amazon.aps.iva.se0.t<Response> b;

    public e0(com.amazon.aps.iva.se0.u uVar) {
        this.b = uVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        com.amazon.aps.iva.yb0.j.f(call, "call");
        com.amazon.aps.iva.yb0.j.f(iOException, "e");
        this.b.F(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        com.amazon.aps.iva.yb0.j.f(call, "call");
        com.amazon.aps.iva.yb0.j.f(response, "response");
        boolean isSuccessful = response.isSuccessful();
        com.amazon.aps.iva.se0.t<Response> tVar = this.b;
        if (isSuccessful) {
            tVar.G(response);
        } else {
            tVar.F(new c0(response));
        }
    }
}
