package com.ellation.crunchyroll.ui.userratingbar;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: UserRatingBarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserRatingBarPresenterImpl$onInterceptTouchEvent$1 extends l implements a<q> {
    final /* synthetic */ float $eventX;
    final /* synthetic */ float $eventY;
    final /* synthetic */ int $measuredHeight;
    final /* synthetic */ int $measuredWidth;
    final /* synthetic */ UserRatingBarPresenterImpl this$0;

    /* compiled from: UserRatingBarPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenterImpl$onInterceptTouchEvent$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements a<q> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ q invoke() {
            invoke2();
            return q.a;
        }
    }

    /* compiled from: UserRatingBarPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.ellation.crunchyroll.ui.userratingbar.UserRatingBarPresenterImpl$onInterceptTouchEvent$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends l implements a<q> {
        final /* synthetic */ UserRatingBarPresenterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UserRatingBarPresenterImpl userRatingBarPresenterImpl) {
            super(0);
            this.this$0 = userRatingBarPresenterImpl;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ q invoke() {
            invoke2();
            return q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.cancelAction();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRatingBarPresenterImpl$onInterceptTouchEvent$1(UserRatingBarPresenterImpl userRatingBarPresenterImpl, float f, int i, float f2, int i2) {
        super(0);
        this.this$0 = userRatingBarPresenterImpl;
        this.$eventX = f;
        this.$measuredWidth = i;
        this.$eventY = f2;
        this.$measuredHeight = i2;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public /* bridge */ /* synthetic */ q invoke() {
        invoke2();
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UserRatingBarView view;
        UserRatingBarPresenterDelegate userRatingBarPresenterDelegate;
        view = this.this$0.getView();
        view.requestDisallowInterceptTouchEvent(false);
        userRatingBarPresenterDelegate = this.this$0.delegate;
        userRatingBarPresenterDelegate.checkViewBoundsAndPerformAction(this.$eventX, this.$measuredWidth, this.$eventY, this.$measuredHeight, AnonymousClass1.INSTANCE, new AnonymousClass2(this.this$0));
        this.this$0.shouldAllowTouchEvents = true;
    }
}
