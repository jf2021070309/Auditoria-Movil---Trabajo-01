package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
/* loaded from: classes2.dex */
public final class lb {
    String a;
    byte[] b;

    /* synthetic */ lb(byte b) {
        this();
    }

    private lb() {
        this.a = null;
        this.b = null;
    }

    public lb(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.a = UUID.randomUUID().toString();
        this.b = bArr;
    }

    public static String a(String str) {
        return ".yflurrydatasenderblock." + str;
    }

    /* loaded from: classes2.dex */
    public static class a implements li<lb> {
        @Override // com.flurry.sdk.li
        public final /* synthetic */ void a(OutputStream outputStream, lb lbVar) {
            lb lbVar2 = lbVar;
            if (outputStream == null || lbVar2 == null) {
                return;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.lb.a.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            dataOutputStream.writeShort(lbVar2.b.length);
            dataOutputStream.write(lbVar2.b);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
        }

        @Override // com.flurry.sdk.li
        public final /* synthetic */ lb a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.lb.a.2
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            lb lbVar = new lb((byte) 0);
            int readShort = dataInputStream.readShort();
            if (readShort != 0) {
                lbVar.b = new byte[readShort];
                dataInputStream.readFully(lbVar.b);
                dataInputStream.readUnsignedShort();
                return lbVar;
            }
            return null;
        }
    }
}
