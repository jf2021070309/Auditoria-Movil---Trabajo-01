package com.amazon.aps.iva.ms;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonObject;
/* compiled from: AppConfig.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.appconfig.AppConfigImpl$sync$1", f = "AppConfig.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ c i;
    public final /* synthetic */ l<Throwable, q> j;

    /* compiled from: AppConfig.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.appconfig.AppConfigImpl$sync$1$1", f = "AppConfig.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super k<? extends JsonObject>>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ c j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = cVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super k<? extends JsonObject>> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v9, types: [com.google.gson.JsonElement, com.google.gson.JsonObject] */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            k.a aVar;
            c cVar;
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        cVar = (c) this.i;
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    g0 g0Var = (g0) this.i;
                    c cVar2 = this.j;
                    com.amazon.aps.iva.ps.b bVar = cVar2.b;
                    this.i = cVar2;
                    this.h = 1;
                    Object a = bVar.a(this);
                    if (a == aVar2) {
                        return aVar2;
                    }
                    cVar = cVar2;
                    obj = a;
                }
                ?? r5 = (JsonObject) obj;
                com.amazon.aps.iva.qs.a aVar3 = cVar.d;
                String jsonElement = r5.toString();
                j.e(jsonElement, "remoteConfig.toString()");
                aVar3.d(jsonElement);
                f fVar = cVar.c;
                String jsonElement2 = r5.toString();
                j.e(jsonElement2, "remoteConfig.toString()");
                fVar.a(jsonElement2);
                aVar = r5;
            } catch (Throwable th) {
                aVar = x.H(th);
            }
            return new k(aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(c cVar, l<? super Throwable, q> lVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(2, dVar);
        this.i = cVar;
        this.j = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        c cVar = this.i;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            g gVar = cVar.e;
            a aVar2 = new a(cVar, null);
            this.h = 1;
            obj = com.amazon.aps.iva.se0.i.g(this, gVar, aVar2);
            if (obj == aVar) {
                return aVar;
            }
        }
        Object obj2 = ((k) obj).b;
        if (!(obj2 instanceof k.a)) {
            JsonObject jsonObject = (JsonObject) obj2;
            e eVar = cVar.i;
            eVar.getClass();
            j.f(jsonObject, "remoteConfig");
            if (!eVar.d) {
                JsonObject jsonObject2 = eVar.b;
                d.a(jsonObject2, jsonObject, true);
                d.a(jsonObject2, eVar.a, false);
                eVar.e = jsonObject2;
                eVar.d = true;
                eVar.a();
            }
        }
        Throwable a2 = k.a(obj2);
        if (a2 != null) {
            e eVar2 = cVar.i;
            eVar2.d = true;
            eVar2.a();
            this.j.invoke(a2);
        }
        return q.a;
    }
}
