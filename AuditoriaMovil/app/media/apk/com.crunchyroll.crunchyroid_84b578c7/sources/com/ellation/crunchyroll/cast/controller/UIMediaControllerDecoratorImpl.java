package com.ellation.crunchyroll.cast.controller;

import android.app.Activity;
import com.amazon.aps.iva.af.a;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.extension.LifecycleExtensionsKt;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UIMediaControllerDecorator.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\u001d\u0010\n\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\bH\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0096\u0001J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerDecoratorImpl;", "Lcom/google/android/gms/cast/framework/media/uicontroller/UIMediaController;", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerDecorator;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/af/a;", "Lcom/amazon/aps/iva/kb0/q;", "notifyMetadataUpdated", "clear", "Lkotlin/Function1;", "action", "notify", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeEventListener", "addEventListener", "onMetadataUpdated", "eventDispatcher", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper;", "wrapper", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper;", "", "getListenerCount", "()I", "listenerCount", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UIMediaControllerDecoratorImpl extends UIMediaController implements UIMediaControllerDecorator, EventDispatcher<a> {
    private final EventDispatcher<a> eventDispatcher;
    private final UIMediaControllerWrapper wrapper;

    /* compiled from: UIMediaControllerDecorator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.controller.UIMediaControllerDecoratorImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements com.amazon.aps.iva.xb0.a<q> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ q invoke() {
            invoke2();
            return q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UIMediaControllerDecoratorImpl.this.eventDispatcher.clear();
        }
    }

    public /* synthetic */ UIMediaControllerDecoratorImpl(Activity activity, EventDispatcher eventDispatcher, int i, e eVar) {
        this(activity, (i & 2) != 0 ? new EventDispatcher.EventDispatcherImpl() : eventDispatcher);
    }

    private final void notifyMetadataUpdated() {
        notify(new UIMediaControllerDecoratorImpl$notifyMetadataUpdated$1(this));
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerDecorator, com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void clear() {
        this.eventDispatcher.clear();
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerDecorator, com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public int getListenerCount() {
        return this.eventDispatcher.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerDecorator, com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void notify(com.amazon.aps.iva.xb0.l<? super a, q> lVar) {
        j.f(lVar, "action");
        this.eventDispatcher.notify(lVar);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIMediaController, com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public void onMetadataUpdated() {
        super.onMetadataUpdated();
        notifyMetadataUpdated();
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerDecorator, com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void removeEventListener(a aVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.eventDispatcher.removeEventListener(aVar);
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerDecorator, com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void addEventListener(a aVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.eventDispatcher.addEventListener(aVar);
        notifyMetadataUpdated();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIMediaControllerDecoratorImpl(Activity activity, EventDispatcher<a> eventDispatcher) {
        super(activity);
        j.f(activity, "activity");
        j.f(eventDispatcher, "eventDispatcher");
        this.eventDispatcher = eventDispatcher;
        this.wrapper = UIMediaControllerWrapper.Companion.create(this);
        LifecycleExtensionsKt.b(((o) activity).getLifecycle(), new AnonymousClass1());
    }
}
