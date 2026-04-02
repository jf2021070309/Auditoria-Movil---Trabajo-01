package com.amazon.aps.iva.xe0;

import com.amazon.aps.iva.xe0.q;
import com.google.android.gms.cast.Cast;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes4.dex */
public abstract class q<S extends q<S>> extends c<S> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public q(long j, S s, int i) {
        super(s);
        this.c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // com.amazon.aps.iva.xe0.c
    public final boolean b() {
        if (this.cleanedAndPointers == f() && !c()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (d.addAndGet(this, -65536) == f() && !c()) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public final boolean g() {
        int i;
        boolean z;
        do {
            i = this.cleanedAndPointers;
            if (i == f() && !c()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        } while (!d.compareAndSet(this, i, Cast.MAX_MESSAGE_LENGTH + i));
        return true;
    }
}
