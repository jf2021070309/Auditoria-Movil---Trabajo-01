package com.amazon.aps.iva.kr;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fb0.d;
import com.amazon.aps.iva.gb0.h;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.l;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.ur.c;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: TracingInterceptor.kt */
/* loaded from: classes2.dex */
public class d implements Interceptor {
    public final List<String> b;
    public final b c;
    public final com.amazon.aps.iva.l9.a d;
    public final String e;
    public final com.amazon.aps.iva.zp.b f;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fb0.d> g;
    public final AtomicReference<com.amazon.aps.iva.fb0.d> h;
    public final com.amazon.aps.iva.l9.a i;

    public d(List list, b bVar, com.amazon.aps.iva.l9.a aVar, com.amazon.aps.iva.zp.a aVar2, com.amazon.aps.iva.xb0.a aVar3) {
        j.f(aVar, "firstPartyHostDetector");
        j.f(aVar3, "localTracerFactory");
        this.b = list;
        this.c = bVar;
        this.d = aVar;
        this.e = "rum";
        this.f = aVar2;
        this.g = aVar3;
        this.h = new AtomicReference<>();
        com.amazon.aps.iva.l9.a aVar4 = new com.amazon.aps.iva.l9.a(list);
        this.i = aVar4;
        if (((List) aVar4.a).isEmpty() && ((List) aVar.a).isEmpty()) {
            com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, "You added a TracingInterceptor to your OkHttpClient, but you did not specify any first party hosts. Your requests won't be traced.\nTo set a list of known hosts, you can use the Configuration.Builder::setFirstPartyHosts() method.", null, 6);
        }
    }

    public static Request.Builder c(Request request, com.amazon.aps.iva.fb0.d dVar, com.amazon.aps.iva.fb0.b bVar) {
        Request.Builder newBuilder = request.newBuilder();
        if (bVar == null) {
            for (String str : f1.K("x-datadog-sampling-priority", "x-datadog-trace-id", "x-datadog-parent-id")) {
                newBuilder.removeHeader(str);
            }
            newBuilder.addHeader("x-datadog-sampling-priority", "0");
        } else {
            dVar.l(bVar.c(), new c(newBuilder));
        }
        j.e(newBuilder, "tracedRequestBuilder");
        return newBuilder;
    }

    public final void a(Request request, Response response, com.amazon.aps.iva.fb0.b bVar) {
        boolean z;
        com.amazon.aps.iva.as.a aVar;
        com.amazon.aps.iva.as.a aVar2;
        com.amazon.aps.iva.as.a aVar3 = null;
        if (bVar == null) {
            b(request, null, response, null);
            return;
        }
        int code = response.code();
        bVar.d(Integer.valueOf(code));
        if (400 <= code && code < 500) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (bVar instanceof com.amazon.aps.iva.as.a) {
                aVar2 = (com.amazon.aps.iva.as.a) bVar;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                aVar2.f();
            }
        }
        if (code == 404) {
            if (bVar instanceof com.amazon.aps.iva.as.a) {
                aVar = (com.amazon.aps.iva.as.a) bVar;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.e("404");
            }
        }
        b(request, bVar, response, null);
        if (!com.amazon.aps.iva.tq.c.f.d()) {
            bVar.finish();
            return;
        }
        if (bVar instanceof com.amazon.aps.iva.as.a) {
            aVar3 = (com.amazon.aps.iva.as.a) bVar;
        }
        if (aVar3 != null) {
            aVar3.a();
        }
    }

    public void b(Request request, com.amazon.aps.iva.fb0.b bVar, Response response, Throwable th) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.amazon.aps.iva.kr.d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.amazon.aps.iva.fb0.b, okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.amazon.aps.iva.as.a] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        ?? r4;
        com.amazon.aps.iva.fb0.d dVar;
        boolean z;
        Integer W;
        Boolean bool;
        boolean booleanValue;
        com.amazon.aps.iva.fb0.b bVar;
        Request request;
        com.amazon.aps.iva.as.a aVar;
        com.amazon.aps.iva.fb0.c c;
        c.b bVar2;
        com.amazon.aps.iva.as.a aVar2;
        int intValue;
        j.f(chain, "chain");
        synchronized (this) {
            r4 = 0;
            if (!com.amazon.aps.iva.lr.a.f.a.get()) {
                com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, "You added a TracingInterceptor to your OkHttpClient, but you did not enable the TracingFeature. Your requests won't be traced.", null, 6);
                dVar = null;
            } else {
                h hVar = com.amazon.aps.iva.ib0.a.b;
                AtomicReference<com.amazon.aps.iva.fb0.d> atomicReference = this.h;
                if (atomicReference.get() == null) {
                    com.amazon.aps.iva.fb0.d invoke = this.g.invoke();
                    while (!atomicReference.compareAndSet(null, invoke) && atomicReference.get() == null) {
                    }
                    com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, "You added a TracingInterceptor to your OkHttpClient, but you didn't register any Tracer. We automatically created a local tracer for you.", null, 6);
                }
                com.amazon.aps.iva.fb0.d dVar2 = atomicReference.get();
                j.e(dVar2, "localTracerReference.get()");
                dVar = dVar2;
            }
        }
        Request request2 = chain.request();
        if (dVar != null) {
            j.e(request2, "request");
            HttpUrl url = request2.url();
            j.e(url, ImagesContract.URL);
            boolean z2 = false;
            if (!this.d.f(url) && !this.i.f(url)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                String header = request2.header("x-datadog-sampling-priority");
                if (header == null) {
                    W = null;
                } else {
                    W = l.W(header);
                }
                if (W == null || (intValue = W.intValue()) == Integer.MIN_VALUE) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf((intValue == 2 || intValue == 1) ? true : true);
                }
                if (bool == null) {
                    booleanValue = this.f.a();
                } else {
                    booleanValue = bool.booleanValue();
                }
                if (booleanValue) {
                    com.amazon.aps.iva.fb0.b bVar3 = (com.amazon.aps.iva.fb0.b) request2.tag(com.amazon.aps.iva.fb0.b.class);
                    if (bVar3 == null) {
                        c = null;
                    } else {
                        c = bVar3.c();
                    }
                    Map<String, List<String>> multimap = request2.headers().toMultimap();
                    j.e(multimap, "request.headers().toMultimap()");
                    ArrayList arrayList = new ArrayList(multimap.size());
                    for (Map.Entry<String, List<String>> entry : multimap.entrySet()) {
                        String key = entry.getKey();
                        List<String> value = entry.getValue();
                        j.e(value, "it.value");
                        arrayList.add(new com.amazon.aps.iva.kb0.j(key, x.B0(value, ";", null, null, null, 62)));
                    }
                    com.amazon.aps.iva.fb0.c b = dVar.b(new com.amazon.aps.iva.hb0.a(i0.Z(arrayList)));
                    if (b != null) {
                        c = b;
                    }
                    String httpUrl = request2.url().toString();
                    j.e(httpUrl, "request.url().toString()");
                    d.a e0 = dVar.e0();
                    if (e0 instanceof c.b) {
                        bVar2 = (c.b) e0;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        bVar2.g = this.e;
                    }
                    bVar = e0.a(c).start();
                    if (bVar instanceof com.amazon.aps.iva.as.a) {
                        aVar2 = (com.amazon.aps.iva.as.a) bVar;
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        aVar2.e(q.L0(httpUrl, '?'));
                    }
                    bVar.b("http.url", httpUrl);
                    bVar.b("http.method", request2.method());
                } else {
                    bVar = null;
                }
                try {
                    request = c(request2, dVar, bVar).build();
                } catch (IllegalStateException e) {
                    l1.M(com.amazon.aps.iva.dq.c.a, "Failed to update intercepted OkHttp request", e, 4);
                    request = request2;
                }
                try {
                    Response proceed = chain.proceed(request);
                    j.e(proceed, "response");
                    a(request2, proceed, bVar);
                    return proceed;
                } catch (Throwable th) {
                    if (bVar != null) {
                        boolean z3 = bVar instanceof com.amazon.aps.iva.as.a;
                        if (z3) {
                            aVar = (com.amazon.aps.iva.as.a) bVar;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            aVar.f();
                        }
                        bVar.b("error.msg", th.getMessage());
                        bVar.b("error.type", th.getClass().getName());
                        bVar.b("error.stack", com.amazon.aps.iva.dg.b.B(th));
                        b(request2, bVar, null, th);
                        if (!(!com.amazon.aps.iva.tq.c.f.d())) {
                            if (z3) {
                                r4 = (com.amazon.aps.iva.as.a) bVar;
                            }
                            if (r4 != 0) {
                                r4.a();
                            }
                        } else {
                            bVar.finish();
                        }
                    }
                    throw th;
                }
            }
        }
        j.e(request2, "request");
        try {
            Response proceed2 = chain.proceed(request2);
            b(request2, null, proceed2, null);
            j.e(proceed2, "response");
            return proceed2;
        } finally {
            b(request2, null, null, th);
        }
    }
}
