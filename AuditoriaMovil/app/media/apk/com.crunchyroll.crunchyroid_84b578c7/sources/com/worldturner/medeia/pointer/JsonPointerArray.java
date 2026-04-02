package com.worldturner.medeia.pointer;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: JsonPointerBuilder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/worldturner/medeia/pointer/JsonPointerArray;", "Lcom/worldturner/medeia/pointer/JsonPointerEntry;", "", "propertyName", "", "nextProperty", "Lcom/amazon/aps/iva/kb0/q;", "incrementIfNecessary", "incrementOnNextRun", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "b", "toString", "", "stringLength", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "()I", "setIndex", "(I)V", "", "Z", "getIncrementOnNextRun", "()Z", "setIncrementOnNextRun", "(Z)V", "<init>", "()V", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class JsonPointerArray implements JsonPointerEntry {
    private boolean incrementOnNextRun;
    private int index = -1;

    public final boolean getIncrementOnNextRun() {
        return this.incrementOnNextRun;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    public void incrementIfNecessary() {
        if (this.incrementOnNextRun) {
            this.index++;
            this.incrementOnNextRun = false;
        }
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    public void incrementOnNextRun() {
        this.incrementOnNextRun = true;
    }

    public final void setIncrementOnNextRun(boolean z) {
        this.incrementOnNextRun = z;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    public int stringLength() {
        int i = this.index;
        if (i == 0) {
            return 2;
        }
        if (i != -1) {
            int i2 = 1;
            while (i > 0) {
                i2++;
                i /= 10;
            }
            return i2;
        }
        return 0;
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    public void toString(StringBuilder sb) {
        j.g(sb, "b");
        if (this.index != -1) {
            sb.append('/');
            sb.append(this.index);
        }
    }

    @Override // com.worldturner.medeia.pointer.JsonPointerEntry
    /* renamed from: nextProperty */
    public Void mo63nextProperty(String str) {
        j.g(str, "propertyName");
        throw new UnsupportedOperationException();
    }
}
