package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.SharedPreferences;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o extends e2 {
    private final j2 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j2 j2Var) {
        super(true, false, false);
        this.e = j2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        SharedPreferences w = this.e.w();
        String string = w.getString("install_id", null);
        String string2 = w.getString("device_id", null);
        String string3 = w.getString("ssid", null);
        k2.a(jSONObject, "install_id", string);
        k2.a(jSONObject, "device_id", string2);
        k2.a(jSONObject, "ssid", string3);
        long j = 0;
        long j2 = w.getLong("register_time", 0L);
        if ((k2.b(string) && k2.b(string2)) || j2 == 0) {
            j = j2;
        } else {
            w.edit().putLong("register_time", 0L).apply();
        }
        jSONObject.put("register_time", j);
        return true;
    }
}
