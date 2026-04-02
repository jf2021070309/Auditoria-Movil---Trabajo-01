package com.ellation.crunchyroll.downloading;

import com.ellation.crunchyroll.downloading.z;
import java.io.File;
/* compiled from: ImageDownloader.kt */
/* loaded from: classes2.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ a0 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ File k;
    public final /* synthetic */ z.a l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, String str, String str2, File file, z.a aVar, String str3) {
        super(0);
        this.h = a0Var;
        this.i = str;
        this.j = str2;
        this.k = file;
        this.l = aVar;
        this.m = str3;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        a0 a0Var = this.h;
        com.amazon.aps.iva.se0.i.d(a0Var.d, null, null, new b0(a0Var, this.i, this.j, this.k, this.l, this.m, null), 3);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
