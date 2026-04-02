package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static final List<String> c = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");
    private final com.applovin.impl.sdk.k b;
    private final JSONObject d;
    private final JSONObject e;
    private final com.applovin.impl.sdk.a.b f;
    protected List<p> a = new ArrayList();
    private final long g = System.currentTimeMillis();

    public c(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.a.b bVar, com.applovin.impl.sdk.k kVar) {
        this.b = kVar;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = bVar;
    }

    public int a() {
        return this.a.size();
    }

    public List<p> b() {
        return this.a;
    }

    public JSONObject c() {
        return this.d;
    }

    public JSONObject d() {
        return this.e;
    }

    public com.applovin.impl.sdk.a.b e() {
        return this.f;
    }

    public long f() {
        return this.g;
    }

    public List<String> g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.d, "vast_preferred_video_types", null));
        return !explode.isEmpty() ? explode : c;
    }

    public int h() {
        return Utils.getVideoCompletionPercent(this.d);
    }
}
