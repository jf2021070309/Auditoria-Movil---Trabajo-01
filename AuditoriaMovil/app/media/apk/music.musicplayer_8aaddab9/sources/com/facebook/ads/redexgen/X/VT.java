package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: assets/audience_network.dex */
public abstract class VT implements InterfaceC0576Fa {
    public X7 A00;
    public B1 A01;
    public Object A02;
    public final ArrayList<FZ> A04 = new ArrayList<>(1);
    public final C0587Fl A03 = new C0587Fl();

    public abstract void A02();

    public abstract void A03(X7 x7, boolean z);

    public final C0587Fl A00(@Nullable FY fy) {
        return this.A03.A02(0, fy, 0L);
    }

    public final void A01(B1 b1, @Nullable Object obj) {
        this.A01 = b1;
        this.A02 = obj;
        Iterator<FZ> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACJ(this, b1, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Fa
    public final void A3B(Handler handler, InterfaceC0590Fo interfaceC0590Fo) {
        this.A03.A07(handler, interfaceC0590Fo);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Fa
    public final void ADG(X7 x7, boolean z, FZ fz) {
        X7 x72 = this.A00;
        IJ.A03(x72 == null || x72 == x7);
        this.A04.add(fz);
        if (this.A00 == null) {
            this.A00 = x7;
            A03(x7, z);
            return;
        }
        B1 b1 = this.A01;
        if (b1 == null) {
            return;
        }
        fz.ACJ(this, b1, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Fa
    public final void ADq(FZ fz) {
        this.A04.remove(fz);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Fa
    public final void ADs(InterfaceC0590Fo interfaceC0590Fo) {
        this.A03.A0D(interfaceC0590Fo);
    }
}
