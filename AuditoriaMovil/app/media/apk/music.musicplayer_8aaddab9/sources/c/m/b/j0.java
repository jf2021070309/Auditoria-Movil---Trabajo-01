package c.m.b;

import java.io.Writer;
/* loaded from: classes.dex */
public final class j0 extends Writer {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f2373b = new StringBuilder(128);

    public j0(String str) {
        this.a = str;
    }

    public final void a() {
        if (this.f2373b.length() > 0) {
            this.f2373b.toString();
            StringBuilder sb = this.f2373b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f2373b.append(c2);
            }
        }
    }
}
