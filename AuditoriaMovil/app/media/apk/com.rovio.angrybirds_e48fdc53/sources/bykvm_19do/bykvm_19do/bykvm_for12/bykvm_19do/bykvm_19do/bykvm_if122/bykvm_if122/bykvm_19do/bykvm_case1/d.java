package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_case1;

import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
final class d {
    private final String a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.b) {
            throw new IllegalStateException("Malformed DN: " + this.a);
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c < 'A' || c > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.a);
        } else {
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 < 'A' || c2 > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.a);
        } else {
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
        return new java.lang.String(r0, r1, r9.f - r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a() {
        /*
            r9 = this;
            int r0 = r9.c
            r9.d = r0
            r9.e = r0
        L6:
            int r0 = r9.c
            int r1 = r9.b
            if (r0 < r1) goto L1a
            char[] r0 = r9.g
            int r1 = r9.d
            java.lang.String r2 = new java.lang.String
            int r3 = r9.e
            int r3 = r3 - r1
            r2.<init>(r0, r1, r3)
            goto La0
        L1a:
            char[] r1 = r9.g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r2 = r9.e
            int r3 = r2 + 1
            r9.e = r3
            char r3 = r1[r0]
            char r3 = (char) r3
            r1[r2] = r3
            goto L4c
        L3e:
            int r0 = r9.e
            int r2 = r0 + 1
            r9.e = r2
            char r2 = r9.b()
            r1[r0] = r2
            int r0 = r9.c
        L4c:
            int r0 = r0 + 1
            r9.c = r0
            goto L6
        L51:
            int r0 = r9.d
            java.lang.String r2 = new java.lang.String
            int r3 = r9.e
            int r3 = r3 - r0
            r2.<init>(r1, r0, r3)
            goto La0
        L5c:
            int r2 = r9.e
            r9.f = r2
            int r0 = r0 + 1
            r9.c = r0
            int r0 = r2 + 1
            r9.e = r0
            char r0 = (char) r6
            r1[r2] = r0
        L6b:
            int r1 = r9.c
            int r2 = r9.b
            if (r1 >= r2) goto L84
            char[] r7 = r9.g
            char r8 = r7[r1]
            if (r8 != r6) goto L84
            int r2 = r9.e
            int r8 = r2 + 1
            r9.e = r8
            r7[r2] = r0
            int r1 = r1 + 1
            r9.c = r1
            goto L6b
        L84:
            if (r1 == r2) goto L94
            char[] r0 = r9.g
            char r2 = r0[r1]
            if (r2 == r3) goto L94
            char r2 = r0[r1]
            if (r2 == r4) goto L94
            char r0 = r0[r1]
            if (r0 != r5) goto L6
        L94:
            char[] r0 = r9.g
            int r1 = r9.d
            java.lang.String r2 = new java.lang.String
            int r3 = r9.f
            int r3 = r3 - r1
            r2.<init>(r0, r1, r3)
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_case1.d.a():java.lang.String");
    }

    private char b() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            return c();
                    }
            }
        }
        return cArr[i];
    }

    private char c() {
        int i;
        int a = a(this.c);
        this.c++;
        if (a >= 128) {
            if (a < 192 || a > 247) {
                return '?';
            }
            if (a <= 223) {
                a &= 31;
                i = 1;
            } else if (a <= 239) {
                i = 2;
                a &= 15;
            } else {
                i = 3;
                a &= 7;
            }
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 == this.b || this.g[i3] != '\\') {
                    return '?';
                }
                int i4 = i3 + 1;
                this.c = i4;
                int a2 = a(i4);
                this.c++;
                if ((a2 & 192) != 128) {
                    return '?';
                }
                a = (a << 6) + (a2 & 63);
            }
        }
        return (char) a;
    }

    private String d() {
        int i = this.c;
        if (i + 4 >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        this.d = i;
        while (true) {
            this.c = i + 1;
            i = this.c;
            if (i == this.b) {
                break;
            }
            char[] cArr = this.g;
            if (cArr[i] == '+' || cArr[i] == ',' || cArr[i] == ';') {
                break;
            } else if (cArr[i] == ' ') {
                this.e = i;
                do {
                    this.c = i + 1;
                    i = this.c;
                    if (i >= this.b) {
                        break;
                    }
                } while (this.g[i] == ' ');
            } else if (cArr[i] >= 'A' && cArr[i] <= 'F') {
                cArr[i] = (char) (cArr[i] + ' ');
            }
        }
        this.e = i;
        int i2 = this.e;
        int i3 = this.d;
        int i4 = i2 - i3;
        if (i4 < 5 || (i4 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        int i5 = i4 / 2;
        byte[] bArr = new byte[i5];
        int i6 = i3 + 1;
        for (int i7 = 0; i7 < i5; i7++) {
            bArr[i7] = (byte) a(i6);
            i6 += 2;
        }
        return new String(this.g, this.d, i4);
    }

    private String e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        do {
            this.c = i + 1;
            i = this.c;
            i3 = this.b;
            if (i >= i3) {
                break;
            }
            cArr = this.g;
            if (cArr[i] == '=') {
                break;
            }
        } while (cArr[i] != ' ');
        if (i >= i3) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        this.e = i;
        if (this.g[i] == ' ') {
            while (true) {
                i4 = this.c;
                i5 = this.b;
                if (i4 >= i5) {
                    break;
                }
                char[] cArr2 = this.g;
                if (cArr2[i4] == '=' || cArr2[i4] != ' ') {
                    break;
                }
                this.c = i4 + 1;
            }
            if (this.g[i4] != '=' || i4 == i5) {
                throw new IllegalStateException("Unexpected end of DN: " + this.a);
            }
        }
        int i6 = this.c;
        do {
            this.c = i6 + 1;
            i6 = this.c;
            if (i6 >= this.b) {
                break;
            }
        } while (this.g[i6] == ' ');
        int i7 = this.e;
        int i8 = this.d;
        if (i7 - i8 > 4) {
            char[] cArr3 = this.g;
            if (cArr3[i8 + 3] == '.' && (cArr3[i8] == 'O' || cArr3[i8] == 'o')) {
                int i9 = i8 + 1;
                if (cArr3[i9] == 'I' || cArr3[i9] == 'i') {
                    int i10 = i8 + 2;
                    if (cArr3[i10] == 'D' || cArr3[i10] == 'd') {
                        this.d = i8 + 4;
                    }
                }
            }
        }
        char[] cArr4 = this.g;
        int i11 = this.d;
        return new String(cArr4, i11, this.e - i11);
    }

    private String f() {
        int i = this.c + 1;
        this.c = i;
        this.d = i;
        while (true) {
            this.e = i;
            int i2 = this.c;
            if (i2 == this.b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.a);
            }
            char[] cArr = this.g;
            if (cArr[i2] == '\"') {
                do {
                    this.c = i2 + 1;
                    i2 = this.c;
                    if (i2 >= this.b) {
                        break;
                    }
                } while (this.g[i2] == ' ');
                char[] cArr2 = this.g;
                int i3 = this.d;
                return new String(cArr2, i3, this.e - i3);
            }
            if (cArr[i2] == '\\') {
                cArr[this.e] = b();
            } else {
                cArr[this.e] = cArr[i2];
            }
            this.c++;
            i = this.e + 1;
        }
    }

    public String a(String str) {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.a.toCharArray();
        String e = e();
        if (e == null) {
            return null;
        }
        do {
            int i = this.c;
            if (i == this.b) {
                return null;
            }
            char c = this.g[i];
            String a = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : a() : d() : f();
            if (str.equalsIgnoreCase(e)) {
                return a;
            }
            int i2 = this.c;
            if (i2 >= this.b) {
                return null;
            }
            char[] cArr = this.g;
            if (cArr[i2] != ',' && cArr[i2] != ';' && cArr[i2] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.a);
            }
            this.c = i2 + 1;
            e = e();
        } while (e != null);
        throw new IllegalStateException("Malformed DN: " + this.a);
    }
}
