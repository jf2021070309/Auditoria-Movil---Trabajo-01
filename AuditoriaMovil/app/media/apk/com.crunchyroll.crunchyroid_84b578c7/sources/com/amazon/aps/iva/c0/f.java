package com.amazon.aps.iva.c0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.l0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FocusInteraction.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ k i;
    public final /* synthetic */ q1<Boolean> j;

    /* compiled from: FocusInteraction.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<j> {
        public final /* synthetic */ List<d> b;
        public final /* synthetic */ q1<Boolean> c;

        public a(ArrayList arrayList, q1 q1Var) {
            this.b = arrayList;
            this.c = q1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(j jVar, com.amazon.aps.iva.ob0.d dVar) {
            j jVar2 = jVar;
            boolean z = jVar2 instanceof d;
            List<d> list = this.b;
            if (z) {
                list.add(jVar2);
            } else if (jVar2 instanceof e) {
                list.remove(((e) jVar2).a);
            }
            this.c.setValue(Boolean.valueOf(!list.isEmpty()));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, q1<Boolean> q1Var, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.i = kVar;
        this.j = q1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new f(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            ArrayList arrayList = new ArrayList();
            l0 c = this.i.c();
            a aVar2 = new a(arrayList, this.j);
            this.h = 1;
            c.getClass();
            if (l0.l(c, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
