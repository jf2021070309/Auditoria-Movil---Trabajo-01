package bolts;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class MeasurementEvent {
    public static final String APP_LINK_NAVIGATE_IN_EVENT_NAME = "al_nav_in";
    public static final String APP_LINK_NAVIGATE_OUT_EVENT_NAME = "al_nav_out";
    public static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
    public static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
    public static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
    private Context a;
    private String b;
    private Bundle c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r5, java.lang.String r6, android.content.Intent r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r7 == 0) goto L70
            android.os.Bundle r0 = bolts.AppLinks.getAppLinkData(r7)
            if (r0 == 0) goto L32
            android.os.Bundle r0 = a(r5, r6, r0, r7)
            r2 = r0
        L12:
            if (r8 == 0) goto L67
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r3 = r0.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2.putString(r0, r1)
            goto L1c
        L32:
            android.net.Uri r0 = r7.getData()
            if (r0 == 0) goto L41
            java.lang.String r2 = "intentData"
            java.lang.String r0 = r0.toString()
            r1.putString(r2, r0)
        L41:
            android.os.Bundle r2 = r7.getExtras()
            if (r2 == 0) goto L70
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r3 = r0.iterator()
        L4f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r2.get(r0)
            java.lang.String r4 = a(r4)
            r1.putString(r0, r4)
            goto L4f
        L67:
            bolts.MeasurementEvent r0 = new bolts.MeasurementEvent
            r0.<init>(r5, r6, r2)
            r0.a()
            return
        L70:
            r2 = r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.MeasurementEvent.a(android.content.Context, java.lang.String, android.content.Intent, java.util.Map):void");
    }

    private MeasurementEvent(Context context, String str, Bundle bundle) {
        this.a = context.getApplicationContext();
        this.b = str;
        this.c = bundle;
    }

    private void a() {
        if (this.b == null) {
            Log.d(getClass().getName(), "Event name is required");
        }
        try {
            Class<?> cls = Class.forName("android.support.v4.content.LocalBroadcastManager");
            Method method = cls.getMethod("getInstance", Context.class);
            Method method2 = cls.getMethod("sendBroadcast", Intent.class);
            Object invoke = method.invoke(null, this.a);
            Intent intent = new Intent(MEASUREMENT_EVENT_NOTIFICATION_NAME);
            intent.putExtra(MEASUREMENT_EVENT_NAME_KEY, this.b);
            intent.putExtra(MEASUREMENT_EVENT_ARGS_KEY, this.c);
            method2.invoke(invoke, intent);
        } catch (Exception e) {
            Log.d(getClass().getName(), "LocalBroadcastManager in android support library is required to raise bolts event.");
        }
    }

    private static Bundle a(Context context, String str, Bundle bundle, Intent intent) {
        Bundle bundle2 = new Bundle();
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity != null) {
            bundle2.putString("class", resolveActivity.getShortClassName());
        }
        if (APP_LINK_NAVIGATE_OUT_EVENT_NAME.equals(str)) {
            if (resolveActivity != null) {
                bundle2.putString("package", resolveActivity.getPackageName());
            }
            if (intent.getData() != null) {
                bundle2.putString("outputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("outputURLScheme", intent.getScheme());
            }
        } else if (APP_LINK_NAVIGATE_IN_EVENT_NAME.equals(str)) {
            if (intent.getData() != null) {
                bundle2.putString("inputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("inputURLScheme", intent.getScheme());
            }
        }
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                for (String str3 : ((Bundle) obj).keySet()) {
                    String a = a(((Bundle) obj).get(str3));
                    if (str2.equals("referer_app_link")) {
                        if (str3.equalsIgnoreCase("url")) {
                            bundle2.putString("refererURL", a);
                        } else if (str3.equalsIgnoreCase("app_name")) {
                            bundle2.putString("refererAppName", a);
                        } else if (str3.equalsIgnoreCase("package")) {
                            bundle2.putString("sourceApplication", a);
                        }
                    }
                    bundle2.putString(str2 + "/" + str3, a);
                }
            } else {
                String a2 = a(obj);
                if (str2.equals("target_url")) {
                    Uri parse = Uri.parse(a2);
                    bundle2.putString("targetURL", parse.toString());
                    bundle2.putString("targetURLHost", parse.getHost());
                } else {
                    bundle2.putString(str2, a2);
                }
            }
        }
        return bundle2;
    }

    private static String a(Object obj) {
        String str = null;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj.toString();
        }
        try {
            if (obj instanceof Collection) {
                str = new JSONArray((Collection) obj).toString();
            } else if (obj instanceof Map) {
                str = new JSONObject((Map) obj).toString();
            } else {
                str = obj.toString();
            }
            return str;
        } catch (Exception e) {
            return str;
        }
    }
}
