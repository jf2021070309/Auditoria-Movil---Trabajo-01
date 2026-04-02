package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: AccountIdInterceptor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/api/AccountIdInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/HttpUrl$Builder;", "", FirebaseAnalytics.Param.INDEX, "", "accountId", "Lcom/amazon/aps/iva/kb0/q;", "setAccountIdPathSegment", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lkotlin/Function0;", "Lcom/ellation/crunchyroll/api/etp/account/model/AccountApiModel;", "getAccountApiModel", "Lcom/amazon/aps/iva/xb0/a;", "<init>", "(Lcom/amazon/aps/iva/xb0/a;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AccountIdInterceptor implements Interceptor {
    public static final int $stable = 0;
    private final a<AccountApiModel> getAccountApiModel;

    public AccountIdInterceptor(a<AccountApiModel> aVar) {
        j.f(aVar, "getAccountApiModel");
        this.getAccountApiModel = aVar;
    }

    private final void setAccountIdPathSegment(HttpUrl.Builder builder, int i, String str) {
        if (str != null) {
            builder.setPathSegment(i, str);
            return;
        }
        throw new IllegalArgumentException("Account id is missing");
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        Request request = chain.request();
        HttpUrl.Builder newBuilder = request.url().newBuilder();
        int i = 0;
        for (Object obj : request.url().pathSegments()) {
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                String str2 = (String) obj;
                if (j.a(str2, "{account_id}")) {
                    AccountApiModel invoke = this.getAccountApiModel.invoke();
                    if (invoke != null) {
                        str = invoke.getNumeric();
                    }
                    setAccountIdPathSegment(newBuilder, i, str);
                } else if (j.a(str2, "{account_uuid}")) {
                    AccountApiModel invoke2 = this.getAccountApiModel.invoke();
                    if (invoke2 != null) {
                        str = invoke2.getGuid();
                    }
                    setAccountIdPathSegment(newBuilder, i, str);
                }
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        return chain.proceed(request.newBuilder().url(newBuilder.build()).build());
    }
}
