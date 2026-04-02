package com.kwad.components.ad.reward.c;

import com.kwad.sdk.api.KsRewardVideoAd;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class c {
    public static void a(b bVar, KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        if (rewardAdInteractionListener == null || bVar == null) {
            return;
        }
        try {
            rewardAdInteractionListener.onExtraRewardVerify(bVar.getType());
        } catch (Throwable th) {
        }
    }

    public static boolean a(KsRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        if (rewardAdInteractionListener == null) {
            return false;
        }
        try {
            for (Method method : rewardAdInteractionListener.getClass().getMethods()) {
                if ("onExtraRewardVerify".equals(method.getName())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static b hc() {
        return new b(1);
    }
}
