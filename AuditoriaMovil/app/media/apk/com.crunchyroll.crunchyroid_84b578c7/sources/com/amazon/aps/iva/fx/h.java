package com.amazon.aps.iva.fx;

import android.content.Context;
import android.content.Intent;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.downloads.activity.DownloadsActivity;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.b10.i {
    public final /* synthetic */ Context a;

    public h(com.amazon.aps.iva.ya0.f fVar) {
        this.a = fVar;
    }

    @Override // com.amazon.aps.iva.b10.i
    public final Intent a(PlayableAsset playableAsset, String str) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.yb0.j.f(str, "notificationId");
        ShowPageActivity.K.getClass();
        Context context = this.a;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        Intent intent = new Intent(context, ShowPageActivity.class);
        intent.putExtra("show_page_input", new com.amazon.aps.iva.o40.j(playableAsset.getParentType(), playableAsset.getParentId(), null));
        intent.putExtra("show_page_is_online", false);
        intent.putExtra("show_page_notification_season_id", str);
        return intent;
    }

    @Override // com.amazon.aps.iva.b10.i
    public final Intent b() {
        return new Intent(this.a, HomeBottomBarActivity.class);
    }

    @Override // com.amazon.aps.iva.b10.i
    public final Intent c() {
        return new Intent(this.a, DownloadsActivity.class);
    }
}
