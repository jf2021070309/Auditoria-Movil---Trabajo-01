package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class g {
    private static final AtomicReference<Long> a = new AtomicReference<>(0L);

    public static void a(long j) {
        for (int i = 0; i < 5; i++) {
            AtomicReference<Long> atomicReference = a;
            long longValue = atomicReference.get().longValue();
            if (atomicReference.compareAndSet(Long.valueOf(longValue), Long.valueOf(longValue | j))) {
                return;
            }
        }
    }
}
