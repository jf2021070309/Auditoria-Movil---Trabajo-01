package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;
/* loaded from: classes.dex */
public class c0 {
    public static TelephonyManager a() {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() != null && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUsePhoneState() && a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d())) {
            return (TelephonyManager) bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().getSystemService(PlaceFields.PHONE);
        }
        return null;
    }

    private static boolean a(Context context) {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.c.a(context, com.kuaishou.weapon.p0.g.c) == 0;
    }
}
