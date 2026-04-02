package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.yb0.j;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
/* compiled from: EtpAuthenticator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/EtpAuthenticator;", "Lokhttp3/Authenticator;", "tokenInteractor", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "(Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EtpAuthenticator implements Authenticator {
    public static final int $stable = 8;
    private final UserTokenInteractor tokenInteractor;

    public EtpAuthenticator(UserTokenInteractor userTokenInteractor) {
        j.f(userTokenInteractor, "tokenInteractor");
        this.tokenInteractor = userTokenInteractor;
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        Object H;
        j.f(response, "response");
        Request request = response.request();
        this.tokenInteractor.invalidateJwt();
        try {
            H = this.tokenInteractor.getJwt();
        } catch (Throwable th) {
            H = x.H(th);
        }
        if (H instanceof k.a) {
            H = null;
        }
        String str = (String) H;
        if (str == null) {
            return null;
        }
        return request.newBuilder().header(HttpHeaders.AUTHORIZATION, "Bearer ".concat(str)).build();
    }
}
