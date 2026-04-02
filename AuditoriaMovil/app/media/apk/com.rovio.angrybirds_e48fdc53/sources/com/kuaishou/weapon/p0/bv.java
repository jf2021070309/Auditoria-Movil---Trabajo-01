package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class bv {
    private static final byte[] d = new byte[0];
    private Context a;
    private boolean b;
    private int c;

    public bv(Context context, int i, boolean z) {
        this.a = context;
        this.b = z;
        this.c = i;
    }

    public String a(String str) {
        try {
            synchronized (d) {
                JSONObject a = new cl(str, cj.j).a(this.a);
                if (a == null) {
                    return null;
                }
                JSONObject a2 = a();
                if (a2 == null) {
                    return null;
                }
                a.put("module_section", a2);
                return a.toString();
            }
        } catch (Throwable th) {
            return null;
        }
    }

    public JSONObject a() {
        String q;
        try {
            JSONObject jSONObject = new JSONObject();
            h a = h.a(this.a, "re_po_rt");
            boolean e = a.e("a1_p_s_p_s");
            boolean e2 = a.e("a1_p_s_p_s_c_b");
            jSONObject.put("11006", e ? 1 : 0);
            jSONObject.put("11029", e2 ? 1 : 0);
            if (a.b(de.ao, 1) == 1 && (e || e2)) {
                String a2 = bg.a(this.a);
                if (!TextUtils.isEmpty(a2) && !a2.startsWith("RISK")) {
                    jSONObject.put("01001", f.a(a2));
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
                    jSONObject.put("01004", f.a(b2));
                }
            }
            int b3 = a.b(de.an, 1);
            if (b3 == 1 && (e || e2)) {
                String f = bg.f(this.a);
                if (!TextUtils.isEmpty(f) && !f.startsWith("RISK")) {
                    jSONObject.put("01013", f);
                }
            }
            if (a.b(de.ap, 1) == 1 && (e || e2)) {
                String d2 = bg.d(this.a);
                if (!TextUtils.isEmpty(d2) && !d2.startsWith("RISK")) {
                    jSONObject.put("01007", d2);
                }
            }
            if (a.b(de.aq, 1) == 1 && (e || e2)) {
                jSONObject.put("01011", bg.e(this.a));
            }
            if (e || e2) {
                String g = bg.g();
                if ((TextUtils.isEmpty(g) || g.startsWith("RISK")) && g == null) {
                    jSONObject.put("07005", "");
                } else {
                    jSONObject.put("07005", g);
                }
                jSONObject.put("07006", bg.f());
            }
            if (a.b(de.as, 1) == 1 && (e || e2)) {
                String p = bg.p(this.a);
                if (!TextUtils.isEmpty(p) && !p.startsWith("RISK")) {
                    jSONObject.put("01016", p);
                }
            }
            if (e || e2) {
                try {
                    double a3 = bg.a();
                    if (a3 > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a3);
                        jSONObject.put("09002", sb.toString());
                    }
                    double b4 = bg.b();
                    if (b4 > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b4);
                        jSONObject.put("09003", sb2.toString());
                    }
                } catch (Exception e3) {
                }
            }
            jSONObject.put("11013", Integer.parseInt(bw.a(this.a.getApplicationContext()), 2));
            jSONObject.put("11012", bw.b(this.a));
            jSONObject.put("11011", bg.w(this.a));
            try {
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
            } catch (Throwable th) {
            }
            String y = bg.y(this.a);
            if (!TextUtils.isEmpty(y)) {
                jSONObject.put("01026", y);
            }
            if (b3 == 1) {
                try {
                    JSONObject a4 = ah.a(this.a);
                    if (a4 != null) {
                        jSONObject.put("11015", a4);
                    }
                    if (Engine.loadSuccess) {
                        cd cdVar = new cd(this.a);
                        jSONObject.put("02001", cdVar.a("02001") != null ? cdVar.a("02001") : bk.a());
                        jSONObject.put("02002", cdVar.a("02002") != null ? cdVar.a("02002") : bk.b());
                        jSONObject.put("02003", cdVar.a("02003") != null ? cdVar.a("02003") : bk.c());
                        jSONObject.put("02007", cdVar.a("02007") != null ? cdVar.a("02007") : bk.g());
                        jSONObject.put("02006", cdVar.a("02006") != null ? cdVar.a("02006") : bk.f());
                        jSONObject.put("02004", cdVar.a("02004") != null ? cdVar.a("02004") : bk.d());
                        jSONObject.put("02005", cdVar.a("02005") != null ? cdVar.a("02005") : bk.e());
                        jSONObject.put("02018", cdVar.a("02018") != null ? cdVar.a("02018") : bk.s());
                        jSONObject.put("02013", cdVar.a("02013") != null ? cdVar.a("02013") : bk.m());
                        q = cdVar.a("02016") != null ? cdVar.a("02016") : bk.q();
                    } else {
                        jSONObject.put("02001", bk.a());
                        jSONObject.put("02002", bk.b());
                        jSONObject.put("02003", bk.c());
                        jSONObject.put("02004", bk.d());
                        jSONObject.put("02005", bk.e());
                        jSONObject.put("02006", bk.f());
                        jSONObject.put("02007", bk.g());
                        jSONObject.put("02018", bk.s());
                        jSONObject.put("02013", bk.m());
                        q = bk.q();
                    }
                    jSONObject.put("02016", q);
                    jSONObject.put("02021", bk.d(this.a));
                    jSONObject.put("02022", bk.c(this.a));
                    jSONObject.put("02044", bk.t());
                    jSONObject.put("11009", br.a(this.a.getApplicationContext()));
                    if (Engine.loadSuccess) {
                        by byVar = new by(this.a);
                        jSONObject.put("04001", byVar.a("04001") != null ? byVar.a("04001") : "");
                        jSONObject.put("04002", byVar.a("04002") != null ? byVar.a("04002") : "");
                        jSONObject.put("04003", byVar.a("04003") != null ? byVar.a("04003") : "");
                        jSONObject.put("04004", byVar.a("04004") != null ? byVar.a("04004") : "");
                    } else {
                        try {
                            bi b5 = bj.b();
                            jSONObject.put("04001", bj.a());
                            jSONObject.put("04002", b5.b());
                            jSONObject.put("04003", b5.c());
                            jSONObject.put("04004", b5.a());
                        } catch (Exception e4) {
                        }
                    }
                } catch (Throwable th2) {
                    return null;
                }
            }
            if (this.b) {
                jSONObject.put("20004", 1);
            }
            jSONObject.put("11017", jSONObject.toString().length());
            jSONObject.put("20000", this.c);
            jSONObject.put("11028", WeaponHI.sKSSdkver);
            return jSONObject;
        } catch (Throwable th3) {
            return null;
        }
    }
}
