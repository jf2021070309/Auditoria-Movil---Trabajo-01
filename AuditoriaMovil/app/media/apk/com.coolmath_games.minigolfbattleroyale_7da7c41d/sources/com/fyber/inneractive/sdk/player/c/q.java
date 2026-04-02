package com.fyber.inneractive.sdk.player.c;
/* loaded from: classes.dex */
public abstract class q {
    public static final q a = new q() { // from class: com.fyber.inneractive.sdk.player.c.q.1
        @Override // com.fyber.inneractive.sdk.player.c.q
        public final int a(Object obj) {
            return -1;
        }

        @Override // com.fyber.inneractive.sdk.player.c.q
        public final int b() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.c.q
        public final int c() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.c.q
        public final b a(int i, b bVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.fyber.inneractive.sdk.player.c.q
        public final a a(int i, a aVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    };

    /* loaded from: classes.dex */
    public static final class a {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public boolean e;
        public long f;
    }

    /* loaded from: classes.dex */
    public static final class b {
        public Object a;
        public long b;
        public long c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;
    }

    public abstract int a(Object obj);

    public abstract a a(int i, a aVar, boolean z);

    public abstract b a(int i, b bVar, long j);

    public abstract int b();

    public abstract int c();

    public final boolean a() {
        return b() == 0;
    }
}
