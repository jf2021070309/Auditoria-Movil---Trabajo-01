package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.yb0.j;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: BasicAuthInterceptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/BasicAuthInterceptor;", "Lokhttp3/Interceptor;", "credentials", "Lcom/ellation/crunchyroll/api/etp/auth/BasicAuthCredentials;", "(Lcom/ellation/crunchyroll/api/etp/auth/BasicAuthCredentials;)V", "authCredentials", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BasicAuthInterceptor implements Interceptor {
    public static final int $stable = 0;
    private final String authCredentials;

    public BasicAuthInterceptor(BasicAuthCredentials basicAuthCredentials) {
        j.f(basicAuthCredentials, "credentials");
        this.authCredentials = Credentials.basic$default(basicAuthCredentials.getClientId(), basicAuthCredentials.getClientSecret(), null, 4, null);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        return chain.proceed(chain.request().newBuilder().addHeader(HttpHeaders.AUTHORIZATION, this.authCredentials).build());
    }
}
