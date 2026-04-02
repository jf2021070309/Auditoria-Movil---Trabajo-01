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

    /* renamed from: b  reason: collision with root package name */
    public static final b f3963b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f3964c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f3965d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f3966e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f3967f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f3968g;

    /* renamed from: h  reason: collision with root package name */
    public static final b f3969h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f3970i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f3971j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f3972k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f3973l;

    /* renamed from: m  reason: collision with root package name */
    public static final b f3974m;

    /* renamed from: n  reason: collision with root package name */
    public static final b f3975n;
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
        f3963b = a("srt", "AD_RENDER_TIME");
        f3964c = a("sft", "AD_FETCH_TIME");
        f3965d = a("sfs", "AD_FETCH_SIZE");
        f3966e = a("sadb", "AD_DOWNLOADED_BYTES");
        f3967f = a("sacb", "AD_CACHED_BYTES");
        f3968g = a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");
        f3969h = a("stdi", "TIME_TO_DISPLAY_FROM_INIT");
        f3970i = a("snas", "AD_NUMBER_IN_SESSION");
        f3971j = a("snat", "AD_NUMBER_TOTAL");
        f3972k = a("stah", "TIME_AD_HIDDEN_FROM_SHOW");
        f3973l = a("stas", "TIME_TO_SKIP_FROM_SHOW");
        f3974m = a("stac", "TIME_TO_CLICK_FROM_SHOW");
        f3975n = a("stbe", "TIME_TO_EXPAND_FROM_SHOW");
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
        Set<String> set = G;
        if (set.contains(str)) {
            throw new IllegalArgumentException(e.a.d.a.a.k("Key has already been used: ", str));
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("No debug name specified");
        }
        set.add(str);
        return new b(str, str2);
    }

    public String a() {
        return this.E;
    }

    public String b() {
        return this.F;
    }
}
