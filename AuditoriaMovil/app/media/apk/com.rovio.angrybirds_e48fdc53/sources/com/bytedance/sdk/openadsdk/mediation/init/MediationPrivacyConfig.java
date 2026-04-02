package com.bytedance.sdk.openadsdk.mediation.init;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public abstract class MediationPrivacyConfig implements Serializable {
    public List<String> getCustomAppList() {
        return null;
    }

    public List<String> getCustomDevImeis() {
        return null;
    }

    public boolean isCanUseOaid() {
        return true;
    }

    public boolean isLimitPersonalAds() {
        return false;
    }

    public boolean isProgrammaticRecommend() {
        return true;
    }
}
