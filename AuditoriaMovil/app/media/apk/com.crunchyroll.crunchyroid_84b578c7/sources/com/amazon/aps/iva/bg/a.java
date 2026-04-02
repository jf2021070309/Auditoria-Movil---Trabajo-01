package com.amazon.aps.iva.bg;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.gr.c;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: DatadogFragmentTrackingPredicate.kt */
/* loaded from: classes.dex */
public final class a extends c {
    public final List<String> a = f1.K("com.ellation.crunchyroll.cast.mini.CastMiniControllerFragment", "com.bumptech.glide.manager.SupportRequestManagerFragment", "com.ellation.crunchyroll.presentation.content.seasons.SimulcastSeasonPicker", "com.ellation.crunchyroll.presentation.content.seasons.ShowPageSeasonPicker", "com.ellation.crunchyroll.presentation.watchlist.toggle.WatchlistItemToggleFragment");

    @Override // com.amazon.aps.iva.gr.f
    /* renamed from: c */
    public final boolean a(Fragment fragment) {
        j.f(fragment, "component");
        return !this.a.contains(fragment.getClass().getName());
    }
}
