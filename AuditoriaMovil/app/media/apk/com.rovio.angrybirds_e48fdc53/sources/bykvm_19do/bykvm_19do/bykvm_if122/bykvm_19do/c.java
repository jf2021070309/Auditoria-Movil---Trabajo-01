package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.m0;
/* loaded from: classes.dex */
public class c {
    private static String a;
    private static String b;

    public static String a() {
        return m0.a("https://" + a.f().d());
    }

    public static String b() {
        return m0.a(c() + "/api/ad/union/mediation/exchange/");
    }

    private static String c() {
        String e = e();
        return !TextUtils.isEmpty(e) ? e : "https://gromore.pangolin-sdk-toutiao.com";
    }

    public static String d() {
        return m0.a(c() + "/api/ad/union/mediation/stats/");
    }

    private static String e() {
        String d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().d("server_dist_host");
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        if (!TextUtils.equals(d, a) || TextUtils.isEmpty(b)) {
            a = d;
            b = null;
            if (!TextUtils.isEmpty(d)) {
                b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(a, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            }
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            String str = "https://" + b;
            b = str;
            return str;
        }
        return b;
    }

    public static String f() {
        return m0.a(c() + "/api/ad/union/mediation/reward_video/reward/");
    }

    public static String g() {
        return m0.a(c() + "/api/ad/union/mediation/config/");
    }
}
