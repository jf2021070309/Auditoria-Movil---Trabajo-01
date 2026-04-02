package com.ss.android.socialbase.appdownloader.bn.dr;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class g {
    private InputStream dr;
    private boolean ge;
    private int o;

    public g() {
    }

    public g(InputStream inputStream, boolean z) {
        dr(inputStream, z);
    }

    public final void dr(InputStream inputStream, boolean z) {
        this.dr = inputStream;
        this.ge = z;
        this.o = 0;
    }

    public final void dr() {
        InputStream inputStream = this.dr;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
            dr(null, false);
        }
    }

    public final int ge() throws IOException {
        return dr(4);
    }

    public final int dr(int i) throws IOException {
        if (i >= 0 && i <= 4) {
            int i2 = 0;
            if (this.ge) {
                for (int i3 = (i - 1) * 8; i3 >= 0; i3 -= 8) {
                    int read = this.dr.read();
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.o++;
                    i2 |= read << i3;
                }
                return i2;
            }
            int i4 = i * 8;
            int i5 = 0;
            while (i2 != i4) {
                int read2 = this.dr.read();
                if (read2 == -1) {
                    throw new EOFException();
                }
                this.o++;
                i5 |= read2 << i2;
                i2 += 8;
            }
            return i5;
        }
        throw new IllegalArgumentException();
    }

    public final int[] ge(int i) throws IOException {
        int[] iArr = new int[i];
        dr(iArr, 0, i);
        return iArr;
    }

    public final void dr(int[] iArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            iArr[i] = ge();
            i2--;
            i++;
        }
    }

    public final void o(int i) throws IOException {
        if (i > 0) {
            long j = i;
            long skip = this.dr.skip(j);
            this.o = (int) (this.o + skip);
            if (skip != j) {
                throw new EOFException();
            }
        }
    }

    public final void o() throws IOException {
        o(4);
    }
}
