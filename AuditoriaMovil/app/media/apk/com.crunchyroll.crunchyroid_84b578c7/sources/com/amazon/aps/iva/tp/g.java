package com.amazon.aps.iva.tp;

import java.io.File;
/* compiled from: FileExt.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, File[]> {
    public static final g h = new g();

    public g() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final File[] invoke(File file) {
        File file2 = file;
        com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
        return file2.listFiles();
    }
}
