package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends c {
    private String d;

    public a(Context context) {
        super(context);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a c = c();
        if (c != null) {
            this.d = c.a();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.c
    protected String a() {
        return TextUtils.isEmpty(this.d) ? "appId为空" : "";
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.c
    protected String b() {
        return "admob";
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.c
    protected Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.d);
        return hashMap;
    }
}
