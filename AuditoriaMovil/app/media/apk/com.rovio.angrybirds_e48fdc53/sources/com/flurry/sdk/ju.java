package com.flurry.sdk;

import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;
/* loaded from: classes2.dex */
public class ju {
    private static final String a = ju.class.getSimpleName();
    private static ju b;

    private ju() {
    }

    public static synchronized ju a() {
        ju juVar;
        synchronized (ju.class) {
            if (b == null) {
                b = new ju();
            }
            juVar = b;
        }
        return juVar;
    }

    public static String b() {
        TelephonyManager telephonyManager = (TelephonyManager) ka.a().a.getSystemService(PlaceFields.PHONE);
        if (telephonyManager == null) {
            return null;
        }
        return telephonyManager.getNetworkOperatorName();
    }

    public static String c() {
        TelephonyManager telephonyManager = (TelephonyManager) ka.a().a.getSystemService(PlaceFields.PHONE);
        if (telephonyManager == null) {
            return null;
        }
        return telephonyManager.getNetworkOperator();
    }
}
