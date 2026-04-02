package com.google.crypto.tink;

import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public interface KeyWrap {
    byte[] unwrap(byte[] bArr) throws GeneralSecurityException;

    byte[] wrap(byte[] bArr) throws GeneralSecurityException;
}
