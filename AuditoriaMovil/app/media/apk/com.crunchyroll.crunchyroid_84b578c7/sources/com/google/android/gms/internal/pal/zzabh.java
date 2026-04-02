package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.zzabh;
import com.google.android.gms.internal.pal.zzabi;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzabh<MessageType extends zzabi<MessageType, BuilderType>, BuilderType extends zzabh<MessageType, BuilderType>> implements zzaee {
    @Override // 
    /* renamed from: zzah */
    public abstract zzabh clone();

    public abstract zzabh zzai(zzabi zzabiVar);

    @Override // com.google.android.gms.internal.pal.zzaee
    public final /* bridge */ /* synthetic */ zzaee zzaj(zzaef zzaefVar) {
        if (zzaq().getClass().isInstance(zzaefVar)) {
            return zzai((zzabi) zzaefVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
