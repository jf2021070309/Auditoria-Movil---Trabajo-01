package com.braze.coroutine;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/braze/coroutine/BrazeCoroutineScope;", "Lcom/amazon/aps/iva/se0/g0;", "", "startDelayInMs", "Lcom/amazon/aps/iva/ob0/g;", "specificContext", "Lkotlin/Function1;", "Lcom/amazon/aps/iva/ob0/d;", "Lcom/amazon/aps/iva/kb0/q;", "", "block", "Lcom/amazon/aps/iva/se0/j1;", "launchDelayed", "(Ljava/lang/Number;Lcom/amazon/aps/iva/ob0/g;Lcom/amazon/aps/iva/xb0/l;)Lcom/amazon/aps/iva/se0/j1;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "coroutineContext", "Lcom/amazon/aps/iva/ob0/g;", "getCoroutineContext", "()Lcom/amazon/aps/iva/ob0/g;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeCoroutineScope implements g0 {
    public static final BrazeCoroutineScope INSTANCE = new BrazeCoroutineScope();
    private static final g coroutineContext;
    private static final CoroutineExceptionHandler exceptionHandler;

    /* loaded from: classes.dex */
    public static final class b extends l implements a {
        final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.b = th;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Child job of BrazeCoroutineScope got exception: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends i implements p {
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ Number d;
        final /* synthetic */ com.amazon.aps.iva.xb0.l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Number number, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.d = number;
            this.e = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            c cVar = new c(this.d, this.e, dVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        x.i0(obj);
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = (g0) this.c;
                x.i0(obj);
            } else {
                x.i0(obj);
                g0Var = (g0) this.c;
                long longValue = this.d.longValue();
                this.c = g0Var;
                this.b = 1;
                if (t.l(longValue, this) == aVar) {
                    return aVar;
                }
            }
            if (z.E(g0Var)) {
                com.amazon.aps.iva.xb0.l lVar = this.e;
                this.c = null;
                this.b = 2;
                if (lVar.invoke(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.ob0.a implements CoroutineExceptionHandler {
        public d(CoroutineExceptionHandler.a aVar) {
            super(aVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(g gVar, Throwable th) {
            BrazeLogger.INSTANCE.brazelog(BrazeCoroutineScope.INSTANCE, BrazeLogger.Priority.E, th, new b(th));
        }
    }

    static {
        d dVar = new d(CoroutineExceptionHandler.a.b);
        exceptionHandler = dVar;
        coroutineContext = r0.b.plus(dVar).plus(com.amazon.aps.iva.se0.i.a());
    }

    private BrazeCoroutineScope() {
    }

    public static /* synthetic */ j1 launchDelayed$default(BrazeCoroutineScope brazeCoroutineScope, Number number, g gVar, com.amazon.aps.iva.xb0.l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = brazeCoroutineScope.getCoroutineContext();
        }
        return brazeCoroutineScope.launchDelayed(number, gVar, lVar);
    }

    @Override // com.amazon.aps.iva.se0.g0
    public g getCoroutineContext() {
        return coroutineContext;
    }

    public final j1 launchDelayed(Number number, g gVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super q>, ? extends Object> lVar) {
        j.f(number, "startDelayInMs");
        j.f(gVar, "specificContext");
        j.f(lVar, "block");
        return com.amazon.aps.iva.se0.i.d(this, gVar, null, new c(number, lVar, null), 2);
    }
}
