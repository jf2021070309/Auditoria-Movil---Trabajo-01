package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    private final int a;

    public e(int i) {
        this.a = i;
    }

    public e(int i, String str) {
        this.a = i;
    }

    public e(int i, Throwable th) {
        this.a = i;
        if (th != null) {
            th.getMessage();
        }
    }

    public e(int i, JSONObject jSONObject) {
        this.a = i;
    }

    public boolean a() {
        return this.a == 0;
    }
}
