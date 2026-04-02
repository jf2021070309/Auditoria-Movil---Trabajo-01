package com.amazon.aps.iva.x6;

import java.io.IOException;
/* compiled from: ExtractorInput.java */
/* loaded from: classes.dex */
public interface o extends com.amazon.aps.iva.q5.o {
    long a();

    boolean c(byte[] bArr, int i, int i2, boolean z) throws IOException;

    void e();

    boolean f(byte[] bArr, int i, int i2, boolean z) throws IOException;

    void g(int i, byte[] bArr, int i2) throws IOException;

    long getPosition();

    long h();

    void i(int i) throws IOException;

    void k(int i) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
