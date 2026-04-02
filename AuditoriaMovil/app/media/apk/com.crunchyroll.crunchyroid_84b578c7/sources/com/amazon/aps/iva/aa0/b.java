package com.amazon.aps.iva.aa0;

import com.amazon.aps.iva.aa0.f;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.j;
import com.google.common.net.HttpHeaders;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
/* compiled from: HttpClient.kt */
@com.amazon.aps.iva.qb0.e(c = "com.mux.android.http.HttpClient$callOnce$2", f = "HttpClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super f>, Object> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(2, dVar);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b(this.h, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.net.HttpURLConnection, T, java.net.URLConnection] */
    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        e eVar = this.h;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        d0 d0Var = new d0();
        try {
            List<String> list = eVar.c.get(HttpHeaders.CONTENT_ENCODING);
            byte[] bArr = null;
            if (list != null) {
                str = (String) com.amazon.aps.iva.lb0.x.D0(list);
            } else {
                str = null;
            }
            boolean a = j.a(str, "gzip");
            byte[] bArr2 = eVar.e;
            if (bArr2 != null && a) {
                bArr2 = c.a(bArr2);
            }
            URLConnection openConnection = eVar.b.openConnection();
            j.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            ?? r1 = (HttpURLConnection) openConnection;
            int i = a.f;
            r1.setReadTimeout((int) a.d);
            r1.setConnectTimeout((int) a.c);
            r1.setRequestMethod(eVar.a);
            boolean z2 = false;
            if (bArr2 != null) {
                z = true;
            } else {
                z = false;
            }
            r1.setDoOutput(z);
            r1.setDoInput(true);
            for (Map.Entry<String, List<String>> entry : eVar.c.entrySet()) {
                for (String str2 : entry.getValue()) {
                    r1.setRequestProperty(entry.getKey(), str2);
                }
            }
            String str3 = eVar.d;
            if (str3 != null) {
                if (str3.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    r1.setRequestProperty(HttpHeaders.CONTENT_TYPE, str3);
                }
            }
            d0Var.b = r1;
            if (bArr2 != null) {
                OutputStream outputStream = r1.getOutputStream();
                outputStream.write(bArr2);
                q qVar = q.a;
                com.amazon.aps.iva.a60.b.k(outputStream, null);
            }
            ((HttpURLConnection) d0Var.b).connect();
            InputStream inputStream = ((HttpURLConnection) d0Var.b).getInputStream();
            if (inputStream != null) {
                byte[] b0 = x.b0(inputStream);
                com.amazon.aps.iva.a60.b.k(inputStream, null);
                bArr = b0;
            }
            f.a aVar2 = new f.a(((HttpURLConnection) d0Var.b).getResponseCode(), ((HttpURLConnection) d0Var.b).getResponseMessage());
            Map<String, List<String>> headerFields = ((HttpURLConnection) d0Var.b).getHeaderFields();
            j.e(headerFields, "hurlConn.headerFields");
            return new f(eVar, aVar2, headerFields, bArr);
        } finally {
            HttpURLConnection httpURLConnection = (HttpURLConnection) d0Var.b;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}
