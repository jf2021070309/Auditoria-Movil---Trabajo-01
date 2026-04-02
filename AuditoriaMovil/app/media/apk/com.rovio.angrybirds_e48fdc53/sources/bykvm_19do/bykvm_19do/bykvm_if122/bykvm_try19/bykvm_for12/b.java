package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_for12;

import com.bytedance.msdk.api.qatools.IGMEventCallBack;
/* loaded from: classes.dex */
public class b {
    public static void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a aVar, boolean z) {
        if (aVar != null && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().y()) {
            try {
                Object invoke = Class.forName("com.bytedance.qatool.QAEventToolsUtil").getMethod("getEventCallBack", new Class[0]).invoke(null, new Object[0]);
                if (invoke instanceof IGMEventCallBack) {
                    IGMEventCallBack iGMEventCallBack = (IGMEventCallBack) invoke;
                    if (z) {
                        iGMEventCallBack.EventReportByV3(aVar.d());
                    } else {
                        iGMEventCallBack.EventReportByV1(aVar.d());
                    }
                }
            } catch (Exception e) {
            }
        }
    }
}
