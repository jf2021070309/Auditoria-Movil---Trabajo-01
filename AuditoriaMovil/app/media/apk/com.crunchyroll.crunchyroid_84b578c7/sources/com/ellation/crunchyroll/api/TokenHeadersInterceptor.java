package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: TokenHeadersInterceptor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R&\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/api/TokenHeadersInterceptor;", "Lokhttp3/Interceptor;", "Lcom/ellation/crunchyroll/api/AccountStateProvider;", "Lokhttp3/Headers;", "headers", "Lcom/amazon/aps/iva/kb0/q;", "updatePendingState", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lkotlin/Function1;", "", "Lcom/ellation/crunchyroll/api/AccountPendingRestrictions;", "onPendingStateChange", "Lcom/amazon/aps/iva/xb0/l;", "", "pendingRestrictions", "Ljava/util/List;", "getPendingRestrictions", "()Ljava/util/List;", "setPendingRestrictions", "(Ljava/util/List;)V", "<init>", "(Lcom/amazon/aps/iva/xb0/l;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TokenHeadersInterceptor implements Interceptor, AccountStateProvider {
    public static final int $stable = 8;
    private final l<List<? extends AccountPendingRestrictions>, q> onPendingStateChange;
    private List<AccountPendingRestrictions> pendingRestrictions;

    /* JADX WARN: Multi-variable type inference failed */
    public TokenHeadersInterceptor(l<? super List<? extends AccountPendingRestrictions>, q> lVar) {
        j.f(lVar, "onPendingStateChange");
        this.onPendingStateChange = lVar;
        this.pendingRestrictions = new ArrayList();
    }

    private final void updatePendingState(Headers headers) {
        String str;
        com.amazon.aps.iva.kb0.j<? extends String, ? extends String> jVar;
        getPendingRestrictions().clear();
        Iterator<com.amazon.aps.iva.kb0.j<? extends String, ? extends String>> it = headers.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                jVar = it.next();
                if (j.a(jVar.b, "validation-hints")) {
                    break;
                }
            } else {
                jVar = null;
                break;
            }
        }
        com.amazon.aps.iva.kb0.j<? extends String, ? extends String> jVar2 = jVar;
        if (jVar2 != null) {
            str = (String) jVar2.b;
        }
        if (j.a(str, "validation-hints")) {
            if (com.amazon.aps.iva.oe0.q.i0((CharSequence) jVar2.c, "Set-Username", false)) {
                getPendingRestrictions().add(AccountPendingRestrictions.SET_USERNAME);
            }
            CharSequence charSequence = (CharSequence) jVar2.c;
            if (com.amazon.aps.iva.oe0.q.i0(charSequence, "Validate-Email-Address", false)) {
                getPendingRestrictions().add(AccountPendingRestrictions.VERIFY_EMAIL);
            }
            if (com.amazon.aps.iva.oe0.q.i0(charSequence, "Set-Email-Address", false)) {
                getPendingRestrictions().add(AccountPendingRestrictions.SET_EMAIL);
            }
        }
        this.onPendingStateChange.invoke(getPendingRestrictions());
    }

    @Override // com.ellation.crunchyroll.api.AccountStateProvider
    public List<AccountPendingRestrictions> getPendingRestrictions() {
        return this.pendingRestrictions;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        Request request = chain.request();
        Response proceed = chain.proceed(request);
        List<String> pathSegments = request.url().pathSegments();
        boolean z = false;
        if (!(pathSegments instanceof Collection) || !pathSegments.isEmpty()) {
            Iterator<T> it = pathSegments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (j.a((String) it.next(), "token")) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            updatePendingState(proceed.headers());
        }
        return proceed;
    }

    public void setPendingRestrictions(List<AccountPendingRestrictions> list) {
        j.f(list, "<set-?>");
        this.pendingRestrictions = list;
    }
}
