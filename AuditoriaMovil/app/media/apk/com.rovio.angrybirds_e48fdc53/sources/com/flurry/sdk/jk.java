package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class jk {
    private static final String d = jk.class.getSimpleName();
    final List<jg> a = new ArrayList();
    boolean b;
    long c;

    /* loaded from: classes2.dex */
    public static class a implements li<jk> {
        @Override // com.flurry.sdk.li
        public final /* synthetic */ jk a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.jk.a.1
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            jk jkVar = new jk();
            dataInputStream.readUTF();
            dataInputStream.readUTF();
            jkVar.b = dataInputStream.readBoolean();
            jkVar.c = dataInputStream.readLong();
            while (true) {
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                if (readUnsignedShort == 0) {
                    return jkVar;
                }
                byte[] bArr = new byte[readUnsignedShort];
                dataInputStream.readFully(bArr);
                jkVar.a.add(0, new jg(bArr));
            }
        }

        @Override // com.flurry.sdk.li
        public final /* synthetic */ void a(OutputStream outputStream, jk jkVar) {
            throw new UnsupportedOperationException("Serialization not supported");
        }
    }
}
