package com.amazon.aps.iva.ze0;

import com.amazon.aps.iva.xe0.q;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: Semaphore.kt */
/* loaded from: classes4.dex */
public final class j extends q<j> {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j, j jVar, int i) {
        super(j, jVar, i);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // com.amazon.aps.iva.xe0.q
    public final int f() {
        return i.f;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
