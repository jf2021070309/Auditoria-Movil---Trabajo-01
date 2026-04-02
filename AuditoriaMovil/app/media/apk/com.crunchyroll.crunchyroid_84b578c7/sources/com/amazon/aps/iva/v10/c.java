package com.amazon.aps.iva.v10;

import android.content.Intent;
import com.amazon.aps.iva.tz.g0;
import com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity;
/* compiled from: BaseFeedBottomBarActivity.kt */
/* loaded from: classes2.dex */
public abstract class c extends a implements g0 {
    @Override // com.amazon.aps.iva.tz.g0
    public final void C() {
        Intent intent = new Intent(this, BrowseBottomBarActivity.class);
        intent.addFlags(131072);
        intent.putExtra("should_animate", true);
        intent.putExtra("should_open_browse_all", true);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}
