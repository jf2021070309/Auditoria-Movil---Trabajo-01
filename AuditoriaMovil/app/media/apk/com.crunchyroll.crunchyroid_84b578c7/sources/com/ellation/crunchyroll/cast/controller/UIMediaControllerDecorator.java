package com.ellation.crunchyroll.cast.controller;

import android.app.Activity;
import android.widget.ImageView;
import com.amazon.aps.iva.af.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.cast.framework.media.ImageHints;
import kotlin.Metadata;
/* compiled from: UIMediaControllerDecorator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fJ\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerDecorator;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/af/a;", "Landroid/widget/ImageView;", "view", "Lcom/google/android/gms/cast/framework/media/ImageHints;", "imageHints", "", "placeHolderDrawableResId", "Lcom/amazon/aps/iva/kb0/q;", "bindImageViewToImageOfCurrentItem", "dispose", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface UIMediaControllerDecorator extends EventDispatcher<a> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: UIMediaControllerDecorator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerDecorator$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerDecorator;", "activity", "Landroid/app/Activity;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final UIMediaControllerDecorator create(Activity activity) {
            j.f(activity, "activity");
            return new UIMediaControllerDecoratorImpl(activity, null, 2, null);
        }
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    /* synthetic */ void addEventListener(a aVar);

    void bindImageViewToImageOfCurrentItem(ImageView imageView, ImageHints imageHints, int i);

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    /* synthetic */ void clear();

    void dispose();

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    /* synthetic */ int getListenerCount();

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    /* synthetic */ void notify(l<? super a, q> lVar);

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    /* synthetic */ void removeEventListener(a aVar);
}
