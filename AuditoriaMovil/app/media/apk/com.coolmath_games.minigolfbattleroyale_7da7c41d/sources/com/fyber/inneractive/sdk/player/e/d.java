package com.fyber.inneractive.sdk.player.e;

import android.content.Context;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.ak;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.nearby.messages.Strategy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: classes.dex */
public final class d extends g {
    public d(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.e.a
    public final void a(ak akVar, int i, int i2) {
        if (akVar == null) {
            return;
        }
        if (this.d == UnitDisplayType.SQUARE) {
            akVar.a = Math.min(i, this.b) - l.b(this.c.g().e().intValue() * 2);
            akVar.b = akVar.a;
        } else if (this.d == UnitDisplayType.LANDSCAPE) {
            akVar.a = Math.min(i, this.b) - l.b(this.c.g().e().intValue() * 2);
            akVar.b = (akVar.a * 9) / 16;
        } else if (this.d == UnitDisplayType.MRECT) {
            akVar.a = l.b((int) Strategy.TTL_SECONDS_DEFAULT);
            akVar.b = l.b((int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        } else if (this.d == UnitDisplayType.DEFAULT && this.r) {
            a(akVar, this.p, this.q, i, i2);
        } else {
            akVar.a = 0;
            akVar.b = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.e.g
    public final void d() {
        this.A = new ak(0, 0);
        if (this.d == UnitDisplayType.SQUARE) {
            if (this.i != null) {
                this.i.getLayoutParams().width = this.z.a;
                this.i.getLayoutParams().height = this.z.a;
            }
            a(this.A, this.p, this.q, this.z.a, this.z.a);
            return;
        }
        a(this.A, this.p, this.q, this.z.a, this.z.b);
        if (this.i != null) {
            this.i.getLayoutParams().width = this.A.a;
            this.i.getLayoutParams().height = this.A.b;
        }
    }
}
