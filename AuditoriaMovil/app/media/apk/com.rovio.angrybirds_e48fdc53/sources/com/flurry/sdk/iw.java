package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class iw {
    byte[] a;

    public iw() {
    }

    public iw(byte[] bArr) {
        this.a = bArr;
    }

    /* loaded from: classes2.dex */
    public static class a implements li<iw> {
        @Override // com.flurry.sdk.li
        public final /* synthetic */ void a(OutputStream outputStream, iw iwVar) {
            iw iwVar2 = iwVar;
            if (outputStream == null || iwVar2 == null) {
                return;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.iw.a.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            dataOutputStream.writeShort(iwVar2.a.length);
            dataOutputStream.write(iwVar2.a);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
        }

        @Override // com.flurry.sdk.li
        public final /* synthetic */ iw a(InputStream inputStream) {
            DataInputStream dataInputStream;
            int readShort;
            if (inputStream == null || (readShort = (dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.iw.a.2
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            }).readShort()) == 0) {
                return null;
            }
            iw iwVar = new iw();
            iwVar.a = new byte[readShort];
            dataInputStream.readFully(iwVar.a);
            dataInputStream.readUnsignedShort();
            return iwVar;
        }
    }
}
