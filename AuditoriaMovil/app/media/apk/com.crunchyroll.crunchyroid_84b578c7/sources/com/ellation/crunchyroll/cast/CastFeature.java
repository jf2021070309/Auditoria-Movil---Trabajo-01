package com.ellation.crunchyroll.cast;

import android.app.Activity;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.h;
import com.amazon.aps.iva.e8.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.i;
import com.amazon.aps.iva.ze.c;
import com.crunchyroll.cast.castlistener.VideoCastController;
import com.ellation.crunchyroll.cast.dependencies.CastDependencies;
import com.google.android.gms.cast.framework.SessionManagerListener;
import kotlin.Metadata;
/* compiled from: CastFeature.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastFeature;", "Lcom/amazon/aps/iva/ye/a;", "Lcom/amazon/aps/iva/e8/f;", "createMediaRouteDialogFactory", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/amazon/aps/iva/kb0/q;", "addCastButton", "Landroidx/fragment/app/h;", "activity", "Landroid/view/Menu;", "menu", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastFeature extends com.amazon.aps.iva.ye.a {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastFeature.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0080.¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastFeature$Companion;", "", "()V", "<set-?>", "Lcom/ellation/crunchyroll/cast/dependencies/CastDependencies;", "dependencies", "getDependencies$cast_release", "()Lcom/ellation/crunchyroll/cast/dependencies/CastDependencies;", "Lcom/ellation/crunchyroll/cast/CastFeature;", "feature", "getFeature$cast_release", "()Lcom/ellation/crunchyroll/cast/CastFeature;", "create", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static CastDependencies dependencies;
        private static CastFeature feature;

        private Companion() {
        }

        public final CastFeature create(CastDependencies castDependencies) {
            j.f(castDependencies, "dependencies");
            dependencies = castDependencies;
            CastFeatureImpl castFeatureImpl = new CastFeatureImpl(castDependencies);
            feature = castFeatureImpl;
            return castFeatureImpl;
        }

        public final CastDependencies getDependencies$cast_release() {
            CastDependencies castDependencies = dependencies;
            if (castDependencies != null) {
                return castDependencies;
            }
            j.m("dependencies");
            throw null;
        }

        public final CastFeature getFeature$cast_release() {
            CastFeature castFeature = feature;
            if (castFeature != null) {
                return castFeature;
            }
            j.m("feature");
            throw null;
        }
    }

    void addCastButton(Toolbar toolbar);

    void addCastButton(h hVar, Menu menu);

    /* synthetic */ void addCastSessionListener(SessionManagerListener sessionManagerListener);

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ VideoCastController createCastController(Activity activity);

    f createMediaRouteDialogFactory();

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ void endCastingSession();

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ com.amazon.aps.iva.ef.a getCastMediaLoader();

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ com.amazon.aps.iva.ye.f getCastStateProvider();

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ c getChromecastAudioReader();

    /* synthetic */ i getPlayServicesStatusChecker();

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ com.amazon.aps.iva.ye.h getPreferencesChromecastMessenger();

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ com.amazon.aps.iva.ye.j getSessionManagerProvider();

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ com.amazon.aps.iva.ye.h getSubtitleChromecastMessenger();

    @Override // com.amazon.aps.iva.ye.a
    /* synthetic */ com.amazon.aps.iva.ye.h getVersionsChromecastMessenger();

    /* synthetic */ void removeCastSessionListener(SessionManagerListener sessionManagerListener);
}
