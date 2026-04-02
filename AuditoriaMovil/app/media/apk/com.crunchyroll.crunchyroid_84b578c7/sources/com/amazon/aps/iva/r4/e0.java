package com.amazon.aps.iva.r4;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
/* compiled from: GlanceAppWidget.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget$update$4", f = "GlanceAppWidget.kt", l = {142, 146}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public Object h;
    public int i;
    public int j;
    public final /* synthetic */ Bundle k;
    public final /* synthetic */ AppWidgetManager l;
    public final /* synthetic */ int m;
    public final /* synthetic */ z n;
    public final /* synthetic */ Context o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Bundle bundle, AppWidgetManager appWidgetManager, int i, z zVar, Context context, com.amazon.aps.iva.ob0.d<? super e0> dVar) {
        super(1, dVar);
        this.k = bundle;
        this.l = appWidgetManager;
        this.m = i;
        this.n = zVar;
        this.o = context;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new e0(this.k, this.l, this.m, this.n, this.o, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((e0) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Bundle bundle;
        AppWidgetManager appWidgetManager;
        int i;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i2 = this.j;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    i = this.i;
                    appWidgetManager = (AppWidgetManager) this.h;
                    com.amazon.aps.iva.ab.x.i0(obj);
                    appWidgetManager.updateAppWidget(i, (RemoteViews) obj);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bundle = (Bundle) this.h;
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            int i3 = this.m;
            bundle = this.k;
            if (bundle == null) {
                bundle = this.l.getAppWidgetOptions(i3);
                com.amazon.aps.iva.yb0.j.c(bundle);
            }
            com.amazon.aps.iva.z4.b<?> i4 = this.n.i();
            if (i4 != null) {
                com.amazon.aps.iva.z4.a aVar2 = com.amazon.aps.iva.z4.a.a;
                String u = defpackage.i.u(i3);
                this.h = bundle;
                this.j = 1;
                obj = aVar2.c(this.o, i4, u, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                obj = null;
            }
        }
        Object obj2 = obj;
        Bundle bundle2 = bundle;
        appWidgetManager = this.l;
        int i5 = this.m;
        z zVar = this.n;
        Context context = this.o;
        this.h = appWidgetManager;
        this.i = i5;
        this.j = 2;
        Object d = zVar.d(context, appWidgetManager, i5, obj2, bundle2, this);
        if (d == aVar) {
            return aVar;
        }
        i = i5;
        obj = d;
        appWidgetManager.updateAppWidget(i, (RemoteViews) obj);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
