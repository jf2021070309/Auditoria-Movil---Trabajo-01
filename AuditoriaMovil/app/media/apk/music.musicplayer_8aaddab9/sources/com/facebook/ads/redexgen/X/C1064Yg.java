package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Yg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1064Yg implements InterfaceC03956v {
    public static byte[] A01;
    public static String[] A02 = {"DYzZ33D", "FX", "1OACtFyT458udh1Nq8LtT5hKAntFdlV0", "NREy1eS", "YXbhfnB1JeAOpwzc7R5F4UgUcnERyrlo", "CB", "UiK58QgaQ3DZSY0y2Dj7Y4rAezwTtVBd", "ZsDGmeWwG8AfDaZfTpPswbVEo9CgGFmV"};
    public final /* synthetic */ C1062Ye A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{49, 39, 44, 49, 45, 48};
    }

    static {
        A01();
    }

    public C1064Yg(C1062Ye c1062Ye) {
        this.A00 = c1062Ye;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() throws Exception {
        Context context;
        C1062Ye c1062Ye = this.A00;
        context = c1062Ye.A01;
        c1062Ye.A00 = (SensorManager) context.getSystemService(A00(0, 6, 57));
        if (Build.VERSION.SDK_INT < 20) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        C1062Ye c1062Ye2 = this.A00;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "Uf";
        strArr2[1] = "fm";
        if (c1062Ye2.A00 == null) {
            return this.A00.A07(AnonymousClass76.A07);
        }
        List<Sensor> sensorList = this.A00.A00.getSensorList(-1);
        ArrayList arrayList = new ArrayList();
        for (Sensor sensor : sensorList) {
            arrayList.add(new C1063Yf(sensor));
        }
        return this.A00.A0D(arrayList);
    }
}
