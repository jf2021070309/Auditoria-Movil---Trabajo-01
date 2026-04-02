package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class b {
    public static void a(AtomicLong atomicLong, int i) {
        g b = j.m().b();
        if (b == null || !b.e() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
