package com.amazon.aps.iva.ka0;

import android.net.Uri;
import com.amazon.aps.iva.aa0.a;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ka0.e;
import com.amazon.aps.iva.ka0.p;
import com.amazon.aps.iva.n4.f0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
import com.google.android.gms.cast.CredentialsData;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: MuxNetwork.kt */
/* loaded from: classes4.dex */
public final class r implements e {
    public final com.amazon.aps.iva.aa0.a a;
    public final com.amazon.aps.iva.xe0.d b;

    /* compiled from: MuxNetwork.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$1", f = "MuxNetwork.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ URL j;
        public final /* synthetic */ Map<String, List<String>> k;
        public final /* synthetic */ String l;
        public final /* synthetic */ e.a m;

        /* compiled from: MuxNetwork.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$1$1", f = "MuxNetwork.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.ka0.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0440a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ e.a h;
            public final /* synthetic */ a.C0110a i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0440a(e.a aVar, a.C0110a c0110a, com.amazon.aps.iva.ob0.d<? super C0440a> dVar) {
                super(2, dVar);
                this.h = aVar;
                this.i = c0110a;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0440a(this.h, this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0440a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                Map<String, List<String>> map;
                boolean z;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                e.a aVar2 = this.h;
                if (aVar2 != null) {
                    a.C0110a c0110a = this.i;
                    boolean z2 = false;
                    if (c0110a.b == null) {
                        com.amazon.aps.iva.aa0.f fVar = c0110a.a;
                        if (fVar != null) {
                            z = fVar.e;
                        } else {
                            z = false;
                        }
                        if (z && !c0110a.c) {
                            z2 = true;
                        }
                    }
                    com.amazon.aps.iva.aa0.f fVar2 = c0110a.a;
                    if (fVar2 != null) {
                        map = fVar2.c;
                    } else {
                        map = null;
                    }
                    aVar2.c(map, z2);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(URL url, Map<String, ? extends List<String>> map, String str, e.a aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = url;
            this.k = map;
            this.l = str;
            this.m = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, this.l, this.m, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            r rVar = r.this;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.aa0.a aVar2 = rVar.a;
                com.amazon.aps.iva.aa0.d dVar = new com.amazon.aps.iva.aa0.d(this.j, this.k, this.l);
                this.h = 1;
                obj = aVar2.a(dVar, 0, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.amazon.aps.iva.xe0.d dVar2 = rVar.b;
            com.amazon.aps.iva.ye0.c cVar = r0.a;
            com.amazon.aps.iva.se0.i.d(dVar2, com.amazon.aps.iva.xe0.k.a, null, new C0440a(this.m, (a.C0110a) obj, null), 2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: MuxNetwork.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$2", f = "MuxNetwork.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ e.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e.a aVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.h, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            e.a aVar2 = this.h;
            if (aVar2 != null) {
                aVar2.c(null, false);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public r(p.a aVar) {
        com.amazon.aps.iva.xe0.d i = com.amazon.aps.iva.e.z.i(r0.a);
        this.a = new com.amazon.aps.iva.aa0.a(new s(aVar));
        this.b = com.amazon.aps.iva.e.z.i(i.b);
    }

    @Override // com.amazon.aps.iva.ka0.e
    public final void a(String str, String str2, String str3, Hashtable<String, String> hashtable, e.a aVar) {
        com.amazon.aps.iva.xe0.d dVar = this.b;
        if (str2 != null) {
            Uri.Builder scheme = new Uri.Builder().scheme("https");
            int i = com.amazon.aps.iva.aa0.c.a;
            if (com.amazon.aps.iva.oe0.m.h0(str, ".", false)) {
                if (Pattern.matches("^[a-z0-9]+$", str2)) {
                    str = str2.concat(str);
                } else {
                    str = "img".concat(str);
                }
            }
            Uri build = scheme.authority(str).path(CredentialsData.CREDENTIALS_TYPE_ANDROID).build();
            com.amazon.aps.iva.yb0.j.e(build, "Builder()\n        .schem…ndroid\")\n        .build()");
            URL url = new URL(build.toString());
            LinkedHashMap linkedHashMap = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(hashtable.size()));
            Iterator<T> it = hashtable.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), f1.J(entry.getValue()));
            }
            com.amazon.aps.iva.se0.i.d(dVar, null, null, new a(url, linkedHashMap, str3, aVar, null), 3);
            return;
        }
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        com.amazon.aps.iva.se0.i.d(dVar, com.amazon.aps.iva.xe0.k.a, null, new b(aVar, null), 2);
    }

    @Override // com.amazon.aps.iva.ka0.e
    public final void b(String str, String str2, String str3, Hashtable hashtable, f0 f0Var) {
        a(str, str2, str3, hashtable, new com.amazon.aps.iva.g1.m(f0Var));
    }
}
