package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.ak.b;
import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.ApiExtensionsKt;
import com.ellation.crunchyroll.api.TryCatchInterceptor;
import com.ellation.crunchyroll.api.etp.auth.BasicAuthCredentials;
import com.ellation.crunchyroll.api.etp.auth.BasicAuthInterceptor;
import com.google.android.gms.cast.MediaError;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
/* compiled from: OkHttpClientFactory.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0019\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b+\u0010,J'\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u0002*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J!\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/ellation/crunchyroll/api/etp/OkHttpClientFactory;", "", "Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Interceptor;", "interceptors", "addInterceptors", "(Lokhttp3/OkHttpClient$Builder;[Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "addEventListenerFactory", "newBasicAuthClientBuilder", "([Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "newClientBuilder", "Ljava/io/File;", "cacheDirectory", "Ljava/io/File;", "Lcom/amazon/aps/iva/ts/c;", "etpApiConfiguration", "Lcom/amazon/aps/iva/ts/c;", "dataDogInterceptor", "Lokhttp3/Interceptor;", "getDataDogInterceptor", "()Lokhttp3/Interceptor;", "setDataDogInterceptor", "(Lokhttp3/Interceptor;)V", "dataDogEventListenerFactory", "Lokhttp3/EventListener$Factory;", "getDataDogEventListenerFactory", "()Lokhttp3/EventListener$Factory;", "setDataDogEventListenerFactory", "(Lokhttp3/EventListener$Factory;)V", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "Lokhttp3/Dispatcher;", "getDispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/Cache;", "getCache", "()Lokhttp3/Cache;", "cache", "<init>", "(Ljava/io/File;Lcom/amazon/aps/iva/ts/c;)V", "Companion", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class OkHttpClientFactory {
    private final File cacheDirectory;
    private final OkHttpClient client;
    private EventListener.Factory dataDogEventListenerFactory;
    private Interceptor dataDogInterceptor;
    private final c etpApiConfiguration;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OkHttpClientFactory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/OkHttpClientFactory$Companion;", "", "Ljava/io/File;", "cacheDirectory", "Lcom/amazon/aps/iva/ts/c;", "etpApiConfiguration", "Lcom/ellation/crunchyroll/api/etp/OkHttpClientFactory;", "create", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final OkHttpClientFactory create(File file, c cVar) {
            j.f(file, "cacheDirectory");
            j.f(cVar, "etpApiConfiguration");
            return new OkHttpClientFactory(file, cVar, null);
        }
    }

    public /* synthetic */ OkHttpClientFactory(File file, c cVar, e eVar) {
        this(file, cVar);
    }

    private final OkHttpClient.Builder addEventListenerFactory(OkHttpClient.Builder builder, EventListener.Factory factory) {
        if (factory != null) {
            builder.eventListenerFactory(factory);
        }
        return builder;
    }

    private final OkHttpClient.Builder addInterceptors(OkHttpClient.Builder builder, Interceptor... interceptorArr) {
        for (Interceptor interceptor : interceptorArr) {
            builder.addInterceptor(new TryCatchInterceptor(interceptor));
        }
        Interceptor interceptor2 = this.dataDogInterceptor;
        if (interceptor2 != null) {
            builder.addInterceptor(interceptor2);
        }
        ApiExtensionsKt.addTimberInterceptor(builder);
        return builder;
    }

    private final Cache getCache() {
        return new Cache(new File(this.cacheDirectory, "response_cache"), 52428800L);
    }

    private final Dispatcher getDispatcher() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
        return dispatcher;
    }

    public final EventListener.Factory getDataDogEventListenerFactory() {
        return this.dataDogEventListenerFactory;
    }

    public final Interceptor getDataDogInterceptor() {
        return this.dataDogInterceptor;
    }

    public final OkHttpClient.Builder newBasicAuthClientBuilder(Interceptor... interceptorArr) {
        j.f(interceptorArr, "interceptors");
        OkHttpClient.Builder addCountryOverrideInterceptor = ApiExtensionsKt.addCountryOverrideInterceptor(this.client.newBuilder(), this.etpApiConfiguration);
        b bVar = new b(2);
        bVar.a(new BasicAuthInterceptor(new BasicAuthCredentials() { // from class: com.ellation.crunchyroll.api.etp.OkHttpClientFactory$newBasicAuthClientBuilder$1
            @Override // com.ellation.crunchyroll.api.etp.auth.BasicAuthCredentials
            public String getClientId() {
                c cVar;
                cVar = OkHttpClientFactory.this.etpApiConfiguration;
                return cVar.getClientId();
            }

            @Override // com.ellation.crunchyroll.api.etp.auth.BasicAuthCredentials
            public String getClientSecret() {
                c cVar;
                cVar = OkHttpClientFactory.this.etpApiConfiguration;
                return cVar.getClientSecret();
            }
        }));
        bVar.b(interceptorArr);
        return addEventListenerFactory(addInterceptors(addCountryOverrideInterceptor, (Interceptor[]) bVar.d(new Interceptor[bVar.c()])), this.dataDogEventListenerFactory);
    }

    public final OkHttpClient.Builder newClientBuilder(Interceptor... interceptorArr) {
        j.f(interceptorArr, "interceptors");
        return addEventListenerFactory(addInterceptors(this.client.newBuilder(), (Interceptor[]) Arrays.copyOf(interceptorArr, interceptorArr.length)), this.dataDogEventListenerFactory);
    }

    public final void setDataDogEventListenerFactory(EventListener.Factory factory) {
        this.dataDogEventListenerFactory = factory;
    }

    public final void setDataDogInterceptor(Interceptor interceptor) {
        this.dataDogInterceptor = interceptor;
    }

    private OkHttpClientFactory(File file, c cVar) {
        this.cacheDirectory = file;
        this.etpApiConfiguration = cVar;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.client = builder.readTimeout(8000L, timeUnit).writeTimeout(12000L, timeUnit).connectTimeout(8000L, timeUnit).connectionPool(new ConnectionPool(20, 5L, TimeUnit.MINUTES)).dispatcher(getDispatcher()).cache(getCache()).build();
    }
}
