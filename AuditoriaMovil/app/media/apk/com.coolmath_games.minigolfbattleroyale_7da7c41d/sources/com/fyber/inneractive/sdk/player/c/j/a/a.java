package com.fyber.inneractive.sdk.player.c.j.a;

import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public interface a {

    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar, g gVar);

        void a(a aVar, g gVar, g gVar2);

        void a(g gVar);
    }

    long a();

    long a(String str);

    g a(String str, long j) throws InterruptedException, C0064a;

    File a(String str, long j, long j2) throws C0064a;

    void a(g gVar);

    void a(File file) throws C0064a;

    g b(String str, long j) throws C0064a;

    void b(g gVar) throws C0064a;

    void c(String str, long j) throws C0064a;

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0064a extends IOException {
        public C0064a(String str) {
            super(str);
        }

        public C0064a(IOException iOException) {
            super(iOException);
        }
    }
}
