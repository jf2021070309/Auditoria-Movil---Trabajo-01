package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kuaishou.weapon.p0.jni.A;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class cm {
    private Context a;
    private int b;

    public cm(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public String a(String str) {
        JSONObject a;
        try {
            JSONObject a2 = new cl(str, cj.j).a(this.a);
            if (a2 == null || (a = a()) == null) {
                return null;
            }
            a2.put("module_section", a);
            return a2.toString();
        } catch (Throwable th) {
            return null;
        }
    }

    public JSONObject a() {
        long j;
        h hVar;
        boolean z;
        boolean z2;
        String str;
        String str2;
        cm cmVar;
        String str3;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            h a = h.a(this.a, "re_po_rt");
            boolean e = a.e("a1_p_s_p_s");
            boolean e2 = a.e("a1_p_s_p_s_c_b");
            if (a.b(de.aI, 1) == 1 && (e || e2)) {
                String a2 = bg.a(this.a);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("RISK")) {
                    jSONObject.put("01001", a2);
                }
                String c = bg.c(this.a);
                if (!TextUtils.isEmpty(c) && !c.startsWith("RISK")) {
                    jSONObject.put("01003", c);
                }
                String b = bg.b(this.a, 0);
                if (!TextUtils.isEmpty(b) && !b.startsWith("RISK")) {
                    jSONObject.put("01019", b);
                }
                String b2 = bg.b(this.a, 1);
                if (!TextUtils.isEmpty(b2) && !b2.startsWith("RISK")) {
                    jSONObject.put("01004", b2);
                }
                String d = bg.d(this.a);
                if (!TextUtils.isEmpty(d) && !d.startsWith("RISK")) {
                    jSONObject.put("01007", d);
                }
            }
            if (a.b(de.aJ, 0) == 1 && (e || e2)) {
                bf bfVar = new bf();
                if (a.b(de.aW, 1) == 1) {
                    jSONObject.put("10020", bfVar.f(this.a));
                }
            }
            if (a.b(de.aK, 1) == 1 && (e || e2)) {
                jSONObject.put("01011", bg.e(this.a));
            }
            if (a.b(de.aL, 1) == 1 && (e || e2)) {
                String p = bg.p(this.a);
                if (!TextUtils.isEmpty(p) && !p.startsWith("RISK")) {
                    jSONObject.put("01016", p);
                }
            }
            if (a.b(de.az, 1) == 1) {
                if (e || e2) {
                    String f = bg.f(this.a);
                    if (!TextUtils.isEmpty(f) && !f.startsWith("RISK")) {
                        jSONObject.put("01013", f);
                    }
                    jSONObject.put("02042", bg.v(this.a));
                }
                jSONObject.put("02054", bg.z(this.a));
                j = currentTimeMillis;
                str = "RISK";
                z2 = e2;
                z = e;
                try {
                    if (Engine.loadSuccess) {
                        try {
                            jSONObject.put("02019", bk.b(this.a));
                            jSONObject.put("02021", bk.d(this.a));
                            jSONObject.put("02022", bk.c(this.a));
                            jSONObject.put("02030", bk.f(this.a));
                            cd cdVar = new cd(this.a);
                            jSONObject.put("01014", cdVar.a("01014") != null ? cdVar.a("01014") : "");
                            jSONObject.put("02001", cdVar.a("02001") != null ? cdVar.a("02001") : bk.a());
                            jSONObject.put("02002", cdVar.a("02002") != null ? cdVar.a("02002") : bk.b());
                            jSONObject.put("02003", cdVar.a("02003") != null ? cdVar.a("02003") : bk.c());
                            jSONObject.put("02004", cdVar.a("02004") != null ? cdVar.a("02004") : bk.d());
                            jSONObject.put("02005", cdVar.a("02005") != null ? cdVar.a("02005") : bk.e());
                            jSONObject.put("02006", cdVar.a("02006") != null ? cdVar.a("02006") : bk.f());
                            jSONObject.put("02007", cdVar.a("02007") != null ? cdVar.a("02007") : bk.g());
                            jSONObject.put("02008", cdVar.a("02008") != null ? cdVar.a("02008") : bk.h());
                            jSONObject.put("02009", cdVar.a("02009") != null ? cdVar.a("02009") : bk.i());
                            jSONObject.put("02010", cdVar.a("02010") != null ? cdVar.a("02010") : bk.j());
                            jSONObject.put("02011", cdVar.a("02011") != null ? cdVar.a("02011") : bk.k());
                            jSONObject.put("02012", cdVar.a("02012") != null ? cdVar.a("02012") : bk.l());
                            jSONObject.put("02013", cdVar.a("02013") != null ? cdVar.a("02013") : bk.m());
                            jSONObject.put("02014", cdVar.a("02014") != null ? cdVar.a("02014") : bk.n());
                            jSONObject.put("02015", cdVar.a("02015") != null ? cdVar.a("02015") : bk.p());
                            jSONObject.put("02016", cdVar.a("02016") != null ? cdVar.a("02016") : bk.q());
                            jSONObject.put("02017", cdVar.a("02017") != null ? cdVar.a("02017") : Integer.valueOf(bk.r()));
                            jSONObject.put("02018", cdVar.a("02018") != null ? cdVar.a("02018") : bk.s());
                            jSONObject.put("02020", cdVar.a("02020") != null ? cdVar.a("02020") : bk.u());
                            jSONObject.put("02023", cdVar.a("02023") != null ? cdVar.a("02023") : "");
                            jSONObject.put("02031", cdVar.a("02031") != null ? cdVar.a("02031") : bk.y());
                            jSONObject.put("02032", cdVar.a("02032") != null ? cdVar.a("02032") : bk.o());
                            jSONObject.put("02033", cdVar.a("02033") != null ? cdVar.a("02033") : bk.x());
                            jSONObject.put("02034", cdVar.a("02034") != null ? cdVar.a("02034") : bk.z());
                            jSONObject.put("02035", cdVar.a("02035") != null ? cdVar.a("02035") : bk.A());
                            jSONObject.put("02036", cdVar.a("02036") != null ? cdVar.a("02036") : "");
                            jSONObject.put("02037", cdVar.a("02037") != null ? cdVar.a("02037") : bk.w());
                            jSONObject.put("02038", cdVar.a("02038") != null ? cdVar.a("02038") : bk.v());
                            jSONObject.put("02045", cdVar.a("02045") != null ? cdVar.a("02045") : bk.B());
                        } catch (Exception e3) {
                        }
                        cmVar = this;
                    } else {
                        jSONObject.put("02001", bk.a());
                        jSONObject.put("02002", bk.b());
                        jSONObject.put("02003", bk.c());
                        jSONObject.put("02004", bk.d());
                        jSONObject.put("02005", bk.e());
                        jSONObject.put("02006", bk.f());
                        jSONObject.put("02007", bk.g());
                        jSONObject.put("02008", bk.h());
                        jSONObject.put("02009", bk.i());
                        jSONObject.put("02010", bk.j());
                        jSONObject.put("02011", bk.k());
                        jSONObject.put("02012", bk.l());
                        jSONObject.put("02013", bk.m());
                        jSONObject.put("02014", bk.n());
                        jSONObject.put("02015", bk.p());
                        jSONObject.put("02016", bk.q());
                        jSONObject.put("02017", bk.r());
                        jSONObject.put("02018", bk.s());
                        cmVar = this;
                        try {
                            jSONObject.put("02019", bk.b(cmVar.a));
                            jSONObject.put("02020", bk.u());
                            jSONObject.put("02021", bk.d(cmVar.a));
                            jSONObject.put("02022", bk.c(cmVar.a));
                            jSONObject.put("02030", bk.f(cmVar.a));
                            jSONObject.put("02031", bk.y());
                            jSONObject.put("02032", bk.o());
                            jSONObject.put("02033", bk.x());
                            jSONObject.put("02034", bk.z());
                            jSONObject.put("02035", bk.A());
                            jSONObject.put("02037", bk.w());
                            jSONObject.put("02038", bk.v());
                            jSONObject.put("02045", bk.B());
                        } catch (Throwable th) {
                            return null;
                        }
                    }
                    str2 = "";
                    jSONObject.put("02067", cmVar.a.getApplicationContext().getPackageResourcePath().replace("/data/app/", str2).replace("/base.apk", str2));
                    jSONObject.put("02039", bg.h());
                    jSONObject.put("02040", bg.i());
                    jSONObject.put("02041", bg.u(cmVar.a));
                    jSONObject.put("02044", bk.t());
                    jSONObject.put("02046", bk.C());
                    String a3 = bg.a("persist.service.adb.enable");
                    if (!TextUtils.isEmpty(a3)) {
                        jSONObject.put("03058", a3);
                    }
                    String a4 = bg.a("sys.resettype");
                    if (!TextUtils.isEmpty(a4)) {
                        jSONObject.put("03057", a4);
                    }
                    String a5 = bg.a("ro.boot.bootreason");
                    if (!TextUtils.isEmpty(a5)) {
                        jSONObject.put("03056", a5);
                    }
                    String a6 = bg.a("ro.runtime.firstboot");
                    if (!TextUtils.isEmpty(a6)) {
                        jSONObject.put("03055", a6);
                    }
                    String a7 = bg.a("init.svc.atcmdserver");
                    if (!TextUtils.isEmpty(a7)) {
                        jSONObject.put("03054", a7);
                    }
                    String a8 = bg.a("ro.build.date.utc");
                    if (!TextUtils.isEmpty(a8)) {
                        jSONObject.put("03061", a8);
                    }
                    String a9 = bg.a("ro.bootimage.build.date.utc");
                    if (!TextUtils.isEmpty(a9)) {
                        jSONObject.put("03062", a9);
                    }
                    String a10 = bg.a("ro.build.date.YmdHM");
                    if (!TextUtils.isEmpty(a10)) {
                        jSONObject.put("03063", a10);
                    }
                    String a11 = bg.a("dhcp.ipv6.wlan0.dns1");
                    if (!TextUtils.isEmpty(a11)) {
                        jSONObject.put("03067", a11);
                    }
                    String a12 = bg.a("dhcp.ipv6.wlan0.dns2");
                    if (!TextUtils.isEmpty(a12)) {
                        jSONObject.put("03068", a12);
                    }
                    String a13 = bg.a("dhcp.wlan0.dns1");
                    if (!TextUtils.isEmpty(a13)) {
                        jSONObject.put("03069", a13);
                    }
                    String a14 = bg.a("dhcp.wlan0.dns2");
                    if (!TextUtils.isEmpty(a14)) {
                        jSONObject.put("03070", a14);
                    }
                    String a15 = bg.a("net.change");
                    if (!TextUtils.isEmpty(a15)) {
                        jSONObject.put("03071", a15);
                    }
                    String a16 = bg.a("net.dns1");
                    if (!TextUtils.isEmpty(a16)) {
                        jSONObject.put("03072", a16);
                    }
                    String a17 = bg.a("net.dns2");
                    if (!TextUtils.isEmpty(a17)) {
                        jSONObject.put("03073", a17);
                    }
                    hVar = a;
                    long a18 = hVar.a(de.d, -1L);
                    if (a18 != -1) {
                        jSONObject.put("03074", a18 + System.currentTimeMillis());
                    }
                    try {
                        jSONObject.put("03064", Settings.System.getInt(cmVar.a.getContentResolver(), "screen_brightness_mode"));
                        jSONObject.put("03065", Settings.System.getInt(cmVar.a.getContentResolver(), "accelerometer_rotation"));
                    } catch (Throwable th2) {
                    }
                    jSONObject.put("03081", bk.L());
                    jSONObject.put("03053", bg.A(cmVar.a));
                    jSONObject.put("03052", bk.i(cmVar.a));
                    jSONObject.put("03050", bk.h(cmVar.a));
                    jSONObject.put("03049", bk.g(cmVar.a));
                    jSONObject.put("02027", bk.H());
                    jSONObject.put("02028", bk.D());
                    jSONObject.put("02029", bk.E());
                    jSONObject.put("02057", bk.F());
                    jSONObject.put("02058", bk.G());
                } catch (Throwable th3) {
                    return null;
                }
            } else {
                j = currentTimeMillis;
                hVar = a;
                z = e;
                z2 = e2;
                str = "RISK";
                str2 = "";
                cmVar = this;
            }
            if (hVar.b(de.aA, 1) == 1) {
                jSONObject.put("03001", bn.a());
                jSONObject.put("03002", bn.b());
                jSONObject.put("03001", bn.a());
                jSONObject.put("03043", SystemClock.elapsedRealtime());
                jSONObject.put("03044", SystemClock.uptimeMillis());
                jSONObject.put("03045", System.currentTimeMillis() - SystemClock.elapsedRealtime());
                bx bxVar = new bx(cmVar.a);
                if (Engine.loadSuccess) {
                    jSONObject.put("03004", bxVar.a("03004") != null ? bxVar.a("03004") : str2);
                    jSONObject.put("03036", bxVar.b("03036") != null ? bxVar.b("03036") : str2);
                    jSONObject.put("03039", bxVar.a("03039") != null ? bxVar.a("03039") : str2);
                    jSONObject.put("03040", bxVar.a("03040") != null ? bxVar.a("03040") : str2);
                    jSONObject.put("03041", bxVar.a("03041") != null ? bxVar.a("03041") : str2);
                    jSONObject.put("03042", bxVar.a("03042") != null ? bxVar.a("03042") : str2);
                    jSONObject.put("03079", bxVar.a("03079") != null ? bxVar.a("03079") : null);
                    jSONObject.put("03080", bxVar.a("03080") != null ? bxVar.a("03080") : null);
                }
                jSONObject.put("03007", bu.a(cmVar.a));
                jSONObject.put("03008", bu.c(cmVar.a));
                jSONObject.put("03011", am.b(cmVar.a));
                jSONObject.put("03012", am.b());
                jSONObject.put("03014", bg.g(cmVar.a));
                jSONObject.put("03034", bg.h(cmVar.a));
                jSONObject.put("03020", bu.b(cmVar.a));
                jSONObject.put("03037", bk.I());
                jSONObject.put("03038", bk.J());
                jSONObject.put("03077", bk.K());
                try {
                    bf bfVar2 = new bf();
                    jSONObject.put("03006", bfVar2.a(cmVar.a));
                    jSONObject.put("03010", bfVar2.b(cmVar.a));
                    jSONObject.put("03033", bfVar2.c(cmVar.a));
                    jSONObject.put("03013", bfVar2.a());
                    jSONObject.put("03021", bfVar2.e(cmVar.a));
                    jSONObject.put("03030", bf.d(cmVar.a));
                    jSONObject.put("10031", bfVar2.b());
                } catch (Exception e4) {
                }
            }
            if (hVar.b(de.aO, 1) == 1) {
                jSONObject.put("03019", bg.k(cmVar.a));
                String l = bg.l(cmVar.a);
                if (!TextUtils.isEmpty(l)) {
                    jSONObject.put("03046", l);
                }
                String m = bg.m(cmVar.a);
                if (!TextUtils.isEmpty(m)) {
                    jSONObject.put("03047", m);
                }
                jSONObject.put("03018", bg.i(cmVar.a));
            }
            if (hVar.b(de.aP, 1) == 1) {
                jSONObject.put("02059", bl.a(cmVar.a));
                jSONObject.put("02060", bl.a());
                jSONObject.put("02061", bl.b());
                jSONObject.put("02062", bl.c());
                if (Engine.loadSuccess) {
                    bz bzVar = new bz(cmVar.a);
                    jSONObject.put("08001", bzVar.a("08001") != null ? bzVar.a("08001") : str2);
                }
                JSONObject d2 = bl.d();
                if (d2 != null && d2.length() > 0) {
                    jSONObject.put("10050", d2);
                }
            }
            if (hVar.b(de.aN, 1) == 1 && (z || z2)) {
                jSONObject.put("03029", bg.j(cmVar.a));
            }
            if (hVar.b(de.aB, 1) == 1) {
                if (Engine.loadSuccess) {
                    by byVar = new by(cmVar.a);
                    jSONObject.put("04001", byVar.a("04001") != null ? byVar.a("04001") : str2);
                    jSONObject.put("04002", byVar.a("04002") != null ? byVar.a("04002") : str2);
                    jSONObject.put("04003", byVar.a("04003") != null ? byVar.a("04003") : str2);
                    jSONObject.put("04004", byVar.a("04004") != null ? byVar.a("04004") : str2);
                } else {
                    try {
                        bi b3 = bj.b();
                        jSONObject.put("04001", bj.a());
                        jSONObject.put("04002", b3.b());
                        jSONObject.put("04003", b3.c());
                        jSONObject.put("04004", b3.a());
                    } catch (Exception e5) {
                    }
                }
            }
            if (hVar.b(de.aE, 0) == 1 && (z || z2)) {
                Object e6 = bg.e();
                if (e6 != null) {
                    jSONObject.put("06014", e6);
                }
                if (Engine.loadSuccess) {
                    ce ceVar = new ce(cmVar.a);
                    jSONObject.put("06015", ceVar.b("06015") != null ? ceVar.b("06015") : str2);
                }
            }
            if (z || z2) {
                String g = bg.g();
                if (!TextUtils.isEmpty(g) && !g.startsWith(str)) {
                    str3 = "07005";
                } else if (g == null) {
                    jSONObject.put("07005", str2);
                } else {
                    str3 = "07005";
                }
                jSONObject.put(str3, g);
            }
            if (hVar.b(de.aC, 0) == 1 && (z || z2)) {
                if (Engine.loadSuccess) {
                    jSONObject.put("07007", new cb(cmVar.a).a("07007"));
                }
                JSONArray a19 = bq.a(cmVar.a);
                if (a19 != null && a19.length() > 0) {
                    jSONObject.put("03035", a19);
                }
            }
            if (z || z2) {
                try {
                    double a20 = bg.a();
                    if (a20 > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a20);
                        jSONObject.put("09002", sb.toString());
                    }
                    double b4 = bg.b();
                    if (b4 > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b4);
                        jSONObject.put("09003", sb2.toString());
                    }
                    jSONObject.put("09001", bg.c());
                } catch (Exception e7) {
                }
            }
            if (hVar.b(de.aG, 0) == 1 && (z || z2)) {
                jSONObject.put("10002", new w(cmVar.a).a(1));
            }
            if (hVar.b(de.aD, 1) == 1 && Engine.loadSuccess) {
                String a21 = new cc(cmVar.a).a("05001");
                try {
                    if (!TextUtils.isEmpty(a21) && a21.length() > 10) {
                        jSONObject.put("05001", new JSONArray(a21));
                    }
                } catch (Exception e8) {
                }
            }
            if (Engine.loadSuccess) {
                ca caVar = new ca(cmVar.a);
                jSONObject.put("13001", caVar.a("13001") != null ? caVar.a("13001") : str2);
            }
            jSONObject.put("11000", Engine.loadSuccess ? 1 : 0);
            jSONObject.put("11002", Engine.soVersion);
            jSONObject.put("11003", bh.v);
            jSONObject.put("11004", Engine.loadSoCount);
            jSONObject.put("11006", z ? 1 : 0);
            jSONObject.put("11029", z2 ? 1 : 0);
            jSONObject.put("11008", hVar.b(de.g, bp.e));
            jSONObject.put("11009", br.a(cmVar.a.getApplicationContext()));
            try {
                String y = bg.y(cmVar.a);
                if (!TextUtils.isEmpty(y)) {
                    jSONObject.put("01026", y);
                }
                if (hVar.b(de.aF, 1) == 1) {
                    try {
                        String Fo = com.kwad.sdk.f.b.Fz().Fo();
                        if (!TextUtils.isEmpty(Fo)) {
                            jSONObject.put("11102", Fo);
                        }
                        jSONObject.put("11104", com.kwad.sdk.f.b.Fz().Fv());
                        jSONObject.put("11105", com.kwad.sdk.f.b.Fz().getDeviceId());
                        jSONObject.put("11106", com.kwad.sdk.f.b.Fz().getIccId());
                        jSONObject.put("11107", com.kwad.sdk.f.b.Fz().Fn());
                        jSONObject.put("11108", com.kwad.sdk.f.b.Fz().Fq());
                        jSONObject.put("11109", com.kwad.sdk.f.b.Fz().Fr());
                        jSONObject.put("11110", com.kwad.sdk.f.b.Fz().Fs());
                        jSONObject.put("11111", com.kwad.sdk.f.b.Fz().getIp());
                        jSONObject.put("11112", com.kwad.sdk.f.b.Fz().getLocation());
                        jSONObject.put("11113", com.kwad.sdk.f.b.Fz().getOaid());
                        jSONObject.put("11114", com.kwad.sdk.f.b.Fz().Fp());
                        jSONObject.put("11115", com.kwad.sdk.f.b.Fz().Fu());
                        jSONObject.put("11116", com.kwad.sdk.f.b.Fz().Ft());
                        jSONObject.put("11202", bg.b(com.kwad.sdk.f.b.Fz().Fo()));
                        jSONObject.put("11203", bg.b(com.kwad.sdk.f.b.Fz().Fx()));
                        jSONObject.put("11204", bg.b(com.kwad.sdk.f.b.Fz().Fv()));
                        jSONObject.put("11205", bg.b(com.kwad.sdk.f.b.Fz().getDeviceId()));
                        jSONObject.put("11206", bg.b(com.kwad.sdk.f.b.Fz().getIccId()));
                        jSONObject.put("11207", bg.b(com.kwad.sdk.f.b.Fz().Fn()));
                        jSONObject.put("11208", bg.b(com.kwad.sdk.f.b.Fz().Fq()));
                        jSONObject.put("11209", bg.b(com.kwad.sdk.f.b.Fz().Fr()));
                        jSONObject.put("11210", bg.b(com.kwad.sdk.f.b.Fz().Fs()));
                        jSONObject.put("11211", bg.b(com.kwad.sdk.f.b.Fz().getIp()));
                        jSONObject.put("11212", bg.b(com.kwad.sdk.f.b.Fz().getLocation()));
                        jSONObject.put("11213", bg.b(com.kwad.sdk.f.b.Fz().getOaid()));
                        jSONObject.put("11214", bg.b(com.kwad.sdk.f.b.Fz().Fp()));
                        jSONObject.put("11215", bg.b(com.kwad.sdk.f.b.Fz().Fu()));
                        jSONObject.put("11216", bg.b(com.kwad.sdk.f.b.Fz().Ft()));
                        jSONObject.put("11301", bg.c(com.kwad.sdk.f.b.Fz().Fy()));
                        jSONObject.put("11302", bg.c(com.kwad.sdk.f.b.Fz().getSdkVersion()));
                        jSONObject.put("11303", bg.c(com.kwad.sdk.f.b.Fz().getAppId()));
                    } catch (Throwable th4) {
                    }
                }
            } catch (Exception e9) {
            }
            try {
                jSONObject.put("02078", A.getE("W_S_V"));
                jSONObject.put("02079", A.getE("W_S_S_V"));
                if (Build.VERSION.SDK_INT > 21) {
                    jSONObject.put("02069", Build.VERSION.SECURITY_PATCH);
                }
                String string = Settings.Global.getString(cmVar.a.getContentResolver(), "Phenotype_boot_count");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("03085", string);
                }
                String string2 = Settings.Global.getString(cmVar.a.getContentResolver(), "boot_count");
                if (!TextUtils.isEmpty(string2)) {
                    jSONObject.put("03086", string2);
                }
                String string3 = Settings.System.getString(cmVar.a.getContentResolver(), "power_on_times");
                if (!TextUtils.isEmpty(string3)) {
                    jSONObject.put("03091", string3);
                }
                String string4 = Settings.System.getString(cmVar.a.getContentResolver(), "first_boot_flag");
                if (!TextUtils.isEmpty(string4)) {
                    jSONObject.put("03104", string4);
                }
            } catch (Throwable th5) {
            }
            jSONObject.put("11007", System.currentTimeMillis() - j);
            jSONObject.put("11017", jSONObject.toString().length());
            return jSONObject;
        } catch (Throwable th6) {
            return null;
        }
    }
}
