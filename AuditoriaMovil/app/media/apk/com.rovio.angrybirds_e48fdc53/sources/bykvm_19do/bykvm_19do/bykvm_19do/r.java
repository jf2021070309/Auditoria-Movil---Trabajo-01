package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r extends e2 {
    private final Context e;
    private final j2 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context, j2 j2Var) {
        super(true, false);
        this.e = context;
        this.f = j2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        l0.a("m.1", null);
        TelephonyManager telephonyManager = (TelephonyManager) this.e.getSystemService(PlaceFields.PHONE);
        if (telephonyManager != null) {
            try {
                if (this.f.o()) {
                    k2.a(jSONObject, bg.P, telephonyManager.getNetworkOperatorName());
                    k2.a(jSONObject, "mcc_mnc", telephonyManager.getNetworkOperator());
                }
                k2.a(jSONObject, "udid", this.f.o() ? i0.a(telephonyManager) : this.f.m());
                return true;
            } catch (Exception e) {
                l0.a(e);
                return false;
            }
        }
        return false;
    }
}
