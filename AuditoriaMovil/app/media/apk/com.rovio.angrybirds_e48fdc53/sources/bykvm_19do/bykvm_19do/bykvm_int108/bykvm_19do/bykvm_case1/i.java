package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.b;
import com.facebook.places.model.PlaceFields;
/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.EnumC0062b.values().length];
            a = iArr;
            try {
                iArr[b.EnumC0062b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[b.EnumC0062b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[b.EnumC0062b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[b.EnumC0062b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[b.EnumC0062b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public static String a(Context context) {
        return a(b(context));
    }

    public static String a(b.EnumC0062b enumC0062b) {
        int i;
        try {
            i = a.a[enumC0062b.ordinal()];
        } catch (Exception e) {
        }
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "mobile" : "4g" : "3g" : "2g" : "wifi";
    }

    private static b.EnumC0062b b(Context context) {
        NetworkInfo activeNetworkInfo;
        b.EnumC0062b enumC0062b;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    enumC0062b = b.EnumC0062b.WIFI;
                } else {
                    if (type == 0) {
                        switch (((TelephonyManager) context.getSystemService(PlaceFields.PHONE)).getNetworkType()) {
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                enumC0062b = b.EnumC0062b.MOBILE_3G;
                                break;
                            case 13:
                                enumC0062b = b.EnumC0062b.MOBILE_4G;
                                break;
                        }
                    }
                    enumC0062b = b.EnumC0062b.MOBILE;
                }
                return enumC0062b;
            }
            enumC0062b = b.EnumC0062b.NONE;
            return enumC0062b;
        } catch (Throwable th) {
            return b.EnumC0062b.MOBILE;
        }
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Exception e) {
            return false;
        }
    }
}
