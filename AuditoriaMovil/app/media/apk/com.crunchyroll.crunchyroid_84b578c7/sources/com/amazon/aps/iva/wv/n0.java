package com.amazon.aps.iva.wv;

import android.annotation.SuppressLint;
import com.ellation.crunchyroll.api.model.Subtitle;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public interface n0 extends com.amazon.aps.iva.xe.b<Subtitle> {

    /* compiled from: DownloadModelCache.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        @SuppressLint({"StaticFieldLeak"})
        public static o0 a;
        @SuppressLint({"StaticFieldLeak"})
        public static f b;
    }

    Object a(List<? extends PlayableAsset> list, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Object b(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);
}
