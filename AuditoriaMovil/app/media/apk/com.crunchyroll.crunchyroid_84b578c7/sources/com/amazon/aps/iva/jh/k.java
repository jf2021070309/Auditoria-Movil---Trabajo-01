package com.amazon.aps.iva.jh;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.staticfiles.StaticFilesService;
import okhttp3.ResponseBody;
/* compiled from: LanguageOptionsSynchronizer.kt */
/* loaded from: classes.dex */
public final class k implements g0 {
    public final StaticFilesService b;
    public final i c;
    public final String d;
    public final String e;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d f = z.j();

    /* compiled from: LanguageOptionsSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.languageoptions.LanguageOptionsSynchronizerImpl$synchronise$1", f = "LanguageOptionsSynchronizer.kt", l = {32}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            i iVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        iVar = (i) this.i;
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    g0 g0Var = (g0) this.i;
                    k kVar = k.this;
                    i iVar2 = kVar.c;
                    StaticFilesService staticFilesService = kVar.b;
                    String str = kVar.d;
                    this.i = iVar2;
                    this.h = 1;
                    obj = staticFilesService.getFile(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    iVar = iVar2;
                }
                iVar.store(com.amazon.aps.iva.aq.k.y(((ResponseBody) obj).charStream()));
                q qVar = q.a;
            } catch (Throwable th) {
                x.H(th);
            }
            return q.a;
        }
    }

    /* compiled from: LanguageOptionsSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.languageoptions.LanguageOptionsSynchronizerImpl$synchronise$2", f = "LanguageOptionsSynchronizer.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.i = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            i iVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        iVar = (i) this.i;
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    g0 g0Var = (g0) this.i;
                    k kVar = k.this;
                    i iVar2 = kVar.c;
                    StaticFilesService staticFilesService = kVar.b;
                    String str = kVar.e;
                    this.i = iVar2;
                    this.h = 1;
                    obj = staticFilesService.getFile(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    iVar = iVar2;
                }
                iVar.storeFallbacks(com.amazon.aps.iva.aq.k.y(((ResponseBody) obj).charStream()));
                q qVar = q.a;
            } catch (Throwable th) {
                x.H(th);
            }
            return q.a;
        }
    }

    public k(StaticFilesService staticFilesService, i iVar, String str, String str2) {
        this.b = staticFilesService;
        this.c = iVar;
        this.d = str;
        this.e = str2;
    }

    public final void a() {
        boolean z;
        com.amazon.aps.iva.se0.i.d(this, null, null, new a(null), 3);
        boolean z2 = false;
        String str = this.e;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            com.amazon.aps.iva.se0.i.d(this, null, null, new b(null), 3);
        }
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.f.b;
    }
}
