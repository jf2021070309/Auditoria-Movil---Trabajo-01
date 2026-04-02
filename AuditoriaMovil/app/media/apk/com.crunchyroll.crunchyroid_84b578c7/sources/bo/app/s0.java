package bo.app;

import bo.app.l0;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s0 {
    final String a;
    final long[] b;
    boolean c;
    l0.c d;
    long e;
    private final int f;
    private final File g;

    public s0(String str, int i, File file) {
        this.a = str;
        this.f = i;
        this.g = file;
        this.b = new long[i];
    }

    public String a() {
        long[] jArr;
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public void b(String[] strArr) {
        if (strArr.length == this.f) {
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw a(strArr);
                }
            }
            return;
        }
        throw a(strArr);
    }

    public IOException a(String[] strArr) {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
    }

    public File a(int i) {
        File file = this.g;
        return new File(file, this.a + "." + i);
    }

    public File b(int i) {
        File file = this.g;
        return new File(file, this.a + "." + i + ".tmp");
    }
}
