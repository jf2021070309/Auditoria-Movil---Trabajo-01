package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
/* loaded from: classes.dex */
public class g0 {
    private static boolean a = false;
    private static String b = null;
    private static String c = null;
    private static String d = null;
    private static boolean e = true;

    public static String a() {
        if (!a) {
            d();
        }
        return b;
    }

    public static String b() {
        try {
            if (!a) {
                d();
            }
            Configuration configuration = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d().getResources().getConfiguration();
            String valueOf = configuration.mcc != 0 ? String.valueOf(configuration.mcc) : c;
            Logger.e("MCC", "config=" + configuration.mcc + ",sMCC=" + c);
            if (e) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getMCC");
            sb.append(e ? "有SIM卡" : "无SIM卡,MCC返回null");
            Logger.e("MCC", sb.toString());
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String c() {
        if (!a) {
            d();
        }
        return d;
    }

    private static void d() {
        TelephonyManager a2;
        String str;
        String str2;
        String str3;
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() == null || a) {
            return;
        }
        try {
            a2 = c0.a();
        } catch (Throwable th) {
        }
        if (a2 != null) {
            int simState = a2.getSimState();
            if (simState == 0 || simState == 1) {
                e = false;
            }
            Logger.e("MCC", e ? "有SIM卡" : "无SIM卡");
            String str4 = null;
            try {
                str = a2.getSimOperatorName();
            } catch (Throwable th2) {
                str = null;
            }
            try {
                str2 = a2.getNetworkOperator();
            } catch (Throwable th3) {
                str2 = null;
            }
            if (str2 == null || str2.length() < 5) {
                try {
                    str2 = a2.getSimOperator();
                } catch (Throwable th4) {
                }
            }
            if (TextUtils.isEmpty(str2) || str2.length() <= 4) {
                str3 = null;
            } else {
                str4 = str2.substring(0, 3);
                str3 = str2.substring(3);
            }
            if (!TextUtils.isEmpty(str)) {
                b = str;
            }
            if (!TextUtils.isEmpty(str4)) {
                c = str4;
            }
            if (!TextUtils.isEmpty(str3)) {
                d = str3;
            }
            a = true;
        }
    }
}
