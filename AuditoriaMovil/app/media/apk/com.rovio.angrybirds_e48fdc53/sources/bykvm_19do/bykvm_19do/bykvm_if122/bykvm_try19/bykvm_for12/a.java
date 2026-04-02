package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_for12;

import com.bytedance.msdk.api.qatools.IGMConfigCallBack;
/* loaded from: classes.dex */
public class a {
    public static boolean a() {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().y()) {
            try {
                Object invoke = Class.forName("com.bytedance.qatool.QAConfigToolsUtil").getMethod("getConfigCallBack", new Class[0]).invoke(null, new Object[0]);
                if (invoke instanceof IGMConfigCallBack) {
                    return ((IGMConfigCallBack) invoke).useLocalConfig();
                }
                return false;
            } catch (Throwable th) {
                return false;
            }
        }
        return false;
    }
}
