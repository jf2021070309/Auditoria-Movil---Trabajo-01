package com.amazon.aps.iva.sv;

import android.webkit.URLUtil;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: K
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: FileDownloader.kt */
/* loaded from: classes2.dex */
public final class c2<K> implements a2<K> {
    public final c a;
    public final com.amazon.aps.iva.wu.a b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final OkHttpClient d = new OkHttpClient();

    /* compiled from: FileDownloader.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.FileDownloaderImpl$startDownload$1", f = "FileDownloader.kt", l = {65, 67}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ String j;
        public final /* synthetic */ c2<K> k;
        public final /* synthetic */ File l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Exception, com.amazon.aps.iva.kb0.q> n;
        public final /* synthetic */ K o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, c2<K> c2Var, File file, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.l<? super Exception, com.amazon.aps.iva.kb0.q> lVar, K k, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = c2Var;
            this.l = file;
            this.m = aVar;
            this.n = lVar;
            this.o = k;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, this.k, this.l, this.m, this.n, this.o, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.se0.g0 g0Var;
            String str = this.j;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            c2<K> c2Var = this.k;
            try {
            } catch (IOException e) {
                com.amazon.aps.iva.mf0.a.a.b(e);
                this.n.invoke(e);
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        this.m.invoke();
                        c2Var.c.remove(this.o);
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = (com.amazon.aps.iva.se0.g0) this.i;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var2 = (com.amazon.aps.iva.se0.g0) this.i;
                if (com.amazon.aps.iva.e.z.E(g0Var2) && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str))) {
                    c2Var.getClass();
                    com.amazon.aps.iva.se0.u f = com.amazon.aps.iva.b30.j.f(c2Var.d.newCall(new Request.Builder().url(str).build()));
                    this.i = g0Var2;
                    this.h = 1;
                    Object K = f.K(this);
                    if (K == aVar) {
                        return aVar;
                    }
                    g0Var = g0Var2;
                    obj = K;
                }
                c2Var.c.remove(this.o);
                return com.amazon.aps.iva.kb0.q.a;
            }
            Response response = (Response) obj;
            if (com.amazon.aps.iva.e.z.E(g0Var)) {
                com.amazon.aps.iva.se0.n0 b = com.amazon.aps.iva.se0.i.b(c2Var.a, c2Var.b.a(), null, new d2(this.l, response, null), 2);
                this.i = null;
                this.h = 2;
                if (b.K(this) == aVar) {
                    return aVar;
                }
                this.m.invoke();
            }
            c2Var.c.remove(this.o);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public c2(d dVar, com.amazon.aps.iva.wu.a aVar) {
        this.a = dVar;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.sv.a2
    public final void a() {
        ConcurrentHashMap concurrentHashMap = this.c;
        for (com.amazon.aps.iva.se0.j1 j1Var : concurrentHashMap.values()) {
            j1Var.a(null);
        }
        concurrentHashMap.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.sv.a2
    public final void b(com.amazon.aps.iva.xb0.l<? super K, Boolean> lVar, com.amazon.aps.iva.xb0.l<? super K, com.amazon.aps.iva.kb0.q> lVar2) {
        com.amazon.aps.iva.yb0.j.f(lVar2, "onDownloadCancelled");
        ConcurrentHashMap concurrentHashMap = this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (lVar.invoke((Object) entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            ((com.amazon.aps.iva.se0.j1) entry2.getValue()).a(null);
            lVar2.invoke((Object) entry2.getKey());
            concurrentHashMap.remove(entry2.getKey());
        }
    }

    @Override // com.amazon.aps.iva.sv.a2
    public final void c(K k, String str, File file, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.l<? super Exception, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "failure");
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap.containsKey(k)) {
            return;
        }
        concurrentHashMap.put(k, com.amazon.aps.iva.se0.i.d(this.a, null, null, new a(str, this, file, aVar, lVar, k, null), 3));
    }
}
