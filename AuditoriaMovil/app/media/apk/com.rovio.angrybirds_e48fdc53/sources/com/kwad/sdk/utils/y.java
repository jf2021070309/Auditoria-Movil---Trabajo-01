package com.kwad.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.sdk.service.ServiceProvider;
import java.util.Map;
/* loaded from: classes3.dex */
public final class y {
    private static String sAppTag = "";

    public static void IA() {
        b("ksadsdk_perf", "image_load_suc", c("ksadsdk_perf", "image_load_suc", 0) + 1);
    }

    public static void IB() {
        b("ksadsdk_perf", "image_load_failed", c("ksadsdk_perf", "image_load_failed", 0) + 1);
    }

    public static double IC() {
        int c = c("ksadsdk_perf", "image_load_complete_count", 0);
        long b = b("ksadsdk_perf", "image_load_complete_total", 0L);
        b("ksadsdk_perf", "image_load_complete_count", 0);
        a("ksadsdk_perf", "image_load_complete_total", 0L);
        return c == 0 ? PangleAdapterUtils.CPM_DEFLAUT_VALUE : b / c;
    }

    public static int ID() {
        int c = c("ksadsdk_perf", "image_load_total", 0);
        com.kwad.sdk.core.e.c.d("Ks_UnionUtils", "imageLoadTotal:" + c);
        b("ksadsdk_perf", "image_load_total", 0);
        return c;
    }

    public static int IE() {
        int c = c("ksadsdk_perf", "image_load_suc", 0);
        com.kwad.sdk.core.e.c.d("Ks_UnionUtils", "imageLoadSuccess:" + c);
        b("ksadsdk_perf", "image_load_suc", 0);
        return c;
    }

    public static int IF() {
        int c = c("ksadsdk_perf", "image_load_failed", 0);
        com.kwad.sdk.core.e.c.d("Ks_UnionUtils", "imageLoadFailed:" + c);
        b("ksadsdk_perf", "image_load_failed", 0);
        return c;
    }

    public static String Ip() {
        Context context = getContext();
        return context == null ? "" : b(context, "ksadsdk_interstitial_daily_show_count", "KEY_INTERSTITIAL_DAILY_SHOW_COUNT", "");
    }

    public static String Iq() {
        Context context = getContext();
        if (context == null) {
            return "";
        }
        return b(context, ba.JA() ? "ksadsdk_interstitial_daily_show_count" : "ksadsdk_interstitial_aggregate_daily_show_count", "KEY_INTERSTITIAL_AGGREGATE_DAILY_SHOW_COUNT", "");
    }

    public static String Ir() {
        Context context = getContext();
        return context == null ? "" : b(context, "ksadsdk_reward_full_ad_jump_direct", "KEY_REWARD_FULL_AD_JUMP_DIRECT", "");
    }

    public static String Is() {
        Context context = getContext();
        if (context == null) {
            return "";
        }
        return b(context, ba.Jw() ? "ksadsdk_splash_local_ad_force_active" : "ksadsdk_splash_daily_show_count", "KEY_SPLASH_DAILY_SHOW_COUNT", "");
    }

    public static String It() {
        Context context = getContext();
        return context == null ? "" : ba.Jy() ? j("ksadsdk_reward_full_ad_jump_direct", "KEY_REWARD_AUTO_CALL_APP_CARD_SHOW_COUNT", "") : b(context, "ksadsdk_reward_auto_call_app_card_show_count", "KEY_REWARD_AUTO_CALL_APP_CARD_SHOW_COUNT", "");
    }

    public static String Iu() {
        return j("ksadsdk_interstitial_daily_show_count", "KEY_INTERSTITIAL_AUTO_CALL_APP_CARD_SHOW_COUNT", "");
    }

    public static String Iv() {
        if (TextUtils.isEmpty(sAppTag)) {
            Context context = getContext();
            return context == null ? "" : b(context, "ksadsdk_pref", "appTag", "");
        }
        return sAppTag;
    }

    public static String Iw() {
        Context context = getContext();
        return context == null ? "" : ca(context);
    }

    public static long Ix() {
        return b("ksadsdk_push_ad_common", "key_push_last_show_time", -1L);
    }

    public static String Iy() {
        return getContext() == null ? "" : j("ksadsdk_install_tips_show_count", "init_install_tips_show_count", "");
    }

    public static void Iz() {
        b("ksadsdk_perf", "image_load_total", c("ksadsdk_perf", "image_load_total", 0) + 1);
    }

    public static long Q(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        return b(context, "ksadsdk_pref", str, 0L);
    }

    public static long R(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        return b(context, "ksadsdk_download_package_length", str, 0L);
    }

    public static String S(Context context, String str) {
        return context == null ? "" : b(context, "ksadsdk_download_package_md5", str, "");
    }

    public static void T(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_egid", "KEY_SDK_EGID", str);
    }

    public static void U(Context context, String str) {
        if (context == null) {
            return;
        }
        a("ksadsdk_model", "KEY_SDK_MODEL", str, true);
    }

    public static void V(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_interstitial_daily_show_count", "KEY_INTERSTITIAL_DAILY_SHOW_COUNT", str);
    }

    public static void W(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_interstitial_daily_show_count", "KEY_INTERSTITIAL_AGGREGATE_DAILY_SHOW_COUNT", str);
        ba.Jz();
    }

    public static void X(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_reward_full_ad_jump_direct", "KEY_REWARD_INTERACT_AD_SHOW_INFO", str);
    }

    public static void Y(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_reward_full_ad_jump_direct", "KEY_REWARD_FULL_AD_JUMP_DIRECT", str);
    }

    public static void Z(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_splash_local_ad_force_active", "KEY_SPLASH_DAILY_SHOW_COUNT", str);
        ba.Jv();
    }

    private static void a(Context context, String str, String str2, int i) {
        if (context == null) {
            return;
        }
        if (x.Ii()) {
            bb.b(str, str2, i);
        } else {
            com.kwad.sdk.utils.a.e.at(context, str).putInt(str2, i);
        }
    }

    private static void a(Context context, String str, String str2, long j) {
        if (context == null) {
            return;
        }
        if (x.Ii()) {
            bb.a(str, str2, j);
        } else {
            com.kwad.sdk.utils.a.e.at(context, str).putLong(str2, j);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        if (x.Ii()) {
            bb.i(str, str2, str3);
            if (com.kwad.framework.a.a.mp.booleanValue()) {
                com.kwad.sdk.core.e.c.d("Ks_UnionUtils", "putString Sp key:" + str2 + " value:" + str3);
                return;
            }
            return;
        }
        com.kwad.sdk.utils.a.e.at(context, str).putString(str2, str3);
        if (com.kwad.framework.a.a.mp.booleanValue()) {
            com.kwad.sdk.core.e.c.d("Ks_UnionUtils", "putString key:" + str2 + " value:" + str3);
        }
        x.am(str2, str3);
    }

    private static void a(Context context, String str, String str2, String str3, boolean z) {
        if (context == null) {
            return;
        }
        if (x.Ii()) {
            bb.a(str, str2, str3, z);
            if (com.kwad.framework.a.a.mp.booleanValue()) {
                com.kwad.sdk.core.e.c.d("Ks_UnionUtils", "putString Sp key:" + str2 + " value:" + str3);
                return;
            }
            return;
        }
        com.kwad.sdk.utils.a.e.at(context, str).putString(str2, str3);
        if (com.kwad.framework.a.a.mp.booleanValue()) {
            com.kwad.sdk.core.e.c.d("Ks_UnionUtils", "putString key:" + str2 + " value:" + str3);
        }
        x.am(str2, str3);
    }

    public static void a(String str, String str2, long j) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        a(context, str, str2, j);
    }

    public static void a(String str, String str2, String str3, boolean z) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        a(context, str, str2, str3, true);
    }

    public static void aa(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_reward_full_ad_jump_direct", "KEY_REWARD_AUTO_CALL_APP_CARD_SHOW_COUNT", str);
        ba.Jx();
    }

    public static void ab(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_interstitial_daily_show_count", "KEY_INTERSTITIAL_AUTO_CALL_APP_CARD_SHOW_COUNT", str);
    }

    public static void ac(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_device_sig", "KEY_SDK_DEVICE_SIG", str);
    }

    public static void ad(Context context, final String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        g.execute(new aw() { // from class: com.kwad.sdk.utils.y.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                y.ae(ServiceProvider.getContext(), str);
            }
        });
    }

    public static void ae(Context context, String str) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_pref", "appTag", str);
    }

    public static void af(Context context, String str) {
        if (context == null) {
            return;
        }
        a("ksadsdk_pref", "webview_ua", str, true);
    }

    public static void ag(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        ba.j(context.getApplicationContext(), "ksadsdk_sdk_config_data", str);
    }

    public static void ah(Context context, String str) {
        if (context == null) {
            return;
        }
        i("ksadsdk_install_tips_show_count", "init_install_tips_show_count", str);
    }

    public static Map<String, ?> ai(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (x.Ii()) {
            SharedPreferences fI = bb.fI(str);
            if (fI != null) {
                return fI.getAll();
            }
            return null;
        }
        return com.kwad.sdk.utils.a.e.at(context, str).getAll();
    }

    public static void ao(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        h(context, str, str2);
    }

    public static void as(long j) {
        a("ksadsdk_push_ad_common", "key_push_last_show_time", j);
    }

    public static void at(long j) {
        b("ksadsdk_perf", "image_load_complete_count", c("ksadsdk_perf", "image_load_complete_count", 0) + 1);
        a("ksadsdk_perf", "image_load_complete_total", b("ksadsdk_perf", "image_load_complete_total", 0L) + j);
    }

    private static int b(Context context, String str, String str2, int i) {
        return context == null ? i : x.Ii() ? bb.c(str, str2, i) : com.kwad.sdk.utils.a.e.at(context, str).getInt(str2, i);
    }

    private static long b(Context context, String str, String str2, long j) {
        return context == null ? j : x.Ii() ? bb.b(str, str2, j) : com.kwad.sdk.utils.a.e.at(context, str).getLong(str2, j);
    }

    public static long b(String str, String str2, long j) {
        Context context = getContext();
        return context == null ? j : b(context, str, str2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            if (r3 != 0) goto L3
            return r6
        L3:
            boolean r0 = com.kwad.sdk.utils.x.Ii()
            java.lang.String r1 = " value:"
            java.lang.String r2 = "Ks_UnionUtils"
            if (r0 == 0) goto L31
            java.lang.String r3 = com.kwad.sdk.utils.bb.j(r4, r5, r6)
            java.lang.Boolean r4 = com.kwad.framework.a.a.mp
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "getString From Sp key:"
            r4.<init>(r6)
        L20:
            r4.append(r5)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.kwad.sdk.core.e.c.d(r2, r4)
            goto L4f
        L31:
            com.kwad.sdk.utils.a.e.at(r3, r4)
            com.kwad.sdk.utils.a.c r3 = com.kwad.sdk.utils.a.e.at(r3, r4)
            java.lang.String r3 = r3.getString(r5, r6)
            com.kwad.sdk.utils.x.an(r5, r3)
            java.lang.Boolean r4 = com.kwad.framework.a.a.mp
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "getString key:"
            r4.<init>(r6)
            goto L20
        L4f:
            boolean r4 = com.kwad.sdk.core.a.c.cT(r3)
            if (r4 == 0) goto L59
            java.lang.String r3 = com.kwad.sdk.core.a.c.cS(r3)
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.utils.y.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private static void b(Context context, String str, String str2, boolean z) {
        if (context == null) {
            return;
        }
        if (x.Ii()) {
            bb.l(str, str2, z);
        } else {
            com.kwad.sdk.utils.a.e.at(context, str).putBoolean(str2, z);
        }
    }

    public static void b(String str, String str2, int i) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        a(context, str, str2, i);
    }

    public static int c(String str, String str2, int i) {
        Context context = getContext();
        if (context == null) {
            return 0;
        }
        return b(context, str, str2, 0);
    }

    private static boolean c(Context context, String str, String str2, boolean z) {
        return context == null ? z : x.Ii() ? bb.m(str, str2, z) : com.kwad.sdk.utils.a.e.at(context, str).getBoolean(str2, z);
    }

    public static String ca(Context context) {
        return context == null ? "" : b(context, "ksadsdk_egid", "KEY_SDK_EGID", "");
    }

    public static long cb(Context context) {
        if (context == null) {
            return 0L;
        }
        return b(context, "ksadsdk_gidExpireTimeMs", "KEY_SDK_EGID", 0L);
    }

    public static int cc(Context context) {
        if (context == null) {
            return 0;
        }
        return b(context, "ksadsdk_config_request", "KEY_CONFIG_REQUEST_FAIL", 0);
    }

    public static String cd(Context context) {
        if (context == null) {
            return "";
        }
        String b = b(context, "ksadsdk_model", "KEY_SDK_MODEL", "");
        bb.k(b, "ksadsdk_model", "KEY_SDK_MODEL");
        return b;
    }

    public static int ce(Context context) {
        if (context == null) {
            return 0;
        }
        return b(context, "ksadsdk_reward_full_ad_jump_direct", "KEY_REWARD_AD_SHOW_INTERACT_INTERVAL_SHOW_COUNT", 0);
    }

    public static String cf(Context context) {
        return context == null ? "" : b(context, "ksadsdk_reward_full_ad_jump_direct", "KEY_REWARD_INTERACT_AD_SHOW_INFO", "");
    }

    public static String cg(Context context) {
        return context == null ? "" : b(context, "ksadsdk_device_sig", "KEY_SDK_DEVICE_SIG", "");
    }

    public static String ch(Context context) {
        if (context == null) {
            return "";
        }
        String j = j("ksadsdk_pref", "webview_ua", "");
        bb.k(j, "ksadsdk_pref", "webview_ua");
        return j;
    }

    public static String ci(Context context) {
        if (ba.Jt()) {
            return ba.as(context.getApplicationContext(), "ksadsdk_sdk_config_data");
        }
        String j = bb.j("ksadsdk_sdk_config_data", "config_str", "");
        ba.i(context.getApplicationContext(), "ksadsdk_sdk_config_data", j);
        return j;
    }

    public static void d(Context context, long j) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_gidExpireTimeMs", "KEY_SDK_EGID", j);
    }

    public static void e(Context context, String str, long j) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_pref", str, j);
    }

    public static void f(Context context, String str, long j) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_download_package_length", str, j);
    }

    public static void g(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_download_package_md5", str, str2);
    }

    public static Context getContext() {
        return ServiceProvider.HA();
    }

    public static void h(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        if (x.Ii()) {
            bb.ao(str, str2);
            return;
        }
        com.kwad.sdk.utils.a.e.at(context, str).remove(str2);
        x.am(str2, "");
    }

    private static void i(String str, String str2, String str3) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        a(context, str, str2, str3);
    }

    public static String j(String str, String str2, String str3) {
        Context context = getContext();
        return context == null ? str3 : b(context, str, str2, str3);
    }

    public static void j(Context context, int i) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_config_request", "KEY_CONFIG_REQUEST_FAIL", i);
    }

    public static void k(Context context, int i) {
        if (context == null) {
            return;
        }
        a(context, "ksadsdk_reward_full_ad_jump_direct", "KEY_REWARD_AD_SHOW_INTERACT_INTERVAL_SHOW_COUNT", i);
    }

    public static void k(String str, String str2, String str3) {
        if (x.Ii()) {
            bb.k(str, str2, str3);
        }
    }

    public static void l(String str, String str2, boolean z) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        b(context, str, str2, true);
    }

    public static boolean m(String str, String str2, boolean z) {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        return c(context, str, str2, false);
    }
}
