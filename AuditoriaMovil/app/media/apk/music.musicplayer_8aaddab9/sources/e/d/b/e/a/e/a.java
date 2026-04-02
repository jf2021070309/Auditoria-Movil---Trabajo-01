package e.d.b.e.a.e;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import e.d.b.e.a.g.n;
import e.d.b.e.a.g.r;
/* loaded from: classes2.dex */
public final class a {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f7014b = new Handler(Looper.getMainLooper());

    public a(e eVar) {
        this.a = eVar;
    }

    public final r<Void> a(Activity activity, ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.b());
        n nVar = new n();
        intent.putExtra("result_receiver", new com.google.android.play.core.review.b(this.f7014b, nVar));
        activity.startActivity(intent);
        return nVar.a;
    }
}
