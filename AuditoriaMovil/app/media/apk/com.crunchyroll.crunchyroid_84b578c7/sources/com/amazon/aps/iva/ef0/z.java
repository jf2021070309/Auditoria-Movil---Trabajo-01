package com.amazon.aps.iva.ef0;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SegmentPool.kt */
/* loaded from: classes4.dex */
public final class z {
    public static final y a = new y(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference<y>[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference<y>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(y yVar) {
        boolean z;
        int i;
        if (yVar.f == null && yVar.g == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (yVar.d) {
                return;
            }
            AtomicReference<y> atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
            y yVar2 = a;
            y andSet = atomicReference.getAndSet(yVar2);
            if (andSet == yVar2) {
                return;
            }
            if (andSet != null) {
                i = andSet.c;
            } else {
                i = 0;
            }
            if (i >= 65536) {
                atomicReference.set(andSet);
                return;
            }
            yVar.f = andSet;
            yVar.b = 0;
            yVar.c = i + 8192;
            atomicReference.set(yVar);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final y b() {
        AtomicReference<y> atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        y yVar = a;
        y andSet = atomicReference.getAndSet(yVar);
        if (andSet == yVar) {
            return new y();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new y();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
