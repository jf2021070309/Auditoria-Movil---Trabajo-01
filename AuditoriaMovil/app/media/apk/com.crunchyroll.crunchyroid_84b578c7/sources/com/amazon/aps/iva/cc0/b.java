package com.amazon.aps.iva.cc0;

import com.amazon.aps.iva.yb0.j;
import java.util.Random;
/* compiled from: PlatformRandom.kt */
/* loaded from: classes4.dex */
public final class b extends com.amazon.aps.iva.cc0.a {
    public final a d = new a();

    /* compiled from: PlatformRandom.kt */
    /* loaded from: classes4.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // com.amazon.aps.iva.cc0.a
    public final Random e() {
        Random random = this.d.get();
        j.e(random, "implStorage.get()");
        return random;
    }
}
