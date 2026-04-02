package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.kuaishou.weapon.p0.jni.Engine;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class cn {
    private Context a;

    public cn(Context context) {
        this.a = context;
    }

    private JSONObject a() {
        try {
            System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            h a = h.a(this.a, "re_po_rt");
            boolean e = a.e("a1_p_s_p_s");
            boolean e2 = a.e("a1_p_s_p_s_c_b");
            ai aiVar = new ai(this.a);
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, aiVar.d());
            jSONObject.put("1", aiVar.a());
            jSONObject.put("2", aiVar.c());
            jSONObject.put("3", aiVar.f());
            jSONObject.put("24", aiVar.e());
            int i = 1;
            jSONObject.put("35", ab.b() ? 1 : 0);
            jSONObject.put("36", ab.a(this.a) ? 1 : 0);
            JSONObject a2 = ah.a(this.a);
            if (a2 != null) {
                jSONObject.put("4", a2);
            }
            if (a.b(de.ac, 0) == 1 && (e || e2)) {
                jSONObject.put("25", al.a(this.a) ? 1 : 0);
            }
            ac acVar = new ac();
            jSONObject.put("7", acVar.a() ? 1 : 0);
            boolean a3 = acVar.a(this.a);
            jSONObject.put("8", a3 ? 1 : 0);
            if (a3) {
                jSONObject.put("61", acVar.b(this.a));
            }
            jSONObject.put("10", acVar.e(this.a));
            jSONObject.put("11", acVar.c(this.a));
            ae aeVar = new ae();
            jSONObject.put("26", aeVar.a("cpuinfo") ? 1 : 0);
            jSONObject.put("27", aeVar.a("meminfo") ? 1 : 0);
            ao aoVar = new ao();
            jSONObject.put("65", aoVar.d() ? 1 : 0);
            boolean b = aoVar.b();
            jSONObject.put("66", b ? 1 : 0);
            if (b) {
                jSONObject.put("67", aoVar.a() ? 1 : 0);
            }
            jSONObject.put("68", aoVar.f() ? 1 : 0);
            jSONObject.put("69", aoVar.e());
            jSONObject.put("101", aoVar.c() ? 1 : 0);
            jSONObject.put("102", aoVar.g() ? 1 : 0);
            jSONObject.put("99", new af().a());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("03007", bu.a(this.a));
            jSONObject2.put("03014", bg.g(this.a));
            jSONObject2.put("03020", bu.b(this.a));
            jSONObject2.put("03030", bf.d(this.a));
            jSONObject.put("51", jSONObject2);
            jSONObject.put("107", new an().d());
            if (!ab.b(this.a)) {
                i = 0;
            }
            jSONObject.put("60", i);
            try {
                jSONObject.put("11028", WeaponHI.sKSSdkver);
                try {
                    jSONObject.put("11301", bg.c(com.kwad.sdk.f.b.Fz().Fy()));
                    jSONObject.put("11302", bg.c(com.kwad.sdk.f.b.Fz().getSdkVersion()));
                    jSONObject.put("11303", bg.c(com.kwad.sdk.f.b.Fz().getAppId()));
                    jSONObject.put("11002", Engine.soVersion);
                } catch (Throwable th) {
                }
            } catch (Exception e3) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            return null;
        }
    }

    public String a(String str) {
        JSONObject a;
        JSONObject a2;
        try {
            cl clVar = new cl(str, cj.j);
            String a3 = dk.a(ct.a);
            String b = b(a3);
            if (TextUtils.isEmpty(b) || (a = clVar.a(this.a)) == null) {
                return null;
            }
            String str2 = ct.h + "?" + cu.a(this.a);
            if (ct.a() && ct.a.contains("api")) {
                str2 = "/api" + str2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ip", b);
            jSONObject.put("host", a3);
            jSONObject.put("path", str2);
            String str3 = WeaponHI.cookieData;
            if (!TextUtils.isEmpty(str3) && str3.length() > 10) {
                jSONObject.put("cookie", str3);
            }
            jSONObject.put(MonitorConstants.CONNECT_TYPE_HEAD, a);
            StringBuilder sb = new StringBuilder();
            sb.append("sdk=" + Build.VERSION.SDK_INT);
            jSONObject.put("parame", sb.toString());
            if (str.equals(cj.h) && (a2 = a()) != null) {
                jSONObject.put("sjd", a2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            return null;
        }
    }

    public String b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String hostAddress = InetAddress.getByName(dk.a(str)).getHostAddress();
            try {
                if (!TextUtils.isEmpty(hostAddress)) {
                    if (hostAddress.contains(".")) {
                        return hostAddress;
                    }
                }
                return "";
            } catch (UnknownHostException e) {
                return hostAddress;
            }
        } catch (UnknownHostException e2) {
            return "";
        }
    }
}
