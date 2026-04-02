package com.amazon.aps.iva.y5;

import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
/* compiled from: OkHttpDataSource.java */
/* loaded from: classes.dex */
public final class a implements Callback {
    public final /* synthetic */ SettableFuture b;

    public a(SettableFuture settableFuture) {
        this.b = settableFuture;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.b.setException(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.b.set(response);
    }
}
