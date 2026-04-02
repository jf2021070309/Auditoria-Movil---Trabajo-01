package com.segment.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.segment.analytics.core.BuildConfig;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes4.dex */
public class AnalyticsContext extends ValueMap {
    private static final String APP_BUILD_KEY = "build";
    private static final String APP_KEY = "app";
    private static final String APP_NAMESPACE_KEY = "namespace";
    private static final String APP_NAME_KEY = "name";
    private static final String APP_VERSION_KEY = "version";
    private static final String CAMPAIGN_KEY = "campaign";
    static final String DEVICE_KEY = "device";
    private static final String INSTANCE_ID_KEY = "instanceId";
    private static final String LIBRARY_KEY = "library";
    private static final String LIBRARY_NAME_KEY = "name";
    private static final String LIBRARY_VERSION_KEY = "version";
    private static final String LOCALE_KEY = "locale";
    private static final String LOCATION_KEY = "location";
    private static final String NETWORK_BLUETOOTH_KEY = "bluetooth";
    private static final String NETWORK_CARRIER_KEY = "carrier";
    private static final String NETWORK_CELLULAR_KEY = "cellular";
    private static final String NETWORK_KEY = "network";
    private static final String NETWORK_WIFI_KEY = "wifi";
    private static final String OS_KEY = "os";
    private static final String OS_NAME_KEY = "name";
    private static final String OS_VERSION_KEY = "version";
    private static final String REFERRER_KEY = "referrer";
    private static final String SCREEN_DENSITY_KEY = "density";
    private static final String SCREEN_HEIGHT_KEY = "height";
    private static final String SCREEN_KEY = "screen";
    private static final String SCREEN_WIDTH_KEY = "width";
    private static final String TIMEZONE_KEY = "timezone";
    private static final String TRAITS_KEY = "traits";
    private static final String USER_AGENT_KEY = "userAgent";

    /* loaded from: classes4.dex */
    public static class Campaign extends ValueMap {
        private static final String CAMPAIGN_CONTENT_KEY = "content";
        private static final String CAMPAIGN_MEDIUM_KEY = "medium";
        private static final String CAMPAIGN_NAME_KEY = "name";
        private static final String CAMPAIGN_SOURCE_KEY = "source";
        private static final String CAMPAIGN_TERM_KEY = "term";

        public Campaign() {
        }

        public String content() {
            return getString("content");
        }

        public String medium() {
            return getString("medium");
        }

        public String name() {
            return getString("name");
        }

        public Campaign putContent(String str) {
            return putValue("content", (Object) str);
        }

        public Campaign putMedium(String str) {
            return putValue("medium", (Object) str);
        }

        public Campaign putName(String str) {
            return putValue("name", (Object) str);
        }

        public Campaign putSource(String str) {
            return putValue("source", (Object) str);
        }

        public Campaign putTerm(String str) {
            return putValue("term", (Object) str);
        }

        public String source() {
            return getString("source");
        }

        public String term() {
            return getString("term");
        }

        public String tern() {
            return term();
        }

        private Campaign(Map<String, Object> map) {
            super(map);
        }

        @Override // com.segment.analytics.ValueMap
        public Campaign putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static class Device extends ValueMap {
        static final String DEVICE_ADVERTISING_ID_KEY = "advertisingId";
        static final String DEVICE_AD_TRACKING_ENABLED_KEY = "adTrackingEnabled";
        static final String DEVICE_ID_KEY = "id";
        static final String DEVICE_MANUFACTURER_KEY = "manufacturer";
        static final String DEVICE_MODEL_KEY = "model";
        static final String DEVICE_NAME_KEY = "name";
        static final String DEVICE_TOKEN_KEY = "token";
        static final String DEVICE_TYPE_KEY = "type";

        public Device() {
        }

        public void putAdvertisingInfo(String str, boolean z) {
            if (z && !Utils.isNullOrEmpty(str)) {
                put(DEVICE_ADVERTISING_ID_KEY, (Object) str);
            }
            put(DEVICE_AD_TRACKING_ENABLED_KEY, (Object) Boolean.valueOf(z));
        }

        public Device putDeviceToken(String str) {
            return putValue(DEVICE_TOKEN_KEY, (Object) str);
        }

        private Device(Map<String, Object> map) {
            super(map);
        }

        @Override // com.segment.analytics.ValueMap
        public Device putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static class Location extends ValueMap {
        private static final String LOCATION_LATITUDE_KEY = "latitude";
        private static final String LOCATION_LONGITUDE_KEY = "longitude";
        private static final String LOCATION_SPEED_KEY = "speed";

        public Location() {
        }

        public double latitude() {
            return getDouble(LOCATION_LATITUDE_KEY, 0.0d);
        }

        public double longitude() {
            return getDouble(LOCATION_LONGITUDE_KEY, 0.0d);
        }

        public Location putLatitude(double d) {
            return putValue(LOCATION_LATITUDE_KEY, (Object) Double.valueOf(d));
        }

        public Location putLongitude(double d) {
            return putValue(LOCATION_LONGITUDE_KEY, (Object) Double.valueOf(d));
        }

        public Location putSpeed(double d) {
            return putValue(LOCATION_SPEED_KEY, (Object) Double.valueOf(d));
        }

        public double speed() {
            return getDouble(LOCATION_SPEED_KEY, 0.0d);
        }

        private Location(Map<String, Object> map) {
            super(map);
        }

        @Override // com.segment.analytics.ValueMap
        public Location putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static class Referrer extends ValueMap {
        private static final String REFERRER_ID_KEY = "id";
        private static final String REFERRER_LINK_KEY = "link";
        private static final String REFERRER_NAME_KEY = "name";
        private static final String REFERRER_TYPE_KEY = "type";
        private static final String REFERRER_URL_KEY = "url";

        public Referrer() {
        }

        public String id() {
            return getString(REFERRER_ID_KEY);
        }

        public String link() {
            return getString(REFERRER_LINK_KEY);
        }

        public String name() {
            return getString("name");
        }

        public Referrer putId(String str) {
            return putValue(REFERRER_ID_KEY, (Object) str);
        }

        public Referrer putLink(String str) {
            return putValue(REFERRER_LINK_KEY, (Object) str);
        }

        public Referrer putName(String str) {
            return putValue("name", (Object) str);
        }

        public Referrer putTerm(String str) {
            return putValue("url", (Object) str);
        }

        public Referrer putType(String str) {
            return putValue(REFERRER_TYPE_KEY, (Object) str);
        }

        public Referrer putUrl(String str) {
            return putValue("url", (Object) str);
        }

        public String type() {
            return getString(REFERRER_TYPE_KEY);
        }

        public String url() {
            return getString("url");
        }

        public Referrer(Map<String, Object> map) {
            super(map);
        }

        @Override // com.segment.analytics.ValueMap
        public Referrer putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }
    }

    public AnalyticsContext(Map<String, Object> map) {
        super(map);
    }

    public static synchronized AnalyticsContext create(Context context, Traits traits, boolean z) {
        AnalyticsContext analyticsContext;
        synchronized (AnalyticsContext.class) {
            analyticsContext = new AnalyticsContext(new Utils.NullableConcurrentHashMap());
            analyticsContext.putApp(context);
            analyticsContext.setTraits(traits);
            analyticsContext.putDevice(z);
            analyticsContext.putLibrary();
            analyticsContext.put(LOCALE_KEY, (Object) (Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry()));
            analyticsContext.putNetwork(context);
            analyticsContext.putOs();
            analyticsContext.putScreen(context);
            analyticsContext.putTelemetry();
            putUndefinedIfNull(analyticsContext, USER_AGENT_KEY, System.getProperty("http.agent"));
            putUndefinedIfNull(analyticsContext, TIMEZONE_KEY, TimeZone.getDefault().getID());
        }
        return analyticsContext;
    }

    public static void putUndefinedIfNull(Map<String, Object> map, String str, CharSequence charSequence) {
        if (Utils.isNullOrEmpty(charSequence)) {
            map.put(str, AdError.UNDEFINED_DOMAIN);
        } else {
            map.put(str, charSequence);
        }
    }

    public void attachAdvertisingId(Context context, CountDownLatch countDownLatch, Logger logger) {
        if (Utils.isOnClassPath("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            new GetAdvertisingIdTask(this, countDownLatch, logger).execute(context);
            return;
        }
        logger.debug("Not collecting advertising ID because com.google.android.gms.ads.identifier.AdvertisingIdClient was not found on the classpath.", new Object[0]);
        countDownLatch.countDown();
    }

    public void attachDeviceId(SharedPreferences sharedPreferences) {
        new GetDeviceIdTask(this, sharedPreferences, new CountDownLatch(1)).execute();
    }

    public Campaign campaign() {
        return (Campaign) getValueMap("campaign", Campaign.class);
    }

    public Device device() {
        return (Device) getValueMap(DEVICE_KEY, Device.class);
    }

    public Location location() {
        return (Location) getValueMap("location", Location.class);
    }

    public void putApp(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            Map createMap = Utils.createMap();
            putUndefinedIfNull(createMap, AppMeasurementSdk.ConditionalUserProperty.NAME, packageInfo.applicationInfo.loadLabel(packageManager));
            putUndefinedIfNull(createMap, "version", packageInfo.versionName);
            putUndefinedIfNull(createMap, APP_NAMESPACE_KEY, packageInfo.packageName);
            createMap.put(APP_BUILD_KEY, String.valueOf(packageInfo.versionCode));
            put(APP_KEY, (Object) createMap);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public AnalyticsContext putCampaign(Campaign campaign) {
        return putValue("campaign", (Object) campaign);
    }

    public void putDevice(boolean z) {
        String anonymousId;
        Device device = new Device();
        if (z) {
            anonymousId = "";
        } else {
            anonymousId = traits().anonymousId();
        }
        device.put("id", (Object) anonymousId);
        device.put("manufacturer", (Object) Build.MANUFACTURER);
        device.put("model", (Object) Build.MODEL);
        device.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (Object) Build.DEVICE);
        device.put("type", (Object) CredentialsData.CREDENTIALS_TYPE_ANDROID);
        put(DEVICE_KEY, (Object) device);
    }

    public AnalyticsContext putDeviceToken(String str) {
        device().putDeviceToken(str);
        return this;
    }

    public void putLibrary() {
        Map createMap = Utils.createMap();
        createMap.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "analytics-android");
        createMap.put("version", BuildConfig.VERSION_NAME);
        put(LIBRARY_KEY, (Object) createMap);
    }

    public AnalyticsContext putLocation(Location location) {
        return putValue("location", (Object) location);
    }

    @SuppressLint({"MissingPermission"})
    public void putNetwork(Context context) {
        ConnectivityManager connectivityManager;
        boolean z;
        boolean z2;
        Map createMap = Utils.createMap();
        if (Utils.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) Utils.getSystemService(context, "connectivity")) != null) {
            boolean z3 = true;
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && networkInfo.isConnected()) {
                z = true;
            } else {
                z = false;
            }
            createMap.put(NETWORK_WIFI_KEY, Boolean.valueOf(z));
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(7);
            if (networkInfo2 != null && networkInfo2.isConnected()) {
                z2 = true;
            } else {
                z2 = false;
            }
            createMap.put(NETWORK_BLUETOOTH_KEY, Boolean.valueOf(z2));
            NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
            if (networkInfo3 == null || !networkInfo3.isConnected()) {
                z3 = false;
            }
            createMap.put(NETWORK_CELLULAR_KEY, Boolean.valueOf(z3));
        }
        TelephonyManager telephonyManager = (TelephonyManager) Utils.getSystemService(context, "phone");
        if (telephonyManager != null) {
            createMap.put(NETWORK_CARRIER_KEY, telephonyManager.getNetworkOperatorName());
        } else {
            createMap.put(NETWORK_CARRIER_KEY, "unknown");
        }
        put(NETWORK_KEY, (Object) createMap);
    }

    public void putOs() {
        Map createMap = Utils.createMap();
        createMap.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "Android");
        createMap.put("version", Build.VERSION.RELEASE);
        put(OS_KEY, (Object) createMap);
    }

    public AnalyticsContext putReferrer(Referrer referrer) {
        return putValue(REFERRER_KEY, (Object) referrer);
    }

    public void putScreen(Context context) {
        Map createMap = Utils.createMap();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        createMap.put(SCREEN_DENSITY_KEY, Float.valueOf(displayMetrics.density));
        createMap.put(SCREEN_HEIGHT_KEY, Integer.valueOf(displayMetrics.heightPixels));
        createMap.put(SCREEN_WIDTH_KEY, Integer.valueOf(displayMetrics.widthPixels));
        put(SCREEN_KEY, (Object) createMap);
    }

    public void putTelemetry() {
        put(INSTANCE_ID_KEY, (Object) UUID.randomUUID().toString());
    }

    public void setTraits(Traits traits) {
        put(TRAITS_KEY, (Object) traits.unmodifiableCopy());
    }

    public Traits traits() {
        return (Traits) getValueMap(TRAITS_KEY, Traits.class);
    }

    public AnalyticsContext unmodifiableCopy() {
        return new AnalyticsContext(Collections.unmodifiableMap(new LinkedHashMap(this)));
    }

    @Override // com.segment.analytics.ValueMap
    public AnalyticsContext putValue(String str, Object obj) {
        super.putValue(str, obj);
        return this;
    }
}
