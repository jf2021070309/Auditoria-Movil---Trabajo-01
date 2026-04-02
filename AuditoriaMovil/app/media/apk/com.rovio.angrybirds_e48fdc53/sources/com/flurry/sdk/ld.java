package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class ld {
    String a;

    /* synthetic */ ld(byte b) {
        this();
    }

    private ld() {
    }

    public ld(String str) {
        this.a = str;
    }

    /* loaded from: classes2.dex */
    public static class a implements li<ld> {
        @Override // com.flurry.sdk.li
        public final /* synthetic */ void a(OutputStream outputStream, ld ldVar) {
            ld ldVar2 = ldVar;
            if (outputStream == null || ldVar2 == null) {
                return;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.ld.a.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            dataOutputStream.writeUTF(ldVar2.a);
            dataOutputStream.flush();
        }

        @Override // com.flurry.sdk.li
        public final /* synthetic */ ld a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream) { // from class: com.flurry.sdk.ld.a.2
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            ld ldVar = new ld((byte) 0);
            ldVar.a = dataInputStream.readUTF();
            return ldVar;
        }
    }
}
