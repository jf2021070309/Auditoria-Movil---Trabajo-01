package k;

import ch.qos.logback.core.rolling.helper.Compressor;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class t {
    public static final t a = new t();

    /* renamed from: b  reason: collision with root package name */
    public static final s f9645b = new s(new byte[0], 0, 0, false, false);

    /* renamed from: c  reason: collision with root package name */
    public static final int f9646c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference<s>[] f9647d;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9646c = highestOneBit;
        AtomicReference<s>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f9647d = atomicReferenceArr;
    }

    public static final void a(s sVar) {
        h.o.c.j.e(sVar, "segment");
        if (!(sVar.f9643f == null && sVar.f9644g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (sVar.f9641d) {
            return;
        }
        AtomicReference<s> atomicReference = f9647d[(int) (Thread.currentThread().getId() & (f9646c - 1))];
        s sVar2 = atomicReference.get();
        if (sVar2 == f9645b) {
            return;
        }
        int i2 = sVar2 == null ? 0 : sVar2.f9640c;
        if (i2 >= 65536) {
            return;
        }
        sVar.f9643f = sVar2;
        sVar.f9639b = 0;
        sVar.f9640c = i2 + Compressor.BUFFER_SIZE;
        if (atomicReference.compareAndSet(sVar2, sVar)) {
            return;
        }
        sVar.f9643f = null;
    }

    public static final s b() {
        AtomicReference<s> atomicReference = f9647d[(int) (Thread.currentThread().getId() & (f9646c - 1))];
        s sVar = f9645b;
        s andSet = atomicReference.getAndSet(sVar);
        if (andSet == sVar) {
            return new s();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new s();
        }
        atomicReference.set(andSet.f9643f);
        andSet.f9643f = null;
        andSet.f9640c = 0;
        return andSet;
    }
}
