package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g2 extends e2 {
    private final j2 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(Context context, j2 j2Var) {
        super(true, false);
        this.e = j2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        String a = s0.a(this.e.w());
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        jSONObject.put("cdid", a);
        return true;
    }
}
