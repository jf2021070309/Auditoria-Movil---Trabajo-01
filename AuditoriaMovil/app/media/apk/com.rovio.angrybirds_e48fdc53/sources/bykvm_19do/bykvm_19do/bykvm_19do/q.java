package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q extends e2 {
    private final Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Context context) {
        super(true, false);
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        l0.a("s.1", null);
        h k = a.k();
        if (k == null || !k.B()) {
            return true;
        }
        k2.a(jSONObject, "sim_region", ((TelephonyManager) this.e.getSystemService(PlaceFields.PHONE)).getSimCountryIso());
        return true;
    }
}
