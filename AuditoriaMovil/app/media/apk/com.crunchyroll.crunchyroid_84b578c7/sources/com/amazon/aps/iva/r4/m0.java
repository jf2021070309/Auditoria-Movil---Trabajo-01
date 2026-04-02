package com.amazon.aps.iva.r4;

import android.content.Context;
/* compiled from: GlanceAppWidgetReceiver.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$updateManager$1", f = "GlanceAppWidgetReceiver.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ l0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, l0 l0Var, com.amazon.aps.iva.ob0.d<? super m0> dVar) {
        super(2, dVar);
        this.i = context;
        this.j = l0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new m0(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((m0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                try {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } catch (Throwable unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            Context context = this.i;
            l0 l0Var = this.j;
            i0 i0Var = new i0(context);
            com.crunchyroll.appwidgets.continuewatching.c b = l0Var.b();
            this.h = 1;
            if (i0Var.c(l0Var, b, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
