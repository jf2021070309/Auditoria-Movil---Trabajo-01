package com.ellation.crunchyroll.presentation.content.seasons;

import com.amazon.aps.iva.m00.d;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import kotlin.Metadata;
/* compiled from: SeasonPickers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/presentation/content/seasons/ShowPageSeasonPicker;", "Lcom/ellation/crunchyroll/presentation/content/seasons/SelectedSeasonFragment;", "Lcom/ellation/crunchyroll/api/cms/model/Season;", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShowPageSeasonPicker extends SelectedSeasonFragment<Season> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowPageSeasonPicker() {
        super(new d(CrunchyrollApplication.a.a()));
        CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
    }
}
