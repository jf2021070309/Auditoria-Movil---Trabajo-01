package com.amazon.aps.iva.t8;

import android.security.keystore.KeyGenParameterSpec;
import com.amazon.aps.iva.e4.e;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* compiled from: MasterKey.java */
/* loaded from: classes.dex */
public final class b {
    public final String a;

    /* compiled from: MasterKey.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0737b.values().length];
            a = iArr;
            try {
                iArr[EnumC0737b.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: MasterKey.java */
    /* renamed from: com.amazon.aps.iva.t8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0737b {
        AES256_GCM
    }

    public b(String str, KeyGenParameterSpec keyGenParameterSpec) {
        this.a = str;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
        String str = this.a;
        sb.append(str);
        sb.append(", isKeyStoreBacked=");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            z = keyStore.containsAlias(str);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            z = false;
        }
        return e.c(sb, z, "}");
    }
}
