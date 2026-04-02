package com.applovin.impl.sdk.c;

import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
/* loaded from: classes.dex */
public class d<T> {
    private final String E;
    private final Class<T> F;
    public static final d<String> a = new d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: b  reason: collision with root package name */
    public static final d<Boolean> f3938b = new d<>("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: c  reason: collision with root package name */
    public static final d<String> f3939c = new d<>("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: d  reason: collision with root package name */
    public static final d<Long> f3940d = new d<>("com.applovin.sdk.install_date", Long.class);

    /* renamed from: e  reason: collision with root package name */
    public static final d<String> f3941e = new d<>("com.applovin.sdk.user_id", String.class);

    /* renamed from: f  reason: collision with root package name */
    public static final d<String> f3942f = new d<>("com.applovin.sdk.compass_id", String.class);

    /* renamed from: g  reason: collision with root package name */
    public static final d<String> f3943g = new d<>("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: h  reason: collision with root package name */
    public static final d<String> f3944h = new d<>("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: i  reason: collision with root package name */
    public static final d<String> f3945i = new d<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: j  reason: collision with root package name */
    public static final d<String> f3946j = new d<>("com.applovin.sdk.variables", String.class);

    /* renamed from: k  reason: collision with root package name */
    public static final d<Boolean> f3947k = new d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: l  reason: collision with root package name */
    public static final d<Boolean> f3948l = new d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: m  reason: collision with root package name */
    public static final d<Boolean> f3949m = new d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: n  reason: collision with root package name */
    public static final d<String> f3950n = new d<>("IABTCF_TCString", String.class);
    public static final d<?> o = new d<>("IABTCF_gdprApplies", Object.class);
    public static final d<HashSet> p = new d<>("com.applovin.sdk.impl.postbackQueue.key", HashSet.class);
    public static final d<String> q = new d<>("com.applovin.sdk.stats", String.class);
    public static final d<HashSet> r = new d<>("com.applovin.sdk.task.stats", HashSet.class);
    public static final d<String> s = new d<>("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final d<String> t = new d<>("com.applovin.sdk.event_tracking.super_properties", String.class);
    public static final d<String> u = new d<>("com.applovin.sdk.request_tracker.counter", String.class);
    public static final d<HashSet> v = new d<>("com.applovin.sdk.ad.stats", HashSet.class);
    public static final d<Integer> w = new d<>("com.applovin.sdk.last_video_position", Integer.class);
    public static final d<Boolean> x = new d<>("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final d<String> y = new d<>("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final d<String> z = new d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final d<String> A = new d<>("com.applovin.sdk.persisted_data", String.class);
    public static final d<String> B = new d<>("com.applovin.sdk.mediation_provider", String.class);
    public static final d<String> C = new d<>("com.applovin.sdk.mediation.test_mode_network", String.class);
    public static final d<Boolean> D = new d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);

    public d(String str, Class<T> cls) {
        this.E = str;
        this.F = cls;
    }

    public String a() {
        return this.E;
    }

    public Class<T> b() {
        return this.F;
    }

    public String toString() {
        StringBuilder y2 = e.a.d.a.a.y("Key{name='");
        e.a.d.a.a.J(y2, this.E, CoreConstants.SINGLE_QUOTE_CHAR, ", type=");
        y2.append(this.F);
        y2.append('}');
        return y2.toString();
    }
}
