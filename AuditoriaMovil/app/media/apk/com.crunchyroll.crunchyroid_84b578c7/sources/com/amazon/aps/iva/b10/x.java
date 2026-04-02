package com.amazon.aps.iva.b10;

import android.app.PendingIntent;
import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Episode;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: SummaryNotificationView.kt */
/* loaded from: classes2.dex */
public final class x extends com.ellation.crunchyroll.presentation.download.notification.a implements w {
    public final com.amazon.aps.iva.p0.e e;
    public final com.amazon.aps.iva.c3.r f;

    public x(Context context) {
        super(context);
        this.e = new com.amazon.aps.iva.p0.e(context);
        this.f = new com.amazon.aps.iva.c3.r();
    }

    @Override // com.amazon.aps.iva.b10.w
    public final void d(int i, j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "notificationData");
        Episode episode = jVar.a;
        com.amazon.aps.iva.c3.s m = m(episode, episode.getSeasonId());
        m.f(2, true);
        m.f(16, false);
        com.amazon.aps.iva.p0.e eVar = this.e;
        eVar.getClass();
        String string = ((Context) eVar.b).getString(R.string.notification_bulk_progress, Integer.valueOf(jVar.b), Integer.valueOf(jVar.c));
        com.amazon.aps.iva.yb0.j.e(string, "with(notificationData) {…t\n            )\n        }");
        com.amazon.aps.iva.c3.r rVar = this.f;
        rVar.a(string);
        m.h(rVar);
        m.e(o(episode));
        m.n = 100;
        m.o = 100;
        m.p = true;
        n(i, m);
    }

    @Override // com.amazon.aps.iva.b10.w
    public final void e(int i, j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "notificationData");
        Episode episode = jVar.a;
        com.amazon.aps.iva.c3.s m = m(episode, episode.getSeasonId());
        m.e(o(episode));
        com.amazon.aps.iva.p0.e eVar = this.e;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        Object obj = eVar.b;
        int i2 = jVar.b;
        if (i2 > 0) {
            arrayList.add(((Context) obj).getString(R.string.notification_bulk_complete, Integer.valueOf(i2), Integer.valueOf(jVar.c)));
        }
        int i3 = jVar.d;
        if (i3 > 0) {
            arrayList.add(((Context) obj).getString(R.string.notification_bulk_paused, Integer.valueOf(i3)));
        }
        int i4 = jVar.e;
        if (i4 > 0) {
            arrayList.add(((Context) obj).getString(R.string.notification_bulk_all_failed, Integer.valueOf(i4)));
        }
        m.d(com.amazon.aps.iva.lb0.x.B0(arrayList, ", ", null, null, null, 62));
        n(i, m);
    }

    @Override // com.amazon.aps.iva.b10.w
    public final void f() {
        this.c.cancelAll();
    }

    @Override // com.amazon.aps.iva.b10.w
    public final void h() {
        com.amazon.aps.iva.c3.s m = m(null, String.valueOf(1122));
        Context context = this.a;
        m.e(context.getString(R.string.notification_out_of_storage_title));
        m.d(context.getString(R.string.notification_out_of_storage_text));
        m.g = PendingIntent.getActivity(context, 1122, this.b.c(), 201326592);
        n(1122, m);
    }

    public final String o(Episode episode) {
        com.amazon.aps.iva.p0.e eVar = this.e;
        eVar.getClass();
        com.amazon.aps.iva.yb0.j.f(episode, "episode");
        if (com.amazon.aps.iva.oe0.m.b0(episode.getSeasonNumber())) {
            String seriesTitle = episode.getSeriesTitle();
            Locale locale = Locale.getDefault();
            com.amazon.aps.iva.yb0.j.e(locale, "getDefault()");
            String upperCase = seriesTitle.toUpperCase(locale);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        String string = ((Context) eVar.b).getString(R.string.notification_bulk_title, episode.getSeasonNumber(), episode.getSeriesTitle());
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(\n     …seriesTitle\n            )");
        Locale locale2 = Locale.getDefault();
        com.amazon.aps.iva.yb0.j.e(locale2, "getDefault()");
        String upperCase2 = string.toUpperCase(locale2);
        com.amazon.aps.iva.yb0.j.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        return upperCase2;
    }
}
