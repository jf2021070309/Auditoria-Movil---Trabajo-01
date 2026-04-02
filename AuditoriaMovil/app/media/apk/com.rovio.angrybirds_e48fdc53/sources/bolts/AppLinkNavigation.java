package bolts;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import bolts.AppLink;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.applinks.AppLinkData;
import com.facebook.internal.AnalyticsEvents;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AppLinkNavigation {
    private static AppLinkResolver a;
    private final AppLink b;
    private final Bundle c;
    private final Bundle d;

    /* loaded from: classes2.dex */
    public enum NavigationResult {
        FAILED("failed", false),
        WEB(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB, true),
        APP("app", true);
        
        private String a;
        private boolean b;

        public String getCode() {
            return this.a;
        }

        public boolean isSucceeded() {
            return this.b;
        }

        NavigationResult(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }

    public AppLinkNavigation(AppLink appLink, Bundle bundle, Bundle bundle2) {
        if (appLink == null) {
            throw new IllegalArgumentException("appLink must not be null.");
        }
        bundle = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.b = appLink;
        this.c = bundle;
        this.d = bundle2;
    }

    public AppLink getAppLink() {
        return this.b;
    }

    public Bundle getAppLinkData() {
        return this.d;
    }

    public Bundle getExtras() {
        return this.c;
    }

    private Bundle a(Context context) {
        String string;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        if (context != null) {
            String packageName = context.getPackageName();
            if (packageName != null) {
                bundle2.putString("package", packageName);
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null && (string = context.getString(applicationInfo.labelRes)) != null) {
                bundle2.putString("app_name", string);
            }
        }
        bundle.putAll(getAppLinkData());
        bundle.putString("target_url", getAppLink().getSourceUrl().toString());
        bundle.putString("version", "1.0");
        bundle.putString("user_agent", "Bolts Android 1.4.0");
        bundle.putBundle("referer_app_link", bundle2);
        bundle.putBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY, getExtras());
        return bundle;
    }

    private Object a(Object obj) {
        int i = 0;
        if (obj instanceof Bundle) {
            return a((Bundle) obj);
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj2 : (List) obj) {
                jSONArray.put(a(obj2));
            }
            return jSONArray;
        } else if (obj instanceof SparseArray) {
            JSONArray jSONArray2 = new JSONArray();
            SparseArray sparseArray = (SparseArray) obj;
            while (i < sparseArray.size()) {
                jSONArray2.put(sparseArray.keyAt(i), a(sparseArray.valueAt(i)));
                i++;
            }
            return jSONArray2;
        } else if (obj instanceof Character) {
            return obj.toString();
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Number) {
                    if ((obj instanceof Double) || (obj instanceof Float)) {
                        return Double.valueOf(((Number) obj).doubleValue());
                    }
                    return Long.valueOf(((Number) obj).longValue());
                } else if (obj instanceof boolean[]) {
                    JSONArray jSONArray3 = new JSONArray();
                    boolean[] zArr = (boolean[]) obj;
                    int length = zArr.length;
                    while (i < length) {
                        jSONArray3.put(a(Boolean.valueOf(zArr[i])));
                        i++;
                    }
                    return jSONArray3;
                } else if (obj instanceof char[]) {
                    JSONArray jSONArray4 = new JSONArray();
                    char[] cArr = (char[]) obj;
                    int length2 = cArr.length;
                    while (i < length2) {
                        jSONArray4.put(a(Character.valueOf(cArr[i])));
                        i++;
                    }
                    return jSONArray4;
                } else if (obj instanceof CharSequence[]) {
                    JSONArray jSONArray5 = new JSONArray();
                    CharSequence[] charSequenceArr = (CharSequence[]) obj;
                    int length3 = charSequenceArr.length;
                    while (i < length3) {
                        jSONArray5.put(a(charSequenceArr[i]));
                        i++;
                    }
                    return jSONArray5;
                } else if (obj instanceof double[]) {
                    JSONArray jSONArray6 = new JSONArray();
                    double[] dArr = (double[]) obj;
                    int length4 = dArr.length;
                    while (i < length4) {
                        jSONArray6.put(a(Double.valueOf(dArr[i])));
                        i++;
                    }
                    return jSONArray6;
                } else if (obj instanceof float[]) {
                    JSONArray jSONArray7 = new JSONArray();
                    float[] fArr = (float[]) obj;
                    int length5 = fArr.length;
                    while (i < length5) {
                        jSONArray7.put(a(Float.valueOf(fArr[i])));
                        i++;
                    }
                    return jSONArray7;
                } else if (obj instanceof int[]) {
                    JSONArray jSONArray8 = new JSONArray();
                    int[] iArr = (int[]) obj;
                    int length6 = iArr.length;
                    while (i < length6) {
                        jSONArray8.put(a(Integer.valueOf(iArr[i])));
                        i++;
                    }
                    return jSONArray8;
                } else if (obj instanceof long[]) {
                    JSONArray jSONArray9 = new JSONArray();
                    long[] jArr = (long[]) obj;
                    int length7 = jArr.length;
                    while (i < length7) {
                        jSONArray9.put(a(Long.valueOf(jArr[i])));
                        i++;
                    }
                    return jSONArray9;
                } else if (obj instanceof short[]) {
                    JSONArray jSONArray10 = new JSONArray();
                    short[] sArr = (short[]) obj;
                    int length8 = sArr.length;
                    while (i < length8) {
                        jSONArray10.put(a(Short.valueOf(sArr[i])));
                        i++;
                    }
                    return jSONArray10;
                } else if (obj instanceof String[]) {
                    JSONArray jSONArray11 = new JSONArray();
                    String[] strArr = (String[]) obj;
                    int length9 = strArr.length;
                    while (i < length9) {
                        jSONArray11.put(a(strArr[i]));
                        i++;
                    }
                    return jSONArray11;
                } else {
                    return null;
                }
            }
            return obj;
        }
    }

    private JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            jSONObject.put(str, a(bundle.get(str)));
        }
        return jSONObject;
    }

    public NavigationResult navigate(Context context) {
        Intent intent;
        Intent intent2;
        NavigationResult navigationResult;
        PackageManager packageManager = context.getPackageManager();
        Bundle a2 = a(context);
        Iterator<AppLink.Target> it = getAppLink().getTargets().iterator();
        while (true) {
            if (!it.hasNext()) {
                intent = null;
                break;
            }
            AppLink.Target next = it.next();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            if (next.getUrl() != null) {
                intent3.setData(next.getUrl());
            } else {
                intent3.setData(this.b.getSourceUrl());
            }
            intent3.setPackage(next.getPackageName());
            if (next.getClassName() != null) {
                intent3.setClassName(next.getPackageName(), next.getClassName());
            }
            intent3.putExtra("al_applink_data", a2);
            if (packageManager.resolveActivity(intent3, 65536) != null) {
                intent = intent3;
                break;
            }
        }
        NavigationResult navigationResult2 = NavigationResult.FAILED;
        if (intent != null) {
            intent2 = intent;
            navigationResult = NavigationResult.APP;
        } else {
            Uri webUrl = getAppLink().getWebUrl();
            if (webUrl != null) {
                try {
                    intent2 = new Intent("android.intent.action.VIEW", webUrl.buildUpon().appendQueryParameter("al_applink_data", a(a2).toString()).build());
                    navigationResult = NavigationResult.WEB;
                } catch (JSONException e) {
                    a(context, intent, NavigationResult.FAILED, e);
                    throw new RuntimeException(e);
                }
            } else {
                navigationResult = navigationResult2;
                intent2 = null;
            }
        }
        a(context, intent2, navigationResult, null);
        if (intent2 != null) {
            context.startActivity(intent2);
        }
        return navigationResult;
    }

    private void a(Context context, Intent intent, NavigationResult navigationResult, JSONException jSONException) {
        HashMap hashMap = new HashMap();
        if (jSONException != null) {
            hashMap.put("error", jSONException.getLocalizedMessage());
        }
        hashMap.put("success", navigationResult.isSucceeded() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        hashMap.put("type", navigationResult.getCode());
        MeasurementEvent.a(context, MeasurementEvent.APP_LINK_NAVIGATE_OUT_EVENT_NAME, intent, hashMap);
    }

    public static void setDefaultResolver(AppLinkResolver appLinkResolver) {
        a = appLinkResolver;
    }

    public static AppLinkResolver getDefaultResolver() {
        return a;
    }

    private static AppLinkResolver b(Context context) {
        return getDefaultResolver() != null ? getDefaultResolver() : new WebViewAppLinkResolver(context);
    }

    public static NavigationResult navigate(Context context, AppLink appLink) {
        return new AppLinkNavigation(appLink, null, null).navigate(context);
    }

    public static Task<NavigationResult> navigateInBackground(final Context context, Uri uri, AppLinkResolver appLinkResolver) {
        return appLinkResolver.getAppLinkFromUrlInBackground(uri).onSuccess(new Continuation<AppLink, NavigationResult>() { // from class: bolts.AppLinkNavigation.1
            @Override // bolts.Continuation
            /* renamed from: a */
            public NavigationResult then(Task<AppLink> task) {
                return AppLinkNavigation.navigate(context, task.getResult());
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    public static Task<NavigationResult> navigateInBackground(Context context, URL url, AppLinkResolver appLinkResolver) {
        return navigateInBackground(context, Uri.parse(url.toString()), appLinkResolver);
    }

    public static Task<NavigationResult> navigateInBackground(Context context, String str, AppLinkResolver appLinkResolver) {
        return navigateInBackground(context, Uri.parse(str), appLinkResolver);
    }

    public static Task<NavigationResult> navigateInBackground(Context context, Uri uri) {
        return navigateInBackground(context, uri, b(context));
    }

    public static Task<NavigationResult> navigateInBackground(Context context, URL url) {
        return navigateInBackground(context, url, b(context));
    }

    public static Task<NavigationResult> navigateInBackground(Context context, String str) {
        return navigateInBackground(context, str, b(context));
    }
}
