package com.amazon.aps.iva.sx;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.amazon.aps.iva.qo.u;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: WatchScreenRouterImpl.kt */
/* loaded from: classes2.dex */
public final class e implements u {
    public final Activity a;
    public final boolean b;

    public e(Activity activity, boolean z) {
        j.f(activity, "activity");
        this.a = activity;
        this.b = z;
    }

    @Override // com.amazon.aps.iva.qo.u
    public final void A() {
        HomeBottomBarActivity.x.getClass();
        Activity activity = this.a;
        HomeBottomBarActivity.a.a(activity);
        activity.finish();
    }

    @Override // com.amazon.aps.iva.qo.u
    public final void B(ContentContainer contentContainer) {
        String str;
        j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        Activity activity = this.a;
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getClassName();
        } else {
            str = null;
        }
        if (!j.a(str, ShowPageActivity.class.getName())) {
            ShowPageActivity.K.getClass();
            Intent intent = new Intent(activity, ShowPageActivity.class);
            intent.putExtra("show_page_input", new com.amazon.aps.iva.o40.j(contentContainer.getResourceType(), contentContainer.getId(), null));
            intent.putExtra("show_page_is_online", this.b);
            activity.startActivity(intent);
        }
        activity.finish();
    }

    @Override // com.amazon.aps.iva.qo.u
    public final void C(PlayableAsset playableAsset) {
        String str;
        Activity activity = this.a;
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getClassName();
        } else {
            str = null;
        }
        if (!j.a(str, ShowPageActivity.class.getName())) {
            ShowPageActivity.a aVar = ShowPageActivity.K;
            String parentId = playableAsset.getParentId();
            t parentType = playableAsset.getParentType();
            aVar.getClass();
            ShowPageActivity.a.b(activity, parentId, parentType, this.b);
        }
        activity.finish();
    }
}
