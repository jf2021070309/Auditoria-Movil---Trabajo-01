package com.amazon.aps.iva.o60;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: TranslationsSynchronizer.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.q60.b, g0 {
    public final com.amazon.aps.iva.s60.a b;
    public final g c;
    public final com.amazon.aps.iva.o60.a d;
    public final com.amazon.aps.iva.p60.f e;
    public final v<Boolean> f;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d g;

    /* compiled from: TranslationsSynchronizer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public final /* synthetic */ com.amazon.aps.iva.q60.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.q60.a aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "isTranslationsReady");
            if (bool2.booleanValue()) {
                this.h.m2();
            }
            return q.a;
        }
    }

    /* compiled from: TranslationsSynchronizer.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* compiled from: TranslationsSynchronizer.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.localization.TranslationsSynchronizerImpl$syncTranslations$1", f = "TranslationsSynchronizer.kt", l = {55}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            i iVar = i.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    iVar.f.i(Boolean.FALSE);
                    com.amazon.aps.iva.s60.a aVar2 = iVar.b;
                    Locale a = iVar.e.a();
                    this.h = 1;
                    obj = aVar2.a(a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                iVar.c.b(iVar.e.a(), (Map) obj);
                iVar.d.a();
            } catch (com.amazon.aps.iva.jf0.i | IOException unused) {
            } catch (XmlPullParserException e) {
                com.amazon.aps.iva.mf0.a.a.m(e);
            }
            return q.a;
        }
    }

    /* compiled from: TranslationsSynchronizer.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Throwable th) {
            i.this.f.i(Boolean.TRUE);
            return q.a;
        }
    }

    public i(com.amazon.aps.iva.s60.b bVar, h hVar, com.amazon.aps.iva.p60.f fVar, com.amazon.aps.iva.wu.a aVar) {
        com.amazon.aps.iva.o60.d dVar = com.amazon.aps.iva.o60.d.a;
        v<Boolean> vVar = new v<>(Boolean.FALSE);
        this.b = bVar;
        this.c = hVar;
        this.d = dVar;
        this.e = fVar;
        this.f = vVar;
        this.g = z.i(aVar.a());
    }

    @Override // com.amazon.aps.iva.q60.b
    public final void a(o oVar, com.amazon.aps.iva.q60.a aVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        com.amazon.aps.iva.yb0.j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.c.a(this.e.a()).isEmpty()) {
            aVar.m2();
            return;
        }
        this.f.e(oVar, new b(new a(aVar)));
    }

    public final void b() {
        com.amazon.aps.iva.se0.i.d(this, null, null, new c(null), 3).s0(new d());
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.g.b;
    }
}
