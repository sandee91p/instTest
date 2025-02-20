package com.appd.instll;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class ufmbtltquossowqoxfqbwpamerkbaz2 extends Activity {
    private static final String EXTRA_CONFIRMATION_INTENT = "confirmation_intent";
    public static final String EXTRA_SESSION_ID = "session_id";
    private static final int REQUEST_CODE_CONFIRM_INSTALLATION = 322;
    private Intent mConfirmationIntent;
    private boolean mFinishedProperly = false;
    private int mSessionId;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.mSessionId = intent.getIntExtra("session_id", -1);
        Intent intent2 = (Intent) intent.getParcelableExtra(EXTRA_CONFIRMATION_INTENT);
        this.mConfirmationIntent = intent2;
        if (bundle == null) {
            try {
                startActivityForResult(intent2, REQUEST_CODE_CONFIRM_INSTALLATION);
            } catch (Exception e) {
                finish();
            }
        }
    }
}
