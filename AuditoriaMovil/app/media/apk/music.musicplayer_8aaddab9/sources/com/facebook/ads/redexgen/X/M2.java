package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.Writer;
/* loaded from: assets/audience_network.dex */
public class M2 extends Writer {
    public static String[] A03 = {"m3VYVt1tyYlWEg8H2HS3pUr0VsrhpbIN", "rEdvzR", "IUQqTrakmjCy7RtoUebGZ8YLkwuKbv7t", "x1ufNW", "e7NtJ1", "AK7iWzpXctzvcUrQA38QQTSmPkrm2HP", "25DCnOqD1cr08G9nl6wTfczykol7NaSA", "0bM1VBntYb2o4FFsMu8yzxmwObMsLmHM"};
    public int A00;
    public char[] A01 = new char[1024];
    public final M1 A02;

    public M2(M1 m1) {
        this.A02 = m1;
    }

    private void A00() {
        this.A02.ADH(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) throws IOException {
        int i4 = i2;
        while (true) {
            int i5 = i2 + i3;
            String[] strArr = A03;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[5] = "5m1TKypG4e5yu";
            if (i4 < i5) {
                if (cArr[i4] != '\n') {
                    int i6 = this.A00;
                    char[] cArr2 = this.A01;
                    if (i6 != cArr2.length) {
                        cArr2[i6] = cArr[i4];
                        this.A00 = i6 + 1;
                        i4++;
                    }
                }
                A00();
                i4++;
            } else {
                return;
            }
        }
    }
}
