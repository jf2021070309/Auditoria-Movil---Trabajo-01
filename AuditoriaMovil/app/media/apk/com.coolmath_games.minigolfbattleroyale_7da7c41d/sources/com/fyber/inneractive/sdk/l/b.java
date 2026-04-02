package com.fyber.inneractive.sdk.l;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.f;
import com.fyber.inneractive.sdk.config.l;
import com.fyber.inneractive.sdk.dv.g;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.ac;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.s;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class b implements c {
    private static final List<Integer> a = Arrays.asList(5);
    private static final List<Integer> b = Arrays.asList(Integer.valueOf(com.fyber.inneractive.sdk.k.a.a.a.VAST_2_0.g), Integer.valueOf(com.fyber.inneractive.sdk.k.a.a.a.VAST_2_0_WRAPPER.g));
    private static final List<String> c = Arrays.asList("video/mp4", "video/webm", "video/3gpp");
    private final s d;
    private Location e;
    private String f = k.a();

    public b(s sVar) {
        com.fyber.inneractive.sdk.util.s sVar2;
        sVar2 = s.a.a;
        this.e = sVar2.a();
        this.d = sVar;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final List<Integer> a() {
        return a;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final List<Integer> b() {
        return b;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final List<String> c() {
        return c;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String d() {
        return k.f();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String e() {
        return k.g();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String a(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('-');
        sb.append("Android-7.8.4");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String f() {
        String d = f.d();
        return TextUtils.isEmpty(d) ? l.a() : d;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final boolean g() {
        return l.c();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final Boolean h() {
        return IAConfigManager.g().b();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final JSONArray i() {
        com.fyber.inneractive.sdk.config.a.s sVar = this.d;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final void a(Map<String, String> map, String str) {
        map.put("frmn", a.a());
        map.put("dsk_t", a(a.e()));
        map.put("dsk_a", a(a.c()));
        map.put("headset", a(a.d()));
        map.put("is_muted", a.f());
        map.put("btry_c", a(a.g()));
        map.put("btry_l", a.h());
        map.put("bt_con", a(a.i()));
        map.put("tod", a(a.l()));
        map.put("apnm", a(a.j()));
        map.put("dnd", a(a.k()));
        map.put("lng", IAConfigManager.n.k);
        String a2 = IAConfigManager.n().a(a.a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(a2) && a2.contains(",")) {
            a2 = a2.split(",")[0];
        }
        map.put("ldomain", a2);
        map.put("lbundle", IAConfigManager.n().a(a.a(str), "LAST_APP_BUNDLE_ID"));
        String a3 = IAConfigManager.n().a(a.a(str), "LAST_CLICKED");
        if (TextUtils.equals(a3, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            a3 = "";
        }
        map.put("lclick", a3);
        String a4 = IAConfigManager.n().a(a.a(str), "LAST_VAST_SKIPED");
        map.put("v_lskip", TextUtils.equals(a4, AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "" : a4);
        map.put("v_lclicktype", IAConfigManager.n().a(a.a(str), "LAST_VAST_CLICKED_TYPE"));
        map.put("sdur", a(Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - IAConfigManager.n().a("SESSION_STAMP"), TimeUnit.MILLISECONDS))));
        map.put("userid", IAConfigManager.o());
        map.put("low_power_mode", a(a.b()));
        map.put("dark_mode", a(Boolean.valueOf((com.fyber.inneractive.sdk.util.l.p().getResources().getConfiguration().uiMode & 48) == 32)));
        map.put("d_api", String.valueOf(Build.VERSION.SDK_INT));
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final g b(String str) {
        return IAConfigManager.d().a(a.a(str));
    }

    private static String a(Boolean bool) {
        return bool == null ? "" : bool.booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    private static String a(Long l) {
        return l == null ? "" : String.valueOf(l);
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final boolean k() {
        return this.e != null;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String l() {
        if (k()) {
            return String.valueOf(this.e.getLatitude());
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String m() {
        if (k()) {
            return String.valueOf(this.e.getLongitude());
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String n() {
        if (!k() || this.e.getAccuracy() == 0.0d) {
            return null;
        }
        return String.valueOf(this.e.getAccuracy());
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String o() {
        if (k()) {
            float b2 = com.fyber.inneractive.sdk.util.l.b(this.e);
            if (b2 != 0.0d) {
                return String.valueOf(b2);
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String p() {
        if (k()) {
            double a2 = com.fyber.inneractive.sdk.util.l.a(this.e);
            if (a2 >= 0.0d) {
                return String.format(Locale.ENGLISH, "%.2f", Double.valueOf(a2));
            }
            return null;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String q() {
        return k.h();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String r() {
        return ac.a().f;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String s() {
        return k.e();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String t() {
        return k.b(this.f);
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String u() {
        return k.a(this.f);
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String v() {
        return k.i();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final int A() {
        return com.fyber.inneractive.sdk.util.l.s();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final void j() {
        com.fyber.inneractive.sdk.util.s sVar;
        sVar = s.a.a;
        this.e = sVar.a();
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final String w() {
        return IAConfigManager.n.k;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final List<String> x() {
        return IAConfigManager.n.l;
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final int y() {
        return com.fyber.inneractive.sdk.util.l.a(com.fyber.inneractive.sdk.util.l.x());
    }

    @Override // com.fyber.inneractive.sdk.l.c
    public final int z() {
        return com.fyber.inneractive.sdk.util.l.a(com.fyber.inneractive.sdk.util.l.w());
    }
}
