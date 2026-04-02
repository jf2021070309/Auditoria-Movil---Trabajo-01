package com.android.billingclient.api;
/* compiled from: com.android.billingclient:billing@@3.0.3 */
/* loaded from: classes.dex */
public final class ConsumeParams {
    private String zza;

    /* compiled from: com.android.billingclient:billing@@3.0.3 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String zza;

        private Builder() {
        }

        /* synthetic */ Builder(zzan zzanVar) {
        }

        public ConsumeParams build() {
            if (this.zza != null) {
                ConsumeParams consumeParams = new ConsumeParams(null);
                consumeParams.zza = this.zza;
                return consumeParams;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public Builder setPurchaseToken(String str) {
            this.zza = str;
            return this;
        }
    }

    private ConsumeParams() {
    }

    /* synthetic */ ConsumeParams(zzan zzanVar) {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getPurchaseToken() {
        return this.zza;
    }
}
