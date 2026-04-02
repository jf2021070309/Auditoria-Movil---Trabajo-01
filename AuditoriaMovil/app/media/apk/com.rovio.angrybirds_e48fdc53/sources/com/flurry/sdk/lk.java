package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class lk<T> implements li<T> {
    private final String a;
    private final int b;
    private final ll<T> c;

    public lk(String str, int i, ll<T> llVar) {
        this.a = str;
        this.b = i;
        this.c = llVar;
    }

    @Override // com.flurry.sdk.li
    public final void a(OutputStream outputStream, T t) {
        if (outputStream != null && this.c != null) {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.lk.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            dataOutputStream.writeUTF(this.a);
            dataOutputStream.writeInt(this.b);
            this.c.a(this.b).a(dataOutputStream, t);
            dataOutputStream.flush();
        }
    }

    @Override // com.flurry.sdk.li
    public final T a(InputStream inputStream) {
        if (inputStream == null || this.c == null) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.lk.2
            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        };
        String readUTF = dataInputStream.readUTF();
        if (!this.a.equals(readUTF)) {
            throw new IOException("Signature: " + readUTF + " is invalid");
        }
        return this.c.a(dataInputStream.readInt()).a(dataInputStream);
    }
}
