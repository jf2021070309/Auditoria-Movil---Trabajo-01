package com.amazon.aps.iva.xc;

import com.amazon.aps.iva.nc.w;
import java.io.File;
/* compiled from: FileResource.java */
/* loaded from: classes.dex */
public final class b implements w<File> {
    public final File b;

    public b(File file) {
        i.l(file);
        this.b = file;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final /* bridge */ /* synthetic */ int a() {
        return 1;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Class<File> d() {
        return this.b.getClass();
    }

    @Override // com.amazon.aps.iva.nc.w
    public final File get() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final /* bridge */ /* synthetic */ void b() {
    }
}
