package com.google.android.play.core.ktx;

import android.app.Activity;
import com.amazon.aps.iva.a60.b;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.se0.n;
import com.amazon.aps.iva.ue0.i;
import com.amazon.aps.iva.ue0.w;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import kotlin.Metadata;
/* compiled from: com.google.android.play:review-ktx@@2.0.1 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u0003*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/google/android/play/core/review/ReviewManager;", "Landroid/app/Activity;", "activity", "Lcom/google/android/play/core/review/ReviewInfo;", "reviewInfo", "Lcom/amazon/aps/iva/kb0/q;", "launchReview", "(Lcom/google/android/play/core/review/ReviewManager;Landroid/app/Activity;Lcom/google/android/play/core/review/ReviewInfo;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "requestReview", "(Lcom/google/android/play/core/review/ReviewManager;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/android/gms/tasks/Task;", "task", "Lkotlin/Function0;", "onCanceled", "runTask", "(Lcom/google/android/gms/tasks/Task;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "E", "Lcom/amazon/aps/iva/ue0/w;", "element", "", "tryOffer", "(Lcom/amazon/aps/iva/ue0/w;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_review_ktx"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ReviewManagerKtxKt {
    public static final Object launchReview(ReviewManager reviewManager, Activity activity, ReviewInfo reviewInfo, d<? super q> dVar) {
        Task<Void> launchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
        j.e(launchReviewFlow, "launchReviewFlow(activity, reviewInfo)");
        Object runTask$default = runTask$default(launchReviewFlow, null, dVar, 2, null);
        if (runTask$default == a.COROUTINE_SUSPENDED) {
            return runTask$default;
        }
        return q.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requestReview(com.google.android.play.core.review.ReviewManager r4, com.amazon.aps.iva.ob0.d<? super com.google.android.play.core.review.ReviewInfo> r5) {
        /*
            boolean r0 = r5 instanceof com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1
            if (r0 == 0) goto L13
            r0 = r5
            com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 r0 = (com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 r0 = new com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.google.android.gms.tasks.Task r4 = r4.requestReviewFlow()
            java.lang.String r5 = "requestReviewFlow()"
            com.amazon.aps.iva.yb0.j.e(r4, r5)
            r0.label = r3
            r5 = 0
            r2 = 2
            java.lang.Object r5 = runTask$default(r4, r5, r0, r2, r5)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "runTask(requestReviewFlow())"
            com.amazon.aps.iva.yb0.j.e(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.ReviewManagerKtxKt.requestReview(com.google.android.play.core.review.ReviewManager, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final <T> Object runTask(Task<T> task, com.amazon.aps.iva.xb0.a<q> aVar, d<? super T> dVar) {
        final n nVar = new n(1, b.s(dVar));
        nVar.r();
        nVar.w(new ReviewManagerKtxKt$runTask$3$1(aVar));
        if (task.isComplete()) {
            if (task.isSuccessful()) {
                nVar.resumeWith(task.getResult());
            } else {
                Exception exception = task.getException();
                j.c(exception);
                nVar.resumeWith(x.H(exception));
            }
        } else {
            task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t) {
                    nVar.resumeWith(t);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    j.f(exc, "exception");
                    nVar.resumeWith(x.H(exc));
                }
            });
        }
        Object q = nVar.q();
        a aVar2 = a.COROUTINE_SUSPENDED;
        return q;
    }

    public static /* synthetic */ Object runTask$default(Task task, com.amazon.aps.iva.xb0.a aVar, d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = ReviewManagerKtxKt$runTask$2.INSTANCE;
        }
        return runTask(task, aVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(w<? super E> wVar, E e) {
        j.f(wVar, "<this>");
        return !(wVar.h(e) instanceof i.b);
    }
}
