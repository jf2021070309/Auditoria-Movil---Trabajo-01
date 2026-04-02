package com.fyber.inneractive.sdk.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class p {
    private static String a = "AutoWebActionPrefs";
    private static String b = "lastReportTS";
    private static String c = "numReportsToday";
    private SharedPreferences d;

    /* loaded from: classes.dex */
    static final class a {
        static p a = new p((byte) 0);
    }

    /* synthetic */ p(byte b2) {
        this();
    }

    private p() {
        this.d = null;
    }

    public static void a(Context context, String str, String str2, com.fyber.inneractive.sdk.d.g<? extends com.fyber.inneractive.sdk.j.e> gVar) {
        int i;
        if (context == null || str == null || gVar.f() == null) {
            IAlog.b("Invalid report request parameters!", new Object[0]);
            return;
        }
        p pVar = a.a;
        if (pVar.d == null) {
            pVar.d = context.getSharedPreferences(a, 0);
        }
        p pVar2 = a.a;
        IAlog.a("IAautoWebActionReporter: reporting action: %s", str);
        IAlog.a("IAautoWebActionReporter: url: %s", str2);
        if (!IAConfigManager.n.h.e) {
            IAlog.b("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
            return;
        }
        n.a aVar = new n.a(l.MRAID_AUTO_ACTION_DETECTED, gVar.g(), gVar.f(), gVar.i().b());
        n.b bVar = new n.b();
        bVar.a("action", str);
        if (!TextUtils.isEmpty(str2)) {
            bVar.a("url", str2);
        }
        long j = pVar2.d.getLong(b, 0L);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j);
        if (j <= 0 || calendar.get(6) != calendar2.get(6)) {
            i = 0;
        } else {
            IAlog.a("IAautoWebActionReporter: encountered same date", new Object[0]);
            i = pVar2.d.getInt(c, 0);
        }
        int i2 = IAConfigManager.n.h.f;
        int i3 = i + 1;
        IAlog.a("IAautoWebActionReporter: day counter: %d max: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        if (i < i2) {
            IAlog.a("IAautoWebActionReporter: adding ad data", new Object[0]);
            aVar.g = true;
        } else {
            IAlog.a("IAautoWebActionReporter: not adding ad data", new Object[0]);
        }
        bVar.a("daily_count", Integer.valueOf(i3));
        aVar.a(bVar).b(null);
        SharedPreferences.Editor edit = pVar2.d.edit();
        edit.putLong(b, calendar.getTimeInMillis());
        edit.putInt(c, i3);
        edit.apply();
    }
}
