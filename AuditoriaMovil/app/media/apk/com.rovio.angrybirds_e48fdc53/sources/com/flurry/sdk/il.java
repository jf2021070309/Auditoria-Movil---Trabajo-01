package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class il {
    long a;
    boolean b;
    byte[] c;

    /* loaded from: classes2.dex */
    public static class a implements li<il> {
        @Override // com.flurry.sdk.li
        public final /* synthetic */ void a(OutputStream outputStream, il ilVar) {
            il ilVar2 = ilVar;
            if (outputStream == null || ilVar2 == null) {
                return;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.il.a.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            dataOutputStream.writeLong(ilVar2.a);
            dataOutputStream.writeBoolean(ilVar2.b);
            dataOutputStream.writeInt(ilVar2.c.length);
            dataOutputStream.write(ilVar2.c);
            dataOutputStream.flush();
        }

        @Override // com.flurry.sdk.li
        public final /* synthetic */ il a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.il.a.2
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            il ilVar = new il();
            ilVar.a = dataInputStream.readLong();
            ilVar.b = dataInputStream.readBoolean();
            ilVar.c = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(ilVar.c);
            return ilVar;
        }
    }
}
