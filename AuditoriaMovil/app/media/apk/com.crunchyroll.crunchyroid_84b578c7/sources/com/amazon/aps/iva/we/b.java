package com.amazon.aps.iva.we;

import com.crunchyroll.billingnotifications.card.c;
/* compiled from: TimeLeftMapper.kt */
/* loaded from: classes.dex */
public final class b implements a {
    @Override // com.amazon.aps.iva.we.a
    public final c.g a(long j) {
        long j2 = 60;
        long j3 = ((j / 1000) / j2) / j2;
        long j4 = j3 / 24;
        long j5 = 30;
        long j6 = j4 / j5;
        if (j6 > 0) {
            long j7 = j5 * j6;
            if (j7 == j4) {
                return new c.d(j6);
            }
            return new c.e(j6, j4 - j7);
        } else if (j4 > 0) {
            return new c.a(j4);
        } else {
            if (j3 == 0) {
                return new c.C0953c(1L);
            }
            return new c.C0953c(j3);
        }
    }
}
