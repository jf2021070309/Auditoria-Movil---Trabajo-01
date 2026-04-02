package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n2 extends e2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(Context context, j2 j2Var) {
        super(true, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        String a = a.k() != null ? a.k().s().a() : "";
        if (TextUtils.isEmpty(a)) {
            return true;
        }
        jSONObject.put(bg.A, a);
        return true;
    }
}
