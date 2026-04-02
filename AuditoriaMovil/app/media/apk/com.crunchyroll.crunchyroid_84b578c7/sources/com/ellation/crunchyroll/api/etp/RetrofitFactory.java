package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.jf0.b0;
import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.DateTypeAdapter;
import java.util.Date;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
/* compiled from: RetrofitFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ%\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/RetrofitFactory;", "", "", "Lcom/ellation/crunchyroll/api/etp/TypeAdapter;", "typeAdapters", "Lcom/amazon/aps/iva/jf0/b0;", "buildEtpRetrofit", "([Lcom/ellation/crunchyroll/api/etp/TypeAdapter;)Lcom/amazon/aps/iva/jf0/b0;", "Companion", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface RetrofitFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: RetrofitFactory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/RetrofitFactory$Companion;", "", "Lcom/amazon/aps/iva/ts/c;", "configuration", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/ellation/crunchyroll/api/etp/RetrofitFactory;", "create", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RetrofitFactory create(c cVar, OkHttpClient okHttpClient) {
            j.f(cVar, "configuration");
            j.f(okHttpClient, "okHttpClient");
            return new RetrofitFactoryImpl(cVar, okHttpClient);
        }
    }

    /* compiled from: RetrofitFactory.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ b0 buildEtpRetrofit$default(RetrofitFactory retrofitFactory, TypeAdapter[] typeAdapterArr, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    typeAdapterArr = new TypeAdapter[]{new TypeAdapter(Date.class, new DateTypeAdapter(null, null, null, 7, null))};
                }
                return retrofitFactory.buildEtpRetrofit(typeAdapterArr);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildEtpRetrofit");
        }
    }

    b0 buildEtpRetrofit(TypeAdapter... typeAdapterArr);
}
