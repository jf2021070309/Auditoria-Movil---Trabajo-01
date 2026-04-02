package com.vungle.publisher;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.live.TTLiveConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.places.model.PlaceFields;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.vungle.publisher.env.WrapperFramework;
import com.vungle.publisher.inject.Injector;
import com.vungle.publisher.log.Logger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.schedulers.Schedulers;
/* loaded from: classes4.dex */
public class qw {
    private static final qw f = new qw();
    private static Map<String, String> g;
    @Inject
    Context a;
    @Inject
    com.vungle.publisher.env.n b;
    @Inject
    com.vungle.publisher.env.i c;
    @Inject
    WrapperFramework d;
    @Inject
    String e;
    private qv h;
    private qv i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private JsonObject o;
    private JsonObject p;
    private int q;
    private JsonObject r;

    private qw() {
        OkHttpClient build = new OkHttpClient.Builder().build();
        OkHttpClient build2 = new OkHttpClient.Builder().addInterceptor(new a(this, null)).build();
        Retrofit build3 = new Retrofit.Builder().baseUrl("https://api.vungle.com/").addCallAdapterFactory(RxJavaCallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).client(build).build();
        Retrofit build4 = new Retrofit.Builder().baseUrl("https://api.vungle.com/").addCallAdapterFactory(RxJavaCallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).client(build2).build();
        this.h = (qv) build3.create(qv.class);
        this.i = (qv) build4.create(qv.class);
        g = new HashMap();
    }

    public static void a() {
        Injector.c().a(f);
        g.put(DownloadUtils.CONTENT_TYPE, "application/json");
        g.put("Vungle-Version", "5.0.0");
        String str = com.vungle.publisher.env.w.c + BuildConfig.VERSION_NAME;
        if (f.d != null && f.d != WrapperFramework.none) {
            str = str + ";" + f.d;
            if (f.e != null) {
                str = str + "/" + f.e;
            }
        }
        g.put("User-Agent", str);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", f.b.b());
        jsonObject.addProperty(TTLiveConstants.BUNDLE_KEY, f.b.a());
        jsonObject.addProperty("ver", f.b.c());
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("make", Build.MANUFACTURER);
        jsonObject2.addProperty("model", Build.MODEL);
        jsonObject2.addProperty("osv", Build.VERSION.RELEASE);
        jsonObject2.addProperty(com.umeng.analytics.pro.bg.P, ((TelephonyManager) f.a.getSystemService(PlaceFields.PHONE)).getNetworkOperatorName());
        jsonObject2.addProperty("lmt", Integer.valueOf(f.c.j() ? 1 : 0));
        jsonObject2.addProperty(com.umeng.analytics.pro.bg.x, com.vungle.publisher.env.w.b);
        jsonObject2.addProperty("ifa", f.c.a() != null ? f.c.a() : f.c.d());
        jsonObject2.addProperty(com.umeng.analytics.pro.as.d, f.c.o());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) f.a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        jsonObject2.addProperty("w", Integer.valueOf(displayMetrics.widthPixels));
        jsonObject2.addProperty(com.umeng.analytics.pro.bg.aG, Integer.valueOf(displayMetrics.heightPixels));
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.add("vungle", new JsonObject());
        jsonObject2.add("ext", jsonObject3);
        f.p = jsonObject;
        f.o = jsonObject2;
        if (zj.c(f.a)) {
            f.r = f.c.u();
        }
    }

    public static Observable<JsonObject> a(String str, Collection<String> collection) {
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("device", f.d());
            jsonObject.add("app", f.p);
            JsonObject jsonObject2 = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            for (String str2 : collection) {
                jsonArray.add(str2);
            }
            jsonObject2.add("placements", jsonArray);
            jsonObject.add("request", jsonObject2);
            return f.h.a(g, str, jsonObject).subscribeOn(Schedulers.io()).doOnNext(qx.a());
        } catch (IllegalStateException e) {
            return Observable.error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(JsonObject jsonObject) {
        Log.d("VungleApiClient", "Config Response: " + jsonObject);
        JsonObject asJsonObject = jsonObject.getAsJsonObject("endpoints");
        HttpUrl parse = HttpUrl.parse(asJsonObject.get("new").getAsString());
        HttpUrl parse2 = HttpUrl.parse(asJsonObject.get("ads").getAsString());
        HttpUrl parse3 = HttpUrl.parse(asJsonObject.get("will_play_ad").getAsString());
        HttpUrl parse4 = HttpUrl.parse(asJsonObject.get("report_ad").getAsString());
        HttpUrl parse5 = HttpUrl.parse(asJsonObject.get("log").getAsString());
        f.j = parse.toString();
        f.k = parse2.toString();
        f.m = parse3.toString();
        f.l = parse4.toString();
        f.n = parse5.toString();
        JsonObject asJsonObject2 = jsonObject.getAsJsonObject("will_play_ad");
        f.q = asJsonObject2.get("request_timeout").getAsInt();
    }

    public static Observable<JsonObject> b() {
        if (f.j == null) {
            return Observable.error(new IllegalStateException("API Client not configured yet! Must call /config first."));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("app_id", f.b.b());
        if (f.c.a() != null) {
            hashMap.put("ifa", f.c.a());
        }
        return f.h.a(g, f.j, hashMap);
    }

    public static Observable<String> a(String str) {
        if (f.k == null) {
            return Observable.error(new IllegalStateException("API Client not configured yet! Must call /config first."));
        }
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("device", f.d());
            jsonObject.add("app", f.p);
            JsonObject jsonObject2 = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(str);
            jsonObject2.add("placements", jsonArray);
            jsonObject.add("request", jsonObject2);
            return f.h.b(g, f.k, jsonObject).map(qy.a());
        } catch (IllegalStateException e) {
            return Observable.error(e);
        }
    }

    /* renamed from: com.vungle.publisher.qw$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static class AnonymousClass1 implements Callback<ResponseBody> {
        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseBody> call, Throwable th) {
            Log.e(Logger.VUNGLE_TAG, "Failed to call URL " + call.request().url());
        }
    }

    public static Observable<JsonObject> a(String str, boolean z, String str2) {
        if (f.m == null) {
            return Observable.error(new IllegalStateException("API Client not configured yet! Must call /config first."));
        }
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("device", f.d());
            jsonObject.add("app", f.p);
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("reference_id", str);
            jsonObject3.addProperty("is_auto_cached", Boolean.valueOf(z));
            jsonObject2.add("placement", jsonObject3);
            jsonObject2.addProperty("ad_token", str2);
            jsonObject.add("request", jsonObject2);
            return f.h.c(g, f.m, jsonObject).subscribeOn(Schedulers.io()).timeout(f.q, TimeUnit.MILLISECONDS);
        } catch (IllegalStateException e) {
            return Observable.error(e);
        }
    }

    public static Observable<JsonObject> c() {
        return Observable.just(null);
    }

    public static Observable<JsonObject> a(JsonObject jsonObject) {
        if (f.l == null) {
            return Observable.error(new IllegalStateException("API Client not configured yet! Must call /config first."));
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("device", f.d());
        jsonObject2.add("app", f.p);
        jsonObject2.add("request", jsonObject);
        return f.h.d(g, f.l, jsonObject2).subscribeOn(Schedulers.io());
    }

    public static Observable<JsonObject> a(cz czVar) {
        cy[] y;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("placement_reference_id", czVar.r());
        jsonObject.addProperty("ad_token", czVar.i().l());
        jsonObject.addProperty("app_id", czVar.v());
        jsonObject.addProperty("incentivized", Integer.valueOf(czVar.m() ? 1 : 0));
        if (czVar.m()) {
            jsonObject.addProperty(com.umeng.analytics.pro.as.m, czVar.n());
        }
        jsonObject.addProperty("adStartTime", czVar.u());
        jsonObject.addProperty("url", czVar.i().h());
        jsonObject.addProperty("adDuration", Integer.valueOf(czVar.t()));
        if (czVar instanceof ki) {
            jsonObject.addProperty("ttDownload", Integer.valueOf(((ki) czVar).F()));
        } else if (czVar instanceof fg) {
            jsonObject.addProperty("ttDownload", Integer.valueOf(((fg) czVar).F()));
        } else {
            jsonObject.addProperty("ttDownload", (Number) (-1));
        }
        jsonObject.addProperty("campaign", czVar.i().n());
        jsonObject.addProperty(VungleAdActivity.AD_TYPE_EXTRA_KEY, czVar.i().a_().toString());
        jsonObject.addProperty("templateId", czVar.i().i());
        if (czVar.w() > 0) {
            jsonObject.addProperty("ordinal_view", Integer.valueOf(czVar.w()));
        }
        JsonArray jsonArray = new JsonArray();
        JsonArray jsonArray2 = new JsonArray();
        for (cy cyVar : czVar.y()) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty(AnalyticsConfig.RTD_START_TIME, czVar.u());
            jsonObject2.addProperty("videoLength", czVar.s());
            jsonObject2.addProperty("videoViewed", Integer.valueOf(czVar.t()));
            JsonArray jsonArray3 = new JsonArray();
            da[] e = cyVar.e();
            for (da daVar : e) {
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty(NativeProtocol.WEB_DIALOG_ACTION, String.valueOf(daVar.a()));
                jsonObject3.addProperty("timestamp_millis", Long.valueOf(daVar.e()));
                jsonObject3.addProperty("value", daVar.i());
                jsonArray3.add(jsonObject3);
                jsonArray2.add(String.valueOf(daVar.a()));
            }
            jsonObject2.add("userActions", jsonArray3);
            jsonArray.add(jsonObject2);
        }
        jsonObject.add("plays", jsonArray);
        jsonObject.add("clickedThrough", jsonArray2);
        JsonArray jsonArray4 = new JsonArray();
        for (co coVar : czVar.e()) {
            jsonArray4.add(coVar.toString());
        }
        jsonObject.add("errors", jsonArray4);
        return a(jsonObject);
    }

    public static Observable<JsonObject> b(JsonObject jsonObject) {
        return f.n == null ? Observable.error(new IllegalStateException("API Client not configured yet! Must call /config first.")) : f.i.e(g, f.n, jsonObject).subscribeOn(Schedulers.io());
    }

    private JsonObject d() {
        String str;
        String str2;
        String str3;
        if (this.a == null) {
            throw new IllegalStateException("Context is null, SDK not initialized");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("gaid", this.c.a());
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra > 0 && intExtra2 > 0) {
            jsonObject.addProperty("battery_level", Float.valueOf(intExtra / intExtra2));
        }
        int intExtra3 = registerReceiver.getIntExtra("status", -1);
        if (intExtra3 == -1) {
            str = "UNKNOWN";
        } else if (intExtra3 == 2 || intExtra3 == 5) {
            switch (registerReceiver.getIntExtra("plugged", -1)) {
                case 1:
                    str = "BATTERY_PLUGGED_AC";
                    break;
                case 2:
                    str = "BATTERY_PLUGGED_USB";
                    break;
                case 3:
                default:
                    str = "BATTERY_PLUGGED_OTHERS";
                    break;
                case 4:
                    str = "BATTERY_PLUGGED_WIRELESS";
                    break;
            }
        } else {
            str = "NOT_CHARGING";
        }
        jsonObject.addProperty("battery_state", str);
        if (Build.VERSION.SDK_INT >= 21) {
            jsonObject.addProperty("battery_saver_enabled", Integer.valueOf(((PowerManager) this.a.getSystemService("power")).isPowerSaveMode() ? 1 : 0));
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            switch (activeNetworkInfo.getType()) {
                case 0:
                    str3 = "MOBILE";
                    break;
                case 1:
                case 6:
                    str3 = "WIFI";
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                default:
                    str3 = "UNKNOWN";
                    break;
                case 7:
                    str3 = "BLUETOOTH";
                    break;
                case 9:
                    str3 = "ETHERNET";
                    break;
            }
            jsonObject.addProperty("connection_type", str3);
        }
        jsonObject.addProperty("connection_type_detail", "WIFI");
        if (Build.VERSION.SDK_INT >= 24) {
            if (connectivityManager.isActiveNetworkMetered()) {
                switch (connectivityManager.getRestrictBackgroundStatus()) {
                    case 1:
                        str2 = "DISABLED";
                        break;
                    case 2:
                        str2 = "WHITELISTED";
                        break;
                    case 3:
                        str2 = "ENABLED";
                        break;
                    default:
                        str2 = "UNKNOWN";
                        break;
                }
                jsonObject.addProperty("data_saver_status", str2);
                jsonObject.addProperty("network_metered", (Number) 1);
            } else {
                jsonObject.addProperty("data_saver_status", "NOT_APPLICABLE");
                jsonObject.addProperty("network_metered", (Number) 0);
            }
        }
        jsonObject.addProperty("locale", Locale.getDefault().toString());
        jsonObject.addProperty(com.umeng.analytics.pro.bg.N, Locale.getDefault().getLanguage());
        jsonObject.addProperty("time_zone", TimeZone.getDefault().getID());
        jsonObject.addProperty("volume_level", f.c.k());
        jsonObject.addProperty("sound_enabled", Integer.valueOf(f.c.k().floatValue() > 0.0f ? 1 : 0));
        jsonObject.addProperty("sd_card_available", Integer.valueOf(f.c.l() ? 1 : 0));
        jsonObject.addProperty("os_name", f.c.q());
        jsonObject.addProperty("storage_bytes_available", this.c.p());
        jsonObject.addProperty("vduid", "");
        jsonObject.addProperty("os_api_level", Integer.valueOf(f.c.r()));
        jsonObject.addProperty("is_tv", Boolean.valueOf(f.c.t()));
        jsonObject.addProperty("is_sideload_enabled", Boolean.valueOf(f.c.s()));
        jsonObject.addProperty("android_id", f.c.d());
        if (f.r != null) {
            jsonObject.add(PlaceFields.LOCATION, f.r);
        }
        this.o.getAsJsonObject("ext").getAsJsonObject("vungle").add(com.vungle.publisher.env.w.b, jsonObject);
        return this.o;
    }

    /* loaded from: classes4.dex */
    private final class a implements Interceptor {
        private a() {
        }

        /* synthetic */ a(qw qwVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // okhttp3.Interceptor
        public okhttp3.Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            if (request.body() == null || request.header("Content-Encoding") != null) {
                return chain.proceed(request);
            }
            return chain.proceed(request.newBuilder().header("Content-Encoding", "gzip").method(request.method(), a(request.body())).build());
        }

        private RequestBody a(final RequestBody requestBody) {
            return new RequestBody() { // from class: com.vungle.publisher.qw.a.1
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return requestBody.contentType();
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) {
                    BufferedSink buffer = Okio.buffer(new GzipSink(bufferedSink));
                    requestBody.writeTo(buffer);
                    buffer.close();
                }
            };
        }
    }
}
