package com.kwad.sdk.api.loader;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.SdkConfig;
import com.kwad.sdk.api.core.IKsAdSDK;
import com.kwad.sdk.api.core.KSLifecycleObserver;
import com.kwad.sdk.api.core.KsAdSdkDynamicApi;
import com.kwad.sdk.api.proxy.IComponentProxy;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class Loader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Context mContext;
    private final AtomicBoolean IW;
    private IKsAdSDK aiW;
    private k aiX;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final Loader aiY = new Loader((byte) 0);
    }

    private Loader() {
        this.aiX = null;
        this.IW = new AtomicBoolean(false);
    }

    /* synthetic */ Loader(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized IKsAdSDK a(ClassLoader classLoader) {
        IKsAdSDK iKsAdSDK;
        synchronized (Loader.class) {
            try {
                KsAdSdkDynamicApi ksAdSdkDynamicApi = (KsAdSdkDynamicApi) IKsAdSDK.class.getAnnotation(KsAdSdkDynamicApi.class);
                if (ksAdSdkDynamicApi == null) {
                    throw new AssertionError();
                }
                Object invoke = Class.forName(ksAdSdkDynamicApi.value(), true, classLoader).getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    throw new RuntimeException("Can not get sdk form " + classLoader);
                }
                iKsAdSDK = (IKsAdSDK) invoke;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return iKsAdSDK;
    }

    private boolean aE(Context context) {
        String aA = g.aA(context);
        String aB = g.aB(context);
        if (TextUtils.isEmpty(aA) && TextUtils.isEmpty(aB)) {
            return false;
        }
        if (!TextUtils.isEmpty(aB) && g.D(aB, aA)) {
            g.j(context, aB);
            t(context, aA);
            g.k(context, "");
            aA = aB;
        }
        return !TextUtils.isEmpty(aA);
    }

    private static void aF(Context context) {
        String aC = g.aC(context);
        boolean b = t.b(context, g.aiC, false);
        if (TextUtils.isEmpty(aC) || !aC.equals(BuildConfig.VERSION_NAME) || b) {
            String aA = g.aA(context);
            g.j(context, "");
            g.k(context, "");
            t.a(context, g.aiC, false);
            h.j(h.o(context, aA));
            g.l(context, BuildConfig.VERSION_NAME);
        }
    }

    public static void checkInitSDK(Context context) {
        if (KsAdSDK.sHasInit.get()) {
            return;
        }
        if (context == null) {
            context = KSLifecycleObserver.getInstance().getApplication();
        }
        KsAdSDK.init(context, SdkConfig.create(t.getString(context, "sdkconfig")));
    }

    public static Loader get() {
        return a.aiY;
    }

    private static void t(Context context, String str) {
        h.s(context, str);
    }

    private static void yr() {
        try {
            int yj = com.kwad.sdk.api.c.yj();
            if (yj > 0) {
                d.az(mContext).setDefaultUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler());
                Thread.setDefaultUncaughtExceptionHandler(d.az(mContext));
                d.az(mContext).bP(yj);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Context getContext() {
        return mContext;
    }

    public ClassLoader getExternalClassLoader() {
        k kVar = this.aiX;
        if (kVar != null) {
            return kVar.getClassLoader();
        }
        return null;
    }

    public Resources getExternalResource() {
        k kVar = this.aiX;
        if (kVar != null) {
            return kVar.yo();
        }
        return null;
    }

    public ClassLoader getRealClassLoader() {
        k kVar = this.aiX;
        return kVar != null ? kVar.getClassLoader() : getClass().getClassLoader();
    }

    public IKsAdSDK init(Context context, ClassLoader classLoader) {
        if (this.IW.get()) {
            return this.aiW;
        }
        mContext = context.getApplicationContext();
        aF(context);
        if (aE(context)) {
            this.aiX = k.a(context, classLoader, g.aA(context));
        }
        k kVar = this.aiX;
        if (kVar == null) {
            IKsAdSDK a2 = a(getClass().getClassLoader());
            this.aiW = a2;
            a2.setIsExternal(false);
        } else {
            IKsAdSDK yp = kVar.yp();
            this.aiW = yp;
            yp.setIsExternal(true);
        }
        com.kwad.sdk.api.c.a(this.aiW);
        if (this.aiX != null) {
            yr();
        }
        this.IW.set(true);
        return this.aiW;
    }

    public boolean isExternalLoaded() {
        return this.aiX != null;
    }

    public <T extends IComponentProxy> T newComponentProxy(Context context, Class<?> cls, Object obj) {
        checkInitSDK(context);
        return (T) this.aiW.newComponentProxy(cls, obj);
    }

    public <T> T newInstance(Class<T> cls) {
        checkInitSDK(mContext);
        return (T) this.aiW.newInstance(cls);
    }

    public void rest() {
        this.IW.set(false);
        mContext = null;
        this.aiW = null;
        this.aiX = null;
    }
}
