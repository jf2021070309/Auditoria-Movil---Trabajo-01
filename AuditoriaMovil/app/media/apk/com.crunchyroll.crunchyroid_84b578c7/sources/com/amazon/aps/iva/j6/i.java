package com.amazon.aps.iva.j6;

import android.net.Uri;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.t6.j;
import java.io.IOException;
/* compiled from: HlsPlaylistTracker.java */
/* loaded from: classes.dex */
public interface i {

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(Uri uri, j.c cVar, boolean z);

        void d();
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes.dex */
    public static final class b extends IOException {
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes.dex */
    public static final class c extends IOException {
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    void a(Uri uri, z.a aVar, d dVar);

    void b(Uri uri) throws IOException;

    long c();

    e e();

    void f(Uri uri);

    boolean g(Uri uri);

    boolean h();

    void j(a aVar);

    boolean k(Uri uri, long j);

    void l() throws IOException;

    com.amazon.aps.iva.j6.d m(Uri uri, boolean z);

    void n(a aVar);

    void stop();
}
