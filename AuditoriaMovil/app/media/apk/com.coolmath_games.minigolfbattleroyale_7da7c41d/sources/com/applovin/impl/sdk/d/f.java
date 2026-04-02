package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class f {
    private final String u;
    private static final Set<String> t = new HashSet(32);
    private static final Set<f> v = new HashSet(16);
    public static final f a = a("ad_req");
    public static final f b = a("ad_imp");
    public static final f c = a("ad_session_start");
    public static final f d = a("ad_imp_session");
    public static final f e = a("cached_files_expired");
    public static final f f = a("cache_drop_count");
    public static final f g = a("sdk_reset_state_count", true);
    public static final f h = a("ad_response_process_failures", true);
    public static final f i = a("response_process_failures", true);
    public static final f j = a("incent_failed_to_display_count", true);
    public static final f k = a("app_paused_and_resumed");
    public static final f l = a("ad_rendered_with_mismatched_sdk_key", true);
    public static final f m = a("ad_shown_outside_app_count");
    public static final f n = a("med_ad_req");
    public static final f o = a("med_ad_response_process_failures", true);
    public static final f p = a("med_adapters_failed_init_missing_activity", true);
    public static final f q = a("med_waterfall_ad_no_fill", true);
    public static final f r = a("med_waterfall_ad_adapter_load_failed", true);
    public static final f s = a("med_waterfall_ad_invalid_response", true);

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private f(String str) {
        this.u = str;
    }

    private static f a(String str) {
        return a(str, false);
    }

    private static f a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        if (t.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        t.add(str);
        f fVar = new f(str);
        if (z) {
            v.add(fVar);
        }
        return fVar;
    }

    public static Set<f> b() {
        return v;
    }

    public String a() {
        return this.u;
    }
}
