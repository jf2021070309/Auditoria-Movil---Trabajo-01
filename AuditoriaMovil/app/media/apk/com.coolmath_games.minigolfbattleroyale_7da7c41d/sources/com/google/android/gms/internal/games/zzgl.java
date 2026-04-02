package com.google.android.gms.internal.games;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgl extends zzgk {
    private final zzgj zznm = new zzgj();

    @Override // com.google.android.gms.internal.games.zzgk
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.zznm.zza(th, true).add(th2);
    }
}
