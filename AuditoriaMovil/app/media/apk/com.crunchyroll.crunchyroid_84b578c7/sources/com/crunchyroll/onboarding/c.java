package com.crunchyroll.onboarding;

import com.amazon.aps.iva.yb0.l;
import java.util.LinkedHashSet;
/* compiled from: OnboardingV2Activity.kt */
/* loaded from: classes.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ OnboardingV2Activity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OnboardingV2Activity onboardingV2Activity) {
        super(0);
        this.h = onboardingV2Activity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        OnboardingV2Activity onboardingV2Activity = this.h;
        boolean z = false;
        boolean booleanExtra = onboardingV2Activity.getIntent().getBooleanExtra("is_token_expired", false);
        LinkedHashSet linkedHashSet = onboardingV2Activity.c;
        if (booleanExtra && !linkedHashSet.contains("is_token_expired")) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        valueOf.booleanValue();
        linkedHashSet.add("is_token_expired");
        return valueOf;
    }
}
