package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.config.TTBaseAdapterConfiguration;
import com.bytedance.msdk.api.v2.GMNetworkRequestInfo;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class j extends d {
    protected String d;

    public j(Context context) {
        super(context, null);
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a c = c();
        if (c != null) {
            this.d = c.a();
        }
        if (TextUtils.isEmpty(this.d)) {
            this.d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().b();
        }
    }

    public j(Context context, GMNetworkRequestInfo gMNetworkRequestInfo) {
        super(context, gMNetworkRequestInfo);
        if (gMNetworkRequestInfo != null) {
            this.d = gMNetworkRequestInfo.getAppId();
        }
    }

    public static j a(Context context) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().C() ? new k(context) : new i(context);
    }

    public static j a(Context context, GMNetworkRequestInfo gMNetworkRequestInfo) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().C() ? new k(context, gMNetworkRequestInfo) : new i(context, gMNetworkRequestInfo);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.c
    protected String a() {
        return TextUtils.isEmpty(this.d) ? "appId为空" : "";
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_19do.c
    protected Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", this.d);
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_IS_PANGLE_USE_TEXTURE_VIEW, Boolean.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().G()));
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_APP_NAME, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().i());
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_IS_PANGLE_PAID, Boolean.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().F()));
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_TITLE_BAR_THEME, Integer.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().o()));
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_IS_PANGLE_ALLOW_SHOW_NOTIFY, Boolean.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().D()));
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_IS_PANGLE_ALLOW_SHOW_PAGE_WHEN_SCREEN_LOCK, Boolean.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().E()));
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_DIRECT_DOWNLOAD_NETWORKTYPE, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().p());
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_NEED_CLEAR_TASK_RESET, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().m());
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_KEYWORDS, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().l());
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_PLUGIN_UPDATE_CONFIG, Integer.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().n()));
        hashMap.put(TTBaseAdapterConfiguration.PANGLE_SUPPORT_MULTI_PROCESS, Boolean.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().u()));
        return hashMap;
    }
}
