package com.amazon.aps.iva.ea;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.amazon.aps.iva.fa.i;
import com.amazon.aps.iva.ma.c;
import java.util.HashMap;
/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public final class a {
    public final AssetManager d;
    public final i a = new i();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String e = ".ttf";

    public a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }
}
