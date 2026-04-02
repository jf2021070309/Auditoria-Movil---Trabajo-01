package com.kwad.sdk.m;

import android.content.Context;
import android.content.res.Resources;
import com.kwad.sdk.api.core.IKsAdSDK;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.s;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public class e {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final AtomicBoolean IW;
    private Resources aMH;
    private Resources aMI;
    private h aMJ;
    private boolean aMK;
    private ClassLoader aML;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {
        private static final e aMM = new e((byte) 0);
    }

    private e() {
        this.IW = new AtomicBoolean(false);
    }

    /* synthetic */ e(byte b) {
        this();
    }

    public static e KM() {
        return a.aMM;
    }

    private boolean KN() {
        Context HA;
        Field[] declaredFields;
        Object a2;
        Field[] declaredFields2;
        try {
            HA = ServiceProvider.HA();
        } catch (Throwable th) {
            ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(th);
        }
        if (!l.dy(HA)) {
            ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(new IllegalArgumentException("KSPlugin unwrapContextIfNeed fail"));
            return false;
        }
        Class<?> cls = Class.forName("com.kwad.sdk.api.loader.Loader", false, getClass().getClassLoader());
        Object invoke = cls.getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, new Class[0]).invoke(null, new Object[0]);
        for (Field field : cls.getDeclaredFields()) {
            if (field.getType() != IKsAdSDK.class && field.getType() != Context.class && field.getType() != AtomicBoolean.class && (a2 = s.a(field, invoke)) != null) {
                for (Field field2 : a2.getClass().getDeclaredFields()) {
                    if (field2.getType() == Resources.class) {
                        field2.setAccessible(true);
                        Resources resources = (Resources) field2.get(a2);
                        if (resources != null) {
                            Resources resources2 = HA.getResources();
                            if (resources2 != null) {
                                h hVar = new h(resources, resources2);
                                s.a(field2, a2, hVar);
                                this.aMH = resources2;
                                this.aMI = resources;
                                this.aMJ = hVar;
                                return true;
                            }
                            throw new AssertionError();
                        }
                        throw new AssertionError();
                    }
                }
                continue;
            }
        }
        return false;
    }

    private static boolean xJ() {
        return ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xJ();
    }

    private static boolean xK() {
        return ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xK();
    }

    public final boolean Jo() {
        return this.IW.get();
    }

    public final ClassLoader getClassLoader() {
        return this.aML;
    }

    public final Resources getResources() {
        return this.aMJ;
    }

    public final void init() {
        if (this.IW.get()) {
            return;
        }
        try {
            if (((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getIsExternal()) {
                if (xJ() && KN()) {
                    this.aML = getClass().getClassLoader();
                    i.bW(xK());
                    com.kwad.sdk.core.e.c.d("KSDY/KSPlugin", toString());
                    this.aMK = true;
                } else {
                    this.aMK = false;
                }
            }
        } catch (Throwable th) {
            ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(th);
        }
        this.IW.set(true);
    }

    public String toString() {
        return "KSPlugin{mHostResources=" + this.aMH + ", mResResources=" + this.aMI + ", mPluginResources=" + this.aMJ + ", mEnable=" + this.aMK + '}';
    }
}
