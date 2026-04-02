package com.amazon.aps.iva.if0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
/* compiled from: JSONTokener.java */
/* loaded from: classes4.dex */
public final class g {
    public long a;
    public boolean b;
    public long c;
    public long d;
    public char e;
    public final Reader f;
    public boolean g;
    public long h;

    public g(String str) {
        Reader stringReader = new StringReader(str);
        this.f = stringReader.markSupported() ? stringReader : new BufferedReader(stringReader);
        this.b = false;
        this.g = false;
        this.e = (char) 0;
        this.c = 0L;
        this.a = 1L;
        this.h = 0L;
        this.d = 1L;
    }

    public final void a() throws b {
        if (!this.g) {
            long j = this.c;
            if (j > 0) {
                this.c = j - 1;
                char c = this.e;
                if (c != '\r' && c != '\n') {
                    long j2 = this.a;
                    if (j2 > 0) {
                        this.a = j2 - 1;
                    }
                } else {
                    this.d--;
                    this.a = this.h;
                }
                this.g = true;
                this.b = false;
                return;
            }
        }
        throw new b("Stepping back two steps is not supported");
    }

    public final char b() throws b {
        int read;
        if (this.g) {
            this.g = false;
            read = this.e;
        } else {
            try {
                read = this.f.read();
            } catch (IOException e) {
                throw new b(e);
            }
        }
        if (read <= 0) {
            this.b = true;
            return (char) 0;
        }
        if (read > 0) {
            this.c++;
            if (read == 13) {
                this.d++;
                this.h = this.a;
                this.a = 0L;
            } else if (read == 10) {
                if (this.e != '\r') {
                    this.d++;
                    this.h = this.a;
                }
                this.a = 0L;
            } else {
                this.a++;
            }
        }
        char c = (char) read;
        this.e = c;
        return c;
    }

    public final char c() throws b {
        char b;
        do {
            b = b();
            if (b == 0) {
                break;
            }
        } while (b <= ' ');
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cb, code lost:
        throw e("Substring bounds error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0122, code lost:
        throw e("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() throws com.amazon.aps.iva.if0.b {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.if0.g.d():java.lang.Object");
    }

    public final b e(String str) {
        StringBuilder b = defpackage.c.b(str);
        b.append(toString());
        return new b(b.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" at ");
        sb.append(this.c);
        sb.append(" [character ");
        sb.append(this.a);
        sb.append(" line ");
        return com.amazon.aps.iva.c.b.b(sb, this.d, "]");
    }
}
