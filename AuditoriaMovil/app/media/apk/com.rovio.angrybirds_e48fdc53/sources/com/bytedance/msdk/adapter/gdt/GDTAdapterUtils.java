package com.bytedance.msdk.adapter.gdt;

import android.content.Context;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
import com.qq.e.comm.constants.BiddingLossReason;
import java.util.Map;
/* loaded from: classes.dex */
public class GDTAdapterUtils {
    public static final double CPM_DEFLAUT_VALUE = 0.0d;

    /* renamed from: com.bytedance.msdk.adapter.gdt.GDTAdapterUtils$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MediationConstant.BiddingLossReason.values().length];
            a = iArr;
            try {
                iArr[MediationConstant.BiddingLossReason.LOW_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[MediationConstant.BiddingLossReason.TIME_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[MediationConstant.BiddingLossReason.NO_AD.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[MediationConstant.BiddingLossReason.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getBiddingLossReason(MediationConstant.BiddingLossReason biddingLossReason) {
        if (biddingLossReason == null) {
            return BiddingLossReason.OTHER;
        }
        try {
            int i = AnonymousClass1.a[biddingLossReason.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return BiddingLossReason.OTHER;
                    }
                    return 2;
                }
                return 101;
            }
            return 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return BiddingLossReason.OTHER;
        }
    }

    public static boolean isExpressNativeAutoHeight(MediationAdSlotValueSet mediationAdSlotValueSet) {
        Map<String, Object> params = mediationAdSlotValueSet.getParams();
        if (params == null) {
            return false;
        }
        Object obj = params.get(MediationConstant.BANNER_AUTO_HEIGHT);
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static void printPrivacyLog(MediationInitConfig mediationInitConfig) {
    }
}
