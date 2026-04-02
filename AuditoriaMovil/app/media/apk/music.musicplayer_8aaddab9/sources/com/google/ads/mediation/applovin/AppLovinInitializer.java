package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.ApplovinAdapter;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class AppLovinInitializer {
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    public static final int UNINITIALIZED = 0;
    public static AppLovinInitializer a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, Integer> f4498b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<OnInitializeSuccessListener>> f4499c = new HashMap<>();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface InitializationStatus {
    }

    /* loaded from: classes.dex */
    public interface OnInitializeSuccessListener {
        void onInitializeSuccess(String str);
    }

    /* loaded from: classes.dex */
    public class a implements AppLovinSdk.SdkInitializationListener {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            AppLovinInitializer.this.f4498b.put(this.a, 2);
            ArrayList<OnInitializeSuccessListener> arrayList = AppLovinInitializer.this.f4499c.get(this.a);
            if (arrayList != null) {
                Iterator<OnInitializeSuccessListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onInitializeSuccess(this.a);
                }
                arrayList.clear();
            }
        }
    }

    public static AppLovinInitializer getInstance() {
        if (a == null) {
            a = new AppLovinInitializer();
        }
        return a;
    }

    public void initialize(Context context, String str, OnInitializeSuccessListener onInitializeSuccessListener) {
        if (!this.f4498b.containsKey(str)) {
            this.f4498b.put(str, 0);
            this.f4499c.put(str, new ArrayList<>());
        }
        Integer num = 2;
        if (num.equals(this.f4498b.get(str))) {
            onInitializeSuccessListener.onInitializeSuccess(str);
            return;
        }
        this.f4499c.get(str).add(onInitializeSuccessListener);
        Integer num2 = 1;
        if (num2.equals(this.f4498b.get(str))) {
            return;
        }
        this.f4498b.put(str, 1);
        ApplovinAdapter.log(3, String.format("Attempting to initialize SDK with SDK Key: %s", str));
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(str, AppLovinMediationAdapter.getSdkSettings(context), context);
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider(AppLovinMediationProvider.ADMOB);
        appLovinSdk.initializeSdk(new a(str));
    }
}
