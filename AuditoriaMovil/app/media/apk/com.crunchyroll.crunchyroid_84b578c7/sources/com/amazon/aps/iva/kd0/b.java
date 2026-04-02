package com.amazon.aps.iva.kd0;

import com.amazon.aps.iva.id0.b;
import com.amazon.aps.iva.id0.j;
import com.amazon.aps.iva.id0.w;
import com.amazon.aps.iva.od0.i;
/* compiled from: Flags.java */
/* loaded from: classes4.dex */
public final class b {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a a;
    public static final a b;
    public static final a c;
    public static final C0442b d;
    public static final C0442b e;
    public static final C0442b f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final C0442b o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;

    /* compiled from: Flags.java */
    /* loaded from: classes4.dex */
    public static class a extends c<Boolean> {
        public a(int i) {
            super(i, 1);
        }

        public final Boolean c(int i) {
            boolean z = true;
            if ((i & (1 << this.a)) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        public final int d(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.a;
            }
            return 0;
        }
    }

    /* compiled from: Flags.java */
    /* renamed from: com.amazon.aps.iva.kd0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0442b<E extends i.a> extends c<E> {
        public final E[] c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0442b(int r5, E[] r6) {
            /*
                r4 = this;
                if (r6 == 0) goto L33
                int r0 = r6.length
                r1 = 1
                int r0 = r0 - r1
                if (r0 != 0) goto L8
                goto L12
            L8:
                r2 = 31
            La:
                if (r2 < 0) goto L1b
                int r3 = r1 << r2
                r3 = r3 & r0
                if (r3 == 0) goto L18
                int r1 = r1 + r2
            L12:
                r4.<init>(r5, r1)
                r4.c = r6
                return
            L18:
                int r2 = r2 + (-1)
                goto La
            L1b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Empty enum: "
                r0.<init>(r1)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L33:
                java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField"
                java.lang.String r6 = "bitWidth"
                java.lang.String r0 = "enumEntries"
                java.lang.Object[] r5 = new java.lang.Object[]{r0, r5, r6}
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kd0.b.C0442b.<init>(int, com.amazon.aps.iva.od0.i$a[]):void");
        }

        public final Object c(int i) {
            E[] eArr;
            int i2 = this.a;
            int i3 = (i & (((1 << this.b) - 1) << i2)) >> i2;
            for (E e : this.c) {
                if (e.getNumber() == i3) {
                    return e;
                }
            }
            return null;
        }
    }

    /* compiled from: Flags.java */
    /* loaded from: classes4.dex */
    public static abstract class c<E> {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static a a(c<?> cVar) {
            return new a(cVar.a + cVar.b);
        }

        public static a b() {
            return new a(0);
        }
    }

    static {
        a b2 = c.b();
        a = b2;
        b = c.a(b2);
        a b3 = c.b();
        c = b3;
        C0442b c0442b = new C0442b(1, w.values());
        d = c0442b;
        j[] values = j.values();
        int i2 = 1 + c0442b.b;
        C0442b c0442b2 = new C0442b(i2, values);
        e = c0442b2;
        b.c[] values2 = b.c.values();
        int i3 = c0442b2.b;
        C0442b c0442b3 = new C0442b(i2 + i3, values2);
        f = c0442b3;
        a a2 = c.a(c0442b3);
        g = a2;
        a a3 = c.a(a2);
        h = a3;
        a a4 = c.a(a3);
        i = a4;
        a a5 = c.a(a4);
        j = a5;
        a a6 = c.a(a5);
        k = a6;
        l = c.a(a6);
        a a7 = c.a(c0442b);
        m = a7;
        n = c.a(a7);
        C0442b c0442b4 = new C0442b(i2 + i3, com.amazon.aps.iva.id0.i.values());
        o = c0442b4;
        a a8 = c.a(c0442b4);
        p = a8;
        a a9 = c.a(a8);
        q = a9;
        a a10 = c.a(a9);
        r = a10;
        a a11 = c.a(a10);
        s = a11;
        a a12 = c.a(a11);
        t = a12;
        a a13 = c.a(a12);
        u = a13;
        a a14 = c.a(a13);
        v = a14;
        w = c.a(a14);
        a a15 = c.a(c0442b4);
        x = a15;
        a a16 = c.a(a15);
        y = a16;
        a a17 = c.a(a16);
        z = a17;
        a a18 = c.a(a17);
        A = a18;
        a a19 = c.a(a18);
        B = a19;
        a a20 = c.a(a19);
        C = a20;
        a a21 = c.a(a20);
        D = a21;
        a a22 = c.a(a21);
        E = a22;
        F = c.a(a22);
        a a23 = c.a(b3);
        G = a23;
        a a24 = c.a(a23);
        H = a24;
        I = c.a(a24);
        a a25 = c.a(c0442b2);
        J = a25;
        a a26 = c.a(a25);
        K = a26;
        L = c.a(a26);
        M = c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.kd0.b.a(int):void");
    }
}
