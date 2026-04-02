package com.bytedance.sdk.openadsdk.api.plugin;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.log.IZeusLogger;
import com.bytedance.pangle.log.IZeusReporter;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.sdk.openadsdk.TTAdEvent;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.bg;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class bn {
    private static volatile boolean bn;
    private static volatile BaseDexClassLoader g;
    private static volatile TTPluginListener yk;
    private final Context wb;
    private static final String dr = "next" + File.separator;
    private static final HashMap<String, TTPluginListener> ge = new HashMap<>();
    private static final HashMap<String, Handler> o = new HashMap<>();
    private static volatile bn q = null;
    private final CountDownLatch rb = new CountDownLatch(1);
    private volatile boolean xu = false;
    private volatile String ll = "none";
    private JSONObject t = new JSONObject();

    private bn(Context context) {
        this.wb = context.getApplicationContext();
        g.dr(context);
        GlobalParam.getInstance().closeHookHuaweiOnInit(true);
        ge(context.getApplicationContext());
    }

    public static bn dr(Context context) {
        if (q == null) {
            synchronized (bn.class) {
                if (q == null) {
                    q = new bn(context);
                }
            }
        }
        return q;
    }

    public void dr() {
        bn = true;
        g.dr(new ArrayList());
    }

    public JSONObject ge() {
        return this.t;
    }

    public BaseDexClassLoader dr(q qVar) throws Exception {
        if (!this.xu) {
            com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "Zeus init failed.");
            throw new com.bytedance.sdk.openadsdk.api.plugin.o(4, this.ll);
        }
        if (!Zeus.isPluginInstalled("com.byted.pangle")) {
            try {
                this.rb.await(60000L, TimeUnit.MILLISECONDS);
                qVar.ge("wait_install_cost");
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "Install wait time out");
                throw new com.bytedance.sdk.openadsdk.api.plugin.o(8, "install wait timeout");
            }
        }
        boolean z = false;
        if (Zeus.isPluginLoaded("com.byted.pangle") || Zeus.loadPlugin("com.byted.pangle")) {
            g = Zeus.getPlugin("com.byted.pangle").mClassLoader;
            z = true;
        }
        qVar.ge("get_classloader_cost");
        Zeus.installFromDownloadDir();
        if (g == null) {
            if (this.rb.getCount() != 0) {
                com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "Install wait time out");
                throw new com.bytedance.sdk.openadsdk.api.plugin.o(8, "install wait timeout");
            } else if (z) {
                com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "Get null after load");
                throw new com.bytedance.sdk.openadsdk.api.plugin.o(9, "Get null after load");
            }
        }
        qVar.ge("get_classloader_done");
        return g;
    }

    private void ge(Context context) {
        try {
            IZeusReporter iZeusReporter = new IZeusReporter() { // from class: com.bytedance.sdk.openadsdk.api.plugin.bn.1
                @Override // com.bytedance.pangle.log.IZeusReporter
                public void report(String str, JSONObject jSONObject) {
                    if (str == "load_finish" && jSONObject != null && "com.byted.pangle".endsWith(jSONObject.optString("plugin_package_name"))) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("duration", jSONObject.opt("duration"));
                            jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.opt(ShareConstants.WEB_DIALOG_PARAM_MESSAGE));
                            bn.this.t.put("zeus", jSONObject2);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (bn.bn) {
                        g.dr(str, jSONObject);
                    } else {
                        g.o(str, jSONObject);
                    }
                }
            };
            GlobalParam globalParam = GlobalParam.getInstance();
            globalParam.setReporter(iZeusReporter);
            globalParam.setCheckPermission(false);
            globalParam.setDownloadDir(o(context));
            globalParam.setLogger(new dr());
            globalParam.setSignature("com.byted.pangle", "MIIDfTCCAmWgAwIBAgIEfRwYPjANBgkqhkiG9w0BAQsFADBvMQswCQYDVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzESMBAGA1UEChMJQnl0ZURhbmNlMQ8wDQYDVQQLEwZQYW5nbGUxFzAVBgNVBAMTDkNodWFuIFNoYW4gSmlhMB4XDTIxMTEwODA2MjQzOVoXDTQ2MTEwMjA2MjQzOVowbzELMAkGA1UEBhMCQ04xEDAOBgNVBAgTB0JlaWppbmcxEDAOBgNVBAcTB0JlaWppbmcxEjAQBgNVBAoTCUJ5dGVEYW5jZTEPMA0GA1UECxMGUGFuZ2xlMRcwFQYDVQQDEw5DaHVhbiBTaGFuIEppYTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIBKeRL+4mfCn1SLYv6OemfwwItkjlLPyqOEugkV6lanFTcZgLwEl5LIkL0y28UncPtMX1Mii6DzCdJ/plw7S9+RT/hYDneu339IKWojaU2qai/5FokHlQ0MMnYl5yry00ghVPsl1u+03cQA2ZnjIMiFhrBJpQzHt7IYvq2aEEMBcY8uT7iFoBI848e1mL1joVS2z02C3NliP7ZNARkXH+rTQAlCJulT5IZk+V/PTaKqzgNrkhsKh0/tBmU7m8u79x/xpgGsE19H18AgS4P/9/MDCRe2Z35boZeccaUy2MXCwv3djzUcDk3rRzQPYzdpyyRnrFMuhiKesc5VHgUMs9kCAwEAAaMhMB8wHQYDVR0OBBYEFENENrNWGzc2WhxdvhoMDs57U70zMA0GCSqGSIb3DQEBCwUAA4IBAQAHqDCrmvyBBmIGXwuL1rwS/Qv9ZJIZykBIaNMm+H1IfitCl4yXd9N2n+PjE0UZtxZ21UZOt9wAr+RFiSl5YRXqpt7WLARTy4YW3RiQ+wiL7bshzeSYBoSiC427Bfeq0WjwY0/jHlr8uouppyJOz++6U9hrYX2EW/6UjH5XlWiKQJ6b2ZzPcP8Xpg/TJn4tWvXJP6jw9kRRP2GmMttY78leWQst2QEZILmWJubXRLPj9O+qx2uP9oGTD4sc1vb9hzkOHBIHzGaalqLFbbGaeFpLFHoGTsnOfPTwUVKDZYmxbkcmR1bp7eYOW+nSQNMLn0FjDewZl5l37Sa/gz0WVHon");
            globalParam.setSignature("com.byted.csj.ext", "MIIDezCCAmOgAwIBAgIENkE1KDANBgkqhkiG9w0BAQsFADBtMQswCQYDVQQGEwI4NjEQMA4GA1UECBMHYmVpamluZzEQMA4GA1UEBxMHYmVpamluZzESMBAGA1UEChMJYnl0ZWRhbmNlMRIwEAYDVQQLEwlieXRlZGFuY2UxEjAQBgNVBAMTCWJ5dGVkYW5jZTAgFw0yMjExMDIwODI3MzlaGA8yMDUwMDMyMDA4MjczOVowbTELMAkGA1UEBhMCODYxEDAOBgNVBAgTB2JlaWppbmcxEDAOBgNVBAcTB2JlaWppbmcxEjAQBgNVBAoTCWJ5dGVkYW5jZTESMBAGA1UECxMJYnl0ZWRhbmNlMRIwEAYDVQQDEwlieXRlZGFuY2UwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCc9Z2F3xxOMX1qTXMy2aPmS9OSkqrp8C8bHwS1hkNVR4umKREuqOn73INNo+R706jaCVnlPwxDwWjtX6H74DE4CveivyM9f2wNC3yIyDW+5j7lW/keTQcOlGLDEJQv4O/6FbB/jNU6epjyNaNIZhgZcvTpgaSixbdyHzRTFmvMh+WovdVK/J9LnHOQ+pmPZj7NB6MQRGMUrPEotLHQca3cmnLrnPAaZQaVoaFE9lOt9syyqEuf361SprNIGDtbkJuX3EqV/QOKWFwZX94IS7ZGSvfyCojcD4kaUSbaSoZC7zEuBb7l69g+ZMrJ/v6wkm01wxsNNssUwF7k6Sp0zubbAgMBAAGjITAfMB0GA1UdDgQWBBSxk+gVdDco1dP65hP67qoKNlMEYDANBgkqhkiG9w0BAQsFAAOCAQEAfosExl/AYEbS2xqHBTHa28cvnp/SElUQuzW6aWLqkfk9cxmFSI/euUV3/eB8RN+U2X47Y05u6+XUxTv0tSSEtyXNawm0qWH8jkR4gZY38YqBChKjhea668oT5X3Uocrw7SYXO/BfI8SKPa0uI/U8Cyl3uctbmmq/pPUkd3mKAy+HgyJoThD6K0oyiADlygngUMVTv6Uvid4qPj/bBnxI+LvVeX4l1dxGqWkiafQW9sz+RbFdge3X2XsSH4eo01BsCwOYEv1lHO2FrbAtFNpnIsSqrERdFaAJZ3tlJmg9bA03png8A2AajEjkhaOhduJB8zkSlvHNpoQMIAS9WtkG/w==");
            globalParam.setSignature("com.byted.live.lite", "MIIDSTCCAjGgAwIBAgIEaLy5tzANBgkqhkiG9w0BAQsFADBVMQswCQYDVQQGEwIxMTEMMAoGA1UECBMDMTExMQ4wDAYDVQQHEwUxMTExMTEMMAoGA1UEChMDMTExMQwwCgYDVQQLEwMxMTExDDAKBgNVBAMTAzExMTAeFw0yMDEyMDMxMjQyMTJaFw00NTExMjcxMjQyMTJaMFUxCzAJBgNVBAYTAjExMQwwCgYDVQQIEwMxMTExDjAMBgNVBAcTBTExMTExMQwwCgYDVQQKEwMxMTExDDAKBgNVBAsTAzExMTEMMAoGA1UEAxMDMTExMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA45E52YdkJm4gPCXZq7KDoM1h6pgSswllC/CwDOmh8pDGvX4ROaYP1vr2biRlXMHg7G0iXpxWVdlTtx+4QFd3dC+cGJQk0f6apGo2n2RpMA0zIsSf0VO1a3GjWLei5INo+4RDdciqJ4jfsoqBIjZETRkky+UU4eO/oyrAwOu4KdMln3Bg3u7eHWU4kMFrXxrRruT3Q/9gzlO90yQa0CZPWVDrk6cGJtJwJGhWm+62S3U8D26HE++eGP7ve83QBDGtKqx7HpCAFWUiYBgXGq12H0amQDkKcPcr/EFCaBlombSgkN0t6zBX80m+wcUPC75IBTmMV/DT2dXcgjZ2I1JSCQIDAQABoyEwHzAdBgNVHQ4EFgQUPDyIeKI0KhZFPHyn36gMMIYrpukwDQYJKoZIhvcNAQELBQADggEBAHkl0DoCRwn+XKsDJE+wGMpBBqUDzL6DSOnJx4SNqb7YZZU0ThcDK7jY4If3QRkvMio6ODrVZc2U/m/Tc3VeMk5h2W2UZRUWHNH3k9Xe0720uL20ZeH2Y6IG4L5HG8kIbTbFtX3gJpPG/xAcez+CzyCFLWQAZt1N+csG0syWkXJ0Nryq8VrgSCyCXD1KzFxrOe+65wtu50Vi68Vlbk7BZe/G8Qm0RhKmxq5BPMBJ4uY3be+03Ba5qC//o1XQHOEAjrJKXcN5wqHdFZTkmuxVyIPogZOzx4JlNl0zOrYGDJxp7aZfKF9FkXQyF7x0Ns3mZEtjx/+flXRzAAU9MDhPr/0=");
            Zeus.registerPluginStateListener(new ZeusPluginStateListener() { // from class: com.bytedance.sdk.openadsdk.api.plugin.bn.2
                @Override // com.bytedance.pangle.ZeusPluginStateListener
                public void onPluginStateChange(final String str, final int i, Object... objArr) {
                    com.bytedance.sdk.openadsdk.api.ge.ge("TTPluginManager", str + " state changed, " + i);
                    if (i == 7) {
                        bn.this.ge(str, i);
                    } else if (i == 6) {
                        com.bytedance.sdk.openadsdk.ge.dr.dr().dr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.bn.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                bn.this.ge(str, i);
                            }
                        });
                    }
                }
            });
            Zeus.init((Application) context, true);
            this.xu = true;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.ge.dr("TTPluginManager", "Unexpected error for init zeus.", th);
            this.ll = th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ge(String str, int i) {
        if ("com.byted.pangle".equals(str) && i == 6) {
            this.rb.countDown();
        }
        dr(i == 6, str);
    }

    private static File o(Context context) {
        return new File(new File(context.getDir("tt_pangle_bykv_file", 0), "pangle_com.byted.pangle"), dr);
    }

    public Bundle dr(String str, Bundle bundle) {
        String dr2 = dr(str);
        if (!TextUtils.isEmpty(dr2)) {
            bundle.putString(PluginConstants.KEY_PLUGIN_VERSION, dr2);
        }
        rb.dr(str, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(str, bundle);
        Bundle bundle3 = new Bundle();
        bundle3.putBundle(PluginConstants.KEY_PL_CONFIG_INFO, bundle2);
        return bundle3;
    }

    public static String dr(String str) {
        Plugin plugin;
        try {
            if (Zeus.isPluginInstalled(str) && (plugin = Zeus.getPlugin(str)) != null) {
                return dr(plugin.getVersion());
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "Get local version failed");
            return null;
        }
    }

    public void dr(final TTPluginListener tTPluginListener) {
        Plugin plugin;
        if (!this.xu) {
            com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "Zeus init failed.");
            if (tTPluginListener != null) {
                tTPluginListener.onPluginListener(1002, null, null, null);
                return;
            }
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.bn.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.api.ge.ge("TTPluginManager", "Load plugin failed, caused by timeout.");
                tTPluginListener.onPluginListener(1001, null, null, null);
            }
        }, 180000L);
        String packageName = tTPluginListener.packageName();
        if (Zeus.isPluginInstalled(packageName) && (Zeus.isPluginLoaded(packageName) || Zeus.loadPlugin(packageName))) {
            plugin = Zeus.getPlugin(packageName);
        } else {
            plugin = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Find plugin:");
        sb.append(plugin != null);
        com.bytedance.sdk.openadsdk.api.ge.ge("TTPluginManager", sb.toString());
        if (plugin != null) {
            ge(plugin);
            handler.removeCallbacksAndMessages(null);
            tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
            return;
        }
        ge.put(packageName, tTPluginListener);
        o.put(packageName, handler);
    }

    public void ge(final TTPluginListener tTPluginListener) {
        com.bytedance.sdk.openadsdk.ge.dr.dr().dr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.bn.4
            @Override // java.lang.Runnable
            public void run() {
                Plugin plugin;
                String packageName = tTPluginListener.packageName();
                if (Zeus.isPluginInstalled(packageName) && (Zeus.isPluginLoaded(packageName) || Zeus.loadPlugin(packageName))) {
                    plugin = Zeus.getPlugin(packageName);
                } else {
                    plugin = null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Find plugin:");
                sb.append(plugin != null);
                com.bytedance.sdk.openadsdk.api.ge.ge("TTPluginManager", sb.toString());
                if (plugin != null) {
                    bn.ge(plugin);
                    tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
                    return;
                }
                TTPluginListener unused = bn.yk = tTPluginListener;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.api.plugin.ge o(String str) {
        try {
            return TextUtils.isEmpty(str) ? null : dr(new JSONObject(str));
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.api.ge.q("TTPluginManager", "Invalid plugin info:" + str);
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.api.plugin.ge dr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.api.plugin.ge geVar = new com.bytedance.sdk.openadsdk.api.plugin.ge();
        geVar.mPackageName = jSONObject.optString(bg.o);
        geVar.mVersionCode = jSONObject.optInt("version_code");
        geVar.mUrl = jSONObject.optString("download_url");
        geVar.mMd5 = jSONObject.optString("md5");
        geVar.mApiVersionMin = jSONObject.optInt("min_version");
        geVar.mApiVersionMax = jSONObject.optInt("max_version");
        geVar.dr = jSONObject.optString("sign");
        geVar.mFlag = jSONObject.optBoolean("is_revert") ? 3 : 2;
        geVar.ge = new File(jSONObject.optString("plugin_file"));
        return geVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ge(Plugin plugin) {
        if (plugin == null) {
            com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "plugin is null.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(NativeProtocol.WEB_DIALOG_ACTION, 0);
        bundle.putString("plugin_pkg_name", plugin.mPkgName);
        bundle.putString(PluginConstants.KEY_PLUGIN_VERSION, dr(plugin.getVersion()));
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager != null) {
            adManager.getExtra(Bundle.class, bundle);
        }
    }

    public static String dr(int i) {
        char[] charArray = String.valueOf(i).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            sb.append(charArray[i2]);
            if (i2 < charArray.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    private static boolean dr(TTPluginListener tTPluginListener, String str) {
        if (tTPluginListener == null || tTPluginListener.packageName() == null) {
            return false;
        }
        return tTPluginListener.packageName().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ge(com.bytedance.sdk.openadsdk.api.plugin.ge geVar) {
        if (geVar == null || geVar.ge == null) {
            com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "plugin config is null");
            return false;
        }
        boolean syncInstallPlugin = Zeus.syncInstallPlugin(geVar.mPackageName, geVar.ge.getAbsolutePath());
        dr(syncInstallPlugin, geVar.mPackageName);
        return syncInstallPlugin;
    }

    private static void dr(boolean z, String str) {
        HashMap<String, TTPluginListener> hashMap = ge;
        TTPluginListener tTPluginListener = hashMap.get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Install dl plugin ");
        sb.append(str);
        sb.append(z ? " success" : " failed");
        sb.append(", need notify: ");
        sb.append(tTPluginListener != null);
        com.bytedance.sdk.openadsdk.api.ge.ge("TTPluginManager", sb.toString());
        HashMap<String, Handler> hashMap2 = o;
        Handler handler = hashMap2.get(str);
        if (z) {
            TTPluginListener tTPluginListener2 = yk;
            if (!dr(tTPluginListener2, str) && (tTPluginListener == null || handler == null)) {
                return;
            }
            if (Zeus.loadPlugin(str)) {
                Plugin plugin = Zeus.getPlugin(str);
                ge(plugin);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (tTPluginListener != null) {
                    tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
                }
                if (dr(tTPluginListener2, str)) {
                    tTPluginListener2.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
                    yk = null;
                }
            } else {
                o(str, 1002);
            }
        } else {
            o(str, 1003);
        }
        hashMap.remove(str);
        hashMap2.remove(str);
    }

    public static void dr(Throwable th) {
        if (th instanceof AbstractMethodError) {
            Zeus.unInstallPlugin("com.byted.pangle");
            com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "AbstractMethodError, rollback to builtin version.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(String str, int i) {
        com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "plugin update failed");
        Bundle bundle = new Bundle();
        bundle.putInt(PluginConstants.KEY_ERROR_CODE, i);
        TTPluginListener tTPluginListener = ge.get(str);
        if (tTPluginListener != null) {
            tTPluginListener.onPluginListener(1001, null, null, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class ge implements TTAdEvent {
        @Override // com.bytedance.sdk.openadsdk.TTAdEvent
        public void onEvent(int i, Bundle bundle) {
            if (i == 1) {
                String string = bundle.getString("config");
                String string2 = bundle.getString("plugin_pkg_name");
                int i2 = bundle.getInt(PluginConstants.KEY_ERROR_CODE);
                if (i2 != 0) {
                    bn.o(string2, i2);
                    return;
                }
                com.bytedance.sdk.openadsdk.api.plugin.ge o = bn.o(string);
                if (o == null || TextUtils.isEmpty(o.mPackageName)) {
                    com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "plugin update received with invalid config");
                } else if (!bundle.getBoolean("success")) {
                    bn.o(o.mPackageName, 1004);
                } else {
                    com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "plugin update received: " + o.mPackageName);
                    if (!o.isRevert()) {
                        if (bn.ge(o)) {
                            bundle.putBoolean("installed", true);
                            return;
                        }
                        return;
                    }
                    Zeus.unInstallPlugin(o.mPackageName);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class dr implements IZeusLogger {
        private dr() {
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void v(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.ge.dr(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void i(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.ge.o(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void w(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.ge.dr(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void w(String str, String str2, Throwable th) {
            com.bytedance.sdk.openadsdk.api.ge.dr(str, str2, th);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void e(String str, String str2, Throwable th) {
            com.bytedance.sdk.openadsdk.api.ge.ge(str, str2, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class o implements EventListener, Serializable {
        @Override // com.bykv.vk.openvk.api.proto.EventListener
        public ValueSet onEvent(int i, Result result) {
            com.bytedance.sdk.openadsdk.api.g dr = com.bytedance.sdk.openadsdk.api.g.dr();
            if (i == 1) {
                ValueSet values = result.values();
                if (values == null) {
                    return null;
                }
                String stringValue = values.stringValue(3);
                int code = result.code();
                if (!result.isSuccess()) {
                    bn.o(stringValue, code);
                    return null;
                }
                com.bytedance.sdk.openadsdk.api.plugin.ge o = bn.o(values.stringValue(2));
                if (o == null || TextUtils.isEmpty(o.mPackageName)) {
                    com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "plugin update received with invalid config");
                    return null;
                }
                com.bytedance.sdk.openadsdk.api.ge.g("TTPluginManager", "plugin update received: " + o.mPackageName);
                if (!o.isRevert()) {
                    if (bn.ge(o)) {
                        dr.dr(4, true);
                    }
                } else {
                    Zeus.unInstallPlugin(o.mPackageName);
                }
            }
            return dr.ge();
        }
    }
}
