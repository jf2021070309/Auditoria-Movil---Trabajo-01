package com.zipoapps.premiumhelper.toto;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinEventParameters;
import e.a.d.a.a;
import e.j.d.w;
import h.m.d;
import h.o.c.f;
import h.o.c.j;
import j.h0;
import j.i;
import j.i0.c;
import j.j0.a;
import j.s;
import j.w;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import m.a0;
import m.b0;
import m.c0;
import m.i0.i;
import m.i0.k;
import m.i0.o;
import m.i0.s;
import m.i0.u;
import m.x;
/* loaded from: classes2.dex */
public final class TotoService {
    public static final TotoService INSTANCE = new TotoService();

    /* loaded from: classes2.dex */
    public static final class PostConfigParameters {
        private final String country;
        private final String deviceModel;
        private final long installTimestamp;
        private final String lang;
        private final String os;
        private final String osVersion;
        private final String userId;
        private final String versionName;

        public PostConfigParameters(long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            j.e(str, "versionName");
            j.e(str2, "userId");
            j.e(str3, "country");
            j.e(str4, "deviceModel");
            j.e(str5, "os");
            j.e(str6, "osVersion");
            j.e(str7, "lang");
            this.installTimestamp = j2;
            this.versionName = str;
            this.userId = str2;
            this.country = str3;
            this.deviceModel = str4;
            this.os = str5;
            this.osVersion = str6;
            this.lang = str7;
        }

        public /* synthetic */ PostConfigParameters(long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, f fVar) {
            this(j2, str, str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "Android" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7);
        }

        public final Map<String, String> asMap() {
            h.f[] fVarArr = {new h.f("installTimestamp", String.valueOf(this.installTimestamp)), new h.f("version", this.versionName), new h.f("userId", this.userId), new h.f("country", this.country), new h.f("deviceModel", this.deviceModel), new h.f("os", this.os), new h.f("osVersion", this.osVersion), new h.f("lang", this.lang)};
            j.e(fVarArr, "pairs");
            LinkedHashMap linkedHashMap = new LinkedHashMap(w.b0(8));
            j.e(fVarArr, "<this>");
            j.e(linkedHashMap, "destination");
            j.e(linkedHashMap, "<this>");
            j.e(fVarArr, "pairs");
            int i2 = 0;
            while (i2 < 8) {
                h.f fVar = fVarArr[i2];
                i2++;
                linkedHashMap.put(fVar.a, fVar.f8925b);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((String) entry.getValue()).length() > 0) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(w.b0(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), URLEncoder.encode((String) entry2.getValue(), "UTF-8"));
            }
            return linkedHashMap3;
        }

        public final long component1() {
            return this.installTimestamp;
        }

        public final String component2() {
            return this.versionName;
        }

        public final String component3() {
            return this.userId;
        }

        public final String component4() {
            return this.country;
        }

        public final String component5() {
            return this.deviceModel;
        }

        public final String component6() {
            return this.os;
        }

        public final String component7() {
            return this.osVersion;
        }

        public final String component8() {
            return this.lang;
        }

        public final PostConfigParameters copy(long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            j.e(str, "versionName");
            j.e(str2, "userId");
            j.e(str3, "country");
            j.e(str4, "deviceModel");
            j.e(str5, "os");
            j.e(str6, "osVersion");
            j.e(str7, "lang");
            return new PostConfigParameters(j2, str, str2, str3, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PostConfigParameters) {
                PostConfigParameters postConfigParameters = (PostConfigParameters) obj;
                return this.installTimestamp == postConfigParameters.installTimestamp && j.a(this.versionName, postConfigParameters.versionName) && j.a(this.userId, postConfigParameters.userId) && j.a(this.country, postConfigParameters.country) && j.a(this.deviceModel, postConfigParameters.deviceModel) && j.a(this.os, postConfigParameters.os) && j.a(this.osVersion, postConfigParameters.osVersion) && j.a(this.lang, postConfigParameters.lang);
            }
            return false;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getDeviceModel() {
            return this.deviceModel;
        }

        public final long getInstallTimestamp() {
            return this.installTimestamp;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getOs() {
            return this.os;
        }

        public final String getOsVersion() {
            return this.osVersion;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getVersionName() {
            return this.versionName;
        }

        public int hashCode() {
            return this.lang.hashCode() + a.x(this.osVersion, a.x(this.os, a.x(this.deviceModel, a.x(this.country, a.x(this.userId, a.x(this.versionName, e.j.d.a0.a.a(this.installTimestamp) * 31, 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder y = a.y("PostConfigParameters(installTimestamp=");
            y.append(this.installTimestamp);
            y.append(", versionName=");
            y.append(this.versionName);
            y.append(", userId=");
            y.append(this.userId);
            y.append(", country=");
            y.append(this.country);
            y.append(", deviceModel=");
            y.append(this.deviceModel);
            y.append(", os=");
            y.append(this.os);
            y.append(", osVersion=");
            y.append(this.osVersion);
            y.append(", lang=");
            y.append(this.lang);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RegisterRequest {
        private final String fcmToken;
        private final long installTimestamp;
        private final String obfuscatedUserID;
        private final String packageName;
        private final String purchaseToken;
        private final String sku;
        private final String version;

        public RegisterRequest(String str, String str2, long j2, String str3, String str4, String str5, String str6) {
            j.e(str, "packageName");
            j.e(str2, "version");
            j.e(str3, "obfuscatedUserID");
            j.e(str4, AppLovinEventParameters.PRODUCT_IDENTIFIER);
            j.e(str5, "purchaseToken");
            j.e(str6, "fcmToken");
            this.packageName = str;
            this.version = str2;
            this.installTimestamp = j2;
            this.obfuscatedUserID = str3;
            this.sku = str4;
            this.purchaseToken = str5;
            this.fcmToken = str6;
        }

        public final String component1() {
            return this.packageName;
        }

        public final String component2() {
            return this.version;
        }

        public final long component3() {
            return this.installTimestamp;
        }

        public final String component4() {
            return this.obfuscatedUserID;
        }

        public final String component5() {
            return this.sku;
        }

        public final String component6() {
            return this.purchaseToken;
        }

        public final String component7() {
            return this.fcmToken;
        }

        public final RegisterRequest copy(String str, String str2, long j2, String str3, String str4, String str5, String str6) {
            j.e(str, "packageName");
            j.e(str2, "version");
            j.e(str3, "obfuscatedUserID");
            j.e(str4, AppLovinEventParameters.PRODUCT_IDENTIFIER);
            j.e(str5, "purchaseToken");
            j.e(str6, "fcmToken");
            return new RegisterRequest(str, str2, j2, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RegisterRequest) {
                RegisterRequest registerRequest = (RegisterRequest) obj;
                return j.a(this.packageName, registerRequest.packageName) && j.a(this.version, registerRequest.version) && this.installTimestamp == registerRequest.installTimestamp && j.a(this.obfuscatedUserID, registerRequest.obfuscatedUserID) && j.a(this.sku, registerRequest.sku) && j.a(this.purchaseToken, registerRequest.purchaseToken) && j.a(this.fcmToken, registerRequest.fcmToken);
            }
            return false;
        }

        public final String getFcmToken() {
            return this.fcmToken;
        }

        public final long getInstallTimestamp() {
            return this.installTimestamp;
        }

        public final String getObfuscatedUserID() {
            return this.obfuscatedUserID;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final String getPurchaseToken() {
            return this.purchaseToken;
        }

        public final String getSku() {
            return this.sku;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            int x = a.x(this.version, this.packageName.hashCode() * 31, 31);
            return this.fcmToken.hashCode() + a.x(this.purchaseToken, a.x(this.sku, a.x(this.obfuscatedUserID, (e.j.d.a0.a.a(this.installTimestamp) + x) * 31, 31), 31), 31);
        }

        public String toString() {
            StringBuilder y = a.y("RegisterRequest(packageName=");
            y.append(this.packageName);
            y.append(", version=");
            y.append(this.version);
            y.append(", installTimestamp=");
            y.append(this.installTimestamp);
            y.append(", obfuscatedUserID=");
            y.append(this.obfuscatedUserID);
            y.append(", sku=");
            y.append(this.sku);
            y.append(", purchaseToken=");
            y.append(this.purchaseToken);
            y.append(", fcmToken=");
            y.append(this.fcmToken);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ServiceConfig {
        public static final Companion Companion = new Companion(null);
        private static final ServiceConfig Production = new ServiceConfig("https://config.toto.zipoapps.com/", "");
        private static final ServiceConfig Staging = new ServiceConfig("https://staging.config.toto.zipoapps.com/", "");
        private final String endpoint;
        private final String secret;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final ServiceConfig getProduction() {
                return ServiceConfig.Production;
            }

            public final ServiceConfig getStaging() {
                return ServiceConfig.Staging;
            }
        }

        public ServiceConfig(String str, String str2) {
            j.e(str, "endpoint");
            j.e(str2, "secret");
            this.endpoint = str;
            this.secret = str2;
        }

        public static /* synthetic */ ServiceConfig copy$default(ServiceConfig serviceConfig, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = serviceConfig.endpoint;
            }
            if ((i2 & 2) != 0) {
                str2 = serviceConfig.secret;
            }
            return serviceConfig.copy(str, str2);
        }

        public final String component1() {
            return this.endpoint;
        }

        public final String component2() {
            return this.secret;
        }

        public final ServiceConfig copy(String str, String str2) {
            j.e(str, "endpoint");
            j.e(str2, "secret");
            return new ServiceConfig(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ServiceConfig) {
                ServiceConfig serviceConfig = (ServiceConfig) obj;
                return j.a(this.endpoint, serviceConfig.endpoint) && j.a(this.secret, serviceConfig.secret);
            }
            return false;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        public final String getSecret() {
            return this.secret;
        }

        public int hashCode() {
            return this.secret.hashCode() + (this.endpoint.hashCode() * 31);
        }

        public String toString() {
            StringBuilder y = a.y("ServiceConfig(endpoint=");
            y.append(this.endpoint);
            y.append(", secret=");
            y.append(this.secret);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public interface TotoServiceApi {
        @m.i0.f("/v1/apps/{package}/config")
        Object getConfig(@s("package") String str, @i("User-Agent") String str2, d<? super a0<Map<String, Map<String, Integer>>>> dVar);

        @o("/v1/apps/{package}/config")
        Object postConfig(@s("package") String str, @i("User-Agent") String str2, @u Map<String, String> map, @m.i0.a Map<String, String> map2, d<? super a0<Void>> dVar);

        @k({"Content-Type: application/json"})
        @o("api/v1/register")
        Object register(@m.i0.a RegisterRequest registerRequest, @i("User-Agent") String str, d<? super a0<Void>> dVar);
    }

    private TotoService() {
    }

    private final w.b enableTls12OnPreLollipop(w.b bVar) {
        if (Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, null, null);
                X509TrustManager findX509TrustManager = findX509TrustManager();
                if (findX509TrustManager != null) {
                    SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                    j.d(socketFactory, "sc.socketFactory");
                    Tls12SocketFactory tls12SocketFactory = new Tls12SocketFactory(socketFactory);
                    Objects.requireNonNull(bVar);
                    bVar.f9588j = tls12SocketFactory;
                    bVar.f9589k = j.i0.j.f.a.c(findX509TrustManager);
                    i.a aVar = new i.a(j.i.f9259c);
                    aVar.e(h0.TLS_1_2);
                    j.i[] iVarArr = {new j.i(aVar), j.i.f9260d, j.i.f9261e};
                    j.e(iVarArr, "elements");
                    bVar.f9581c = c.o(new ArrayList(new h.l.a(iVarArr, true)));
                }
            } catch (Exception e2) {
                n.a.a.f9946d.d(e2, "Error while setting TLS 1.2", new Object[0]);
            }
        }
        return bVar;
    }

    private final X509TrustManager findX509TrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        j.d(trustManagers, "managers");
        if (!(trustManagers.length == 0)) {
            TrustManager trustManager = trustManagers[0];
            X509TrustManager x509TrustManager = trustManager instanceof X509TrustManager ? (X509TrustManager) trustManager : null;
            if (x509TrustManager != null) {
                return x509TrustManager;
            }
        }
        return null;
    }

    public final TotoServiceApi build(ServiceConfig serviceConfig, boolean z) {
        List<String> list;
        Method[] declaredMethods;
        j.e(serviceConfig, "config");
        w.b bVar = new w.b();
        if (z) {
            j.j0.a aVar = new j.j0.a();
            a.EnumC0211a enumC0211a = z ? a.EnumC0211a.BODY : a.EnumC0211a.NONE;
            Objects.requireNonNull(enumC0211a, "level == null. Use Level.NONE instead.");
            aVar.f9526d = enumC0211a;
            bVar.f9582d.add(aVar);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        bVar.u = c.c("timeout", 5L, timeUnit);
        bVar.v = c.c("timeout", 5L, timeUnit);
        bVar.w = c.c("timeout", 5L, timeUnit);
        INSTANCE.enableTls12OnPreLollipop(bVar);
        j.w wVar = new j.w(bVar);
        x xVar = x.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String endpoint = serviceConfig.getEndpoint();
        Objects.requireNonNull(endpoint, "baseUrl == null");
        s.a aVar2 = new s.a();
        aVar2.c(null, endpoint);
        j.s a = aVar2.a();
        if (!"".equals(a.f9541g.get(list.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + a);
        }
        arrayList.add(new m.h0.a.a(new e.d.e.j()));
        Executor b2 = xVar.b();
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.addAll(xVar.a(b2));
        ArrayList arrayList4 = new ArrayList(xVar.d() + arrayList.size() + 1);
        arrayList4.add(new m.a());
        arrayList4.addAll(arrayList);
        arrayList4.addAll(xVar.c());
        c0 c0Var = new c0(wVar, a, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3), b2, false);
        if (TotoServiceApi.class.isInterface()) {
            if (TotoServiceApi.class.getInterfaces().length <= 0) {
                if (c0Var.f9851g) {
                    x xVar2 = x.a;
                    for (Method method : TotoServiceApi.class.getDeclaredMethods()) {
                        if (!xVar2.f(method) && !Modifier.isStatic(method.getModifiers())) {
                            c0Var.b(method);
                        }
                    }
                }
                Object newProxyInstance = Proxy.newProxyInstance(TotoServiceApi.class.getClassLoader(), new Class[]{TotoServiceApi.class}, new b0(c0Var, TotoServiceApi.class));
                j.d(newProxyInstance, "retrofit.create(TotoServiceApi::class.java)");
                return (TotoServiceApi) newProxyInstance;
            }
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }
}
