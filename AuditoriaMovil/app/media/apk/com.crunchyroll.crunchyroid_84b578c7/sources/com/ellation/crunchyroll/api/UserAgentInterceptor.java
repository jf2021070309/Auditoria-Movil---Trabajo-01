package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.j;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: UserAgentInterceptor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/UserAgentInterceptor;", "Lokhttp3/Interceptor;", "versionName", "", "osReleaseVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserAgentInterceptor implements Interceptor {
    public static final int $stable = 0;
    private final String osReleaseVersion;
    private final String versionName;

    public UserAgentInterceptor(String str, String str2) {
        j.f(str, "versionName");
        j.f(str2, "osReleaseVersion");
        this.versionName = str;
        this.osReleaseVersion = str2;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        Request request = chain.request();
        String header = request.header(HttpHeaders.USER_AGENT);
        Request.Builder newBuilder = request.newBuilder();
        StringBuilder b = a.b("Crunchyroll/", this.versionName, " Android/", this.osReleaseVersion, " ");
        b.append(header);
        return chain.proceed(newBuilder.header(HttpHeaders.USER_AGENT, b.toString()).build());
    }
}
