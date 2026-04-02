package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h2 extends e2 {
    private final Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(Context context) {
        super(false, false);
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        SharedPreferences sharedPreferences = this.e.getSharedPreferences("snssdk_openudid", 0);
        String string = sharedPreferences.getString("clientudid", null);
        if (!k2.a(string)) {
            try {
                string = a("clientudid.dat", UUID.randomUUID().toString());
            } catch (Exception e) {
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("clientudid", string);
            edit.apply();
        }
        jSONObject.put("clientudid", string);
        return true;
    }
}
