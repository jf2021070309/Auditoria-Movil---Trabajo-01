package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class UJ implements InterfaceC0849Pv {
    public static String[] A01 = {"T9VzL8fHxpfySiwwlXedeY7mX", "guyVlBlOMcVDAIfN1wPFopCO0r0Zk0gq", "ttKJ4peW2WPtu1OROjgTykJGR", "A5J8ePX4fIk14ZpUSfaCkLGHXqqMAYt6", "kQp8myZeu", "7L0NbJj9RoUIRUZ", "UhNplE17b8XX", "zMftdbZDucx4tcPG97oOAYZ8vQU5TBbw"};
    public final /* synthetic */ UD A00;

    public UJ(UD ud) {
        this.A00 = ud;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0849Pv
    public final void ACh() {
        AtomicBoolean atomicBoolean;
        InterfaceC0701Jx interfaceC0701Jx;
        InterfaceC0701Jx interfaceC0701Jx2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC0701Jx = this.A00.A02;
        if (interfaceC0701Jx != null) {
            interfaceC0701Jx2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            boolean z = atomicBoolean2.get();
            if (A01[1].charAt(3) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
            interfaceC0701Jx2.ABh(z);
        }
    }
}
