package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.NavigableSet;
/* loaded from: assets/audience_network.dex */
public interface I3 {
    void A3O(String str, IF r2) throws I1;

    void A43(File file) throws I1;

    long A5u();

    long A5v(String str, long j2, long j3);

    @NonNull
    NavigableSet<I7> A5w(String str);

    long A67(String str);

    ID A68(String str);

    void ADn(I7 i7);

    void ADu(I7 i7) throws I1;

    void AEb(String str, long j2) throws I1;

    File AF2(String str, long j2, long j3) throws I1;

    I7 AF4(String str, long j2) throws InterruptedException, I1;

    @Nullable
    I7 AF5(String str, long j2) throws I1;
}
