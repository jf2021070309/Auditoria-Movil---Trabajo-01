package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirelogAnalyticsEvent;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
/* loaded from: classes4.dex */
public final class zzp {
    private static final DataEncoder zza = new JsonDataEncoderBuilder().registerEncoder(FirelogAnalyticsEvent.zza.class, (ObjectEncoder) new FirelogAnalyticsEvent.zzc()).registerEncoder(FirelogAnalyticsEvent.class, (ObjectEncoder) new FirelogAnalyticsEvent.zzb()).build();

    public static void zza(Intent intent, Transport<String> transport) {
        zza("_nr", intent);
        if (transport != null) {
            try {
                transport.send(Event.ofTelemetry(zza.encode(new FirelogAnalyticsEvent.zza(new FirelogAnalyticsEvent("MESSAGE_DELIVERED", intent)))));
            } catch (EncodingException unused) {
            }
        }
    }

    public static void zzb(Intent intent) {
        zza("_nd", intent);
    }

    public static void zzc(Intent intent) {
        zza("_nf", intent);
    }

    public static boolean zzd(Intent intent) {
        if (intent == null || zzn(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static boolean zze(Intent intent) {
        if (intent != null && !zzn(intent)) {
            return zza();
        }
        return false;
    }

    public static int zzf(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                new StringBuilder(String.valueOf(obj).length() + 13);
                return 0;
            }
        }
        return 0;
    }

    public static String zzg(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    public static String zzh(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    public static String zzi(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    public static String zzj(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    public static String zzk(Intent intent) {
        if (intent.getExtras() != null && zzr.zza(intent.getExtras())) {
            return "DISPLAY_NOTIFICATION";
        }
        return "DATA_MESSAGE";
    }

    public static String zzl(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra != null && stringExtra.startsWith("/topics/")) {
            return stringExtra;
        }
        return null;
    }

    public static int zzm(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        if ("normal".equals(stringExtra)) {
            return 2;
        }
        return 0;
    }

    private static boolean zzn(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static String zzb() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    public static String zzc() {
        return FirebaseInstanceId.getInstance(FirebaseApp.getInstance()).getId();
    }

    public static String zzd() {
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (applicationId.startsWith("1:")) {
            String[] split = applicationId.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return applicationId;
    }

    public static void zza(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
                Log.isLoggable("FirebaseMessaging", 3);
                if (analyticsConnector != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    analyticsConnector.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString(FirebaseAnalytics.Param.SOURCE, "Firebase");
                    bundle.putString(FirebaseAnalytics.Param.MEDIUM, "notification");
                    bundle.putString(FirebaseAnalytics.Param.CAMPAIGN, stringExtra);
                    analyticsConnector.logEvent(AppMeasurement.FCM_ORIGIN, "_cmp", bundle);
                }
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
            }
        }
        zza("_no", intent);
    }

    public static boolean zza() {
        Context applicationContext;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.getInstance();
            applicationContext = FirebaseApp.getInstance().getApplicationContext();
            sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    private static void zza(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String zzl = zzl(intent);
        if (zzl != null) {
            bundle.putString("_nt", zzl);
        }
        String stringExtra5 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra5 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra5));
            } catch (NumberFormatException unused) {
            }
        }
        String stringExtra6 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null;
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(stringExtra6));
            } catch (NumberFormatException unused2) {
            }
        }
        String str2 = (intent.getExtras() == null || !zzr.zza(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            new StringBuilder(String.valueOf(bundle).length() + e.a(str, 37));
        }
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
        if (analyticsConnector != null) {
            analyticsConnector.logEvent(AppMeasurement.FCM_ORIGIN, str, bundle);
        }
    }

    public static void zza(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }
}
