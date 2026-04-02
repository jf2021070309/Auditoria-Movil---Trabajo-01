package com.kwad.sdk.service;

import android.content.Context;
import com.kwad.sdk.api.SdkConfig;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.a.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public final class ServiceProvider {
    private static List<Throwable> IX;
    private static Context aHL;
    private static Context aHM;
    private static SdkConfig aHN;
    private static boolean aHO;
    private static Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum ServiceProviderDelegate {
        INSTANCE;
        
        private final Map<Class<?>, Object> mProviders = new HashMap(32);

        ServiceProviderDelegate() {
        }

        public final <T> T get(Class<T> cls) {
            return (T) this.mProviders.get(cls);
        }

        public final <T> void put(Class<T> cls, T t) {
            this.mProviders.put(cls, t);
        }
    }

    public static Context HA() {
        return mContext;
    }

    public static SdkConfig HB() {
        return aHN;
    }

    public static void Hz() {
        aHO = true;
    }

    public static void a(SdkConfig sdkConfig) {
        aHN = sdkConfig;
    }

    public static void b(Throwable th) {
        d dVar = (d) get(d.class);
        if (dVar != null) {
            dVar.gatherException(th);
        } else {
            c(th);
        }
    }

    public static void bE(Context context) {
        aHL = context;
        mContext = l.dz(context);
    }

    private static void c(Throwable th) {
        if (IX == null) {
            IX = new CopyOnWriteArrayList();
        }
        IX.add(th);
    }

    public static void d(com.kwad.sdk.g.a<Throwable> aVar) {
        List<Throwable> list = IX;
        if (list == null) {
            return;
        }
        for (Throwable th : list) {
            aVar.accept(th);
        }
        IX.clear();
        IX = null;
    }

    public static <T> T get(Class<T> cls) {
        return (T) ServiceProviderDelegate.INSTANCE.get(cls);
    }

    public static Context getContext() {
        if (aHO) {
            return HA();
        }
        if (aHM == null) {
            aHM = l.wrapContextIfNeed(mContext);
        }
        return aHM;
    }

    public static <T> void put(Class<T> cls, T t) {
        ServiceProviderDelegate.INSTANCE.put(cls, t);
    }
}
