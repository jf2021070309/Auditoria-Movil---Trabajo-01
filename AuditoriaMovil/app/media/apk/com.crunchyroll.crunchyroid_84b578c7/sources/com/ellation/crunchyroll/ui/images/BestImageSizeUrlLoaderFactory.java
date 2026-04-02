package com.ellation.crunchyroll.ui.images;

import com.amazon.aps.iva.rc.g;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.rc.p;
import com.amazon.aps.iva.rc.s;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
/* compiled from: BestImageSizeUrlLoaderFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/ui/images/BestImageSizeUrlLoaderFactory;", "Lcom/amazon/aps/iva/rc/p;", "Lcom/ellation/crunchyroll/ui/images/BestImageSizeModel;", "Ljava/io/InputStream;", "Lcom/amazon/aps/iva/rc/s;", "multiFactory", "Lcom/amazon/aps/iva/rc/o;", "build", "Lcom/amazon/aps/iva/kb0/q;", "teardown", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BestImageSizeUrlLoaderFactory implements p<BestImageSizeModel, InputStream> {
    public static final int $stable = 0;

    @Override // com.amazon.aps.iva.rc.p
    public o<BestImageSizeModel, InputStream> build(s sVar) {
        j.f(sVar, "multiFactory");
        o b = sVar.b(g.class, InputStream.class);
        j.e(b, "multiFactory.build(Glide… InputStream::class.java)");
        o b2 = sVar.b(File.class, InputStream.class);
        j.e(b2, "multiFactory.build(File:… InputStream::class.java)");
        return new BestImageModelLoader(b, b2);
    }

    @Override // com.amazon.aps.iva.rc.p
    public void teardown() {
    }
}
