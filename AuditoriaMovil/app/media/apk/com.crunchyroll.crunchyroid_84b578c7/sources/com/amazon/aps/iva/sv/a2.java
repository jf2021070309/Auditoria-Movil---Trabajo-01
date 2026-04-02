package com.amazon.aps.iva.sv;

import java.io.File;
/* compiled from: FileDownloader.kt */
/* loaded from: classes2.dex */
public interface a2<K> {

    /* compiled from: FileDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static c2 a(d dVar) {
            return new c2(dVar, com.amazon.aps.iva.wu.b.a);
        }
    }

    void a();

    void b(com.amazon.aps.iva.xb0.l<? super K, Boolean> lVar, com.amazon.aps.iva.xb0.l<? super K, com.amazon.aps.iva.kb0.q> lVar2);

    void c(K k, String str, File file, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.l<? super Exception, com.amazon.aps.iva.kb0.q> lVar);
}
