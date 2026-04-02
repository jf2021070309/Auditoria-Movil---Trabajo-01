package com.amazon.aps.iva.i5;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.se0.d1;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.ve0.u0;
import com.google.android.gms.cast.MediaError;
/* compiled from: FlowLiveData.kt */
/* loaded from: classes.dex */
public final class j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowLiveData.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE, 114}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<T> extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ue0.q<? super T>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public i h;
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ LiveData<T> k;

        /* compiled from: FlowLiveData.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.i5.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0354a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ LiveData<T> h;
            public final /* synthetic */ w<T> i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0354a(LiveData<T> liveData, w<T> wVar, com.amazon.aps.iva.ob0.d<? super C0354a> dVar) {
                super(2, dVar);
                this.h = liveData;
                this.i = wVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0354a(this.h, this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0354a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                this.h.f(this.i);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: FlowLiveData.kt */
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ LiveData<T> h;
            public final /* synthetic */ w<T> i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LiveData<T> liveData, w<T> wVar) {
                super(0);
                this.h = liveData;
                this.i = wVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.kb0.q invoke() {
                d1 d1Var = d1.b;
                com.amazon.aps.iva.ye0.c cVar = r0.a;
                com.amazon.aps.iva.se0.i.d(d1Var, com.amazon.aps.iva.xe0.k.a.C(), null, new k(this.h, this.i, null), 2);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveData<T> liveData, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.k = liveData;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.k, dVar);
            aVar.j = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Object obj, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create((com.amazon.aps.iva.ue0.q) obj, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.aps.iva.i5.i, com.amazon.aps.iva.i5.w] */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.ue0.q qVar;
            i iVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            LiveData<T> liveData = this.k;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i iVar2 = this.h;
                qVar = (com.amazon.aps.iva.ue0.q) this.j;
                com.amazon.aps.iva.ab.x.i0(obj);
                iVar = iVar2;
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                final com.amazon.aps.iva.ue0.q qVar2 = (com.amazon.aps.iva.ue0.q) this.j;
                ?? r1 = new w() { // from class: com.amazon.aps.iva.i5.i
                    @Override // com.amazon.aps.iva.i5.w
                    public final void onChanged(Object obj2) {
                        com.amazon.aps.iva.ue0.q.this.h(obj2);
                    }
                };
                com.amazon.aps.iva.ye0.c cVar = r0.a;
                t1 C = com.amazon.aps.iva.xe0.k.a.C();
                C0354a c0354a = new C0354a(liveData, r1, null);
                this.j = qVar2;
                this.h = r1;
                this.i = 1;
                if (com.amazon.aps.iva.se0.i.g(this, C, c0354a) == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                iVar = r1;
            }
            b bVar = new b(liveData, iVar);
            this.j = null;
            this.h = null;
            this.i = 2;
            if (com.amazon.aps.iva.ue0.o.a(qVar, bVar, this) == aVar) {
                return aVar;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final <T> com.amazon.aps.iva.ve0.f<T> a(LiveData<T> liveData) {
        com.amazon.aps.iva.yb0.j.f(liveData, "<this>");
        return com.amazon.aps.iva.dg.b.i(new com.amazon.aps.iva.ve0.b(new a(liveData, null), com.amazon.aps.iva.ob0.h.b, -2, com.amazon.aps.iva.ue0.e.SUSPEND), -1);
    }

    public static androidx.lifecycle.c b(com.amazon.aps.iva.ve0.f fVar, com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        androidx.lifecycle.c cVar = new androidx.lifecycle.c(gVar, 5000L, new l(fVar, null));
        if (fVar instanceof u0) {
            if (com.amazon.aps.iva.r.c.s().t()) {
                cVar.k(((u0) fVar).getValue());
            } else {
                cVar.i(((u0) fVar).getValue());
            }
        }
        return cVar;
    }
}
