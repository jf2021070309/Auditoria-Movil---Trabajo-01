package com.amazon.aps.iva.x50;

import android.content.SharedPreferences;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.model.Channel;
import java.util.Iterator;
import java.util.List;
/* compiled from: ApplicationState.kt */
/* loaded from: classes2.dex */
public final class c implements a {
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final String c;
    public List<Channel> d;

    public c(CrunchyrollApplication crunchyrollApplication) {
        com.amazon.aps.iva.yb0.j.f(crunchyrollApplication, "application");
        SharedPreferences sharedPreferences = crunchyrollApplication.getSharedPreferences("appStateStore", 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "application.getSharedPre…RE, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
        SharedPreferences a = androidx.preference.e.a(crunchyrollApplication.getBaseContext());
        com.amazon.aps.iva.yb0.j.e(a, "getDefaultSharedPreferen…(application.baseContext)");
        this.b = a;
        com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.ts.b.a;
        com.amazon.aps.iva.ts.b.a.getClass();
        this.c = com.amazon.aps.iva.ts.a.e;
    }

    @Override // com.amazon.aps.iva.x50.a
    public final boolean a() {
        CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
        return this.b.getBoolean(CrunchyrollApplication.a.a().getString(R.string.key_switch_sync_over_cellular), false);
    }

    @Override // com.amazon.aps.iva.x50.a
    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.b.edit();
        CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
        edit.putBoolean(CrunchyrollApplication.a.a().getString(R.string.key_switch_sync_over_cellular), z).apply();
    }

    @Override // com.amazon.aps.iva.x50.a
    public final Channel c(String str) {
        List<Channel> list;
        com.amazon.aps.iva.yb0.j.f(str, "id");
        Object obj = null;
        String string = this.a.getString(defpackage.b.c(new StringBuilder(), this.c, "channels"), null);
        if (string != null) {
            list = (List) GsonHolder.getInstance().fromJson(string, new b().getType());
            this.d = list;
        } else {
            com.amazon.aps.iva.mf0.a.a.c("Failed to get channel list from cache", new Object[0]);
            list = null;
        }
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (com.amazon.aps.iva.oe0.m.Z(((Channel) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (Channel) obj;
    }

    public final void d(List<Channel> list) {
        this.a.edit().putString(defpackage.b.c(new StringBuilder(), this.c, "channels"), GsonHolder.getInstance().toJson(list)).apply();
        this.d = list;
    }
}
