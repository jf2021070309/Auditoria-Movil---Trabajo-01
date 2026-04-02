package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.x.b;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @VisibleForTesting
    public static final Clock zaa = DefaultClock.getInstance();
    @SafeParcelable.VersionField(id = 1)
    final int zab;
    @SafeParcelable.Field(id = 10)
    final List zac;
    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String zad;
    @SafeParcelable.Field(getter = "getIdToken", id = 3)
    private final String zae;
    @SafeParcelable.Field(getter = "getEmail", id = 4)
    private final String zaf;
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private final String zag;
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    private final Uri zah;
    @SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    private String zai;
    @SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    private final long zaj;
    @SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    private final String zak;
    @SafeParcelable.Field(getter = "getGivenName", id = 11)
    private final String zal;
    @SafeParcelable.Field(getter = "getFamilyName", id = 12)
    private final String zam;
    private final Set zan = new HashSet();

    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) Uri uri, @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List list, @SafeParcelable.Param(id = 11) String str7, @SafeParcelable.Param(id = 12) String str8) {
        this.zab = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        return zae(new Account("<<default account>>", AccountType.GOOGLE), new HashSet());
    }

    @KeepForSdk
    public static GoogleSignInAccount fromAccount(Account account) {
        return zae(account, new b());
    }

    public static GoogleSignInAccount zaa(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    public static GoogleSignInAccount zab(String str) throws com.amazon.aps.iva.if0.b {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        c cVar = new c(str);
        String optString = cVar.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(cVar.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        a jSONArray = cVar.getJSONArray("grantedScopes");
        int e = jSONArray.e();
        for (int i = 0; i < e; i++) {
            hashSet.add(new Scope(jSONArray.d(i)));
        }
        String optString2 = cVar.optString("id");
        if (cVar.has("tokenId")) {
            str2 = cVar.optString("tokenId");
        } else {
            str2 = null;
        }
        if (cVar.has(Scopes.EMAIL)) {
            str3 = cVar.optString(Scopes.EMAIL);
        } else {
            str3 = null;
        }
        if (cVar.has("displayName")) {
            str4 = cVar.optString("displayName");
        } else {
            str4 = null;
        }
        if (cVar.has("givenName")) {
            str5 = cVar.optString("givenName");
        } else {
            str5 = null;
        }
        if (cVar.has("familyName")) {
            str6 = cVar.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount zaa2 = zaa(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), cVar.getString("obfuscatedIdentifier"), hashSet);
        if (cVar.has("serverAuthCode")) {
            str7 = cVar.optString("serverAuthCode");
        }
        zaa2.zai = str7;
        return zaa2;
    }

    private static GoogleSignInAccount zae(Account account, Set set) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.zak.equals(this.zak) || !googleSignInAccount.getRequestedScopes().equals(getRequestedScopes())) {
            return false;
        }
        return true;
    }

    public Account getAccount() {
        String str = this.zaf;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    public String getDisplayName() {
        return this.zag;
    }

    public String getEmail() {
        return this.zaf;
    }

    public String getFamilyName() {
        return this.zam;
    }

    public String getGivenName() {
        return this.zal;
    }

    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.zac);
    }

    public String getId() {
        return this.zad;
    }

    public String getIdToken() {
        return this.zae;
    }

    public Uri getPhotoUrl() {
        return this.zah;
    }

    @KeepForSdk
    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.zac);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    public String getServerAuthCode() {
        return this.zai;
    }

    public int hashCode() {
        return ((this.zak.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
    }

    @KeepForSdk
    public boolean isExpired() {
        if (zaa.currentTimeMillis() / 1000 >= this.zaj - 300) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    @KeepForSdk
    public GoogleSignInAccount requestExtraScopes(Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.zan, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zab);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zaj);
        SafeParcelWriter.writeString(parcel, 9, this.zak, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zac, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zac() {
        return this.zak;
    }

    public final String zad() {
        c cVar = new c();
        try {
            if (getId() != null) {
                cVar.put("id", getId());
            }
            if (getIdToken() != null) {
                cVar.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                cVar.put(Scopes.EMAIL, getEmail());
            }
            if (getDisplayName() != null) {
                cVar.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                cVar.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                cVar.put("familyName", getFamilyName());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                cVar.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                cVar.put("serverAuthCode", getServerAuthCode());
            }
            cVar.put("expirationTime", this.zaj);
            cVar.put("obfuscatedIdentifier", this.zak);
            a aVar = new a();
            List list = this.zac;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                aVar.put(scope.getScopeUri());
            }
            cVar.put("grantedScopes", aVar);
            cVar.remove("serverAuthCode");
            return cVar.toString();
        } catch (com.amazon.aps.iva.if0.b e) {
            throw new RuntimeException(e);
        }
    }
}
