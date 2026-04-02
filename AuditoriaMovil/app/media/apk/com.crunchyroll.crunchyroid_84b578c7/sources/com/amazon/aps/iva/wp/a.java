package com.amazon.aps.iva.wp;

import com.amazon.aps.iva.tp.m;
import java.io.File;
import java.util.Set;
/* compiled from: SingleFileOrchestrator.kt */
/* loaded from: classes2.dex */
public final class a implements m {
    public final File b;

    public a(File file) {
        this.b = file;
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File b() {
        return null;
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File c(int i) {
        File file = this.b;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            com.amazon.aps.iva.tp.b.d(parentFile);
        }
        return file;
    }

    @Override // com.amazon.aps.iva.tp.m
    public final File h(Set<? extends File> set) {
        File file = this.b;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            com.amazon.aps.iva.tp.b.d(parentFile);
        }
        if (set.contains(file)) {
            return null;
        }
        return file;
    }
}
