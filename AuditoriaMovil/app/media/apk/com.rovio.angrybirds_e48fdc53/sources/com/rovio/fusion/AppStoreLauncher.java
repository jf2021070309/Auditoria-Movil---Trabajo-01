package com.rovio.fusion;

import android.content.Intent;
import android.net.Uri;
import com.ss.android.download.api.constant.BaseConstants;
/* loaded from: classes2.dex */
public class AppStoreLauncher {
    public static boolean isSupported_Amazon() {
        return true;
    }

    public static boolean isSupported_GooglePlay() {
        return true;
    }

    public static boolean launch_GooglePlay(String str) {
        return launchStore(Uri.parse(BaseConstants.MARKET_PREFIX + str));
    }

    public static boolean launch_Amazon(String str) {
        return launchStore(Uri.parse("amzn://apps/android?p=" + str));
    }

    private static boolean launchStore(Uri uri) {
        try {
            Globals.getActivity().startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
