package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Xx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1055Xx<K, V> extends C7A<HashMap<K, AnonymousClass72>> {
    public static byte[] A02;
    public static String[] A03 = {"cKuQ341bpQpj1np", "NRRRR4TEAm42mDR", "Q3CZak00lhavTOo6A", "zaO6DFhzYxSygkW1IzlMUY8ES4dk", "HbJVSBx3MNS6tqQ9XVLKo36QU0gI1Znv", "JrCrl10lt1AHnaihPuUoLOH", "SHM67NRdcA0GW9YM4", "2pIXYY"};
    public final AnonymousClass79 A00;
    public final HashMap<K, AnonymousClass72> A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{104};
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xx != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    public C1055Xx(long j2, @Nullable AnonymousClass78 anonymousClass78, HashMap<K, AnonymousClass72> hashMap, AnonymousClass79 anonymousClass79) {
        super(j2, anonymousClass78, hashMap, AnonymousClass79.A0A);
        this.A01 = hashMap;
        this.A00 = anonymousClass79;
        if (A04()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xx != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(K k2) {
        int i2 = AnonymousClass74.A00[this.A00.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return ((String) k2).length();
            }
            throw new UnsupportedOperationException();
        }
        return 4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xx != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    private boolean A04() {
        int i2 = AnonymousClass74.A00[this.A00.ordinal()];
        return i2 == 1 || i2 == 2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xx != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final int A06() {
        int i2 = 0;
        if (A07() == null || ((HashMap) A07()).isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : ((HashMap) A07()).entrySet()) {
            int A00 = i2 + A00(entry.getKey());
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            A03[4] = "UsP7Xgcu0nWDAT33HhVsw8aoixo7a0Y1";
            i2 = A00 + ((AnonymousClass72) entry.getValue()).AEu();
        }
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xx != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.C7A
    public final JSONObject A08(JSONObject mapJsonObject) throws JSONException {
        Set<K> keySet = this.A01.keySet();
        JSONObject jSONObject = new JSONObject();
        for (K k2 : keySet) {
            AnonymousClass72 anonymousClass72 = this.A01.get(k2);
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            A03[5] = "RtRjz";
            if (anonymousClass72 != null) {
                anonymousClass72.AFG(k2, jSONObject);
            }
        }
        mapJsonObject.put(A01(0, 1, SyslogConstants.LOG_ALERT), jSONObject);
        return mapJsonObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<K, com.facebook.ads.internal.botdetection.signals.model.signal_value.IMapSignalValueDef>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xx != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.C7A
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0A(C7A<HashMap<K, AnonymousClass72>> c7a) {
        boolean A8S;
        if (A07() == null || c7a.A07() == null) {
            return A07() == null && c7a.A07() == null;
        } else if (c7a.A07().size() != A07().size()) {
            return false;
        } else {
            HashMap<K, AnonymousClass72> A07 = c7a.A07();
            HashMap<K, AnonymousClass72> A072 = A07();
            Iterator<K> it = A07.keySet().iterator();
            Iterator<K> it2 = A072.keySet().iterator();
            do {
                boolean hasNext = it.hasNext();
                String[] strArr = A03;
                if (strArr[1].length() == strArr[0].length()) {
                    String[] strArr2 = A03;
                    strArr2[1] = "rUsYWVrpG3VWCqr";
                    strArr2[0] = "lLqYbR21ojeq3r6";
                    if (!hasNext || !it2.hasNext()) {
                        return true;
                    }
                    K next = it.next();
                    K next2 = it2.next();
                    if (!next.equals(next2) || !A07.containsKey(next) || !A072.containsKey(next2)) {
                        return false;
                    }
                    AnonymousClass72 anonymousClass72 = A07.get(next);
                    AnonymousClass72 newSignal = A072.get(next2);
                    AnonymousClass72 prevSignal = newSignal;
                    if (anonymousClass72 == null || prevSignal == null) {
                        return anonymousClass72 == null && prevSignal == null;
                    }
                    A8S = anonymousClass72.A8S(prevSignal);
                    String[] strArr3 = A03;
                    if (strArr3[7].length() != strArr3[3].length()) {
                        String[] strArr4 = A03;
                        strArr4[6] = "3Jq7wk4KgDHXBRv7A";
                        strArr4[2] = "zXvlpWgAojYXCnWeF";
                    }
                }
                throw new RuntimeException();
            } while (A8S);
            return false;
        }
    }
}
