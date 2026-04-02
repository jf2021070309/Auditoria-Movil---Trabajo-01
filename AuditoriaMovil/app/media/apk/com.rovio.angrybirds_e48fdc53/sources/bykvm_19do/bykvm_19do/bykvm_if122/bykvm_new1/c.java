package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c implements f {
    private int b = -1;
    private int c = -1;
    private long d = -1;
    private f0 a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.T();

    private JSONObject b() {
        String a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(this.a.d("app_common_config"), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
        if (a != null && !TextUtils.isEmpty(a)) {
            try {
                return new JSONObject(a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private void b(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("event_batch_size", 100);
        this.b = optInt;
        if (optInt <= 0 || optInt > 1000) {
            this.b = 100;
        }
        long optLong = jSONObject.optLong("event_routine_interval", 120000L);
        this.d = optLong;
        if (optLong < 10000 || optLong > 300000) {
            this.d = 120000L;
        }
        this.c = jSONObject.optInt("event_send_type", 0);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.c.a(jSONObject.optInt("if_use_new_loglib", 0));
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.b.d().a(jSONObject.optInt("pre_fetch_count", 20));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public long a() {
        JSONObject b;
        long j = this.d;
        if (j == -1) {
            if (this.a == null || (b = b()) == null) {
                return 120000L;
            }
            b(b);
            return this.d;
        }
        return j;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            b(jSONObject);
            String b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(jSONObject.toString(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            if (b != null && !TextUtils.isEmpty(b)) {
                this.a.b("app_common_config", b);
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_for12.a.k().a(jSONObject);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public int d() {
        JSONObject b;
        int i = this.c;
        if (i == -1) {
            if (this.a == null || (b = b()) == null) {
                return 0;
            }
            b(b);
            return this.c;
        }
        return i;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.f
    public int h() {
        JSONObject b;
        int i = this.b;
        if (i == -1) {
            if (this.a == null || (b = b()) == null) {
                return 100;
            }
            b(b);
            return this.b;
        }
        return i;
    }
}
