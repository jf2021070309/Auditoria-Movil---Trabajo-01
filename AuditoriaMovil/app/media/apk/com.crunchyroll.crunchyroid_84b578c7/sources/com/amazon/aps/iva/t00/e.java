package com.amazon.aps.iva.t00;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: AudioLanguageOptionsPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    public final String b;
    public final List<PlayableAssetVersion> c;
    public final com.amazon.aps.iva.p00.a d;

    /* compiled from: AudioLanguageOptionsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements l<String, String> {
        public a(com.amazon.aps.iva.p00.a aVar) {
            super(1, aVar, com.amazon.aps.iva.p00.a.class, "getTitleForLanguage", "getTitleForLanguage(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(String str) {
            String str2 = str;
            j.f(str2, "p0");
            return ((com.amazon.aps.iva.p00.a) this.receiver).getTitleForLanguage(str2);
        }
    }

    public e(b bVar, String str, List list, com.amazon.aps.iva.p00.a aVar) {
        super(bVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = str;
        this.c = list;
        this.d = aVar;
    }

    @Override // com.amazon.aps.iva.t00.d
    public final void a() {
        getView().dismiss();
    }

    @Override // com.amazon.aps.iva.t00.d
    public final void d5(String str) {
        j.f(str, "selectedOption");
        if (!j.a(str, this.b)) {
            getView().j3(str);
            getView().dismiss();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        Object obj;
        List<PlayableAssetVersion> list = this.c;
        ArrayList arrayList = new ArrayList(r.Y(list));
        for (PlayableAssetVersion playableAssetVersion : list) {
            arrayList.add(playableAssetVersion.getAudioLocale());
        }
        getView().fh(arrayList, new a(this.d));
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a((String) obj, this.b)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            getView().ag(str);
        }
    }
}
