package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.VisibleForTesting;
/* renamed from: com.facebook.ads.redexgen.X.Lg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0733Lg {
    public static String[] A05 = {"AKWVUs1l0Ice5I6VX", "CXPBWDMo1Zqj2yCW5W30Ut48PEWYgYey", "QYYsUNIn7qky9LY", "uhDWqwwqE26XK4rQkizWNR4dlHqM4UZ3", "ZNpftHLPxc7R9PnANzOwdg7R2ap4pSI6", "3ke", "xa09Mpjas6OdUQMP5Qo7kdS83JfCqy78", "u6CBuCaaqyjpN4LkQhRqLLvzhKEDnG9S"};
    public float A00;
    public boolean A01;
    public boolean A02;
    public final Handler A03;
    public final InterfaceC0732Lf A04;

    public C0733Lg(int i2, InterfaceC0732Lf interfaceC0732Lf) {
        this(i2, interfaceC0732Lf, new Handler());
    }

    @VisibleForTesting
    public C0733Lg(int i2, InterfaceC0732Lf interfaceC0732Lf, Handler handler) {
        this.A02 = false;
        this.A00 = i2;
        this.A04 = interfaceC0732Lf;
        this.A03 = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        this.A00 -= 0.25f;
        this.A04.ABv(this.A00);
        if (this.A00 <= 0.0f) {
            boolean z = this.A01;
            if (A05[4].charAt(25) == 'L') {
                throw new RuntimeException();
            }
            A05[6] = "KuCOx1ArmKJG2Js90Y8iwcXaowa3uSzZ";
            if (!z) {
                this.A01 = true;
                this.A04.AAL();
                this.A02 = false;
            }
        }
    }

    public final float A03() {
        return this.A00;
    }

    public final boolean A04() {
        return this.A00 <= 0.0f;
    }

    public final boolean A05() {
        return this.A02;
    }

    public final boolean A06() {
        if (A05()) {
            this.A02 = false;
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if (A04() && !this.A01) {
            this.A01 = true;
            this.A04.AAL();
        }
        if (!A04() && !A05()) {
            this.A02 = true;
            this.A04.ABv(this.A00);
            this.A03.postDelayed(new C0940Ti(this), 250L);
            return true;
        } else if (A05[4].charAt(25) != 'L') {
            String[] strArr = A05;
            strArr[3] = "u6tCNg8GXSpiTqjQspDcQdpU9nt4kRaX";
            strArr[7] = "uRN5Zlx2bfjM01c7Y9BPyYrHFfBp2TpI";
            return false;
        } else {
            throw new RuntimeException();
        }
    }
}
