package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends a {
    private static volatile b d;
    protected final Map<String, String> c;

    private b() {
        super("label_v_v_s_3");
        this.c = new ConcurrentHashMap();
        c();
    }

    public static b d() {
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.a
    protected Map<String, String> a() {
        return this.c;
    }

    protected JSONObject a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e eVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = GMNetworkPlatformConst.AD_NETWORK_NO_PRICE;
            jSONObject.putOpt("label_name", eVar != null ? eVar.b() : GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
            jSONObject.putOpt("label_id", eVar != null ? Integer.valueOf(eVar.a()) : GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
            if (eVar != null) {
                str = eVar.c();
            }
            jSONObject.putOpt("label_version", str);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, int i, double d2) {
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b() || TextUtils.isEmpty(str)) {
            return;
        }
        a(3, str, i, d2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.a
    protected void a(String str, int i, String str2) {
        if (i == 3) {
            this.c.put(str, str2);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.a
    protected void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Logger.i("DynamicLabelValueManagerAbs", "readCacheFromSp-SP_NAME_V3，cpmKey:" + str + "，type_value_timestamp:" + str2);
        if (str.startsWith("cpm_key_")) {
            this.c.put(str, str2);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.a
    protected boolean a(String str, JSONObject jSONObject, Map<String, Object> map) {
        try {
            Object obj = map.get("user_label_value");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            jSONObject2.putOpt("label_info", a(obj != null ? (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e) obj : null));
            jSONObject2.putOpt("ecpm_ttl", Integer.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().g()));
            jSONObject2.putOpt("rule_id", map.get("rule_id"));
            jSONObject2.putOpt("group_type", map.get("group_type"));
            jSONObject2.putOpt("rule_in_use", map.get("rule_in_use"));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt(RewardItem.KEY_ECPM, map.get(RewardItem.KEY_ECPM));
            jSONObject3.putOpt("timestamp", String.valueOf(System.currentTimeMillis()));
            jSONObject2.putOpt("ecpm_info", jSONObject3);
            jSONObject2.putOpt("refresh_time", map.get("refresh_time"));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, JSONObject jSONObject, Map<String, Object> map) {
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b() || TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        try {
            jSONObject.putOpt("rule_id", map.get("rule_id"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
