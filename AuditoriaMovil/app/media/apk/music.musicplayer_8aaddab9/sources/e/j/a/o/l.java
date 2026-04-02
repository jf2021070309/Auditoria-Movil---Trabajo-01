package e.j.a.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import c.p.p;
import c.p.q;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class l extends AnimatorListenerAdapter {
    public final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8501b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f8502c;

    public l(Activity activity, ViewGroup viewGroup, f fVar) {
        this.a = activity;
        this.f8501b = viewGroup;
        this.f8502c = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(R.id.ph_ad_close_container);
        viewGroup.removeAllViews();
        this.f8501b.setVisibility(8);
        viewGroup.setMinimumHeight((int) TypedValue.applyDimension(1, 250.0f, this.a.getResources().getDisplayMetrics()));
        f fVar = this.f8502c;
        Activity activity = this.a;
        Objects.requireNonNull(fVar);
        q.a((p) activity).j(new j(fVar, activity, null));
        View findViewById = this.a.findViewById(R.id.ph_ad_close_progress);
        h.o.c.j.d(findViewById, "activity.findViewById<Vi….id.ph_ad_close_progress)");
        findViewById.setVisibility(0);
    }
}
