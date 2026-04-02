package com.ellation.crunchyroll.cast.castbutton;

import android.content.Context;
import android.view.Menu;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.CastFeature;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CastButtonMediaRouter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouterImpl;", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonMediaRouter;", "Lcom/amazon/aps/iva/kb0/q;", "setUpMediaRouteButton", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/view/Menu;", "menu", "Landroid/view/Menu;", "getMenu", "()Landroid/view/Menu;", "<init>", "(Landroid/content/Context;Landroid/view/Menu;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastButtonMediaRouterImpl implements CastButtonMediaRouter {
    private final Context context;
    private final Menu menu;

    public CastButtonMediaRouterImpl(Context context, Menu menu) {
        j.f(context, "context");
        j.f(menu, "menu");
        this.context = context;
        this.menu = menu;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Menu getMenu() {
        return this.menu;
    }

    @Override // com.ellation.crunchyroll.cast.castbutton.CastButtonMediaRouter
    public void setUpMediaRouteButton() {
        com.google.android.gms.cast.framework.CastButtonFactory.setUpMediaRouteButton(this.context, this.menu, CastFeature.Companion.getDependencies$cast_release().getMediaRouteMenuItemId());
    }
}
