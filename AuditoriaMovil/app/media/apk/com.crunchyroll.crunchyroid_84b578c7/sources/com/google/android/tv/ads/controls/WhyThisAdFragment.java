package com.google.android.tv.ads.controls;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.ec.f;
import com.amazon.aps.iva.ec.g;
import com.amazon.aps.iva.hd.e;
import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.uc.m;
import com.amazon.aps.iva.uc.r;
import com.bumptech.glide.a;
import com.bumptech.glide.manager.b;
import com.google.android.gms.internal.atv_ads_framework.zzar;
import com.google.android.tv.ads.R;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class WhyThisAdFragment extends Fragment {
    public static final /* synthetic */ int zza = 0;
    private ImageView zzb;
    private ConstraintLayout zzc;
    private ConstraintLayout zzd;

    public WhyThisAdFragment() {
        super(R.layout.fragment_why_this_ad);
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.zzc.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.zzd.getTranslationX() / this.zzd.getWidth();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g a;
        viewGroup.getClass();
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_why_this_ad, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.why_this_ad_base_layout);
        constraintLayout.getClass();
        this.zzc = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate.findViewById(R.id.why_this_ad_layout);
        constraintLayout2.getClass();
        this.zzd = constraintLayout2;
        this.zzc.setAlpha(0.0f);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), R.animator.animator_drawer_in);
        animatorSet.setTarget(this);
        animatorSet.start();
        final AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(requireContext(), R.animator.animator_drawer_out);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new zzf(this));
        Button button = (Button) inflate.findViewById(R.id.why_this_ad_back_button);
        button.getClass();
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.tv.ads.controls.zzd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnimatorSet animatorSet3 = animatorSet2;
                int i = WhyThisAdFragment.zza;
                animatorSet3.start();
            }
        });
        requireActivity().getOnBackPressedDispatcher().a(this, new zzg(this, true, animatorSet2));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.wta_image_view);
        imageView.getClass();
        this.zzb = imageView;
        String string = requireArguments().getString("wta_uri");
        string.getClass();
        String string2 = requireArguments().getString("wta_alt_text");
        if (!TextUtils.isEmpty(string2)) {
            this.zzb.setContentDescription(string2);
        }
        b b = a.b(getContext());
        b.getClass();
        if (getContext() != null) {
            char[] cArr = l.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            }
            if (!z) {
                a = b.b(getContext().getApplicationContext());
            } else {
                if (getActivity() != null) {
                    b.d.a(getActivity());
                }
                FragmentManager childFragmentManager = getChildFragmentManager();
                Context context = getContext();
                a = b.e.a(context, a.a(context.getApplicationContext()), getLifecycle(), childFragmentManager, isVisible());
            }
            String zza2 = zzar.zza(string, "zTvAdsFrameworkz");
            a.getClass();
            f E = new f(a.b, a, Drawable.class, a.c).E(zza2);
            E.getClass();
            f fVar = (f) E.o(m.a, new r(), true);
            fVar.C(new zze(this, this.zzb), null, fVar, e.a);
            return inflate;
        }
        throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
    }

    @Keep
    public void setBackgroundAlpha(float f) {
        this.zzc.setAlpha(f);
        this.zzc.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f) {
        ConstraintLayout constraintLayout = this.zzd;
        constraintLayout.setTranslationX(constraintLayout.getWidth() * f);
        this.zzd.invalidate();
    }
}
