package com.amazon.aps.iva.tp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
/* compiled from: FileExt.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, String> {
    public final /* synthetic */ Charset h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Charset charset) {
        super(1);
        this.h = charset;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final String invoke(File file) {
        File file2 = file;
        com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
        Charset charset = this.h;
        com.amazon.aps.iva.yb0.j.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
        try {
            String y = com.amazon.aps.iva.aq.k.y(inputStreamReader);
            com.amazon.aps.iva.a60.b.k(inputStreamReader, null);
            return y;
        } finally {
        }
    }
}
