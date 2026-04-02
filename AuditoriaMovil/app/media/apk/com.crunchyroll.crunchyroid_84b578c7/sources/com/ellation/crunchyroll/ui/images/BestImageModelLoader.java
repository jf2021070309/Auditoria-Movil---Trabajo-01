package com.ellation.crunchyroll.ui.images;

import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.rc.g;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
/* compiled from: BestImageSizeUrlLoaderFactory.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/ui/images/BestImageModelLoader;", "Lcom/amazon/aps/iva/rc/o;", "Lcom/ellation/crunchyroll/ui/images/BestImageSizeModel;", "Ljava/io/InputStream;", "model", "", "width", "height", "Lcom/amazon/aps/iva/kc/h;", "options", "Lcom/amazon/aps/iva/rc/o$a;", "buildLoadData", "", "handles", "Lcom/amazon/aps/iva/rc/g;", "httpUrlLoader", "Lcom/amazon/aps/iva/rc/o;", "Ljava/io/File;", "fileLoader", "<init>", "(Lcom/amazon/aps/iva/rc/o;Lcom/amazon/aps/iva/rc/o;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class BestImageModelLoader implements o<BestImageSizeModel, InputStream> {
    private final o<File, InputStream> fileLoader;
    private final o<g, InputStream> httpUrlLoader;

    public BestImageModelLoader(o<g, InputStream> oVar, o<File, InputStream> oVar2) {
        j.f(oVar, "httpUrlLoader");
        j.f(oVar2, "fileLoader");
        this.httpUrlLoader = oVar;
        this.fileLoader = oVar2;
    }

    @Override // com.amazon.aps.iva.rc.o
    public boolean handles(BestImageSizeModel bestImageSizeModel) {
        j.f(bestImageSizeModel, "model");
        return true;
    }

    @Override // com.amazon.aps.iva.rc.o
    public o.a<InputStream> buildLoadData(BestImageSizeModel bestImageSizeModel, int i, int i2, h hVar) {
        j.f(bestImageSizeModel, "model");
        j.f(hVar, "options");
        String requestCustomSizeUrl = bestImageSizeModel.requestCustomSizeUrl(i, i2);
        if (m.h0(requestCustomSizeUrl, "/", false)) {
            return this.fileLoader.buildLoadData(new File(requestCustomSizeUrl), i, i2, hVar);
        }
        return this.httpUrlLoader.buildLoadData(new g(requestCustomSizeUrl), i, i2, hVar);
    }
}
