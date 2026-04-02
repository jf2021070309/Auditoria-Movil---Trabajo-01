package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.i0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.u;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.error.AdBreakError;
import com.bytedance.msdk.api.error.AdFreqError;
import com.bytedance.msdk.api.error.AdPacingError;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.bytedance.msdk.base.TTBaseAd;
import com.umeng.analytics.pro.bg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class h {
    private static int a;
    private static int b;
    private static int c;

    public static void a(int i, int i2, long j, boolean z, boolean z2, JSONObject jSONObject, long j2, JSONObject jSONObject2) {
        d b2 = d.b();
        boolean a2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().a("is_config_from_assert");
        if (i != 1) {
            i = (z || (i == 0 && a2)) ? 2 : 0;
        }
        b2.e(i).a(j).e("get_config_final").g(i2).a("transparent_params", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().s());
        HashMap hashMap = new HashMap();
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(z2, b2, jSONObject, hashMap);
        if (jSONObject2 != null) {
            hashMap.put("cfg_handle_time", jSONObject2);
        }
        hashMap.put("config_size", Long.valueOf(j2));
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(long j) {
        d b2 = d.b();
        b2.e("sdk_backstage").a(j);
        HashMap hashMap = new HashMap();
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().c(hashMap);
        hashMap.put("v3", f0.g("v3"));
        hashMap.put("v1", f0.g("v1"));
        JSONArray e = f0.e();
        if (e != null) {
            Log.d("TMe", "--==-- v3bug size: " + e.length());
            hashMap.put("sp_v3_bug", e);
        }
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(long j, int i, int i2, long j2, JSONObject jSONObject) {
        d b2 = d.b();
        b2.e("sdk_init_end");
        b2.a(j);
        b2.b(j2);
        b2.a("adn_count", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("is_from_local_config", Integer.valueOf(i2));
        hashMap.put("adapter_version_list", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.g.a());
        hashMap.put("if_use_new_sdkinit", Integer.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().p()));
        if (jSONObject != null) {
            hashMap.put("local_init_time", jSONObject);
        }
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
        char c2 = '_';
        while (true) {
            char c3 = '^';
            while (true) {
                if (c3 == '`') {
                    if (c2 != ')') {
                        if (c2 != '*') {
                            return;
                        }
                    }
                }
                c2 = '(';
                c3 = '`';
            }
        }
    }

    public static void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, AdSlot adSlot, int i, int i2) {
        d b2 = d.b();
        b2.e("adapter_request_fail").a(0L).a((String) null).c(AdError.ERROR_ADN_NO_ERROR_CODE).d("adapter create fail !").a("mediationrit_req_type", Integer.valueOf(i)).a("mediationrit_req_type_src", Integer.valueOf(i2));
        HashMap hashMap = new HashMap();
        a(b2, adSlot, kVar, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, AdSlot adSlot, TTBaseAd tTBaseAd, int i, String str) {
        d b2 = d.b();
        d a2 = b2.e("bidding_info_invalid").c(i).d(str).a("ad_count", Integer.valueOf(adSlot != null ? adSlot.getAdCount() : 0));
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f());
        a2.a("grouping_params", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.g()).a("log_source", 2);
        HashMap hashMap = new HashMap();
        a(b2, adSlot, kVar, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
        char c2 = '_';
        while (true) {
            char c3 = '^';
            while (true) {
                if (c3 == '`') {
                    if (c2 != ')') {
                        if (c2 != '*') {
                            return;
                        }
                    }
                }
                c2 = '(';
                c3 = '`';
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r2, com.bytedance.msdk.api.AdSlot r3, java.lang.String r4) {
        /*
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d.b()
            java.lang.String r1 = "get_bidding_adm_to_adn"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r1 = r0.e(r1)
            r1.a(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1 = 0
            a(r0, r3, r2, r1, r4)
            android.content.Context r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a(r2, r0, r4)
        L1d:
            r2 = 73
            r3 = 96
        L21:
            switch(r2) {
                case 72: goto L2f;
                case 73: goto L27;
                case 74: goto L2a;
                default: goto L24;
            }
        L24:
            r2 = 72
            goto L21
        L27:
            switch(r3) {
                case 94: goto L1d;
                case 95: goto L2f;
                case 96: goto L2f;
                default: goto L2a;
            }
        L2a:
            switch(r3) {
                case 55: goto L2e;
                case 56: goto L2e;
                case 57: goto L2f;
                default: goto L2d;
            }
        L2d:
            goto L1d
        L2e:
            return
        L2f:
            r2 = 74
            r3 = 55
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k, com.bytedance.msdk.api.AdSlot, java.lang.String):void");
    }

    public static void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, AdSlot adSlot, String str, boolean z, int i, int i2, int i3, int i4, AdError adError, long j, boolean z2, boolean z3) {
        d b2 = d.b();
        if ((adError instanceof AdPacingError) || (adError instanceof AdFreqError) || (adError instanceof AdBreakError)) {
            b2.c(adError.code).d(adError.message);
        }
        b2.e("media_request").a(str).a("ad_count", Integer.valueOf(adSlot != null ? adSlot.getAdCount() : 0)).a("adn_count", Integer.valueOf(i2)).a("mediationrit_req_type", Integer.valueOf(i3)).a("mediationrit_req_type_src", Integer.valueOf(i4)).a("mediation_req_type", Integer.valueOf(!z ? 1 : 0)).a("media_req_type", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("timeout_req", Integer.valueOf(z2 ? 1 : 0));
        hashMap.put("is_callback", Integer.valueOf(z3 ? 1 : 0));
        if (j != -1) {
            hashMap.put(com.umeng.analytics.pro.d.p, Long.valueOf(SystemClock.elapsedRealtime() - j));
        }
        a(b2, adSlot, kVar, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
        for (char c2 = '-'; c2 != '.'; c2 = '.') {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r3) {
        /*
            java.lang.String r0 = "block_pacing"
            java.lang.String r1 = "-1"
            r3.a(r0, r1)
            java.lang.String r0 = "waterfall_show_rule_id"
            r3.a(r0, r1)
            java.lang.String r0 = "block_show_count"
            r3.a(r0, r1)
        L11:
            r3 = 94
            r0 = 75
            r1 = 93
        L17:
            r2 = 92
            if (r3 == r2) goto L1e
            if (r3 == r1) goto L21
            goto L28
        L1e:
            switch(r0) {
                case 21: goto L28;
                case 22: goto L28;
                case 23: goto L28;
                default: goto L21;
            }
        L21:
            switch(r0) {
                case 91: goto L11;
                case 92: goto L28;
                case 93: goto L27;
                default: goto L24;
            }
        L24:
            r0 = 91
            goto L21
        L27:
            return
        L28:
            r3 = r1
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0000, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x000d, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0026 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r10, com.bytedance.msdk.api.AdSlot r11, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r12, com.bytedance.msdk.base.TTBaseAd r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d, com.bytedance.msdk.api.AdSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k, com.bytedance.msdk.base.TTBaseAd, java.util.Map):void");
    }

    public static void a(AdError adError, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, int i, int i2, int i3, String str, long j) {
        d b2 = d.b();
        b2.e("bidding_adm_load_fail").a(j).a(str).c(adError != null ? adError.thirdSdkErrorCode : -1).d(adError != null ? adError.thirdSdkErrorMessage : "unknown error").a("adn_count", Integer.valueOf(i)).a("adn_preload", 0).a("mediationrit_req_type", Integer.valueOf(i2)).a("mediationrit_req_type_src", Integer.valueOf(i3));
        if (adError instanceof AdBreakError) {
            b2.n = adError.code;
            b2.k = adError.message;
        }
        HashMap hashMap = new HashMap();
        a(b2, adSlot, kVar, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.bytedance.msdk.api.AdError r7, com.bytedance.msdk.api.AdSlot r8, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r9, int r10, int r11, int r12, java.lang.String r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.String r18, long r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(com.bytedance.msdk.api.AdError, com.bytedance.msdk.api.AdSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k, int, int, int, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.bytedance.msdk.api.AdSlot r2, int r3) {
        /*
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d.b()
            java.lang.String r1 = "get_config_error"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r1 = r0.e(r1)
            r1.c(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r1 = 0
            a(r0, r2, r1, r1, r3)
            android.content.Context r2 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a(r2, r0, r3)
        L1d:
            r2 = 74
            r3 = 55
        L21:
            switch(r2) {
                case 72: goto L1d;
                case 73: goto L27;
                case 74: goto L2a;
                default: goto L24;
            }
        L24:
            r2 = 72
            goto L21
        L27:
            switch(r3) {
                case 94: goto L2e;
                case 95: goto L33;
                case 96: goto L33;
                default: goto L2a;
            }
        L2a:
            r2 = 57
            if (r3 == r2) goto L33
        L2e:
            r2 = 73
            r3 = 96
            goto L21
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(com.bytedance.msdk.api.AdSlot, int):void");
    }

    public static void a(AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.a aVar, String str, int i) {
        if (aVar == null) {
            return;
        }
        d b2 = d.b();
        d e = b2.e("return_bidding_result").a(aVar.g).e(aVar.f);
        AdError adError = aVar.h;
        d c2 = e.c(adError == null ? 0 : adError.code);
        AdError adError2 = aVar.h;
        c2.d(adError2 == null ? "" : adError2.message).a(2).a("fill_type", Integer.valueOf(i)).a("waterfall_abtest", str).a("server_bidding_extra", aVar.d).a("ad_count", Integer.valueOf(aVar.i));
        HashMap hashMap = new HashMap();
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.d.a(aVar.j, aVar.a, hashMap);
        JSONObject jSONObject = aVar.k;
        if (jSONObject != null) {
            hashMap.put("token_time", jSONObject);
        }
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.bytedance.msdk.api.AdSlot r3, com.bytedance.msdk.api.AdError r4, java.lang.String r5, java.lang.String r6) {
        /*
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d.b()
            java.lang.String r1 = "total_load_fail"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r1 = r0.e(r1)
            java.lang.String r2 = "waterfall_abtest"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r5 = r1.a(r2, r5)
            java.lang.String r1 = "server_bidding_extra"
            r5.a(r1, r6)
            int r5 = r4.code
            r6 = 10003(0x2713, float:1.4017E-41)
            if (r5 != r6) goto L2a
            r4 = 10010(0x271a, float:1.4027E-41)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r4 = r0.c(r4)
            java.lang.String r5 = "Ad load timeout!"
        L23:
            r4.d(r5)
        L26:
            a(r0)
            goto L82
        L2a:
            boolean r6 = r4 instanceof com.bytedance.msdk.api.error.AdPacingError
            java.lang.String r1 = "waterfall_show_rule_id"
            if (r6 == 0) goto L4d
            r6 = r4
            com.bytedance.msdk.api.error.AdPacingError r6 = (com.bytedance.msdk.api.error.AdPacingError) r6
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r5 = r0.c(r5)
            java.lang.String r4 = r4.message
            r5.d(r4)
            java.lang.String r4 = r6.getBlockPacing()
            java.lang.String r5 = "block_pacing"
            r0.a(r5, r4)
            java.lang.String r4 = r6.getRuleId()
        L49:
            r0.a(r1, r4)
            goto L82
        L4d:
            boolean r6 = r4 instanceof com.bytedance.msdk.api.error.AdFreqError
            if (r6 == 0) goto L6b
            r6 = r4
            com.bytedance.msdk.api.error.AdFreqError r6 = (com.bytedance.msdk.api.error.AdFreqError) r6
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r5 = r0.c(r5)
            java.lang.String r4 = r4.message
            r5.d(r4)
            java.lang.String r4 = r6.getBlockShowCount()
            java.lang.String r5 = "block_show_count"
            r0.a(r5, r4)
            java.lang.String r4 = r6.getRuleId()
            goto L49
        L6b:
            boolean r6 = r4 instanceof com.bytedance.msdk.api.error.AdBreakError
            if (r6 == 0) goto L79
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r5 = r0.c(r5)
            java.lang.String r4 = r4.message
            r5.d(r4)
            goto L26
        L79:
            r4 = 10086(0x2766, float:1.4133E-41)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r4 = r0.c(r4)
            java.lang.String r5 = "Ad load fail all loadsorts! "
            goto L23
        L82:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.c
            int r6 = r5 + 1
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.c = r6
            int r5 = r5 % 10
            if (r5 != 0) goto L9e
            int r5 = com.bytedance.msdk.adapter.util.ThreadHelper.getGroMoreThreadCount()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "gromore_thread_num"
            r4.put(r6, r5)
        L9e:
            if (r3 == 0) goto La5
            int r5 = r3.getAdCount()
            goto La6
        La5:
            r5 = 0
        La6:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "ad_count"
            r0.a(r6, r5)
            r5 = 0
            a(r0, r3, r5, r5, r4)
            android.content.Context r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a(r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(com.bytedance.msdk.api.AdSlot, com.bytedance.msdk.api.AdError, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(AdSlot adSlot, TTBaseAd tTBaseAd, long j, int i, int i2, int i3, String str, int i4) {
        d b2 = d.b();
        b2.e("mediation_request_end").a(j).a("waterfall_abtest", str).a("ad_count", Integer.valueOf(i4)).c(i3);
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        hashMap.put("requested_adn_count", Integer.valueOf(i));
        hashMap.put("requested_level_count", Integer.valueOf(i2));
        int i5 = b;
        b = i5 + 1;
        if (i5 % 10 == 0) {
            hashMap.put("gromore_thread_num", Integer.valueOf(ThreadHelper.getGroMoreThreadCount()));
        }
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
        char c2 = '\t';
        char c3 = 26;
        while (true) {
            boolean z = true;
            while (z) {
                c3 = 65492;
                c2 = 30;
                z = true;
            }
            if (z && c3 <= 22) {
                while (true) {
                    switch (c2) {
                        case 30:
                        case 31:
                            return;
                    }
                }
            }
        }
    }

    public static void a(AdSlot adSlot, TTBaseAd tTBaseAd, long j, String str) {
        d b2 = d.b();
        b2.e("mediation_video_cached").a(j).a("waterfall_abtest", str);
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(AdSlot adSlot, TTBaseAd tTBaseAd, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar) {
        d b2 = d.b();
        b2.e("media_cache_success");
        HashMap hashMap = new HashMap();
        a(b2, adSlot, kVar, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(AdSlot adSlot, TTBaseAd tTBaseAd, String str) {
        d b2 = d.b();
        b2.e("rit_cache_cannot_use").a("cache_invalid_info", str);
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        b2.a("mediationrit_req_type", 2);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.bytedance.msdk.api.AdSlot r3, java.lang.String r4) {
        /*
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d.b()
            java.lang.String r1 = "media_will_show"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r1 = r0.e(r1)
            java.lang.String r2 = "waterfall_abtest"
            r1.a(r2, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1 = 0
            a(r0, r3, r1, r1, r4)
            android.content.Context r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a(r3, r0, r4)
        L1f:
            r3 = 74
            r4 = 55
        L23:
            switch(r3) {
                case 72: goto L1f;
                case 73: goto L29;
                case 74: goto L2c;
                default: goto L26;
            }
        L26:
            r3 = 72
            goto L23
        L29:
            switch(r4) {
                case 94: goto L30;
                case 95: goto L35;
                case 96: goto L35;
                default: goto L2c;
            }
        L2c:
            r3 = 57
            if (r4 == r3) goto L35
        L30:
            r3 = 73
            r4 = 96
            goto L23
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(com.bytedance.msdk.api.AdSlot, java.lang.String):void");
    }

    public static void a(AdSlot adSlot, String str, int i) {
        d b2 = d.b();
        b2.e("mt_ra_c").c(i).a("waterfall_abtest", str);
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(AdSlot adSlot, String str, int i, int i2) {
        d b2 = d.b();
        b2.e("mt_ra_s").c(i).a("waterfall_abtest", str);
        HashMap hashMap = new HashMap();
        hashMap.put("pre_req", Integer.valueOf(i2));
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(AdSlot adSlot, String str, String str2) {
        d b2 = d.b();
        b2.e("cache_cannot_use").a("cache_invalid_info", str).a("waterfall_abtest", str2);
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(AdSlot adSlot, String str, JSONObject jSONObject) {
        d b2 = d.b();
        b2.e("start_bidding_request").a(2).a("waterfall_abtest", str).a("ad_count", Integer.valueOf(adSlot != null ? adSlot.getAdCount() : 0));
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            hashMap.put("token_time", jSONObject);
        }
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(AdSlot adSlot, String str, boolean z, String str2, int i) {
        String str3;
        if (i > 0) {
            str3 = AdError.getMessage(i);
        } else {
            str3 = "";
            i = 0;
        }
        int i2 = i != 0 ? z ? 2 : 3 : !z ? 1 : 0;
        d b2 = d.b();
        b2.e("mediation_request").a("waterfall_abtest", str).a("server_bidding_extra", str2).a("mediation_req_type", Integer.valueOf(i2)).a("ad_count", Integer.valueOf(adSlot != null ? adSlot.getAdCount() : 0)).c(i).d(str3);
        HashMap hashMap = new HashMap();
        int i3 = a;
        a = i3 + 1;
        if (i3 % 10 == 0) {
            hashMap.put("gromore_thread_num", Integer.valueOf(ThreadHelper.getGroMoreThreadCount()));
        }
        if (adSlot != null && adSlot.getPrimeRitReqType() == 5) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("parallel_num", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a());
                jSONObject.put(bg.aU, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().c());
                jSONObject.put("primerit_list", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().b());
                hashMap.put("preload_info", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (adSlot != null && adSlot.getAdType() == 3) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().b(hashMap);
        }
        hashMap.put("csj_plugin_version", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.c.i());
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, (TTBaseAd) null, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(TTBaseAd tTBaseAd, int i, String str, long j, AdSlot adSlot, int i2, int i3, int i4, String str2, long j2, long j3) {
        int i5 = (tTBaseAd == null || !tTBaseAd.isAdnPreload()) ? 0 : 1;
        d b2 = d.b();
        b2.e("media_fill").a(j).c(i).d(str).a("adn_count", Integer.valueOf(i2)).a("adn_preload", Integer.valueOf(i5)).a("ad_count", Integer.valueOf(i3));
        b2.a("fill_type", Integer.valueOf(i4));
        if (str2 != null) {
            b2.a("sub_adn_name", str2);
        }
        HashMap hashMap = new HashMap();
        boolean z = j2 >= 0;
        if (tTBaseAd != null && tTBaseAd.isCustomAd()) {
            hashMap.put("custom_adn_sample_ratio", Double.valueOf(u.a()));
            hashMap.put("custom_adn_sample_ratio_result", Boolean.valueOf(z));
            if (z) {
                hashMap.put("custom_adn_rec_time", Long.valueOf(j2));
            }
        }
        if (j3 != -1) {
            hashMap.put(com.umeng.analytics.pro.d.q, Long.valueOf(j3));
        }
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().O() && tTBaseAd != null && 5 == tTBaseAd.getAdType()) {
            b2.a("ex_info", j.a().a(tTBaseAd));
        }
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, int i, int i2, int i3, String str) {
        d b2 = d.b();
        b2.e(i2).e("media_show_after").a("play_again", Integer.valueOf(i3)).a("reason", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            b2.a("callstack_message", str);
        }
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, int i, String str, long j, int i2, int i3, String str2) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c f;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c b2;
        d b3 = d.b();
        b3.e("media_reward_verify").a("adn_preload", Integer.valueOf((tTBaseAd == null || !tTBaseAd.isAdnPreload()) ? 0 : 1)).a("reason", Integer.valueOf(i2)).a("play_again", Integer.valueOf(i));
        if (i3 != 0 && i3 != 20000) {
            b3.c(i3).d(str2);
        }
        HashMap hashMap = new HashMap();
        boolean z = j >= 0;
        if (tTBaseAd != null && tTBaseAd.isCustomAd()) {
            hashMap.put("custom_adn_sample_ratio", Double.valueOf(u.a()));
            hashMap.put("custom_adn_sample_ratio_result", Boolean.valueOf(z));
            if (z) {
                hashMap.put("custom_adn_rec_time", Long.valueOf(j));
            }
        }
        if (adSlot != null && (f = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()) != null && (b2 = f.b(adSlot.getAdUnitId(), 101)) != null) {
            hashMap.put("reward_callback_type", Integer.valueOf(b2.z()));
            hashMap.put("reward_start_time", Integer.valueOf(b2.A()));
        }
        if (str != null) {
            b3.a("sub_adn_name", str);
        }
        a(b3, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b3, hashMap);
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, int i, String str, long j, String str2, boolean z) {
        d b2 = d.b();
        b2.e("media_click_listen").a("adn_preload", Integer.valueOf((tTBaseAd == null || !tTBaseAd.isAdnPreload()) ? 0 : 1)).a("play_again", Integer.valueOf(i)).a("is_repeat", Integer.valueOf(z ? 1 : 0));
        if (str != null) {
            b2.a("sub_adn_name", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            b2.a("callstack_message", str2);
        }
        HashMap hashMap = new HashMap();
        boolean z2 = j >= 0;
        if (tTBaseAd != null && tTBaseAd.isCustomAd()) {
            hashMap.put("custom_adn_sample_ratio", Double.valueOf(u.a()));
            hashMap.put("custom_adn_sample_ratio_result", Boolean.valueOf(z2));
            if (z2) {
                hashMap.put("custom_adn_rec_time", Long.valueOf(j));
            }
        }
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
        while (true) {
            for (char c2 = 20; c2 != 18; c2 = 19) {
                if (c2 == 19) {
                    return;
                }
            }
        }
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, int i, String str, long j, boolean z) {
        a(tTBaseAd, adSlot, i, str, j, (String) null, z);
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, long j, String str, boolean z, int i, boolean z2, boolean z3) {
        d b2 = d.b();
        b2.e("mediation_fill").a(j).a("waterfall_abtest", cVar != null ? cVar.G() : null).a("server_bidding_extra", str).a("mediation_req_type", Integer.valueOf(!z ? 1 : 0)).a("ad_count", Integer.valueOf(i)).c(0).d("");
        HashMap hashMap = new HashMap();
        if (adSlot != null && adSlot.getAdType() == 3) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(hashMap);
        }
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        hashMap.put("timeout_req", Integer.valueOf(z2 ? 1 : 0));
        hashMap.put("is_callback", Integer.valueOf(z3 ? 1 : 0));
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
        for (char c2 = 25; c2 != 26 && c2 != 27; c2 = 27) {
        }
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar) {
        d b2 = d.b();
        b2.e("bidding_adm_cache");
        HashMap hashMap = new HashMap();
        a(b2, adSlot, kVar, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, long j) {
        d b2 = d.b();
        b2.e("bidding_adm_load").a(j);
        HashMap hashMap = new HashMap();
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().O() && tTBaseAd != null && 5 == tTBaseAd.getAdType()) {
            b2.a("ex_info", j.a().a(tTBaseAd));
        }
        a(b2, adSlot, kVar, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, AdError adError, int i, int i2, String str, long j) {
        a(tTBaseAd, adSlot, adError, i, i2, str, j, (String) null);
        while (true) {
            char c2 = '^';
            char c3 = 'K';
            while (true) {
                if (c2 == '\\') {
                    switch (c3) {
                        case 21:
                            return;
                        case 22:
                        case 23:
                            c2 = ']';
                            c3 = ']';
                    }
                } else if (c2 != ']') {
                    c2 = ']';
                    c3 = ']';
                }
            }
            while (true) {
                switch (c3) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        return;
                    default:
                        c3 = '[';
                }
            }
        }
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, AdError adError, int i, int i2, String str, long j, String str2) {
        d b2 = d.b();
        b2.e(i).c(adError != null ? adError.thirdSdkErrorCode : 0).d(adError != null ? adError.thirdSdkErrorMessage : null).e("media_show_fail_listen").a("play_again", Integer.valueOf(i2));
        if (str != null) {
            b2.a("sub_adn_name", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            b2.a("callstack_message", str2);
        }
        HashMap hashMap = new HashMap();
        boolean z = j >= 0;
        if (tTBaseAd != null && tTBaseAd.isCustomAd()) {
            hashMap.put("custom_adn_sample_ratio", Double.valueOf(u.a()));
            hashMap.put("custom_adn_sample_ratio_result", Boolean.valueOf(z));
            if (z) {
                hashMap.put("custom_adn_rec_time", Long.valueOf(j));
            }
        }
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, String str) {
        d b2 = d.b();
        b2.e("media_show_dislike").d(str);
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
        while (true) {
            char c2 = 'J';
            char c3 = '7';
            while (true) {
                switch (c2) {
                    case 'H':
                        break;
                    case 'I':
                        switch (c3) {
                            case '^':
                                break;
                            case '_':
                            case '`':
                                return;
                            default:
                                if (c3 != '8' || c3 == '9') {
                                    return;
                                }
                                break;
                        }
                        c2 = 'I';
                        c3 = '`';
                        break;
                    case 'J':
                        if (c3 != '8') {
                            return;
                        }
                        return;
                    default:
                        c2 = 'H';
                }
            }
        }
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d b2 = d.b();
        b2.e("callstack_static").a("callstack_message", str).a("callstack_report_time", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, List<TTBaseAd> list, List<TTBaseAd> list2) {
        char c2 = '@';
        while (true) {
            switch (c2) {
                case '@':
                case 'A':
                    c2 = 'B';
                case 'B':
                    d b2 = d.b();
                    b2.e("bidding_win_event");
                    HashMap hashMap = new HashMap();
                    a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
                    JSONArray jSONArray = new JSONArray();
                    if (!i0.a(list)) {
                        for (TTBaseAd tTBaseAd2 : list) {
                            if (tTBaseAd2 != null) {
                                HashMap hashMap2 = hashMap;
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    JSONArray jSONArray2 = jSONArray;
                                    try {
                                        jSONObject.putOpt("mediation_rit", tTBaseAd2.getAdNetworkSlotId());
                                        jSONObject.putOpt(GMAdConstant.EXTRA_ADNNAME, tTBaseAd2.getAdNetWorkName());
                                        jSONObject.putOpt("load_sort", Integer.valueOf(tTBaseAd2.getLoadSort()));
                                        jSONObject.putOpt("show_sort", Integer.valueOf(tTBaseAd2.getShowSort()));
                                        jSONObject.putOpt("exchange_rate", tTBaseAd2.getExchangeRate());
                                        jSONObject.putOpt("rit_cpm", Double.valueOf(tTBaseAd2.getCpm()));
                                        jSONObject.putOpt("m_aid", tTBaseAd2.getAid());
                                        jSONObject.putOpt("req_bidding_type", Integer.valueOf(tTBaseAd2.getAdNetworkSlotType()));
                                        jSONObject.putOpt("win_state", 1);
                                        jSONObject.putOpt("ad_extra", tTBaseAd2.getAdExtra());
                                        jSONObject.putOpt("win_callback", tTBaseAd2.getWinCallback());
                                        jSONObject.putOpt("loss_callback", tTBaseAd2.getFailCallback());
                                        if (tTBaseAd2.isServerBiddingAd()) {
                                            jSONObject.putOpt("pricing_type", Integer.valueOf(tTBaseAd2.getPricingType()));
                                        }
                                        jSONArray = jSONArray2;
                                        jSONArray.put(jSONObject);
                                    } catch (Exception e) {
                                        jSONArray = jSONArray2;
                                    }
                                } catch (Exception e2) {
                                }
                                hashMap = hashMap2;
                            }
                        }
                    }
                    HashMap hashMap3 = hashMap;
                    if (!i0.a(list2)) {
                        Iterator<TTBaseAd> it = list2.iterator();
                        while (it.hasNext()) {
                            TTBaseAd next = it.next();
                            if (next != null) {
                                Iterator<TTBaseAd> it2 = it;
                                try {
                                    JSONObject jSONObject2 = new JSONObject();
                                    JSONArray jSONArray3 = jSONArray;
                                    try {
                                        jSONObject2.putOpt("mediation_rit", next.getAdNetworkSlotId());
                                        jSONObject2.putOpt(GMAdConstant.EXTRA_ADNNAME, next.getAdNetWorkName());
                                        jSONObject2.putOpt("load_sort", Integer.valueOf(next.getLoadSort()));
                                        jSONObject2.putOpt("show_sort", Integer.valueOf(next.getShowSort()));
                                        jSONObject2.putOpt("exchange_rate", next.getExchangeRate());
                                        jSONObject2.putOpt("rit_cpm", Double.valueOf(next.getCpm()));
                                        jSONObject2.putOpt("m_aid", next.getAid());
                                        jSONObject2.putOpt("req_bidding_type", Integer.valueOf(next.getAdNetworkSlotType()));
                                        jSONObject2.putOpt("win_state", 0);
                                        jSONObject2.putOpt("ad_extra", next.getAdExtra());
                                        jSONObject2.putOpt("win_callback", next.getWinCallback());
                                        jSONObject2.putOpt("loss_callback", next.getFailCallback());
                                        if (next.isServerBiddingAd()) {
                                            jSONObject2.putOpt("pricing_type", Integer.valueOf(next.getPricingType()));
                                        }
                                        jSONArray = jSONArray3;
                                        jSONArray.put(jSONObject2);
                                    } catch (Exception e3) {
                                        jSONArray = jSONArray3;
                                    }
                                } catch (Exception e4) {
                                }
                                it = it2;
                            }
                        }
                    }
                    hashMap3.put("others", jSONArray);
                    c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap3);
                    return;
            }
        }
    }

    public static void a(TTBaseAd tTBaseAd, AdSlot adSlot, boolean z) {
        d b2 = d.b();
        b2.e("media_show").a("adn_preload", Integer.valueOf((tTBaseAd == null || !tTBaseAd.isAdnPreload()) ? 0 : 1)).a("is_repeat", Integer.valueOf(z ? 1 : 0));
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d b2 = d.b();
        b2.e("callstack_dynamic");
        b2.a("callstack_message", str);
        b2.a("callstack_report_time", 1);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, null);
    }

    public static void a(String str, TTBaseAd tTBaseAd, AdSlot adSlot, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, AdError adError) {
        d b2 = d.b();
        d d = b2.c(adError != null ? adError.code : 0).d(adError != null ? adError.message : null);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        d.b(str).e("custom_adn_init_fail");
        HashMap hashMap = new HashMap();
        a(b2, adSlot, kVar, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    public static void a(List<TTBaseAd> list, AdSlot adSlot) {
        TTBaseAd tTBaseAd = (list == null || list.size() <= 0) ? null : list.get(0);
        d b2 = d.b();
        b2.e("media_show_fail");
        b2.c(AdError.ERROR_CODE_SHOW_FAIL_NO_AD);
        if (tTBaseAd != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (TTBaseAd tTBaseAd2 : list) {
                    if (tTBaseAd2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("adn", tTBaseAd2.getAdNetWorkName());
                        jSONObject.put("type", com.bytedance.msdk.base.a.a(tTBaseAd2.getAdType(), tTBaseAd2.getSubAdType()));
                        jSONObject.put("adnSlotId", tTBaseAd2.getAdNetworkSlotId());
                        jSONObject.put("loadSort", tTBaseAd2.getLoadSort());
                        jSONObject.put("showSort", tTBaseAd2.getShowSort());
                        if (adSlot != null) {
                            jSONObject.put("isReady", tTBaseAd2.isReady(adSlot.getAdUnitId()) ? 1 : 0);
                        }
                        jSONObject.put("hasShown", tTBaseAd2.isHasShown() ? 1 : 0);
                        jSONArray.put(jSONObject);
                    }
                }
                b2.d(jSONArray.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        HashMap hashMap = new HashMap();
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        b2.a("is_video_cache_success", 0);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 172
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void a(java.util.List<com.bytedance.msdk.base.TTBaseAd> r8, java.util.List<com.bytedance.msdk.base.TTBaseAd> r9, java.util.List<com.bytedance.msdk.base.TTBaseAd> r10, com.bytedance.msdk.api.AdSlot r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(java.util.List, java.util.List, java.util.List, com.bytedance.msdk.api.AdSlot, java.lang.String):void");
    }

    public static void a(boolean z) {
        d b2 = d.b();
        b2.e("get_config_start").a("reason", Integer.valueOf(z ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.W().a("is_config_from_assert") ? 2 : 1 : 0));
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, null);
    }

    public static void b(long j) {
        d b2 = d.b();
        b2.e("sdk_init").b(j);
        String str = null;
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            str = "unity_pure";
            Class.forName("com.bytedance.ad.sdk.mediation.AdManager");
            str = "unity";
        } catch (Throwable th) {
        }
        if (str != null) {
            b2.a("develop_type", str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("csj_plugin_version", bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.c.i());
        JSONObject d = f0.d();
        if (d != null) {
            hashMap.put("init_time", d);
        }
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
    }

    private static void b(d dVar) {
        dVar.a("block_pacing", GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
        dVar.a("rit_adn_show_rule_id", GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
        dVar.a("block_show_count", GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
        while (true) {
            char c2 = ']';
            char c3 = ']';
            while (true) {
                switch (c3) {
                    case '\\':
                        switch (c2) {
                        }
                        c3 = '^';
                        c2 = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c2) {
                                default:
                                    c2 = '[';
                                case '[':
                                case '\\':
                                case ']':
                                    break;
                            }
                        }
                        c3 = '^';
                        c2 = 'K';
                    case '^':
                        if (c2 <= 4) {
                            break;
                        } else {
                            return;
                        }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.bytedance.msdk.api.AdSlot r3, java.lang.String r4) {
        /*
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d.b()
            java.lang.String r1 = "mt_ra_cc"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d r1 = r0.e(r1)
            java.lang.String r2 = "waterfall_abtest"
            r1.a(r2, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1 = 0
            a(r0, r3, r1, r1, r4)
            android.content.Context r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d()
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a(r3, r0, r4)
        L1f:
            r3 = 73
            r4 = 96
        L23:
            switch(r3) {
                case 72: goto L31;
                case 73: goto L29;
                case 74: goto L2c;
                default: goto L26;
            }
        L26:
            r3 = 72
            goto L23
        L29:
            switch(r4) {
                case 94: goto L1f;
                case 95: goto L31;
                case 96: goto L31;
                default: goto L2c;
            }
        L2c:
            switch(r4) {
                case 55: goto L30;
                case 56: goto L31;
                case 57: goto L31;
                default: goto L2f;
            }
        L2f:
            goto L1f
        L30:
            return
        L31:
            r3 = 74
            r4 = 55
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.b(com.bytedance.msdk.api.AdSlot, java.lang.String):void");
    }

    public static void b(TTBaseAd tTBaseAd, AdSlot adSlot, int i, String str, long j, String str2, boolean z) {
        d b2 = d.b();
        b2.e("media_show_listen").a("adn_preload", Integer.valueOf((tTBaseAd == null || !tTBaseAd.isAdnPreload()) ? 0 : 1)).a("play_again", Integer.valueOf(i)).a("is_repeat", Integer.valueOf(z ? 1 : 0));
        if (str != null) {
            b2.a("sub_adn_name", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            b2.a("callstack_message", str2);
        }
        HashMap hashMap = new HashMap();
        boolean z2 = j >= 0;
        if (tTBaseAd != null && tTBaseAd.isCustomAd()) {
            hashMap.put("custom_adn_sample_ratio", Double.valueOf(u.a()));
            hashMap.put("custom_adn_sample_ratio_result", Boolean.valueOf(z2));
            if (z2) {
                hashMap.put("custom_adn_rec_time", Long.valueOf(j));
            }
        }
        a(b2, adSlot, (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) null, tTBaseAd, hashMap);
        c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d(), b2, hashMap);
        while (true) {
            for (char c2 = 20; c2 != 18; c2 = 19) {
                if (c2 == 19) {
                    return;
                }
            }
        }
    }

    public static void b(TTBaseAd tTBaseAd, AdSlot adSlot, int i, String str, long j, boolean z) {
        b(tTBaseAd, adSlot, i, str, j, null, z);
    }
}
