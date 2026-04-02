package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AuthenticationTokenClaims.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 M2\u00020\u0001:\u0001MB\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0085\u0002\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001eB\u000f\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\b\u0010;\u001a\u00020\u0019H\u0016J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020\u0019H\u0016J\u0018\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010D\u001a\u00020\u0003H\u0007J\r\u0010E\u001a\u00020CH\u0001¢\u0006\u0002\bFJ\b\u0010G\u001a\u00020\u0003H\u0016J\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020\u0019H\u0016J\u0016\u0010L\u001a\u0004\u0018\u00010\u0003*\u00020C2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b:\u00102¨\u0006N"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "encodedClaims", "", "expectedNonce", "(Ljava/lang/String;Ljava/lang/String;)V", "jti", "iss", "aud", ServerProtocol.DIALOG_PARAM_NONCE, "exp", "", "iat", "sub", "name", "givenName", "middleName", "familyName", "email", "picture", "userFriends", "", "userBirthday", "userAgeRange", "", "", "userHometown", "userLocation", "userGender", "userLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAud", "()Ljava/lang/String;", "getEmail", "getExp", "()J", "getFamilyName", "getGivenName", "getIat", "getIss", "getJti", "getMiddleName", "getName", "getNonce", "getPicture", "getSub", "getUserAgeRange", "()Ljava/util/Map;", "getUserBirthday", "", "getUserFriends", "()Ljava/util/Set;", "getUserGender", "getUserHometown", "getUserLink", "getUserLocation", "describeContents", "equals", "", "other", "", "hashCode", "isValidClaims", "claimsJson", "Lorg/json/JSONObject;", "toEnCodedString", "toJSONObject", "toJSONObject$facebook_core_release", "toString", "writeToParcel", "", "dest", "flags", "getNullableString", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class AuthenticationTokenClaims implements Parcelable {
    public static final long MAX_TIME_SINCE_TOKEN_ISSUED = 600000;
    private final String aud;
    private final String email;
    private final long exp;
    private final String familyName;
    private final String givenName;
    private final long iat;
    private final String iss;
    private final String jti;
    private final String middleName;
    private final String name;
    private final String nonce;
    private final String picture;
    private final String sub;
    private final Map<String, Integer> userAgeRange;
    private final String userBirthday;
    private final Set<String> userFriends;
    private final String userGender;
    private final Map<String, String> userHometown;
    private final String userLink;
    private final Map<String, String> userLocation;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new Parcelable.Creator<AuthenticationTokenClaims>() { // from class: com.facebook.AuthenticationTokenClaims$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationTokenClaims createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationTokenClaims(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationTokenClaims[] newArray(int i) {
            return new AuthenticationTokenClaims[i];
        }
    };

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        this(str, str2, str3, str4, j, j2, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048448, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        this(str, str2, str3, str4, j, j2, str5, str6, null, null, null, null, null, null, null, null, null, null, null, null, 1048320, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, null, null, null, null, null, null, null, null, null, null, null, 1048064, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, null, null, null, null, null, null, null, null, null, null, 1047552, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, null, null, null, null, null, null, null, null, null, 1046528, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, null, null, null, null, null, null, null, null, 1044480, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, null, null, null, null, null, null, null, 1040384, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, null, null, null, null, null, null, 1032192, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, null, null, null, null, null, 1015808, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, null, null, null, null, 983040, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, null, null, null, 917504, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, map3, null, null, 786432, null);
    }

    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3, String str13) {
        this(str, str2, str3, str4, j, j2, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, map3, str13, null, 524288, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getJti() {
        return this.jti;
    }

    public final String getIss() {
        return this.iss;
    }

    public final String getAud() {
        return this.aud;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final long getExp() {
        return this.exp;
    }

    public final long getIat() {
        return this.iat;
    }

    public final String getSub() {
        return this.sub;
    }

    public final String getName() {
        return this.name;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final Set<String> getUserFriends() {
        return this.userFriends;
    }

    public final String getUserBirthday() {
        return this.userBirthday;
    }

    public final Map<String, Integer> getUserAgeRange() {
        return this.userAgeRange;
    }

    public final Map<String, String> getUserHometown() {
        return this.userHometown;
    }

    public final Map<String, String> getUserLocation() {
        return this.userLocation;
    }

    public final String getUserGender() {
        return this.userGender;
    }

    public final String getUserLink() {
        return this.userLink;
    }

    public AuthenticationTokenClaims(String encodedClaims, String expectedNonce) {
        Intrinsics.checkNotNullParameter(encodedClaims, "encodedClaims");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        Validate.notEmpty(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
        if (!isValidClaims(jSONObject, expectedNonce)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"jti\")");
        this.jti = string;
        String string2 = jSONObject.getString("iss");
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"iss\")");
        this.iss = string2;
        String string3 = jSONObject.getString("aud");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(\"aud\")");
        this.aud = string3;
        String string4 = jSONObject.getString(ServerProtocol.DIALOG_PARAM_NONCE);
        Intrinsics.checkNotNullExpressionValue(string4, "jsonObj.getString(\"nonce\")");
        this.nonce = string4;
        this.exp = jSONObject.getLong("exp");
        this.iat = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        Intrinsics.checkNotNullExpressionValue(string5, "jsonObj.getString(\"sub\")");
        this.sub = string5;
        this.name = getNullableString(jSONObject, "name");
        this.givenName = getNullableString(jSONObject, "givenName");
        this.middleName = getNullableString(jSONObject, "middleName");
        this.familyName = getNullableString(jSONObject, "familyName");
        this.email = getNullableString(jSONObject, "email");
        this.picture = getNullableString(jSONObject, "picture");
        JSONArray optJSONArray = jSONObject.optJSONArray("userFriends");
        this.userFriends = optJSONArray == null ? null : Collections.unmodifiableSet(Utility.jsonArrayToSet(optJSONArray));
        this.userBirthday = getNullableString(jSONObject, "userBirthday");
        JSONObject optJSONObject = jSONObject.optJSONObject("userAgeRange");
        this.userAgeRange = optJSONObject == null ? null : Collections.unmodifiableMap(Utility.convertJSONObjectToHashMap(optJSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("userHometown");
        this.userHometown = optJSONObject2 == null ? null : Collections.unmodifiableMap(Utility.convertJSONObjectToStringMap(optJSONObject2));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("userLocation");
        this.userLocation = optJSONObject3 != null ? Collections.unmodifiableMap(Utility.convertJSONObjectToStringMap(optJSONObject3)) : null;
        this.userGender = getNullableString(jSONObject, "userGender");
        this.userLink = getNullableString(jSONObject, "userLink");
    }

    public /* synthetic */ AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection collection, String str12, Map map, Map map2, Map map3, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j, j2, str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : collection, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : map, (65536 & i) != 0 ? null : map2, (131072 & i) != 0 ? null : map3, (262144 & i) != 0 ? null : str13, (i & 524288) != 0 ? null : str14);
    }

    public AuthenticationTokenClaims(String jti, String iss, String aud, String nonce, long j, long j2, String sub, String str, String str2, String str3, String str4, String str5, String str6, Collection<String> collection, String str7, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3, String str8, String str9) {
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
        Validate.notEmpty(jti, "jti");
        Validate.notEmpty(iss, "iss");
        Validate.notEmpty(aud, "aud");
        Validate.notEmpty(nonce, ServerProtocol.DIALOG_PARAM_NONCE);
        Validate.notEmpty(sub, "sub");
        this.jti = jti;
        this.iss = iss;
        this.aud = aud;
        this.nonce = nonce;
        this.exp = j;
        this.iat = j2;
        this.sub = sub;
        this.name = str;
        this.givenName = str2;
        this.middleName = str3;
        this.familyName = str4;
        this.email = str5;
        this.picture = str6;
        this.userFriends = collection != null ? Collections.unmodifiableSet(new HashSet(collection)) : null;
        this.userBirthday = str7;
        this.userAgeRange = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
        this.userHometown = map2 != null ? Collections.unmodifiableMap(new HashMap(map2)) : null;
        this.userLocation = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
        this.userGender = str8;
        this.userLink = str9;
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        Validate.notNullOrEmpty(readString, "jti");
        if (readString != null) {
            this.jti = readString;
            String readString2 = parcel.readString();
            Validate.notNullOrEmpty(readString2, "iss");
            if (readString2 != null) {
                this.iss = readString2;
                String readString3 = parcel.readString();
                Validate.notNullOrEmpty(readString3, "aud");
                if (readString3 != null) {
                    this.aud = readString3;
                    String readString4 = parcel.readString();
                    Validate.notNullOrEmpty(readString4, ServerProtocol.DIALOG_PARAM_NONCE);
                    if (readString4 != null) {
                        this.nonce = readString4;
                        this.exp = parcel.readLong();
                        this.iat = parcel.readLong();
                        String readString5 = parcel.readString();
                        Validate.notNullOrEmpty(readString5, "sub");
                        if (readString5 != null) {
                            this.sub = readString5;
                            this.name = parcel.readString();
                            this.givenName = parcel.readString();
                            this.middleName = parcel.readString();
                            this.familyName = parcel.readString();
                            this.email = parcel.readString();
                            this.picture = parcel.readString();
                            ArrayList arrayList = new ArrayList();
                            parcel.readStringList(arrayList);
                            this.userFriends = Collections.unmodifiableSet(new HashSet(arrayList));
                            this.userBirthday = parcel.readString();
                            HashMap readHashMap = parcel.readHashMap(IntCompanionObject.INSTANCE.getClass().getClassLoader());
                            this.userAgeRange = Collections.unmodifiableMap(readHashMap instanceof HashMap ? readHashMap : null);
                            HashMap readHashMap2 = parcel.readHashMap(StringCompanionObject.INSTANCE.getClass().getClassLoader());
                            this.userHometown = Collections.unmodifiableMap(readHashMap2 instanceof HashMap ? readHashMap2 : null);
                            HashMap readHashMap3 = parcel.readHashMap(StringCompanionObject.INSTANCE.getClass().getClassLoader());
                            this.userLocation = Collections.unmodifiableMap(readHashMap3 instanceof HashMap ? readHashMap3 : null);
                            this.userGender = parcel.readString();
                            this.userLink = parcel.readString();
                            return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.jti);
        dest.writeString(this.iss);
        dest.writeString(this.aud);
        dest.writeString(this.nonce);
        dest.writeLong(this.exp);
        dest.writeLong(this.iat);
        dest.writeString(this.sub);
        dest.writeString(this.name);
        dest.writeString(this.givenName);
        dest.writeString(this.middleName);
        dest.writeString(this.familyName);
        dest.writeString(this.email);
        dest.writeString(this.picture);
        if (this.userFriends == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(this.userFriends));
        }
        dest.writeString(this.userBirthday);
        dest.writeMap(this.userAgeRange);
        dest.writeMap(this.userHometown);
        dest.writeMap(this.userLocation);
        dest.writeString(this.userGender);
        dest.writeString(this.userLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationTokenClaims) {
            AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
            return Intrinsics.areEqual(this.jti, authenticationTokenClaims.jti) && Intrinsics.areEqual(this.iss, authenticationTokenClaims.iss) && Intrinsics.areEqual(this.aud, authenticationTokenClaims.aud) && Intrinsics.areEqual(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && Intrinsics.areEqual(this.sub, authenticationTokenClaims.sub) && Intrinsics.areEqual(this.name, authenticationTokenClaims.name) && Intrinsics.areEqual(this.givenName, authenticationTokenClaims.givenName) && Intrinsics.areEqual(this.middleName, authenticationTokenClaims.middleName) && Intrinsics.areEqual(this.familyName, authenticationTokenClaims.familyName) && Intrinsics.areEqual(this.email, authenticationTokenClaims.email) && Intrinsics.areEqual(this.picture, authenticationTokenClaims.picture) && Intrinsics.areEqual(this.userFriends, authenticationTokenClaims.userFriends) && Intrinsics.areEqual(this.userBirthday, authenticationTokenClaims.userBirthday) && Intrinsics.areEqual(this.userAgeRange, authenticationTokenClaims.userAgeRange) && Intrinsics.areEqual(this.userHometown, authenticationTokenClaims.userHometown) && Intrinsics.areEqual(this.userLocation, authenticationTokenClaims.userLocation) && Intrinsics.areEqual(this.userGender, authenticationTokenClaims.userGender) && Intrinsics.areEqual(this.userLink, authenticationTokenClaims.userLink);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.valueOf(this.exp).hashCode()) * 31) + Long.valueOf(this.iat).hashCode()) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.givenName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.middleName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.familyName;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.picture;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set<String> set = this.userFriends;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.userBirthday;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int hashCode10 = (hashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.userHometown;
        int hashCode11 = (hashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.userLocation;
        int hashCode12 = (hashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.userGender;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.userLink;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    private final boolean isValidClaims(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String jti = jSONObject.optString("jti");
        Intrinsics.checkNotNullExpressionValue(jti, "jti");
        if (jti.length() == 0) {
            return false;
        }
        try {
            String iss = jSONObject.optString("iss");
            Intrinsics.checkNotNullExpressionValue(iss, "iss");
            if (!(iss.length() == 0)) {
                if (!(!Intrinsics.areEqual(new URL(iss).getHost(), FacebookSdk.FACEBOOK_COM))) {
                    String aud = jSONObject.optString("aud");
                    Intrinsics.checkNotNullExpressionValue(aud, "aud");
                    if (!(aud.length() == 0) && !(!Intrinsics.areEqual(aud, FacebookSdk.getApplicationId()))) {
                        long j = 1000;
                        if (new Date().after(new Date(jSONObject.optLong("exp") * j))) {
                            return false;
                        }
                        if (new Date().after(new Date((jSONObject.optLong("iat") * j) + MAX_TIME_SINCE_TOKEN_ISSUED))) {
                            return false;
                        }
                        String sub = jSONObject.optString("sub");
                        Intrinsics.checkNotNullExpressionValue(sub, "sub");
                        if (sub.length() == 0) {
                            return false;
                        }
                        String nonce = jSONObject.optString(ServerProtocol.DIALOG_PARAM_NONCE);
                        Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
                        if (!(nonce.length() == 0) && !(!Intrinsics.areEqual(nonce, str))) {
                            return true;
                        }
                    }
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public final String toEnCodedString() {
        String authenticationTokenClaims = toString();
        Charset charset = Charsets.UTF_8;
        if (authenticationTokenClaims != null) {
            byte[] bytes = authenticationTokenClaims.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "Base64.encodeToString(cl…eArray(), Base64.DEFAULT)");
            return encodeToString;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.jti);
        jSONObject.put("iss", this.iss);
        jSONObject.put("aud", this.aud);
        jSONObject.put(ServerProtocol.DIALOG_PARAM_NONCE, this.nonce);
        jSONObject.put("exp", this.exp);
        jSONObject.put("iat", this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put("givenName", str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put("middleName", str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put("familyName", str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set<String> set = this.userFriends;
        if (set != null && (!set.isEmpty())) {
            jSONObject.put("userFriends", new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put("userBirthday", str8);
        }
        Map<String, Integer> map = this.userAgeRange;
        if (map != null && (!map.isEmpty())) {
            jSONObject.put("userAgeRange", new JSONObject(this.userAgeRange));
        }
        Map<String, String> map2 = this.userHometown;
        if (map2 != null && (!map2.isEmpty())) {
            jSONObject.put("userHometown", new JSONObject(this.userHometown));
        }
        Map<String, String> map3 = this.userLocation;
        if (map3 != null && (!map3.isEmpty())) {
            jSONObject.put("userLocation", new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put("userGender", str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put("userLink", str10);
        }
        return jSONObject;
    }

    private final String getNullableString(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* compiled from: AuthenticationTokenClaims.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "MAX_TIME_SINCE_TOKEN_ISSUED", "", "createFromJSONObject", "jsonObject", "Lorg/json/JSONObject;", "createFromJSONObject$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthenticationTokenClaims createFromJSONObject$facebook_core_release(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String jti = jsonObject.getString("jti");
            String iss = jsonObject.getString("iss");
            String aud = jsonObject.getString("aud");
            String nonce = jsonObject.getString(ServerProtocol.DIALOG_PARAM_NONCE);
            long j = jsonObject.getLong("exp");
            long j2 = jsonObject.getLong("iat");
            String sub = jsonObject.getString("sub");
            String optString = jsonObject.optString("name");
            String optString2 = jsonObject.optString("givenName");
            String optString3 = jsonObject.optString("middleName");
            String optString4 = jsonObject.optString("familyName");
            String optString5 = jsonObject.optString("email");
            String optString6 = jsonObject.optString("picture");
            JSONArray optJSONArray = jsonObject.optJSONArray("userFriends");
            String optString7 = jsonObject.optString("userBirthday");
            JSONObject optJSONObject = jsonObject.optJSONObject("userAgeRange");
            JSONObject optJSONObject2 = jsonObject.optJSONObject("userHometown");
            JSONObject optJSONObject3 = jsonObject.optJSONObject("userLocation");
            String optString8 = jsonObject.optString("userGender");
            String optString9 = jsonObject.optString("userLink");
            Intrinsics.checkNotNullExpressionValue(jti, "jti");
            Intrinsics.checkNotNullExpressionValue(iss, "iss");
            Intrinsics.checkNotNullExpressionValue(aud, "aud");
            Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
            Intrinsics.checkNotNullExpressionValue(sub, "sub");
            String str = optString;
            boolean z = false;
            if (str == null || str.length() == 0) {
                optString = null;
            }
            String str2 = optString2;
            String str3 = str2 == null || str2.length() == 0 ? null : optString2;
            String str4 = optString3;
            String str5 = str4 == null || str4.length() == 0 ? null : optString3;
            String str6 = optString4;
            String str7 = str6 == null || str6.length() == 0 ? null : optString4;
            String str8 = optString5;
            if (str8 == null || str8.length() == 0) {
                optString5 = null;
            }
            String str9 = optString6;
            if (str9 == null || str9.length() == 0) {
                optString6 = null;
            }
            List<String> jsonArrayToStringList = optJSONArray == null ? null : Utility.jsonArrayToStringList(optJSONArray);
            String str10 = optString7;
            if (str10 == null || str10.length() == 0) {
                optString7 = null;
            }
            Map<String, Object> convertJSONObjectToHashMap = optJSONObject == null ? null : Utility.convertJSONObjectToHashMap(optJSONObject);
            Map<String, String> convertJSONObjectToStringMap = optJSONObject2 == null ? null : Utility.convertJSONObjectToStringMap(optJSONObject2);
            Map<String, String> convertJSONObjectToStringMap2 = optJSONObject3 == null ? null : Utility.convertJSONObjectToStringMap(optJSONObject3);
            String str11 = optString8;
            if (str11 == null || str11.length() == 0) {
                optString8 = null;
            }
            String str12 = optString9;
            if (str12 == null || str12.length() == 0) {
                z = true;
            }
            if (z) {
                optString9 = null;
            }
            return new AuthenticationTokenClaims(jti, iss, aud, nonce, j, j2, sub, optString, str3, str5, str7, optString5, optString6, jsonArrayToStringList, optString7, convertJSONObjectToHashMap, convertJSONObjectToStringMap, convertJSONObjectToStringMap2, optString8, optString9);
        }
    }
}
