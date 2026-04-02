package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class VO implements GM {
    @Nullable
    public InterfaceC0519Cf A02;
    @Nullable
    public Object A03;
    @Nullable
    public String A04;
    public boolean A05;
    public final InterfaceC0631Hd A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public VO(InterfaceC0631Hd interfaceC0631Hd) {
        this.A06 = interfaceC0631Hd;
    }

    public final C0505Bp A00(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C1015Wj();
        }
        return new C0505Bp(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
