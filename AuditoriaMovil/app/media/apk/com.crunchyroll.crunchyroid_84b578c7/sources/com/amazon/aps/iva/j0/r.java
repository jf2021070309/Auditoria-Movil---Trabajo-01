package com.amazon.aps.iva.j0;
/* compiled from: CoreTextField.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", l = {318}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.g0.d i;
    public final /* synthetic */ com.amazon.aps.iva.i2.e0 j;
    public final /* synthetic */ p2 k;
    public final /* synthetic */ q2 l;
    public final /* synthetic */ com.amazon.aps.iva.i2.q m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.amazon.aps.iva.g0.d dVar, com.amazon.aps.iva.i2.e0 e0Var, p2 p2Var, q2 q2Var, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.ob0.d<? super r> dVar2) {
        super(2, dVar2);
        this.i = dVar;
        this.j = e0Var;
        this.k = p2Var;
        this.l = q2Var;
        this.m = qVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new r(this.i, this.j, this.k, this.l, this.m, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((r) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.e1.e eVar;
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
            e1 e1Var = this.k.a;
            com.amazon.aps.iva.c2.y yVar = this.l.a;
            this.h = 1;
            int b = this.m.b(com.amazon.aps.iva.c2.z.d(this.j.b));
            if (b < yVar.a.a.length()) {
                eVar = yVar.b(b);
            } else if (b != 0) {
                eVar = yVar.b(b - 1);
            } else {
                eVar = new com.amazon.aps.iva.e1.e(0.0f, 0.0f, 1.0f, com.amazon.aps.iva.o2.j.b(n1.a(e1Var.b, e1Var.g, e1Var.h, n1.a, 1)));
            }
            Object a = this.i.a(eVar, this);
            if (a != aVar) {
                a = com.amazon.aps.iva.kb0.q.a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
