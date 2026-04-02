package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
@Immutable
/* loaded from: classes4.dex */
public interface JwtMac {
    String computeMacAndEncode(RawJwt rawJwt) throws GeneralSecurityException;

    VerifiedJwt verifyMacAndDecode(String str, JwtValidator jwtValidator) throws GeneralSecurityException;
}
