package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends e2 {
    private final Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context) {
        super(true, true);
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        k2.a(jSONObject, bg.Q, h0.b(this.e));
        return true;
    }
}
