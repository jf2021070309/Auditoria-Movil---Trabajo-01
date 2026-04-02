package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
/* compiled from: TimberLoggingInterceptor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/TimberLoggingInterceptor;", "Lokhttp3/Interceptor;", "()V", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimberLoggingInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final HttpLoggingInterceptor httpLoggingInterceptor;

    public TimberLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: com.ellation.crunchyroll.api.TimberLoggingInterceptor$httpLoggingInterceptor$1
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String str) {
                j.f(str, "message");
                a.C0515a c0515a = a.a;
                c0515a.o("OkHttp");
                c0515a.a(str, new Object[0]);
            }
        });
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        this.httpLoggingInterceptor = httpLoggingInterceptor;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        return this.httpLoggingInterceptor.intercept(chain);
    }
}
