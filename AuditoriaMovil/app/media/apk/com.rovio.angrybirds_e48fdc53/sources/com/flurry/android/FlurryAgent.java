package com.flurry.android;

import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.flurry.sdk.hs;
import com.flurry.sdk.ji;
import com.flurry.sdk.jj;
import com.flurry.sdk.jm;
import com.flurry.sdk.jz;
import com.flurry.sdk.ka;
import com.flurry.sdk.kb;
import com.flurry.sdk.kc;
import com.flurry.sdk.kj;
import com.flurry.sdk.kk;
import com.flurry.sdk.ko;
import com.flurry.sdk.ln;
import com.flurry.sdk.lo;
import com.flurry.sdk.lr;
import com.flurry.sdk.ma;
import com.flurry.sdk.mh;
import com.rovio.rcs.payment.google.Consts;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class FlurryAgent {
    private static final String a = FlurryAgent.class.getSimpleName();
    private static FlurryAgentListener b = null;
    private static final kj<ln> c = new kj<ln>() { // from class: com.flurry.android.FlurryAgent.1
        @Override // com.flurry.sdk.kj
        public final /* synthetic */ void a(ln lnVar) {
            final ln lnVar2 = lnVar;
            ka.a().a(new Runnable() { // from class: com.flurry.android.FlurryAgent.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (AnonymousClass3.a[lnVar2.c - 1]) {
                        case 1:
                            if (FlurryAgent.b != null) {
                                FlurryAgent.b.onSessionStarted();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            });
        }
    };
    private static boolean d = false;
    private static int e = 5;
    private static long f = 10000;
    private static boolean g = true;
    private static boolean h = false;
    private static String i = null;

    /* renamed from: com.flurry.android.FlurryAgent$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[ln.a.a().length];

        static {
            try {
                a[ln.a.b - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    private FlurryAgent() {
    }

    @Deprecated
    public static void setFlurryAgentListener(FlurryAgentListener flurryAgentListener) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (flurryAgentListener == null) {
            ko.b(a, "Listener cannot be null");
            kk.a().b("com.flurry.android.sdk.FlurrySessionEvent", c);
        } else {
            b = flurryAgentListener;
            kk.a().a("com.flurry.android.sdk.FlurrySessionEvent", c);
        }
    }

    @Deprecated
    public static void setLogEnabled(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (z) {
            ko.b();
        } else {
            ko.a();
        }
    }

    @Deprecated
    public static void setLogLevel(int i2) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else {
            ko.a(i2);
        }
    }

    @Deprecated
    public static void setContinueSessionMillis(long j) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (j < PushUIConfig.dismissTime) {
            ko.b(a, "Invalid time set for session resumption: " + j);
        } else {
            lr.a().a("ContinueSessionMillis", Long.valueOf(j));
        }
    }

    @Deprecated
    public static void setCaptureUncaughtExceptions(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else {
            lr.a().a("CaptureUncaughtExceptions", Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void setPulseEnabled(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return;
        }
        lr.a().a("ProtonEnabled", Boolean.valueOf(z));
        if (!z) {
            lr.a().a("analyticsEnabled", (Object) true);
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        synchronized (FlurryAgent.class) {
            if (Build.VERSION.SDK_INT < 10) {
                ko.b(a, "Device SDK Version older than 10");
            } else if (context == null) {
                throw new NullPointerException("Null context");
            } else {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("API key not specified");
                }
                if (ka.a() != null) {
                    ko.e(a, "Flurry is already initialized");
                }
                mh.a();
                ka.a(context, str);
            }
        }
    }

    public static int getAgentVersion() {
        return kb.b();
    }

    public static String getReleaseVersion() {
        return kb.a();
    }

    public static void setVersionName(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (str == null) {
            ko.b(a, "String versionName passed to setVersionName was null.");
        } else {
            lr.a().a("VersionName", str);
        }
    }

    public static void setReportLocation(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else {
            lr.a().a("ReportLocation", Boolean.valueOf(z));
        }
    }

    public static void setLocation(float f2, float f3) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return;
        }
        Location location = new Location("Explicit");
        location.setLatitude(f2);
        location.setLongitude(f3);
        lr.a().a("ExplicitLocation", location);
    }

    public static void clearLocation() {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else {
            lr.a().a("ExplicitLocation", (Object) null);
        }
    }

    public static void setLogEvents(boolean z) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else {
            lr.a().a("LogEvents", Boolean.valueOf(z));
        }
    }

    public static void addOrigin(String str, String str2) {
        addOrigin(str, str2, null);
    }

    public static void addOrigin(String str, String str2, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("originName not specified");
        } else {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("originVersion not specified");
            }
            try {
                kc.a().a(str, str2, map);
            } catch (Throwable th) {
                ko.a(a, "", th);
            }
        }
    }

    @Deprecated
    public static void onStartSession(Context context, String str) {
        onStartSession(context);
    }

    public static void onStartSession(Context context) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (context == null) {
            throw new NullPointerException("Null context");
        } else {
            if (ka.a() == null) {
                throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
            }
            try {
                lo.a().b(context);
            } catch (Throwable th) {
                ko.a(a, "", th);
            }
        }
    }

    public static void onEndSession(Context context) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (context == null) {
            throw new NullPointerException("Null context");
        } else {
            if (ka.a() == null) {
                throw new IllegalStateException("Flurry SDK must be initialized before ending a session");
            }
            try {
                lo.a().c(context);
            } catch (Throwable th) {
                ko.a(a, "", th);
            }
        }
    }

    public static boolean isSessionActive() {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return false;
        }
        try {
            return lo.a().c();
        } catch (Throwable th) {
            ko.a(a, "", th);
            return false;
        }
    }

    public static String getSessionId() {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return null;
        } else if (ka.a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        } else {
            try {
                jm.a();
                return jm.b();
            } catch (Throwable th) {
                ko.a(a, "", th);
                return null;
            }
        }
    }

    public static FlurryEventRecordStatus logEvent(String str) {
        FlurryEventRecordStatus flurryEventRecordStatus;
        FlurryEventRecordStatus flurryEventRecordStatus2 = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return flurryEventRecordStatus2;
        } else if (str == null) {
            ko.b(a, "String eventId passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else {
            try {
                hs.a();
                jj b2 = hs.b();
                flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
                if (b2 != null) {
                    flurryEventRecordStatus = b2.a(str, (Map<String, String>) null, false, 0);
                }
            } catch (Throwable th) {
                ko.a(a, "Failed to log event: " + str, th);
                flurryEventRecordStatus = flurryEventRecordStatus2;
            }
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String str, Map<String, String> map) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return flurryEventRecordStatus;
        } else if (str == null) {
            ko.b(a, "String eventId passed to logEvent was null.");
            return flurryEventRecordStatus;
        } else if (map == null) {
            ko.b(a, "String parameters passed to logEvent was null.");
            return flurryEventRecordStatus;
        } else {
            try {
                hs.a();
                return hs.a(str, map, 0);
            } catch (Throwable th) {
                ko.a(a, "Failed to log event: " + str, th);
                return flurryEventRecordStatus;
            }
        }
    }

    public static FlurryEventRecordStatus logEvent(FlurrySyndicationEventName flurrySyndicationEventName, String str, Map<String, String> map) {
        FlurryEventRecordStatus flurryEventRecordStatus;
        FlurryEventRecordStatus flurryEventRecordStatus2 = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return flurryEventRecordStatus2;
        } else if (flurrySyndicationEventName == null) {
            ko.b(a, "String eventName passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else if (TextUtils.isEmpty(str)) {
            ko.b(a, "String syndicationId passed to logEvent was null or empty.");
            return flurryEventRecordStatus2;
        } else if (map == null) {
            ko.b(a, "String parameters passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else {
            try {
                hs.a();
                String flurrySyndicationEventName2 = flurrySyndicationEventName.toString();
                jj b2 = hs.b();
                flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
                if (b2 != null) {
                    flurryEventRecordStatus = b2.a(flurrySyndicationEventName2, str, map);
                }
            } catch (Throwable th) {
                ko.a(a, "Failed to log event: " + flurrySyndicationEventName.toString(), th);
                flurryEventRecordStatus = flurryEventRecordStatus2;
            }
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String str, boolean z) {
        FlurryEventRecordStatus flurryEventRecordStatus;
        FlurryEventRecordStatus flurryEventRecordStatus2 = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return flurryEventRecordStatus2;
        } else if (str == null) {
            ko.b(a, "String eventId passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else {
            try {
                hs.a();
                jj b2 = hs.b();
                flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
                if (b2 != null) {
                    flurryEventRecordStatus = b2.a(str, (Map<String, String>) null, z, 0);
                }
            } catch (Throwable th) {
                ko.a(a, "Failed to log event: " + str, th);
                flurryEventRecordStatus = flurryEventRecordStatus2;
            }
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String str, Map<String, String> map, boolean z) {
        FlurryEventRecordStatus flurryEventRecordStatus;
        FlurryEventRecordStatus flurryEventRecordStatus2 = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return flurryEventRecordStatus2;
        } else if (str == null) {
            ko.b(a, "String eventId passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else if (map == null) {
            ko.b(a, "String parameters passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else {
            try {
                hs.a();
                jj b2 = hs.b();
                flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
                if (b2 != null) {
                    flurryEventRecordStatus = b2.a(str, map, z, 0);
                }
            } catch (Throwable th) {
                ko.a(a, "Failed to log event: " + str, th);
                flurryEventRecordStatus = flurryEventRecordStatus2;
            }
            return flurryEventRecordStatus;
        }
    }

    public static void logPayment(int i2, Intent intent, final Map<String, String> map) {
        int longValue;
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return;
        }
        Object obj = intent.getExtras().get(Consts.RESPONSE_CODE);
        if (obj == null) {
            ko.b(a, "Intent with no response code, assuming OK (known issue)");
            longValue = 0;
        } else if (obj instanceof Integer) {
            longValue = ((Integer) obj).intValue();
        } else {
            longValue = obj instanceof Long ? (int) ((Long) obj).longValue() : 0;
        }
        final String stringExtra = intent.getStringExtra(Consts.RESPONSE_INAPP_PURCHASE_DATA);
        final String stringExtra2 = intent.getStringExtra(Consts.RESPONSE_INAPP_SIGNATURE);
        try {
            final JSONObject jSONObject = new JSONObject(stringExtra);
            if (i2 == -1 && longValue == 0) {
                ji.a(ka.a().a, jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), new ji.a() { // from class: com.flurry.android.FlurryAgent.2
                    @Override // com.flurry.sdk.ji.a
                    public final void a(int i3, ji.c cVar) {
                        if (cVar != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("fl.Quantity", "1");
                            hashMap.put("fl.ProductId", jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
                            hashMap.put("fl.Price", String.format(Locale.ENGLISH, "%1$.2f", Double.valueOf(cVar.b / 1000000.0d)));
                            hashMap.put("fl.Currency", cVar.c);
                            hashMap.put("fl.ProductName", cVar.d);
                            hashMap.put("fl.ProductType", cVar.a);
                            hashMap.put("fl.TransactionIdentifier", jSONObject.optString("orderId"));
                            hashMap.put("fl.OrderJSON", stringExtra);
                            hashMap.put("fl.OrderJSONSignature", stringExtra2);
                            int size = map.size();
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    if (!hashMap.containsKey(entry.getKey())) {
                                        hashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            }
                            hs.a();
                            hs.a("Flurry.purchase", hashMap, size);
                            return;
                        }
                        ko.b(FlurryAgent.a, "Failed to load SKU Details from Google for '" + jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID) + "'. Result: " + i3);
                    }
                });
            } else {
                ko.b(a, "Invalid logPayment call. resultCode:" + i2 + ", responseCode:" + longValue + ", purchaseData:" + stringExtra + ", dataSignature:" + stringExtra2);
            }
        } catch (Throwable th) {
            ko.a(a, "Failed to log event: Flurry.purchase", th);
        }
    }

    public static FlurryEventRecordStatus logPayment(String str, String str2, int i2, double d2, String str3, String str4, Map<String, String> map) {
        FlurryEventRecordStatus flurryEventRecordStatus;
        FlurryEventRecordStatus flurryEventRecordStatus2 = FlurryEventRecordStatus.kFlurryEventFailed;
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return flurryEventRecordStatus2;
        } else if (str == null) {
            ko.b(a, "String productName passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else if (str2 == null) {
            ko.b(a, "String productId passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else if (str3 == null) {
            ko.b(a, "String currency passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else if (str4 == null) {
            ko.b(a, "String transactionId passed to logEvent was null.");
            return flurryEventRecordStatus2;
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("fl.ProductName", str);
                hashMap.put("fl.ProductID", str2);
                hashMap.put("fl.Quantity", String.valueOf(i2));
                hashMap.put("fl.Price", String.format(Locale.ENGLISH, "%1$.2f", Double.valueOf(d2)));
                hashMap.put("fl.Currency", str3);
                hashMap.put("fl.TransactionIdentifier", str4);
                int size = hashMap.size();
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!hashMap.containsKey(entry.getKey())) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                hs.a();
                flurryEventRecordStatus = hs.a("Flurry.purchase", hashMap, size);
            } catch (Throwable th) {
                ko.a(a, "Failed to log event: Flurry.purchase", th);
                flurryEventRecordStatus = flurryEventRecordStatus2;
            }
            return flurryEventRecordStatus;
        }
    }

    public static void endTimedEvent(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (str == null) {
            ko.b(a, "String eventId passed to endTimedEvent was null.");
        } else {
            try {
                hs.a();
                jj b2 = hs.b();
                if (b2 == null) {
                    return;
                }
                b2.a(str, (Map<String, String>) null);
            } catch (Throwable th) {
                ko.a(a, "Failed to signify the end of event: " + str, th);
            }
        }
    }

    public static void endTimedEvent(String str, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (str == null) {
            ko.b(a, "String eventId passed to endTimedEvent was null.");
        } else if (map == null) {
            ko.b(a, "String eventId passed to endTimedEvent was null.");
        } else {
            try {
                hs.a();
                jj b2 = hs.b();
                if (b2 == null) {
                    return;
                }
                b2.a(str, map);
            } catch (Throwable th) {
                ko.a(a, "Failed to signify the end of event: " + str, th);
            }
        }
    }

    @Deprecated
    public static void onError(String str, String str2, String str3) {
        StackTraceElement[] stackTraceElementArr;
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (str == null) {
            ko.b(a, "String errorId passed to onError was null.");
        } else if (str2 == null) {
            ko.b(a, "String message passed to onError was null.");
        } else if (str3 == null) {
            ko.b(a, "String errorClass passed to onError was null.");
        } else {
            try {
                hs.a();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                if (stackTrace == null || stackTrace.length <= 2) {
                    stackTraceElementArr = stackTrace;
                } else {
                    stackTraceElementArr = new StackTraceElement[stackTrace.length - 2];
                    System.arraycopy(stackTrace, 2, stackTraceElementArr, 0, stackTraceElementArr.length);
                }
                Throwable th = new Throwable(str2);
                th.setStackTrace(stackTraceElementArr);
                jj b2 = hs.b();
                if (b2 == null) {
                    return;
                }
                b2.a(str, str2, str3, th);
            } catch (Throwable th2) {
                ko.a(a, "", th2);
            }
        }
    }

    public static void onError(String str, String str2, Throwable th) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (str == null) {
            ko.b(a, "String errorId passed to onError was null.");
        } else if (str2 == null) {
            ko.b(a, "String message passed to onError was null.");
        } else if (th == null) {
            ko.b(a, "Throwable passed to onError was null.");
        } else {
            try {
                hs.a();
                hs.a(str, str2, th);
            } catch (Throwable th2) {
                ko.a(a, "", th2);
            }
        }
    }

    @Deprecated
    public static void onEvent(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (str == null) {
            ko.b(a, "String eventId passed to onEvent was null.");
        } else {
            try {
                hs.a();
                jj b2 = hs.b();
                if (b2 == null) {
                    return;
                }
                b2.a(str, (Map<String, String>) null, false, 0);
            } catch (Throwable th) {
                ko.a(a, "", th);
            }
        }
    }

    @Deprecated
    public static void onEvent(String str, Map<String, String> map) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (str == null) {
            ko.b(a, "String eventId passed to onEvent was null.");
        } else if (map == null) {
            ko.b(a, "Parameters Map passed to onEvent was null.");
        } else {
            try {
                hs.a();
                jj b2 = hs.b();
                if (b2 == null) {
                    return;
                }
                b2.a(str, map, false, 0);
            } catch (Throwable th) {
                ko.a(a, "", th);
            }
        }
    }

    public static void onPageView() {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return;
        }
        try {
            hs.a();
            jj b2 = hs.b();
            if (b2 == null) {
                return;
            }
            b2.d();
        } catch (Throwable th) {
            ko.a(a, "", th);
        }
    }

    @Deprecated
    public static void setLocationCriteria(Criteria criteria) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        }
    }

    public static void setAge(int i2) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (i2 > 0 && i2 < 110) {
            lr.a().a("Age", Long.valueOf(new Date(new Date(System.currentTimeMillis() - (i2 * 31449600000L)).getYear(), 1, 1).getTime()));
        }
    }

    public static void setGender(byte b2) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
            return;
        }
        switch (b2) {
            case 0:
            case 1:
                lr.a().a("Gender", Byte.valueOf(b2));
                return;
            default:
                lr.a().a("Gender", (Object) (byte) -1);
                return;
        }
    }

    public static void setUserId(String str) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (str == null) {
            ko.b(a, "String userId passed to setUserId was null.");
        } else {
            lr.a().a("UserId", ma.b(str));
        }
    }

    public static void setSessionOrigin(String str, String str2) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (TextUtils.isEmpty(str)) {
            ko.b(a, "String originName passed to setSessionOrigin was null or empty.");
        } else if (ka.a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        } else {
            jm.a();
            jz c2 = jm.c();
            if (c2 != null) {
                c2.a(str);
            }
            jm.a();
            jz c3 = jm.c();
            if (c3 == null) {
                return;
            }
            c3.b(str2);
        }
    }

    public static void addSessionProperty(String str, String str2) {
        if (Build.VERSION.SDK_INT < 10) {
            ko.b(a, "Device SDK Version older than 10");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ko.b(a, "String name or value passed to addSessionProperty was null or empty.");
        } else if (ka.a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        } else {
            jm.a();
            jz c2 = jm.c();
            if (c2 == null) {
                return;
            }
            c2.a(str, str2);
        }
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private static FlurryAgentListener a = null;
        private boolean b = false;
        private int c = 5;
        private long d = 10000;
        private boolean e = true;
        private boolean f = false;

        public Builder withListener(FlurryAgentListener flurryAgentListener) {
            a = flurryAgentListener;
            return this;
        }

        public Builder withLogEnabled(boolean z) {
            this.b = z;
            return this;
        }

        public Builder withLogLevel(int i) {
            this.c = i;
            return this;
        }

        public Builder withContinueSessionMillis(long j) {
            this.d = j;
            return this;
        }

        public Builder withCaptureUncaughtExceptions(boolean z) {
            this.e = z;
            return this;
        }

        public Builder withPulseEnabled(boolean z) {
            this.f = z;
            return this;
        }

        public void build(Context context, String str) {
            FlurryAgent.a(a, this.b, this.c, this.d, this.e, this.f, context, str);
        }
    }

    static /* synthetic */ void a(FlurryAgentListener flurryAgentListener, boolean z, int i2, long j, boolean z2, boolean z3, Context context, String str) {
        b = flurryAgentListener;
        setFlurryAgentListener(flurryAgentListener);
        d = z;
        setLogEnabled(z);
        e = i2;
        setLogLevel(i2);
        f = j;
        setContinueSessionMillis(j);
        g = z2;
        setCaptureUncaughtExceptions(z2);
        h = z3;
        setPulseEnabled(z3);
        i = str;
        init(context, i);
    }
}
