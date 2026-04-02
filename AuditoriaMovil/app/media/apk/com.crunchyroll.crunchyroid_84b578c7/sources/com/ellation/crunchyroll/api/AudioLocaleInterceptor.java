package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: AudioLocaleInterceptor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/api/AudioLocaleInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lkotlin/Function0;", "", "getPreferredAudioLanguage", "Lcom/amazon/aps/iva/xb0/a;", "<init>", "(Lcom/amazon/aps/iva/xb0/a;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AudioLocaleInterceptor implements Interceptor {
    public static final int $stable = 0;
    private final a<String> getPreferredAudioLanguage;

    public AudioLocaleInterceptor(a<String> aVar) {
        j.f(aVar, "getPreferredAudioLanguage");
        this.getPreferredAudioLanguage = aVar;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        Request request = chain.request();
        String invoke = this.getPreferredAudioLanguage.invoke();
        if (invoke != null) {
            return chain.proceed(request.newBuilder().url(request.url().newBuilder().setEncodedQueryParameter("preferred_audio_language", invoke).build()).build());
        }
        return chain.proceed(request);
    }
}
