package com.amazon.aps.iva.vj;

import android.content.Context;
import com.amazon.aps.iva.cj.k;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.y5.b;
import com.amazon.aps.iva.yb0.j;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
/* compiled from: DataSourceFactoryEntryPointImpl.kt */
/* loaded from: classes.dex */
public final class c {
    public final Context a;
    public final boolean b;

    public c(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    public final b.a a() {
        Interceptor[] interceptorArr = new Interceptor[2];
        k kVar = n.d;
        if (kVar != null) {
            f fVar = new f(kVar.getAuthInterceptor());
            interceptorArr[0] = fVar;
            interceptorArr[1] = new com.amazon.aps.iva.u50.a(this.a, this.b);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            for (int i = 0; i < 2; i++) {
                builder.addInterceptor(interceptorArr[i]);
            }
            OkHttpClient build = builder.build();
            CookieManager cookieManager = new CookieManager();
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
            CookieHandler.setDefault(cookieManager);
            return new b.a(build);
        }
        j.m("dependencies");
        throw null;
    }
}
