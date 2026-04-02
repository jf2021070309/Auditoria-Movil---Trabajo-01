package com.fyber.inneractive.sdk.player.e;

import android.content.Context;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.ak;
/* loaded from: classes.dex */
public final class b extends g {
    public b(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.e.a
    public final void a(ak akVar, int i, int i2) {
        if (this.d == UnitDisplayType.DEFAULT && this.r) {
            a(akVar, this.p, this.q, i, i2);
        }
        akVar.a = 0;
        akVar.b = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.e.g
    public final void d() {
        this.A = new ak(0, 0);
        if (this.d == UnitDisplayType.SQUARE) {
            int min = Math.min(this.z.a, this.b);
            if (this.j != null) {
                this.j.getLayoutParams().width = min;
                this.j.getLayoutParams().height = min;
            }
            if (this.i != null) {
                this.i.getLayoutParams().width = min;
                this.i.getLayoutParams().height = min;
            }
            a(this.A, this.p, this.q, min, min);
            return;
        }
        a(this.A, this.p, this.q, this.z.a, this.z.b);
        if (this.i != null) {
            this.i.getLayoutParams().width = this.A.a;
            this.i.getLayoutParams().height = this.A.b;
        }
    }
}
