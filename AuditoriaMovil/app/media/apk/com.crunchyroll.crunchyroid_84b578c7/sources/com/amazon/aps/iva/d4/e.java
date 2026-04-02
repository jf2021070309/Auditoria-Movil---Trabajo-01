package com.amazon.aps.iva.d4;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.p;
/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: Preferences.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<d, com.amazon.aps.iva.ob0.d<? super d>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ p<com.amazon.aps.iva.d4.a, com.amazon.aps.iva.ob0.d<? super q>, Object> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super com.amazon.aps.iva.d4.a, ? super com.amazon.aps.iva.ob0.d<? super q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
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
                    com.amazon.aps.iva.d4.a aVar2 = (com.amazon.aps.iva.d4.a) this.i;
                    x.i0(obj);
                    return aVar2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
            com.amazon.aps.iva.d4.a d = ((d) this.i).d();
            this.i = d;
            this.h = 1;
            if (this.j.invoke(d, this) == aVar) {
                return aVar;
            }
            return d;
        }
    }

    public static final Object a(com.amazon.aps.iva.z3.i<d> iVar, p<? super com.amazon.aps.iva.d4.a, ? super com.amazon.aps.iva.ob0.d<? super q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        return iVar.a(new a(pVar, null), dVar);
    }
}
