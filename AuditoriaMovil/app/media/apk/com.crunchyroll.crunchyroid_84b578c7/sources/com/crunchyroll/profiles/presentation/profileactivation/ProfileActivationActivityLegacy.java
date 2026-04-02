package com.crunchyroll.profiles.presentation.profileactivation;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.bt.c;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fm.g;
import com.amazon.aps.iva.i70.k;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.qm.n;
import com.amazon.aps.iva.qm.o;
import com.amazon.aps.iva.qm.z;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.profiles.presentation.avatar.AvatarSelectionActivity;
import com.crunchyroll.profiles.presentation.profileactivation.username.UsernameInputView;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.widgets.input.CenterErrorTextInputLayout;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ProfileActivationActivityLegacy.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/profiles/presentation/profileactivation/ProfileActivationActivityLegacy;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/qm/z;", "<init>", "()V", "profiles_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ProfileActivationActivityLegacy extends com.amazon.aps.iva.i60.b implements z {
    public static final /* synthetic */ int m = 0;
    public final m k = f.b(new a());
    public com.amazon.aps.iva.cm.b l;

    /* compiled from: ProfileActivationActivityLegacy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.qm.m> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.qm.m invoke() {
            ProfileActivationActivityLegacy profileActivationActivityLegacy = ProfileActivationActivityLegacy.this;
            j.f(profileActivationActivityLegacy, "activity");
            com.amazon.aps.iva.fm.f fVar = g.e;
            if (fVar != null) {
                EtpAccountService accountService = fVar.getAccountService();
                com.amazon.aps.iva.fm.f fVar2 = g.e;
                if (fVar2 != null) {
                    com.amazon.aps.iva.m30.a b = fVar2.b();
                    com.amazon.aps.iva.fm.f fVar3 = g.e;
                    if (fVar3 != null) {
                        com.amazon.aps.iva.m30.b d = fVar3.d();
                        com.amazon.aps.iva.fm.f fVar4 = g.e;
                        if (fVar4 != null) {
                            return new n(profileActivationActivityLegacy, accountService, b, d, fVar4.getJwtInvalidator());
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

    /* compiled from: TextView.kt */
    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = ProfileActivationActivityLegacy.m;
            ProfileActivationActivityLegacy.this.mi().getPresenter().x2();
        }
    }

    @Override // com.amazon.aps.iva.qm.z
    public final void S(String str) {
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            ImageView imageView = bVar.d;
            j.e(imageView, "binding.profileActivationImage");
            imageUtil.loadRoundImage(this, str, imageView, R.drawable.avatar_failure, R.drawable.avatar_placeholder);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.qm.z
    public final void Sg() {
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            TextView textView = bVar.j;
            j.e(textView, "binding.profileActivationUsernameRandomize");
            textView.setVisibility(4);
            com.amazon.aps.iva.cm.b bVar2 = this.l;
            if (bVar2 != null) {
                ProgressBar progressBar = (ProgressBar) bVar2.i.b;
                j.e(progressBar, "binding.profileActivationUsernameProgress.root");
                progressBar.setVisibility(0);
                return;
            }
            j.m("binding");
            throw null;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            FrameLayout frameLayout = bVar.e;
            j.e(frameLayout, "binding.profileActivationProgress");
            frameLayout.setVisibility(0);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            FrameLayout frameLayout = bVar.e;
            j.e(frameLayout, "binding.profileActivationProgress");
            frameLayout.setVisibility(8);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.qm.z
    public final void e5(String str) {
        j.f(str, "message");
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            bVar.g.B(k.ERROR);
            com.amazon.aps.iva.cm.b bVar2 = this.l;
            if (bVar2 != null) {
                bVar2.h.setErrorEnabled(true);
                com.amazon.aps.iva.cm.b bVar3 = this.l;
                if (bVar3 != null) {
                    bVar3.h.setError(str);
                    return;
                } else {
                    j.m("binding");
                    throw null;
                }
            }
            j.m("binding");
            throw null;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.qm.z
    public final void f4(c cVar) {
        j.f(cVar, "message");
        int i = h.a;
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            FrameLayout frameLayout = bVar.f;
            j.e(frameLayout, "binding.profileActivationSnackbarContainer");
            h.a.a(frameLayout, cVar);
            return;
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.qm.z
    public final void h6() {
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            bVar.h.setError(null);
            com.amazon.aps.iva.cm.b bVar2 = this.l;
            if (bVar2 != null) {
                bVar2.h.setErrorEnabled(false);
                return;
            } else {
                j.m("binding");
                throw null;
            }
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.qm.z
    public final void ja() {
        setResult(4013);
    }

    @Override // com.amazon.aps.iva.qm.z
    public final void ke(String str) {
        Intent intent = new Intent(this, AvatarSelectionActivity.class);
        intent.putExtra("avatar_username", str);
        startActivity(intent);
    }

    public final com.amazon.aps.iva.qm.m mi() {
        return (com.amazon.aps.iva.qm.m) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_profile_activation_v2, (ViewGroup) null, false);
        int i = R.id.profile_activation_checkmark;
        if (((ImageView) com.amazon.aps.iva.e.z.u(R.id.profile_activation_checkmark, inflate)) != null) {
            i = R.id.profile_activation_close_button;
            ImageView imageView = (ImageView) com.amazon.aps.iva.e.z.u(R.id.profile_activation_close_button, inflate);
            if (imageView != null) {
                i = R.id.profile_activation_done;
                DataInputButton dataInputButton = (DataInputButton) com.amazon.aps.iva.e.z.u(R.id.profile_activation_done, inflate);
                if (dataInputButton != null) {
                    i = R.id.profile_activation_icon_info;
                    if (((ImageView) com.amazon.aps.iva.e.z.u(R.id.profile_activation_icon_info, inflate)) != null) {
                        i = R.id.profile_activation_image;
                        ImageView imageView2 = (ImageView) com.amazon.aps.iva.e.z.u(R.id.profile_activation_image, inflate);
                        if (imageView2 != null) {
                            i = R.id.profile_activation_progress;
                            FrameLayout frameLayout = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.profile_activation_progress, inflate);
                            if (frameLayout != null) {
                                i = R.id.profile_activation_snackbar_container;
                                FrameLayout frameLayout2 = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.profile_activation_snackbar_container, inflate);
                                if (frameLayout2 != null) {
                                    i = R.id.profile_activation_title;
                                    if (((TextView) com.amazon.aps.iva.e.z.u(R.id.profile_activation_title, inflate)) != null) {
                                        i = R.id.profile_activation_username_container;
                                        if (((FrameLayout) com.amazon.aps.iva.e.z.u(R.id.profile_activation_username_container, inflate)) != null) {
                                            i = R.id.profile_activation_username_info;
                                            if (((TextView) com.amazon.aps.iva.e.z.u(R.id.profile_activation_username_info, inflate)) != null) {
                                                i = R.id.profile_activation_username_input;
                                                UsernameInputView usernameInputView = (UsernameInputView) com.amazon.aps.iva.e.z.u(R.id.profile_activation_username_input, inflate);
                                                if (usernameInputView != null) {
                                                    i = R.id.profile_activation_username_input_layout;
                                                    CenterErrorTextInputLayout centerErrorTextInputLayout = (CenterErrorTextInputLayout) com.amazon.aps.iva.e.z.u(R.id.profile_activation_username_input_layout, inflate);
                                                    if (centerErrorTextInputLayout != null) {
                                                        i = R.id.profile_activation_username_progress;
                                                        View u = com.amazon.aps.iva.e.z.u(R.id.profile_activation_username_progress, inflate);
                                                        if (u != null) {
                                                            ProgressBar progressBar = (ProgressBar) u;
                                                            com.amazon.aps.iva.pu.f fVar = new com.amazon.aps.iva.pu.f(progressBar, progressBar, 1);
                                                            TextView textView = (TextView) com.amazon.aps.iva.e.z.u(R.id.profile_activation_username_randomize, inflate);
                                                            if (textView != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                this.l = new com.amazon.aps.iva.cm.b(constraintLayout, imageView, dataInputButton, imageView2, frameLayout, frameLayout2, usernameInputView, centerErrorTextInputLayout, fVar, textView);
                                                                j.e(constraintLayout, "binding.root");
                                                                setContentView(constraintLayout);
                                                                com.amazon.aps.iva.cm.b bVar = this.l;
                                                                if (bVar != null) {
                                                                    bVar.j.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 5));
                                                                    com.amazon.aps.iva.cm.b bVar2 = this.l;
                                                                    if (bVar2 != null) {
                                                                        bVar2.d.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 7));
                                                                        com.amazon.aps.iva.cm.b bVar3 = this.l;
                                                                        if (bVar3 != null) {
                                                                            UsernameInputView usernameInputView2 = bVar3.g;
                                                                            j.e(usernameInputView2, "binding.profileActivationUsernameInput");
                                                                            bVar3.c.G(usernameInputView2);
                                                                            com.amazon.aps.iva.cm.b bVar4 = this.l;
                                                                            if (bVar4 != null) {
                                                                                bVar4.c.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 1));
                                                                                com.amazon.aps.iva.cm.b bVar5 = this.l;
                                                                                if (bVar5 != null) {
                                                                                    bVar5.g.getEditText().addTextChangedListener(new b());
                                                                                    com.amazon.aps.iva.cm.b bVar6 = this.l;
                                                                                    if (bVar6 != null) {
                                                                                        bVar6.b.setOnClickListener(new com.amazon.aps.iva.c8.j(this, 7));
                                                                                        return;
                                                                                    } else {
                                                                                        j.m("binding");
                                                                                        throw null;
                                                                                    }
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
                                                                    j.m("binding");
                                                                    throw null;
                                                                }
                                                                j.m("binding");
                                                                throw null;
                                                            }
                                                            i = R.id.profile_activation_username_randomize;
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // com.amazon.aps.iva.qm.z
    public final void setUsername(String str) {
        j.f(str, "username");
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            bVar.g.clearText();
            com.amazon.aps.iva.cm.b bVar2 = this.l;
            if (bVar2 != null) {
                bVar2.g.getEditText().append(str);
                return;
            } else {
                j.m("binding");
                throw null;
            }
        }
        j.m("binding");
        throw null;
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<o> setupPresenters() {
        return l1.H(mi().getPresenter());
    }

    @Override // com.amazon.aps.iva.qm.z
    public final void t3() {
        com.amazon.aps.iva.cm.b bVar = this.l;
        if (bVar != null) {
            ProgressBar progressBar = (ProgressBar) bVar.i.b;
            j.e(progressBar, "binding.profileActivationUsernameProgress.root");
            progressBar.setVisibility(8);
            com.amazon.aps.iva.cm.b bVar2 = this.l;
            if (bVar2 != null) {
                TextView textView = bVar2.j;
                j.e(textView, "binding.profileActivationUsernameRandomize");
                textView.setVisibility(0);
                return;
            }
            j.m("binding");
            throw null;
        }
        j.m("binding");
        throw null;
    }
}
