package com.bytedance.sdk.openadsdk.api.plugin.dr;

import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
final class ge {
    private int bn;
    private final String dr;
    private int g;
    private final int ge;
    private int o;
    private int q;
    private char[] rb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ge(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.dr = name;
        this.ge = name.length();
    }

    private String dr() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        while (true) {
            i = this.o;
            i2 = this.ge;
            if (i >= i2 || this.rb[i] != ' ') {
                break;
            }
            this.o = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.g = i;
        this.o = i + 1;
        while (true) {
            i3 = this.o;
            i4 = this.ge;
            if (i3 >= i4) {
                break;
            }
            char[] cArr = this.rb;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.o = i3 + 1;
        }
        if (i3 >= i4) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dr);
        }
        this.q = i3;
        if (this.rb[i3] == ' ') {
            while (true) {
                i5 = this.o;
                i6 = this.ge;
                if (i5 >= i6) {
                    break;
                }
                char[] cArr2 = this.rb;
                if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                    break;
                }
                this.o = i5 + 1;
            }
            if (this.rb[i5] != '=' || i5 == i6) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dr);
            }
        }
        this.o++;
        while (true) {
            int i7 = this.o;
            if (i7 >= this.ge || this.rb[i7] != ' ') {
                break;
            }
            this.o = i7 + 1;
        }
        int i8 = this.q;
        int i9 = this.g;
        if (i8 - i9 > 4) {
            char[] cArr3 = this.rb;
            if (cArr3[i9 + 3] == '.' && ((cArr3[i9] == 'O' || cArr3[i9] == 'o') && ((cArr3[i9 + 1] == 'I' || cArr3[i9 + 1] == 'i') && (cArr3[i9 + 2] == 'D' || cArr3[i9 + 2] == 'd')))) {
                this.g = i9 + 4;
            }
        }
        char[] cArr4 = this.rb;
        int i10 = this.g;
        return new String(cArr4, i10, this.q - i10);
    }

    private String ge() {
        int i = this.o + 1;
        this.o = i;
        this.g = i;
        this.q = i;
        while (true) {
            int i2 = this.o;
            if (i2 == this.ge) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dr);
            }
            char[] cArr = this.rb;
            if (cArr[i2] == '\"') {
                this.o = i2 + 1;
                while (true) {
                    int i3 = this.o;
                    if (i3 >= this.ge || this.rb[i3] != ' ') {
                        break;
                    }
                    this.o = i3 + 1;
                }
                char[] cArr2 = this.rb;
                int i4 = this.g;
                return new String(cArr2, i4, this.q - i4);
            }
            if (cArr[i2] == '\\') {
                cArr[this.q] = q();
            } else {
                cArr[this.q] = cArr[i2];
            }
            this.o++;
            this.q++;
        }
    }

    private String o() {
        int i;
        int i2 = this.o;
        if (i2 + 4 >= this.ge) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dr);
        }
        this.g = i2;
        this.o = i2 + 1;
        while (true) {
            i = this.o;
            if (i == this.ge) {
                break;
            }
            char[] cArr = this.rb;
            if (cArr[i] == '+' || cArr[i] == ',' || cArr[i] == ';') {
                break;
            } else if (cArr[i] == ' ') {
                this.q = i;
                this.o = i + 1;
                while (true) {
                    int i3 = this.o;
                    if (i3 >= this.ge || this.rb[i3] != ' ') {
                        break;
                    }
                    this.o = i3 + 1;
                }
            } else {
                if (cArr[i] >= 'A' && cArr[i] <= 'F') {
                    cArr[i] = (char) (cArr[i] + ' ');
                }
                this.o = i + 1;
            }
        }
        this.q = i;
        int i4 = this.q;
        int i5 = this.g;
        int i6 = i4 - i5;
        if (i6 < 5 || (i6 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dr);
        }
        int i7 = i6 / 2;
        byte[] bArr = new byte[i7];
        int i8 = i5 + 1;
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) dr(i8);
            i8 += 2;
        }
        return new String(this.rb, this.g, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
        return new java.lang.String(r1, r2, r8.bn - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String g() {
        /*
            r8 = this;
            int r0 = r8.o
            r8.g = r0
            r8.q = r0
        L6:
            int r0 = r8.o
            int r1 = r8.ge
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.rb
            int r2 = r8.g
            int r3 = r8.q
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.rb
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L60
            if (r2 == r5) goto L53
            r5 = 92
            if (r2 == r5) goto L40
            if (r2 == r4) goto L53
            if (r2 == r3) goto L53
            int r2 = r8.q
            int r3 = r2 + 1
            r8.q = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.o = r0
            goto L6
        L40:
            int r0 = r8.q
            int r2 = r0 + 1
            r8.q = r2
            char r2 = r8.q()
            r1[r0] = r2
            int r0 = r8.o
            int r0 = r0 + 1
            r8.o = r0
            goto L6
        L53:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.rb
            int r2 = r8.g
            int r3 = r8.q
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L60:
            int r2 = r8.q
            r8.bn = r2
            int r0 = r0 + 1
            r8.o = r0
            int r0 = r2 + 1
            r8.q = r0
            r1[r2] = r6
        L6e:
            int r0 = r8.o
            int r1 = r8.ge
            if (r0 >= r1) goto L87
            char[] r2 = r8.rb
            char r7 = r2[r0]
            if (r7 != r6) goto L87
            int r1 = r8.q
            int r7 = r1 + 1
            r8.q = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.o = r0
            goto L6e
        L87:
            if (r0 == r1) goto L97
            char[] r1 = r8.rb
            char r2 = r1[r0]
            if (r2 == r3) goto L97
            char r2 = r1[r0]
            if (r2 == r4) goto L97
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L97:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.rb
            int r2 = r8.g
            int r3 = r8.bn
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.api.plugin.dr.ge.g():java.lang.String");
    }

    private char q() {
        int i = this.o + 1;
        this.o = i;
        if (i == this.ge) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dr);
        }
        char[] cArr = this.rb;
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
                            return bn();
                    }
            }
        }
        return cArr[i];
    }

    private char bn() {
        int i;
        int i2;
        int dr = dr(this.o);
        this.o++;
        if (dr < 128) {
            return (char) dr;
        }
        if (dr < 192 || dr > 247) {
            return '?';
        }
        if (dr <= 223) {
            i2 = dr & 31;
            i = 1;
        } else if (dr <= 239) {
            i = 2;
            i2 = dr & 15;
        } else {
            i = 3;
            i2 = dr & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.o + 1;
            this.o = i4;
            if (i4 == this.ge || this.rb[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.o = i5;
            int dr2 = dr(i5);
            this.o++;
            if ((dr2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (dr2 & 63);
        }
        return (char) i2;
    }

    private int dr(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.ge) {
            throw new IllegalStateException("Malformed DN: " + this.dr);
        }
        char[] cArr = this.rb;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c >= 'A' && c <= 'F') {
            i2 = c - '7';
        } else {
            throw new IllegalStateException("Malformed DN: " + this.dr);
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 >= 'A' && c2 <= 'F') {
            i3 = c2 - '7';
        } else {
            throw new IllegalStateException("Malformed DN: " + this.dr);
        }
        return (i2 << 4) + i3;
    }

    public String dr(String str) {
        String ge;
        this.o = 0;
        this.g = 0;
        this.q = 0;
        this.bn = 0;
        this.rb = this.dr.toCharArray();
        String dr = dr();
        if (dr == null) {
            return null;
        }
        do {
            int i = this.o;
            if (i == this.ge) {
                return null;
            }
            char c = this.rb[i];
            if (c == '\"') {
                ge = ge();
            } else if (c == '#') {
                ge = o();
            } else if (c == '+' || c == ',' || c == ';') {
                ge = "";
            } else {
                ge = g();
            }
            if (str.equalsIgnoreCase(dr)) {
                return ge;
            }
            int i2 = this.o;
            if (i2 >= this.ge) {
                return null;
            }
            char[] cArr = this.rb;
            if (cArr[i2] != ',' && cArr[i2] != ';' && cArr[i2] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.dr);
            }
            this.o = i2 + 1;
            dr = dr();
        } while (dr != null);
        throw new IllegalStateException("Malformed DN: " + this.dr);
    }
}
