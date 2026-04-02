package com.ellation.crunchyroll.cast.castbutton;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.CastContextProxy;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.cast.PlayServicesStatusCheckerInternal;
import com.ellation.crunchyroll.cast.castbutton.CastButtonPresenter;
import com.ellation.crunchyroll.cast.castbutton.CastButtonView;
import kotlin.Metadata;
/* compiled from: CastButtonFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonFactoryImpl;", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonFactory;", "activity", "Landroid/app/Activity;", "menu", "Landroid/view/Menu;", "(Landroid/app/Activity;Landroid/view/Menu;)V", "getActivity", "()Landroid/app/Activity;", "castButton", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "getCastButton", "()Landroid/view/MenuItem;", "getMenu", "()Landroid/view/Menu;", "presenter", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenter;", "getPresenter", "()Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenter;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CastButtonFactoryImpl implements CastButtonFactory {
    private final Activity activity;
    private final Menu menu;

    public CastButtonFactoryImpl(Activity activity, Menu menu) {
        j.f(activity, "activity");
        j.f(menu, "menu");
        this.activity = activity;
        this.menu = menu;
    }

    private final MenuItem getCastButton() {
        return this.menu.findItem(CastFeature.Companion.getDependencies$cast_release().getMediaRouteMenuItemId());
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final Menu getMenu() {
        return this.menu;
    }

    @Override // com.ellation.crunchyroll.cast.castbutton.CastButtonFactory
    public CastButtonPresenter getPresenter() {
        CastButtonPresenter.Companion companion = CastButtonPresenter.Companion;
        CastButtonView.Companion companion2 = CastButtonView.Companion;
        Activity activity = this.activity;
        MenuItem castButton = getCastButton();
        j.e(castButton, "castButton");
        return companion.create(companion2.create(activity, castButton), CastContextProxy.Companion.get(), CastButtonMediaRouter.Companion.create(this.activity, this.menu), PlayServicesStatusCheckerInternal.Holder.get());
    }
}
