package com.amazon.aps.iva.tp;

import java.io.File;
/* compiled from: FileExt.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, Boolean> {
    public static final e h = new e();

    public e() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(File file) {
        File file2 = file;
        com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
        return Boolean.valueOf(file2.isDirectory());
    }
}
