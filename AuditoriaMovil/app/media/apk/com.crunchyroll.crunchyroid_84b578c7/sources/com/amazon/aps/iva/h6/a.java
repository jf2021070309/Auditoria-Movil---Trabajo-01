package com.amazon.aps.iva.h6;

import android.net.Uri;
import com.amazon.aps.iva.w5.y;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: Aes128DataSource.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.w5.f {
    public final com.amazon.aps.iva.w5.f a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public a(com.amazon.aps.iva.w5.f fVar, byte[] bArr, byte[] bArr2) {
        this.a = fVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(com.amazon.aps.iva.w5.i iVar) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                com.amazon.aps.iva.w5.h hVar = new com.amazon.aps.iva.w5.h(this.a, iVar);
                this.d = new CipherInputStream(hVar, cipher);
                hVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws IOException {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Map<String, List<String>> d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void j(y yVar) {
        yVar.getClass();
        this.a.j(yVar);
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
