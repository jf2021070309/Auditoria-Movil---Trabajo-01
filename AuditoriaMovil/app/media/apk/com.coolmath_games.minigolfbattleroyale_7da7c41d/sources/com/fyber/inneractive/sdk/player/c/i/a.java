package com.fyber.inneractive.sdk.player.c.i;

import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class a implements e {
    protected final com.fyber.inneractive.sdk.player.c.g.h a;
    protected final int b;
    protected final int[] c;
    private final com.fyber.inneractive.sdk.player.c.h[] d;
    private final long[] e;
    private int f;

    public a(com.fyber.inneractive.sdk.player.c.g.h hVar, int... iArr) {
        com.fyber.inneractive.sdk.player.c.k.a.b(true);
        this.a = (com.fyber.inneractive.sdk.player.c.g.h) com.fyber.inneractive.sdk.player.c.k.a.a(hVar);
        this.b = 1;
        this.d = new com.fyber.inneractive.sdk.player.c.h[1];
        int i = 0;
        for (int i2 = 0; i2 <= 0; i2++) {
            this.d[0] = hVar.b[iArr[0]];
        }
        Arrays.sort(this.d, new C0062a((byte) 0));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = hVar.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.i.e
    public final com.fyber.inneractive.sdk.player.c.g.h a() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.player.c.i.e
    public final int b() {
        return this.c.length;
    }

    @Override // com.fyber.inneractive.sdk.player.c.i.e
    public final com.fyber.inneractive.sdk.player.c.h a(int i) {
        return this.d[i];
    }

    @Override // com.fyber.inneractive.sdk.player.c.i.e
    public final int b(int i) {
        return this.c[i];
    }

    @Override // com.fyber.inneractive.sdk.player.c.i.e
    public final com.fyber.inneractive.sdk.player.c.h c() {
        return this.d[0];
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && Arrays.equals(this.c, aVar.c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0062a implements Comparator<com.fyber.inneractive.sdk.player.c.h> {
        private C0062a() {
        }

        /* synthetic */ C0062a(byte b) {
            this();
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(com.fyber.inneractive.sdk.player.c.h hVar, com.fyber.inneractive.sdk.player.c.h hVar2) {
            return hVar2.b - hVar.b;
        }
    }
}
