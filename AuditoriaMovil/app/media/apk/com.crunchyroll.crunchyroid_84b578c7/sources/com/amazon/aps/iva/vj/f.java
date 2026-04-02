package com.amazon.aps.iva.vj;

import com.amazon.aps.iva.yb0.j;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: DataSourceFactoryEntryPointImpl.kt */
/* loaded from: classes.dex */
public final class f implements Interceptor {
    public final Interceptor b;

    public f(Interceptor interceptor) {
        j.f(interceptor, "authInterceptor");
        this.b = interceptor;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        return this.b.intercept(chain);
    }
}
