package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.z3.h;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.List;
/* compiled from: DataMigrationInitializer.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {Encoder.DEFAULT_EC_PERCENT}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<k<Object>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ List<d<Object>> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends d<Object>> list, com.amazon.aps.iva.ob0.d<? super e> dVar) {
        super(2, dVar);
        this.j = list;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        e eVar = new e(this.j, dVar);
        eVar.i = obj;
        return eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(k<Object> kVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((e) create(kVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            h.a aVar2 = h.a;
            this.h = 1;
            if (h.a.a(aVar2, this.j, (k) this.i, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
