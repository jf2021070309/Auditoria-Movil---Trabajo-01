package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Optional;
@Immutable
/* loaded from: classes4.dex */
interface JwtMacInternal {
    String computeMacAndEncodeWithKid(RawJwt rawJwt, Optional<String> optional) throws GeneralSecurityException;

    VerifiedJwt verifyMacAndDecodeWithKid(String str, JwtValidator jwtValidator, Optional<String> optional) throws GeneralSecurityException;
}
