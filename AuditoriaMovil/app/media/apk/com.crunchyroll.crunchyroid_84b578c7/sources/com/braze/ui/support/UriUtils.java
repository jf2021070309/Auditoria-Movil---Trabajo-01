package com.braze.ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import kotlin.Metadata;
/* compiled from: UriUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001\u001a\u0016\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\f*\u00020\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "getMainActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "Landroid/os/Bundle;", "isActivityRegisteredInManifest", "", "className", "getQueryParameters", "", "Landroid/net/Uri;", "android-sdk-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UriUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    public static final Intent getMainActivityIntent(Context context, Bundle bundle) {
        j.f(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (bundle != null && launchIntentForPackage != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v10, types: [T, android.net.Uri, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> getQueryParameters(android.net.Uri r8) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            com.amazon.aps.iva.yb0.d0 r0 = new com.amazon.aps.iva.yb0.d0
            r0.<init>()
            r0.b = r8
            java.lang.String r8 = r8.getEncodedQuery()
            if (r8 != 0) goto L26
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r2 = com.braze.ui.support.UriUtils.TAG
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.V
            r4 = 0
            com.braze.ui.support.UriUtils$getQueryParameters$1 r5 = new com.braze.ui.support.UriUtils$getQueryParameters$1
            r5.<init>(r0)
            r6 = 4
            r7 = 0
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7)
            com.amazon.aps.iva.lb0.a0 r8 = com.amazon.aps.iva.lb0.a0.b
            return r8
        L26:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            T r2 = r0.b     // Catch: java.lang.Exception -> Lb4
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Exception -> Lb4
            boolean r2 = r2.isOpaque()     // Catch: java.lang.Exception -> Lb4
            if (r2 == 0) goto L4e
            java.lang.String r2 = "://"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> Lb4
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch: java.lang.Exception -> Lb4
            android.net.Uri$Builder r8 = r2.encodedQuery(r8)     // Catch: java.lang.Exception -> Lb4
            android.net.Uri r8 = r8.build()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = "parse(\"://\")\n           …\n                .build()"
            com.amazon.aps.iva.yb0.j.e(r8, r2)     // Catch: java.lang.Exception -> Lb4
            r0.b = r8     // Catch: java.lang.Exception -> Lb4
        L4e:
            T r8 = r0.b     // Catch: java.lang.Exception -> Lb4
            android.net.Uri r8 = (android.net.Uri) r8     // Catch: java.lang.Exception -> Lb4
            java.util.Set r8 = r8.getQueryParameterNames()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = "uri.queryParameterNames"
            com.amazon.aps.iva.yb0.j.e(r8, r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> Lb4
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb4
            r2.<init>()     // Catch: java.lang.Exception -> Lb4
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> Lb4
        L66:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Exception -> Lb4
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L85
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Exception -> Lb4
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lb4
            if (r6 == 0) goto L7d
            int r6 = r6.length()     // Catch: java.lang.Exception -> Lb4
            if (r6 != 0) goto L7e
        L7d:
            r4 = r5
        L7e:
            r4 = r4 ^ r5
            if (r4 == 0) goto L66
            r2.add(r3)     // Catch: java.lang.Exception -> Lb4
            goto L66
        L85:
            java.util.Iterator r8 = r2.iterator()     // Catch: java.lang.Exception -> Lb4
        L89:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Exception -> Lb4
            if (r2 == 0) goto Lc3
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lb4
            T r3 = r0.b     // Catch: java.lang.Exception -> Lb4
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Exception -> Lb4
            java.lang.String r3 = r3.getQueryParameter(r2)     // Catch: java.lang.Exception -> Lb4
            if (r3 == 0) goto La8
            int r6 = r3.length()     // Catch: java.lang.Exception -> Lb4
            if (r6 != 0) goto La6
            goto La8
        La6:
            r6 = r4
            goto La9
        La8:
            r6 = r5
        La9:
            if (r6 != 0) goto L89
            java.lang.String r6 = "queryParameterKey"
            com.amazon.aps.iva.yb0.j.e(r2, r6)     // Catch: java.lang.Exception -> Lb4
            r1.put(r2, r3)     // Catch: java.lang.Exception -> Lb4
            goto L89
        Lb4:
            r8 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r3 = com.braze.ui.support.UriUtils.TAG
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.E
            com.braze.ui.support.UriUtils$getQueryParameters$2 r5 = new com.braze.ui.support.UriUtils$getQueryParameters$2
            r5.<init>(r0)
            r2.brazelog(r3, r4, r8, r5)
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.support.UriUtils.getQueryParameters(android.net.Uri):java.util.Map");
    }

    public static final boolean isActivityRegisteredInManifest(Context context, String str) {
        PackageManager.ComponentInfoFlags of;
        j.f(context, "context");
        j.f(str, "className");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, str);
                of = PackageManager.ComponentInfoFlags.of(0L);
                packageManager.getActivityInfo(componentName, of);
            } else {
                context.getPackageManager().getActivityInfo(new ComponentName(context, str), 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.W, (Throwable) e, (a<String>) new UriUtils$isActivityRegisteredInManifest$1(str));
            return false;
        }
    }
}
