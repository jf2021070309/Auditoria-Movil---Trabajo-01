package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i2 extends e2 {
    private final Context e;
    private final j2 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(Context context, j2 j2Var) {
        super(false, false);
        this.e = context;
        this.f = j2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        jSONObject.put("sdk_version", 336);
        jSONObject.put("sdk_version_name", "3.6.0-rc.10-embed");
        jSONObject.put("channel", this.f.C());
        k2.a(jSONObject, "aid", this.f.B());
        k2.a(jSONObject, "release_build", this.f.S());
        k2.a(jSONObject, "app_region", this.f.F());
        k2.a(jSONObject, "app_language", this.f.E());
        k2.a(jSONObject, "user_agent", this.f.a());
        k2.a(jSONObject, "ab_sdk_version", this.f.H());
        k2.a(jSONObject, "ab_version", this.f.L());
        k2.a(jSONObject, "aliyun_uuid", this.f.t());
        String D = this.f.D();
        if (TextUtils.isEmpty(D)) {
            D = g0.a(this.e, this.f);
        }
        if (!TextUtils.isEmpty(D)) {
            k2.a(jSONObject, "google_aid", D);
        }
        String R = this.f.R();
        if (!TextUtils.isEmpty(R)) {
            try {
                jSONObject.put("app_track", new JSONObject(R));
            } catch (Throwable th) {
                l0.a(th);
            }
        }
        String G = this.f.G();
        if (G != null && G.length() > 0) {
            jSONObject.put("custom", new JSONObject(G));
        }
        k2.a(jSONObject, "user_unique_id", this.f.I());
        return true;
    }
}
