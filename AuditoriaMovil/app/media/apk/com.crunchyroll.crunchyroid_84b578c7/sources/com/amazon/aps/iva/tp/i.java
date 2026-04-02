package com.amazon.aps.iva.tp;

import com.amazon.aps.iva.kb0.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FileExt.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<File, List<? extends String>> {
    public final /* synthetic */ Charset h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Charset charset) {
        super(1);
        this.h = charset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final List<? extends String> invoke(File file) {
        File file2 = file;
        com.amazon.aps.iva.yb0.j.f(file2, "$this$safeCall");
        Charset charset = this.h;
        com.amazon.aps.iva.yb0.j.f(charset, "charset");
        ArrayList arrayList = new ArrayList();
        com.amazon.aps.iva.vb0.d dVar = new com.amazon.aps.iva.vb0.d(arrayList);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), charset));
        try {
            for (Object obj : com.amazon.aps.iva.ne0.k.P(new com.amazon.aps.iva.vb0.g(bufferedReader))) {
                dVar.invoke(obj);
            }
            q qVar = q.a;
            com.amazon.aps.iva.a60.b.k(bufferedReader, null);
            return arrayList;
        } finally {
        }
    }
}
