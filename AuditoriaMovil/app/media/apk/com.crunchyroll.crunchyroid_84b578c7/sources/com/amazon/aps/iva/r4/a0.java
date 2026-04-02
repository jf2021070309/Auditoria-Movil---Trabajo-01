package com.amazon.aps.iva.r4;

import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.Set;
/* compiled from: GlanceAppWidget.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget$composeResponsiveMode$2", f = "GlanceAppWidget.kt", l = {346, 347}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super RemoteViews>, Object> {
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Set<com.amazon.aps.iva.o2.g> k;
    public final /* synthetic */ Bundle l;
    public final /* synthetic */ z m;
    public final /* synthetic */ Context n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ o0 q;

    /* compiled from: GlanceAppWidget.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget$composeResponsiveMode$2$views$2$1", f = "GlanceAppWidget.kt", l = {337}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super RemoteViews>, Object> {
        public int h;
        public final /* synthetic */ z i;
        public final /* synthetic */ Context j;
        public final /* synthetic */ int k;
        public final /* synthetic */ Object l;
        public final /* synthetic */ Bundle m;
        public final /* synthetic */ long n;
        public final /* synthetic */ o0 o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, long j, Context context, Bundle bundle, z zVar, o0 o0Var, Object obj, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.i = zVar;
            this.j = context;
            this.k = i;
            this.l = obj;
            this.m = bundle;
            this.n = j;
            this.o = o0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            z zVar = this.i;
            Context context = this.j;
            int i = this.k;
            Object obj2 = this.l;
            return new a(i, this.n, context, this.m, zVar, this.o, obj2, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super RemoteViews> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                z zVar = this.i;
                Context context = this.j;
                int i2 = this.k;
                Object obj2 = this.l;
                Bundle bundle = this.m;
                long j = this.n;
                o0 o0Var = this.o;
                this.h = 1;
                obj = zVar.f(context, i2, obj2, bundle, j, o0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Set<com.amazon.aps.iva.o2.g> set, Bundle bundle, z zVar, Context context, int i, Object obj, o0 o0Var, com.amazon.aps.iva.ob0.d<? super a0> dVar) {
        super(2, dVar);
        this.k = set;
        this.l = bundle;
        this.m = zVar;
        this.n = context;
        this.o = i;
        this.p = obj;
        this.q = o0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        a0 a0Var = new a0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, dVar);
        a0Var.j = obj;
        return a0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super RemoteViews> dVar) {
        return ((a0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
