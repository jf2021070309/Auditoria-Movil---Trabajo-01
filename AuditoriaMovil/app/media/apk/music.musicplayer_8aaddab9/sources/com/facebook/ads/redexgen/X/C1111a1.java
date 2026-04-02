package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothAdapter;
/* renamed from: com.facebook.ads.redexgen.X.a1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1111a1 implements InterfaceC03956v {
    public final /* synthetic */ C1108Zy A00;

    public C1111a1(C1108Zy c1108Zy) {
        this.A00 = c1108Zy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        bluetoothAdapter = this.A00.A00;
        if (bluetoothAdapter != null) {
            C1108Zy c1108Zy = this.A00;
            bluetoothAdapter2 = c1108Zy.A00;
            return c1108Zy.A08(bluetoothAdapter2.getName());
        }
        return this.A00.A07(AnonymousClass76.A06);
    }
}
