package com.amazon.aps.iva.tp;

import com.amazon.aps.iva.vp.f;
import java.io.File;
import java.io.FileFilter;
/* compiled from: FileExt.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, File[]> {
    public final /* synthetic */ FileFilter h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f.a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final File[] invoke(File file) {
        File file2 = file;
        com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
        return file2.listFiles(this.h);
    }
}
