package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.yb0.j;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: EtpAuthInterceptor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthInterceptor;", "Lokhttp3/Interceptor;", "tokenProvider", "Lcom/ellation/crunchyroll/api/etp/auth/JwtProvider;", "(Lcom/ellation/crunchyroll/api/etp/auth/JwtProvider;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpAuthInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final JwtProvider tokenProvider;

    public EtpAuthInterceptor(JwtProvider jwtProvider) {
        j.f(jwtProvider, "tokenProvider");
        this.tokenProvider = jwtProvider;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        Request request = chain.request();
        String jwt = this.tokenProvider.getJwt();
        Request.Builder newBuilder = request.newBuilder();
        return chain.proceed(newBuilder.header(HttpHeaders.AUTHORIZATION, "Bearer " + jwt).build());
    }
}
