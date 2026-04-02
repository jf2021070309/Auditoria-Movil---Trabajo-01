package com.crunchyroll.appwidgets.continuewatching;

import android.content.Context;
import com.amazon.aps.iva.es.h0;
import com.amazon.aps.iva.gd0.j;
import com.amazon.aps.iva.js.t0;
import com.amazon.aps.iva.k9.e;
import com.amazon.aps.iva.k9.f;
import com.amazon.aps.iva.k9.r;
import com.amazon.aps.iva.l9.g;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.r4.l0;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: ContinueWatchingWidgetReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/crunchyroll/appwidgets/continuewatching/ContinueWatchingWidgetReceiver;", "Lcom/amazon/aps/iva/r4/l0;", "<init>", "()V", "app-widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContinueWatchingWidgetReceiver extends l0 {
    public final com.amazon.aps.iva.sd.b a = j.e();
    public final c b = new c();

    @Override // com.amazon.aps.iva.r4.l0
    public final c b() {
        return this.b;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        super.onDisabled(context);
        k c = k.c(context);
        c.getClass();
        ((com.amazon.aps.iva.w9.b) c.d).a(new com.amazon.aps.iva.u9.c(c, "ContinueWatchingWorker", true));
        com.amazon.aps.iva.sd.b bVar = this.a;
        bVar.getClass();
        bVar.a.e(new com.amazon.aps.iva.es.b(t0.CONTINUE_WATCHING));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        super.onEnabled(context);
        k c = k.c(context);
        com.amazon.aps.iva.yb0.j.e(c, "getInstance(context)");
        r.a aVar = new r.a(TimeUnit.MINUTES);
        e eVar = e.REPLACE;
        new g(c, "ContinueWatchingWorker", f.KEEP, Collections.singletonList(aVar.a())).a();
        com.amazon.aps.iva.sd.b bVar = this.a;
        bVar.getClass();
        bVar.a.e(new h0(t0.CONTINUE_WATCHING));
    }
}
