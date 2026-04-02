package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.facebook.ads.sync.SyncModifiableBundle;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* renamed from: com.facebook.ads.redexgen.X.3j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03073j implements GR, RP {
    public static byte[] A0A;
    public static String[] A0B = {"5Oiv1GLvIq7zEHzIHOTPzi3kaYzi9CKu", "OYJ8Vha7o3AKqeq5fQgjy4YAYzCEKBrH", "4fHxCa0vWIAizdOtLSYViH6HX8wZM136", "7SeobKfCaIBp1RCtBr0PVzHsRPnznuT1", "fOxTiSwrZex6", "3vZIMeafrjOpHP1eiyT8MHuy7IIJRNdQ", "XI5vdZH0G6FndxBvW8fNBqRq2FpLqBJ1", "pJZH6qXQIaEu24ksEJ9XliOUqsc1pAkZ"};
    public final C8U A00;
    public final InterfaceC04278l A01;
    public final InterfaceC0875Qv A02;
    public final RQ A03;
    public final RY A04;
    public final RZ A05;
    public final String A06;
    public final Map<RL, GV> A09 = new HashMap();
    public final Map<RL, C4L> A08 = new HashMap();
    public final List<InterfaceC0883Rd> A07 = new ArrayList();

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0A = new byte[]{101, -82, -72, 101, -73, -86, -72, -71, -73, -82, -88, -71, -86, -87, 115, 101, -104, -80, -82, -75, -75, -82, -77, -84, 101, -72, -66, -77, -88, -48, -1, -1, -81, -8, -3, -81, -15, -16, -14, -6, -10, 1, -2, 4, -3, -13, -67, -54, -24, -11, -11, -10, -5, -89, -22, -7, -20, -24, -5, -20, -89, -6, -20, -7, -3, -20, -7, -89, -23, -4, -11, -21, -13, -20, -89, -2, -16, -5, -17, -89, -11, -10, -11, -76, -6, -20, -7, -3, -20, -7, -89, -10, -2, -11, -20, -21, -89, -23, -4, -11, -21, -13, -20, -89, -48, -53, -85, -56, -37, -56, -121, -41, -39, -42, -54, -52, -38, -38, -48, -43, -50, -121, -42, -41, -37, -48, -42, -43, -121, -49, -12, -4, -25, -14, -17, -22, -90, -8, -21, -20, -8, -21, -7, -18, -90, -6, -17, -13, -21, -64, -90, -85, -22, -79, -56, -38, -125, -42, -56, -43, -39, -56, -43, -112, -46, -38, -47, -56, -57, -125, -59, -40, -47, -57, -49, -56, -125, -58, -43, -56, -60, -41, -56, -57, -99, -125, -120, -42, -101, -63, -74, -85, -80, -70, -73, -74, -79, -62, -87, -68, -79, -73, -74, 104, -70, -83, -71, -67, -83, -69, -68, 104, -68, -73, 104, 109, -69, -126, 82, 109, -69, -88, -50, -61, -72, -67, -57, -60, -61, -66, -49, -74, -55, -66, -60, -61, 117, -57, -70, -56, -59, -60, -61, -56, -70, -113, 95, 122, -56, 114, -104, -115, -126, -121, -111, -114, -115, -120, -103, Byte.MIN_VALUE, -109, -120, -114, -115, 63, -111, -108, -115, 63, -123, Byte.MIN_VALUE, -120, -117, -124, -125, 90, 63, -123, -114, -111, -126, -120, -115, -122, 63, -120, -115, 63, 68, -125, 63, -110, -124, -126, -114, -115, -125, -110, -103, -84, -91, -101, -93, -100, -86, -107, -95, -96, -90, -105, -86, -90, -122, -125, -106, -125, -89, -86, -81, -88, -90, -77, -79, -77, -86, -81, -75, -39, -54, -30, -43, -40, -54, -51, -90, -45, -58, -57, -45, -58, -44, -55, -40, -53, -41, -37, -53, -39, -38, -34, -47, -33, -36, -37, -38, -33, -47, -59, -73, -60, -56, -73, -60, -95, -55, -64, -73, -74, -108, -57, -64, -74, -66, -73, -107, -60, -73, -77, -58, -73, -74, -19, -13, -24, -35, -30, -20, -23, -24, -29, -12, -37, -18, -29, -23, -24, -64, -29, -24, -29, -19, -30, -33, -34, -44, -38, -49, -60, -55, -45, -48, -49, -54, -37, -62, -43, -54, -48, -49, -76, -43, -62, -45, -43, -58, -59, -73, -92, -75, -86, -88, -73, -94, -75, -88, -87, -75, -88, -74, -85, -94, -74};
    }

    static {
        A05();
    }

    public C03073j(C8U c8u, InterfaceC04278l interfaceC04278l, InterfaceC0875Qv interfaceC0875Qv, String str, RZ rz, RY ry, RO ro) {
        this.A00 = c8u;
        this.A01 = interfaceC04278l;
        this.A02 = interfaceC0875Qv;
        this.A06 = str;
        this.A05 = rz;
        this.A04 = ry;
        this.A03 = ro.A4B(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int i2 = jSONObject.getJSONObject(A01(335, 7, 80)).getInt(A01(426, 16, 50));
        if (i2 > 0) {
            return i2;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 117), Integer.valueOf(i2)));
    }

    private Set<InterfaceC0882Rc> A02(JSONObject responseObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = responseObject.getJSONObject(A01(349, 8, 91));
        JSONObject jSONObject2 = responseObject.getJSONObject(A01(298, 7, 38));
        for (final GV gv : this.A09.values()) {
            int i2 = C0881Rb.A01[EnumC0887Rh.A00(jSONObject.getString(gv.A6k().A03())).ordinal()];
            if (i2 == 1) {
                final JSONObject jSONObject3 = jSONObject2.getJSONObject(gv.A6k().A03()).getJSONObject(A01(312, 4, 17));
                final JSONObject optJSONObject = jSONObject2.getJSONObject(gv.A6k().A03()).optJSONObject(A01(316, 11, 48));
                hashSet.add(new GN(gv, jSONObject3, optJSONObject) { // from class: com.facebook.ads.redexgen.X.3m
                    public final JSONObject A00;
                    @Nullable
                    public final JSONObject A01;

                    {
                        EnumC0887Rh enumC0887Rh = EnumC0887Rh.A03;
                        this.A00 = jSONObject3;
                        this.A01 = optJSONObject;
                    }

                    @Override // com.facebook.ads.redexgen.X.GN, com.facebook.ads.redexgen.X.InterfaceC0882Rc
                    public final void A3N(Map<RK, EnumC0887Rh> map, Map<GS, RU> map2) {
                        super.A00.A05(this.A00, this.A01);
                        super.A3N(map, map2);
                    }
                });
            } else if (i2 == 2) {
                hashSet.add(new GN(gv) { // from class: com.facebook.ads.redexgen.X.3l
                    {
                        EnumC0887Rh enumC0887Rh = EnumC0887Rh.A04;
                    }
                });
            } else {
                throw new AssertionError();
            }
        }
        for (final C4L c4l : this.A08.values()) {
            int i3 = C0881Rb.A00[RU.A00(jSONObject.getString(c4l.A6k().A03())).ordinal()];
            if (i3 == 1) {
                hashSet.add(new GO(c4l) { // from class: com.facebook.ads.redexgen.X.45
                    {
                        RU ru = RU.A04;
                    }
                });
            } else if (i3 == 2) {
                hashSet.add(new GO(c4l) { // from class: com.facebook.ads.redexgen.X.3k
                    {
                        RU ru = RU.A05;
                    }

                    @Override // com.facebook.ads.redexgen.X.GO, com.facebook.ads.redexgen.X.InterfaceC0882Rc
                    public final void A3N(Map<RK, EnumC0887Rh> map, Map<GS, RU> map2) {
                        this.A01.A06();
                        super.A3N(map, map2);
                    }
                });
            } else {
                throw new AssertionError();
            }
        }
        return hashSet;
    }

    private JSONObject A03(Map<RK, EnumC0886Rg> map, Map<GS, RT> map2, Map<GS, JSONObject> map3, Map<GS, JSONObject> map4) throws JSONException {
        String A01;
        JSONObject bundleData = new JSONObject();
        for (Map.Entry<RK, EnumC0886Rg> entry : map.entrySet()) {
            bundleData.put(entry.getKey().A6k().A03(), entry.getValue().A02());
        }
        for (Map.Entry<GS, RT> entry2 : map2.entrySet()) {
            bundleData.put(entry2.getKey().A6k().A03(), entry2.getValue().A02());
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<RK, EnumC0886Rg>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A01 = A01(316, 11, 48);
            if (!hasNext) {
                break;
            }
            Map.Entry<RK, EnumC0886Rg> next = it.next();
            if (next.getValue() == EnumC0886Rg.A04) {
                JSONObject jSONObject2 = new JSONObject();
                RK key = next.getKey();
                jSONObject.put(key.A6k().A03(), jSONObject2);
                RK bundle = next.getKey();
                if (bundle.A6k().A04()) {
                    jSONObject2.put(A01, key.A6f());
                } else {
                    jSONObject2.put(A01, JSONObject.NULL);
                }
                jSONObject.put(key.A6k().A03(), jSONObject2);
            }
        }
        for (Map.Entry<GS, RT> entry3 : map2.entrySet()) {
            JSONObject jSONObject3 = new JSONObject();
            GS key2 = entry3.getKey();
            RK bundle2 = entry3.getKey();
            jSONObject3.put(A01, map4.get(bundle2));
            if (entry3.getValue() == RT.A05) {
                jSONObject3.put(A01(312, 4, 17), map3.get(key2));
                jSONObject.put(key2.A6k().A03(), jSONObject3);
            } else {
                String A03 = key2.A6k().A03();
                String[] strArr = A0B;
                if (strArr[1].charAt(20) == strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                A0B[5] = "j6hI8A69HBwx3QyEu85lNgwu8aXeWQ7U";
                jSONObject.put(A03, jSONObject3);
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A6W().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject4.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(A01(342, 7, 85), bundleData);
        jSONObject5.put(A01(298, 7, 38), jSONObject);
        jSONObject5.put(A01(305, 7, 33), jSONObject4);
        return jSONObject5;
    }

    private void A04() throws Throwable {
        Map<RK, EnumC0886Rg> hashMap = new HashMap<>();
        Map<GS, RT> hashMap2 = new HashMap<>();
        Map<GS, JSONObject> hashMap3 = new HashMap<>();
        Map<GS, JSONObject> hashMap4 = new HashMap<>();
        synchronized (this) {
            for (RK rk : this.A09.values()) {
                if (rk.A8c()) {
                    hashMap.put(rk, EnumC0886Rg.A04);
                } else {
                    hashMap.put(rk, EnumC0886Rg.A03);
                }
            }
            AtomicReference<JSONObject> atomicReference = new AtomicReference<>();
            AtomicReference<JSONObject> atomicReference2 = new AtomicReference<>();
            for (C4L c4l : this.A08.values()) {
                if (c4l.A8c()) {
                    if (c4l.A07(atomicReference, atomicReference2)) {
                        hashMap2.put(c4l, RT.A05);
                        hashMap3.put(c4l, atomicReference.get());
                    } else {
                        hashMap2.put(c4l, RT.A04);
                    }
                    hashMap4.put(c4l, atomicReference2.get());
                }
            }
            Iterator<InterfaceC0883Rd> it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(404, 22, 80));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference<Throwable> failureContainer = new AtomicReference<>();
        AtomicReference atomicReference3 = new AtomicReference();
        JSONObject A03 = A03(hashMap, hashMap2, hashMap3, hashMap4);
        String.format(Locale.US, A01(188, 33, 55), this.A06, A03.toString(2));
        InterfaceC0875Qv interfaceC0875Qv = this.A02;
        String str = this.A06;
        interfaceC0875Qv.AD9(str, (A01(327, 8, 88) + URLEncoder.encode(A03.toString())).getBytes(), new GP(this, failureContainer, atomicReference3, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference3.get() == null) {
                JSONObject syncRequest = (JSONObject) failureContainer.get();
                Set<InterfaceC0882Rc> A02 = A02(syncRequest);
                Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint = new HashMap<>();
                HashMap hashMap5 = new HashMap();
                for (InterfaceC0882Rc response : A02) {
                    response.A3N(clientBundleFingerprint, hashMap5);
                }
                this.A03.A5R(A00((JSONObject) failureContainer.get()));
                Iterator<InterfaceC0883Rd> it2 = this.A07.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw new NullPointerException(A01(381, 23, 105));
                }
            } else {
                throw ((Throwable) atomicReference3.get());
            }
        }
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, 68), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e2) {
            atomicReference2.set(e2);
        }
    }

    private synchronized void A08(Throwable th) {
        Iterator<InterfaceC0883Rd> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(381, 23, 105));
        }
    }

    @Override // com.facebook.ads.redexgen.X.GR
    public final synchronized RK A4N(RL rl) {
        if (rl.A02() == RN.A03) {
            if (this.A09.containsKey(rl)) {
                return this.A09.get(rl);
            }
            GV gv = new GV(rl);
            this.A09.put(rl, gv);
            Iterator<InterfaceC0883Rd> it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(357, 24, 65));
            }
            String.format(Locale.US, A01(153, 35, 82), rl);
            return gv;
        }
        throw new IllegalArgumentException(A01(47, 59, 118));
    }

    @Override // com.facebook.ads.redexgen.X.GR, com.facebook.ads.redexgen.X.InterfaceC04198a
    public final void A5T() {
        this.A03.A5S();
    }

    @Override // com.facebook.ads.redexgen.X.RP
    @SuppressLint({"CatchGeneralException"})
    public final void AEJ() {
        if (this.A01.A8d()) {
            String str = A01(106, 23, 86) + this.A01.A6J().A07() + A01(0, 29, 52);
            A08(new C0885Rf());
            return;
        }
        try {
            if (!JQ.A1K(this.A00) || this.A00.A02().A8V()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 126));
        } catch (Throwable th) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int A01 = this.A04.A01();
            if (A0B[5].charAt(3) != 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[2] = "JEtZyGAVdUTB5WRsJGoBqRot3n7K2sjz";
            strArr[3] = "em0I48mZsoEuthzWerVnjSUWeJS3cW5z";
            objArr[0] = Integer.valueOf(A01);
            String.format(locale, A01(249, 49, 14), objArr);
            A08(th);
            this.A03.A5R(this.A04.A01());
        }
    }
}
