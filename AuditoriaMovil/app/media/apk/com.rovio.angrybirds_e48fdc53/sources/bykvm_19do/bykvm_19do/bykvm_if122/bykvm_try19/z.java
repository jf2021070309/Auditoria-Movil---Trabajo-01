package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
/* loaded from: classes.dex */
public class z {
    public static int a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return i;
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static boolean a(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
                return false;
            }
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static int b(Context context) {
        TelephonyManager a;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 1;
                    }
                } else if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUsePhoneState() && (a = c0.a()) != null) {
                    int networkType = a.getNetworkType();
                    if (networkType != 20) {
                        switch (networkType) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                return 2;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                return 3;
                            case 13:
                                return 4;
                        }
                    }
                    return 5;
                }
            }
        } catch (Throwable th) {
        }
        return 0;
    }

    public static String b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "mobile" : "5g" : "4g" : "3g" : "2g" : "wifi" : "unknown";
    }

    public static int c(Context context) {
        return a(b(context));
    }

    public static String d(Context context) {
        return b(b(context));
    }

    public static boolean e(Context context) {
        return b(context) == 2;
    }

    public static boolean f(Context context) {
        return b(context) == 3;
    }
}
