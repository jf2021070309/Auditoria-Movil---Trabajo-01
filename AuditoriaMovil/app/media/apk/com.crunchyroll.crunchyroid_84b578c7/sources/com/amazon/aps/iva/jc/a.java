package com.amazon.aps.iva.jc;

import android.util.Log;
import com.amazon.aps.iva.hd.c;
import com.amazon.aps.iva.kc.e;
import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.rc.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: OkHttpStreamFetcher.java */
/* loaded from: classes.dex */
public final class a implements d<InputStream>, Callback {
    public final Call.Factory b;
    public final g c;
    public c d;
    public ResponseBody e;
    public d.a<? super InputStream> f;
    public volatile Call g;

    public a(Call.Factory factory, g gVar) {
        this.b = factory;
        this.c = gVar;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void b() {
        try {
            c cVar = this.d;
            if (cVar != null) {
                cVar.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.e;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f = null;
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void cancel() {
        Call call = this.g;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.amazon.aps.iva.lc.d
    public final void d(com.amazon.aps.iva.ec.c cVar, d.a<? super InputStream> aVar) {
        Request.Builder url = new Request.Builder().url(this.c.d());
        for (Map.Entry<String, String> entry : this.c.b.a().entrySet()) {
            url.addHeader(entry.getKey(), entry.getValue());
        }
        Request build = url.build();
        this.f = aVar;
        this.g = this.b.newCall(build);
        this.g.enqueue(this);
    }

    @Override // com.amazon.aps.iva.lc.d
    public final com.amazon.aps.iva.kc.a e() {
        return com.amazon.aps.iva.kc.a.REMOTE;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        Log.isLoggable("OkHttpFetcher", 3);
        this.f.c(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.e = response.body();
        if (response.isSuccessful()) {
            ResponseBody responseBody = this.e;
            i.l(responseBody);
            c cVar = new c(this.e.byteStream(), responseBody.contentLength());
            this.d = cVar;
            this.f.f(cVar);
            return;
        }
        this.f.c(new e(response.code(), response.message(), null));
    }
}
