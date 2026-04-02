package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class f {
    private final String t;
    private static final Set<String> s = new HashSet(32);
    private static final Set<f> u = new HashSet(16);
    public static final f a = a("ad_req");

    /* renamed from: b  reason: collision with root package name */
    public static final f f3995b = a("ad_imp");

    /* renamed from: c  reason: collision with root package name */
    public static final f f3996c = a("ad_session_start");

    /* renamed from: d  reason: collision with root package name */
    public static final f f3997d = a("ad_imp_session");

    /* renamed from: e  reason: collision with root package name */
    public static final f f3998e = a("cached_files_expired");

    /* renamed from: f  reason: collision with root package name */
    public static final f f3999f = a("cache_drop_count");

    /* renamed from: g  reason: collision with root package name */
    public static final f f4000g = a("sdk_reset_state_count", true);

    /* renamed from: h  reason: collision with root package name */
    public static final f f4001h = a("ad_response_process_failures", true);

    /* renamed from: i  reason: collision with root package name */
    public static final f f4002i = a("response_process_failures", true);

    /* renamed from: j  reason: collision with root package name */
    public static final f f4003j = a("incent_failed_to_display_count", true);

    /* renamed from: k  reason: collision with root package name */
    public static final f f4004k = a("app_paused_and_resumed");

    /* renamed from: l  reason: collision with root package name */
    public static final f f4005l = a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: m  reason: collision with root package name */
    public static final f f4006m = a("ad_shown_outside_app_count");

    /* renamed from: n  reason: collision with root package name */
    public static final f f4007n = a("med_ad_req");
    public static final f o = a("med_ad_response_process_failures", true);
    public static final f p = a("med_waterfall_ad_no_fill", true);
    public static final f q = a("med_waterfall_ad_adapter_load_failed", true);
    public static final f r = a("med_waterfall_ad_invalid_response", true);

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private f(String str) {
        this.t = str;
    }

    private static f a(String str) {
        return a(str, false);
    }

    private static f a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        Set<String> set = s;
        if (set.contains(str)) {
            throw new IllegalArgumentException(e.a.d.a.a.k("Key has already been used: ", str));
        }
        set.add(str);
        f fVar = new f(str);
        if (z) {
            u.add(fVar);
        }
        return fVar;
    }

    public static Set<f> b() {
        return u;
    }

    public String a() {
        return this.t;
    }
}
