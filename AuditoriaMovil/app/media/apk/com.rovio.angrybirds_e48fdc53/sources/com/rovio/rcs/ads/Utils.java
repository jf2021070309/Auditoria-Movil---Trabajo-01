package com.rovio.rcs.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.rovio.fusion.Globals;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public class Utils {
    private static final String PREF_TEST_ADS_ACTIVITIES = "test3rdPartyAdsActivities";
    private static final String TAG = "Ads";

    public static String targetSdkVersion() {
        return String.valueOf(Globals.getActivity().getApplicationInfo().targetSdkVersion);
    }

    public static String installerName() {
        try {
            return Globals.getActivity().getPackageManager().getInstallerPackageName(Globals.getActivity().getPackageName());
        } catch (Throwable th) {
            return null;
        }
    }

    public static String loadAsset(String str) {
        try {
            InputStream open = Globals.getActivity().getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr);
        } catch (IOException e) {
            Log.e(TAG, "Failed to read asset" + e.toString());
            return "";
        }
    }

    public static String getFBAudienceNetworkBiddingToken() {
        try {
            return (String) Class.forName("com.facebook.ads.BidderTokenProvider").getMethod("getBidderToken", Context.class).invoke(null, Globals.getActivity());
        } catch (Exception e) {
            Log.e(TAG, "getFBAudienceNetworkBiddingToken failed, msg: " + e.toString());
            return "";
        }
    }

    public static void test3rdPartyAdsActivities() {
        String[] strArr;
        SharedPreferences sharedPreferences = Globals.getActivity().getSharedPreferences("beacon", 0);
        if (!sharedPreferences.getBoolean(PREF_TEST_ADS_ACTIVITIES, false)) {
            for (String str : AdsSdkActivities.ADS_SDK_ACTIVITIES) {
                try {
                    Globals.getActivity().getPackageManager().getActivityInfo(new ComponentName(Globals.getActivity(), str), 0);
                    Globals.getActivity().getClassLoader().loadClass(str);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e(TAG, str + " activity declaration was expected but not found! Please check your AndroidManifest.xml");
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e2) {
                    Log.e(TAG, str + " class does not exist in the classpath! Please make sure that the relevant Ads SDK is included in the classpath");
                    throw new RuntimeException(e2);
                }
            }
            sharedPreferences.edit().putBoolean(PREF_TEST_ADS_ACTIVITIES, true).apply();
        }
    }
}
