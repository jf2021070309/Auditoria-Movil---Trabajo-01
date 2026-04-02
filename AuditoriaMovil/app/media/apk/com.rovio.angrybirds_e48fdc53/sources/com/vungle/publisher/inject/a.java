package com.vungle.publisher.inject;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import com.facebook.places.model.PlaceFields;
import com.vungle.publisher.FlexViewAdActivity;
import com.vungle.publisher.MraidFullScreenAdActivity;
import com.vungle.publisher.VideoFullScreenAdActivity;
import com.vungle.publisher.VungleAdActivity;
import com.vungle.publisher.env.AndroidDevice;
import com.vungle.publisher.env.WrapperFramework;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.qm;
import com.vungle.publisher.qr;
import com.vungle.publisher.sv;
import com.vungle.publisher.sz;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import javax.inject.Singleton;
@Module
/* loaded from: classes4.dex */
public class a {
    private Context a;
    private String b;
    private Class<? extends VungleAdActivity> c;
    private Class<? extends VungleAdActivity> d;
    private Class<? extends VungleAdActivity> e;
    private WrapperFramework f;
    private String g;
    private boolean h;

    public void a(WrapperFramework wrapperFramework) {
        if (this.h) {
            Logger.d(Logger.INJECT_TAG, "wrapper framework in publisher module NOT set - already initialized");
            return;
        }
        Logger.d(Logger.INJECT_TAG, "setting framework in publisher module: " + wrapperFramework);
        this.f = wrapperFramework;
    }

    public void a(String str) {
        if (this.h) {
            Logger.d(Logger.INJECT_TAG, "wrapper framework version in publisher module NOT set - already initialized");
            return;
        }
        Logger.d(Logger.INJECT_TAG, "setting framework in publisher module: " + str);
        this.g = str;
    }

    public boolean a() {
        return this.h;
    }

    public void a(Context context, String str) {
        if (this.h) {
            Logger.d(Logger.INJECT_TAG, "publisher module already initialized");
            return;
        }
        Logger.d(Logger.INJECT_TAG, "initializing publisher module");
        this.a = context.getApplicationContext();
        this.b = str;
        this.h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public Context b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public String a(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            throw new qm();
        }
        return qr.a(externalFilesDir.getAbsolutePath(), ".vungle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public String b(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            throw new qm();
        }
        return qr.a(externalCacheDir, ".VungleCacheDir");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @Singleton
    public AudioManager c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            Logger.d(Logger.DEVICE_TAG, "AudioManager not avaialble");
        }
        return audioManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public ConnectivityManager d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Logger.d(Logger.DEVICE_TAG, "ConnectivityManager not available");
        }
        return connectivityManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @Singleton
    public com.vungle.publisher.env.i a(AndroidDevice androidDevice) {
        return androidDevice;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public SharedPreferences e(Context context) {
        return context.getSharedPreferences("VUNGLE_PUB_APP_INFO", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public Class c() {
        return this.c == null ? VideoFullScreenAdActivity.class : this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public Class d() {
        return this.d == null ? MraidFullScreenAdActivity.class : this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public Class e() {
        return this.e == null ? FlexViewAdActivity.class : this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @Singleton
    public sz a(sv svVar) {
        return svVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @Singleton
    public com.vungle.publisher.env.n a(Context context, WrapperFramework wrapperFramework) {
        String str = null;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.e(Logger.INJECT_TAG, "cannot get App's version");
        }
        return new com.vungle.publisher.env.h(context.getPackageName(), this.b, wrapperFramework, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public TelephonyManager f(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
        if (telephonyManager == null) {
            Logger.d(Logger.DEVICE_TAG, "TelephonyManager not avaialble");
        }
        return telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public WindowManager g(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            Logger.d(Logger.DEVICE_TAG, "WindowManager not available");
        }
        return windowManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public WrapperFramework f() {
        return this.f == null ? WrapperFramework.none : this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public String g() {
        return this.g == null ? "" : this.g;
    }
}
