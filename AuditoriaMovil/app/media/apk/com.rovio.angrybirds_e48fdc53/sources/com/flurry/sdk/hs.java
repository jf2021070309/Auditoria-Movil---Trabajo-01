package com.flurry.sdk;

import android.content.Context;
import com.flurry.android.FlurryEventRecordStatus;
import com.kuaishou.weapon.p0.g;
import java.util.Map;
/* loaded from: classes2.dex */
public class hs implements kr {
    private static final String d = hs.class.getSimpleName();
    public in a;
    public jf b;
    public ip c;

    public static synchronized hs a() {
        hs hsVar;
        synchronized (hs.class) {
            hsVar = (hs) ka.a().a(hs.class);
        }
        return hsVar;
    }

    @Override // com.flurry.sdk.kr
    public final void a(Context context) {
        lm.a(jj.class);
        this.b = new jf();
        this.a = new in();
        this.c = new ip();
        if (!ma.a(context, g.a)) {
            ko.b(d, "Application must declare permission: android.permission.INTERNET");
        }
        if (ma.a(context, g.b)) {
            return;
        }
        ko.e(d, "It is highly recommended that the application declare permission: android.permission.ACCESS_NETWORK_STATE");
    }

    public static jj b() {
        lm b = lo.a().b();
        if (b == null) {
            return null;
        }
        return (jj) b.b(jj.class);
    }

    public static FlurryEventRecordStatus a(String str, Map<String, String> map, int i) {
        jj b = b();
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (b != null) {
            return b.a(str, map, false, i);
        }
        return flurryEventRecordStatus;
    }

    public static FlurryEventRecordStatus a(String str, String str2, Map<String, String> map) {
        jj b = b();
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (b != null) {
            return b.a(str, jl.a(str2), map);
        }
        return flurryEventRecordStatus;
    }

    public static void a(String str, String str2, Throwable th) {
        jj b = b();
        if (b != null) {
            b.a(str, str2, th.getClass().getName(), th);
        }
    }
}
