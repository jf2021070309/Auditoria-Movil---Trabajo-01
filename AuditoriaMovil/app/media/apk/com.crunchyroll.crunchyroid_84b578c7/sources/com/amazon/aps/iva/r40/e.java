package com.amazon.aps.iva.r40;

import com.amazon.aps.iva.l40.g1;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Series;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
/* compiled from: ShowSummary.kt */
/* loaded from: classes2.dex */
public final class e implements g1<ContentContainer, a> {
    @Override // com.amazon.aps.iva.l40.g1
    public final a a(ContentContainer contentContainer) {
        int i;
        ContentContainer contentContainer2 = contentContainer;
        j.f(contentContainer2, "input");
        String title = contentContainer2.getTitle();
        String description = contentContainer2.getDescription();
        LabelUiModel labelUiModel$default = LabelUiModelKt.toLabelUiModel$default(contentContainer2, false, 1, null);
        if (contentContainer2 instanceof Series) {
            i = R.string.show_page_series_details;
        } else {
            i = R.string.show_page_movie_details;
        }
        return new a(title, description, labelUiModel$default, i);
    }
}
