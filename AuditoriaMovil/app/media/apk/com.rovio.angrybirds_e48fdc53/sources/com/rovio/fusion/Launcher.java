package com.rovio.fusion;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.Html;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.List;
/* loaded from: classes2.dex */
class Launcher {
    private static final boolean ENABLE_LOGGING = false;

    Launcher() {
    }

    public static void openURL(String str) {
        try {
            Globals.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
        }
    }

    public static boolean openProgram(String str) {
        try {
            Globals.getActivity().startActivity(Globals.getActivity().getPackageManager().getLaunchIntentForPackage(str));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean canOpenProgram(String str, String str2) {
        try {
            try {
                PackageInfo packageInfo = Globals.getActivity().getPackageManager().getPackageInfo(str, 1);
                if (str2.equals("")) {
                    return true;
                }
                String[] split = str2.split("\\.");
                String[] split2 = packageInfo.versionName.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    Integer valueOf = Integer.valueOf(split[i]);
                    Integer num = 0;
                    if (i < split2.length) {
                        try {
                            num = Integer.valueOf(split2[i]);
                        } catch (NumberFormatException e) {
                        }
                    }
                    if (num != valueOf) {
                        return num.intValue() > valueOf.intValue();
                    }
                }
                return true;
            } catch (NumberFormatException e2) {
                return false;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            return false;
        }
    }

    public static boolean canOpenEmail() {
        List<ResolveInfo> queryIntentActivities = Globals.getActivity().getPackageManager().queryIntentActivities(createEmailIntent("", "", ""), 65536);
        Log.i("MyRenderer", queryIntentActivities.size() + " activities support ACTION_SEND intents");
        return queryIntentActivities.size() >= 1;
    }

    public static void openEmail(String str, String str2, String str3) {
        Globals.getActivity().startActivity(createEmailIntent(str, str2, str3));
    }

    private static Intent createEmailIntent(String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AudienceNetworkActivity.WEBVIEW_MIME_TYPE);
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(str3));
        return intent;
    }
}
