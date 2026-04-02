package e.c.a;
/* loaded from: classes.dex */
public enum e {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    private final float multiplier;

    e(float f2) {
        this.multiplier = f2;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
