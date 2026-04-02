package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.X;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b {
    IronSource.AD_UNIT a;

    public b(IronSource.AD_UNIT ad_unit) {
        this.a = ad_unit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(IronSourceError ironSourceError) {
        if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
            A.a().a(ironSourceError);
        } else if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            X.a().a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            X.a().a(z);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(IronSourceError ironSourceError) {
        if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
            A.a().b(ironSourceError);
        } else if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            X.a().b(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.a);
        }
    }
}
