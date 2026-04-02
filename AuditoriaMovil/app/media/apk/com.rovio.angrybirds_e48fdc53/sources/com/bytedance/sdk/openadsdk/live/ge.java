package com.bytedance.sdk.openadsdk.live;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.android.live.base.api.ILiveHostContextParam;
import com.bytedance.android.live.base.api.ILiveInitCallback;
import com.bytedance.android.live.base.api.IOuterLiveRoomService;
import com.bytedance.android.live.base.api.MethodChannelService;
import com.bytedance.android.live.base.api.callback.Callback;
import com.bytedance.android.openliveplugin.LivePluginHelper;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdEvent;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.bytedance.sdk.openadsdk.api.g;
import com.bytedance.sdk.openadsdk.api.o;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.api.plugin.bn;
import com.bytedance.sdk.openadsdk.live.core.ITTLiveConfig;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ge extends com.bytedance.sdk.openadsdk.downloadnew.dr implements Bridge, Serializable {
    private ITTLiveTokenInjectionAuth ll;
    private ITTLiveConfig rb = null;
    private JSONObject xu = null;
    private static final ge ge = new ge();
    private static final AtomicBoolean o = new AtomicBoolean(false);
    private static final AtomicBoolean g = new AtomicBoolean(false);
    private static final AtomicBoolean q = new AtomicBoolean(false);
    private static final AtomicBoolean bn = new AtomicBoolean(false);
    public static dr dr = null;

    private ge() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class dr implements TTAdEvent {
        private TTAdEvent dr;
        private EventListener ge;

        private dr(TTAdEvent tTAdEvent) {
            this.dr = tTAdEvent;
        }

        private dr(EventListener eventListener) {
            this.ge = eventListener;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdEvent
        public void onEvent(int i, Bundle bundle) {
            TTAdEvent tTAdEvent = this.dr;
            if (tTAdEvent != null) {
                tTAdEvent.onEvent(i, bundle);
            }
            if (this.ge != null) {
                this.ge.onEvent(i, o.dr().dr(0).dr(true).dr(g.dr().dr(0, bundle).ge()).ge());
            }
        }
    }

    public static ge dr() {
        return ge;
    }

    public void dr(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
        this.ll = iTTLiveTokenInjectionAuth;
    }

    public void dr(bn bnVar, Bundle bundle) {
        AtomicBoolean atomicBoolean = o;
        if (atomicBoolean.get()) {
            com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "live PL is loading...just wait");
            return;
        }
        AtomicBoolean atomicBoolean2 = g;
        if (atomicBoolean2.get()) {
            com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "live PL already loaded, dont load again");
            return;
        }
        TTPluginListener tTPluginListener = new TTPluginListener() { // from class: com.bytedance.sdk.openadsdk.live.ge.1
            @Override // com.bytedance.sdk.openadsdk.TTPluginListener
            public void onPluginListener(int i, ClassLoader classLoader, Resources resources, Bundle bundle2) {
                if (1000 == i) {
                    com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "live PL install success ， try to init live sdk");
                    ge.g.set(true);
                    ge.o.set(false);
                    ge.this.q();
                } else if (1001 == i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("live PL install failed, errorCode: ");
                    sb.append(bundle2 == null ? null : bundle2.get(PluginConstants.KEY_ERROR_CODE));
                    com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", sb.toString());
                    ge.g.set(false);
                    ge.o.set(false);
                }
                ge.this.xu();
            }

            @Override // com.bytedance.sdk.openadsdk.TTPluginListener
            public String packageName() {
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.TTPluginListener
            public Bundle config() {
                return null;
            }
        };
        atomicBoolean.set(true);
        atomicBoolean2.set(false);
        com.bytedance.sdk.openadsdk.live.dr.dr(bnVar, bundle, tTPluginListener);
    }

    @Override // com.bytedance.sdk.openadsdk.downloadnew.dr, com.bytedance.sdk.openadsdk.TTAdBridge
    public <T> T getObj(Class<T> cls, int i, Map<String, Object> map) {
        return (T) super.getObj(cls, i, map);
    }

    @Override // com.bytedance.sdk.openadsdk.downloadnew.dr, com.bytedance.sdk.openadsdk.TTAdBridge
    public void subscribe(TTAdEvent tTAdEvent) {
        dr = new dr(tTAdEvent);
        xu();
    }

    @Override // com.bytedance.sdk.openadsdk.downloadnew.dr, com.bytedance.sdk.openadsdk.TTAdBridge
    public void init(Bundle bundle) {
        super.init(bundle);
        ITTLiveConfig iTTLiveConfig = this.rb;
        if (iTTLiveConfig != null && iTTLiveConfig.isValid() && !TextUtils.isEmpty(this.rb.getGeneralAppId()) && !TextUtils.isEmpty(this.rb.getPartner()) && !TextUtils.isEmpty(this.rb.getPartnerSecret())) {
            com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "The configuration has been obtained. Do not repeat initialization");
            return;
        }
        Serializable serializable = bundle.getSerializable(TTLiveConstants.LIVE_INIT_CONFIG_KEY);
        if (serializable instanceof ITTLiveConfig) {
            this.rb = (ITTLiveConfig) serializable;
        }
        try {
            this.xu = new JSONObject(bundle.getString(TTLiveConstants.LIVE_INIT_EXTRA_KEY));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String str;
        ITTLiveConfig iTTLiveConfig;
        Plugin plugin;
        StringBuilder sb = new StringBuilder();
        sb.append("hasLiveSDKInited：");
        AtomicBoolean atomicBoolean = bn;
        sb.append(atomicBoolean.get());
        sb.append(", hasLiveInstalled：");
        AtomicBoolean atomicBoolean2 = g;
        sb.append(atomicBoolean2.get());
        com.bytedance.sdk.openadsdk.api.ge.o("TTLiveSDkBridge", sb.toString());
        if (this.rb != null) {
            str = "GeneralAppId：" + this.rb.getGeneralAppId() + "，isValid：" + this.rb.isValid();
        } else {
            str = null;
        }
        com.bytedance.sdk.openadsdk.api.ge.o("TTLiveSDkBridge", str);
        if (atomicBoolean.get() || !atomicBoolean2.get() || (iTTLiveConfig = this.rb) == null || !iTTLiveConfig.isValid() || (plugin = Zeus.getPlugin("com.byted.live.lite")) == null) {
            return;
        }
        AtomicBoolean atomicBoolean3 = q;
        if (atomicBoolean3.get()) {
            return;
        }
        atomicBoolean3.set(true);
        if (!com.bytedance.sdk.openadsdk.live.dr.o(plugin.getVersion())) {
            com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "live sdk init crash more than consecutive 5 times , live plugin had uninstalled ! App cold start will request new live plugin ！");
            com.bytedance.sdk.openadsdk.live.dr.g(plugin.getVersion());
            atomicBoolean3.set(false);
            return;
        }
        ILiveHostContextParam.Builder hostActionParam = new ILiveHostContextParam.Builder().setAppName(this.rb.getAppName()).setChannel(this.rb.getChannel()).setIsDebug(this.rb.isDebug()).setECHostAppId(this.rb.getECHostAppId()).setPartner(this.rb.getPartner()).provideMethodChannel(new MethodChannelService() { // from class: com.bytedance.sdk.openadsdk.live.ge.2
            @Override // com.bytedance.android.live.base.api.MethodChannelService
            public Object invokeMethod(String str2, Object... objArr) {
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                char c = 65535;
                if (str2.hashCode() == -955478604 && str2.equals("getBiddingToken")) {
                    c = 0;
                }
                if (c != 0) {
                    return null;
                }
                return ge.this.dr(objArr);
            }

            @Override // com.bytedance.android.live.base.api.MethodChannelService
            public String identity() {
                return "pangle";
            }
        }).setPartnerSecret(this.rb.getPartnerSecret()).setHostPermission(this.rb.getHostPermission()).setHostActionParam(new com.bytedance.sdk.openadsdk.live.core.dr(this.rb.getLiveHostAction()));
        ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth = this.ll;
        if (iTTLiveTokenInjectionAuth != null) {
            hostActionParam.setInjectionAuth(new com.bytedance.sdk.openadsdk.live.core.ge(iTTLiveTokenInjectionAuth));
        }
        ILiveInitCallback iLiveInitCallback = new ILiveInitCallback() { // from class: com.bytedance.sdk.openadsdk.live.ge.3
            @Override // com.bytedance.android.live.base.api.ILiveInitCallback
            public final void onLiveInitFinish() {
                com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "onLiveInitFinish - live sdk init succeed！");
                com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "execute commerce initLiveCommerce method start");
                boolean dr2 = com.bytedance.sdk.openadsdk.live.dr.dr();
                com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "execute commerce initLiveCommerce end , result: " + dr2);
                ge.bn.set(true);
                ge.this.xu();
                if (ge.dr != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(TTLiveConstants.PARAMS_LIVE_SDK_INIT_STATUS, ge.bn.get());
                    ge.dr.onEvent(2, bundle);
                }
            }
        };
        if (TTAppContextHolder.getContext() instanceof Application) {
            hostActionParam.setContext((Application) TTAppContextHolder.getContext());
        }
        com.bytedance.sdk.openadsdk.live.dr.dr(plugin.getVersion());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("execute live sdk initLive method start, GeneralAppId:");
        ITTLiveConfig iTTLiveConfig2 = this.rb;
        sb2.append(iTTLiveConfig2 != null ? iTTLiveConfig2.getGeneralAppId() : null);
        com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", sb2.toString());
        Context context = TTAppContextHolder.getContext();
        ITTLiveConfig iTTLiveConfig3 = this.rb;
        com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "execute live sdk initLive method end, (方法顺利执行结果)result: " + com.bytedance.sdk.openadsdk.live.dr.dr(context, iTTLiveConfig3 != null ? iTTLiveConfig3.getGeneralAppId() : null, hostActionParam, iLiveInitCallback));
        atomicBoolean3.set(false);
        com.bytedance.sdk.openadsdk.live.dr.ge((long) plugin.getVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object dr(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        try {
            Integer num = (Integer) objArr[0];
            TTAdManager adManager = TTAdSdk.getAdManager();
            if (adManager != null) {
                return adManager.getBiddingToken(new AdSlot.Builder().setAdType(num.intValue()).build());
            }
        } catch (Throwable th) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.downloadnew.dr, com.bytedance.sdk.openadsdk.TTAdBridge
    public <T> T callMethod(Class<T> cls, int i, Map<String, Object> map) {
        if (i == 0) {
            if (!bn.get()) {
                return (T) 1;
            }
            if (!com.bytedance.sdk.openadsdk.live.dr.dr(getContext(map.get("context")), dr(map.get(TTLiveConstants.BUNDLE_KEY)))) {
                return (T) 2;
            }
            return (T) 0;
        } else if (i != 1) {
            if (i == 2) {
                o(map);
                return null;
            } else if (i == 3) {
                rb();
                return null;
            } else if (i != 4) {
                if (i != 7) {
                    if (i == 8) {
                        return (T) dr(map);
                    }
                    return (T) super.callMethod(cls, i, map);
                }
                return (T) ge(map);
            } else {
                return (T) bn();
            }
        } else {
            return (T) bn;
        }
    }

    private Boolean dr(Map<String, Object> map) {
        try {
            String str = (String) map.get(TTLiveConstants.SCHEME_URI_KEY);
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Context context = getContext(map.get("context"));
            Uri parse = Uri.parse(str);
            if (parse != null && context != null) {
                return Boolean.valueOf(com.bytedance.sdk.openadsdk.live.dr.dr(context, parse));
            }
            return false;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.ge.dr("TTLiveSDkBridge", th);
            return false;
        }
    }

    private Object ge(Map<String, Object> map) {
        try {
            String str = (String) map.get(TTLiveConstants.EXPAND_METHOD_NAME_KEY);
            Bundle bundle = (Bundle) map.get(TTLiveConstants.EXPAND_METHOD_PARAM_KEY);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return LivePluginHelper.getLiveRoomService().callExpandMethod(str, bundle);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.ge.dr("TTLiveSDkBridge", th);
            return null;
        }
    }

    private Boolean bn() {
        try {
            Object callExpandMethod = LivePluginHelper.getLiveRoomService().callExpandMethod("hasAuthenticated", new Object[0]);
            if (callExpandMethod != null && (callExpandMethod instanceof Boolean)) {
                return (Boolean) callExpandMethod;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.ge.dr("TTLiveSDkBridge", th);
        }
        return false;
    }

    private void rb() {
        try {
            LivePluginHelper.getLiveRoomService().callExpandMethod("warmingUpBeforeEnter", new Object[0]);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.ge.dr("TTLiveSDkBridge", th);
        }
    }

    private void o(Map<String, Object> map) {
        try {
            long longValue = ((Long) map.get(TTLiveConstants.ROOMID_KEY)).longValue();
            Object obj = map.get("event");
            final dr drVar = obj instanceof TTAdEvent ? new dr((TTAdEvent) obj) : new dr((EventListener) obj);
            IOuterLiveRoomService liveRoomService = LivePluginHelper.getLiveRoomService();
            System.currentTimeMillis();
            Object callExpandMethod = liveRoomService.callExpandMethod("checkRoomAlive", new Callback<Boolean>() { // from class: com.bytedance.sdk.openadsdk.live.ge.4
                @Override // com.bytedance.android.live.base.api.callback.Callback
                /* renamed from: dr */
                public void invoke(Boolean bool) {
                    if (drVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(TTLiveConstants.PARAMS_LIVE_ROOM_STATUS, bool.booleanValue());
                        drVar.onEvent(0, bundle);
                    }
                }
            }, Long.valueOf(longValue), 300);
            if (callExpandMethod == null) {
                synchronized (drVar) {
                    try {
                        drVar.notifyAll();
                    } catch (Throwable th) {
                    }
                }
            }
            com.bytedance.sdk.openadsdk.api.ge.ge("TTLiveSDkBridge", "has checkRoomAlive :" + callExpandMethod);
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.api.ge.dr("TTLiveSDkBridge", "getRoomState: exception:", th2);
        }
    }

    private Context getContext(Object obj) {
        if (obj instanceof Context) {
            return (Context) obj;
        }
        return null;
    }

    private Bundle dr(Object obj) {
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xu() {
        if (dr != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("live_plugin_installed", g.get());
                bundle.putBoolean("live_plugin_inited", bn.get());
                dr.onEvent(3, bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 5) {
            init((Bundle) valueSet.objectValue(0, Bundle.class));
            return null;
        } else if (i == 6) {
            Object objectValue = valueSet.objectValue(0, Object.class);
            if (objectValue instanceof TTAdEvent) {
                subscribe((TTAdEvent) valueSet.objectValue(0, TTAdEvent.class));
            } else if (objectValue instanceof EventListener) {
                dr = new dr((EventListener) objectValue);
                xu();
            }
            return null;
        } else {
            return (T) callMethod(cls, i, (Map) valueSet.objectValue(0, Map.class));
        }
    }
}
