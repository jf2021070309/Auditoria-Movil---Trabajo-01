package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import com.facebook.internal.NativeProtocol;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class i extends a {
    private static final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public i(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static i b(Context context, d dVar, JSONObject jSONObject) {
        return new i(UUID.randomUUID().toString(), d(context, dVar, jSONObject));
    }

    private static JSONObject d(Context context, d dVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("event", dVar.a);
            jSONObject2.putOpt(NativeProtocol.WEB_DIALOG_PARAMS, jSONObject);
            jSONObject2.putOpt("nt", Integer.valueOf(e.a(context)));
            jSONObject2.putOpt("datetime", d.format(new Date()));
        } catch (Exception e) {
            try {
                JSONObject optJSONObject = jSONObject2.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("event_extra");
                    if (!TextUtils.isEmpty(optString)) {
                        JSONObject jSONObject3 = new JSONObject(optString);
                        jSONObject3.putOpt("v3_err_msg", e.toString());
                        optJSONObject.putOpt("event_extra", jSONObject3.toString());
                    }
                }
                if (dVar != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.putOpt("v3_eventId", dVar.v.get("event_id"));
                    jSONObject4.putOpt("v3_err_msg", e.toString());
                    f0.a(jSONObject4);
                }
            } catch (Throwable th) {
            }
        }
        return jSONObject2;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a
    public String toString() {
        return "AdEventV3{localId='" + this.a + "', event=" + this.b + '}';
    }
}
