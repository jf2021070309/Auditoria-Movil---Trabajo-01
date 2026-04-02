package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.a0  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1110a0 implements InterfaceC03956v {
    public final /* synthetic */ C1108Zy A00;

    public C1110a0(C1108Zy c1108Zy) {
        this.A00 = c1108Zy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() throws Exception {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        bluetoothAdapter = this.A00.A00;
        if (bluetoothAdapter != null) {
            bluetoothAdapter2 = this.A00.A00;
            ArrayList arrayList = new ArrayList();
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter2.getBondedDevices()) {
                arrayList.add(new C1109Zz(bluetoothDevice));
            }
            return this.A00.A0D(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A06);
    }
}
