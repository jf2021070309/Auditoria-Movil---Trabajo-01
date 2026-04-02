package de.greenrobot.event;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class a implements Runnable {
    private final e a = new e();
    private final EventBus b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(EventBus eventBus) {
        this.b = eventBus;
    }

    public void a(h hVar, Object obj) {
        this.a.a(d.a(hVar, obj));
        EventBus.a.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d a = this.a.a();
        if (a == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.b.a(a);
    }
}
