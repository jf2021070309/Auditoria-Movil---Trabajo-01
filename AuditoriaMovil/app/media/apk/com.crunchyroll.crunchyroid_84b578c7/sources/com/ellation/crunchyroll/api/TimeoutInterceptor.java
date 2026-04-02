package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: TimeoutInterceptor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/api/TimeoutInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeoutInterceptor implements Interceptor {
    public static final int $stable = 0;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        int readTimeoutMillis;
        j.f(chain, "chain");
        String header = chain.request().header(TimeoutInterceptorKt.READ_TIMEOUT);
        if (header != null) {
            readTimeoutMillis = Integer.parseInt(header);
        } else {
            readTimeoutMillis = chain.readTimeoutMillis();
        }
        return chain.withReadTimeout(readTimeoutMillis, TimeUnit.MILLISECONDS).proceed(chain.request().newBuilder().removeHeader(TimeoutInterceptorKt.READ_TIMEOUT).build());
    }
}
