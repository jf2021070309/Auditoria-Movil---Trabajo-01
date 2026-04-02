package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
/* compiled from: ApiExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "addTimberInterceptor", "Lcom/amazon/aps/iva/ts/c;", "etpApiConfiguration", "addCountryOverrideInterceptor", "cr-android_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ApiExtensionsKt {
    public static final OkHttpClient.Builder addCountryOverrideInterceptor(OkHttpClient.Builder builder, c cVar) {
        j.f(builder, "<this>");
        j.f(cVar, "etpApiConfiguration");
        return builder;
    }

    public static final OkHttpClient.Builder addTimberInterceptor(OkHttpClient.Builder builder) {
        j.f(builder, "<this>");
        return builder;
    }
}
