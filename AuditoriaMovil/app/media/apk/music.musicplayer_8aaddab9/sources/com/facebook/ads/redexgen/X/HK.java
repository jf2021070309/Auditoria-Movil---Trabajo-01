package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class HK implements InterfaceC0874Qu {
    public static byte[] A04;
    public int A00;
    @Nullable
    public String A01;
    @Nullable
    public Map<String, List<String>> A02;
    @Nullable
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -56, -41, -38, -46, -43, -50, -125, -56, -43, -43, -46, -43};
    }

    public HK(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e2) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 34), e2);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0874Qu
    @Nullable
    public final byte[] A5n() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0874Qu
    @Nullable
    public final String A5o() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0874Qu
    @Nullable
    public final Map<String, List<String>> A6j() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0874Qu
    public final int A7Z() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0874Qu
    @Nullable
    public final String getUrl() {
        return this.A01;
    }
}
