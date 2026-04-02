package com.crunchyroll.profiles.presentation.avatar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.c8.k;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fm.g;
import com.amazon.aps.iva.jm.d;
import com.amazon.aps.iva.jm.h;
import com.amazon.aps.iva.jm.o;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.widgets.ScrollToggleRecyclerView;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AvatarSelectionActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/profiles/presentation/avatar/AvatarSelectionActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/jm/o;", "<init>", "()V", "profiles_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AvatarSelectionActivity extends com.amazon.aps.iva.i60.b implements o {
    public static final /* synthetic */ int n = 0;
    public final m k = f.b(new a());
    public final m l = f.b(new b());
    public com.amazon.aps.iva.cm.a m;

    /* compiled from: AvatarSelectionActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jm.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.jm.a invoke() {
            int i = AvatarSelectionActivity.n;
            return new com.amazon.aps.iva.jm.a(AvatarSelectionActivity.this.mi());
        }
    }

    /* compiled from: AvatarSelectionActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<h> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            AvatarSelectionActivity avatarSelectionActivity = AvatarSelectionActivity.this;
            j.f(avatarSelectionActivity, "activity");
            com.amazon.aps.iva.fm.f fVar = g.e;
            if (fVar != null) {
                DigitalAssetManagementService assetsService = fVar.getAssetsService();
                com.amazon.aps.iva.fm.f fVar2 = g.e;
                if (fVar2 != null) {
                    EtpAccountService accountService = fVar2.getAccountService();
                    com.amazon.aps.iva.fm.f fVar3 = g.e;
                    if (fVar3 != null) {
                        com.amazon.aps.iva.m30.a b = fVar3.b();
                        com.amazon.aps.iva.fm.f fVar4 = g.e;
                        if (fVar4 != null) {
                            return (h) new com.amazon.aps.iva.jm.g(avatarSelectionActivity, assetsService, accountService, b, fVar4.d()).h.getValue();
                        }
                        j.m("dependencies");
                        throw null;
                    }
                    j.m("dependencies");
                    throw null;
                }
                j.m("dependencies");
                throw null;
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: AvatarSelectionActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends i implements com.amazon.aps.iva.xb0.a<q> {
        public c(h hVar) {
            super(0, hVar, h.class, "onRetryClick", "onRetryClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((h) this.receiver).H0();
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void H() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            ((ScrollToggleRecyclerView) aVar.j).setScrollEnabled(true);
        } else {
            j.m("binding");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void He() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            View view = aVar.i;
            j.e(view, "binding.avatarSelectionErrorLayout");
            view.setVisibility(8);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void I9() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            TextView textView = aVar.d;
            j.e(textView, "binding.avatarSelectionUsername");
            textView.setVisibility(8);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void Rc(String str) {
        j.f(str, "username");
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            aVar.d.setText(str);
            com.amazon.aps.iva.cm.a aVar2 = this.m;
            if (aVar2 != null) {
                TextView textView = aVar2.d;
                j.e(textView, "binding.avatarSelectionUsername");
                textView.setVisibility(0);
                return;
            }
            j.m("binding");
            throw null;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void S(String str) {
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            ImageView imageView = (ImageView) aVar.h;
            j.e(imageView, "binding.avatarSelectionCurrentImage");
            imageUtil.loadRoundImage(this, str, imageView, R.drawable.avatar_failure, R.drawable.avatar_selection_placeholder);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void U6() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            TextView textView = aVar.c;
            j.e(textView, "binding.avatarSelectionSave");
            textView.setEnabled(true);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void X8(List<? extends d> list) {
        j.f(list, "avatars");
        ((com.amazon.aps.iva.jm.a) this.k.getValue()).e(list);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            FrameLayout frameLayout = aVar.e;
            j.e(frameLayout, "binding.avatarSelectionProgressContainer");
            frameLayout.setVisibility(0);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            FrameLayout frameLayout = aVar.e;
            j.e(frameLayout, "binding.avatarSelectionProgressContainer");
            frameLayout.setVisibility(8);
            return;
        }
        j.m("binding");
        throw null;
    }

    public final h mi() {
        return (h) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_avatar_selection, (ViewGroup) null, false);
        int i = R.id.avatar_selection_close;
        ImageView imageView = (ImageView) z.u(R.id.avatar_selection_close, inflate);
        if (imageView != null) {
            i = R.id.avatar_selection_current_image;
            ImageView imageView2 = (ImageView) z.u(R.id.avatar_selection_current_image, inflate);
            if (imageView2 != null) {
                i = R.id.avatar_selection_divider;
                View u = z.u(R.id.avatar_selection_divider, inflate);
                if (u != null) {
                    i = R.id.avatar_selection_error_layout;
                    View u2 = z.u(R.id.avatar_selection_error_layout, inflate);
                    if (u2 != null) {
                        i = R.id.avatar_selection_progress_container;
                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.avatar_selection_progress_container, inflate);
                        if (frameLayout != null) {
                            i = R.id.avatar_selection_recycler;
                            ScrollToggleRecyclerView scrollToggleRecyclerView = (ScrollToggleRecyclerView) z.u(R.id.avatar_selection_recycler, inflate);
                            if (scrollToggleRecyclerView != null) {
                                i = R.id.avatar_selection_save;
                                TextView textView = (TextView) z.u(R.id.avatar_selection_save, inflate);
                                if (textView != null) {
                                    i = R.id.avatar_selection_username;
                                    TextView textView2 = (TextView) z.u(R.id.avatar_selection_username, inflate);
                                    if (textView2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                        this.m = new com.amazon.aps.iva.cm.a(constraintLayout, imageView, imageView2, u, u2, frameLayout, scrollToggleRecyclerView, textView, textView2);
                                        j.e(constraintLayout, "binding.root");
                                        setContentView(constraintLayout);
                                        com.ellation.crunchyroll.mvp.lifecycle.a.a(mi(), this);
                                        com.amazon.aps.iva.cm.a aVar = this.m;
                                        if (aVar != null) {
                                            ((ImageView) aVar.g).setOnClickListener(new com.amazon.aps.iva.c8.j(this, 6));
                                            com.amazon.aps.iva.cm.a aVar2 = this.m;
                                            if (aVar2 != null) {
                                                aVar2.c.setOnClickListener(new k(this, 4));
                                                com.amazon.aps.iva.cm.a aVar3 = this.m;
                                                if (aVar3 != null) {
                                                    ScrollToggleRecyclerView scrollToggleRecyclerView2 = (ScrollToggleRecyclerView) aVar3.j;
                                                    scrollToggleRecyclerView2.setAdapter((com.amazon.aps.iva.jm.a) this.k.getValue());
                                                    scrollToggleRecyclerView2.setItemAnimator(null);
                                                    return;
                                                }
                                                j.m("binding");
                                                throw null;
                                            }
                                            j.m("binding");
                                            throw null;
                                        }
                                        j.m("binding");
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<h> setupPresenters() {
        return l1.H(mi());
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = findViewById(com.ellation.crunchyroll.ui.R.id.errors_layout);
        j.e(findViewById, "findViewById(UiResources.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void t4() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            View view = aVar.i;
            j.e(view, "binding.avatarSelectionErrorLayout");
            view.setVisibility(0);
            com.amazon.aps.iva.cm.a aVar2 = this.m;
            if (aVar2 != null) {
                View view2 = aVar2.i;
                j.e(view2, "binding.avatarSelectionErrorLayout");
                ((TextView) view2.findViewById(R.id.retry_text)).setOnClickListener(new com.amazon.aps.iva.zh.a(1, new c(mi())));
                return;
            }
            j.m("binding");
            throw null;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void uf() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            TextView textView = aVar.c;
            j.e(textView, "binding.avatarSelectionSave");
            textView.setEnabled(false);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.jm.o
    public final void v() {
        com.amazon.aps.iva.cm.a aVar = this.m;
        if (aVar != null) {
            ((ScrollToggleRecyclerView) aVar.j).setScrollEnabled(false);
        } else {
            j.m("binding");
            throw null;
        }
    }
}
