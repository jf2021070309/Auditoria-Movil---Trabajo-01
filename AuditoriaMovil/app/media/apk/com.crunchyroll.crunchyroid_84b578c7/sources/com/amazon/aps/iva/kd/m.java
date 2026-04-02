package com.amazon.aps.iva.kd;

import com.crunchyroll.crunchyroid.R;
/* compiled from: ChangeEmailState.kt */
/* loaded from: classes.dex */
public enum m {
    EMAIL_VERIFIED(R.string.change_email_default_label, R.drawable.change_email_hime, R.string.change_email_default_title, R.string.change_email_default_sub_title, R.string.change_email_default_cta_text, R.string.change_email_request_confirmation),
    EMAIL_UNVERIFIED(R.string.change_email_unverified_label, R.drawable.change_email_hime, R.string.change_email_unverified_title, R.string.change_email_unverified_sub_title, R.string.change_email_unverified_cta_text, R.string.verify_email_request_confirmation);
    
    private final int confirmationTextResId;
    private final int ctaTextResId;
    private final int emailLabelResId;
    private final int imageResId;
    private final int subTitleResId;
    private final int titleResId;

    m(int i, int i2, int i3, int i4, int i5, int i6) {
        this.emailLabelResId = i;
        this.imageResId = i2;
        this.titleResId = i3;
        this.subTitleResId = i4;
        this.ctaTextResId = i5;
        this.confirmationTextResId = i6;
    }

    public final int getConfirmationTextResId() {
        return this.confirmationTextResId;
    }

    public final int getCtaTextResId() {
        return this.ctaTextResId;
    }

    public final int getEmailLabelResId() {
        return this.emailLabelResId;
    }

    public final int getImageResId() {
        return this.imageResId;
    }

    public final int getSubTitleResId() {
        return this.subTitleResId;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }
}
