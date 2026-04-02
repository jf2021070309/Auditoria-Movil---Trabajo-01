package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Immutable
/* loaded from: classes4.dex */
public final class RawJwt {
    private static final long MAX_TIMESTAMP_VALUE = 253402300799L;
    private final JsonObject payload;
    private final Optional<String> typeHeader;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final JsonObject payload;
        private Optional<String> typeHeader;
        private boolean withoutExpiration;

        private void setTimestampClaim(String str, Instant instant) {
            long epochSecond = instant.getEpochSecond();
            if (epochSecond <= RawJwt.MAX_TIMESTAMP_VALUE && epochSecond >= 0) {
                this.payload.add(str, new JsonPrimitive(Long.valueOf(epochSecond)));
                return;
            }
            throw new IllegalArgumentException(e.e("timestamp of claim ", str, " is out of range"));
        }

        @CanIgnoreReturnValue
        public Builder addAudience(String str) {
            JsonArray jsonArray;
            if (JsonUtil.isValidString(str)) {
                if (this.payload.has("aud")) {
                    JsonElement jsonElement = this.payload.get("aud");
                    if (jsonElement.isJsonArray()) {
                        jsonArray = jsonElement.getAsJsonArray();
                    } else {
                        throw new IllegalArgumentException("addAudience can't be used together with setAudience");
                    }
                } else {
                    jsonArray = new JsonArray();
                }
                jsonArray.add(str);
                this.payload.add("aud", jsonArray);
                return this;
            }
            throw new IllegalArgumentException("invalid string");
        }

        @CanIgnoreReturnValue
        public Builder addBooleanClaim(String str, boolean z) {
            JwtNames.validate(str);
            this.payload.add(str, new JsonPrimitive(Boolean.valueOf(z)));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addJsonArrayClaim(String str, String str2) throws JwtInvalidException {
            JwtNames.validate(str);
            this.payload.add(str, JsonUtil.parseJsonArray(str2));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addJsonObjectClaim(String str, String str2) throws JwtInvalidException {
            JwtNames.validate(str);
            this.payload.add(str, JsonUtil.parseJson(str2));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addNullClaim(String str) {
            JwtNames.validate(str);
            this.payload.add(str, JsonNull.INSTANCE);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addNumberClaim(String str, double d) {
            JwtNames.validate(str);
            this.payload.add(str, new JsonPrimitive(Double.valueOf(d)));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addStringClaim(String str, String str2) {
            if (JsonUtil.isValidString(str2)) {
                JwtNames.validate(str);
                this.payload.add(str, new JsonPrimitive(str2));
                return this;
            }
            throw new IllegalArgumentException();
        }

        public RawJwt build() {
            return new RawJwt(this);
        }

        @CanIgnoreReturnValue
        public Builder setAudience(String str) {
            if (this.payload.has("aud") && this.payload.get("aud").isJsonArray()) {
                throw new IllegalArgumentException("setAudience can't be used together with setAudiences or addAudience");
            }
            if (JsonUtil.isValidString(str)) {
                this.payload.add("aud", new JsonPrimitive(str));
                return this;
            }
            throw new IllegalArgumentException("invalid string");
        }

        @CanIgnoreReturnValue
        public Builder setAudiences(List<String> list) {
            if (this.payload.has("aud") && !this.payload.get("aud").isJsonArray()) {
                throw new IllegalArgumentException("setAudiences can't be used together with setAudience");
            }
            if (!list.isEmpty()) {
                JsonArray jsonArray = new JsonArray();
                for (String str : list) {
                    if (JsonUtil.isValidString(str)) {
                        jsonArray.add(str);
                    } else {
                        throw new IllegalArgumentException("invalid string");
                    }
                }
                this.payload.add("aud", jsonArray);
                return this;
            }
            throw new IllegalArgumentException("audiences must not be empty");
        }

        @CanIgnoreReturnValue
        public Builder setExpiration(Instant instant) {
            setTimestampClaim("exp", instant);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIssuedAt(Instant instant) {
            setTimestampClaim("iat", instant);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIssuer(String str) {
            if (JsonUtil.isValidString(str)) {
                this.payload.add("iss", new JsonPrimitive(str));
                return this;
            }
            throw new IllegalArgumentException();
        }

        @CanIgnoreReturnValue
        public Builder setJwtId(String str) {
            if (JsonUtil.isValidString(str)) {
                this.payload.add("jti", new JsonPrimitive(str));
                return this;
            }
            throw new IllegalArgumentException();
        }

        @CanIgnoreReturnValue
        public Builder setNotBefore(Instant instant) {
            setTimestampClaim("nbf", instant);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubject(String str) {
            if (JsonUtil.isValidString(str)) {
                this.payload.add("sub", new JsonPrimitive(str));
                return this;
            }
            throw new IllegalArgumentException();
        }

        @CanIgnoreReturnValue
        public Builder setTypeHeader(String str) {
            this.typeHeader = Optional.of(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withoutExpiration() {
            this.withoutExpiration = true;
            return this;
        }

        private Builder() {
            this.typeHeader = Optional.empty();
            this.withoutExpiration = false;
            this.payload = new JsonObject();
        }
    }

    public static RawJwt fromJsonPayload(Optional<String> optional, String str) throws JwtInvalidException {
        return new RawJwt(optional, str);
    }

    private Instant getInstant(String str) throws JwtInvalidException {
        if (this.payload.has(str)) {
            if (this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isNumber()) {
                try {
                    return Instant.ofEpochMilli((long) (this.payload.get(str).getAsJsonPrimitive().getAsDouble() * 1000.0d));
                } catch (NumberFormatException e) {
                    throw new JwtInvalidException("claim " + str + " is not a timestamp: " + e);
                }
            }
            throw new JwtInvalidException(e.e("claim ", str, " is not a timestamp"));
        }
        throw new JwtInvalidException(e.e("claim ", str, " does not exist"));
    }

    private String getStringClaimInternal(String str) throws JwtInvalidException {
        if (this.payload.has(str)) {
            if (this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isString()) {
                return this.payload.get(str).getAsString();
            }
            throw new JwtInvalidException(e.e("claim ", str, " is not a string"));
        }
        throw new JwtInvalidException(e.e("claim ", str, " does not exist"));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private void validateAudienceClaim() throws JwtInvalidException {
        if (!this.payload.has("aud")) {
            return;
        }
        if ((this.payload.get("aud").isJsonPrimitive() && this.payload.get("aud").getAsJsonPrimitive().isString()) || getAudiences().size() >= 1) {
            return;
        }
        throw new JwtInvalidException("invalid JWT payload: claim aud is present but empty.");
    }

    private void validateStringClaim(String str) throws JwtInvalidException {
        if (!this.payload.has(str)) {
            return;
        }
        if (this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isString()) {
            return;
        }
        throw new JwtInvalidException(e.e("invalid JWT payload: claim ", str, " is not a string."));
    }

    private void validateTimestampClaim(String str) throws JwtInvalidException {
        if (!this.payload.has(str)) {
            return;
        }
        if (this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isNumber()) {
            double asDouble = this.payload.get(str).getAsJsonPrimitive().getAsDouble();
            if (asDouble <= 2.53402300799E11d && asDouble >= 0.0d) {
                return;
            }
            throw new JwtInvalidException(e.e("invalid JWT payload: claim ", str, " has an invalid timestamp"));
        }
        throw new JwtInvalidException(e.e("invalid JWT payload: claim ", str, " is not a number."));
    }

    public Set<String> customClaimNames() {
        HashSet hashSet = new HashSet();
        for (String str : this.payload.keySet()) {
            if (!JwtNames.isRegisteredName(str)) {
                hashSet.add(str);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public List<String> getAudiences() throws JwtInvalidException {
        if (hasAudiences()) {
            JsonElement jsonElement = this.payload.get("aud");
            if (jsonElement.isJsonPrimitive()) {
                if (jsonElement.getAsJsonPrimitive().isString()) {
                    return Collections.unmodifiableList(Arrays.asList(jsonElement.getAsString()));
                }
                throw new JwtInvalidException(String.format("invalid audience: got %s; want a string", jsonElement));
            } else if (jsonElement.isJsonArray()) {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                ArrayList arrayList = new ArrayList(asJsonArray.size());
                for (int i = 0; i < asJsonArray.size(); i++) {
                    if (asJsonArray.get(i).isJsonPrimitive() && asJsonArray.get(i).getAsJsonPrimitive().isString()) {
                        arrayList.add(asJsonArray.get(i).getAsString());
                    } else {
                        throw new JwtInvalidException(String.format("invalid audience: got %s; want a string", asJsonArray.get(i)));
                    }
                }
                return Collections.unmodifiableList(arrayList);
            } else {
                throw new JwtInvalidException("claim aud is not a string or a JSON array");
            }
        }
        throw new JwtInvalidException("claim aud does not exist");
    }

    public Boolean getBooleanClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        if (this.payload.has(str)) {
            if (this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isBoolean()) {
                return Boolean.valueOf(this.payload.get(str).getAsBoolean());
            }
            throw new JwtInvalidException(e.e("claim ", str, " is not a boolean"));
        }
        throw new JwtInvalidException(e.e("claim ", str, " does not exist"));
    }

    public Instant getExpiration() throws JwtInvalidException {
        return getInstant("exp");
    }

    public Instant getIssuedAt() throws JwtInvalidException {
        return getInstant("iat");
    }

    public String getIssuer() throws JwtInvalidException {
        return getStringClaimInternal("iss");
    }

    public String getJsonArrayClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        if (this.payload.has(str)) {
            if (this.payload.get(str).isJsonArray()) {
                return this.payload.get(str).getAsJsonArray().toString();
            }
            throw new JwtInvalidException(e.e("claim ", str, " is not a JSON array"));
        }
        throw new JwtInvalidException(e.e("claim ", str, " does not exist"));
    }

    public String getJsonObjectClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        if (this.payload.has(str)) {
            if (this.payload.get(str).isJsonObject()) {
                return this.payload.get(str).getAsJsonObject().toString();
            }
            throw new JwtInvalidException(e.e("claim ", str, " is not a JSON object"));
        }
        throw new JwtInvalidException(e.e("claim ", str, " does not exist"));
    }

    public String getJsonPayload() {
        return this.payload.toString();
    }

    public String getJwtId() throws JwtInvalidException {
        return getStringClaimInternal("jti");
    }

    public Instant getNotBefore() throws JwtInvalidException {
        return getInstant("nbf");
    }

    public Double getNumberClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        if (this.payload.has(str)) {
            if (this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isNumber()) {
                return Double.valueOf(this.payload.get(str).getAsDouble());
            }
            throw new JwtInvalidException(e.e("claim ", str, " is not a number"));
        }
        throw new JwtInvalidException(e.e("claim ", str, " does not exist"));
    }

    public String getStringClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        return getStringClaimInternal(str);
    }

    public String getSubject() throws JwtInvalidException {
        return getStringClaimInternal("sub");
    }

    public String getTypeHeader() throws JwtInvalidException {
        if (this.typeHeader.isPresent()) {
            return this.typeHeader.get();
        }
        throw new JwtInvalidException("type header is not set");
    }

    public boolean hasAudiences() {
        return this.payload.has("aud");
    }

    public boolean hasBooleanClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.has(str) && this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isBoolean()) {
            return true;
        }
        return false;
    }

    public boolean hasExpiration() {
        return this.payload.has("exp");
    }

    public boolean hasIssuedAt() {
        return this.payload.has("iat");
    }

    public boolean hasIssuer() {
        return this.payload.has("iss");
    }

    public boolean hasJsonArrayClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.has(str) && this.payload.get(str).isJsonArray()) {
            return true;
        }
        return false;
    }

    public boolean hasJsonObjectClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.has(str) && this.payload.get(str).isJsonObject()) {
            return true;
        }
        return false;
    }

    public boolean hasJwtId() {
        return this.payload.has("jti");
    }

    public boolean hasNotBefore() {
        return this.payload.has("nbf");
    }

    public boolean hasNumberClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.has(str) && this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isNumber()) {
            return true;
        }
        return false;
    }

    public boolean hasStringClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.has(str) && this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isString()) {
            return true;
        }
        return false;
    }

    public boolean hasSubject() {
        return this.payload.has("sub");
    }

    public boolean hasTypeHeader() {
        return this.typeHeader.isPresent();
    }

    public boolean isNullClaim(String str) {
        JwtNames.validate(str);
        try {
            return JsonNull.INSTANCE.equals(this.payload.get(str));
        } catch (JsonParseException unused) {
            return false;
        }
    }

    public String toString() {
        JsonObject jsonObject = new JsonObject();
        if (this.typeHeader.isPresent()) {
            jsonObject.add("typ", new JsonPrimitive(this.typeHeader.get()));
        }
        return jsonObject + "." + this.payload;
    }

    private RawJwt(Builder builder) {
        if (builder.payload.has("exp") || builder.withoutExpiration) {
            if (!builder.payload.has("exp") || !builder.withoutExpiration) {
                this.typeHeader = builder.typeHeader;
                this.payload = builder.payload.deepCopy();
                return;
            }
            throw new IllegalArgumentException("setExpiration() and withoutExpiration() must not be called together");
        }
        throw new IllegalArgumentException("neither setExpiration() nor withoutExpiration() was called");
    }

    private RawJwt(Optional<String> optional, String str) throws JwtInvalidException {
        this.typeHeader = optional;
        this.payload = JsonUtil.parseJson(str);
        validateStringClaim("iss");
        validateStringClaim("sub");
        validateStringClaim("jti");
        validateTimestampClaim("exp");
        validateTimestampClaim("nbf");
        validateTimestampClaim("iat");
        validateAudienceClaim();
    }
}
