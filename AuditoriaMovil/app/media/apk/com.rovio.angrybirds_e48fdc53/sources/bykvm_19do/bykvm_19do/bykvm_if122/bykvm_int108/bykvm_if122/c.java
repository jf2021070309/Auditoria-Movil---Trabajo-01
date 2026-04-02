package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.msdk.adapter.config.DefaultAdapterClasses;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitImpl;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class c {
    private static volatile c b;
    private final Map<String, ITTAdapterConfiguration> a = new ConcurrentHashMap();

    private c() {
    }

    private void a(String str, ITTAdapterConfiguration iTTAdapterConfiguration) {
        this.a.put(str, iTTAdapterConfiguration);
    }

    public static c b() {
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0024 -> B:13:0x0025). Please submit an issue!!! */
    private ITTAdapterConfiguration b(String str) {
        Object newInstance;
        try {
            newInstance = Class.forName(a.a(str)).newInstance();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (newInstance instanceof ITTAdapterConfiguration) {
            return (ITTAdapterConfiguration) newInstance;
        }
        if (newInstance instanceof MediationInitImpl) {
            return new a((Bridge) newInstance, str);
        }
        return null;
    }

    private ITTAdapterConfiguration c(String str) {
        return this.a.get(str);
    }

    public ITTAdapterConfiguration a(String str) {
        ITTAdapterConfiguration c;
        synchronized (this) {
            c = c(str);
            if (c == null && (c = b(str)) != null) {
                a(str, c);
            }
        }
        return c;
    }

    public Map<String, ITTAdapterConfiguration> a() {
        Map<String, ITTAdapterConfiguration> map;
        synchronized (this) {
            for (String str : DefaultAdapterClasses.getAdnNamesSet()) {
                a(str);
            }
            map = this.a;
        }
        return map;
    }
}
