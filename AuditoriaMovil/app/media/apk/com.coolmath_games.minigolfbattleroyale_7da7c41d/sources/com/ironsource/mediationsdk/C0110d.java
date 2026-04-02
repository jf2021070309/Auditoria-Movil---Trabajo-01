package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0110d {
    private static final C0110d d = new C0110d();
    private static final Object e = new Object();
    String a;
    String b;
    private Boolean h;
    private Boolean i;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final ConcurrentHashMap<String, AbstractAdapter> f = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AdapterBaseWrapper> g = new ConcurrentHashMap<>();
    final ConcurrentHashMap<String, List<String>> c = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.d$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C0110d() {
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + str2.toLowerCase(Locale.ENGLISH) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e2) {
            String str3 = "Error while loading adapter - exception = " + e2.getLocalizedMessage();
            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            a(str3);
            return null;
        }
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + str2;
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(str3).newInstance();
            IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            if (this.i != null && (baseAdapter instanceof AdapterDebugInterface)) {
                try {
                    baseAdapter.setAdapterDebug(this.i.booleanValue());
                } catch (Exception e2) {
                    String str4 = "error while setting adapterDebug of " + baseAdapter.getClass().getSimpleName() + ": " + e2.getLocalizedMessage();
                    a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
                    b(str4);
                    e2.printStackTrace();
                }
            }
            this.g.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str5 = "failed to load " + str3;
                IronLog.INTERNAL.error(str5);
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str5);
            }
            return null;
        }
    }

    public static C0110d a() {
        return d;
    }

    private static void a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
            }
            com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, jSONObject));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(AbstractAdapter abstractAdapter) {
        try {
            if (this.h != null) {
                abstractAdapter.setConsent(this.h.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            b(str);
            th.printStackTrace();
        }
    }

    private static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 3);
    }

    private static String b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.i;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                b(str);
                th.printStackTrace();
            }
        }
    }

    private static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 0);
    }

    private BaseAdAdapter<?, ?> c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
        String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
        try {
            return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str2 = "failed to load " + str;
                IronLog.INTERNAL.error(str2);
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            }
            return null;
        }
    }

    private void c(AbstractAdapter abstractAdapter) {
        for (String str : this.c.keySet()) {
            try {
                List<String> list = this.c.get(str);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(str, list);
                }
            } catch (Throwable th) {
                String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                b(str2);
                th.printStackTrace();
            }
        }
    }

    public final AbstractAdapter a(NetworkSettings networkSettings) {
        String b = b(networkSettings);
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.f.get(b) : a(b, networkSettings.getProviderTypeForReflection());
    }

    public final AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z, boolean z2) {
        String str;
        String b = b(networkSettings);
        String providerTypeForReflection = z ? IronSourceConstants.IRONSOURCE_CONFIG_NAME : networkSettings.getProviderTypeForReflection();
        synchronized (e) {
            if (!z2) {
                if (this.f.containsKey(b)) {
                    return this.f.get(b);
                }
            }
            AbstractAdapter a = a(b, providerTypeForReflection);
            if (a == null) {
                a(b + " adapter was not loaded");
                return null;
            }
            try {
                str = a.getCoreSDKVersion();
            } catch (Exception e2) {
                String str2 = "error while retrieving coreSDKVersion " + a.getProviderName() + ": " + e2.getLocalizedMessage();
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            b(b + " was allocated (adapter version: " + a.getVersion() + ", sdk version: " + str + ")");
            a.setLogListener(IronSourceLoggerManager.getLogger());
            c(a);
            a(a);
            b(a);
            if ((providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) && this.j.compareAndSet(false, true)) {
                b("SDK5 earlyInit  <" + providerTypeForReflection + ">");
                try {
                    a.earlyInit(this.a, this.b, jSONObject);
                } catch (Exception e3) {
                    String str3 = "error while calling early init for " + a.getProviderName() + ": " + e3.getLocalizedMessage();
                    a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                    IronLog.INTERNAL.error(str3);
                }
            }
            if (!z2) {
                this.f.put(b, a);
            }
            return a;
        }
    }

    public final AdapterBaseInterface a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        String b = b(networkSettings);
        if (this.g.containsKey(b)) {
            AdapterBaseInterface adapterBaseInterface = this.g.get(b).getAdapterBaseInterface();
            if (adapterBaseInterface instanceof K) {
                ((K) adapterBaseInterface).a = ad_unit;
            }
            return adapterBaseInterface;
        }
        AdapterBaseInterface a = a(b, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (a == null) {
            int i = AnonymousClass1.a[ad_unit.ordinal()];
            AbstractAdapter a2 = a(networkSettings, i != 1 ? i != 2 ? i != 3 ? null : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false, true);
            if (a2 != null) {
                K k = new K(a2, networkSettings, ad_unit);
                this.g.put(b, new AdapterBaseWrapper(k, networkSettings));
                return k;
            }
            String str = "error creating network adapter " + networkSettings.getProviderName();
            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            IronLog.INTERNAL.error(str);
            return null;
        }
        return a;
    }

    public final void a(String str, List<String> list) {
        synchronized (e) {
            this.c.put(str, list);
            if (!this.f.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter abstractAdapter : this.f.values()) {
                    abstractAdapter.setMetaData(str, list);
                }
                for (AdapterBaseWrapper adapterBaseWrapper : this.g.values()) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                        try {
                            ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                        } catch (Exception e2) {
                            String str2 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e2.getLocalizedMessage();
                            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                            b(str2);
                            e2.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        synchronized (e) {
            this.h = Boolean.valueOf(z);
            for (AbstractAdapter abstractAdapter : this.f.values()) {
                a(abstractAdapter);
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.g.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterConsentInterface)) {
                    try {
                        ((AdapterConsentInterface) adapterBaseInterface).setConsent(z);
                    } catch (Exception e2) {
                        String str = "error while setting consent of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e2.getLocalizedMessage();
                        a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        b(str);
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public final BaseAdAdapter<?, ?> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> c = c(networkSettings, ad_unit);
        if (c == null) {
            AbstractAdapter a = a(networkSettings);
            if (a == null || (ad_unit != IronSource.AD_UNIT.INTERSTITIAL && ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO)) {
                String str = "error creating ad adapter " + networkSettings.getProviderName();
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                IronLog.INTERNAL.error(str);
                return null;
            }
            return new K(a, networkSettings, ad_unit);
        }
        return c;
    }

    public final void b(boolean z) {
        synchronized (e) {
            this.i = Boolean.valueOf(z);
            for (AbstractAdapter abstractAdapter : this.f.values()) {
                b(abstractAdapter);
            }
        }
    }
}
