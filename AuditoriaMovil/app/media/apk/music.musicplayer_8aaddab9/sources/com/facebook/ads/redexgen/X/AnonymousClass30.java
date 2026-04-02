package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
/* renamed from: com.facebook.ads.redexgen.X.30  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass30 extends C0503Bn implements Comparable<AnonymousClass30> {
    public long A00;

    public AnonymousClass30() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull AnonymousClass30 anonymousClass30) {
        if (A04() != anonymousClass30.A04()) {
            return A04() ? 1 : -1;
        }
        long j2 = ((C1024Ws) this).A00 - ((C1024Ws) anonymousClass30).A00;
        if (j2 == 0) {
            j2 = this.A00 - anonymousClass30.A00;
            if (j2 == 0) {
                return 0;
            }
        }
        return j2 > 0 ? 1 : -1;
    }
}
