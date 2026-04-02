package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: TryCatchInterceptor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0006\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/TryCatchInterceptor;", "Lokhttp3/Interceptor;", "interceptor", "(Lokhttp3/Interceptor;)V", "getInterceptor", "()Lokhttp3/Interceptor;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TryCatchInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final Interceptor interceptor;

    public TryCatchInterceptor(Interceptor interceptor) {
        j.f(interceptor, "interceptor");
        this.interceptor = interceptor;
    }

    public static /* synthetic */ TryCatchInterceptor copy$default(TryCatchInterceptor tryCatchInterceptor, Interceptor interceptor, int i, Object obj) {
        if ((i & 1) != 0) {
            interceptor = tryCatchInterceptor.interceptor;
        }
        return tryCatchInterceptor.copy(interceptor);
    }

    public final Interceptor component1() {
        return this.interceptor;
    }

    public final TryCatchInterceptor copy(Interceptor interceptor) {
        j.f(interceptor, "interceptor");
        return new TryCatchInterceptor(interceptor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TryCatchInterceptor) && j.a(this.interceptor, ((TryCatchInterceptor) obj).interceptor)) {
            return true;
        }
        return false;
    }

    public final Interceptor getInterceptor() {
        return this.interceptor;
    }

    public int hashCode() {
        return this.interceptor.hashCode();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        try {
            return this.interceptor.intercept(chain);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    public String toString() {
        Interceptor interceptor = this.interceptor;
        return "TryCatchInterceptor(interceptor=" + interceptor + ")";
    }
}
