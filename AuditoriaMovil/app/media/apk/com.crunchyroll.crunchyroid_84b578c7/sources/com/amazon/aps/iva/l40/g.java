package com.amazon.aps.iva.l40;

import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.ContentContainer;
import java.util.ArrayList;
/* compiled from: ShowFullDetailsUiModelMapper.kt */
/* loaded from: classes2.dex */
public final class g implements g1<ContentContainer, com.amazon.aps.iva.e20.a> {
    public final q a;

    public g(r rVar) {
        this.a = rVar;
    }

    @Override // com.amazon.aps.iva.l40.g1
    public final com.amazon.aps.iva.e20.a a(ContentContainer contentContainer) {
        boolean z;
        ContentContainer contentContainer2 = contentContainer;
        com.amazon.aps.iva.yb0.j.f(contentContainer2, "input");
        String title = contentContainer2.getTitle();
        String description = contentContainer2.getDescription();
        ArrayList arrayList = new ArrayList();
        q qVar = this.a;
        String b = qVar.b(contentContainer2);
        if (!(!com.amazon.aps.iva.oe0.m.b0(b))) {
            b = null;
        }
        if (b != null) {
            arrayList.add(new com.amazon.aps.iva.e20.e(R.string.media_metadata_content_advisory, b));
        }
        String a = qVar.a(contentContainer2);
        if (a.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(new com.amazon.aps.iva.e20.e(R.string.artist_details_duration, a));
        }
        arrayList.add(new com.amazon.aps.iva.e20.e(R.string.show_full_details_publisher, contentContainer2.getContentProvider()));
        if (!contentContainer2.getAudioLocales().isEmpty()) {
            arrayList.add(new com.amazon.aps.iva.e20.e(R.string.media_metadata_audio, qVar.c(contentContainer2.getAudioLocales())));
        }
        if (!contentContainer2.getSubtitleLocales().isEmpty()) {
            arrayList.add(new com.amazon.aps.iva.e20.e(R.string.media_metadata_subtitles, qVar.c(contentContainer2.getSubtitleLocales())));
        }
        com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
        return new com.amazon.aps.iva.e20.a(title, description, arrayList);
    }
}
