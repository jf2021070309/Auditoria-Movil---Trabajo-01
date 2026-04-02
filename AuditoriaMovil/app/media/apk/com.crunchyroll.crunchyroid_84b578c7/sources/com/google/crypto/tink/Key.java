package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.Immutable;
@Immutable
@Alpha
/* loaded from: classes4.dex */
public abstract class Key {
    public abstract boolean equalsKey(Key key);

    public abstract Integer getIdRequirementOrNull();

    public abstract Parameters getParameters();
}
