package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.6b  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03756b implements SensorEventListener {
    public static byte[] A09;
    public static String[] A0A = {"LMEfueB4gayQvpRN8xXm9AklEevQLqxV", "qKD5N87REqvFR6TOuYJE2bL", "", "yxtXe6d26bGgo70LmfUKAtnwRWe4i0hP", "QGB0NXt3pt8pLttf5OCs6Mo1nTnYeT90", "cpHchmbIsy8OjJq5SMyv1Bjwv0Y4tWtv", "hkg18epqSSQRsZzRGzTmSQr5c5v3YJAV", "CsdF03UMAkfQBN54GO6xo56"};
    public C6Z A00;
    public final Context A01;
    public final SensorManager A02;
    public final C6W A04;
    public final C6Y A05;
    public final EnumC03996z A06;
    public final List<Sensor> A07;
    public final Map<Integer, EnumC03796f> A08 = new HashMap();
    public final Handler A03 = new Handler(C7G.A00().A03().getLooper());

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0A[3].charAt(12) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "dphTU4VZCJVUxlSWVafH1ZM";
            strArr[1] = "vTUzDZVZybplSM6lZClu7qj";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 84);
            i5++;
        }
    }

    public static void A01() {
        A09 = new byte[]{-3, -17, -8, -3, -7, -4};
    }

    static {
        A01();
    }

    public C03756b(Context context, C6W c6w, EnumC03996z enumC03996z) {
        this.A01 = context;
        this.A02 = (SensorManager) context.getSystemService(A00(0, 6, 54));
        this.A07 = this.A02.getSensorList(-1);
        this.A04 = c6w;
        this.A05 = new C6Y(this.A04, enumC03996z);
        this.A06 = enumC03996z;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.6Z] */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A02(List<EnumC03796f> list) {
        int A02;
        try {
            for (EnumC03796f enumC03796f : list) {
                if (enumC03796f != null && (A02 = enumC03796f.A02()) != -1 && this.A08.get(Integer.valueOf(enumC03796f.ordinal())) == null) {
                    if (A02 == 0) {
                        if (C03746a.A00[enumC03796f.ordinal()] == 1) {
                            this.A05.A02(this.A01);
                        }
                    } else {
                        for (Sensor sensor : this.A07) {
                            if (A02 == sensor.getType()) {
                                this.A00 = new SensorEventListener(this) { // from class: com.facebook.ads.redexgen.X.6Z
                                    public final SensorEventListener A00;

                                    {
                                        this.A00 = this;
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onAccuracyChanged(Sensor sensor2, int i2) {
                                        try {
                                            this.A00.onAccuracyChanged(sensor2, i2);
                                        } catch (Throwable th) {
                                            C6O.A03(th);
                                        }
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onSensorChanged(SensorEvent sensorEvent) {
                                        try {
                                            this.A00.onSensorChanged(sensorEvent);
                                        } catch (Throwable th) {
                                            C6O.A03(th);
                                        }
                                    }
                                };
                                this.A02.registerListener(this.A00, sensor, 3, this.A03);
                                this.A08.put(Integer.valueOf(enumC03796f.ordinal()), enumC03796f);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A03(List<EnumC03796f> list) {
        try {
        } catch (Throwable t) {
            C6O.A03(t);
        }
        if (this.A08 == null) {
            return;
        }
        if (list == null) {
            this.A02.unregisterListener(this.A00);
            this.A05.A01();
            this.A08.clear();
            return;
        }
        for (EnumC03796f enumC03796f : list) {
            int A02 = enumC03796f.A02();
            if (A0A[5].charAt(31) != 'v') {
                Throwable t2 = new RuntimeException();
                throw t2;
            }
            A0A[2] = "A8Tij6HFi5g0fGh7y9Y4xTKtDJl0XAe";
            if (A02 != -1) {
                if (enumC03796f.A02() == 0) {
                    this.A08.remove(Integer.valueOf(enumC03796f.ordinal()));
                    if (C03746a.A00[enumC03796f.ordinal()] == 1) {
                        this.A05.A01();
                    }
                }
                Iterator<Sensor> it = this.A07.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Sensor next = it.next();
                        if (enumC03796f.A02() == next.getType()) {
                            this.A02.unregisterListener(this.A00, next);
                            this.A08.remove(Integer.valueOf(enumC03796f.ordinal()));
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r9 != 18) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r9 == 20) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r9 == 12) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r9 == 13) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
        if (r9 != 18) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
        r13.A04.A02(new com.facebook.ads.redexgen.X.Y2(r3, r1, r14.values[0]), com.facebook.ads.redexgen.X.C6V.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
        r13.A04.A02(new com.facebook.ads.redexgen.X.Y2(r3, r1, r14.values[0]), com.facebook.ads.redexgen.X.C6V.A0C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
        r13.A04.A02(new com.facebook.ads.redexgen.X.C1054Xw(r3, r1, new com.facebook.ads.redexgen.X.C03786e(new float[]{r14.values[0], r14.values[1], r14.values[2], r14.values[3]})), com.facebook.ads.redexgen.X.C6V.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
        r13.A04.A02(new com.facebook.ads.redexgen.X.Y2(r3, r1, r14.values[0]), com.facebook.ads.redexgen.X.C6V.A0D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @Override // android.hardware.SensorEventListener
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r14) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C03756b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
