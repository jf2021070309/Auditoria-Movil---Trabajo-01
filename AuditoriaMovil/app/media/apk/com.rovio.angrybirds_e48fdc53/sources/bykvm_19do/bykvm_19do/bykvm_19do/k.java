package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k extends e2 {
    private final Context e;
    private final j2 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, j2 j2Var) {
        super(true, false);
        this.e = context;
        this.f = j2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        Map<String, String> a = s0.a(this.e, this.f.w());
        if (a != null) {
            jSONObject.put("oaid", new JSONObject(a));
            return true;
        }
        return false;
    }
}
