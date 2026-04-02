package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f3081c = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f3082b;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f3083d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f3084e;

    /* renamed from: f  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f3085f;
    public List<q> a = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final long f3086g = System.currentTimeMillis();

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.m mVar) {
        this.f3082b = mVar;
        this.f3083d = jSONObject;
        this.f3084e = jSONObject2;
        this.f3085f = bVar;
    }

    public int a() {
        return this.a.size();
    }

    public List<q> b() {
        return this.a;
    }

    public JSONObject c() {
        return this.f3083d;
    }

    public JSONObject d() {
        return this.f3084e;
    }

    public com.applovin.impl.sdk.ad.b e() {
        return this.f3085f;
    }

    public long f() {
        return this.f3086g;
    }

    public List<String> g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f3083d, "vast_preferred_video_types", null));
        return !explode.isEmpty() ? explode : f3081c;
    }

    public int h() {
        return Utils.getVideoCompletionPercent(this.f3083d);
    }
}
