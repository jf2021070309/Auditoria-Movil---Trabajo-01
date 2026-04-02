package com.ellation.crunchyroll.ui.duration;

import android.content.Intent;
import android.content.res.Configuration;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import kotlin.Metadata;
/* compiled from: DurationLabelPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/DurationLabelPresenter;", "Lcom/amazon/aps/iva/wy/k;", "Lcom/ellation/crunchyroll/model/Panel;", "panel", "Lcom/amazon/aps/iva/kb0/q;", "bind", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface DurationLabelPresenter extends k {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: DurationLabelPresenter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/DurationLabelPresenter$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/ui/duration/DurationLabelPresenter;", "view", "Lcom/ellation/crunchyroll/ui/duration/DurationLabelView;", "durationFormatter", "Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DurationLabelPresenter create(DurationLabelView durationLabelView, DurationFormatter durationFormatter) {
            j.f(durationLabelView, "view");
            j.f(durationFormatter, "durationFormatter");
            return new DurationLabelPresenterImpl(durationLabelView, durationFormatter);
        }
    }

    /* compiled from: DurationLabelPresenter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(DurationLabelPresenter durationLabelPresenter, int i, int i2, Intent intent) {
        }

        public static void onConfigurationChanged(DurationLabelPresenter durationLabelPresenter, Configuration configuration) {
        }

        public static void onCreate(DurationLabelPresenter durationLabelPresenter) {
        }

        public static void onDestroy(DurationLabelPresenter durationLabelPresenter) {
        }

        public static void onNewIntent(DurationLabelPresenter durationLabelPresenter, Intent intent) {
            j.f(intent, "intent");
        }

        public static void onPause(DurationLabelPresenter durationLabelPresenter) {
        }

        public static void onResume(DurationLabelPresenter durationLabelPresenter) {
        }

        public static void onStart(DurationLabelPresenter durationLabelPresenter) {
        }

        public static void onStop(DurationLabelPresenter durationLabelPresenter) {
        }
    }

    void bind(Panel panel);

    @Override // com.amazon.aps.iva.wy.k
    /* synthetic */ void onActivityResult(int i, int i2, Intent intent);

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
