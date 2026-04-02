package com.amazon.aps.iva.d4;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.z3.i;
/* compiled from: PreferenceDataStoreFactory.kt */
/* loaded from: classes.dex */
public final class b implements i<d> {
    public final i<d> a;

    /* compiled from: PreferenceDataStoreFactory.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<d, com.amazon.aps.iva.ob0.d<? super d>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ p<d, com.amazon.aps.iva.ob0.d<? super d>, Object> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super d, ? super com.amazon.aps.iva.ob0.d<? super d>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(d dVar, com.amazon.aps.iva.ob0.d<? super d> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(q.a);
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
                this.h = 1;
                obj = this.j.invoke((d) this.i, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            d dVar = (d) obj;
            ((com.amazon.aps.iva.d4.a) dVar).b.set(true);
            return dVar;
        }
    }

    public b(com.amazon.aps.iva.z3.q qVar) {
        this.a = qVar;
    }

    @Override // com.amazon.aps.iva.z3.i
    public final Object a(p<? super d, ? super com.amazon.aps.iva.ob0.d<? super d>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        return this.a.a(new a(pVar, null), dVar);
    }

    @Override // com.amazon.aps.iva.z3.i
    public final com.amazon.aps.iva.ve0.f<d> getData() {
        return this.a.getData();
    }
}
