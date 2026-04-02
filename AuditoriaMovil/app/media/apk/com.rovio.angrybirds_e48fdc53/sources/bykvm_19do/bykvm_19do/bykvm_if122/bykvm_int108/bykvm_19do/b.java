package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.config.TTBaseAdapterConfiguration;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b extends d {
    private String d;

    public b(Context context) {
        super(context, null);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a c = c();
        if (c != null) {
            this.d = c.a();
        }
    }

    public b(Context context, GMNetworkRequestInfo gMNetworkRequestInfo) {
        super(context, gMNetworkRequestInfo);
        if (gMNetworkRequestInfo != null) {
            this.d = gMNetworkRequestInfo.getAppId();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.c
    protected String a() {
        return TextUtils.isEmpty(this.d) ? "appId为空" : "";
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.c
    protected String b() {
        return "baidu";
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.c
    protected Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.d);
        hashMap.put(TTBaseAdapterConfiguration.BAIDU_HTTPS, Boolean.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().A()));
        if (!TextUtils.isEmpty(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().x())) {
            hashMap.put(TTBaseAdapterConfiguration.BAIDU_WX_APP_ID, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().x());
        }
        return hashMap;
    }
}
