package com.ellation.crunchyroll.api.panelsinterceptor;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: PanelsInterceptor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/panelsinterceptor/PanelsInterceptor;", "Lokhttp3/Interceptor;", "watchlistStatusProvider", "Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusProvider;", "(Lcom/ellation/crunchyroll/api/panelsinterceptor/WatchlistStatusProvider;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PanelsInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final WatchlistStatusProvider watchlistStatusProvider;

    public PanelsInterceptor(WatchlistStatusProvider watchlistStatusProvider) {
        j.f(watchlistStatusProvider, "watchlistStatusProvider");
        this.watchlistStatusProvider = watchlistStatusProvider;
    }

    @Override // okhttp3.Interceptor
    @SuppressLint({"BinaryOperationInTimber"})
    public Response intercept(Interceptor.Chain chain) {
        Boolean bool;
        j.f(chain, "chain");
        Request request = chain.request();
        if (request.header("add_watchlist_status") != null) {
            Request build = request.newBuilder().removeHeader("add_watchlist_status").build();
            Response proceed = chain.proceed(build);
            ResponseBody addWatchlistStatusTo = this.watchlistStatusProvider.addWatchlistStatusTo(proceed.peekBody(Long.MAX_VALUE));
            if (addWatchlistStatusTo != null) {
                return proceed.newBuilder().body(addWatchlistStatusTo).build();
            }
            a.C0515a c0515a = a.a;
            HttpUrl url = build.url();
            ResponseBody body = proceed.body();
            if (body != null) {
                bool = Boolean.valueOf(WatchlistStatusProviderKt.getContainsPanels(body));
            } else {
                bool = null;
            }
            int code = proceed.code();
            c0515a.l("Watchlist status was not set. Request URL: " + url + ". Response contains panels: " + bool + ".Response code: " + code, new Object[0]);
            return proceed;
        }
        return chain.proceed(request);
    }
}
