package com.applovin.impl.sdk.c;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a<T> extends b<T> {
    public static final b<Long> A;
    public static final b<Long> B;
    public static final b<Integer> C;
    public static final b<Long> D;
    public static final b<Long> E;
    public static final b<Boolean> F;
    public static final b<Boolean> G;
    public static final b<Long> H;
    public static final b<Boolean> I;
    public static final b<Long> J;
    public static final b<Long> K;
    public static final b<Boolean> L;
    public static final b<Long> M;
    public static final b<Boolean> N;
    public static final b<Integer> O;
    public static final b<Boolean> P;
    public static final b<String> Q;
    public static final b<String> R;
    public static final b<Integer> S;
    public static final b<String> T;
    public static final b<Boolean> U;
    public static final b<Long> V;
    public static final b<Boolean> W;
    public static final b<Boolean> X;
    public static final b<Boolean> Y;
    public static final b<Boolean> Z;
    public static final b<String> a = b.a("afi", "");
    public static final b<Boolean> aa;
    public static final b<Boolean> ab;

    /* renamed from: b  reason: collision with root package name */
    public static final b<Long> f3915b;

    /* renamed from: c  reason: collision with root package name */
    public static final b<String> f3916c;

    /* renamed from: d  reason: collision with root package name */
    public static final b<String> f3917d;

    /* renamed from: e  reason: collision with root package name */
    public static final b<Long> f3918e;

    /* renamed from: f  reason: collision with root package name */
    public static final b<Long> f3919f;

    /* renamed from: g  reason: collision with root package name */
    public static final b<Long> f3920g;

    /* renamed from: h  reason: collision with root package name */
    public static final b<Boolean> f3921h;

    /* renamed from: i  reason: collision with root package name */
    public static final b<String> f3922i;

    /* renamed from: j  reason: collision with root package name */
    public static final b<Boolean> f3923j;

    /* renamed from: k  reason: collision with root package name */
    public static final b<Long> f3924k;

    /* renamed from: l  reason: collision with root package name */
    public static final b<Long> f3925l;

    /* renamed from: m  reason: collision with root package name */
    public static final b<Long> f3926m;

    /* renamed from: n  reason: collision with root package name */
    public static final b<Long> f3927n;
    public static final b<String> o;
    public static final b<Long> p;
    public static final b<Boolean> q;
    public static final b<Boolean> r;
    public static final b<Boolean> s;
    public static final b<Boolean> t;
    public static final b<Boolean> u;
    public static final b<Boolean> v;
    public static final b<Boolean> w;
    public static final b<Long> x;
    public static final b<Long> y;
    public static final b<Boolean> z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3915b = e.a.d.a.a.O(timeUnit, 5L, "afi_ms");
        f3916c = b.a("mediation_endpoint", "https://ms.applovin.com/");
        f3917d = b.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f3918e = e.a.d.a.a.O(timeUnit, 2L, "fetch_next_ad_retry_delay_ms");
        f3919f = e.a.d.a.a.O(timeUnit, 5L, "fetch_next_ad_timeout_ms");
        f3920g = e.a.d.a.a.O(timeUnit, 7L, "fetch_mediation_debugger_info_timeout_ms");
        Boolean bool = Boolean.TRUE;
        f3921h = b.a("auto_init_mediation_debugger", bool);
        f3922i = b.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        Boolean bool2 = Boolean.FALSE;
        f3923j = b.a("persistent_mediated_postbacks", bool2);
        f3924k = e.a.d.a.a.O(timeUnit, 30L, "max_signal_provider_latency_ms");
        f3925l = e.a.d.a.a.O(timeUnit, 10L, "default_adapter_timeout_ms");
        f3926m = e.a.d.a.a.O(timeUnit, 30L, "ad_refresh_ms");
        f3927n = e.a.d.a.a.O(timeUnit, 30L, "ad_load_failure_refresh_ms");
        o = b.a("ad_load_failure_refresh_ignore_error_codes", "204");
        p = b.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        q = b.a("refresh_ad_view_timer_responds_to_background", bool);
        r = b.a("refresh_ad_view_timer_responds_to_store_kit", bool);
        s = b.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool2);
        t = b.a("avrrpsoar", bool2);
        u = b.a("avrrpsofad", bool2);
        v = b.a("avrsponse", bool2);
        w = b.a("allow_pause_auto_refresh_immediately", bool2);
        x = b.a("ad_view_fade_in_animation_ms", 150L);
        y = b.a("ad_view_fade_out_animation_ms", 150L);
        z = b.a("fade_out_ad_view", bool2);
        A = b.a("fullscreen_display_delay_ms", 600L);
        B = b.a("ahdm", 500L);
        C = b.a("ad_load_reminder_delay_seconds", 5);
        D = b.a("ad_view_refresh_precache_request_viewability_undesired_flags", 502L);
        E = e.a.d.a.a.O(timeUnit, 2L, "ad_view_refresh_precache_request_delay_ms");
        F = b.a("fullscreen_ads_block_publisher_load_if_another_showing", bool);
        G = b.a("fabsina", bool2);
        H = e.a.d.a.a.O(TimeUnit.HOURS, 4L, "ad_expiration_ms");
        I = b.a("saewib", bool2);
        J = b.a("fullscreen_ad_displayed_timeout_ms", -1L);
        K = b.a("ad_hidden_timeout_ms", -1L);
        L = b.a("schedule_ad_hidden_on_ad_dismiss", bool2);
        M = e.a.d.a.a.O(timeUnit, 1L, "ad_hidden_on_ad_dismiss_callback_delay_ms");
        N = b.a("proe", bool2);
        O = b.a("mute_state", 2);
        P = b.a("adapters_to_re_fetch_sdk_version_if_empty", bool);
        Q = b.a("saf", "");
        R = b.a("saui", "");
        S = b.a("mra", -1);
        T = b.a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
        U = b.a("pmp", bool2);
        V = b.a("lpd_s", -1L);
        W = b.a("sai", bool2);
        X = b.a("init_adapter_for_sc", bool);
        Y = b.a("init_adapter_for_al", bool);
        Z = b.a("fadiafase", bool);
        aa = b.a("fetch_mediated_ad_gzip", bool2);
        ab = b.a("max_postback_gzip", bool2);
    }
}
