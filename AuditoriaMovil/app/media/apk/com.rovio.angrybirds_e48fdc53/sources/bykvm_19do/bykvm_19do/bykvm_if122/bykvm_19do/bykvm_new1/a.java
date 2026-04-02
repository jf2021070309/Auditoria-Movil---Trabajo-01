package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_new1;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.util.Preconditions;
import com.bytedance.msdk.api.v2.ad.custom.init.GMCustomAdapterConfiguration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class a {
    private final Map<String, GMCustomAdapterConfiguration> a;

    public a() {
        new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
    }

    public ITTAdapterConfiguration a(String str) {
        return c.b().a(str);
    }

    public String a(Context context, Map<String, Object> map, String str) {
        Preconditions.checkNotNull(context);
        GMCustomAdapterConfiguration b = b(str);
        if (b != null) {
            return b.getBiddingToken(null, null);
        }
        ITTAdapterConfiguration a = a(str);
        if (a != null) {
            return a.getBiddingToken(context, map);
        }
        return null;
    }

    public void a(String str, GMCustomAdapterConfiguration gMCustomAdapterConfiguration) {
        this.a.put(str, gMCustomAdapterConfiguration);
    }

    public GMCustomAdapterConfiguration b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public Map<String, Object> b(Context context, Map<String, Object> map, String str) {
        Preconditions.checkNotNull(context);
        GMCustomAdapterConfiguration b = b(str);
        if (b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("buyerId", b.getBiddingToken(context, map));
            hashMap.put("sdkInfo", b.getSdkInfo(context, map));
            return hashMap;
        }
        ITTAdapterConfiguration a = a(str);
        if (a == null) {
            return null;
        }
        return a.getBiddingTokenMap(context, map);
    }
}
