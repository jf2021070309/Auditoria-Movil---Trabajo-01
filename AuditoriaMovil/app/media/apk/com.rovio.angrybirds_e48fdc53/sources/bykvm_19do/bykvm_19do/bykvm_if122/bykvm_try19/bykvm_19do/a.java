package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_19do;

import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    public static boolean a(c cVar) {
        if (cVar == null) {
            return false;
        }
        int w = cVar.w();
        Map<String, Integer> o = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().o();
        if (o != null) {
            Integer num = o.get(String.valueOf(w));
            if (num == null) {
                Integer num2 = o.get(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
                if (num2 == null || num2.intValue() != 1) {
                    return false;
                }
            } else if (num.intValue() != 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean b(c cVar) {
        if (cVar == null) {
            return false;
        }
        int w = cVar.w();
        Map<String, Integer> r = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().r();
        if (r != null) {
            Integer num = r.get(String.valueOf(w));
            if (num == null) {
                Integer num2 = r.get(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
                if (num2 == null || num2.intValue() != 1) {
                    return false;
                }
            } else if (num.intValue() != 1) {
                return false;
            }
            return true;
        }
        return false;
    }
}
