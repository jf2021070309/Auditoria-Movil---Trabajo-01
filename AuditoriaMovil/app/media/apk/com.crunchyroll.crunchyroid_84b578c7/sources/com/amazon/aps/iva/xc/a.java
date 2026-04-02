package com.amazon.aps.iva.xc;

import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.kc.j;
import com.amazon.aps.iva.nc.w;
import java.io.File;
import java.io.IOException;
/* compiled from: FileDecoder.java */
/* loaded from: classes.dex */
public final class a implements j<File, File> {
    @Override // com.amazon.aps.iva.kc.j
    public final w<File> a(File file, int i, int i2, h hVar) throws IOException {
        return new b(file);
    }

    @Override // com.amazon.aps.iva.kc.j
    public final /* bridge */ /* synthetic */ boolean b(File file, h hVar) throws IOException {
        return true;
    }
}
