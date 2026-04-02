package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c2 extends e2 {
    private final j2 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c2(Context context, j2 j2Var) {
        super(true, false);
        this.e = j2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        if (!TextUtils.isEmpty(this.e.i())) {
            jSONObject.put("ab_client", this.e.i());
        }
        if (!TextUtils.isEmpty(this.e.L())) {
            if (l0.a) {
                l0.a("init config has abversion:" + this.e.L(), null);
            }
            jSONObject.put("ab_version", this.e.L());
        }
        if (!TextUtils.isEmpty(this.e.j())) {
            jSONObject.put("ab_group", this.e.j());
        }
        if (TextUtils.isEmpty(this.e.k())) {
            return true;
        }
        jSONObject.put("ab_feature", this.e.k());
        return true;
    }
}
