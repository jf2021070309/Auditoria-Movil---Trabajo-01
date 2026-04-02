package com.ellation.crunchyroll.cast.castbutton;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CastButtonFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonFactory;", "", "presenter", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenter;", "getPresenter", "()Lcom/ellation/crunchyroll/cast/castbutton/CastButtonPresenter;", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CastButtonFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastButtonFactory.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/cast/castbutton/CastButtonFactory$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/cast/castbutton/CastButtonFactory;", "activity", "Landroid/app/Activity;", "menu", "Landroid/view/Menu;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastButtonFactory create(Toolbar toolbar) {
            j.f(toolbar, "toolbar");
            Context context = toolbar.getContext();
            j.d(context, "null cannot be cast to non-null type android.app.Activity");
            Menu menu = toolbar.getMenu();
            j.e(menu, "toolbar.menu");
            return new CastButtonFactoryImpl((Activity) context, menu);
        }

        public final CastButtonFactory create(Activity activity, Menu menu) {
            j.f(activity, "activity");
            j.f(menu, "menu");
            return new CastButtonFactoryImpl(activity, menu);
        }
    }

    CastButtonPresenter getPresenter();
}
