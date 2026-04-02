package com.ellation.crunchyroll.cast.castlistener;

import com.amazon.aps.iva.af.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.ye.b;
import com.ellation.crunchyroll.cast.controller.UIMediaControllerDecorator;
import kotlin.Metadata;
/* compiled from: VideoCastControllerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/aps/iva/ye/b;", "it", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/ye/b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class VideoCastControllerImpl$castSessionListener$1 extends l implements com.amazon.aps.iva.xb0.l<b, q> {
    final /* synthetic */ VideoCastControllerImpl this$0;

    /* compiled from: VideoCastControllerImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/amazon/aps/iva/af/a;", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Lcom/amazon/aps/iva/af/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.cast.castlistener.VideoCastControllerImpl$castSessionListener$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements com.amazon.aps.iva.xb0.l<a, q> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ q invoke(a aVar) {
            invoke2(aVar);
            return q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(a aVar) {
            j.f(aVar, "$this$notify");
            aVar.onCastSessionStarting();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCastControllerImpl$castSessionListener$1(VideoCastControllerImpl videoCastControllerImpl) {
        super(1);
        this.this$0 = videoCastControllerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(b bVar) {
        invoke2(bVar);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(b bVar) {
        UIMediaControllerDecorator uIMediaControllerDecorator;
        j.f(bVar, "it");
        uIMediaControllerDecorator = this.this$0.uiMediaController;
        uIMediaControllerDecorator.notify(AnonymousClass1.INSTANCE);
    }
}
