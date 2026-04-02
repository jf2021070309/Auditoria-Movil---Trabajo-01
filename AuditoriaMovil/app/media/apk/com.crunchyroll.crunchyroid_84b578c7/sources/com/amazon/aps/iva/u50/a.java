package com.amazon.aps.iva.u50;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.n4.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.net.cronet.okhttptransport.CronetInterceptor;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: TransportLayerInterceptor.kt */
/* loaded from: classes2.dex */
public final class a implements Interceptor {
    public CronetInterceptor b;

    /* compiled from: TransportLayerInterceptor.kt */
    /* renamed from: com.amazon.aps.iva.u50.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0758a extends l implements com.amazon.aps.iva.xb0.l<CronetInterceptor, q> {
        public C0758a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(CronetInterceptor cronetInterceptor) {
            CronetInterceptor cronetInterceptor2 = cronetInterceptor;
            j.f(cronetInterceptor2, "it");
            a.this.b = cronetInterceptor2;
            return q.a;
        }
    }

    public a(Context context, boolean z) {
        j.f(context, "context");
        if (z) {
            CronetProviderInstaller.installProvider(context).addOnCompleteListener(new e(5, context, new C0758a()));
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Response response;
        j.f(chain, "chain");
        CronetInterceptor cronetInterceptor = this.b;
        if (cronetInterceptor != null) {
            response = cronetInterceptor.intercept(chain);
        } else {
            response = null;
        }
        if (response == null) {
            Response proceed = chain.proceed(chain.request());
            j.e(proceed, "chain.proceed(chain.request())");
            return proceed;
        }
        return response;
    }
}
