package sample.frmi.cisample;

import android.content.Intent;
import android.widget.TextView;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.robolectric.Shadows.shadowOf;

/**
 * Created by frede on 11-08-2015.
 */
@Config(constants = BuildConfig.class, sdk = 21)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest extends TestCase {
    private MainActivity activity;

    @Before
    public void setup() throws Exception {
        activity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull("MainActivity is not instantiated", activity);
    }

    @Test
    public void ValidateTextViewContent() throws Exception {
        TextView tvHelloWorld = (TextView) activity.findViewById(R.id.tvHello);
        assertNotNull("TextView Could not be found", tvHelloWorld);
        assertTrue("TextView contains incorrect text",
                "Hello World!".equals(tvHelloWorld.getText().toString()));
    }
}