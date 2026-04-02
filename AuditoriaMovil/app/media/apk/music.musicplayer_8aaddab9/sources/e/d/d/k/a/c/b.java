package e.d.d.k.a.c;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzgu;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class b {
    public static final Set<String> a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f7081b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f7082c = Arrays.asList("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f7083d = Arrays.asList("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f7084e = Arrays.asList((String[]) ArrayUtils.concat(zzgu.zza, zzgu.zzb));

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f7085f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean a(String str, String str2, Bundle bundle) {
        char c2;
        if ("_cmp".equals(str2)) {
            if (c(str) && bundle != null) {
                for (String str3 : f7083d) {
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                        c2 = 0;
                    }
                    c2 = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                        c2 = 2;
                    }
                    c2 = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c2 = 1;
                    }
                    c2 = 65535;
                }
                if (c2 == 0) {
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                } else if (c2 == 1) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                } else if (c2 != 2) {
                    return false;
                } else {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean b(String str, Bundle bundle) {
        if (f7081b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : f7083d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean c(String str) {
        return !f7082c.contains(str);
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        } else if (f7084e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f7085f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
