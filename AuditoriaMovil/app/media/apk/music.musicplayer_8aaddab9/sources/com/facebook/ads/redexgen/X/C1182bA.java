package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.bA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1182bA implements InterfaceC03595k {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final RK A01;
    public Set<InterfaceC03625n> A00 = new HashSet();
    public final List<InterfaceC03615m> A02 = new ArrayList();

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, 11, -46, -72, -67, 11, 41, 59, 59, 45, 60, 59};
    }

    static {
        A02();
    }

    public C1182bA(GR gr) {
        this.A01 = gr.A4N(RL.A0B);
        this.A01.A3E(new C1183bB(this));
        A03();
    }

    @Nullable
    public static Set<InterfaceC03625n> A01(JSONObject jSONObject) {
        C1181b9 A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject assetJson = optJSONArray.optJSONObject(i2);
            if (assetJson == null || (A00 = C1181b9.A00(assetJson)) == null) {
                return null;
            }
            hashSet.add(A00);
            int i3 = A04[1].length();
            if (i3 == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A03() {
        if (!this.A01.A8c()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC03625n> A01 = A01(this.A01.A6I());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (InterfaceC03615m listener : this.A02) {
                listener.A3R();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC03625n interfaceC03625n : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC03625n.A7i(), interfaceC03625n.getUrl());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03595k
    public final void A3C(InterfaceC03615m interfaceC03615m) {
        this.A02.add(interfaceC03615m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03595k
    public final synchronized Set<InterfaceC03625n> A5i() {
        return new HashSet(this.A00);
    }
}
