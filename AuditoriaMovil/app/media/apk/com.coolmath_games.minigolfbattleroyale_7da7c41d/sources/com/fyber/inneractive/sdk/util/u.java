package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.net.MailTo;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.google.android.gms.drive.DriveFile;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class u extends l {

    /* loaded from: classes.dex */
    public enum c {
        FAILED,
        OPENED_IN_INTERNAL_BROWSER,
        OPEN_IN_EXTERNAL_APPLICATION,
        OPEN_IN_EXTERNAL_BROWSER,
        OPENED_USING_CHROME_NAVIGATE
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static final class d {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {1, 2};
    }

    public static boolean a(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith(MailTo.MAILTO_SCHEME) && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.d("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final c a;
        public final Throwable b;
        public final String c;

        public a(c cVar, Throwable th, String str) {
            this.a = cVar;
            this.b = th;
            this.c = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        b(String str) {
            super(str);
        }
    }

    private static String a(Context context) {
        try {
            return context.getClass().getName();
        } catch (Throwable unused) {
            return "failed";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.util.u.a a(android.content.Context r11, java.lang.String r12, boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.u.a(android.content.Context, java.lang.String, boolean, int):com.fyber.inneractive.sdk.util.u$a");
    }

    public static boolean b(String str) {
        return str.startsWith("http%3A%2F%2F") || str.startsWith("https%3A%2F%2F");
    }

    public static String f(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (scheme != null && scheme.equals("fybernativebrowser") && host != null && host.equals("navigate")) {
                return parse.getQueryParameter("url");
            }
        }
        return null;
    }

    public static boolean g(String str) {
        if (str != null && (!p.a() || IAConfigManager.l())) {
            if (!((str.startsWith("http://") || str.startsWith("http%3A%2F%2F")) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    private static Uri h(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            IAlog.b("IAJavaUtil: getValidUri: Invalid url %s", str);
            return null;
        }
    }

    private static a b(Context context, String str, boolean z, int i) {
        String a2 = a(context);
        try {
            IAlog.b("IAJavaUtil - valid url found: '%s' opening browser", str);
            if (z) {
                try {
                    if (i(str) && i != d.a) {
                        context.startActivity(c(context, str));
                        return new a(c.OPENED_IN_INTERNAL_BROWSER, null, a2);
                    }
                    return new a(c.FAILED, new b("canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to false"), a2);
                } catch (ActivityNotFoundException unused) {
                    context.startActivity(b(context, str));
                    return new a(c.OPEN_IN_EXTERNAL_BROWSER, null, a2);
                }
            }
            try {
                context.startActivity(b(context, str));
                return new a(c.OPEN_IN_EXTERNAL_BROWSER, null, a2);
            } catch (ActivityNotFoundException unused2) {
                if (a(context, str)) {
                    return new a(c.OPENED_USING_CHROME_NAVIGATE, null, a2);
                }
                return new a(c.FAILED, new b("tryOpeningChromeGracefully has failed and couldn't open the url"), a2);
            } catch (Throwable unused3) {
                if (i(str) && i != d.a) {
                    context.startActivity(c(context, str));
                    return new a(c.OPENED_IN_INTERNAL_BROWSER, null, a2);
                }
                return new a(c.FAILED, new b("canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"), a2);
            }
        } catch (Throwable th) {
            IAlog.b("IAJavaUtil - could not open a browser for url: %s", str);
            return new a(c.FAILED, th, a2);
        }
        IAlog.b("IAJavaUtil - could not open a browser for url: %s", str);
        return new a(c.FAILED, th, a2);
    }

    private static boolean i(String str) {
        return (a(str) || b(str)) ? false : true;
    }

    private static boolean a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("googlechrome://navigate?url=%s", str)));
            if (!(context instanceof Activity)) {
                intent.addFlags(DriveFile.MODE_READ_ONLY);
            }
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            IAlog.d("Failed opening chrome for a special uri.", new Object[0]);
            return false;
        }
    }

    private static Intent b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(DriveFile.MODE_READ_ONLY);
        }
        return intent;
    }

    private static Intent c(Context context, String str) {
        Intent intent = new Intent(context, InneractiveInternalBrowserActivity.class);
        intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str);
        if (!(context instanceof Activity)) {
            intent.setFlags(DriveFile.MODE_READ_ONLY);
        }
        return intent;
    }

    private static boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.exported) {
                    arrayList.add(resolveInfo);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(DriveFile.MODE_READ_ONLY);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    private static a a(Uri uri, Context context) {
        String a2 = a(context);
        try {
            Intent parseUri = Intent.parseUri(uri.toString(), 1);
            if (a(context, parseUri)) {
                IAlog.a(IAlog.b, "%s %s", "DEEPLINK", uri);
                return new a(c.OPEN_IN_EXTERNAL_APPLICATION, null, a2);
            }
            String stringExtra = parseUri.getStringExtra("browser_fallback_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    context.startActivity(b(context, stringExtra));
                    IAlog.a(IAlog.b, "%s %s", "Intent opened successfully, url:", stringExtra);
                    return new a(c.OPEN_IN_EXTERNAL_BROWSER, null, a2);
                } catch (ActivityNotFoundException unused) {
                    IAlog.a(IAlog.b, "%s %s", "Intent failed, url:", stringExtra);
                }
            }
            return new a(c.FAILED, new b("tryToOpenExternalApp has failed (intent scheme)"), a2);
        } catch (URISyntaxException e) {
            IAlog.b(e.getLocalizedMessage(), new Object[0]);
            return new a(c.FAILED, e, a2);
        }
    }
}
