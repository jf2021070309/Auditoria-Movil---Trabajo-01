package com.bytedance.sdk.openadsdk.api.plugin;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.pangle.Zeus;
import com.bytedance.sdk.openadsdk.AdConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTInitializer;
import com.bytedance.sdk.openadsdk.api.plugin.bn;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class rb implements TTInitializer {
    private volatile TTInitializer ge;
    private static final Map<String, Bundle> o = new ConcurrentHashMap();
    public static ScheduledExecutorService dr = Executors.newSingleThreadScheduledExecutor(new ge());

    public static void dr(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str) && bundle != null) {
            o.put(str, bundle);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTInitializer
    public void init(Context context, AdConfig adConfig, TTAdSdk.InitCallback initCallback) {
        if (Build.VERSION.SDK_INT < 21) {
            initCallback.fail(4201, "Only support >= 5.0");
            return;
        }
        bn.dr(context).dr();
        if (this.ge != null) {
            this.ge.init(context, adConfig, new dr(initCallback));
        } else {
            dr(context, adConfig, new dr(initCallback), q.dr("duration"));
        }
    }

    /* loaded from: classes.dex */
    private static class dr implements TTAdSdk.InitCallback {
        private TTAdSdk.InitCallback dr;

        public dr(TTAdSdk.InitCallback initCallback) {
            this.dr = initCallback;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            TTAdSdk.InitCallback initCallback = this.dr;
            if (initCallback != null) {
                initCallback.success();
            }
            g.dr();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i, String str) {
            TTAdSdk.InitCallback initCallback = this.dr;
            if (initCallback != null) {
                initCallback.fail(i, str);
                g.ge(i, str, 0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTInitializer
    public boolean isInitSuccess() {
        if (this.ge != null) {
            return this.ge.isInitSuccess();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.TTInitializer
    public TTAdManager getAdManager() {
        return com.bytedance.sdk.openadsdk.api.plugin.dr.dr;
    }

    private void dr(final Context context, final AdConfig adConfig, final TTAdSdk.InitCallback initCallback, final q qVar) {
        dr.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.rb.1
            @Override // java.lang.Runnable
            public void run() {
                qVar.ge("wait_asyn_cost");
                TTInitializer dr2 = rb.this.dr(adConfig, qVar);
                if (dr2 != null) {
                    com.bytedance.sdk.openadsdk.api.plugin.dr.dr.dr(dr2.getAdManager());
                    dr2.init(context, adConfig, initCallback);
                    dr2.getAdManager().register(com.bytedance.sdk.openadsdk.dr.ge.dr());
                } else {
                    initCallback.fail(4201, "No initializer");
                }
                try {
                    Context context2 = context;
                    if (context2 != null) {
                        Zeus.hookHuaWeiVerifier((Application) context2.getApplicationContext());
                    }
                } catch (Throwable th) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TTInitializer dr(AdConfig adConfig, q qVar) {
        if (this.ge == null) {
            synchronized (this) {
                if (this.ge == null) {
                    g.dr(adConfig);
                    com.bytedance.sdk.openadsdk.api.ge.ge("TTPluginManager", "Create initializer");
                    this.ge = ge(adConfig, qVar);
                    qVar.dr();
                    JSONObject jSONObject = new JSONObject();
                    qVar.dr(jSONObject, 20L);
                    try {
                        jSONObject.put("zeus", bn.dr(TTAppContextHolder.getContext()).ge());
                    } catch (JSONException e) {
                    }
                    adConfig.setExtra("plugin", jSONObject);
                }
            }
        }
        return this.ge;
    }

    private static TTInitializer ge(AdConfig adConfig, q qVar) {
        bn dr2;
        BaseDexClassLoader dr3;
        try {
            qVar.ge("call_create_initializer");
            dr2 = bn.dr(TTAppContextHolder.getContext());
            dr3 = dr2.dr(qVar);
        } catch (Throwable th) {
            if (th instanceof o) {
                o oVar = th;
                g.dr(oVar.dr(), oVar.getMessage(), 0L);
            } else {
                g.dr(6, th.getMessage(), 0L);
            }
            com.bytedance.sdk.openadsdk.api.ge.q("TTPluginManager", "Create initializer failed: " + th);
        }
        if (dr3 == null) {
            g.dr(6, "Load plugin failed", 0L);
            com.bytedance.sdk.openadsdk.api.ge.q("TTPluginManager", "Load plugin failed");
            return null;
        }
        Class<?> loadClass = dr3.loadClass(TTAdSdk.INITIALIZER_CLASS_NAME);
        qVar.ge("get_init_class_cost");
        Bundle bundle = new Bundle();
        bundle.putSerializable(PluginConstants.KEY_PL_UPDATE_LISTENER, new bn.ge());
        bundle.putSerializable(PluginConstants.KEY_PL_UPDATE_EVENT_LISTENER, new bn.o());
        Bundle dr4 = dr(o);
        bundle.putBundle(PluginConstants.KEY_PL_CONFIG_INFO, dr4);
        qVar.ge("create_bundle_cost");
        bundle.putSerializable(PluginConstants.KEY_LIVE_SDK, com.bytedance.sdk.openadsdk.live.ge.dr());
        Bundle dr5 = com.bytedance.sdk.openadsdk.live.dr.dr(dr2, adConfig.getAppId());
        com.bytedance.sdk.openadsdk.live.ge.dr().dr(dr2, dr5);
        if (dr5 != null) {
            dr4.putBundle("com.byted.live.lite", dr5);
        }
        qVar.ge("live_init_cost");
        Method declaredMethod = loadClass.getDeclaredMethod("getInstance", Bundle.class);
        qVar.ge("get_init_method_cost");
        TTInitializer tTInitializer = (TTInitializer) declaredMethod.invoke(null, bundle);
        qVar.ge("get_init_instance_cost");
        com.bytedance.sdk.openadsdk.api.ge.ge("TTPluginManager", "Create initializer success");
        return tTInitializer;
    }

    private static final Bundle dr(Map<String, Bundle> map) {
        if (map == null || map.size() == 0) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Bundle> entry : map.entrySet()) {
            String key = entry.getKey();
            Bundle value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                bundle.putBundle(key, value);
            }
        }
        return bundle;
    }

    /* loaded from: classes.dex */
    public static class ge implements ThreadFactory {
        private final ThreadGroup dr;
        private final AtomicInteger ge;
        private final String o;

        ge() {
            this.ge = new AtomicInteger(1);
            this.dr = new ThreadGroup("csj_g_pl_init");
            this.o = "csj_pl_init";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ge(String str) {
            this.ge = new AtomicInteger(1);
            this.dr = new ThreadGroup("csj_g_pl_init");
            this.o = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.dr;
            Thread thread = new Thread(threadGroup, runnable, this.o + this.ge.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 10) {
                thread.setPriority(10);
            }
            return thread;
        }
    }
}
