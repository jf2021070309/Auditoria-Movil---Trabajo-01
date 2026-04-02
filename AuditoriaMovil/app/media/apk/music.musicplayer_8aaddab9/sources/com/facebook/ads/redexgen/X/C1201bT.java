package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.bT  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1201bT extends C5E implements MediaViewApi, Repairable, C8S {
    public static byte[] A0E;
    public static String[] A0F = {"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    @Nullable
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C1046Xo A07;
    public C1A A08;
    public O7 A09;
    @Nullable
    public C04529n A0A;
    @Nullable
    public C0830Pc A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0E = new byte[]{56, 26, 9, 20, 14, 8, 30, 23, 91, 9, 30, 21, 31, 30, 9, 30, 9, 91, 22, 14, 8, 15, 91, 25, 30, 91, 8, 30, 15, 91, 25, 30, 29, 20, 9, 30, 91, 21, 26, 15, 18, 13, 30, 58, 31, 85, 26, 30, 29, 41, 56, 53, 57, 50, 63, 57, 18, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, Byte.MAX_VALUE, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, 18, 53, 45, 58, 55, 50, 63, 123, 13, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, 42, 111, 14, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, 11, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, 63, 56, 125, 46, 56, 41, 125, 63, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, 28, 57, 115, 26, 11, 18, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 109, 98, 119, 106, 117, 102, 45, 96, 111, 106, 96, 104, 102, 103, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    static {
        A07();
        A0G = MediaView.class.getSimpleName();
    }

    private void A04() {
        C04529n c04529n = this.A0A;
        if (c04529n != null) {
            c04529n.setVisibility(8);
            AnonymousClass38.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A05() {
        if (!this.A0D) {
            View view = this.A01;
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (view != null) {
                ML.A0J(this.A08);
            }
            float f2 = C0739Lm.A00;
            int round = Math.round(4.0f * f2);
            int round2 = Math.round(12.0f * f2);
            this.A08.setChildSpacing(round);
            this.A08.setPadding(0, round2, 0, round2);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A03(0, 46, 84));
    }

    private void A06() {
        EnumC0742Lr.A04(this.A03, EnumC0742Lr.A0A);
        EnumC0742Lr.A04(this.A09, EnumC0742Lr.A0A);
        EnumC0742Lr.A04(this.A05, EnumC0742Lr.A0A);
        EnumC0742Lr.A04(this.A01, EnumC0742Lr.A0A);
    }

    private final void A08(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A09(View view, U1 u1) {
        C0830Pc c0830Pc = this.A0B;
        if (c0830Pc != null) {
            MediaView mediaView = this.A03;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(c0830Pc);
        }
        if (!u1.A1e()) {
            return;
        }
        String A1E = u1.A1E();
        Context context = this.A03.getContext();
        String[] strArr3 = A0F;
        if (strArr3[5].length() != strArr3[0].length()) {
            String[] strArr4 = A0F;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        C0830Pc A01 = C0829Pb.A01(this.A07, A1E);
        if (A0F[7].charAt(21) != 'L') {
            A0F[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        } else {
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A08(this.A0B, layoutParams);
        this.A06.bringChildToFront(this.A0B);
    }

    private void A0A(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                ML.A0J(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(ML.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A03(106, 49, 6));
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    private final void A0B(C1046Xo c1046Xo, AttributeSet attributeSet, int i2, int i3, MediaView mediaView) {
        this.A03 = mediaView;
        A0A(new ImageView(c1046Xo, attributeSet, i2, i3));
        A0G(new O7(c1046Xo, attributeSet, i2, i3));
        this.A08 = new C1A(c1046Xo, attributeSet, i2);
        A05();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1046Xo, attributeSet, i2, i3));
        A06();
    }

    private final void A0C(C1046Xo c1046Xo, AttributeSet attributeSet, int i2, MediaView mediaView) {
        this.A03 = mediaView;
        A0A(new ImageView(c1046Xo, attributeSet, i2));
        A0G(new O7(c1046Xo, attributeSet, i2));
        this.A08 = new C1A(c1046Xo, attributeSet, i2);
        A05();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1046Xo, attributeSet, i2));
        A06();
    }

    private final void A0D(C1046Xo c1046Xo, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0A(new ImageView(c1046Xo, attributeSet));
        A0G(new O7(c1046Xo, attributeSet));
        this.A08 = new C1A(c1046Xo, attributeSet);
        A05();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1046Xo, attributeSet));
        A06();
    }

    private final void A0E(C1046Xo c1046Xo, MediaView mediaView) {
        this.A03 = mediaView;
        A0A(new ImageView(c1046Xo));
        A0G(new O7(c1046Xo));
        this.A08 = new C1A(c1046Xo);
        A05();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1046Xo));
        A06();
    }

    private void A0F(U1 u1, boolean z, K4 k4) {
        AsyncTaskC0925St A04 = new AsyncTaskC0925St(this.A02, this.A07).A04();
        if (z) {
            A04.A06(new C1207bZ(this, u1));
        }
        A04.A07(k4.getUrl());
    }

    private void A0G(O7 o7) {
        if (!this.A0D) {
            O7 o72 = this.A09;
            if (o72 != null) {
                this.A03.removeView(o72);
            }
            o7.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(o7, layoutParams);
            this.A09 = o7;
            return;
        }
        throw new IllegalStateException(A03(63, 43, 38));
    }

    private boolean A0H(NativeAd nativeAd) {
        List<NativeAd> A03 = ((C5M) nativeAd.getNativeAdApi()).A03();
        if (A03 == null) {
            return false;
        }
        for (NativeAd childNativeAd : A03) {
            if (childNativeAd.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C5M) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0362, code lost:
        if ((r1 instanceof com.facebook.ads.redexgen.X.C0801Ny) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0364, code lost:
        ((com.facebook.ads.redexgen.X.C0801Ny) r1).A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03b7, code lost:
        if ((r1 instanceof com.facebook.ads.redexgen.X.C0801Ny) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03ba, code lost:
        ((com.facebook.ads.redexgen.X.F6) r1).setAdapter(null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(com.facebook.ads.NativeAd r18) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1201bT.A0K(com.facebook.ads.NativeAd):void");
    }

    public final void A0L(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        C1046Xo A13 = ((U1) nativeAdBaseApi).A13();
        this.A07.A0F(A13);
        A13.A0G(this);
        this.A0D = true;
        U1 A0L = U1.A0L(nativeAdBaseApi);
        A0L.A1R(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.A01;
            if (view2 instanceof C0801Ny) {
                ((C0801Ny) view2).A04();
            } else {
                ((F6) view2).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        K4 adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            Bitmap A0K = A0L.A12().A0K(adIcon.getUrl());
            if (A0K != null) {
                this.A02.setImageBitmap(A0K);
                if (z) {
                    this.A03.post(new C1208ba(this, A0L));
                }
            } else {
                A0F(A0L, z, adIcon);
            }
        } else {
            U0 A17 = A0L.A17();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A13.A0D().A2a(A0L.A0z(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A17 != null) {
                A17.AAh(KG.A00(adErrorType));
            }
            Log.e(A03(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                this.A07.A06().A8y(A03(258, 3, 84), C04398z.A0O, new AnonymousClass90(A03(192, 23, 96)));
            }
        }
        A09(this.A02, A0L);
    }

    public final boolean A0M() {
        View view = this.A01;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C8S
    public final C1046Xo A5a() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A01 || view == this.A05 || view == this.A09 || view == this.A02) {
            this.A06.bringChildToFront(view);
            C0830Pc c0830Pc = this.A0B;
            if (c0830Pc != null) {
                this.A06.bringChildToFront(c0830Pc);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        if (A0F[1].charAt(24) != 't') {
            A0F[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getWidth();
        }
        String[] strArr = A0F;
        if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
            String[] strArr2 = A0F;
            strArr2[5] = "pFreRfYdfw1";
            strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1046Xo) {
            this.A07 = (C1046Xo) context;
        } else {
            this.A07 = C5G.A02(context);
        }
        this.A07.A0G(this);
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            A0E(this.A07, mediaView);
        } else if (initializationType == 1) {
            A0D(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
        } else if (initializationType == 2) {
            A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
        } else if (initializationType == 3) {
            A0B(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
        } else {
            throw new IllegalArgumentException(A03(155, 37, 116));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        int width = this.A03.getWidth();
        int height = this.A03.getHeight();
        if (width > 0 && height > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = width;
            MediaView mediaView = this.A03;
            if (A0F[1].charAt(24) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A07(new C1202bU(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A05;
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A03.removeView(mediaViewVideoRenderer2);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C5L) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A08());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((C1201bT) this.A03.getMediaViewApi()).A08(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(ML.A00());
            return;
        }
        throw new IllegalStateException(A03(215, 43, 114));
    }
}
