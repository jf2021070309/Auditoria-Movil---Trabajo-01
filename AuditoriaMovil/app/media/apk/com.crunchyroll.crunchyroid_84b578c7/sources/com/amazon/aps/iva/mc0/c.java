package com.amazon.aps.iva.mc0;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.nd0.f;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum KFunction uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: FunctionClassKind.kt */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c KFunction;
    public static final c KSuspendFunction;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final com.amazon.aps.iva.nd0.c packageFqName;
    public static final c Function = new c("Function", 0, o.k, "Function", false, false);
    public static final c SuspendFunction = new c("SuspendFunction", 1, o.e, "SuspendFunction", true, false);

    /* compiled from: FunctionClassKind.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* compiled from: FunctionClassKind.kt */
        /* renamed from: com.amazon.aps.iva.mc0.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0511a {
            public final c a;
            public final int b;

            public C0511a(c cVar, int i) {
                this.a = cVar;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0511a)) {
                    return false;
                }
                C0511a c0511a = (C0511a) obj;
                if (this.a == c0511a.a && this.b == c0511a.b) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("KindWithArity(kind=");
                sb.append(this.a);
                sb.append(", arity=");
                return b2.b(sb, this.b, ')');
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.mc0.c.a.C0511a a(java.lang.String r8, com.amazon.aps.iva.nd0.c r9) {
            /*
                java.lang.String r0 = "packageFqName"
                com.amazon.aps.iva.yb0.j.f(r9, r0)
                com.amazon.aps.iva.mc0.c[] r0 = com.amazon.aps.iva.mc0.c.values()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            Lc:
                r4 = 1
                r5 = 0
                if (r3 >= r1) goto L2f
                r6 = r0[r3]
                com.amazon.aps.iva.nd0.c r7 = r6.getPackageFqName()
                boolean r7 = com.amazon.aps.iva.yb0.j.a(r7, r9)
                if (r7 == 0) goto L28
                java.lang.String r7 = r6.getClassNamePrefix()
                boolean r7 = com.amazon.aps.iva.oe0.m.h0(r8, r7, r2)
                if (r7 == 0) goto L28
                r7 = r4
                goto L29
            L28:
                r7 = r2
            L29:
                if (r7 == 0) goto L2c
                goto L30
            L2c:
                int r3 = r3 + 1
                goto Lc
            L2f:
                r6 = r5
            L30:
                if (r6 != 0) goto L33
                return r5
            L33:
                java.lang.String r9 = r6.getClassNamePrefix()
                int r9 = r9.length()
                java.lang.String r8 = r8.substring(r9)
                java.lang.String r9 = "this as java.lang.String).substring(startIndex)"
                com.amazon.aps.iva.yb0.j.e(r8, r9)
                int r9 = r8.length()
                if (r9 != 0) goto L4c
                r9 = r4
                goto L4d
            L4c:
                r9 = r2
            L4d:
                if (r9 == 0) goto L50
                goto L69
            L50:
                int r9 = r8.length()
                r0 = r2
                r1 = r0
            L56:
                if (r0 >= r9) goto L71
                char r3 = r8.charAt(r0)
                int r3 = r3 + (-48)
                if (r3 < 0) goto L66
                r7 = 10
                if (r3 >= r7) goto L66
                r7 = r4
                goto L67
            L66:
                r7 = r2
            L67:
                if (r7 != 0) goto L6b
            L69:
                r8 = r5
                goto L75
            L6b:
                int r1 = r1 * 10
                int r1 = r1 + r3
                int r0 = r0 + 1
                goto L56
            L71:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            L75:
                if (r8 == 0) goto L81
                int r8 = r8.intValue()
                com.amazon.aps.iva.mc0.c$a$a r9 = new com.amazon.aps.iva.mc0.c$a$a
                r9.<init>(r6, r8)
                return r9
            L81:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.mc0.c.a.a(java.lang.String, com.amazon.aps.iva.nd0.c):com.amazon.aps.iva.mc0.c$a$a");
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    static {
        com.amazon.aps.iva.nd0.c cVar = o.h;
        KFunction = new c("KFunction", 2, cVar, "KFunction", false, true);
        KSuspendFunction = new c("KSuspendFunction", 3, cVar, "KSuspendFunction", true, true);
        $VALUES = $values();
        Companion = new a();
    }

    private c(String str, int i, com.amazon.aps.iva.nd0.c cVar, String str2, boolean z, boolean z2) {
        this.packageFqName = cVar;
        this.classNamePrefix = str2;
        this.isSuspendType = z;
        this.isReflectType = z2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final com.amazon.aps.iva.nd0.c getPackageFqName() {
        return this.packageFqName;
    }

    public final f numberedClassName(int i) {
        return f.h(this.classNamePrefix + i);
    }
}
