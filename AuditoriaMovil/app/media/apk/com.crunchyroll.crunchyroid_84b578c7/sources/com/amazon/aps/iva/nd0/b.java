package com.amazon.aps.iva.nd0;
/* compiled from: ClassId.java */
/* loaded from: classes4.dex */
public final class b {
    public final c a;
    public final c b;
    public final boolean c;

    public b(c cVar, c cVar2, boolean z) {
        if (cVar != null) {
            this.a = cVar;
            this.b = cVar2;
            this.c = z;
            return;
        }
        a(1);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r10) {
        /*
            r0 = 9
            r1 = 7
            r2 = 6
            r3 = 5
            if (r10 == r3) goto L13
            if (r10 == r2) goto L13
            if (r10 == r1) goto L13
            if (r10 == r0) goto L13
            switch(r10) {
                case 13: goto L13;
                case 14: goto L13;
                case 15: goto L13;
                case 16: goto L13;
                default: goto L10;
            }
        L10:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L15
        L13:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L15:
            r5 = 2
            if (r10 == r3) goto L23
            if (r10 == r2) goto L23
            if (r10 == r1) goto L23
            if (r10 == r0) goto L23
            switch(r10) {
                case 13: goto L23;
                case 14: goto L23;
                case 15: goto L23;
                case 16: goto L23;
                default: goto L21;
            }
        L21:
            r6 = 3
            goto L24
        L23:
            r6 = r5
        L24:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/name/ClassId"
            r8 = 0
            switch(r10) {
                case 1: goto L4d;
                case 2: goto L48;
                case 3: goto L4d;
                case 4: goto L43;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L3b;
                case 9: goto L40;
                case 10: goto L36;
                case 11: goto L31;
                case 12: goto L31;
                case 13: goto L40;
                case 14: goto L40;
                case 15: goto L40;
                case 16: goto L40;
                default: goto L2c;
            }
        L2c:
            java.lang.String r9 = "topLevelFqName"
            r6[r8] = r9
            goto L51
        L31:
            java.lang.String r9 = "string"
            r6[r8] = r9
            goto L51
        L36:
            java.lang.String r9 = "segment"
            r6[r8] = r9
            goto L51
        L3b:
            java.lang.String r9 = "name"
            r6[r8] = r9
            goto L51
        L40:
            r6[r8] = r7
            goto L51
        L43:
            java.lang.String r9 = "topLevelName"
            r6[r8] = r9
            goto L51
        L48:
            java.lang.String r9 = "relativeClassName"
            r6[r8] = r9
            goto L51
        L4d:
            java.lang.String r9 = "packageFqName"
            r6[r8] = r9
        L51:
            r8 = 1
            if (r10 == r3) goto L79
            if (r10 == r2) goto L74
            if (r10 == r1) goto L6f
            if (r10 == r0) goto L6a
            switch(r10) {
                case 13: goto L65;
                case 14: goto L65;
                case 15: goto L60;
                case 16: goto L60;
                default: goto L5d;
            }
        L5d:
            r6[r8] = r7
            goto L7d
        L60:
            java.lang.String r7 = "asFqNameString"
            r6[r8] = r7
            goto L7d
        L65:
            java.lang.String r7 = "asString"
            r6[r8] = r7
            goto L7d
        L6a:
            java.lang.String r7 = "asSingleFqName"
            r6[r8] = r7
            goto L7d
        L6f:
            java.lang.String r7 = "getShortClassName"
            r6[r8] = r7
            goto L7d
        L74:
            java.lang.String r7 = "getRelativeClassName"
            r6[r8] = r7
            goto L7d
        L79:
            java.lang.String r7 = "getPackageFqName"
            r6[r8] = r7
        L7d:
            switch(r10) {
                case 1: goto L94;
                case 2: goto L94;
                case 3: goto L94;
                case 4: goto L94;
                case 5: goto L98;
                case 6: goto L98;
                case 7: goto L98;
                case 8: goto L8f;
                case 9: goto L98;
                case 10: goto L8a;
                case 11: goto L85;
                case 12: goto L85;
                case 13: goto L98;
                case 14: goto L98;
                case 15: goto L98;
                case 16: goto L98;
                default: goto L80;
            }
        L80:
            java.lang.String r7 = "topLevel"
            r6[r5] = r7
            goto L98
        L85:
            java.lang.String r7 = "fromString"
            r6[r5] = r7
            goto L98
        L8a:
            java.lang.String r7 = "startsWith"
            r6[r5] = r7
            goto L98
        L8f:
            java.lang.String r7 = "createNestedClassId"
            r6[r5] = r7
            goto L98
        L94:
            java.lang.String r7 = "<init>"
            r6[r5] = r7
        L98:
            java.lang.String r4 = java.lang.String.format(r4, r6)
            if (r10 == r3) goto Lad
            if (r10 == r2) goto Lad
            if (r10 == r1) goto Lad
            if (r10 == r0) goto Lad
            switch(r10) {
                case 13: goto Lad;
                case 14: goto Lad;
                case 15: goto Lad;
                case 16: goto Lad;
                default: goto La7;
            }
        La7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
            goto Lb2
        Lad:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
        Lb2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.nd0.b.a(int):void");
    }

    public static b e(String str) {
        return f(str, false);
    }

    public static b f(String str, boolean z) {
        String str2;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf == -1) {
                str2 = "";
            } else {
                String replace = str.substring(0, lastIndexOf).replace('/', '.');
                str = str.substring(lastIndexOf + 1);
                str2 = replace;
            }
            return new b(new c(str2), new c(str), z);
        }
        a(12);
        throw null;
    }

    public static b l(c cVar) {
        if (cVar != null) {
            return new b(cVar.e(), cVar.f());
        }
        a(0);
        throw null;
    }

    public final c b() {
        c cVar = this.a;
        boolean d = cVar.d();
        c cVar2 = this.b;
        if (d) {
            if (cVar2 != null) {
                return cVar2;
            }
            a(9);
            throw null;
        }
        return new c(cVar.b() + "." + cVar2.b());
    }

    public final String c() {
        c cVar;
        boolean d = this.a.d();
        c cVar2 = this.b;
        if (d) {
            String b = cVar2.b();
            if (b != null) {
                return b;
            }
            a(13);
            throw null;
        }
        String str = cVar.b().replace('.', '/') + "/" + cVar2.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final b d(f fVar) {
        if (fVar != null) {
            return new b(h(), this.b.c(fVar), this.c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c) {
            return true;
        }
        return false;
    }

    public final b g() {
        c e = this.b.e();
        if (e.d()) {
            return null;
        }
        return new b(h(), e, this.c);
    }

    public final c h() {
        c cVar = this.a;
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.valueOf(this.c).hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final c i() {
        c cVar = this.b;
        if (cVar != null) {
            return cVar;
        }
        a(6);
        throw null;
    }

    public final f j() {
        f f = this.b.f();
        if (f != null) {
            return f;
        }
        a(7);
        throw null;
    }

    public final boolean k() {
        return !this.b.e().d();
    }

    public final String toString() {
        if (this.a.d()) {
            return "/" + c();
        }
        return c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f fVar) {
        this(cVar, c.j(fVar), false);
        if (cVar == null) {
            a(3);
            throw null;
        } else if (fVar != null) {
        } else {
            a(4);
            throw null;
        }
    }
}
