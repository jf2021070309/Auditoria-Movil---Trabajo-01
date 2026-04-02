package com.vungle.publisher;

import com.vungle.publisher.wa;
import com.vungle.publisher.wu;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wv extends wu {
    protected List<String> a;
    protected List<String> b;
    protected List<String> c;
    protected List<String> d;
    protected List<String> e;
    protected List<String> f;
    protected wa[] g;
    protected List<String> h;
    protected List<String> i;
    protected List<String> j;
    private Boolean k;
    private String l;

    protected wv() {
    }

    public List<String> c() {
        return this.a;
    }

    public List<String> d() {
        return this.b;
    }

    public List<String> f() {
        return this.c;
    }

    public List<String> g() {
        return this.d;
    }

    public List<String> h() {
        return this.e;
    }

    public List<String> i() {
        return this.f;
    }

    public wa[] j() {
        return this.g;
    }

    public List<String> k() {
        return this.h;
    }

    public List<String> l() {
        return this.i;
    }

    public List<String> m() {
        return this.j;
    }

    public Boolean n() {
        return this.k;
    }

    public String o() {
        return this.l;
    }

    @Override // com.vungle.publisher.vs, com.vungle.publisher.vt
    /* renamed from: a */
    public JSONObject b() {
        JSONObject a2 = super.b();
        a2.putOpt("postroll_click", this.a);
        a2.putOpt("video_click", this.b);
        a2.putOpt("video_close", this.c);
        a2.putOpt("error", this.d);
        a2.putOpt("mute", this.e);
        a2.putOpt("pause", this.f);
        a2.putOpt("play_percentage", ra.a(this.g));
        a2.putOpt("postroll_view", this.h);
        a2.putOpt("resume", this.i);
        a2.putOpt("unmute", this.j);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends wu.a<wv> {
        @Inject
        protected wa.a a;

        @Override // com.vungle.publisher.wu.a, com.vungle.publisher.vy
        /* renamed from: a */
        public wv c(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            wv b = b();
            b.a = ra.h(jSONObject, "postroll_click");
            b.b = ra.h(jSONObject, "video_click");
            b.c = ra.h(jSONObject, "video_close");
            b.d = ra.h(jSONObject, "error");
            b.e = ra.h(jSONObject, "mute");
            b.f = ra.h(jSONObject, "pause");
            b.g = this.a.a(jSONObject.optJSONArray("play_percentage"));
            b.h = ra.h(jSONObject, "postroll_view");
            b.i = ra.h(jSONObject, "resume");
            b.j = ra.h(jSONObject, "unmute");
            JSONObject jSONObject2 = jSONObject.getJSONObject("moat");
            b.k = ra.a(jSONObject2, "is_enabled");
            b.l = ra.f(jSONObject2, "extra_vast");
            return b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wv[] b(int i) {
            return new wv[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wv b() {
            return new wv();
        }
    }
}
