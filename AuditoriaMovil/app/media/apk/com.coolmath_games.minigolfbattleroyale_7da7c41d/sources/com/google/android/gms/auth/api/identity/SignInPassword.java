package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* loaded from: classes.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zzo();
    private final String zzbf;
    private final String zzbk;

    public SignInPassword(String str, String str2) {
        this.zzbf = Preconditions.checkNotEmpty(((String) Preconditions.checkNotNull(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.zzbk = Preconditions.checkNotEmpty(str2);
    }

    public String getId() {
        return this.zzbf;
    }

    public String getPassword() {
        return this.zzbk;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzbf, this.zzbk);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SignInPassword) {
            SignInPassword signInPassword = (SignInPassword) obj;
            return Objects.equal(this.zzbf, signInPassword.zzbf) && Objects.equal(this.zzbk, signInPassword.zzbk);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getPassword(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
