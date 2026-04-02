package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
@Immutable
/* loaded from: classes4.dex */
public final class JwtValidator {
    private static final Duration MAX_CLOCK_SKEW = Duration.ofMinutes(10);
    private final boolean allowMissingExpiration;
    private final Clock clock;
    private final Duration clockSkew;
    private final boolean expectIssuedInThePast;
    private final Optional<String> expectedAudience;
    private final Optional<String> expectedIssuer;
    private final Optional<String> expectedTypeHeader;
    private final boolean ignoreAudiences;
    private final boolean ignoreIssuer;
    private final boolean ignoreTypeHeader;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean allowMissingExpiration;
        private Clock clock;
        private Duration clockSkew;
        private boolean expectIssuedInThePast;
        private Optional<String> expectedAudience;
        private Optional<String> expectedIssuer;
        private Optional<String> expectedTypeHeader;
        private boolean ignoreAudiences;
        private boolean ignoreIssuer;
        private boolean ignoreTypeHeader;

        @CanIgnoreReturnValue
        public Builder allowMissingExpiration() {
            this.allowMissingExpiration = true;
            return this;
        }

        public JwtValidator build() {
            if (this.ignoreTypeHeader && this.expectedTypeHeader.isPresent()) {
                throw new IllegalArgumentException("ignoreTypeHeader() and expectedTypeHeader() cannot be used together.");
            }
            if (this.ignoreIssuer && this.expectedIssuer.isPresent()) {
                throw new IllegalArgumentException("ignoreIssuer() and expectedIssuer() cannot be used together.");
            }
            if (this.ignoreAudiences && this.expectedAudience.isPresent()) {
                throw new IllegalArgumentException("ignoreAudiences() and expectedAudience() cannot be used together.");
            }
            return new JwtValidator(this);
        }

        @CanIgnoreReturnValue
        public Builder expectAudience(String str) {
            if (str != null) {
                this.expectedAudience = Optional.of(str);
                return this;
            }
            throw new NullPointerException("audience cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder expectIssuedInThePast() {
            this.expectIssuedInThePast = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder expectIssuer(String str) {
            if (str != null) {
                this.expectedIssuer = Optional.of(str);
                return this;
            }
            throw new NullPointerException("issuer cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder expectTypeHeader(String str) {
            if (str != null) {
                this.expectedTypeHeader = Optional.of(str);
                return this;
            }
            throw new NullPointerException("typ header cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder ignoreAudiences() {
            this.ignoreAudiences = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder ignoreIssuer() {
            this.ignoreIssuer = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder ignoreTypeHeader() {
            this.ignoreTypeHeader = true;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClock(Clock clock) {
            if (clock != null) {
                this.clock = clock;
                return this;
            }
            throw new NullPointerException("clock cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder setClockSkew(Duration duration) {
            if (duration.compareTo(JwtValidator.MAX_CLOCK_SKEW) <= 0) {
                this.clockSkew = duration;
                return this;
            }
            throw new IllegalArgumentException("Clock skew too large, max is 10 minutes");
        }

        private Builder() {
            this.clock = Clock.systemUTC();
            this.clockSkew = Duration.ZERO;
            this.expectedTypeHeader = Optional.empty();
            this.ignoreTypeHeader = false;
            this.expectedIssuer = Optional.empty();
            this.ignoreIssuer = false;
            this.expectedAudience = Optional.empty();
            this.ignoreAudiences = false;
            this.allowMissingExpiration = false;
            this.expectIssuedInThePast = false;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private void validateAudiences(RawJwt rawJwt) throws JwtInvalidException {
        if (this.expectedAudience.isPresent()) {
            if (!rawJwt.hasAudiences() || !rawJwt.getAudiences().contains(this.expectedAudience.get())) {
                throw new JwtInvalidException(String.format("invalid JWT; missing expected audience %s.", this.expectedAudience.get()));
            }
        } else if (rawJwt.hasAudiences() && !this.ignoreAudiences) {
            throw new JwtInvalidException("invalid JWT; token has audience set, but validator not.");
        }
    }

    private void validateIssuer(RawJwt rawJwt) throws JwtInvalidException {
        if (this.expectedIssuer.isPresent()) {
            if (rawJwt.hasIssuer()) {
                if (!rawJwt.getIssuer().equals(this.expectedIssuer.get())) {
                    throw new JwtInvalidException(String.format("invalid JWT; expected issuer %s, but got %s", this.expectedIssuer.get(), rawJwt.getIssuer()));
                }
                return;
            }
            throw new JwtInvalidException(String.format("invalid JWT; missing expected issuer %s.", this.expectedIssuer.get()));
        } else if (rawJwt.hasIssuer() && !this.ignoreIssuer) {
            throw new JwtInvalidException("invalid JWT; token has issuer set, but validator not.");
        }
    }

    private void validateTimestampClaims(RawJwt rawJwt) throws JwtInvalidException {
        Instant instant = this.clock.instant();
        if (!rawJwt.hasExpiration() && !this.allowMissingExpiration) {
            throw new JwtInvalidException("token does not have an expiration set");
        }
        if (rawJwt.hasExpiration() && !rawJwt.getExpiration().isAfter(instant.minus((TemporalAmount) this.clockSkew))) {
            throw new JwtInvalidException("token has expired since " + rawJwt.getExpiration());
        } else if (rawJwt.hasNotBefore() && rawJwt.getNotBefore().isAfter(instant.plus((TemporalAmount) this.clockSkew))) {
            throw new JwtInvalidException("token cannot be used before " + rawJwt.getNotBefore());
        } else if (this.expectIssuedInThePast) {
            if (rawJwt.hasIssuedAt()) {
                if (rawJwt.getIssuedAt().isAfter(instant.plus((TemporalAmount) this.clockSkew))) {
                    throw new JwtInvalidException("token has a invalid iat claim in the future: " + rawJwt.getIssuedAt());
                }
                return;
            }
            throw new JwtInvalidException("token does not have an iat claim");
        }
    }

    private void validateTypeHeader(RawJwt rawJwt) throws JwtInvalidException {
        if (this.expectedTypeHeader.isPresent()) {
            if (rawJwt.hasTypeHeader()) {
                if (!rawJwt.getTypeHeader().equals(this.expectedTypeHeader.get())) {
                    throw new JwtInvalidException(String.format("invalid JWT; expected type header %s, but got %s", this.expectedTypeHeader.get(), rawJwt.getTypeHeader()));
                }
                return;
            }
            throw new JwtInvalidException(String.format("invalid JWT; missing expected type header %s.", this.expectedTypeHeader.get()));
        } else if (rawJwt.hasTypeHeader() && !this.ignoreTypeHeader) {
            throw new JwtInvalidException("invalid JWT; token has type header set, but validator not.");
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.expectedTypeHeader.isPresent()) {
            arrayList.add("expectedTypeHeader=" + this.expectedTypeHeader.get());
        }
        if (this.ignoreTypeHeader) {
            arrayList.add("ignoreTypeHeader");
        }
        if (this.expectedIssuer.isPresent()) {
            arrayList.add("expectedIssuer=" + this.expectedIssuer.get());
        }
        if (this.ignoreIssuer) {
            arrayList.add("ignoreIssuer");
        }
        if (this.expectedAudience.isPresent()) {
            arrayList.add("expectedAudience=" + this.expectedAudience.get());
        }
        if (this.ignoreAudiences) {
            arrayList.add("ignoreAudiences");
        }
        if (this.allowMissingExpiration) {
            arrayList.add("allowMissingExpiration");
        }
        if (this.expectIssuedInThePast) {
            arrayList.add("expectIssuedInThePast");
        }
        if (!this.clockSkew.isZero()) {
            arrayList.add("clockSkew=" + this.clockSkew);
        }
        StringBuilder sb = new StringBuilder("JwtValidator{");
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            sb.append(str);
            sb.append((String) it.next());
            str = ",";
        }
        sb.append("}");
        return sb.toString();
    }

    public VerifiedJwt validate(RawJwt rawJwt) throws JwtInvalidException {
        validateTimestampClaims(rawJwt);
        validateTypeHeader(rawJwt);
        validateIssuer(rawJwt);
        validateAudiences(rawJwt);
        return new VerifiedJwt(rawJwt);
    }

    private JwtValidator(Builder builder) {
        this.expectedTypeHeader = builder.expectedTypeHeader;
        this.ignoreTypeHeader = builder.ignoreTypeHeader;
        this.expectedIssuer = builder.expectedIssuer;
        this.ignoreIssuer = builder.ignoreIssuer;
        this.expectedAudience = builder.expectedAudience;
        this.ignoreAudiences = builder.ignoreAudiences;
        this.allowMissingExpiration = builder.allowMissingExpiration;
        this.expectIssuedInThePast = builder.expectIssuedInThePast;
        this.clock = builder.clock;
        this.clockSkew = builder.clockSkew;
    }
}
