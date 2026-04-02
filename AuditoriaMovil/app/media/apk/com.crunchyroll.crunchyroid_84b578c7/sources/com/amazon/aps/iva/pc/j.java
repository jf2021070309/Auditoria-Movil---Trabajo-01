package com.amazon.aps.iva.pc;

import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.id.d;
import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public final class j {
    public final com.amazon.aps.iva.hd.i<com.amazon.aps.iva.kc.f, String> a = new com.amazon.aps.iva.hd.i<>(1000);
    public final a.c b = com.amazon.aps.iva.id.a.a(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public class a implements a.b<b> {
        @Override // com.amazon.aps.iva.id.a.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public static final class b implements a.d {
        public final MessageDigest b;
        public final d.a c = new d.a();

        public b(MessageDigest messageDigest) {
            this.b = messageDigest;
        }

        @Override // com.amazon.aps.iva.id.a.d
        public final d.a c() {
            return this.c;
        }
    }

    public final String a(com.amazon.aps.iva.kc.f fVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a(fVar);
        }
        if (a2 == null) {
            Object b2 = this.b.b();
            defpackage.i.l(b2);
            b bVar = (b) b2;
            try {
                fVar.a(bVar.b);
                byte[] digest = bVar.b.digest();
                char[] cArr = l.b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        int i2 = digest[i] & UnsignedBytes.MAX_VALUE;
                        int i3 = i * 2;
                        char[] cArr2 = l.a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[i2 & 15];
                    }
                    a2 = new String(cArr);
                }
            } finally {
                this.b.a(bVar);
            }
        }
        synchronized (this.a) {
            this.a.d(fVar, a2);
        }
        return a2;
    }
}
