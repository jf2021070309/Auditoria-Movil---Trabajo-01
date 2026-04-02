package com.vungle.publisher.env;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.WindowManager;
import com.vungle.publisher.env.AndroidDevice;
import com.vungle.publisher.lm;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class g implements MembersInjector<AndroidDevice> {
    static final /* synthetic */ boolean a;
    private final Provider<lm> b;
    private final Provider<WindowManager> c;
    private final Provider<Context> d;
    private final Provider<SharedPreferences> e;
    private final Provider<AndroidDevice.DeviceIdStrategy> f;
    private final Provider<String> g;

    static {
        a = !g.class.desiredAssertionStatus();
    }

    public g(Provider<lm> provider, Provider<WindowManager> provider2, Provider<Context> provider3, Provider<SharedPreferences> provider4, Provider<AndroidDevice.DeviceIdStrategy> provider5, Provider<String> provider6) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
        if (!a && provider3 == null) {
            throw new AssertionError();
        }
        this.d = provider3;
        if (!a && provider4 == null) {
            throw new AssertionError();
        }
        this.e = provider4;
        if (!a && provider5 == null) {
            throw new AssertionError();
        }
        this.f = provider5;
        if (!a && provider6 == null) {
            throw new AssertionError();
        }
        this.g = provider6;
    }

    public static MembersInjector<AndroidDevice> a(Provider<lm> provider, Provider<WindowManager> provider2, Provider<Context> provider3, Provider<SharedPreferences> provider4, Provider<AndroidDevice.DeviceIdStrategy> provider5, Provider<String> provider6) {
        return new g(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(AndroidDevice androidDevice) {
        if (androidDevice == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        androidDevice.e = this.b.get();
        androidDevice.f = this.c.get();
        androidDevice.g = this.d.get();
        androidDevice.h = this.e.get();
        androidDevice.i = this.f.get();
        androidDevice.j = this.g.get();
    }
}
