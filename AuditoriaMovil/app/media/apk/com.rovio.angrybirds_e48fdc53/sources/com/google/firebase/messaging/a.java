package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes2.dex */
final class a {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());
    private final Context b;
    private Bundle c;

    public a(Context context) {
        this.b = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Bundle bundle) {
        return "1".equals(a(bundle, "gcm.n.e")) || a(bundle, "gcm.n.icon") != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return bundle.getString(str.replace("gcm.n.", "gcm.notification."));
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        return a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object[] c(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_args");
        String a2 = a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a2);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return strArr;
        } catch (JSONException e) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf("_loc_args");
            String substring = (valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).substring(6);
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a2).length()).append("Malformed ").append(substring).append(": ").append(a2).append("  Default value will be used.").toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri b(Bundle bundle) {
        String a2 = a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a2)) {
            a2 = a(bundle, "gcm.n.link");
        }
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return Uri.parse(a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a.c(android.os.Bundle):boolean");
    }

    private final String d(Bundle bundle, String str) {
        String a2 = a(bundle, str);
        if (TextUtils.isEmpty(a2)) {
            String b = b(bundle, str);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            Resources resources = this.b.getResources();
            int identifier = resources.getIdentifier(b, "string", this.b.getPackageName());
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf("_loc_key");
                String substring = (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).substring(6);
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(b).length()).append(substring).append(" resource not found: ").append(b).append(" Default value will be used.").toString());
                return null;
            }
            Object[] c = c(bundle, str);
            if (c == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, c);
            } catch (MissingFormatArgumentException e) {
                String arrays = Arrays.toString(c);
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(b).length() + 58 + String.valueOf(arrays).length()).append("Missing format argument for ").append(b).append(": ").append(arrays).append(" Default value will be used.").toString(), e);
                return null;
            }
        }
        return a2;
    }

    private final boolean a(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (this.b.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable) {
                Log.e("FirebaseMessaging", new StringBuilder(77).append("Adaptive icons cannot be used in notifications. Ignoring icon id: ").append(i).toString());
                return false;
            }
            return true;
        } catch (Resources.NotFoundException e) {
            return false;
        }
    }

    private final Integer a(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException e) {
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(str).length() + 54).append("Color ").append(str).append(" not valid. Notification will use default color.").toString());
            }
        }
        int i = a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(ContextCompat.getColor(this.b, i));
            } catch (Resources.NotFoundException e2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(Bundle bundle) {
        String a2 = a(bundle, "gcm.n.sound2");
        if (TextUtils.isEmpty(a2)) {
            return a(bundle, "gcm.n.sound");
        }
        return a2;
    }

    private static void a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    private final Bundle a() {
        if (this.c != null) {
            return this.c;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            this.c = applicationInfo.metaData;
            return this.c;
        }
        return Bundle.EMPTY;
    }
}
