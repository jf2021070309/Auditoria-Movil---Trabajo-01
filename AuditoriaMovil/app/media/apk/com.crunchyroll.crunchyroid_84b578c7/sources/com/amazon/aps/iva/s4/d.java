package com.amazon.aps.iva.s4;

import android.app.PendingIntent;
import android.content.Intent;
import android.widget.RemoteViews;
/* compiled from: ApplyAction.kt */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public final void a(RemoteViews remoteViews, int i, PendingIntent pendingIntent) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        com.amazon.aps.iva.yb0.j.f(pendingIntent, "intent");
        remoteViews.setOnCheckedChangeResponse(i, RemoteViews.RemoteResponse.fromPendingIntent(pendingIntent));
    }

    public final void b(RemoteViews remoteViews, int i, Intent intent) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        remoteViews.setOnCheckedChangeResponse(i, RemoteViews.RemoteResponse.fromFillInIntent(intent));
    }

    public final void c(RemoteViews remoteViews, int i) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        remoteViews.setOnCheckedChangeResponse(i, new RemoteViews.RemoteResponse());
    }

    public final void d(RemoteViews remoteViews, int i) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        remoteViews.setOnClickResponse(i, new RemoteViews.RemoteResponse());
    }
}
