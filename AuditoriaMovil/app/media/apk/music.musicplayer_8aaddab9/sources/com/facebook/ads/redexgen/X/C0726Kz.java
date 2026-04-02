package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.Kz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0726Kz {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC0724Kx> A02 = new AtomicReference<>();

    @SuppressLint({"RethrownThrowableArgument"})
    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            LE.A00().A8p(3306, th);
            InterfaceC0724Kx interfaceC0724Kx = A02.get();
            if (interfaceC0724Kx != null) {
                interfaceC0724Kx.ADx(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z, InterfaceC0724Kx interfaceC0724Kx) {
        A01.set(z);
        A02.set(interfaceC0724Kx);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
