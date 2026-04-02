package com.amazon.aps.iva.g6;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.b;
import com.amazon.aps.iva.q5.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: ExoMediaDrm.java */
/* loaded from: classes.dex */
public interface m {

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final byte[] a;
        public final String b;

        public a(String str, byte[] bArr) {
            this.a = bArr;
            this.b = str;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes.dex */
    public interface c {
        m a(UUID uuid);
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final byte[] a;
        public final String b;

        public d(String str, byte[] bArr) {
            this.a = bArr;
            this.b = str;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    byte[] c() throws MediaDrmException;

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr) throws DeniedByServerException;

    int f();

    com.amazon.aps.iva.z5.b h(byte[] bArr) throws MediaCryptoException;

    void i(b.a aVar);

    void j(byte[] bArr);

    byte[] k(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    a l(byte[] bArr, List<r.b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    boolean m(String str, byte[] bArr);

    void release();

    default void g(byte[] bArr, p1 p1Var) {
    }
}
