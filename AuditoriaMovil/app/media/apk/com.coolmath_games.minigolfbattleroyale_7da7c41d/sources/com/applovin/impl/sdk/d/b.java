package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    private static final Set<String> G = new HashSet(32);
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;
    private final String E;
    private final String F;

    static {
        a("sisw", "IS_STREAMING_WEBKIT");
        a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        a("skr", "STOREKIT_REDIRECTED");
        a("sklf", "STOREKIT_LOAD_FAILURE");
        a("skps", "STOREKIT_PRELOAD_SKIPPED");
        a = a("sas", "AD_SOURCE");
        b = a("srt", "AD_RENDER_TIME");
        c = a("sft", "AD_FETCH_TIME");
        d = a("sfs", "AD_FETCH_SIZE");
        e = a("sadb", "AD_DOWNLOADED_BYTES");
        f = a("sacb", "AD_CACHED_BYTES");
        g = a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");
        h = a("stdi", "TIME_TO_DISPLAY_FROM_INIT");
        i = a("snas", "AD_NUMBER_IN_SESSION");
        j = a("snat", "AD_NUMBER_TOTAL");
        k = a("stah", "TIME_AD_HIDDEN_FROM_SHOW");
        l = a("stas", "TIME_TO_SKIP_FROM_SHOW");
        m = a("stac", "TIME_TO_CLICK_FROM_SHOW");
        n = a("stbe", "TIME_TO_EXPAND_FROM_SHOW");
        o = a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");
        p = a("saan", "AD_SHOWN_WITH_ACTIVE_NETWORK");
        q = a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");
        r = a("sugs", "AD_USED_GRAPHIC_STREAM");
        s = a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");
        t = a("stpd", "INTERSTITIAL_PAUSED_DURATION");
        u = a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");
        v = a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");
        w = a("schc", "AD_CANCELLED_HTML_CACHING");
        x = a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");
        y = a("vssc", "VIDEO_STREAM_STALLED_COUNT");
        z = a("wvem", "WEB_VIEW_ERROR_MESSAGES");
        A = a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");
        B = a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");
        C = a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");
        D = a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");
    }

    private b(String str, String str2) {
        this.E = str;
        this.F = str2;
    }

    private static b a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        if (G.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        } else if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("No debug name specified");
        } else {
            G.add(str);
            return new b(str, str2);
        }
    }

    public String a() {
        return this.E;
    }

    public String b() {
        return this.F;
    }
}
