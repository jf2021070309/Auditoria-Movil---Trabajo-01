package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.jf0.b0;
import com.amazon.aps.iva.kf0.a;
import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RetrofitFactory.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/RetrofitFactoryImpl;", "Lcom/ellation/crunchyroll/api/etp/RetrofitFactory;", "", "baseUrl", "", "Lcom/ellation/crunchyroll/api/etp/TypeAdapter;", "typeAdapters", "Lcom/amazon/aps/iva/jf0/b0$b;", "prepareBuilder", "(Ljava/lang/String;[Lcom/ellation/crunchyroll/api/etp/TypeAdapter;)Lcom/amazon/aps/iva/jf0/b0$b;", "Lcom/amazon/aps/iva/jf0/b0;", "buildEtpRetrofit", "([Lcom/ellation/crunchyroll/api/etp/TypeAdapter;)Lcom/amazon/aps/iva/jf0/b0;", "Lcom/amazon/aps/iva/ts/c;", "configuration", "Lcom/amazon/aps/iva/ts/c;", "getConfiguration", "()Lcom/amazon/aps/iva/ts/c;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "<init>", "(Lcom/amazon/aps/iva/ts/c;Lokhttp3/OkHttpClient;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RetrofitFactoryImpl implements RetrofitFactory {
    private final c configuration;
    private final OkHttpClient okHttpClient;

    public RetrofitFactoryImpl(c cVar, OkHttpClient okHttpClient) {
        j.f(cVar, "configuration");
        j.f(okHttpClient, "okHttpClient");
        this.configuration = cVar;
        this.okHttpClient = okHttpClient;
    }

    private final b0.b prepareBuilder(String str, TypeAdapter[] typeAdapterArr) {
        b0.b bVar = new b0.b();
        bVar.b(str);
        bVar.d(this.okHttpClient);
        GsonBuilder gsonBuilder = new GsonBuilder();
        for (TypeAdapter typeAdapter : typeAdapterArr) {
            typeAdapter.registerAdapter(gsonBuilder);
        }
        bVar.a(a.c(gsonBuilder.create()));
        return bVar;
    }

    @Override // com.ellation.crunchyroll.api.etp.RetrofitFactory
    public b0 buildEtpRetrofit(TypeAdapter... typeAdapterArr) {
        j.f(typeAdapterArr, "typeAdapters");
        return prepareBuilder(this.configuration.b(), typeAdapterArr).c();
    }

    public final c getConfiguration() {
        return this.configuration;
    }

    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }
}
