package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r {
    private final BitArray a;
    private final l b = new l();
    private final StringBuilder c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(BitArray bitArray) {
        this.a = bitArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            n a = a(i, str);
            String a2 = q.a(a.a());
            if (a2 != null) {
                sb.append(a2);
            }
            str = a.b() ? String.valueOf(a.c()) : null;
            if (i != a.e()) {
                i = a.e();
            } else {
                return sb.toString();
            }
        }
    }

    private boolean a(int i) {
        if (i + 7 > this.a.getSize()) {
            return i + 4 <= this.a.getSize();
        }
        for (int i2 = i; i2 < i + 3; i2++) {
            if (this.a.get(i2)) {
                return true;
            }
        }
        return this.a.get(i + 3);
    }

    private o b(int i) {
        if (i + 7 > this.a.getSize()) {
            int a = a(i, 4);
            if (a == 0) {
                return new o(this.a.getSize(), 10, 10);
            }
            return new o(this.a.getSize(), a - 1, 10);
        }
        int a2 = a(i, 7);
        return new o(i + 7, (a2 - 8) / 11, (a2 - 8) % 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i, int i2) {
        return a(this.a, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(BitArray bitArray, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (bitArray.get(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n a(int i, String str) {
        this.c.setLength(0);
        if (str != null) {
            this.c.append(str);
        }
        this.b.a(i);
        n a = a();
        return (a == null || !a.b()) ? new n(this.b.a(), this.c.toString()) : new n(this.b.a(), this.c.toString(), a.c());
    }

    private n a() {
        k b;
        boolean b2;
        do {
            int a = this.b.a();
            if (this.b.b()) {
                b = d();
                b2 = b.b();
            } else if (this.b.c()) {
                b = c();
                b2 = b.b();
            } else {
                b = b();
                b2 = b.b();
            }
            if (!(a != this.b.a()) && !b2) {
                break;
            }
        } while (!b2);
        return b.a();
    }

    private k b() {
        n nVar;
        while (a(this.b.a())) {
            o b = b(this.b.a());
            this.b.a(b.e());
            if (b.c()) {
                if (b.d()) {
                    nVar = new n(this.b.a(), this.c.toString());
                } else {
                    nVar = new n(this.b.a(), this.c.toString(), b.b());
                }
                return new k(nVar, true);
            }
            this.c.append(b.a());
            if (b.d()) {
                return new k(new n(this.b.a(), this.c.toString()), true);
            }
            this.c.append(b.b());
        }
        if (i(this.b.a())) {
            this.b.e();
            this.b.b(4);
        }
        return new k(false);
    }

    private k c() {
        while (c(this.b.a())) {
            m d = d(this.b.a());
            this.b.a(d.e());
            if (d.b()) {
                return new k(new n(this.b.a(), this.c.toString()), true);
            }
            this.c.append(d.a());
        }
        if (h(this.b.a())) {
            this.b.b(3);
            this.b.d();
        } else if (g(this.b.a())) {
            if (this.b.a() + 5 < this.a.getSize()) {
                this.b.b(5);
            } else {
                this.b.a(this.a.getSize());
            }
            this.b.e();
        }
        return new k(false);
    }

    private k d() {
        while (e(this.b.a())) {
            m f = f(this.b.a());
            this.b.a(f.e());
            if (f.b()) {
                return new k(new n(this.b.a(), this.c.toString()), true);
            }
            this.c.append(f.a());
        }
        if (h(this.b.a())) {
            this.b.b(3);
            this.b.d();
        } else if (g(this.b.a())) {
            if (this.b.a() + 5 < this.a.getSize()) {
                this.b.b(5);
            } else {
                this.b.a(this.a.getSize());
            }
            this.b.f();
        }
        return new k(false);
    }

    private boolean c(int i) {
        int a;
        if (i + 5 > this.a.getSize()) {
            return false;
        }
        int a2 = a(i, 5);
        if (a2 < 5 || a2 >= 16) {
            if (i + 7 <= this.a.getSize()) {
                int a3 = a(i, 7);
                if (a3 < 64 || a3 >= 116) {
                    return i + 8 <= this.a.getSize() && (a = a(i, 8)) >= 232 && a < 253;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    private m d(int i) {
        char c;
        int a = a(i, 5);
        if (a == 15) {
            return new m(i + 5, '$');
        }
        if (a >= 5 && a < 15) {
            return new m(i + 5, (char) ((a + 48) - 5));
        }
        int a2 = a(i, 7);
        if (a2 >= 64 && a2 < 90) {
            return new m(i + 7, (char) (a2 + 1));
        }
        if (a2 >= 90 && a2 < 116) {
            return new m(i + 7, (char) (a2 + 7));
        }
        switch (a(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new m(i + 8, c);
    }

    private boolean e(int i) {
        int a;
        if (i + 5 > this.a.getSize()) {
            return false;
        }
        int a2 = a(i, 5);
        if (a2 < 5 || a2 >= 16) {
            return i + 6 <= this.a.getSize() && (a = a(i, 6)) >= 16 && a < 63;
        }
        return true;
    }

    private m f(int i) {
        char c;
        int a = a(i, 5);
        if (a == 15) {
            return new m(i + 5, '$');
        }
        if (a >= 5 && a < 15) {
            return new m(i + 5, (char) ((a + 48) - 5));
        }
        int a2 = a(i, 6);
        if (a2 >= 32 && a2 < 58) {
            return new m(i + 6, (char) (a2 + 33));
        }
        switch (a2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + a2);
        }
        return new m(i + 6, c);
    }

    private boolean g(int i) {
        if (i + 1 > this.a.getSize()) {
            return false;
        }
        for (int i2 = 0; i2 < 5 && i2 + i < this.a.getSize(); i2++) {
            if (i2 == 2) {
                if (!this.a.get(i + 2)) {
                    return false;
                }
            } else if (this.a.get(i + i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean h(int i) {
        if (i + 3 > this.a.getSize()) {
            return false;
        }
        for (int i2 = i; i2 < i + 3; i2++) {
            if (this.a.get(i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean i(int i) {
        if (i + 1 > this.a.getSize()) {
            return false;
        }
        for (int i2 = 0; i2 < 4 && i2 + i < this.a.getSize(); i2++) {
            if (this.a.get(i + i2)) {
                return false;
            }
        }
        return true;
    }
}
