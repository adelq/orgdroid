package com.adelqalieh.orgdroid;


import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;

/**
 * Unit Testing the Main Activity
 * Created by Adel on 12/6/14.
 */
public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {
    private MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ContextThemeWrapper context = new ContextThemeWrapper(getInstrumentation().getTargetContext(), R.style.AppTheme);
        setActivityContext(context);
        Intent intent = new Intent(getInstrumentation().getTargetContext(),
                MainActivity.class);
        startActivity(intent, null, null);
        activity = getActivity();
    }

    public void testMainLayout() {
        assertNotNull(activity.findViewById(R.id.container));
    }

    public void testMainFrameLayout() {
        assertTrue(activity.findViewById(R.id.container) instanceof FrameLayout);
    }
}
