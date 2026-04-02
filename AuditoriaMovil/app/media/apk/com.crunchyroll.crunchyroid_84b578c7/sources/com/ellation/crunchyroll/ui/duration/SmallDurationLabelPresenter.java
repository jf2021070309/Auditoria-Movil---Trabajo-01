package com.ellation.crunchyroll.ui.duration;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.DurationProvider;
import com.ellation.crunchyroll.model.PlayheadTimeProvider;
import kotlin.Metadata;
/* compiled from: SmallDurationLabelPresenter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelPresenter;", "Lcom/amazon/aps/iva/wy/k;", "Lcom/ellation/crunchyroll/model/PlayheadTimeProvider;", "playheadProvider", "Lcom/ellation/crunchyroll/model/DurationProvider;", "durationProvider", "Lcom/amazon/aps/iva/kb0/q;", "onBind", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface SmallDurationLabelPresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: SmallDurationLabelPresenter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelPresenter$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelPresenter;", "view", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationLabelView;", "durationFormatter", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatter;", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final SmallDurationLabelPresenter create(SmallDurationLabelView smallDurationLabelView, SmallDurationFormatter smallDurationFormatter) {
            j.f(smallDurationLabelView, "view");
            j.f(smallDurationFormatter, "durationFormatter");
            return new SmallDurationLabelPresenterImpl(smallDurationLabelView, smallDurationFormatter);
        }
    }

    /* compiled from: SmallDurationLabelPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(SmallDurationLabelPresenter smallDurationLabelPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(SmallDurationLabelPresenter smallDurationLabelPresenter, Configuration configuration) {
        }

        public static void onCreate(SmallDurationLabelPresenter smallDurationLabelPresenter) {
        }

        public static void onDestroy(SmallDurationLabelPresenter smallDurationLabelPresenter) {
        }

        public static void onNewIntent(SmallDurationLabelPresenter smallDurationLabelPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(SmallDurationLabelPresenter smallDurationLabelPresenter) {
        }

        public static void onResume(SmallDurationLabelPresenter smallDurationLabelPresenter) {
        }

        public static void onStart(SmallDurationLabelPresenter smallDurationLabelPresenter) {
        }

        public static void onStop(SmallDurationLabelPresenter smallDurationLabelPresenter) {
        }
    }

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onActivityResult(int i, int i2, Intent intent);

    void onBind(PlayheadTimeProvider playheadTimeProvider, DurationProvider durationProvider);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onCreate();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onDestroy();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onNewIntent(Intent intent);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onPause();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onPreDestroy();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onResume();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStart();

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onStop();
}
