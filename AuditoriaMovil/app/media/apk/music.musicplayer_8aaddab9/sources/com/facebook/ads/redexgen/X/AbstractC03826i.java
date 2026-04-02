package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.6i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC03826i {
    public static String[] A02 = {"HSkcF60AiAyYJizD2I8vIjqhfibhLk4F", "vdkNajAjw36u5RvY9xFki59AuKhwr3og", "", "sseZ8EdYk7i", "1PxOfa9BsFlCUZKt15VhEMgvVyvUPrjN", "QpqokUuVk7nKJb7TmK", "vU9iDbhGXBQk4voVJMEMlbxkWIFvNann", "KoP5O6PQnxDmDbSqeBv0xhaZ"};
    public final Context A00;
    public final C6C A01;

    public AbstractC03826i(Context context, C6C c6c) {
        this.A00 = context;
        this.A01 = c6c;
    }

    private int A00(C6C c6c, C03926s c03926s) {
        if (c6c.A0e(c03926s.A00()) != null) {
            return c6c.A0e(c03926s.A00()).intValue();
        }
        if (c03926s.A03().contains(EnumC03996z.A0B)) {
            return c6c.A0S();
        }
        if (c03926s.A03().contains(EnumC03996z.A08)) {
            return c6c.A0R();
        }
        return c6c.A0V();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A01(EnumC03966w enumC03966w, List<C03926s> list) {
        C7A A5I;
        C7A c7a;
        Map<Integer, C6H<C7A>> A03 = C03976x.A01().A03();
        for (C03926s c03926s : list) {
            InterfaceC03956v signalExecutor = c03926s.A02(enumC03966w);
            if (signalExecutor != null && (A5I = signalExecutor.A5I()) != null && A5I.A07() != null) {
                if (c03926s.A03().contains(EnumC03996z.A0B) && A03.containsKey(Integer.valueOf(c03926s.A00()))) {
                    C6H<C7A> c6h = A03.get(Integer.valueOf(c03926s.A00()));
                    if (c6h != null) {
                        c7a = c6h.A02();
                    } else {
                        c7a = null;
                    }
                    if (c6h == null) {
                        c6h = new C6H<>(A00(this.A01, c03926s));
                    }
                    if (c7a == null || !A5I.A0B(c7a, c03926s.A03())) {
                        c6h.A04(A5I);
                        C03976x.A01().A04(c03926s.A00(), c6h, A5I.A05());
                    }
                } else {
                    C6H<C7A> c6h2 = new C6H<>(A00(this.A01, c03926s));
                    c6h2.A04(A5I);
                    C03976x.A01().A04(c03926s.A00(), c6h2, A5I.A05());
                }
            }
        }
        String[] strArr = A02;
        if (strArr[0].charAt(9) == strArr[1].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "mCdjiAVU6tB7YULC7P";
        strArr2[2] = "";
    }
}
