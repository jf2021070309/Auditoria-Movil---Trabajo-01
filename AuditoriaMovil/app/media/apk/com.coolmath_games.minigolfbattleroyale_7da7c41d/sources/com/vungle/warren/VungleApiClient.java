package com.vungle.warren;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.network.APIFactory;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.VungleApi;
import com.vungle.warren.omsdk.OMInjector;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.TimeoutProvider;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
/* loaded from: classes2.dex */
public class VungleApiClient {
    private static String BASE_URL = null;
    private static final String ID = "id";
    static final String MANUFACTURER_AMAZON = "Amazon";
    private static final String TAG = VungleApiClient.class.getCanonicalName();
    protected static WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static Set<Interceptor> logInterceptors;
    private static Set<Interceptor> networkInterceptors;
    private VungleApi api;
    private JsonObject appBody;
    private String bustAnalyticsEndpoint;
    private String cacheBustEndpoint;
    private CacheManager cacheManager;
    private OkHttpClient client;
    private Context context;
    private boolean defaultIdFallbackDisabled;
    private JsonObject deviceBody;
    private boolean enableOm;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private String logEndpoint;
    private String newEndpoint;
    private final OMInjector omInjector;
    private String reportAdEndpoint;
    private Repository repository;
    private String requestAdEndpoint;
    private String riEndpoint;
    private VungleApi timeoutApi;
    private TimeoutProvider timeoutProvider;
    private JsonObject userBody;
    private boolean willPlayAdEnabled;
    private String willPlayAdEndpoint;
    private int willPlayAdTimeout;
    private Map<String, Long> retryAfterDataMap = new ConcurrentHashMap();
    private String uaString = System.getProperty("http.agent");

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        public static final String EDGE = "edge";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "LTE";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";
    }

    /* loaded from: classes2.dex */
    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    private String getConnectionTypeDetail(int i) {
        switch (i) {
            case 1:
                return ConnectionTypeDetail.GPRS;
            case 2:
                return ConnectionTypeDetail.EDGE;
            case 3:
            case 10:
            case 11:
            default:
                return "unknown";
            case 4:
                return ConnectionTypeDetail.WCDMA;
            case 5:
                return ConnectionTypeDetail.CDMA_EVDO_0;
            case 6:
                return ConnectionTypeDetail.CDMA_EVDO_A;
            case 7:
                return ConnectionTypeDetail.CDMA_1XRTT;
            case 8:
                return ConnectionTypeDetail.HSDPA;
            case 9:
                return ConnectionTypeDetail.HSUPA;
            case 12:
                return ConnectionTypeDetail.CDMA_EVDO_B;
            case 13:
                return ConnectionTypeDetail.LTE;
            case 14:
                return ConnectionTypeDetail.HRPD;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(MANUFACTURER_AMAZON.equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb.append(BuildConfig.VERSION_NAME);
        headerUa = sb.toString();
        BASE_URL = "https://ads.api.vungle.com/";
        networkInterceptors = new HashSet();
        logInterceptors = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleApiClient(Context context, CacheManager cacheManager, Repository repository, OMInjector oMInjector) {
        this.cacheManager = cacheManager;
        this.context = context.getApplicationContext();
        this.repository = repository;
        this.omInjector = oMInjector;
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.vungle.warren.VungleApiClient.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                int code;
                Request request = chain.request();
                String encodedPath = request.url().encodedPath();
                Long l = (Long) VungleApiClient.this.retryAfterDataMap.get(encodedPath);
                if (l != null) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(l.longValue() - System.currentTimeMillis());
                    if (seconds <= 0) {
                        VungleApiClient.this.retryAfterDataMap.remove(encodedPath);
                    } else {
                        return new Response.Builder().request(request).addHeader("Retry-After", String.valueOf(seconds)).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"Error\":\"Retry-After\"}")).build();
                    }
                }
                Response proceed = chain.proceed(request);
                if (proceed != null && ((code = proceed.code()) == 429 || code == 500 || code == 502 || code == 503)) {
                    String str = proceed.headers().get("Retry-After");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            long parseLong = Long.parseLong(str);
                            if (parseLong > 0) {
                                VungleApiClient.this.retryAfterDataMap.put(encodedPath, Long.valueOf((parseLong * 1000) + System.currentTimeMillis()));
                            }
                        } catch (NumberFormatException unused) {
                            Log.d(VungleApiClient.TAG, "Retry-After value is not an valid value");
                        }
                    }
                }
                return proceed;
            }
        });
        this.client = addInterceptor.build();
        OkHttpClient build = addInterceptor.addInterceptor(new GzipRequestInterceptor()).build();
        this.api = new APIFactory(this.client, BASE_URL).createAPI();
        this.gzipApi = new APIFactory(build, BASE_URL).createAPI();
        this.timeoutProvider = (TimeoutProvider) ServiceLocator.getInstance(context).getService(TimeoutProvider.class);
    }

    public static String getHeaderUa() {
        return headerUa;
    }

    public static void setHeaderUa(String str) {
        headerUa = str;
    }

    public void init() {
        init(this.context);
    }

    /* loaded from: classes2.dex */
    static class GzipRequestInterceptor implements Interceptor {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        private static final String GZIP = "gzip";

        GzipRequestInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            if (request.body() == null || request.header(CONTENT_ENCODING) != null) {
                return chain.proceed(request);
            }
            return chain.proceed(request.newBuilder().header(CONTENT_ENCODING, GZIP).method(request.method(), gzip(request.body())).build());
        }

        private RequestBody gzip(final RequestBody requestBody) throws IOException {
            final Buffer buffer = new Buffer();
            BufferedSink buffer2 = Okio.buffer(new GzipSink(buffer));
            requestBody.writeTo(buffer2);
            buffer2.close();
            return new RequestBody() { // from class: com.vungle.warren.VungleApiClient.GzipRequestInterceptor.1
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return requestBody.contentType();
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return buffer.size();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    bufferedSink.write(buffer.snapshot());
                }
            };
        }
    }

    public void setDefaultIdFallbackDisabled(boolean z) {
        this.defaultIdFallbackDisabled = z;
    }

    synchronized void init(Context context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bundle", context.getPackageName());
        String str = null;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (str == null) {
            str = "1.0";
        }
        jsonObject.addProperty("ver", str);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("make", Build.MANUFACTURER);
        jsonObject2.addProperty("model", Build.MODEL);
        jsonObject2.addProperty("osv", Build.VERSION.RELEASE);
        jsonObject2.addProperty("carrier", ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName());
        jsonObject2.addProperty("os", MANUFACTURER_AMAZON.equals(Build.MANUFACTURER) ? "amazon" : Constants.PLATFORM);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        jsonObject2.addProperty("w", Integer.valueOf(displayMetrics.widthPixels));
        jsonObject2.addProperty("h", Integer.valueOf(displayMetrics.heightPixels));
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.add("vungle", new JsonObject());
        jsonObject2.add("ext", jsonObject3);
        try {
            this.uaString = getUserAgentFromCookie();
            initUserAgentLazy();
        } catch (Exception e) {
            String str2 = TAG;
            Log.e(str2, "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
        }
        jsonObject2.addProperty("ua", this.uaString);
        this.deviceBody = jsonObject2;
        this.appBody = jsonObject;
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAppId(String str) {
        setAppId(str, this.appBody);
    }

    private void setAppId(String str, JsonObject jsonObject) {
        jsonObject.addProperty("id", str);
    }

    private void initUserAgentLazy() {
        new Thread(new Runnable() { // from class: com.vungle.warren.VungleApiClient.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    VungleApiClient.this.uaString = WebSettings.getDefaultUserAgent(VungleApiClient.this.context);
                    VungleApiClient.this.deviceBody.addProperty("ua", VungleApiClient.this.uaString);
                    VungleApiClient.this.addUserAgentInCookie(VungleApiClient.this.uaString);
                } catch (Exception e) {
                    String str = VungleApiClient.TAG;
                    Log.e(str, "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
                }
            }
        }, "vng_iual").start();
    }

    public com.vungle.warren.network.Response config() throws VungleException, IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add("app", this.appBody);
        jsonObject.add("user", getUserBody());
        com.vungle.warren.network.Response<JsonObject> execute = this.api.config(getHeaderUa(), jsonObject).execute();
        if (execute.isSuccessful()) {
            JsonObject body = execute.body();
            String str = TAG;
            Log.d(str, "Config Response: " + body);
            if (JsonUtil.hasNonNull(body, "sleep")) {
                String asString = JsonUtil.hasNonNull(body, "info") ? body.get("info").getAsString() : "";
                String str2 = TAG;
                Log.e(str2, "Error Initializing Vungle. Please try again. " + asString);
                throw new VungleException(3);
            } else if (!JsonUtil.hasNonNull(body, "endpoints")) {
                Log.e(TAG, "Error Initializing Vungle. Please try again. ");
                throw new VungleException(3);
            } else {
                JsonObject asJsonObject = body.getAsJsonObject("endpoints");
                HttpUrl parse = HttpUrl.parse(asJsonObject.get(AppSettingsData.STATUS_NEW).getAsString());
                HttpUrl parse2 = HttpUrl.parse(asJsonObject.get("ads").getAsString());
                HttpUrl parse3 = HttpUrl.parse(asJsonObject.get("will_play_ad").getAsString());
                HttpUrl parse4 = HttpUrl.parse(asJsonObject.get("report_ad").getAsString());
                HttpUrl parse5 = HttpUrl.parse(asJsonObject.get("ri").getAsString());
                HttpUrl parse6 = HttpUrl.parse(asJsonObject.get("log").getAsString());
                HttpUrl parse7 = HttpUrl.parse(asJsonObject.get(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME).getAsString());
                HttpUrl parse8 = HttpUrl.parse(asJsonObject.get("sdk_bi").getAsString());
                if (parse == null || parse2 == null || parse3 == null || parse4 == null || parse5 == null || parse6 == null || parse7 == null) {
                    Log.e(TAG, "Error Initializing Vungle. Please try again. ");
                    throw new VungleException(3);
                }
                this.newEndpoint = parse.toString();
                this.requestAdEndpoint = parse2.toString();
                this.willPlayAdEndpoint = parse3.toString();
                this.reportAdEndpoint = parse4.toString();
                this.riEndpoint = parse5.toString();
                this.logEndpoint = parse6.toString();
                this.cacheBustEndpoint = parse7.toString();
                this.bustAnalyticsEndpoint = parse8.toString();
                JsonObject asJsonObject2 = body.getAsJsonObject("will_play_ad");
                this.willPlayAdTimeout = asJsonObject2.get("request_timeout").getAsInt();
                this.willPlayAdEnabled = asJsonObject2.get("enabled").getAsBoolean();
                this.enableOm = JsonUtil.getAsBoolean(body.getAsJsonObject("viewability"), "om", false);
                if (this.willPlayAdEnabled) {
                    Log.v(TAG, "willPlayAd is enabled, generating a timeout client.");
                    this.timeoutApi = new APIFactory(this.client.newBuilder().readTimeout(this.willPlayAdTimeout, TimeUnit.MILLISECONDS).build(), "https://api.vungle.com/").createAPI();
                }
                if (getOmEnabled()) {
                    this.omInjector.init();
                }
                return execute;
            }
        }
        return execute;
    }

    public Call<JsonObject> reportNew() throws IllegalStateException {
        if (this.newEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        HashMap hashMap = new HashMap(2);
        JsonElement jsonElement = this.appBody.get("id");
        JsonElement jsonElement2 = this.deviceBody.get("ifa");
        hashMap.put("app_id", jsonElement != null ? jsonElement.getAsString() : "");
        hashMap.put("ifa", jsonElement2 != null ? jsonElement2.getAsString() : "");
        return this.api.reportNew(getHeaderUa(), this.newEndpoint, hashMap);
    }

    public Call<JsonObject> requestAd(String str, String str2, boolean z, JsonObject jsonObject) throws IllegalStateException {
        if (this.requestAdEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("device", getDeviceBody());
        jsonObject2.add("app", this.appBody);
        JsonObject userBody = getUserBody();
        if (jsonObject != null) {
            userBody.add("vision", jsonObject);
        }
        jsonObject2.add("user", userBody);
        JsonObject jsonObject3 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(str);
        jsonObject3.add("placements", jsonArray);
        jsonObject3.addProperty("header_bidding", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str2)) {
            jsonObject3.addProperty("ad_size", str2);
        }
        jsonObject2.add(ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, jsonObject3);
        return this.gzipApi.ads(getHeaderUa(), this.requestAdEndpoint, jsonObject2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Call<JsonObject> willPlayAd(String str, boolean z, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add("app", this.appBody);
        jsonObject.add("user", getUserBody());
        JsonObject jsonObject2 = new JsonObject();
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("reference_id", str);
        jsonObject3.addProperty("is_auto_cached", Boolean.valueOf(z));
        jsonObject2.add("placement", jsonObject3);
        jsonObject2.addProperty(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_AD_TOKEN, str2);
        jsonObject.add(ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, jsonObject2);
        return this.timeoutApi.willPlayAd(getHeaderUa(), this.willPlayAdEndpoint, jsonObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean canCallWillPlayAd() {
        return this.willPlayAdEnabled && !TextUtils.isEmpty(this.willPlayAdEndpoint);
    }

    public Call<JsonObject> reportAd(JsonObject jsonObject) {
        if (this.reportAdEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("device", getDeviceBody());
        jsonObject2.add("app", this.appBody);
        jsonObject2.add(ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, jsonObject);
        jsonObject2.add("user", getUserBody());
        return this.gzipApi.reportAd(getHeaderUa(), this.reportAdEndpoint, jsonObject2);
    }

    public Call<JsonObject> sendLog(JsonObject jsonObject) {
        if (this.logEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        return this.gzipApi.sendLog(getHeaderUa(), this.logEndpoint, jsonObject);
    }

    public Call<JsonObject> ri(JsonObject jsonObject) {
        if (this.riEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("device", getDeviceBody());
        jsonObject2.add("app", this.appBody);
        jsonObject2.add(ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, jsonObject);
        return this.api.ri(getHeaderUa(), this.riEndpoint, jsonObject2);
    }

    public boolean pingTPAT(String str) throws ClearTextTrafficException, MalformedURLException {
        boolean isCleartextTrafficPermitted;
        if (!TextUtils.isEmpty(str) && HttpUrl.parse(str) != null) {
            try {
                String host = new URL(str).getHost();
                if (Build.VERSION.SDK_INT >= 24) {
                    isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
                } else {
                    isCleartextTrafficPermitted = Build.VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true;
                }
                if (!isCleartextTrafficPermitted && URLUtil.isHttpUrl(str)) {
                    throw new ClearTextTrafficException("Clear Text Traffic is blocked");
                }
                try {
                    this.api.pingTPAT(this.uaString, str).execute();
                    return true;
                } catch (IOException unused) {
                    Log.d(TAG, "Error on pinging TPAT");
                    return false;
                }
            } catch (MalformedURLException unused2) {
                throw new MalformedURLException("Invalid URL : " + str);
            }
        }
        throw new MalformedURLException("Invalid URL : " + str);
    }

    public Call<JsonObject> cacheBust(long j) {
        if (this.cacheBustEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add("app", this.appBody);
        jsonObject.add("user", getUserBody());
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(Cookie.LAST_CACHE_BUST, Long.valueOf(j));
        jsonObject.add(ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, jsonObject2);
        return this.gzipApi.cacheBust(getHeaderUa(), this.cacheBustEndpoint, jsonObject);
    }

    public Call<JsonObject> bustAnalytics(Collection<CacheBust> collection) {
        if (this.bustAnalyticsEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add("app", this.appBody);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray(collection.size());
        for (CacheBust cacheBust : collection) {
            for (int i = 0; i < cacheBust.getEventIds().length; i++) {
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("target", cacheBust.getIdType() == 1 ? "campaign" : VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE);
                jsonObject3.addProperty("id", cacheBust.getId());
                jsonObject3.addProperty("event_id", cacheBust.getEventIds()[i]);
                jsonArray.add(jsonObject3);
            }
        }
        jsonObject2.add(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME, jsonArray);
        jsonObject2.add("sessionReport", new JsonObject());
        jsonObject.add(ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, jsonObject2);
        return this.gzipApi.bustAnalytics(getHeaderUa(), this.bustAnalyticsEndpoint, jsonObject);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:1|(3:2|3|4)|(5:6|7|(1:9)(1:150)|10|11)(3:154|155|(6:157|159|160|161|162|148)(1:174))|12|(3:14|(1:16)(1:128)|17)(4:129|(1:139)(1:131)|132|(1:136))|18|(1:20)|21|(4:23|(1:26)|27|(20:(2:119|(1:(1:(1:123)(1:124))(1:125))(1:126))(1:32)|33|(1:118)(1:37)|38|(4:40|(1:71)(2:44|(1:(1:69)(2:49|(2:51|(1:53)(1:67))(1:68)))(1:70))|54|(2:56|(3:58|(1:(1:(1:62))(1:64))(1:65)|63)(1:66)))|72|(3:74|(1:76)(1:78)|77)|79|(1:83)|84|(1:86)(2:108|(1:112)(1:113))|87|(1:89)|90|91|(2:93|(1:95))(2:103|(1:105))|96|(1:98)(1:102)|99|100))|127|33|(1:35)|118|38|(0)|72|(0)|79|(2:81|83)|84|(0)(0)|87|(0)|90|91|(0)(0)|96|(0)(0)|99|100|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x033d, code lost:
        android.util.Log.e(com.vungle.warren.VungleApiClient.TAG, "isInstallNonMarketAppsEnabled Settings not found", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0312 A[Catch: SettingNotFoundException -> 0x033c, TryCatch #1 {SettingNotFoundException -> 0x033c, blocks: (B:153:0x030c, B:155:0x0312, B:157:0x031c, B:158:0x032c), top: B:173:0x030c }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032c A[Catch: SettingNotFoundException -> 0x033c, TRY_LEAVE, TryCatch #1 {SettingNotFoundException -> 0x033c, blocks: (B:153:0x030c, B:155:0x0312, B:157:0x031c, B:158:0x032c), top: B:173:0x030c }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0181  */
    /* JADX WARN: Type inference failed for: r6v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.gson.JsonObject getDeviceBody() throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.VungleApiClient.getDeviceBody():com.google.gson.JsonObject");
    }

    private JsonObject getUserBody() {
        long j;
        String str;
        String str2;
        String str3;
        JsonObject jsonObject = new JsonObject();
        Cookie cookie = (Cookie) this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (cookie != null) {
            str = cookie.getString("consent_status");
            str2 = cookie.getString("consent_source");
            j = cookie.getLong(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP).longValue();
            str3 = cookie.getString("consent_message_version");
        } else {
            j = 0;
            str = "unknown";
            str2 = "no_interaction";
            str3 = "";
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("consent_status", str);
        jsonObject2.addProperty("consent_source", str2);
        jsonObject2.addProperty("consent_timestamp", Long.valueOf(j));
        jsonObject2.addProperty("consent_message_version", TextUtils.isEmpty(str3) ? "" : str3);
        jsonObject.add("gdpr", jsonObject2);
        Cookie cookie2 = (Cookie) this.repository.load(Cookie.CCPA_COOKIE, Cookie.class).get();
        String string = cookie2 != null ? cookie2.getString(Cookie.CCPA_CONSENT_STATUS) : Cookie.CONSENT_STATUS_OPTED_IN;
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("status", string);
        jsonObject.add("ccpa", jsonObject3);
        return jsonObject;
    }

    public boolean getOmEnabled() {
        return this.enableOm;
    }

    private String getUserAgentFromCookie() {
        Cookie cookie = (Cookie) this.repository.load(Cookie.USER_AGENT_ID_COOKIE, Cookie.class).get();
        if (cookie == null) {
            return System.getProperty("http.agent");
        }
        String string = cookie.getString(Cookie.USER_AGENT_ID_COOKIE);
        return TextUtils.isEmpty(string) ? System.getProperty("http.agent") : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserAgentInCookie(String str) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(Cookie.USER_AGENT_ID_COOKIE);
        cookie.putValue(Cookie.USER_AGENT_ID_COOKIE, str);
        this.repository.save(cookie);
    }

    public long getRetryAfterHeaderValue(com.vungle.warren.network.Response response) {
        try {
            return Long.parseLong(response.headers().get("Retry-After")) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* loaded from: classes2.dex */
    public static class ClearTextTrafficException extends IOException {
        ClearTextTrafficException(String str) {
            super(str);
        }
    }

    void overrideApi(VungleApi vungleApi) {
        this.api = vungleApi;
    }

    public Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    Boolean getPlayServicesAvailabilityFromCookie() {
        Cookie cookie = (Cookie) this.repository.load(Cookie.IS_PLAY_SERVICE_AVAILABLE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (cookie != null) {
            return cookie.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
        }
        return null;
    }

    Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean bool = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            if (googleApiAvailabilityLight != null) {
                bool = Boolean.valueOf(googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.context) == 0);
                addPlaySvcAvailabilityInCookie(bool.booleanValue());
                return bool;
            }
            return null;
        } catch (Exception unused) {
            Log.w(TAG, "Unexpected exception from Play services lib.");
            return bool;
        } catch (NoClassDefFoundError unused2) {
            Log.w(TAG, "Play services Not available");
            Boolean bool2 = false;
            try {
                addPlaySvcAvailabilityInCookie(bool2.booleanValue());
                return bool2;
            } catch (DatabaseHelper.DBException unused3) {
                Log.w(TAG, "Failure to write GPS availability to DB");
                return bool2;
            }
        }
    }

    void addPlaySvcAvailabilityInCookie(boolean z) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(Cookie.IS_PLAY_SERVICE_AVAILABLE);
        cookie.putValue(Cookie.IS_PLAY_SERVICE_AVAILABLE, Boolean.valueOf(z));
        this.repository.save(cookie);
    }
}
