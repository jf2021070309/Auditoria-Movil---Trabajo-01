package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;
@ThreadSafe
/* renamed from: com.facebook.ads.redexgen.X.ay  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1170ay implements C6E {
    public static String[] A06 = {"9Omy7cax2OJ4", "ulOhDbnf", "JfFg1yjSSK9TQh7N867q1b7oOj16BTWR", "cs88erT1Nmdhof2Vlv4YHjmvLJ5hV6oE", "codoSKf0AAHHcDxXKaV5ItDp", "Lc71QfpBcjqOx3z6Bpry4MoTnJ3L2Amk", "Bxh30V7DNH8aSp9XNgBHezc1nItbXmG0", "iIuCBEGs"};
    public EnumC03966w A00;
    public C7K A01;
    public C7L A02;
    public final C6C A03;
    public final C03816h A04;
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C1170ay(C6C c6c, C03816h c03816h) {
        this.A03 = c6c;
        this.A04 = c03816h;
    }

    private final synchronized void A04() {
        if (this.A02 != null && this.A05.get()) {
            this.A01.A01(this.A02);
            C7G.A00().A04();
            this.A04.A02();
            this.A05.compareAndSet(true, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.redexgen.X.7L] */
    public final synchronized void A05(final EnumC03966w enumC03966w) {
        if (this.A05.get() || enumC03966w == null) {
            return;
        }
        if (this.A03.A0k() && C7J.A0E(enumC03966w)) {
            this.A01 = new C7K(C7G.A00().A03().getLooper());
            this.A00 = enumC03966w;
            final Runnable runnable = new Runnable(enumC03966w) { // from class: com.facebook.ads.redexgen.X.6G
                public EnumC03966w A00;

                {
                    this.A00 = enumC03966w;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C03816h c03816h;
                    C7K c7k;
                    C7L c7l;
                    C6C c6c;
                    if (C0726Kz.A02(this)) {
                        return;
                    }
                    try {
                        c03816h = C1170ay.this.A04;
                        c03816h.A04(EnumC03986y.A03, this.A00, null);
                        c7k = C1170ay.this.A01;
                        c7l = C1170ay.this.A02;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        c6c = C1170ay.this.A03;
                        c7k.A02(c7l, timeUnit.toMillis(c6c.A0T()));
                    } catch (Throwable th) {
                        C0726Kz.A00(th, this);
                    }
                }
            };
            this.A02 = new Runnable(runnable) { // from class: com.facebook.ads.redexgen.X.7L
                public static String[] A01 = {"z7DaAYMF8mD5H3Qw6B0df8iWMA5TwaAo", "i1Wz58ppkDzwzyk3vUo3iJD7WEPTUBrQ", "4oPzuaqB78YGGa8PxFst9tbpOvboFZdU", "DouWW69VsyGxi7cZQAT3hM5mkvCiYUWz", "5sMQ3NVw4qAuaNcVNLKcvGJPjeyRgc94", "cawbZ6x1RsnaWkC6S2Mb4x7gKiXWIBBw", "BT64P8yXTg3gcHo3v2kn4U06ifDkl76a", "4iKgaC96n3YCvkeVNFuu4kvW5LMIVzNy"};
                public final Runnable A00;

                {
                    this.A00 = runnable;
                }

                @Override // java.lang.Runnable
                @SuppressLint({"CatchGeneralException"})
                public final void run() {
                    if (C0726Kz.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.run();
                    } catch (Throwable t) {
                        try {
                            C6O.A03(t);
                        } catch (Throwable th) {
                            if (A01[0].charAt(29) != 'a') {
                                Throwable t2 = new RuntimeException();
                                throw t2;
                            }
                            A01[0] = "SMPhcSCea3djEKnuzKFzvQw1eCBqlauj";
                            C0726Kz.A00(th, this);
                        }
                    }
                }
            };
            this.A04.A03(enumC03966w);
            this.A01.A00(this.A02);
            this.A05.compareAndSet(false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final synchronized void AFQ(EnumC03966w enumC03966w) {
        if (this.A00 == enumC03966w) {
            return;
        }
        this.A00 = enumC03966w;
        if (enumC03966w == EnumC03966w.A04) {
            A04();
        } else {
            A05(enumC03966w);
        }
        String[] strArr = A06;
        if (strArr[5].charAt(25) != strArr[3].charAt(25)) {
            throw new RuntimeException();
        }
        A06[6] = "6KXzTJPK6a3Rx51uMQDwScazunOB6mre";
    }
}
