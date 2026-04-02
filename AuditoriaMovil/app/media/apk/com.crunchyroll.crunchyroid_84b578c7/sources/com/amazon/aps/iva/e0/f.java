package com.amazon.aps.iva.e0;

import java.util.Arrays;
/* compiled from: LazyListAnimateScrollScope.kt */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public Object b;

    public f(String str) {
        com.amazon.aps.iva.yb0.j.g(str, "data");
        this.b = str;
        this.a = -1;
        h();
    }

    public final boolean a() {
        if (this.a < ((String) this.b).length() - 1) {
            return true;
        }
        return false;
    }

    public final char b() {
        if (a()) {
            int i = this.a + 1;
            this.a = i;
            return ((String) this.b).charAt(i);
        }
        k();
        throw null;
    }

    public final com.amazon.aps.iva.va0.b c() {
        boolean z;
        while (a()) {
            char b = b();
            if (b != '\t' && b != '\n' && b != '\r' && b != ' ') {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                break;
            }
        }
        f();
        if (!a()) {
            return com.amazon.aps.iva.va0.b.END_OF_DOCUMENT;
        }
        char b2 = b();
        if (b2 == '[') {
            return com.amazon.aps.iva.va0.b.START_ARRAY;
        }
        if (b2 == ']') {
            return com.amazon.aps.iva.va0.b.END_ARRAY;
        }
        if (b2 == '{') {
            return com.amazon.aps.iva.va0.b.START_OBJECT;
        }
        if (b2 == '}') {
            return com.amazon.aps.iva.va0.b.END_OBJECT;
        }
        if (b2 == ',') {
            return com.amazon.aps.iva.va0.b.COMMA;
        }
        if (b2 == ':') {
            return com.amazon.aps.iva.va0.b.COLON;
        }
        if (b2 == '\"') {
            com.amazon.aps.iva.va0.b bVar = com.amazon.aps.iva.va0.b.TEXT;
            while (a()) {
                char b3 = b();
                if (b3 != '\"') {
                    if (b3 == '\\' && b() == 'u') {
                        for (int i = 0; i <= 4; i++) {
                            char b4 = b();
                            if (('0' > b4 || '9' < b4) && (('A' > b4 || 'F' < b4) && ('a' > b4 || 'f' < b4))) {
                                k();
                                throw null;
                            }
                        }
                        continue;
                    }
                } else {
                    return bVar;
                }
            }
            k();
            throw null;
        } else if (b2 == 'n') {
            com.amazon.aps.iva.va0.b bVar2 = com.amazon.aps.iva.va0.b.NULL;
            j("null");
            return bVar2;
        } else if (b2 == 't') {
            com.amazon.aps.iva.va0.b bVar3 = com.amazon.aps.iva.va0.b.TRUE;
            j("true");
            return bVar3;
        } else if (b2 == 'f') {
            com.amazon.aps.iva.va0.b bVar4 = com.amazon.aps.iva.va0.b.FALSE;
            j("false");
            return bVar4;
        } else if (('0' <= b2 && '9' >= b2) || b2 == '-' || b2 == '.') {
            com.amazon.aps.iva.va0.b bVar5 = com.amazon.aps.iva.va0.b.NUMBER;
            f();
            char b5 = b();
            if ('1' <= b5 && '9' >= b5) {
                g();
            } else if (b5 != '0') {
                if (b5 == '-') {
                    char b6 = b();
                    if (b6 != '0' && '1' <= b6 && '9' >= b6) {
                        g();
                    }
                } else {
                    k();
                    throw null;
                }
            }
            if (b() != '.') {
                f();
            } else {
                g();
            }
            char b7 = b();
            if (b7 != 'E' && b7 != 'e') {
                f();
            } else {
                char b8 = b();
                if (b8 != '+' && b8 != '-') {
                    f();
                }
                g();
            }
            if (a()) {
                if (!Character.isLetterOrDigit(b())) {
                    f();
                    return bVar5;
                }
                k();
                throw null;
            }
            return bVar5;
        } else {
            k();
            throw null;
        }
    }

    public final int d() {
        int i = this.a - 1;
        this.a = i;
        return ((int[]) this.b)[i];
    }

    public final void e(int i) {
        int i2 = this.a;
        Object obj = this.b;
        if (i2 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            this.b = copyOf;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        ((int[]) this.b)[i3] = i;
    }

    public final void f() {
        this.a--;
    }

    public final void g() {
        char b;
        do {
            b = b();
            if ('0' > b) {
                break;
            }
        } while ('9' >= b);
        f();
    }

    public final void h() {
        int i;
        int i2;
        switch (com.amazon.aps.iva.va0.d.a[c().ordinal()]) {
            case 1:
                do {
                    i(com.amazon.aps.iva.va0.b.TEXT);
                    i(com.amazon.aps.iva.va0.b.COLON);
                    h();
                    i = com.amazon.aps.iva.va0.d.b[c().ordinal()];
                    if (i == 1) {
                        return;
                    }
                } while (i == 2);
                k();
                throw null;
            case 2:
                do {
                    h();
                    i2 = com.amazon.aps.iva.va0.d.c[c().ordinal()];
                    if (i2 == 1) {
                        return;
                    }
                } while (i2 == 2);
                k();
                throw null;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            default:
                k();
                throw null;
        }
    }

    public final void i(com.amazon.aps.iva.va0.b bVar) {
        com.amazon.aps.iva.va0.b c = c();
        if (bVar == c) {
            return;
        }
        throw new com.amazon.aps.iva.va0.c("Expected " + bVar + " token but seen " + c + " token");
    }

    public final void j(String str) {
        f();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (a()) {
                if (charAt != b()) {
                    k();
                    throw null;
                }
            } else {
                k();
                throw null;
            }
        }
        if (a()) {
            if (!Character.isLetterOrDigit(b())) {
                f();
            } else {
                k();
                throw null;
            }
        }
    }

    public final void k() {
        if (this.a < ((String) this.b).length()) {
            char charAt = ((String) this.b).charAt(this.a);
            int i = this.a;
            throw new com.amazon.aps.iva.va0.c("Unexpected character " + charAt + " at offset " + i);
        }
        throw new com.amazon.aps.iva.va0.c();
    }

    public f() {
        this.b = new int[10];
    }
}
