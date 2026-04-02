package com.ellation.crunchyroll.ui.images;

import android.content.Context;
import com.amazon.aps.iva.bd.c;
import com.amazon.aps.iva.ec.d;
import com.amazon.aps.iva.yb0.j;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import java.io.InputStream;
import kotlin.Metadata;
/* compiled from: BestImageSizeGlideModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/ui/images/BestImageSizeGlideModule;", "Lcom/amazon/aps/iva/bd/c;", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/b;", "builder", "Lcom/amazon/aps/iva/kb0/q;", "applyOptions", "Lcom/bumptech/glide/a;", "glide", "Lcom/amazon/aps/iva/ec/d;", "registry", "registerComponents", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BestImageSizeGlideModule implements c {
    public static final int $stable = 0;

    @Override // com.amazon.aps.iva.bd.b
    public void applyOptions(Context context, b bVar) {
        j.f(context, "context");
        j.f(bVar, "builder");
    }

    @Override // com.amazon.aps.iva.bd.f
    public void registerComponents(Context context, a aVar, d dVar) {
        j.f(context, "context");
        j.f(aVar, "glide");
        j.f(dVar, "registry");
        dVar.c(BestImageSizeModel.class, InputStream.class, new BestImageSizeUrlLoaderFactory());
    }
}
