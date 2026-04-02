package com.vungle.publisher.inject;

import android.content.Context;
import com.vungle.publisher.env.WrapperFramework;
import com.vungle.publisher.log.Logger;
/* loaded from: classes4.dex */
public class Injector {
    private static Injector a;
    private a b;
    private EndpointModule c;
    private t d;
    private w e;

    public static synchronized Injector getInstance() {
        Injector injector;
        synchronized (Injector.class) {
            if (a == null) {
                a = new Injector();
            }
            injector = a;
        }
        return injector;
    }

    private Injector() {
    }

    public void setWrapperFramework(WrapperFramework wrapperFramework) {
        try {
            if (d()) {
                Logger.d(Logger.INJECT_TAG, "wrapper framework in injector NOT set - already initialized");
            } else {
                Logger.d(Logger.INJECT_TAG, "setting wrapper framework in injector: " + wrapperFramework);
                e().a(wrapperFramework);
            }
        } catch (Exception e) {
            Logger.e(Logger.INJECT_TAG, e);
        }
    }

    public void setWrapperFrameworkVersion(String str) {
        try {
            if (d()) {
                Logger.d(Logger.INJECT_TAG, "wrapper framework version in injector NOT set - already initialized");
            } else {
                Logger.d(Logger.INJECT_TAG, "setting wrapper framework version in injector: " + str);
                e().a(str);
            }
        } catch (Exception e) {
            Logger.e(Logger.INJECT_TAG, e);
        }
    }

    private a e() {
        if (this.b == null) {
            this.b = new a();
        }
        return this.b;
    }

    public Injector setEndpointModule(EndpointModule endpointModule) {
        this.c = endpointModule;
        return this;
    }

    public t a() {
        if (this.d == null) {
            this.d = new t();
        }
        return this.d;
    }

    public EndpointModule b() {
        if (this.c == null) {
            this.c = new EndpointModule();
        }
        return this.c;
    }

    public Injector a(w wVar) {
        this.e = wVar;
        return this;
    }

    public static w c() {
        return getInstance().e;
    }

    public void a(Context context, String str) {
        try {
            if (d()) {
                Logger.d(Logger.INJECT_TAG, "already initialized");
            } else {
                Logger.d(Logger.INJECT_TAG, "initializing");
                e().a(context, str);
                a(r.a().a(e()).a(b()).a(a()).a());
            }
        } catch (Exception e) {
            Logger.e(Logger.INJECT_TAG, "error initializing injector", e);
        }
    }

    public boolean d() {
        return c() != null && e().a();
    }
}
