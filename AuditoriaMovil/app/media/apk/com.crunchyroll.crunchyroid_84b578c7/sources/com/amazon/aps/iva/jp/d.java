package com.amazon.aps.iva.jp;

import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: DatadogEventListener.kt */
/* loaded from: classes2.dex */
public final class d extends EventListener {
    public final String a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    /* compiled from: DatadogEventListener.kt */
    /* loaded from: classes2.dex */
    public static final class a implements EventListener.Factory {
        @Override // okhttp3.EventListener.Factory
        public final EventListener create(Call call) {
            j.f(call, "call");
            Request request = call.request();
            j.e(request, "call.request()");
            return new d(i.w(request));
        }
    }

    public d(String str) {
        j.f(str, "key");
        this.a = str;
    }

    public final void a() {
        com.amazon.aps.iva.kb0.j jVar;
        com.amazon.aps.iva.kb0.j jVar2;
        long j;
        com.amazon.aps.iva.kb0.j jVar3;
        long j2;
        com.amazon.aps.iva.kb0.j jVar4;
        com.amazon.aps.iva.kb0.j jVar5;
        com.amazon.aps.iva.ar.a aVar;
        long j3 = this.c;
        if (j3 == 0) {
            jVar = new com.amazon.aps.iva.kb0.j(0L, 0L);
        } else {
            jVar = new com.amazon.aps.iva.kb0.j(Long.valueOf(j3 - this.b), Long.valueOf(this.d - this.c));
        }
        long longValue = ((Number) jVar.b).longValue();
        long longValue2 = ((Number) jVar.c).longValue();
        long j4 = this.e;
        if (j4 == 0) {
            jVar2 = new com.amazon.aps.iva.kb0.j(0L, 0L);
        } else {
            jVar2 = new com.amazon.aps.iva.kb0.j(Long.valueOf(j4 - this.b), Long.valueOf(this.f - this.e));
        }
        long longValue3 = ((Number) jVar2.b).longValue();
        long longValue4 = ((Number) jVar2.c).longValue();
        long j5 = this.g;
        if (j5 == 0) {
            jVar3 = new com.amazon.aps.iva.kb0.j(0L, 0L);
            j = longValue4;
        } else {
            j = longValue4;
            jVar3 = new com.amazon.aps.iva.kb0.j(Long.valueOf(j5 - this.b), Long.valueOf(this.h - this.g));
        }
        long longValue5 = ((Number) jVar3.b).longValue();
        long longValue6 = ((Number) jVar3.c).longValue();
        long j6 = this.i;
        if (j6 == 0) {
            jVar4 = new com.amazon.aps.iva.kb0.j(0L, 0L);
            j2 = longValue5;
        } else {
            j2 = longValue5;
            jVar4 = new com.amazon.aps.iva.kb0.j(Long.valueOf(j6 - this.b), Long.valueOf(this.j - this.i));
        }
        long longValue7 = ((Number) jVar4.b).longValue();
        long longValue8 = ((Number) jVar4.c).longValue();
        long j7 = this.k;
        if (j7 == 0) {
            jVar5 = new com.amazon.aps.iva.kb0.j(0L, 0L);
        } else {
            jVar5 = new com.amazon.aps.iva.kb0.j(Long.valueOf(j7 - this.b), Long.valueOf(this.l - this.k));
        }
        com.amazon.aps.iva.wq.a aVar2 = new com.amazon.aps.iva.wq.a(longValue, longValue2, longValue3, j, j2, longValue6, longValue7, longValue8, ((Number) jVar5.b).longValue(), ((Number) jVar5.c).longValue());
        com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
        if (fVar instanceof com.amazon.aps.iva.ar.a) {
            aVar = (com.amazon.aps.iva.ar.a) fVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.f(this.a, aVar2);
        }
    }

    public final void b() {
        com.amazon.aps.iva.ar.a aVar;
        com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
        if (fVar instanceof com.amazon.aps.iva.ar.a) {
            aVar = (com.amazon.aps.iva.ar.a) fVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.j(this.a);
        }
    }

    @Override // okhttp3.EventListener
    public final void callEnd(Call call) {
        j.f(call, "call");
        super.callEnd(call);
        a();
    }

    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) {
        j.f(call, "call");
        j.f(iOException, "ioe");
        super.callFailed(call, iOException);
        a();
    }

    @Override // okhttp3.EventListener
    public final void callStart(Call call) {
        j.f(call, "call");
        super.callStart(call);
        b();
        this.b = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        j.f(call, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
        j.f(proxy, "proxy");
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        this.f = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        j.f(call, "call");
        j.f(inetSocketAddress, "inetSocketAddress");
        j.f(proxy, "proxy");
        super.connectStart(call, inetSocketAddress, proxy);
        b();
        this.e = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(Call call, String str, List<InetAddress> list) {
        j.f(call, "call");
        j.f(str, "domainName");
        j.f(list, "inetAddressList");
        super.dnsEnd(call, str, list);
        this.d = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(Call call, String str) {
        j.f(call, "call");
        j.f(str, "domainName");
        super.dnsStart(call, str);
        b();
        this.c = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(Call call, long j) {
        j.f(call, "call");
        super.responseBodyEnd(call, j);
        this.l = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(Call call) {
        j.f(call, "call");
        super.responseBodyStart(call);
        b();
        this.k = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(Call call, Response response) {
        j.f(call, "call");
        j.f(response, "response");
        super.responseHeadersEnd(call, response);
        this.j = System.nanoTime();
        if (response.code() >= 400) {
            a();
        }
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(Call call) {
        j.f(call, "call");
        super.responseHeadersStart(call);
        b();
        this.i = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(Call call, Handshake handshake) {
        j.f(call, "call");
        super.secureConnectEnd(call, handshake);
        this.h = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(Call call) {
        j.f(call, "call");
        super.secureConnectStart(call);
        b();
        this.g = System.nanoTime();
    }
}
