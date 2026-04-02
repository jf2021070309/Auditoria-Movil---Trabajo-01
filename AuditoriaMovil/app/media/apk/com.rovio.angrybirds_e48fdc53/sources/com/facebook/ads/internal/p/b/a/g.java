package com.facebook.ads.internal.p.b.a;

import java.io.File;
/* loaded from: classes2.dex */
public class g extends e {
    private final long a;

    public g(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.a = j;
    }

    @Override // com.facebook.ads.internal.p.b.a.e, com.facebook.ads.internal.p.b.a.a
    public /* bridge */ /* synthetic */ void a(File file) {
        super.a(file);
    }

    @Override // com.facebook.ads.internal.p.b.a.e
    protected boolean a(File file, long j, int i) {
        return j <= this.a;
    }
}
