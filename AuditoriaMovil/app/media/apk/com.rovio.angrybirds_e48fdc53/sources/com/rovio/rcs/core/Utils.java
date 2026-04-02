package com.rovio.rcs.core;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.places.model.PlaceFields;
import com.rovio.fusion.Globals;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/* loaded from: classes4.dex */
public class Utils {
    private static final String NEW_PLAY_REFERRER_KEY = "is_referrer_reported";
    private static final String REFERRER_TAG = ".REFERRER_TAG";
    private static final String TAG = "Platform";
    private static String m_agentString = null;
    private static boolean m_fetchingAgent = false;
    private static final Object LOCK = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void handleReferrerNotSupported();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void handleReferrerValue(String str, long j, long j2);

    public static String getAndroidId() {
        return Settings.Secure.getString(Globals.getActivity().getContentResolver(), "android_id");
    }

    public static String advertisingId() {
        String str = new String();
        try {
            return (String) invokeAdInfoMethod("getId");
        } catch (Exception e) {
            Log.e(TAG, "Google Play getAdvertisingIdInfo failed" + e.toString());
            String string = Settings.Secure.getString(Globals.getActivity().getContentResolver(), "advertising_id");
            if (string == null) {
                Log.e(TAG, "Fire OS advertising_id failed" + e.toString());
                return str;
            }
            return string;
        }
    }

    public static boolean advertisingTrackingEnabled() {
        try {
            return !((Boolean) invokeAdInfoMethod("isLimitAdTrackingEnabled")).booleanValue();
        } catch (Exception e) {
            Log.e(TAG, "Google Play isLimitAdTrackingEnabled failed" + e.toString());
            try {
                return Settings.Secure.getInt(Globals.getActivity().getContentResolver(), "limit_ad_tracking") == 0;
            } catch (Settings.SettingNotFoundException e2) {
                Log.e(TAG, "Fire OS limit_ad_tracking failed" + e.toString());
                return false;
            }
        }
    }

    private static Object invokeAdInfoMethod(String str) {
        Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, Globals.getActivity());
        return invoke.getClass().getMethod(str, new Class[0]).invoke(invoke, new Object[0]);
    }

    public static String packageName() {
        return Globals.getActivity().getPackageName();
    }

    public static String userAgentString() {
        String str;
        if (Build.VERSION.SDK_INT > 16) {
            synchronized (LOCK) {
                if (m_agentString != null) {
                    str = m_agentString;
                } else if (m_fetchingAgent) {
                    str = new String();
                } else {
                    m_fetchingAgent = true;
                    Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.rcs.core.Utils.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                Method method = WebSettings.class.getMethod("getDefaultUserAgent", Context.class);
                                synchronized (Utils.LOCK) {
                                    String unused = Utils.m_agentString = (String) method.invoke(null, Globals.getActivity());
                                }
                            } catch (Exception e) {
                                Log.e(Utils.TAG, "Failed getDefaultUserAgent" + e.toString());
                            }
                        }
                    });
                    str = new String();
                }
            }
            return str;
        }
        try {
            Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
            declaredConstructor.setAccessible(true);
            String userAgentString = ((WebSettings) declaredConstructor.newInstance(Globals.getActivity(), null)).getUserAgentString();
            declaredConstructor.setAccessible(false);
            return userAgentString;
        } catch (Exception e) {
            try {
                Class<?> cls = Class.forName("android.webkit.WebSettingsClassic");
                Constructor<?> declaredConstructor2 = cls.getDeclaredConstructor(Context.class, Class.forName("android.webkit.WebViewClassic"));
                declaredConstructor2.setAccessible(true);
                String str2 = (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor2.newInstance(Globals.getActivity(), null), new Object[0]);
                declaredConstructor2.setAccessible(false);
                return str2;
            } catch (Exception e2) {
                return "";
            }
        }
    }

    public static String networkType() {
        try {
            int type = ((ConnectivityManager) Globals.getActivity().getSystemService("connectivity")).getActiveNetworkInfo().getType();
            if (type == 1 || type == 6 || type == 9) {
                return "wifi";
            }
            if (type != 0 && type != 7) {
                return "";
            }
            return "cellular";
        } catch (Exception e) {
            return "";
        }
    }

    public static int getPPI() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Globals.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static int getViewWidth() {
        Window window = Globals.getActivity().getWindow();
        if (window == null || window.getDecorView() == null) {
            return 0;
        }
        return window.getDecorView().getWidth();
    }

    public static int getViewHeight() {
        Window window = Globals.getActivity().getWindow();
        if (window == null || window.getDecorView() == null) {
            return 0;
        }
        return window.getDecorView().getHeight();
    }

    public static String getCarrierName() {
        TelephonyManager telephonyManager = (TelephonyManager) Globals.getActivity().getSystemService(PlaceFields.PHONE);
        if (telephonyManager == null) {
            return "";
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        Log.d(TAG, "Carrier name: " + networkOperatorName);
        return networkOperatorName;
    }

    public static long getInstallTime() {
        try {
            return Globals.getActivity().getPackageManager().getPackageInfo(packageName(), 0).firstInstallTime / 1000;
        } catch (PackageManager.NameNotFoundException e) {
            return 0L;
        } catch (RuntimeException e2) {
            Log.d(TAG, "getUpdateTime failed with runtime exception " + e2);
            return 0L;
        }
    }

    public static long getUpdateTime() {
        try {
            return Globals.getActivity().getPackageManager().getPackageInfo(packageName(), 0).lastUpdateTime / 1000;
        } catch (PackageManager.NameNotFoundException e) {
            return 0L;
        } catch (RuntimeException e2) {
            Log.d(TAG, "getUpdateTime failed with runtime exception " + e2);
            return 0L;
        }
    }

    public static String getInstallSource() {
        try {
            return Globals.getActivity().getPackageManager().getInstallerPackageName(packageName());
        } catch (Exception e) {
            Log.d(TAG, "getInstallSource failed with runtime exception " + e);
            return "";
        }
    }

    public static boolean queryNewPlayReferrer() {
        Activity activity;
        try {
            activity = Globals.getActivity();
        } catch (Exception e) {
            Log.d(TAG, "queryNewPlayReferrer() failed with runtime exception: " + e);
            handleReferrerNotSupported();
        }
        if (Boolean.valueOf(activity.getSharedPreferences(getSharedPreferenceName(activity), 0).getBoolean(NEW_PLAY_REFERRER_KEY, false)).booleanValue()) {
            return false;
        }
        final InstallReferrerClient build = InstallReferrerClient.newBuilder(Globals.getActivity()).build();
        build.startConnection(new InstallReferrerStateListener() { // from class: com.rovio.rcs.core.Utils.2
            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(int i) {
                try {
                    if (i == 0) {
                        Log.d(Utils.TAG, "onInstallReferrerSetupFinished() connection established");
                        try {
                            ReferrerDetails installReferrer = InstallReferrerClient.this.getInstallReferrer();
                            Utils.handleReferrerValue(installReferrer.getInstallReferrer(), installReferrer.getInstallBeginTimestampSeconds(), installReferrer.getReferrerClickTimestampSeconds());
                        } catch (Exception e2) {
                            Log.d(Utils.TAG, "onInstallReferrerSetupFinished() failed with runtime exception: " + e2);
                            Utils.handleReferrerNotSupported();
                        }
                        InstallReferrerClient.this.endConnection();
                    } else {
                        Log.d(Utils.TAG, "onInstallReferrerSetupFinished() connection could not be established: " + Utils.parseResponseCode(i));
                        Utils.handleReferrerNotSupported();
                    }
                    Activity activity2 = Globals.getActivity();
                    SharedPreferences.Editor edit = activity2.getSharedPreferences(Utils.getSharedPreferenceName(activity2), 0).edit();
                    edit.putBoolean(Utils.NEW_PLAY_REFERRER_KEY, true);
                    edit.commit();
                } catch (Exception e3) {
                    Log.d(Utils.TAG, "onInstallReferrerSetupFinished() failed with runtime exception: " + e3);
                }
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
                Log.d(Utils.TAG, "onInstallReferrerServiceDisconnected() called ");
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String parseResponseCode(int i) {
        if (i == 2) {
            return "Install Referrer API not supported by the installed Play Store app.";
        }
        if (i == 1) {
            return "Could not initiate connection to the Install Referrer service.";
        }
        if (i == 3) {
            return "Install Referrer is not available due to incorrect API usage.";
        }
        if (i == -1) {
            return "Play Store service is not connected now - potentially transient state.";
        }
        return "Unknown error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getSharedPreferenceName(Context context) {
        return context.getApplicationContext().getPackageName() + REFERRER_TAG;
    }
}
