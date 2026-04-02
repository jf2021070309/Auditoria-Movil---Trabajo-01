package okhttp3.internal.tls;

import javax.security.auth.x500.X500Principal;
/* loaded from: classes4.dex */
final class a {
    private final String a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public a(X500Principal x500Principal) {
        this.a = x500Principal.getName("RFC2253");
        this.b = this.a.length();
    }

    private String a() {
        while (this.c < this.b && this.g[this.c] == ' ') {
            this.c++;
        }
        if (this.c == this.b) {
            return null;
        }
        this.d = this.c;
        this.c++;
        while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] != ' ') {
            this.c++;
        }
        if (this.c >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        this.e = this.c;
        if (this.g[this.c] == ' ') {
            while (this.c < this.b && this.g[this.c] != '=' && this.g[this.c] == ' ') {
                this.c++;
            }
            if (this.g[this.c] != '=' || this.c == this.b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.a);
            }
        }
        this.c++;
        while (this.c < this.b && this.g[this.c] == ' ') {
            this.c++;
        }
        if (this.e - this.d > 4 && this.g[this.d + 3] == '.' && ((this.g[this.d] == 'O' || this.g[this.d] == 'o') && ((this.g[this.d + 1] == 'I' || this.g[this.d + 1] == 'i') && (this.g[this.d + 2] == 'D' || this.g[this.d + 2] == 'd')))) {
            this.d += 4;
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    private String b() {
        this.c++;
        this.d = this.c;
        this.e = this.d;
        while (this.c != this.b) {
            if (this.g[this.c] == '\"') {
                this.c++;
                while (this.c < this.b && this.g[this.c] == ' ') {
                    this.c++;
                }
                return new String(this.g, this.d, this.e - this.d);
            }
            if (this.g[this.c] == '\\') {
                this.g[this.e] = e();
            } else {
                this.g[this.e] = this.g[this.c];
            }
            this.c++;
            this.e++;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    private String c() {
        int i;
        if (this.c + 4 >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        this.d = this.c;
        this.c++;
        while (this.c != this.b && this.g[this.c] != '+' && this.g[this.c] != ',' && this.g[this.c] != ';') {
            if (this.g[this.c] == ' ') {
                this.e = this.c;
                this.c++;
                while (this.c < this.b && this.g[this.c] == ' ') {
                    this.c++;
                }
                i = this.e - this.d;
                if (i >= 5 || (i & 1) == 0) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.a);
                }
                byte[] bArr = new byte[i / 2];
                int i2 = this.d + 1;
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = (byte) a(i2);
                    i2 += 2;
                }
                return new String(this.g, this.d, i);
            }
            if (this.g[this.c] >= 'A' && this.g[this.c] <= 'F') {
                char[] cArr = this.g;
                int i4 = this.c;
                cArr[i4] = (char) (cArr[i4] + ' ');
            }
            this.c++;
        }
        this.e = this.c;
        i = this.e - this.d;
        if (i >= 5) {
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.a);
    }

    private String d() {
        this.d = this.c;
        this.e = this.c;
        while (this.c < this.b) {
            switch (this.g[this.c]) {
                case ' ':
                    this.f = this.e;
                    this.c++;
                    char[] cArr = this.g;
                    int i = this.e;
                    this.e = i + 1;
                    cArr[i] = ' ';
                    while (this.c < this.b && this.g[this.c] == ' ') {
                        char[] cArr2 = this.g;
                        int i2 = this.e;
                        this.e = i2 + 1;
                        cArr2[i2] = ' ';
                        this.c++;
                    }
                    if (this.c != this.b && this.g[this.c] != ',' && this.g[this.c] != '+' && this.g[this.c] != ';') {
                        break;
                    } else {
                        return new String(this.g, this.d, this.f - this.d);
                    }
                case '+':
                case ',':
                case ';':
                    return new String(this.g, this.d, this.e - this.d);
                case '\\':
                    char[] cArr3 = this.g;
                    int i3 = this.e;
                    this.e = i3 + 1;
                    cArr3[i3] = e();
                    this.c++;
                    break;
                default:
                    char[] cArr4 = this.g;
                    int i4 = this.e;
                    this.e = i4 + 1;
                    cArr4[i4] = this.g[this.c];
                    this.c++;
                    break;
            }
        }
        return new String(this.g, this.d, this.e - this.d);
    }

    private char e() {
        this.c++;
        if (this.c == this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        switch (this.g[this.c]) {
            case ' ':
            case '\"':
            case '#':
            case '%':
            case '*':
            case '+':
            case ',':
            case ';':
            case '<':
            case '=':
            case '>':
            case '\\':
            case '_':
                return this.g[this.c];
            default:
                return f();
        }
    }

    private char f() {
        int i;
        int i2;
        int a = a(this.c);
        this.c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        if (a <= 223) {
            i = 1;
            i2 = a & 31;
        } else if (a <= 239) {
            i = 2;
            i2 = a & 15;
        } else {
            i = 3;
            i2 = a & 7;
        }
        int i3 = i2;
        for (int i4 = 0; i4 < i; i4++) {
            this.c++;
            if (this.c == this.b || this.g[this.c] != '\\') {
                return '?';
            }
            this.c++;
            int a2 = a(this.c);
            this.c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i3 = (i3 << 6) + (a2 & 63);
        }
        return (char) i3;
    }

    private int a(int i) {
        int i2;
        int i3;
        if (i + 1 >= this.b) {
            throw new IllegalStateException("Malformed DN: " + this.a);
        }
        char c = this.g[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c >= 'A' && c <= 'F') {
            i2 = c - '7';
        } else {
            throw new IllegalStateException("Malformed DN: " + this.a);
        }
        char c2 = this.g[i + 1];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 >= 'A' && c2 <= 'F') {
            i3 = c2 - '7';
        } else {
            throw new IllegalStateException("Malformed DN: " + this.a);
        }
        return (i2 << 4) + i3;
    }

    public String a(String str) {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.a.toCharArray();
        String a = a();
        if (a == null) {
            return null;
        }
        do {
            String str2 = "";
            if (this.c == this.b) {
                return null;
            }
            switch (this.g[this.c]) {
                case '\"':
                    str2 = b();
                    break;
                case '#':
                    str2 = c();
                    break;
                case '+':
                case ',':
                case ';':
                    break;
                default:
                    str2 = d();
                    break;
            }
            if (!str.equalsIgnoreCase(a)) {
                if (this.c >= this.b) {
                    return null;
                }
                if (this.g[this.c] != ',' && this.g[this.c] != ';' && this.g[this.c] != '+') {
                    throw new IllegalStateException("Malformed DN: " + this.a);
                }
                this.c++;
                a = a();
            } else {
                return str2;
            }
        } while (a != null);
        throw new IllegalStateException("Malformed DN: " + this.a);
    }
}
