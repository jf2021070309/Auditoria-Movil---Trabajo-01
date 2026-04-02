package com.amazon.aps.iva.bm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.auth.Token;
import com.ellation.crunchyroll.api.etp.auth.TokenState;
import java.util.Iterator;
import java.util.List;
/* compiled from: SelectedProfileCachingStrategy.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.data.strategies.SelectedProfileCachingStrategyImpl$refreshProfileFromProfilesList$1", f = "SelectedProfileCachingStrategy.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements p<List<? extends com.amazon.aps.iva.em.a>, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ j i;

    /* compiled from: SelectedProfileCachingStrategy.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.data.strategies.SelectedProfileCachingStrategyImpl$refreshProfileFromProfilesList$1$2$1", f = "SelectedProfileCachingStrategy.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ j i;
        public final /* synthetic */ com.amazon.aps.iva.em.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, com.amazon.aps.iva.em.a aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = jVar;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.am.g gVar = this.i.c;
                this.h = 1;
                if (gVar.b(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.i = jVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        f fVar = new f(this.i, dVar);
        fVar.h = obj;
        return fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(List<? extends com.amazon.aps.iva.em.a> list, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((f) create(list, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        Object obj2;
        TokenState.TokenPresentState tokenPresentState;
        Token token;
        g.c cVar;
        String str;
        com.amazon.aps.iva.em.a aVar;
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        Iterator it = ((List) this.h).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jVar = this.i;
            if (hasNext) {
                obj2 = it.next();
                String str2 = ((com.amazon.aps.iva.em.a) obj2).a;
                TokenState value = jVar.f.getRefreshTokenState().getValue();
                if (value instanceof TokenState.TokenPresentState) {
                    tokenPresentState = (TokenState.TokenPresentState) value;
                } else {
                    tokenPresentState = null;
                }
                if (tokenPresentState != null) {
                    token = tokenPresentState.getToken();
                } else {
                    token = null;
                }
                if (token == null || (str = token.getSelectedProfileId()) == null) {
                    com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) jVar.g.getValue();
                    if (gVar instanceof g.c) {
                        cVar = (g.c) gVar;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null && (aVar = (com.amazon.aps.iva.em.a) cVar.a) != null) {
                        str = aVar.a;
                    } else {
                        str = null;
                    }
                }
                if (com.amazon.aps.iva.yb0.j.a(str2, str)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        com.amazon.aps.iva.em.a aVar3 = (com.amazon.aps.iva.em.a) obj2;
        if (aVar3 != null) {
            jVar.setValue(new g.c(aVar3, null));
            com.amazon.aps.iva.se0.i.d(jVar.b, null, null, new a(jVar, aVar3, null), 3);
        }
        return q.a;
    }
}
