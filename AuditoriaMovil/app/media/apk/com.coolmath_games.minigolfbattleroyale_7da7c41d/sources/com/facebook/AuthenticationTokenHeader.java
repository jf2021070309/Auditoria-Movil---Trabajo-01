package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.Validate;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AuthenticationTokenHeader.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0007J\r\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0011H\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "encodedHeaderString", "", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "alg", "typ", "kid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlg", "()Ljava/lang/String;", "getKid", "getTyp", "describeContents", "", "isValidHeader", "", "headerString", "toEnCodedString", "toJSONObject", "Lorg/json/JSONObject;", "toJSONObject$facebook_core_release", "toString", "writeToParcel", "", "dest", "flags", "CREATOR", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private final String alg;
    private final String kid;
    private final String typ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAlg() {
        return this.alg;
    }

    public final String getTyp() {
        return this.typ;
    }

    public final String getKid() {
        return this.kid;
    }

    public AuthenticationTokenHeader(String encodedHeaderString) {
        Intrinsics.checkNotNullParameter(encodedHeaderString, "encodedHeaderString");
        if (!isValidHeader(encodedHeaderString)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
        String string = jSONObject.getString("alg");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"alg\")");
        this.alg = string;
        String string2 = jSONObject.getString("typ");
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"typ\")");
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(\"kid\")");
        this.kid = string3;
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Validate.notNullOrEmpty(readString, "alg");
        if (readString != null) {
            this.alg = readString;
            String readString2 = parcel.readString();
            Validate.notNullOrEmpty(readString2, "typ");
            if (readString2 != null) {
                this.typ = readString2;
                String readString3 = parcel.readString();
                Validate.notNullOrEmpty(readString3, "kid");
                if (readString3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                this.kid = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public AuthenticationTokenHeader(String alg, String typ, String kid) {
        Intrinsics.checkNotNullParameter(alg, "alg");
        Intrinsics.checkNotNullParameter(typ, "typ");
        Intrinsics.checkNotNullParameter(kid, "kid");
        this.alg = alg;
        this.typ = typ;
        this.kid = kid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.alg);
        dest.writeString(this.typ);
        dest.writeString(this.kid);
    }

    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    private final boolean isValidHeader(String str) {
        Validate.notEmpty(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
            String alg = jSONObject.optString("alg");
            Intrinsics.checkNotNullExpressionValue(alg, "alg");
            boolean z = (alg.length() > 0) && Intrinsics.areEqual(alg, "RS256");
            String optString = jSONObject.optString("kid");
            Intrinsics.checkNotNullExpressionValue(optString, "jsonObj.optString(\"kid\")");
            boolean z2 = optString.length() > 0;
            String optString2 = jSONObject.optString("typ");
            Intrinsics.checkNotNullExpressionValue(optString2, "jsonObj.optString(\"typ\")");
            return z && z2 && (optString2.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put("typ", this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    public final String toEnCodedString() {
        String authenticationTokenHeader = toString();
        Charset charset = Charsets.UTF_8;
        if (authenticationTokenHeader != null) {
            byte[] bytes = authenticationTokenHeader.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "Base64.encodeToString(cl…eArray(), Base64.DEFAULT)");
            return encodeToString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* compiled from: AuthenticationTokenHeader.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenHeader;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/AuthenticationTokenHeader;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class CREATOR implements Parcelable.Creator<AuthenticationTokenHeader> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationTokenHeader createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthenticationTokenHeader(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationTokenHeader[] newArray(int i) {
            return new AuthenticationTokenHeader[i];
        }
    }
}
