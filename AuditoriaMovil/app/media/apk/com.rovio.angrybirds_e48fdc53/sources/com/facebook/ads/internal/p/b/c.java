package com.facebook.ads.internal.p.b;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c {
    public final File a;
    public final com.facebook.ads.internal.p.b.a.c b;
    public final com.facebook.ads.internal.p.b.a.a c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(File file, com.facebook.ads.internal.p.b.a.c cVar, com.facebook.ads.internal.p.b.a.a aVar) {
        this.a = file;
        this.b = cVar;
        this.c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(String str) {
        return new File(this.a, this.b.a(str));
    }
}
