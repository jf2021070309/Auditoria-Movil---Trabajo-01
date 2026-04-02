package com.amazon.aps.iva.r4;

import android.appwidget.AppWidgetManager;
import android.content.Context;
/* compiled from: GlanceAppWidget.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidget", f = "GlanceAppWidget.kt", l = {452}, m = "safeRun")
/* loaded from: classes.dex */
public final class b0 extends com.amazon.aps.iva.qb0.c {
    public z h;
    public Context i;
    public AppWidgetManager j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ z m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z zVar, com.amazon.aps.iva.ob0.d<? super b0> dVar) {
        super(dVar);
        this.m = zVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.j(null, null, 0, null, this);
    }
}
