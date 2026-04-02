package com.bytedance.sdk.openadsdk.dr;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.pangle.Zeus;
import com.bytedance.sdk.openadsdk.TTAdBridge;
import com.bytedance.sdk.openadsdk.TTAdEvent;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.api.plugin.bn;
import com.bytedance.sdk.openadsdk.dr.dr;
import java.util.Map;
/* loaded from: classes.dex */
public final class ge implements Bridge, TTAdBridge {
    private static volatile ge dr;
    private dr ge = new dr();

    private ge() {
    }

    public static final ge dr() {
        if (dr == null) {
            synchronized (ge.class) {
                if (dr == null) {
                    dr = new ge();
                }
            }
        }
        return dr;
    }

    public Application.ActivityLifecycleCallbacks ge() {
        return this.ge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public String call(int i, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.CharSequence, T, java.lang.String] */
    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public <T> T callMethod(Class<T> cls, int i, Map<String, Object> map) {
        switch (i) {
            case 2:
                return (T) this.ge.dr();
            case 3:
                return (T) TTAppContextHolder.getContext();
            case 4:
                return (T) Zeus.getPlugin("com.byted.csj.ext").mClassLoader;
            case 5:
                return (T) Boolean.valueOf(Zeus.loadPlugin("com.byted.csj.ext"));
            case 6:
                return (T) Boolean.valueOf(Zeus.isPluginInstalled("com.byted.csj.ext"));
            case 7:
                return (T) Boolean.valueOf(Zeus.isPluginLoaded("com.byted.csj.ext"));
            case 8:
                ?? r1 = (T) bn.dr("com.byted.csj.ext");
                if (TextUtils.isEmpty(r1)) {
                    return "0.0.0.0";
                }
                return r1;
            default:
                return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public void subscribe(final TTAdEvent tTAdEvent) {
        this.ge.dr(new dr.InterfaceC0100dr() { // from class: com.bytedance.sdk.openadsdk.dr.ge.1
            @Override // com.bytedance.sdk.openadsdk.dr.dr.InterfaceC0100dr
            public void dr() {
                tTAdEvent.onEvent(0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.dr.dr.InterfaceC0100dr
            public void ge() {
                tTAdEvent.onEvent(1, null);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public void unsubscribe(TTAdEvent tTAdEvent) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public <T> T getObj(Class<T> cls) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public <T> T getObj(Class<T> cls, int i, Map<String, Object> map) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public void setObj(Object obj) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public void removeObj(Object obj) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdBridge
    public void init(Bundle bundle) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.CharSequence, T, java.lang.String] */
    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        switch (i) {
            case 2:
                return (T) this.ge.dr();
            case 3:
                return (T) TTAppContextHolder.getContext();
            case 4:
                return (T) Zeus.getPlugin(valueSet.stringValue(0)).mClassLoader;
            case 5:
                return (T) Boolean.valueOf(Zeus.loadPlugin(valueSet.stringValue(0)));
            case 6:
                return (T) Boolean.valueOf(Zeus.isPluginInstalled(valueSet.stringValue(0)));
            case 7:
                return (T) Boolean.valueOf(Zeus.isPluginLoaded(valueSet.stringValue(0)));
            case 8:
                ?? r1 = (T) bn.dr(valueSet.stringValue(0));
                if (TextUtils.isEmpty(r1)) {
                    return "0.0.0.0";
                }
                return r1;
            case 9:
                Object objectValue = valueSet.objectValue(0, Object.class);
                if (objectValue instanceof TTAdEvent) {
                    subscribe((TTAdEvent) objectValue);
                    return null;
                } else if (objectValue instanceof EventListener) {
                    dr((EventListener) objectValue);
                    return null;
                } else {
                    return null;
                }
            default:
                return null;
        }
    }

    private void dr(final EventListener eventListener) {
        this.ge.dr(new dr.InterfaceC0100dr() { // from class: com.bytedance.sdk.openadsdk.dr.ge.2
            @Override // com.bytedance.sdk.openadsdk.dr.dr.InterfaceC0100dr
            public void dr() {
                eventListener.onEvent(0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.dr.dr.InterfaceC0100dr
            public void ge() {
                eventListener.onEvent(1, null);
            }
        });
    }
}
