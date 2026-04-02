package com.amazon.aps.iva.x5;

import java.io.File;
import java.io.IOException;
/* compiled from: Cache.java */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: Cache.java */
    /* renamed from: com.amazon.aps.iva.x5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0842a extends IOException {
        public C0842a(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    /* compiled from: Cache.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();

        void c();
    }

    n a(String str);

    void b(h hVar);

    long c(long j, long j2, String str);

    s d(long j, long j2, String str) throws InterruptedException, C0842a;

    s e(long j, long j2, String str) throws C0842a;

    long f(long j, long j2, String str);

    File g(long j, long j2, String str) throws C0842a;

    void h(String str, m mVar) throws C0842a;

    void i(File file, long j) throws C0842a;

    void j(String str);
}
